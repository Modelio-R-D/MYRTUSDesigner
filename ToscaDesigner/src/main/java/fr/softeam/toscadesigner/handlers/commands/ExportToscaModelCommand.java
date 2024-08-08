package fr.softeam.toscadesigner.handlers.commands;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.modelio.api.module.IModule;
import org.modelio.api.module.command.DefaultModuleCommandHandler;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.api.module.context.log.ILogService;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MObject;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Options;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.helper.ConditionalHelpers;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;

public class ExportToscaModelCommand extends DefaultModuleCommandHandler {

	private static final String TEMPLATE_PATH = "/fr/softeam/templates/";
	private static final String[] TOSCA_FILE_EXTENSIONS = { "*.tosca" };
	private static final String[] CSAR_FILE_EXTENSIONS = { "*.csar" };
	private static final String MAIN_TEMPLATE = "_mainTemplate";
	private ILogService logger;
	private IModuleContext moduleContext;
	private Handlebars handlebars = setupHandlebars();

	@Override
	public void actionPerformed(List<MObject> selectedObjects, IModule module) {
		moduleContext = module.getModuleContext();
		logger = moduleContext.getLogService();
		if (selectedObjects == null || selectedObjects.isEmpty()) {
			MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error", "No objects selected");
			return;
		}

		MObject selectedObject = selectedObjects.get(0);

		if (isToscaNodeType(selectedObject) || isToscaTopologyTemplate(selectedObject)) {
			generateToscaFile(selectedObject);
		} else if (isToscaModel(selectedObject)) {
			generateCsarFile(selectedObject);
		} else {
			MessageDialog.openError(Display.getCurrent().getActiveShell(), "Error",
					"Selected object is neither a Node Type nor a TOSCA Model");
		}
	}

	private boolean isToscaTopologyTemplate(MObject object) {
		Stereotype nodeTypeStereotype = moduleContext.getModelingSession().getMetamodelExtensions()
				.getStereotype("TTopologyTemplate", object.getMClass());
		ModelElement element = (ModelElement) object;
		return (nodeTypeStereotype != null && element.isStereotyped(nodeTypeStereotype));
	}

	private boolean isToscaNodeType(MObject object) {
		Stereotype nodeTypeStereotype = moduleContext.getModelingSession().getMetamodelExtensions()
				.getStereotype("TNodeType", object.getMClass());
		ModelElement element = (ModelElement) object;
		return (nodeTypeStereotype != null && element.isStereotyped(nodeTypeStereotype));
	}

	private boolean isToscaModel(MObject object) {
		// Implement logic to determine if the object is a Node Type
		// This might involve checking for specific stereotypes or properties
		Stereotype toscaModelStereotype = moduleContext.getModelingSession().getMetamodelExtensions()
				.getStereotype("ToscaModel", object.getMClass());
		ModelElement element = (ModelElement) object;
		return (toscaModelStereotype != null && element.isStereotyped(toscaModelStereotype));
	}

	private void generateToscaFile(MObject nodeType) {
		try {
			String content = renderTemplate(handlebars, nodeType);
			saveToFile(content, TOSCA_FILE_EXTENSIONS, "TOSCA file");
		} catch (IOException e) {
			logger.error(e);
			MessageDialog.openError(Display.getCurrent().getActiveShell(), "TOSCA export error",
					e.getLocalizedMessage());
		}
	}

	private void generateCsarFile(MObject toscaModel) {
		try {
			String filePath = saveToFile(null, CSAR_FILE_EXTENSIONS, "CSAR file");

			if (filePath != null) {
				try (FileOutputStream fos = new FileOutputStream(filePath);
						ZipOutputStream zos = new ZipOutputStream(fos)) {

					// Create _definitions directory
					zos.putNextEntry(new ZipEntry("_definitions/"));
					zos.closeEntry();

					// Create nodetypes directory
					zos.putNextEntry(new ZipEntry("nodetypes/"));
					zos.closeEntry();

					// Create servicetemplates directory
					zos.putNextEntry(new ZipEntry("servicetemplates/"));
					zos.closeEntry();

					// Create TOSCA-Metadata directory
					zos.putNextEntry(new ZipEntry("TOSCA-Metadata/"));
					zos.closeEntry();

					// Add TOSCA-Metadata content
					addToscaMetadata(zos);

					// Add content to other directories
					addDefinitions(zos, toscaModel);
					addNodeTypes(zos, toscaModel);
					addServiceTemplates(zos, toscaModel);

					MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Success",
							"CSAR file generated successfully");
				}
			}
		} catch (IOException e) {
			logger.error(e);
			MessageDialog.openError(Display.getCurrent().getActiveShell(), "CSAR export error",
					e.getLocalizedMessage());
		}
	}

	private void addToscaMetadata(ZipOutputStream zos) throws IOException {
		ZipEntry entry = new ZipEntry("TOSCA-Metadata/TOSCA.meta");
		zos.putNextEntry(entry);
		String metadataContent = "TOSCA-Meta-File-Version: 1.0\n" + "CSAR-Version: 1.1\n"
				+ "Created-By: Modelio MYRTUS TOSCA Designer\n" + "Entry-Definitions: _definitions/\n";
		zos.write(metadataContent.getBytes());
		zos.closeEntry();
	}

	private Handlebars setupHandlebars() {
		Handlebars handlebars = new Handlebars(new ClassPathTemplateLoader(TEMPLATE_PATH, ".hbs"));
		handlebars.setPrettyPrint(true);
		handlebars.registerHelper("getProperty", (ModelElement context, Options options) -> {
			Stereotype entityTypeStereotype = context.getExtension().get(0).getParent();
			return context.getProperty(entityTypeStereotype, (String) options.params[0]);
		});
//		handlebars.registerHelper("equals", (Object context, Options options) -> {
//			return options.context.equals( options.params[0]);
//		});
		handlebars.registerHelpers(ConditionalHelpers.class);
		return handlebars;
	}

	private String renderTemplate(Handlebars handlebars, Object data) throws IOException {
		Template mainTemplate = handlebars.compile(MAIN_TEMPLATE);
		try (StringWriter writer = new StringWriter()) {
			mainTemplate.apply(data, writer);
			return writer.toString();
		}
	}

	private String saveToFile(String content, String[] fileExtensions, String fileType) {
		FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.SAVE);
		fileDialog.setFilterExtensions(fileExtensions);

		String filePath = fileDialog.open();
		if (filePath != null && content != null) {
			try (FileWriter fileWriter = new FileWriter(filePath)) {
				fileWriter.write(content);
				MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Success",
						fileType + " saved successfully");
			} catch (IOException ex) {
				logger.error(ex);
				MessageDialog.openError(Display.getCurrent().getActiveShell(), fileType + " export error",
						ex.getLocalizedMessage());
			}
		}
		return filePath;
	}

	private void addDefinitions(ZipOutputStream zos, MObject toscaModel) throws IOException {
		if (!(toscaModel instanceof ModelTree)) {
			logger.error("toscaModel is not an instance of ModelTree");
			return;
		}

		ModelTree modelPackage = (ModelTree) toscaModel;

		for (ModelTree element : modelPackage.getOwnedElement()) {
			if (isToscaNodeType(element) || isToscaTopologyTemplate(element)) {
				String toscaContent = renderTemplate(handlebars, element);
				String fileName = element.getName() + ".tosca";

				ZipEntry entry = new ZipEntry("_definitions/" + fileName);
				zos.putNextEntry(entry);
				zos.write(toscaContent.getBytes());
				zos.closeEntry();
			}
		}
	}

	private void addNodeTypes(ZipOutputStream zos, MObject toscaModel) throws IOException {
		// Implement logic to add node type files
		// @Juan in the TNO example there are only icons in this part of the file
	}

	private void addServiceTemplates(ZipOutputStream zos, MObject toscaModel) throws IOException {
		// Implement logic to add service template files
		// @Juan in the TNO example there is only an NGIX configuration file
	}
}

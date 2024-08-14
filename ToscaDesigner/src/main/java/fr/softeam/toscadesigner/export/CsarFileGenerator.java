package fr.softeam.toscadesigner.export;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.modelio.api.module.context.log.ILogService;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.vcore.smkernel.mapi.MObject;

public class CsarFileGenerator extends AbstractToscaFileGenerator {

	private static final String[] CSAR_FILE_EXTENSIONS = { "*.csar" };
	private ILogService logger;

	public CsarFileGenerator(ILogService logger) {
		this.logger = logger;
	}

	@Override
	protected String[] getFileExtensions() {
		return CSAR_FILE_EXTENSIONS;
	}

	
	@Override
	public void generateContent(MObject toscaModel) throws IOException {
		try {
			String filePath = saveToFile(CSAR_FILE_EXTENSIONS, "CSAR file");

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

	private void addDefinitions(ZipOutputStream zos, MObject toscaModel) throws IOException {
		if (!(toscaModel instanceof ModelTree)) {
			logger.error("toscaModel is not an instance of ModelTree");
			return;
		}

		ModelTree modelPackage = (ModelTree) toscaModel;

		for (MObject element : modelPackage.getCompositionChildren()) {
			if (new NodeTypeChecker().isTypeOf(element) ||
					new TopologyTemplateChecker().isTypeOf(element)) {
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

	@Override
	protected String getFileType() {
		return "CSAR file";
	}

	
}

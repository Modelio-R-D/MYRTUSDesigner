package fr.softeam.toscadesigner.export;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Options;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.helper.ConditionalHelpers;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;

import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilityDefinitionsType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TEntityType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType;
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TRequirement;
import fr.softeam.toscadesigner.impl.ToscaDesignerModule;

public abstract class AbstractToscaFileGenerator {
	protected Handlebars handlebars = setupHandlebars();
	private static final String TEMPLATE_PATH = "/fr/softeam/templates/";
	private static final String MAIN_TEMPLATE = "_mainTemplate";

	protected abstract String getFileType();

	protected abstract String[] getFileExtensions();

	public abstract void generateContent(MObject object) throws IOException;

	protected String saveToFile(String[] fileExtensions, String fileType) {
		FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.SAVE);
		fileDialog.setFilterExtensions(fileExtensions);

		String filePath = fileDialog.open();

		return filePath;
	}

	private Handlebars setupHandlebars() {
		Handlebars handlebars = new Handlebars(new ClassPathTemplateLoader(TEMPLATE_PATH, ".hbs"));
		handlebars.setPrettyPrint(true);
		handlebars.registerHelper("getProperty", (ModelElement context, Options options) -> {
			String searchedPropertyName = (String) options.params[0];
			for (Stereotype stereotype : context.getExtension()) {
				String propertyStringValue;
				propertyStringValue = context.getProperty(stereotype, searchedPropertyName);

				// if it didn't find the property with this stereotype, look for the parent
				// stereotypes
				while (propertyStringValue == null && stereotype.getParent() != null) {
					stereotype = stereotype.getParent();
					propertyStringValue = context.getProperty(stereotype, (String) searchedPropertyName);
				}

				if (stereotype.getName().equals("TRequirement")) {
					if (searchedPropertyName.equals("node")) {

						MRef ref = (MRef) PropertyConverter.convertToObject(TRequirement.MdaTypes.NODE_PROPERTY_ELT,
								propertyStringValue, context);
						ModelElement tNodeType = (ModelElement) ToscaDesignerModule.getInstance().getModuleContext()
								.getModelingSession().findByRef(ref);
						propertyStringValue = tNodeType.getName();
					} else if (searchedPropertyName.equals("capability")) {
						MRef ref = (MRef) PropertyConverter.convertToObject(
								TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT, propertyStringValue, context);
						ModelElement tCapability = (ModelElement) ToscaDesignerModule.getInstance().getModuleContext()
								.getModelingSession().findByRef(ref);
						propertyStringValue = tCapability.getName();
					}
				} else if (stereotype.getName().equals("TRelationshipTemplate")) {
					if (searchedPropertyName.equals("type")) {
//						MRef ref = (MRef) PropertyConverter.convertToObject(
//								TRelationshipTemplate.MdaTypes.TYPE_PROPERTY_ELT, propertyStringValue, context);
//						ModelElement tRelationshipType = (ModelElement) ToscaDesignerModule.getInstance()
//								.getModuleContext().getModelingSession().findByRef(ref);
//						propertyStringValue = tRelationshipType.getName();
					}
				} else if (stereotype.getName().equals("TNodeTemplate")) {
					TNodeTemplate tNodeTemplate = TNodeTemplate.safeInstantiate((Class)context);
					if (searchedPropertyName.equals("nodeType")) {
						TNodeType nodeType = tNodeTemplate.getNodeType();
						propertyStringValue = nodeType.getTargetNamespace() + "." + nodeType.getElement().getName();
					}
				}
				return propertyStringValue;
			}
			throw new RuntimeException("Stereotype property " + searchedPropertyName + " not found in " + context);
		});
		handlebars.registerHelper("noStereotypeApplications", (Class context, Options options) -> {
			List<ModelTree> artifacts = context.getOwnedElement().stream()
					.filter(element -> element.getExtension().stream()
							.anyMatch(stereotype -> stereotype.getName().equals(options.params[0])))
					.collect(Collectors.toList());
			return artifacts.isEmpty();
		});
		handlebars.registerHelper("imports", (ModelElement context, Options options) -> {

			Set<Import> imports = new HashSet<>();

			// Check if the context is a Node Type
			if (new NodeTypeChecker().isTypeOf(context)) {

				TNodeType tNodeType = TNodeType.safeInstantiate((Class) context);

				// 1. Check for non-tosca derived type
//				Stereotype stereotype = ToscaDesignerModule.getInstance().getModuleContext().getModelingSession()
//						.getMetamodelExtensions().getStereotype("TEntityType", context.getMClass());
				String derivedFromValue = tNodeType.getDerivedFrom(); // .getProperty(stereotype,
																		// TEntityType.DERIVEDFROM_PROPERTY);
				String targetNamespace = tNodeType.getTargetNamespace(); // .getProperty(stereotype,
																			// TEntityType.TARGETNAMESPACE_PROPERTY);

				if (derivedFromValue != null && !derivedFromValue.startsWith("tosca")) {
					imports.add(new Import(derivedFromValue + ".tosca", targetNamespace, "MYRTUS-"));
				}

				// 2. Check for non-tosca valid source types in capabilities
//				CapabilityDefinitionsType capabilityDefinitionsTypeInstance = tNodeType.getCapabilityDefinitions();
//				List<TCapabilityDefinition> capabilityDefinitions = capabilityDefinitionsTypeInstance.getCapabilityDefinition();
				// To develop when capabilities will be supported
//				for (TCapabilityDefinition tCapabilityDefinition : capabilityDefinitions) {
//					if (hasNonToscaValidSourceType(capability)) {
//						imports.add(/* import statement */);
//					}
//				}
			} else if (new TopologyTemplateChecker().isTypeOf(context)) {
				// 3. Check for non-tosca types in node templates

				// To develop when TNodeTemplate will have the «type» property
//				List<ModelElement> nodeTemplates = context.getCompositionChildren().stream()
//					    .filter(object -> {
//					        Stereotype tNodeTemplateStereotype = ToscaDesignerModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions()
//					            .getStereotype("TNodeTemplate", object.getMClass());
//					        return tNodeTemplateStereotype != null && ((ModelElement) object).isStereotyped(tNodeTemplateStereotype);
//					    })
//					    .map(ModelElement.class::cast)
//					    .collect(Collectors.toList());
//				for (ModelElement nodeTemplate : nodeTemplates) {
//					if (nodeTemplate.getProperty(TNodeTemplate.STEREOTYPE_NAME, TNodeTemplate.TYPE_PROPERTY)) {
//						imports.add(/* import statement */);
//					}
//				}

			}

			// Generate the import statements based on the imports list
			String importString = generateImportString(imports);
			return importString;

		});
		handlebars.registerHelpers(ConditionalHelpers.class);
		return handlebars;
	}

	final class Import {
		private String file;
		private String namespaceUri;
		private String namespacePrefix;

		public Import(String file, String namespaceUri, String namespacePrefix) {
			this.file = file;
			this.namespaceUri = namespaceUri;
			this.namespacePrefix = namespacePrefix;
		}

		// Getters and setters for each field

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Import anImport = (Import) o;

			return file.equals(anImport.file) && namespaceUri.equals(anImport.namespaceUri)
					&& namespacePrefix.equals(anImport.namespacePrefix);
		}

		public String getFile() {
			return file;
		}

		public String getNamespaceUri() {
			return namespaceUri;
		}

		public String getNamespacePrefix() {
			return namespacePrefix;
		}

		@Override
		public int hashCode() {
			return Objects.hash(file, namespaceUri, namespacePrefix);
		}

	}

	private String generateImportString(Set<Import> imports) {
		StringBuilder importString = new StringBuilder();
		if (!imports.isEmpty())
			importString.append("imports:\n");
		for (Import anImport : imports) {
			importString.append("  - file: ").append(anImport.getFile()).append("\n").append("    namespace_uri: ")
					.append(anImport.getNamespaceUri()).append("\n").append("    namespace_prefix: ")
					.append(anImport.getNamespacePrefix()).append("\n");
		}

		return importString.toString();
	}

	protected String renderTemplate(Handlebars handlebars, Object data) throws IOException {
		Template mainTemplate = handlebars.compile(MAIN_TEMPLATE);
		try (StringWriter writer = new StringWriter()) {
			mainTemplate.apply(data, writer);
			return writer.toString();
		}
	}

}
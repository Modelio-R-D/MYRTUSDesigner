package fr.softeam.toscadesigner.export;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Options;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.helper.ConditionalHelpers;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;
import com.modeliosoft.modelio.javadesigner.annotations.mdl.prop;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.CapabilityStereotype;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityDefinition;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapabilityType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirement;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRequirementDefinition;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("a978a48a-0ffe-4024-8420-2c98ef6ba103")
public abstract class AbstractToscaFileGenerator {
    @objid ("04fd37ec-f78e-4a3a-b96c-834a98336443")
    private static final String TEMPLATE_PATH = "/fr/softeam/templates/";

    @objid ("98a46751-3c5a-4235-8b30-2ffe36d4dee9")
    private static final String MAIN_TEMPLATE = "_mainTemplate";

    @objid ("9689f9ef-250b-4287-aa66-91888b48be79")
    protected Handlebars handlebars = setupHandlebars();

    @objid ("4d68e5d9-ea08-40e7-b84f-e4b8172735a1")
    protected abstract String getFileType();

    @objid ("621a5567-4bd4-4f04-9a26-8da7acc97221")
    protected abstract String[] getFileExtensions();

    @objid ("8cbbc08f-5dcd-486d-b58a-d48dc8a241f9")
    public abstract void generateContent(MObject object) throws IOException;

    @objid ("e1eb7569-df1f-40ff-a8d2-d4d58a3d4cc0")
    protected String saveToFile(String[] fileExtensions, String fileType) {
        FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.SAVE);
        fileDialog.setFilterExtensions(fileExtensions);
        
        String filePath = fileDialog.open();
        
        return filePath;
    }

    @objid ("037b49d7-5f5b-4812-9407-e9df5d693e93")
    private Handlebars setupHandlebars() {
        Handlebars handlebars = new Handlebars(new ClassPathTemplateLoader(TEMPLATE_PATH, ".hbs"));
        handlebars.setPrettyPrint(true);
        handlebars.registerHelper("getProperty", (ModelElement context, Options options) -> {
            String searchedPropertyName = (String) options.params[0];
            for (Stereotype stereotype : context.getExtension()) {
                String propertyStringValue;
                propertyStringValue = context.getProperty(stereotype, searchedPropertyName);
        
                if (stereotype.getName().equals("TRequirement")) {
        
                    TRequirement tRequirement = TRequirement.safeInstantiate((Class) context);
                    if (searchedPropertyName.equals("node")) {
                        TNodeTemplate node = tRequirement.getNode();
                        propertyStringValue = node != null ? node.getName() : "''";
                    } else if (searchedPropertyName.equals("capability")) {
                        CapabilityStereotype capability = tRequirement.getCapability();
                        propertyStringValue = capability != null ? capability.getElement().getName() : "";
                    }
                } else if (stereotype.getName().equals("TRequirementDefinition")) {
        
                    TRequirementDefinition tRequirementDefinition = TRequirementDefinition
                            .safeInstantiate((Class) context);
                    if (searchedPropertyName.equals("node")) {
                        propertyStringValue = tRequirementDefinition.getNodeType().getName();
                    } else if (searchedPropertyName.equals("capability")) {
                        TCapabilityType capability = tRequirementDefinition.getCapability();
                        propertyStringValue = capability.getElement().getName();
                    } else if (searchedPropertyName.equals("relationshipType")) {
                        propertyStringValue = tRequirementDefinition.getRelationshipType().getElement().getName();
                    } else if (searchedPropertyName.equals("lowerBound")) {
                        propertyStringValue = tRequirementDefinition.getLowerBound();
                    } else if (searchedPropertyName.equals("upperBound")) {
                        propertyStringValue = tRequirementDefinition.getUpperBound();
                    }
                } else if (stereotype.getName().equals("TRelationshipTemplate")) {
                    if (searchedPropertyName.equals("type")) {
                        TRelationshipTemplate tRelationshipTemplate = TRelationshipTemplate
                                .safeInstantiate((Association) context);
                        TRelationshipType relationshipType = tRelationshipTemplate.getRelationshipType();
                        Class element = relationshipType.getElement();
                        propertyStringValue = element.getName();
                    }
                } else if (stereotype.getName().equals("TNodeTemplate")) {
                    TNodeTemplate tNodeTemplate = TNodeTemplate.safeInstantiate((Class) context);
                    if (searchedPropertyName.equals("nodeType")) {
                        TNodeType nodeType = tNodeTemplate.getNodeType();
                        propertyStringValue = nodeType.getTargetNamespace() + "." + nodeType.getElement().getName();
                    }
                } else if (stereotype.getName().equals("TCapabilityDefinition")) {
                    TCapabilityDefinition tCapabilityDefinition = TCapabilityDefinition
                            .safeInstantiate((Class) context);
                    if (searchedPropertyName.equals("capabilityType")) {
                        propertyStringValue = tCapabilityDefinition.getCapabilityType().getElement().getName();
                    }
                }
                // if it didn't find the property with this stereotype, look for the parent
                // stereotypes
                while (propertyStringValue == null && stereotype.getParent() != null) {
                    stereotype = stereotype.getParent();
                    propertyStringValue = context.getProperty(stereotype, (String) searchedPropertyName);
                }
                return propertyStringValue;
            }
            throw new RuntimeException("Stereotype property " + searchedPropertyName + " not found in " + context);
        });
        handlebars.registerHelper("noStereotypeApplications", (ModelTree context, Options options) -> 
            Stream.concat(
                context.getOwnedElement().stream(), 
                context instanceof Class ? ((Class) context).getOwnedAttribute().stream() : Stream.empty()
            )
            .noneMatch(element -> element.getExtension().stream()
                .anyMatch(stereotype -> stereotype.getName().equals(options.params[0]))
            )
        );
        handlebars.registerHelper("imports", (ModelElement context, Options options) -> {
        
            Set<Import> imports = new HashSet<>();
        
            // Check if the context is a Node Type
            if (new NodeTypeChecker().isTypeOf(context)) {
        
                TNodeType tNodeType = TNodeType.safeInstantiate((Class) context);
        
                // 1. Check for non-tosca derived type
        
                String derivedFromValue = tNodeType.getDerivedFrom().getName();
                String targetNamespace = tNodeType.getTargetNamespace();
                if (derivedFromValue != null && !derivedFromValue.startsWith("tosca")) {
                    imports.add(new Import(derivedFromValue + ".tosca", targetNamespace, "MYRTUS-"));
                }
        
                // 2. Check for non-tosca valid source types in capabilities
        //                CapabilityDefinitionsType capabilityDefinitionsTypeInstance = tNodeType.getCapabilityDefinitions();
        //                List<TCapabilityDefinition> capabilityDefinitions = capabilityDefinitionsTypeInstance.getCapabilityDefinition();
                // To develop when capabilities will be supported
        //                for (TCapabilityDefinition tCapabilityDefinition : capabilityDefinitions) {
        //                    if (hasNonToscaValidSourceType(capability)) {
        //                        imports.add(/* import statement */);
        //                    }
        //                }
            } else if (new TopologyTemplateChecker().isTypeOf(context)) {
                // 3. Check for non-tosca types in node templates
        
                // To develop when TNodeTemplate will have the «type» property
        //                List<ModelElement> nodeTemplates = context.getCompositionChildren().stream()
        //                        .filter(object -> {
        //                            Stereotype tNodeTemplateStereotype = ToscaDesignerModule.getInstance().getModuleContext().getModelingSession().getMetamodelExtensions()
        //                                .getStereotype("TNodeTemplate", object.getMClass());
        //                            return tNodeTemplateStereotype != null && ((ModelElement) object).isStereotyped(tNodeTemplateStereotype);
        //                        })
        //                        .map(ModelElement.class::cast)
        //                        .collect(Collectors.toList());
        //                for (ModelElement nodeTemplate : nodeTemplates) {
        //                    if (nodeTemplate.getProperty(TNodeTemplate.STEREOTYPE_NAME, TNodeTemplate.TYPE_PROPERTY)) {
        //                        imports.add(/* import statement */);
        //                    }
        //                }
        
            }
        
            // Generate the import statements based on the imports list
            String importString = generateImportString(imports);
            return importString;
        
        });
        handlebars.registerHelpers(ConditionalHelpers.class);
        return handlebars;
    }

    @objid ("13630cce-3bfe-4ae7-9beb-ed9e4b003601")
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

					TRequirement tRequirement = TRequirement.safeInstantiate((Class) context);
					if (searchedPropertyName.equals("node")) {
						TNodeTemplate node = tRequirement.getNode();
						propertyStringValue = node != null ? node.getElement().getName() : "''";
					} else if (searchedPropertyName.equals("capability")) {
						CapabilityStereotype capability = tRequirement.getCapability();
						propertyStringValue = capability != null ? capability.getElement().getName() : "";
					} else if (searchedPropertyName.equals("relationship")) {
						TRelationshipTemplate relationship = tRequirement.getRelationship();
						propertyStringValue = relationship != null ? relationship.getElement().getName() : "";
					}
				} else if (stereotype.getName().equals("TRequirementDefinition")) {

    @objid ("9e35cf11-975d-4bd5-b47c-906d11ceb954")
    final class Import {
        @objid ("183f40a2-5fe0-4af1-b443-c52f53dd5b41")
        private String file;

        @objid ("f824ee92-fd5b-4d16-bcec-70921f04618c")
        private String namespaceUri;

        @objid ("088bd59e-268f-462a-83f9-262468e28c39")
        private String namespacePrefix;

        @objid ("b0552053-b80b-4ba5-8589-bb3ff53d78cf")
        public  Import(String file, String namespaceUri, String namespacePrefix) {
            this.file = file;
            this.namespaceUri = namespaceUri;
            this.namespacePrefix = namespacePrefix;
        }

        @objid ("2c629fd5-b215-45d7-b761-7f5ae4755806")
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

        @objid ("5508cb27-7900-461f-90c9-4bdaebc6b784")
        public String getFile() {
            return file;
        }

        @objid ("ec61ea77-0650-4434-a1e6-8cf7bd81de74")
        public String getNamespaceUri() {
            return namespaceUri;
        }

        @objid ("17378444-8b02-4318-9b41-4bfa90955a89")
        public String getNamespacePrefix() {
            return namespacePrefix;
        }

        @objid ("c31a2680-06ed-4126-bbb7-3425d14dbcc9")
        @Override
        public int hashCode() {
            return Objects.hash(file, namespaceUri, namespacePrefix);
        }

    }

}

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 15:34 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.api.module.MManualAssociationRole;
import com.modeliosoft.modelio.api.module.MManualAttribute;
import com.modeliosoft.modelio.api.module.MManualClass;
import com.modeliosoft.modelio.api.module.MManualImport;
import com.modeliosoft.modelio.api.module.MManualOperation;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ModelingSessionRegistry;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << TDefinitions >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b300f648-32a7-4b1b-8fcc-154307a32bdd")
public class TDefinitions extends TExtensibleElements implements IMdaProxy {
    @objid ("bf8e049d-1340-472e-b9e3-a761d0644373")
    public static final String STEREOTYPE_NAME = "TDefinitions";

    @objid ("46f9f9ba-393f-4a74-9b64-5e92a4c1a556")
    public static final String ARTIFACTTEMPLATE_PROPERTY = "artifactTemplate";

    @objid ("a600e608-828c-4bad-95f6-45e2b4b2ae99")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("33b51859-f7bf-4ba7-90e2-262aa9610a16")
    public static final String CAPABILITYTYPE_PROPERTY = "capabilityType";

    @objid ("b7bbaaf5-8c05-49e3-a0e2-c2544cc11e90")
    public static final String EXTENSIONS_PROPERTY = "extensions";

    @objid ("fb1d864a-7e3b-4d94-a7bc-1b8af456c009")
    public static final String GROUP_PROPERTY = "group";

    @objid ("aa3eff31-16d3-42c9-be62-e99f6c4ddb89")
    public static final String ID_PROPERTY = "id";

    @objid ("4c954baf-4f0e-4f21-ad3c-61ac87a2a050")
    public static final String IMPORT_PROPERTY = "import";

    @objid ("14458be2-59ba-4566-9ef5-8fed46f9651b")
    public static final String NAME_PROPERTY = "name";

    @objid ("49cb5b64-edc5-440c-b1ed-36812ed9f48b")
    public static final String NODETYPE_PROPERTY = "nodeType";

    @objid ("d592545e-b61a-4d75-902f-c98659f4535b")
    public static final String NODETYPEIMPLEMENTATION_PROPERTY = "nodeTypeImplementation";

    @objid ("20ddaa1c-9ab3-4dfb-b286-461f36211aee")
    public static final String POLICYTEMPLATE_PROPERTY = "policyTemplate";

    @objid ("cfbc2bdc-3f00-4848-bdc5-d8e1728972a9")
    public static final String POLICYTYPE_PROPERTY = "policyType";

    @objid ("b7b37e4e-88a4-4e6c-8571-ddf04de09d3b")
    public static final String RELATIONSHIPTYPE_PROPERTY = "relationshipType";

    @objid ("1164dbb1-cccb-47a0-ad62-97796ff2fb28")
    public static final String RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY = "relationshipTypeImplementation";

    @objid ("d9bf15fc-b36f-4155-abea-dd22b47e3275")
    public static final String REQUIREMENTTYPE_PROPERTY = "requirementType";

    @objid ("e8d6829a-8c52-40ef-b9e4-f4f00c266333")
    public static final String SERVICETEMPLATE_PROPERTY = "serviceTemplate";

    @objid ("b3cf8e8f-999c-451b-b162-d0918e861c5e")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    @objid ("f4a619ba-22a1-4773-b995-a04fab2720b3")
    public static final String TYPES_PROPERTY = "types";

    /**
     * Tells whether a {@link TDefinitions proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TDefinitions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3759b898-65b6-490d-9ed1-f54671538d85")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TDefinitions.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TDefinitions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TDefinitions >> then instantiate a {@link TDefinitions} proxy.
     * 
     * @return a {@link TDefinitions} proxy on the created {@link ModelElement}.
     */
    @objid ("b4ce8696-5a4a-4155-84ae-f963efa7af64")
    public static TDefinitions create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TDefinitions.MdaTypes.STEREOTYPE_ELT);
        return TDefinitions.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TDefinitions} proxy from a {@link ModelElement} stereotyped << TDefinitions >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TDefinitions} proxy or <i>null</i>.
     */
    @objid ("49240f7b-4288-44dd-9c03-854932134a62")
    public static TDefinitions instantiate(final ModelElement obj) {
        return TDefinitions.canInstantiate(obj) ? new TDefinitions(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDefinitions} proxy from a {@link ModelElement} stereotyped << TDefinitions >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TDefinitions} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f09f1b55-0563-42ec-b10b-8b18fb6d5ab0")
    public static TDefinitions safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TDefinitions.canInstantiate(obj))
        	return new TDefinitions(obj);
        else
        	throw new IllegalArgumentException("TDefinitions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("172cae4e-735a-4354-aeaa-25138b053801")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TDefinitions other = (TDefinitions) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TDefinitions.artifactTemplate'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d902ad8e-f675-4224-bcb2-b3015bc876a6")
    public String getArtifactTemplate() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.ARTIFACTTEMPLATE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.ARTIFACTTEMPLATE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.ARTIFACTTEMPLATE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("08612a3c-a4a9-4de9-9426-5c363b592127")
    public String getArtifactType() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.capabilityType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("857b08cf-0239-4f6d-8c52-b21f4b80fe28")
    public String getCapabilityType() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("2ad516e4-c7c4-4e67-a80a-70096fcc2bd0")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TDefinitions.extensions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f14a4004-8564-4da1-abbb-7a399642f137")
    public String getExtensions() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.EXTENSIONS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.EXTENSIONS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.EXTENSIONS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.group'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a65b3565-15da-4acf-9a67-9222a391768e")
    public String getGroup() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.GROUP_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.GROUP_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.GROUP_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ddf721c7-7abb-4365-84c0-b0224d8dc4fb")
    public String getId() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.ID_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.ID_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.ID_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.import'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aea331ea-0245-4003-b11c-fc10e9d011b9")
    public String getImport() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.IMPORT_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.IMPORT_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.IMPORT_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6d416537-cba0-412a-ab13-3990f51f4f78")
    public String getName() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.nodeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("461553f9-87d2-4879-8de6-37d408fe8cf0")
    public String getNodeType() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.NODETYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.NODETYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.NODETYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.nodeTypeImplementation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1fb54899-a550-4624-9531-bc3fcfb6a680")
    public String getNodeTypeImplementation() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.NODETYPEIMPLEMENTATION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.NODETYPEIMPLEMENTATION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.NODETYPEIMPLEMENTATION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.policyTemplate'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bad3575d-f4d9-438d-91b7-cd00d2f748f0")
    public String getPolicyTemplate() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.POLICYTEMPLATE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.POLICYTEMPLATE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.POLICYTEMPLATE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.policyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6483f889-94aa-4e86-88ed-61516977b751")
    public String getPolicyType() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.POLICYTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.POLICYTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.POLICYTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.relationshipType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e88abd3b-568f-40cf-9397-155cd66b4423")
    public String getRelationshipType() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.RELATIONSHIPTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.RELATIONSHIPTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.RELATIONSHIPTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.relationshipTypeImplementation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("55d631cd-26dd-4f32-80e8-f700ce6129e5")
    public String getRelationshipTypeImplementation() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.requirementType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e385af1d-f2d6-448a-9165-f87a1a323559")
    public String getRequirementType() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.serviceTemplate'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("466c1e53-423d-4a83-aa23-bce1395fcc78")
    public String getServiceTemplate() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.SERVICETEMPLATE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.SERVICETEMPLATE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.SERVICETEMPLATE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7671b36d-1d6b-40b0-9c64-71b55a37d056")
    public String getTargetNamespace() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDefinitions.types'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f4c90664-0f2d-41de-bf27-98c51d483a3f")
    public String getTypes() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.TYPES_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("03b70981-4ca1-4a28-8851-3052e7eea2eb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDefinitions.artifactTemplate'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("233a1499-fc5b-49ac-bd16-88764e280484")
    public void setArtifactTemplate(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.ARTIFACTTEMPLATE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.ARTIFACTTEMPLATE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f9e78a3a-6bee-42bd-b08b-68d779eb198e")
    public void setArtifactType(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.capabilityType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("32d84ea4-0480-4768-b169-837fb07c4a80")
    public void setCapabilityType(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.extensions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("24d7859e-d5a6-48e6-89d4-fb39eb227f3f")
    public void setExtensions(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.EXTENSIONS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.EXTENSIONS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.group'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("323e13d5-77e8-4d53-af0d-edd329225b4e")
    public void setGroup(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.GROUP_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.GROUP_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b651952b-5f14-4e1b-933a-d4fa00e03730")
    public void setId(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.ID_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.ID_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.import'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8d0da438-2a09-413f-a87c-e7f64ee65dee")
    public void setImport(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.IMPORT_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.IMPORT_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1a1af3fd-9836-4e1a-89b2-ed86ddb1d3ff")
    public void setName(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.nodeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b4153017-48e2-4001-83d7-4936503d6c3a")
    public void setNodeType(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.NODETYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.NODETYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.nodeTypeImplementation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9842902d-7a20-4337-a901-86828f8439b7")
    public void setNodeTypeImplementation(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.NODETYPEIMPLEMENTATION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.NODETYPEIMPLEMENTATION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.policyTemplate'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("61e600e9-e8af-4ac5-bc2e-7c3b47047cd0")
    public void setPolicyTemplate(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.POLICYTEMPLATE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.POLICYTEMPLATE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.policyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0d40e810-c189-4a16-95fd-280e5965130f")
    public void setPolicyType(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.POLICYTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.POLICYTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.relationshipType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c4d7da12-a9a5-4a24-a863-dcdd5bcbeecf")
    public void setRelationshipType(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.RELATIONSHIPTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.RELATIONSHIPTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.relationshipTypeImplementation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("426feb6a-bfbf-4c7c-aed2-3e71b6dcf424")
    public void setRelationshipTypeImplementation(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.requirementType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("88409856-99a5-4d1e-9df3-04bc91aa3c1d")
    public void setRequirementType(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.serviceTemplate'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("03140e80-e1a9-46aa-b7c9-e573f33f0cf3")
    public void setServiceTemplate(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.SERVICETEMPLATE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.SERVICETEMPLATE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("992af20d-8102-40f7-82db-e00072726774")
    public void setTargetNamespace(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDefinitions.types'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8b166e1f-2149-4ee4-b523-7dcacf23dd02")
    public void setTypes(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.TYPES_PROPERTY_ELT, value));
    }

    @objid ("bc1d00ad-224c-4c90-a3da-1cfd59316acd")
    protected  TDefinitions(final ModelElement elt) {
        super(elt);
    }

    @objid ("3f27cdf7-1d3e-465b-93da-e9b74e8276e7")
    public static final class MdaTypes {
        @objid ("1e258caf-096f-4b8b-bb28-7ea3b02ab984")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("975e86a5-5447-4a55-9aef-0a507a3a7458")
        public static PropertyDefinition ARTIFACTTEMPLATE_PROPERTY_ELT;

        @objid ("3dc0a714-fb5a-410f-a696-0aee7d8b7abd")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("51f79b83-8390-4f5e-adc5-22c4ea4fe755")
        public static PropertyDefinition CAPABILITYTYPE_PROPERTY_ELT;

        @objid ("f9db8e7a-7ebc-453c-bd6d-a693beee7e64")
        public static PropertyDefinition EXTENSIONS_PROPERTY_ELT;

        @objid ("cb71a2e9-c1c2-4931-9063-5a22006ae534")
        public static PropertyDefinition GROUP_PROPERTY_ELT;

        @objid ("efb0d378-0f56-4be8-b8c3-d821946a23a5")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("89b268e5-cd22-4a69-bb8f-810e002e3982")
        public static PropertyDefinition IMPORT_PROPERTY_ELT;

        @objid ("043a1e44-93c5-4d80-b4e7-3da901484b4a")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("726a52d4-a519-4f35-9734-da49a0c07629")
        public static PropertyDefinition NODETYPE_PROPERTY_ELT;

        @objid ("42e0321b-c810-47a2-a371-2bd8a7756b07")
        public static PropertyDefinition NODETYPEIMPLEMENTATION_PROPERTY_ELT;

        @objid ("fc7032dc-614c-4b60-89d7-b2a2afae4b44")
        public static PropertyDefinition POLICYTEMPLATE_PROPERTY_ELT;

        @objid ("792eb724-d314-4623-aace-4a7f012fedfe")
        public static PropertyDefinition POLICYTYPE_PROPERTY_ELT;

        @objid ("9105a360-b1cc-4618-9eed-b42bef3f0e09")
        public static PropertyDefinition RELATIONSHIPTYPE_PROPERTY_ELT;

        @objid ("ac438f28-b357-4ac6-b4ff-ef05f94b580d")
        public static PropertyDefinition RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY_ELT;

        @objid ("eee40fe6-0412-41ca-abc0-06faa4acc4b6")
        public static PropertyDefinition REQUIREMENTTYPE_PROPERTY_ELT;

        @objid ("b70b39c8-7bb0-4cbb-b16e-d4d031dd2794")
        public static PropertyDefinition SERVICETEMPLATE_PROPERTY_ELT;

        @objid ("3193d796-95d7-4c21-b557-8b42d660e5ca")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("5e037c25-3fff-4760-b410-206f4352ae62")
        public static PropertyDefinition TYPES_PROPERTY_ELT;

        @objid ("c09a84ff-677b-4f26-8e05-cb1bac1aa2c3")
        private static Stereotype MDAASSOCDEP;

        @objid ("c8b333fb-8343-4ef9-83f8-73ca93623796")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0e006e71-5f52-4722-9ec2-a18e511028ff")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "a3041a84-a279-4c05-9425-1f7249f6cf24", "TDefinitions");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b6628bfa-29ac-4772-b243-c3af741a88d9", "artifactTemplate");
            ARTIFACTTEMPLATE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ARTIFACTTEMPLATE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "4093b7ad-b9bd-4c17-bfb5-0db810745a9c", "artifactType");
            ARTIFACTTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ARTIFACTTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "29c7dd47-cbba-4c5d-b81b-e4d8d4c7ab6b", "capabilityType");
            CAPABILITYTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CAPABILITYTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "0b1454cd-985b-4044-881c-4ca39b5914dc", "extensions");
            EXTENSIONS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (EXTENSIONS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "20fbc568-e778-4162-8a05-d0a96e2f01ea", "group");
            GROUP_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (GROUP_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "4c00b3ac-68c3-445f-8d61-c1dfed5592eb", "id");
            ID_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ID_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "cae4c5c5-686e-40c0-ae8d-21dada36b016", "import");
            IMPORT_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (IMPORT_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "9c530b7b-c5fb-47be-9f8f-248dbca7923b", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "57dd35fe-90c2-4a42-9bbe-dcc114cddb53", "nodeType");
            NODETYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NODETYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "11dc447d-8ffd-4497-b6cf-f2b093d1b4f2", "nodeTypeImplementation");
            NODETYPEIMPLEMENTATION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NODETYPEIMPLEMENTATION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "9708e254-e4c0-438d-8718-667ed1e90de8", "policyTemplate");
            POLICYTEMPLATE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICYTEMPLATE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "739f9c06-0779-4281-85ea-49520cbec93f", "policyType");
            POLICYTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICYTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "17d8de8e-6341-4148-aa47-5d168a67fb83", "relationshipType");
            RELATIONSHIPTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (RELATIONSHIPTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "e5eb1a57-30e6-46c6-891c-904efe15d1ae", "relationshipTypeImplementation");
            RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "1b9e387e-dcda-438a-ae38-dba0bb07e2ef", "requirementType");
            REQUIREMENTTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIREMENTTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "28e8443e-d208-486d-acdb-a7531c23b66f", "serviceTemplate");
            SERVICETEMPLATE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (SERVICETEMPLATE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "cb7be517-d6df-4243-aff9-26d7e553a5a7", "targetNamespace");
            TARGETNAMESPACE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TARGETNAMESPACE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "f67a2fc8-3991-4b22-8102-45986feadfc0", "types");
            TYPES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TYPES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(Stereotype.MQNAME, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e", "MDAAssocDep");
            MDAASSOCDEP = (Stereotype) session.findByRef(mRef);
            if (MDAASSOCDEP==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd", "MDAAssocDepRole");
            MDAASSOCDEP_ROLE = (TagType) session.findByRef(mRef);
            if (MDAASSOCDEP_ROLE==null) missingRefs.add(mRef);
            
            if (! missingRefs.isEmpty()) throw new MdaProxyException(MdaProxyException.MdaProxyExceptionReason.MISSING_MDA_ELEMENT, missingRefs);
            
        }

    }

}

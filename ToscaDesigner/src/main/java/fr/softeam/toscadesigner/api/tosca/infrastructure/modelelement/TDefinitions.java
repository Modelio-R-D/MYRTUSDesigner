/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 22/05/2025 15:07 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.List;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link ModelElement} with << TDefinitions >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d134e9e6-3e89-41ee-ab94-04c8d6ac06f6")
public class TDefinitions extends TExtensibleElements implements IMdaProxy {
    @objid ("46ea761c-51b9-4efc-939c-9b54c1b7e015")
    public static final String STEREOTYPE_NAME = "TDefinitions";

    @objid ("1d8a06e9-ac9f-4a1b-8bd5-5219e8df4b1b")
    public static final String ARTIFACTTEMPLATE_PROPERTY = "artifactTemplate";

    @objid ("57af5c95-b9ae-4311-bc11-c7ccb1c74d33")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("49e1a92d-aa88-46bc-8e54-ee44a5e84f81")
    public static final String CAPABILITYTYPE_PROPERTY = "capabilityType";

    @objid ("b1fe5524-3fa7-4dff-9322-a5113deedeb7")
    public static final String EXTENSIONS_PROPERTY = "extensions";

    @objid ("ca9c3db5-4887-4606-bd23-64f1d3888020")
    public static final String GROUP_PROPERTY = "group";

    @objid ("2a36702b-ee83-4311-bd89-1601d784ae25")
    public static final String ID_PROPERTY = "id";

    @objid ("9a682c62-b504-43aa-b1a6-6e1fba91ea01")
    public static final String IMPORT_PROPERTY = "import";

    @objid ("dde1d894-e7e0-46c2-bc03-ca61b336e215")
    public static final String NAME_PROPERTY = "name";

    @objid ("a55d723a-cf84-42c1-b476-788417ce9129")
    public static final String NODETYPE_PROPERTY = "nodeType";

    @objid ("ff2e2fe0-8849-4e26-8cfb-3c1e7fd3d5e2")
    public static final String NODETYPEIMPLEMENTATION_PROPERTY = "nodeTypeImplementation";

    @objid ("6e80ec99-ee19-4578-aa2d-81abd227a262")
    public static final String POLICYTEMPLATE_PROPERTY = "policyTemplate";

    @objid ("4911c028-a9f0-41ee-b6d0-82ebe5fe09ad")
    public static final String POLICYTYPE_PROPERTY = "policyType";

    @objid ("e20e4299-3b05-4857-a318-841ebe417bd7")
    public static final String RELATIONSHIPTYPE_PROPERTY = "relationshipType";

    @objid ("2a9466a0-fb3d-48e5-b872-5acb44b5184d")
    public static final String RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY = "relationshipTypeImplementation";

    @objid ("fb03a56a-d20d-471c-af45-4a78288a65b6")
    public static final String REQUIREMENTTYPE_PROPERTY = "requirementType";

    @objid ("a38623c7-4266-4db6-89fd-84696d12a183")
    public static final String SERVICETEMPLATE_PROPERTY = "serviceTemplate";

    @objid ("11dfe66e-123d-44f2-ae54-c32bc8e53f27")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    @objid ("2979145b-63e5-4401-8197-2806e6246005")
    public static final String TYPES_PROPERTY = "types";

    /**
     * Tells whether a {@link TDefinitions proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TDefinitions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f8bfb82a-70b4-43f9-bd50-64cc98169499")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TDefinitions.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TDefinitions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TDefinitions >> then instantiate a {@link TDefinitions} proxy.
     * 
     * @return a {@link TDefinitions} proxy on the created {@link ModelElement}.
     */
    @objid ("84a00c95-7757-4bba-bf3a-b9b3f073493c")
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
    @objid ("7dcfa726-5ef3-4187-85c8-65cf79826dc5")
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
    @objid ("a8397eaa-1cb2-4157-92ee-62bda62d0934")
    public static TDefinitions safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TDefinitions.canInstantiate(obj))
        	return new TDefinitions(obj);
        else
        	throw new IllegalArgumentException("TDefinitions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("47cc65b9-ae3b-4719-b6af-2e8e4262839b")
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
    @objid ("c6a261bc-3829-403d-a7ee-15c031f8fc0f")
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
    @objid ("3c923759-b508-45ef-9b3b-58964bec266f")
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
    @objid ("dd1c9441-d25c-4a8e-a9d4-16f0bab38c3b")
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
    @objid ("501a799d-0fc2-4891-ab3e-b9a03fb0d227")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TDefinitions.extensions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("45d8e5b2-02bc-44ff-a992-76c3f4350804")
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
    @objid ("a0f0384e-34ec-4a00-81a1-788607629368")
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
    @objid ("aa63f163-1982-4fac-a826-9cca68f2c08f")
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
    @objid ("1b4ec216-6774-47e0-b49f-ff1058372e97")
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
    @objid ("f14948d6-4e7e-4e7f-b2de-b24cdf6e2e01")
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
    @objid ("e72ec096-5bb4-4cb8-830f-3ff395f3bbc6")
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
    @objid ("31d60db6-d441-4afb-893c-9ba605a7feee")
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
    @objid ("620e698a-d963-491c-908e-a7cf08a058b5")
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
    @objid ("c3ae1ca6-cfde-44f3-bd93-8da2ce718ccc")
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
    @objid ("04657225-e111-49a5-984d-1ecb89a5aa0f")
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
    @objid ("ed8958a7-b665-4883-b6ac-d754eacd9f19")
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
    @objid ("85518b0e-b9a9-49b2-bec0-f2227b4ba97a")
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
    @objid ("815d5d22-b566-480e-a5e8-ddfc845989e9")
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
    @objid ("ef11d8bf-3a38-4178-8fc6-7a11927452c7")
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
    @objid ("9809dc1a-3a35-4f95-89dd-407b65b2fd42")
    public String getTypes() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.TYPES_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("ba686031-3cf0-4294-93a1-a8994ee8e3c0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDefinitions.artifactTemplate'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8fd2fc37-5f47-47d7-8b19-c83af6cd1d72")
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
    @objid ("f4cee9a4-55b8-4d53-821d-26cea4c74ba7")
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
    @objid ("3124ae26-4843-433d-b4eb-2ab00f595ad8")
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
    @objid ("06d1d6cf-b8e8-46e4-aa82-546f933a9c9d")
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
    @objid ("85ebcfd4-ab10-4b81-b005-4c3153db634b")
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
    @objid ("eaa035aa-07df-4df5-baee-b6db7547d202")
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
    @objid ("8f48747c-a45e-4eca-be20-94a7b317d59b")
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
    @objid ("4e0afd89-0638-491e-8216-ddcce77b94f8")
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
    @objid ("b661418d-380d-49f3-91c0-c03596e9ee5a")
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
    @objid ("8a780b11-ff76-473b-80ed-5038ae7d5cc6")
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
    @objid ("c2ba9aba-cc3d-492d-a2af-cbb5a99cbd32")
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
    @objid ("6e4664af-40be-422c-a1f2-884fcbe03be9")
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
    @objid ("0e187ccb-bd2a-41bf-9f4d-7d3a378a180c")
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
    @objid ("d7338294-5c0c-4e71-b513-007ef94f9df1")
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
    @objid ("6a03016a-87a6-4999-be84-35f399a1e9d3")
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
    @objid ("3f6186c8-963a-418d-a5b7-afdda55536a2")
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
    @objid ("9a9567e3-f5c4-4c20-acec-4fc9beb512ea")
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
    @objid ("5da8458c-5f06-4b45-bda9-148c09233df1")
    public void setTypes(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.TYPES_PROPERTY_ELT, value));
    }

    @objid ("52a70357-4698-44bc-8704-2127bb41fa82")
    protected  TDefinitions(final ModelElement elt) {
        super(elt);
    }

    @objid ("43c4b491-436e-42f2-9853-eed77108f4eb")
    public static final class MdaTypes {
        @objid ("a9c516b4-5c82-4633-9eae-1077267c9042")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("42062379-447e-4c87-8260-d8cb7a0513ff")
        public static PropertyDefinition ARTIFACTTEMPLATE_PROPERTY_ELT;

        @objid ("409be7bc-3782-4cd0-a62c-64cf53da1667")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("208d50fc-3cf0-4a26-b18d-941f617a0945")
        public static PropertyDefinition CAPABILITYTYPE_PROPERTY_ELT;

        @objid ("04aa2690-61b2-4ef7-af7e-bf092fc574ad")
        public static PropertyDefinition EXTENSIONS_PROPERTY_ELT;

        @objid ("c40716b7-f86c-474d-b0fc-44974b98b767")
        public static PropertyDefinition GROUP_PROPERTY_ELT;

        @objid ("98db3ca5-129e-49d6-8c50-d611a2fa41d0")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("2e09b47e-8a10-469f-a734-d176f350dddd")
        public static PropertyDefinition IMPORT_PROPERTY_ELT;

        @objid ("fff3c9c1-aac6-452e-9e2d-1681bd45444e")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("566c6543-8563-4e47-8c76-b74a4ad11990")
        public static PropertyDefinition NODETYPE_PROPERTY_ELT;

        @objid ("725da2f5-f57a-42dc-897b-8d27fe52a879")
        public static PropertyDefinition NODETYPEIMPLEMENTATION_PROPERTY_ELT;

        @objid ("ca0fe61f-0638-419c-88e3-8e2422165278")
        public static PropertyDefinition POLICYTEMPLATE_PROPERTY_ELT;

        @objid ("980725f7-2c1b-4808-b4db-9b3a8470f76c")
        public static PropertyDefinition POLICYTYPE_PROPERTY_ELT;

        @objid ("d7efc911-e145-425b-8512-1b5bffd52b34")
        public static PropertyDefinition RELATIONSHIPTYPE_PROPERTY_ELT;

        @objid ("a9ac77a2-4e5d-4491-8657-a3967488f449")
        public static PropertyDefinition RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY_ELT;

        @objid ("21781ff5-e769-483f-92a4-561b7f58b17d")
        public static PropertyDefinition REQUIREMENTTYPE_PROPERTY_ELT;

        @objid ("7ccdf6ea-1ba6-4940-b89b-ff2059263528")
        public static PropertyDefinition SERVICETEMPLATE_PROPERTY_ELT;

        @objid ("acf0ef60-bd2a-4585-aea5-48f443b4a61c")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("a808e848-faae-4466-b23a-9509ea15ebe5")
        public static PropertyDefinition TYPES_PROPERTY_ELT;

        @objid ("93409eb5-d5ba-4810-b10e-d10ca85171a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("20748f40-8c42-46cd-9f8c-6bfc44d762d5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d96426a0-431b-49bc-afe3-0704dbbb53fd")
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

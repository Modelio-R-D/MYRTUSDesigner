/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 14:48 by Modelio Studio.
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
    @objid ("4acd8c6e-c99a-4d3a-b0b5-62adb8fd2413")
    public static final String STEREOTYPE_NAME = "TDefinitions";

    @objid ("7e2b543a-9d70-462c-8051-f4054d747963")
    public static final String ARTIFACTTEMPLATE_PROPERTY = "artifactTemplate";

    @objid ("c1dcd2d6-e5c7-4f6f-9a72-4137ac6da044")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("1860d60c-e044-43b3-9019-a93d312abe7c")
    public static final String CAPABILITYTYPE_PROPERTY = "capabilityType";

    @objid ("93edffe4-79d0-4918-b5f0-9be6664e27fc")
    public static final String EXTENSIONS_PROPERTY = "extensions";

    @objid ("7fd4ef4f-ff75-43e0-aa54-d7f22129ebbc")
    public static final String GROUP_PROPERTY = "group";

    @objid ("b94f704a-028f-466c-a0ee-2b4c6b14b41d")
    public static final String ID_PROPERTY = "id";

    @objid ("07223a09-a634-493d-ab93-73ac2d785809")
    public static final String IMPORT_PROPERTY = "import";

    @objid ("90c49f26-8b03-4970-8335-75eff062f655")
    public static final String NAME_PROPERTY = "name";

    @objid ("423e3052-ef2a-4a18-ab1d-cd3f01341f24")
    public static final String NODETYPE_PROPERTY = "nodeType";

    @objid ("81cec3a1-9070-422f-ad7d-d58e4ccaef72")
    public static final String NODETYPEIMPLEMENTATION_PROPERTY = "nodeTypeImplementation";

    @objid ("81329508-60ad-49e6-ac0b-d2fa7f5da9a4")
    public static final String POLICYTEMPLATE_PROPERTY = "policyTemplate";

    @objid ("d058e317-92cd-49f6-bc04-cd90928fefad")
    public static final String POLICYTYPE_PROPERTY = "policyType";

    @objid ("afbbca32-cc7c-4392-9087-60adb743b5a3")
    public static final String RELATIONSHIPTYPE_PROPERTY = "relationshipType";

    @objid ("28014a7a-c3e7-4503-9ba2-593057b2876d")
    public static final String RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY = "relationshipTypeImplementation";

    @objid ("bf06ee16-05f5-44b1-9b44-fd9efbdadd34")
    public static final String REQUIREMENTTYPE_PROPERTY = "requirementType";

    @objid ("0c132ae9-71bb-4ca3-a7aa-f298d01441ef")
    public static final String SERVICETEMPLATE_PROPERTY = "serviceTemplate";

    @objid ("d6a0f3cb-2a02-4e1d-94fa-96da93d835a5")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    @objid ("d7a68321-987f-4608-9037-0c4b5f7aba1c")
    public static final String TYPES_PROPERTY = "types";

    /**
     * Tells whether a {@link TDefinitions proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TDefinitions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("325ca3b9-7fa9-4c86-a37f-d92623168eac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TDefinitions.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TDefinitions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TDefinitions >> then instantiate a {@link TDefinitions} proxy.
     * 
     * @return a {@link TDefinitions} proxy on the created {@link ModelElement}.
     */
    @objid ("a1b4f931-a29d-49e5-8fbb-c9d111c69584")
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
    @objid ("2d1225f9-ac63-4dae-ab3d-07564823e209")
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
    @objid ("4c45f4ce-a9b7-47fb-a830-297f6f95888b")
    public static TDefinitions safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TDefinitions.canInstantiate(obj))
        	return new TDefinitions(obj);
        else
        	throw new IllegalArgumentException("TDefinitions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8b3aa34b-8283-4353-91eb-1359c9a9defc")
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
    @objid ("480dfd0f-1628-4d35-bdf2-878d2f277696")
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
    @objid ("9f382307-fe6e-4e91-b597-7b6544a788dc")
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
    @objid ("4dbdcab5-2607-489b-968f-bf47149cdffc")
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
    @objid ("6f93c22f-01e9-4926-afda-8cd486a30e45")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TDefinitions.extensions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1feef1ee-c694-48d0-9d3d-6afd76a764a4")
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
    @objid ("aaa74e80-1d16-4e8a-b466-49af31f35c79")
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
    @objid ("312da0b9-a79a-4b37-a367-820eeea9fa7b")
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
    @objid ("a5da5e04-95a5-4d27-946e-b967875c1fcc")
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
    @objid ("a4ec3699-df0c-48dd-81a9-ce7e4125576a")
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
    @objid ("2e0639a8-f791-43d4-8c83-ce642f3e03fb")
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
    @objid ("19a41ea2-8dc7-4852-abaa-a17d90acb7d3")
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
    @objid ("2db67634-66ec-4a11-b962-68084bdcdafb")
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
    @objid ("a6437bc7-7842-4610-a599-aef9dee8a905")
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
    @objid ("dc682a2e-7128-47f4-aba5-70144b4430ad")
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
    @objid ("68d9c5eb-eccd-43ed-951a-1b83055a682b")
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
    @objid ("13cd697c-bb27-4d87-b0f0-7b977d51e58a")
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
    @objid ("54f71965-f35f-461d-b4a7-ce88a874c12c")
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
    @objid ("ba7fcb68-e229-4498-970c-13f64bbfb0ce")
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
    @objid ("48431bc5-33af-4f62-9cc8-c4147f0aa0b8")
    public String getTypes() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.TYPES_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("f8f7aca7-b44e-499a-bc6a-533f290279c1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDefinitions.artifactTemplate'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e18d5c92-d39e-4560-b322-d1ed697f10f5")
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
    @objid ("f11bf533-538f-4848-a360-2d5ec89feb30")
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
    @objid ("127b18b4-323e-45df-aad4-1617a34524ed")
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
    @objid ("a2af4b10-ecbd-41ed-81de-3046a084f65e")
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
    @objid ("c23ed9e1-0580-4997-a419-061ea0607d7d")
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
    @objid ("d875fe75-a99b-4051-84d8-2fd28c004f02")
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
    @objid ("1e79f456-6b6a-4a4a-8c2d-bcf0b7886af4")
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
    @objid ("3783ed97-6837-494b-9625-70bb369fd159")
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
    @objid ("02724b7f-c786-4c2b-b74e-b8f0ce9bc450")
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
    @objid ("07f1bd00-de2f-417b-ba99-3d56a2c93c88")
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
    @objid ("400c47de-0331-4bc0-aa0b-917847ac9592")
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
    @objid ("ed0ea469-e048-4910-b302-e6f92690cc68")
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
    @objid ("12cbe560-8124-413a-9c9c-d305d0a00798")
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
    @objid ("b1e6aa59-b470-432e-bf8d-29b70fe61ad3")
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
    @objid ("34970618-f3ce-44f7-af7e-0a9884b3eb31")
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
    @objid ("edf3da45-f007-4d97-b822-a1551b486401")
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
    @objid ("2eacc2bb-5b89-4f66-8b0b-c22a68a3a579")
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
    @objid ("238ca6b9-97a6-44e5-b103-b6e19171aa28")
    public void setTypes(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.TYPES_PROPERTY_ELT, value));
    }

    @objid ("d8b59242-c526-4f75-864c-cedc950b4b49")
    protected  TDefinitions(final ModelElement elt) {
        super(elt);
    }

    @objid ("3f27cdf7-1d3e-465b-93da-e9b74e8276e7")
    public static final class MdaTypes {
        @objid ("8bb95c5b-fac4-4d6c-898f-d6511920b15a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ed29454e-d5ae-424a-8368-ee2a69689099")
        public static PropertyDefinition ARTIFACTTEMPLATE_PROPERTY_ELT;

        @objid ("d5746e6e-5c77-440d-ae37-ef9960ebd4f9")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("83b39d78-b02c-4df6-86bc-7f9c8a478085")
        public static PropertyDefinition CAPABILITYTYPE_PROPERTY_ELT;

        @objid ("a1ed90c5-d8e1-4358-9def-ae28544adf90")
        public static PropertyDefinition EXTENSIONS_PROPERTY_ELT;

        @objid ("88aa12a4-3ece-4010-b28a-2591fdf0d7b1")
        public static PropertyDefinition GROUP_PROPERTY_ELT;

        @objid ("3a6294db-4cf1-4671-ba48-8417d301d2cd")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("6ab74a73-0242-44ff-a7c7-e0a7454c15c8")
        public static PropertyDefinition IMPORT_PROPERTY_ELT;

        @objid ("feca7f31-34cc-412d-8213-55345a0fd381")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("fe7328cb-76e5-4028-9dd6-8f9cff5b4658")
        public static PropertyDefinition NODETYPE_PROPERTY_ELT;

        @objid ("b5b83aa1-19cc-4d98-bd85-a80604ff23b7")
        public static PropertyDefinition NODETYPEIMPLEMENTATION_PROPERTY_ELT;

        @objid ("4162d034-0609-4d7b-8a3f-6ad9c5ef3b3d")
        public static PropertyDefinition POLICYTEMPLATE_PROPERTY_ELT;

        @objid ("47bee43c-900f-48e3-8f29-ed74329a767b")
        public static PropertyDefinition POLICYTYPE_PROPERTY_ELT;

        @objid ("d1d017c7-392c-4806-b1ae-fcf8182bdbe0")
        public static PropertyDefinition RELATIONSHIPTYPE_PROPERTY_ELT;

        @objid ("e283ad26-9703-4823-9b57-8b1149e4ac24")
        public static PropertyDefinition RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY_ELT;

        @objid ("cd67a271-33f8-4f0b-b124-b63ed95a15bb")
        public static PropertyDefinition REQUIREMENTTYPE_PROPERTY_ELT;

        @objid ("128d719f-bf24-42d2-a043-f7a772212705")
        public static PropertyDefinition SERVICETEMPLATE_PROPERTY_ELT;

        @objid ("c9c6059a-bd7d-4abf-82c7-0cc4b0a08b9e")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("93794fa4-c939-48ef-a7e9-41360a6c5bb1")
        public static PropertyDefinition TYPES_PROPERTY_ELT;

        @objid ("e0b98bae-4ce5-4ee0-a634-90b483d1a85b")
        private static Stereotype MDAASSOCDEP;

        @objid ("29b7f4b0-5e82-4cbd-bdde-599d1ce12bf5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4be7f99f-3725-4cfa-bc7c-146f5523e1fa")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 15:23 by Modelio Studio.
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
@objid ("d37d57e1-6b37-42e6-9eff-85fe21e1d929")
public class TDefinitions extends TExtensibleElements implements IMdaProxy {
    @objid ("08c37e21-6c4a-42fe-b96e-7db78073e6ce")
    public static final String STEREOTYPE_NAME = "TDefinitions";

    @objid ("1c5a70e8-6f84-4433-ae18-f19d229e586f")
    public static final String ARTIFACTTEMPLATE_PROPERTY = "artifactTemplate";

    @objid ("6025bf68-5e18-4b68-96c2-f7d99b40aa31")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("6198f1b0-0a3f-4dd2-99e8-7181f4bbfdc6")
    public static final String CAPABILITYTYPE_PROPERTY = "capabilityType";

    @objid ("59c2faa5-0ee1-4f7b-ab5a-971f6406ccdb")
    public static final String EXTENSIONS_PROPERTY = "extensions";

    @objid ("0b546caa-2b3d-47a1-9ed7-2e39a62c7c36")
    public static final String GROUP_PROPERTY = "group";

    @objid ("f156e842-068d-42b5-9be0-a49eeeaabd29")
    public static final String ID_PROPERTY = "id";

    @objid ("bead89ee-31ef-4cb2-ae7d-c18c9fb6796d")
    public static final String IMPORT_PROPERTY = "import";

    @objid ("100808f0-242b-4ce7-b5d0-1545ddd62566")
    public static final String NAME_PROPERTY = "name";

    @objid ("212b873e-d420-4d44-9e7f-70a075afd012")
    public static final String NODETYPE_PROPERTY = "nodeType";

    @objid ("f2b4c5f0-a69c-4303-8f80-392019bb7bf5")
    public static final String NODETYPEIMPLEMENTATION_PROPERTY = "nodeTypeImplementation";

    @objid ("0236d6ad-8508-4875-9979-e82ff554f970")
    public static final String POLICYTEMPLATE_PROPERTY = "policyTemplate";

    @objid ("b16a104a-77ee-4aa0-9687-a6727888a55e")
    public static final String POLICYTYPE_PROPERTY = "policyType";

    @objid ("a0b2a9c6-fc7e-490d-bdd7-2e33bfcc144e")
    public static final String RELATIONSHIPTYPE_PROPERTY = "relationshipType";

    @objid ("4123f31c-b110-44a9-8075-560299fa8261")
    public static final String RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY = "relationshipTypeImplementation";

    @objid ("acee5348-7a98-4ccd-88ed-caadd13f347c")
    public static final String REQUIREMENTTYPE_PROPERTY = "requirementType";

    @objid ("2497ab4c-bbdc-4aae-9c09-c61febc50366")
    public static final String SERVICETEMPLATE_PROPERTY = "serviceTemplate";

    @objid ("212b39bc-999c-4ac8-8aa9-a948a94ab1ca")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    @objid ("638a4970-4a76-4b1c-b25e-ba7b0d3704f5")
    public static final String TYPES_PROPERTY = "types";

    /**
     * Tells whether a {@link TDefinitions proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TDefinitions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c31f2ab0-3eea-4c86-bd21-da4e20d57aca")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TDefinitions.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TDefinitions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TDefinitions >> then instantiate a {@link TDefinitions} proxy.
     * 
     * @return a {@link TDefinitions} proxy on the created {@link ModelElement}.
     */
    @objid ("e239d0c2-3b34-4a36-b437-37164a5b3784")
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
    @objid ("1c5b9f0b-39bd-48dd-84b1-bb5b09b15e4d")
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
    @objid ("a583bda9-7611-453d-8623-456c45e17691")
    public static TDefinitions safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TDefinitions.canInstantiate(obj))
        	return new TDefinitions(obj);
        else
        	throw new IllegalArgumentException("TDefinitions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8b17411f-05c5-45a1-8156-e1f578074ad6")
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
    @objid ("fdbc3f83-7af4-4e7c-91dc-3bfcb5fd6007")
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
    @objid ("5ad983ff-cdd1-4ced-b6bc-83fe228dc060")
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
    @objid ("f0bec012-5a4e-4afd-9a6c-974b2a0cfc57")
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
    @objid ("3bbdb50f-cc12-489d-a95d-eb23caa8c149")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TDefinitions.extensions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4ae23ea0-9f18-453c-9a33-b4200fabfbac")
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
    @objid ("bb8fbc76-6178-440d-8110-1f57c273dcdc")
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
    @objid ("e3e3726b-024e-48ae-bbc6-0a4fe5920340")
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
    @objid ("660d9242-4ebf-42ae-a29c-2e072378c741")
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
    @objid ("b451ca20-2514-4a75-9b7e-ca46d275d643")
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
    @objid ("3eb50a2b-6454-4ec7-a5bb-25dc32b7a13f")
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
    @objid ("6c90f2d4-39e0-42ad-863f-9db7e00f86de")
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
    @objid ("d6589024-6afc-4635-bc5a-05201b511a7d")
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
    @objid ("e2703fbc-f348-4862-9446-26160091b9c1")
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
    @objid ("93f0c2cb-00cb-4ca5-8fa8-5697ba6f9d64")
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
    @objid ("3008c2f3-16e8-45a9-8a1b-b4e445af0266")
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
    @objid ("5e7089e8-c0e0-41ee-8e1c-3c051faf51dd")
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
    @objid ("9841d9b0-588b-4182-b271-40efa50e402e")
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
    @objid ("f9eb482f-1a8a-4f13-9d52-94fae4394465")
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
    @objid ("0e52ca60-1893-4392-9041-b3f8c12b714f")
    public String getTypes() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.TYPES_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("d3614377-2799-4b80-becf-8accbba60b31")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDefinitions.artifactTemplate'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5b873e30-8f71-404b-a0b4-68897bc6739e")
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
    @objid ("58789b85-b4e9-4148-b23d-c8103f545e9f")
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
    @objid ("5fbafc07-e823-4a14-b9bd-6f0ca1406397")
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
    @objid ("b8f32a53-17fe-4545-adf1-5390062000ac")
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
    @objid ("0bf6f911-6930-4c86-83e5-f7f517dd0e61")
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
    @objid ("b29bfda2-9027-4eda-9158-8dd3b661daa5")
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
    @objid ("a96d0224-5505-4c97-98dd-7e97006a6b94")
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
    @objid ("6c7008b9-b7af-4565-ac77-eb3b3378bfa5")
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
    @objid ("8e240ac3-d749-49a0-a313-125916d3a333")
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
    @objid ("2226f8d2-63ba-476c-8709-f491602658af")
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
    @objid ("5ac55148-85e0-447e-9932-0fa5936034d6")
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
    @objid ("5c789143-d65d-481e-bb7c-36883eb96067")
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
    @objid ("7dab7759-8f43-4425-9774-774dbd6d4edf")
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
    @objid ("9f6bf7bf-9144-4781-b77c-8f6e630935b0")
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
    @objid ("9b495f0b-5c9f-4219-b444-ff98fe7f83ce")
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
    @objid ("25f8dcd2-76d8-476d-bdbe-d3678246c32e")
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
    @objid ("93a67aef-814d-44f2-b9a4-eaa2146a3039")
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
    @objid ("d9570e0e-6e91-4d88-9f4c-ead634043f8b")
    public void setTypes(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.TYPES_PROPERTY_ELT, value));
    }

    @objid ("0344ab2e-c0e3-4f1e-a42b-be1ecc8789ce")
    protected  TDefinitions(final ModelElement elt) {
        super(elt);
    }

    @objid ("65ad546e-c880-4957-ab68-a0fa1f18538d")
    public static final class MdaTypes {
        @objid ("2358227c-577b-4502-8c2a-334131228364")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a129fa45-de87-446d-a629-fd4598d0de1f")
        public static PropertyDefinition ARTIFACTTEMPLATE_PROPERTY_ELT;

        @objid ("0085abff-eefa-48ad-ae43-fa1dd21dd62b")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("246f4126-7f05-4cd1-8ce6-058427b5c0ec")
        public static PropertyDefinition CAPABILITYTYPE_PROPERTY_ELT;

        @objid ("bbe0f419-9683-4ca0-bb36-89b79a749843")
        public static PropertyDefinition EXTENSIONS_PROPERTY_ELT;

        @objid ("cfca1fbc-6a6a-4c0e-8e62-4aab88c0e390")
        public static PropertyDefinition GROUP_PROPERTY_ELT;

        @objid ("bab624ad-96b6-4ffc-a247-f39ff72e943d")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("e2821271-f74d-45f1-8d7c-11442ff697b3")
        public static PropertyDefinition IMPORT_PROPERTY_ELT;

        @objid ("8420051c-60f7-40fd-ad16-7d52adaa9aa1")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("2d68d311-589b-4098-b496-bc881bf59973")
        public static PropertyDefinition NODETYPE_PROPERTY_ELT;

        @objid ("89a29d5a-10a8-4247-b5e3-00fc420ff5cd")
        public static PropertyDefinition NODETYPEIMPLEMENTATION_PROPERTY_ELT;

        @objid ("5dad9b47-3214-42d8-9fd8-8b8ebacf449a")
        public static PropertyDefinition POLICYTEMPLATE_PROPERTY_ELT;

        @objid ("99e94fee-f804-4047-a66d-d2f7d8b17d40")
        public static PropertyDefinition POLICYTYPE_PROPERTY_ELT;

        @objid ("9bf9099b-43dd-4bfc-a9c2-daf09bef7fcc")
        public static PropertyDefinition RELATIONSHIPTYPE_PROPERTY_ELT;

        @objid ("60fa47aa-922f-4f0d-91e2-9e2af3e53e37")
        public static PropertyDefinition RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY_ELT;

        @objid ("4f183d73-0fb5-4084-a8df-f35348615ed6")
        public static PropertyDefinition REQUIREMENTTYPE_PROPERTY_ELT;

        @objid ("2637a5d2-42a2-4e56-bd24-f117e0f3d59c")
        public static PropertyDefinition SERVICETEMPLATE_PROPERTY_ELT;

        @objid ("1bee452e-b411-463f-b6b0-2531d9dc9cc2")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("3b132880-1eb9-4e22-8ed1-4eca5b5a9570")
        public static PropertyDefinition TYPES_PROPERTY_ELT;

        @objid ("f3eb4983-a18b-4230-a1b4-ceaa6eee8dd1")
        private static Stereotype MDAASSOCDEP;

        @objid ("bdb78877-6f69-42a5-9ab9-69c46fbd5b91")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("86ba36fc-c568-46ab-b70f-16d862204b5c")
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

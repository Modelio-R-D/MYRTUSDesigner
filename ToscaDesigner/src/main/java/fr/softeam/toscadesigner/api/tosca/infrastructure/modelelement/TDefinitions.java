/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
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
    @objid ("c7386d1f-a7d5-4ed8-a59a-ed7f3e521b40")
    public static final String STEREOTYPE_NAME = "TDefinitions";

    @objid ("7eeb415c-dfc7-4f6f-9880-f6abc99ca479")
    public static final String ARTIFACTTEMPLATE_PROPERTY = "artifactTemplate";

    @objid ("e2a2415a-4547-4099-a93b-df1e7e9ab255")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("a57a8f19-4656-418d-b590-e554125c90d5")
    public static final String CAPABILITYTYPE_PROPERTY = "capabilityType";

    @objid ("c0c4746f-86e7-4ae0-9cbc-53b75567f382")
    public static final String EXTENSIONS_PROPERTY = "extensions";

    @objid ("967f9704-bf0f-4fba-b43b-18ccf5d9509f")
    public static final String GROUP_PROPERTY = "group";

    @objid ("c700cf9c-0027-499f-a0bc-0bb0a4fc2008")
    public static final String ID_PROPERTY = "id";

    @objid ("6b681263-47b9-469a-9b59-8f56ad69dbad")
    public static final String IMPORT_PROPERTY = "import";

    @objid ("f24ecdd4-cc86-4b19-98b0-0ec0bf154ad4")
    public static final String NAME_PROPERTY = "name";

    @objid ("fd1feb88-1e92-41c6-a0cd-418467527d83")
    public static final String NODETYPE_PROPERTY = "nodeType";

    @objid ("994d9f37-8526-44a6-af2c-8b9dd90cf84a")
    public static final String NODETYPEIMPLEMENTATION_PROPERTY = "nodeTypeImplementation";

    @objid ("b100d5c0-1911-4362-9e80-c46e300e0080")
    public static final String POLICYTEMPLATE_PROPERTY = "policyTemplate";

    @objid ("0ab1a3ec-d289-4502-925e-c8e179d299ca")
    public static final String POLICYTYPE_PROPERTY = "policyType";

    @objid ("1b7cb984-044d-4924-87b6-432e009c447f")
    public static final String RELATIONSHIPTYPE_PROPERTY = "relationshipType";

    @objid ("0912ed42-c4e5-4fab-a32e-e91c3bd36280")
    public static final String RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY = "relationshipTypeImplementation";

    @objid ("c361e616-8b9f-4683-a662-58fed868a808")
    public static final String REQUIREMENTTYPE_PROPERTY = "requirementType";

    @objid ("5398f06f-8dc3-4440-9690-80a5587d45f7")
    public static final String SERVICETEMPLATE_PROPERTY = "serviceTemplate";

    @objid ("4693e9c1-6c6b-4744-a42e-dc843a348d07")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    @objid ("9de60167-cdca-4cb2-a9c4-0df0b499a140")
    public static final String TYPES_PROPERTY = "types";

    /**
     * Tells whether a {@link TDefinitions proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TDefinitions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("62c9c698-37b6-4745-ae35-90a2d7c79077")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TDefinitions.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TDefinitions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TDefinitions >> then instantiate a {@link TDefinitions} proxy.
     * @return a {@link TDefinitions} proxy on the created {@link ModelElement}.
     */
    @objid ("bb0f5dce-38da-4b12-ab99-72ae8c071cd2")
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
    @objid ("f99e80c4-f933-42d6-b722-cdf1fe2fed14")
    public static TDefinitions instantiate(final ModelElement obj) {
        return TDefinitions.canInstantiate(obj) ? new TDefinitions(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDefinitions} proxy from a {@link ModelElement} stereotyped << TDefinitions >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TDefinitions} proxy.
     */
    @objid ("9b634171-3105-4592-b3e7-7dc75d0befa4")
    public static TDefinitions safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TDefinitions.canInstantiate(obj))
            return new TDefinitions(obj);
        else
            throw new IllegalArgumentException("TDefinitions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("064ffce2-7415-4f39-a9f5-a1fde1221c7c")
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
    @objid ("a435b3da-ff93-43b7-8577-29a971cf43e5")
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
    @objid ("7c797712-91d2-4db9-ac0d-aa3187d187cf")
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
    @objid ("3c3cee04-036f-4f11-a9f9-c78ffe34feb9")
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
    @objid ("cfd5929c-a87d-4ed1-a49f-5301c27d73c1")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TDefinitions.extensions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("155705a4-0d66-4068-a1b9-c2b51a1c2b04")
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
    @objid ("2cb06a6c-e95c-4bce-a19d-10c62660b260")
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
    @objid ("88f4b075-d2cb-469f-8b52-18d1fc12ffca")
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
    @objid ("f17ce8f1-32d5-48a9-a2d7-4d95a77416f9")
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
    @objid ("61a5fee6-542c-4f25-869d-7396ca2a8ca9")
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
    @objid ("1c5eb0ae-2ff3-486c-9276-166cc9f669c9")
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
    @objid ("76c51054-ef07-49b1-81f2-0d1ee4cc1b9c")
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
    @objid ("2e6c1f4a-9a9c-4542-95fc-bba9421a47b3")
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
    @objid ("0476a884-523f-4427-86c2-f1ac1fa5a1e9")
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
    @objid ("84fba41a-3117-4523-8419-de3b9e79b7a3")
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
    @objid ("94c7b7d9-4304-4bbd-bfb7-de585d1e803a")
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
    @objid ("767a8a4c-50bd-4254-a50a-9752d7969a0c")
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
    @objid ("c35fbd9b-8b6c-477a-aeac-af3b81128dd0")
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
    @objid ("19940720-b1b9-402a-8acf-a81bf45d68c8")
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
    @objid ("1070616c-6bbf-4a8e-aef9-0b6c74b98102")
    public String getTypes() {
        String value = this.elt.getProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDefinitions.MdaTypes.TYPES_PROPERTY_ELT, value, this.elt);
    }

    @objid ("883f55a1-405e-4d16-a130-83312c59319c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TDefinitions.artifactTemplate'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6fe44f81-f609-4238-82f7-4e865447c3cd")
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
    @objid ("78aea7f3-6cfe-4b34-8ac7-2ac8432881a3")
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
    @objid ("d61fdb85-5794-40cc-bbc9-9e2a0773362a")
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
    @objid ("add19b49-0eee-46ab-b20f-3bf1f9a9b1f5")
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
    @objid ("33066de6-8756-4d6b-8353-504811685f48")
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
    @objid ("c049b103-ca06-4aea-b519-30ff00bfbb5c")
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
    @objid ("6d863921-067b-4dd1-b78a-c55845db326c")
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
    @objid ("6bc9c34e-0e4a-4c03-aafd-89bdac47a161")
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
    @objid ("554c8ea1-a657-43f0-bec3-8e0a9d365191")
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
    @objid ("b0699876-31b7-4b6c-b9b8-b684d33947af")
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
    @objid ("b39f0e21-2b89-47fe-b8b3-17e0ca5e498c")
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
    @objid ("0282b852-b790-48a1-9115-fca04961c6e6")
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
    @objid ("819c9255-9af1-4f4f-ba0b-2cccc9a2cc67")
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
    @objid ("a230cb4b-c34d-4d5d-b9d8-bd3ab9238925")
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
    @objid ("3cf3c2e5-8457-4d5a-8de1-7fb3ac194583")
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
    @objid ("c1c1d11d-71c6-4a1b-8fd1-d020835c3dcd")
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
    @objid ("20ef6025-5c97-4531-9016-e12d3339937c")
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
    @objid ("ba1a9bfe-eb90-4f73-87eb-8cf2106d1325")
    public void setTypes(final String value) {
        this.elt.setProperty(TDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TDefinitions.MdaTypes.TYPES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDefinitions.MdaTypes.TYPES_PROPERTY_ELT, value));
    }

    @objid ("48fe3616-4482-4b69-aafd-1af9eab27521")
    protected  TDefinitions(final ModelElement elt) {
        super(elt);
    }

    @objid ("65ad546e-c880-4957-ab68-a0fa1f18538d")
    public static final class MdaTypes {
        @objid ("4ff23447-a2ea-4364-be68-9f1dc1bd2dfb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("35e4db70-1f1b-482b-9fd5-97926bc4bba8")
        public static PropertyDefinition ARTIFACTTEMPLATE_PROPERTY_ELT;

        @objid ("2176069c-264e-4e2f-8ac9-9a6479231de1")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("ff8d374d-b90d-4f0f-a889-26eac969da8e")
        public static PropertyDefinition CAPABILITYTYPE_PROPERTY_ELT;

        @objid ("db8c6e99-62f3-4b89-acdf-12b251d5cbf6")
        public static PropertyDefinition EXTENSIONS_PROPERTY_ELT;

        @objid ("ac92a450-f763-4213-bbba-3a3bd154fbdd")
        public static PropertyDefinition GROUP_PROPERTY_ELT;

        @objid ("91202cc6-e70d-4726-a817-1382154db9a5")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("53d57aca-b659-4fcf-8c2f-6919635f8410")
        public static PropertyDefinition IMPORT_PROPERTY_ELT;

        @objid ("6459fc1d-14ea-49af-b3e6-0d5a41ba5892")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("146b3dd4-3b71-4bf5-ba3c-df443a6686b2")
        public static PropertyDefinition NODETYPE_PROPERTY_ELT;

        @objid ("c042566b-a85b-4042-b4ea-05d64742afb9")
        public static PropertyDefinition NODETYPEIMPLEMENTATION_PROPERTY_ELT;

        @objid ("a18a1e82-4d0d-407c-ae2d-a11d8150a2bd")
        public static PropertyDefinition POLICYTEMPLATE_PROPERTY_ELT;

        @objid ("54365d54-8f13-4ffb-b43b-4a3ee508d86a")
        public static PropertyDefinition POLICYTYPE_PROPERTY_ELT;

        @objid ("36046c88-4096-4fb2-a40b-cfc86d531e68")
        public static PropertyDefinition RELATIONSHIPTYPE_PROPERTY_ELT;

        @objid ("4a5e4a01-11fa-4e80-948a-c7eae8b09e56")
        public static PropertyDefinition RELATIONSHIPTYPEIMPLEMENTATION_PROPERTY_ELT;

        @objid ("801391d3-0e57-4cfd-8d0d-7f8cb4accc3f")
        public static PropertyDefinition REQUIREMENTTYPE_PROPERTY_ELT;

        @objid ("c8080594-f209-4e1e-b33e-d7e5d39fea6b")
        public static PropertyDefinition SERVICETEMPLATE_PROPERTY_ELT;

        @objid ("f31d3766-2843-4c83-ace1-5231408550df")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("785211f7-2fa7-48a9-ba73-7a7dcef3d862")
        public static PropertyDefinition TYPES_PROPERTY_ELT;

        @objid ("8d020c4f-aae0-46db-8f80-779708e2bdc0")
        private static Stereotype MDAASSOCDEP;

        @objid ("97c93463-156f-4f48-92f3-34dfdd0bc5bd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f2a5e9c8-36c4-4c85-8d35-e7d8d794ea38")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 06/02/2025 17:32 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TBoundaryDefinitions >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5414c03c-0dff-4b1b-9b8d-2fef79a1a82c")
public class TBoundaryDefinitions implements IMdaProxy {
    @objid ("2b723174-09a7-407a-b4b1-7c16c6261da4")
    public static final String STEREOTYPE_NAME = "TBoundaryDefinitions";

    @objid ("c4e447e6-9d7e-48aa-ad4e-cda67a511cfb")
    public static final String CAPABILITIES_PROPERTY = "capabilities";

    @objid ("bb4356b2-67e8-4d77-a68b-e668b9775ff4")
    public static final String INTERFACES_PROPERTY = "interfaces";

    @objid ("65e1f41a-f766-4467-a9bb-8c9d78e3edab")
    public static final String POLICIES_PROPERTY = "policies";

    @objid ("d2d73adf-a7ea-4f7f-b716-2c559d4acb0b")
    public static final String PROPERTIES_PROPERTY = "properties";

    @objid ("697aefa0-afb4-40fa-aa6c-06526fa329cf")
    public static final String PROPERTYCONSTRAINTS_PROPERTY = "propertyConstraints";

    @objid ("663f50b1-34ab-4c40-afc7-1dcd36ea319b")
    public static final String REQUIREMENTS_PROPERTY = "requirements";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("5206c968-468c-431e-92fd-87dfc14720c8")
    protected final Class elt;

    /**
     * Tells whether a {@link TBoundaryDefinitions proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TBoundaryDefinitions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6c3ca927-35cb-4964-a3a7-e1730b65ec5f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TBoundaryDefinitions >> then instantiate a {@link TBoundaryDefinitions} proxy.
     * @return a {@link TBoundaryDefinitions} proxy on the created {@link Class}.
     */
    @objid ("37b9e404-3e2d-464f-863f-3b5d94beae11")
    public static TBoundaryDefinitions create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT);
        return TBoundaryDefinitions.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TBoundaryDefinitions} proxy from a {@link Class} stereotyped << TBoundaryDefinitions >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TBoundaryDefinitions} proxy or <i>null</i>.
     */
    @objid ("f24a1937-8553-4b55-8e99-aa2c2943a20d")
    public static TBoundaryDefinitions instantiate(final Class obj) {
        return TBoundaryDefinitions.canInstantiate(obj) ? new TBoundaryDefinitions(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TBoundaryDefinitions} proxy from a {@link Class} stereotyped << TBoundaryDefinitions >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TBoundaryDefinitions} proxy.
     */
    @objid ("214b05ab-dbe7-47b9-a6c0-a11aa5e14153")
    public static TBoundaryDefinitions safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TBoundaryDefinitions.canInstantiate(obj))
            return new TBoundaryDefinitions(obj);
        else
            throw new IllegalArgumentException("TBoundaryDefinitions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("520fdea7-f360-42d8-ab16-27450743c68b")
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
        TBoundaryDefinitions other = (TBoundaryDefinitions) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TBoundaryDefinitions.capabilities'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4954060f-2016-47e7-8449-f8ee14e16eb8")
    public String getCapabilities() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.CAPABILITIES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.CAPABILITIES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.CAPABILITIES_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("5951e0de-d5c1-424a-baa5-91b1a2cead35")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TBoundaryDefinitions.interfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fd0ef6be-a74c-41f0-b4ef-31743fe1c2ac")
    public String getInterfaces() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.INTERFACES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.INTERFACES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.INTERFACES_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TBoundaryDefinitions.policies'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("41e8a312-849d-49da-a255-07dc7992169e")
    public String getPolicies() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.POLICIES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.POLICIES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.POLICIES_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TBoundaryDefinitions.properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5aa1805f-5453-47e9-904b-b45c092d6b61")
    public String getProperties() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.PROPERTIES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.PROPERTIES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.PROPERTIES_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TBoundaryDefinitions.propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("76ce6bf1-53a3-4c42-abfd-8612f18bb683")
    public String getPropertyConstraints() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TBoundaryDefinitions.requirements'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5da64b58-ae8a-4d44-b09d-9048f10c45ab")
    public String getRequirements() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT, value, this.elt);
    }

    @objid ("0beafaa7-7ae9-4f78-bea4-5e61487f756b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TBoundaryDefinitions.capabilities'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b5503ee8-f6ab-478e-84b9-5491980d49f6")
    public void setCapabilities(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.CAPABILITIES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.CAPABILITIES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TBoundaryDefinitions.interfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5b446e20-41e5-4241-9d9c-634097a80860")
    public void setInterfaces(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.INTERFACES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.INTERFACES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TBoundaryDefinitions.policies'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f93e9dc5-4ca3-43b1-9bf7-cc3483869f98")
    public void setPolicies(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.POLICIES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.POLICIES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TBoundaryDefinitions.properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d7f1d01b-3cf2-4cbf-8336-a8f1793a20db")
    public void setProperties(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.PROPERTIES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.PROPERTIES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TBoundaryDefinitions.propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dca033af-bd58-491d-8011-008715ddfdab")
    public void setPropertyConstraints(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TBoundaryDefinitions.requirements'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("14ff87f7-8925-48c8-971d-bd1620886307")
    public void setRequirements(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT, value));
    }

    @objid ("c506c5cf-4698-4907-9801-0f1795b1c708")
    protected  TBoundaryDefinitions(final Class elt) {
        this.elt = elt;
    }

    @objid ("0042ee0e-c9fc-4a8e-b46b-59cf29e4ad58")
    public static final class MdaTypes {
        @objid ("b9c7ff57-6ee5-4762-a3b0-6f11ac86edee")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6200671e-06a2-486d-b8d1-6fe2f0349260")
        public static PropertyDefinition CAPABILITIES_PROPERTY_ELT;

        @objid ("33881925-cd5d-4f79-bfb5-e8abf0e1d5b7")
        public static PropertyDefinition POLICIES_PROPERTY_ELT;

        @objid ("0ceb6192-d15a-453d-8933-ebf7495b0b2d")
        public static PropertyDefinition INTERFACES_PROPERTY_ELT;

        @objid ("bd26d57a-a726-40ff-a1dd-89bbf4b1a0ae")
        public static PropertyDefinition PROPERTIES_PROPERTY_ELT;

        @objid ("c3ea6b66-c2c5-4f4e-9352-27c37c8bde8d")
        public static PropertyDefinition PROPERTYCONSTRAINTS_PROPERTY_ELT;

        @objid ("c96d213f-e13f-41a6-942b-fe0a9fe49122")
        public static PropertyDefinition REQUIREMENTS_PROPERTY_ELT;

        @objid ("15136152-49f0-4b3d-bc54-b93a4b0b0ada")
        private static Stereotype MDAASSOCDEP;

        @objid ("1017860a-4405-4db1-9c23-955f3389726f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("259ac296-8c4c-43ef-a756-07903114b77e")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "58396175-2147-4077-9121-3076b97cc177", "TBoundaryDefinitions");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "48885793-d0bf-4944-b444-1d80c670a25e", "capabilities");
            CAPABILITIES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CAPABILITIES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "ad6f4ac3-89ca-497c-b59d-9e8554ca12a1", "policies");
            POLICIES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICIES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "c613d901-91a0-4996-96f5-24114a248220", "interfaces");
            INTERFACES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INTERFACES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "f0f2c9dc-4e96-45c4-834d-c67879943170", "properties");
            PROPERTIES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTIES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "faf5f6a2-8d85-4c7c-81c3-0362464a21e6", "propertyConstraints");
            PROPERTYCONSTRAINTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTYCONSTRAINTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "ae3e6fc3-33b6-483c-9ff4-4eb88ac459fc", "requirements");
            REQUIREMENTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIREMENTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

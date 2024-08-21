/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 11:15 by Modelio Studio.
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
@objid ("a9ba9135-d345-4c85-b475-1ffc33ffea3e")
public class TBoundaryDefinitions implements IMdaProxy {
    @objid ("58cb2539-6b9f-45b1-80f5-1c1192e53b1f")
    public static final String STEREOTYPE_NAME = "TBoundaryDefinitions";

    @objid ("4199aad0-3e4f-468d-9cae-a002ebee1d6a")
    public static final String CAPABILITIES_PROPERTY = "capabilities";

    @objid ("698722f2-3790-40b2-9195-1d56b6bb4d66")
    public static final String INTERFACES_PROPERTY = "interfaces";

    @objid ("02901c4e-e6a8-4a66-aadd-1dc7373183b5")
    public static final String POLICIES_PROPERTY = "policies";

    @objid ("1a3e37f2-a6a1-4b20-ade0-f13548a621e4")
    public static final String PROPERTIES_PROPERTY = "properties";

    @objid ("a9c401d1-8283-4c57-9f13-00bae6df1076")
    public static final String PROPERTYCONSTRAINTS_PROPERTY = "propertyConstraints";

    @objid ("b288144e-9520-41e3-9eb5-49b6d7e4d224")
    public static final String REQUIREMENTS_PROPERTY = "requirements";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("1a8bc364-64e4-40f7-80c1-53edc91e67c0")
    protected final Class elt;

    /**
     * Tells whether a {@link TBoundaryDefinitions proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TBoundaryDefinitions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("18e40b60-a4eb-4de2-b714-1bea78544672")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TBoundaryDefinitions >> then instantiate a {@link TBoundaryDefinitions} proxy.
     * 
     * @return a {@link TBoundaryDefinitions} proxy on the created {@link Class}.
     */
    @objid ("9c6da3e9-e988-4061-9f69-119dcbebb888")
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
    @objid ("77804de5-5b5d-447b-a47c-b2f0a2b5d77a")
    public static TBoundaryDefinitions instantiate(final Class obj) {
        return TBoundaryDefinitions.canInstantiate(obj) ? new TBoundaryDefinitions(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TBoundaryDefinitions} proxy from a {@link Class} stereotyped << TBoundaryDefinitions >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TBoundaryDefinitions} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dea68528-4e9a-470b-82b1-65902a2c23d4")
    public static TBoundaryDefinitions safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TBoundaryDefinitions.canInstantiate(obj))
        	return new TBoundaryDefinitions(obj);
        else
        	throw new IllegalArgumentException("TBoundaryDefinitions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("98d19788-5625-461e-b1bc-d56436aa8da9")
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
    @objid ("7331e2c6-52e7-4980-a433-e1352465699d")
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
    @objid ("de8d073a-8e78-460e-9a7d-c24c50e9ac13")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TBoundaryDefinitions.interfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a71937c7-eff4-4220-b092-f13954b0d18e")
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
    @objid ("2a387a27-6024-4ef2-9205-c15f3fa61ff2")
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
    @objid ("7059d453-5e54-4c9c-9146-5fe7f8681847")
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
    @objid ("b7a995ff-3b8f-4fd3-8321-97c5a09fb7de")
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
    @objid ("82f0baac-33d5-448c-9699-df5f81bb74da")
    public String getRequirements() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("60336688-8768-4c2c-8791-0930907b6c89")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TBoundaryDefinitions.capabilities'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("70c209bc-37e9-40da-ad72-b6c4cc58e7f4")
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
    @objid ("08bedaa6-da88-4999-b80d-d592f0c6510b")
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
    @objid ("1165d542-f4ff-40ed-bef9-c8fe6dfac812")
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
    @objid ("68764e70-ed3c-4e0c-b678-7dfccdb7d8d3")
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
    @objid ("8d4eed6b-e823-4cce-8587-c98f2968568e")
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
    @objid ("79bbe4c6-fee9-460d-80ee-9f631ad08231")
    public void setRequirements(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT, value));
    }

    @objid ("adf42ae2-9162-41d0-b25e-6f243dd779f9")
    protected  TBoundaryDefinitions(final Class elt) {
        this.elt = elt;
    }

    @objid ("ac00e29c-cf99-4b51-982f-f411adb9a6cd")
    public static final class MdaTypes {
        @objid ("ff8636eb-5a51-4645-aa88-b61ee69dd14b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c97df7ae-3418-476c-b703-8c56f7807488")
        public static PropertyDefinition CAPABILITIES_PROPERTY_ELT;

        @objid ("7da418ac-8a91-45eb-a90b-bc45b75f5860")
        public static PropertyDefinition POLICIES_PROPERTY_ELT;

        @objid ("0a695e7d-af90-4888-bcd7-4a8704128b45")
        public static PropertyDefinition INTERFACES_PROPERTY_ELT;

        @objid ("6cd31a4a-3b25-4534-9c70-d0e373794c7d")
        public static PropertyDefinition PROPERTIES_PROPERTY_ELT;

        @objid ("86c816ad-b95a-4716-af03-67f731613d91")
        public static PropertyDefinition PROPERTYCONSTRAINTS_PROPERTY_ELT;

        @objid ("47ae84c9-0cf1-4ee5-8038-463e868ec115")
        public static PropertyDefinition REQUIREMENTS_PROPERTY_ELT;

        @objid ("336c20d7-5d78-46b2-b6f6-cac9e7f64f3a")
        private static Stereotype MDAASSOCDEP;

        @objid ("4eb8c250-21a3-4760-831b-eadc5b11f1d3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("540fab8b-d9e6-4326-8938-e46bf18c6e0c")
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

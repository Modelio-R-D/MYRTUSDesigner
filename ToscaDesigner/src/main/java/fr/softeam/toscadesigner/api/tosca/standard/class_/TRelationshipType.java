/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 12/06/2024 14:58 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.List;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link Class} with << TRelationshipType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6b3faaaa-a779-463f-bd94-54bb8434422e")
public class TRelationshipType extends TEntityType implements IMdaProxy {
    @objid ("8c1054aa-8729-40bd-84df-97bf2223a844")
    public static final String STEREOTYPE_NAME = "TRelationshipType";

    @objid ("5280de45-5f74-461f-9069-fa1052fd9153")
    public static final String INSTANCESTATES_PROPERTY = "instanceStates";

    @objid ("ead95141-6365-4881-b96d-3639d05e0cdb")
    public static final String SOURCEINTERFACES_PROPERTY = "sourceInterfaces";

    @objid ("b6c3fee0-0f12-427b-956c-c8050ba21680")
    public static final String TARGETINTERFACES_PROPERTY = "targetInterfaces";

    @objid ("0596beee-12fb-4de9-b2fc-f1fbb0a7024a")
    public static final String VALIDSOURCE_PROPERTY = "validSource";

    @objid ("344bee47-b0fe-43e2-b86f-3902729a0a0e")
    public static final String VALIDTARGET_PROPERTY = "validTarget";

    /**
     * Tells whether a {@link TRelationshipType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRelationshipType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("66fe8329-6741-47ac-a3de-d8f8bc711eb3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRelationshipType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRelationshipType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRelationshipType >> then instantiate a {@link TRelationshipType} proxy.
     * 
     * @return a {@link TRelationshipType} proxy on the created {@link Class}.
     */
    @objid ("31dc0e9f-1ba7-4dfe-a71c-eeb8af9f0e04")
    public static TRelationshipType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRelationshipType.MdaTypes.STEREOTYPE_ELT);
        return TRelationshipType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRelationshipType} proxy from a {@link Class} stereotyped << TRelationshipType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRelationshipType} proxy or <i>null</i>.
     */
    @objid ("4996d6f6-3252-4ba5-a433-0221339d7f32")
    public static TRelationshipType instantiate(final Class obj) {
        return TRelationshipType.canInstantiate(obj) ? new TRelationshipType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipType} proxy from a {@link Class} stereotyped << TRelationshipType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRelationshipType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5637c4a3-54da-45f5-983e-1afbabd98486")
    public static TRelationshipType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRelationshipType.canInstantiate(obj))
        	return new TRelationshipType(obj);
        else
        	throw new IllegalArgumentException("TRelationshipType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5cea9796-839f-43f7-bf50-ab7eecde4787")
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
        TRelationshipType other = (TRelationshipType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d3da5fa8-89b4-4c4b-87ce-32a007aa0c1d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TRelationshipType.instanceStates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b0c75d65-ec70-4c91-b61f-52a0aabc1c16")
    public String getInstanceStates() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.INSTANCESTATES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.INSTANCESTATES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.INSTANCESTATES_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRelationshipType.sourceInterfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c3297bcf-61e0-42ae-a3e0-d60f4027e34b")
    public String getSourceInterfaces() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.SOURCEINTERFACES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.SOURCEINTERFACES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.SOURCEINTERFACES_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRelationshipType.targetInterfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a171a705-e56f-4f2a-8855-a7add2367fb5")
    public String getTargetInterfaces() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.TARGETINTERFACES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.TARGETINTERFACES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.TARGETINTERFACES_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRelationshipType.validSource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("15349377-df09-408f-9d30-6c8d9c12b5dc")
    public String getValidSource() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRelationshipType.validTarget'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("72200fef-746a-4726-aa63-bf7ba3e456ca")
    public String getValidTarget() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("5c3dec54-6b0d-4707-be1c-115bda817677")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRelationshipType.instanceStates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4fcd6667-0e17-4dda-98b4-07b213abe1b3")
    public void setInstanceStates(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.INSTANCESTATES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.INSTANCESTATES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRelationshipType.sourceInterfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("31e570cb-62ae-4375-8852-f23712e6533b")
    public void setSourceInterfaces(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.SOURCEINTERFACES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.SOURCEINTERFACES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRelationshipType.targetInterfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("142162b5-031b-4b72-99f4-5f851f60891c")
    public void setTargetInterfaces(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.TARGETINTERFACES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.TARGETINTERFACES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRelationshipType.validSource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("52c5ee67-0e4c-44ce-9ccf-f337889dc863")
    public void setValidSource(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRelationshipType.validTarget'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1c604c14-4744-4b94-83da-7cff31436c38")
    public void setValidTarget(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value));
    }

    @objid ("ec3307d2-572d-41e0-b6c0-6c49a6333c3c")
    protected  TRelationshipType(final Class elt) {
        super(elt);
    }

    @objid ("5648dcec-5f2c-4314-8a99-354a7d2f6135")
    public static final class MdaTypes {
        @objid ("ea567eb6-605c-41cd-816b-8f86d948c023")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9b0100b2-ae01-4853-a34b-8a5f10bc88c5")
        public static PropertyDefinition INSTANCESTATES_PROPERTY_ELT;

        @objid ("628ecb84-b3bc-4c65-9b55-d7cf496d11c3")
        public static PropertyDefinition SOURCEINTERFACES_PROPERTY_ELT;

        @objid ("671b1eec-7926-42de-90b6-f30bf5c40ecb")
        public static PropertyDefinition TARGETINTERFACES_PROPERTY_ELT;

        @objid ("488fded0-4724-4da3-bc8e-4dcb60649c12")
        public static PropertyDefinition VALIDSOURCE_PROPERTY_ELT;

        @objid ("c6023ad4-1d91-4b6e-a73b-921d6ffbf7e0")
        public static PropertyDefinition VALIDTARGET_PROPERTY_ELT;

        @objid ("b8a6c830-28c3-42c5-9fcc-a96bfcfa0d2e")
        private static Stereotype MDAASSOCDEP;

        @objid ("94ce6f29-f8dd-4637-9b07-3e899a85658e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("34a6f0db-f54e-4314-b0b4-b82303c94a36")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1b11c098-c9e5-4e5d-beca-3351909bc6ce", "TRelationshipType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "f5bc71d2-5d77-4cfc-95ed-80e669e045f8", "instanceStates");
            INSTANCESTATES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INSTANCESTATES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "2c743775-6130-4f0c-9772-c3381999bee6", "sourceInterfaces");
            SOURCEINTERFACES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (SOURCEINTERFACES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "8a73aa8f-3fde-4179-ab99-10bd09c7d073", "targetInterfaces");
            TARGETINTERFACES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TARGETINTERFACES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "45379b77-5fd9-43cb-b609-d61f124d9ff5", "validSource");
            VALIDSOURCE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALIDSOURCE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "2d6ef097-9a0f-47f3-87aa-5c168780ff23", "validTarget");
            VALIDTARGET_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALIDTARGET_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

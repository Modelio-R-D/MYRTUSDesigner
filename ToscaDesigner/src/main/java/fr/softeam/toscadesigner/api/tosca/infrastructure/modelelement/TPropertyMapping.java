/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << TPropertyMapping >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("18542b9e-b144-45f6-b538-cbdd585c882d")
public class TPropertyMapping implements IMdaProxy {
    @objid ("486a8fb0-139a-4c00-9e8e-d9d5e6dbe1ee")
    public static final String STEREOTYPE_NAME = "TPropertyMapping";

    @objid ("664e1252-d270-4bd4-950b-7b716ff62b4d")
    public static final String SERVICETEMPLATEPROPERTYREF_PROPERTY = "serviceTemplatePropertyRef";

    @objid ("e7e8c2eb-3e43-44d7-b712-4ded8620faed")
    public static final String TARGETOBJECTREF_PROPERTY = "targetObjectRef";

    @objid ("d76539c7-9125-4ee7-a737-9ef2d6055174")
    public static final String TARGETPROPERTYREF_PROPERTY = "targetPropertyRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("7dd7de50-4dae-4d03-a102-cb5b0019fcfe")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPropertyMapping proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyMapping >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0b55eece-e8ff-40cb-81cd-0cf70da5c554")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyMapping.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyMapping.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyMapping >> then instantiate a {@link TPropertyMapping} proxy.
     * @return a {@link TPropertyMapping} proxy on the created {@link ModelElement}.
     */
    @objid ("309146d5-9cae-4db0-91d6-ecd39657238e")
    public static TPropertyMapping create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TPropertyMapping.MdaTypes.STEREOTYPE_ELT);
        return TPropertyMapping.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TPropertyMapping} proxy from a {@link ModelElement} stereotyped << TPropertyMapping >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TPropertyMapping} proxy or <i>null</i>.
     */
    @objid ("eccc9b32-4580-4fa5-abf3-002bf352be42")
    public static TPropertyMapping instantiate(final ModelElement obj) {
        return TPropertyMapping.canInstantiate(obj) ? new TPropertyMapping(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPropertyMapping} proxy from a {@link ModelElement} stereotyped << TPropertyMapping >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TPropertyMapping} proxy.
     */
    @objid ("1bbfab09-e852-4e35-b97c-87613fa4c298")
    public static TPropertyMapping safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyMapping.canInstantiate(obj))
            return new TPropertyMapping(obj);
        else
            throw new IllegalArgumentException("TPropertyMapping: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f4b4e658-b82c-4d0d-9550-817f535e0736")
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
        TPropertyMapping other = (TPropertyMapping) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("f8b782ed-d328-4ebd-a8a1-bb2da490e04a")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPropertyMapping.serviceTemplatePropertyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("341a7750-4192-4d2e-a42d-a214b3f1ff84")
    public String getServiceTemplatePropertyRef() {
        String value = this.elt.getProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyMapping.MdaTypes.SERVICETEMPLATEPROPERTYREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyMapping.MdaTypes.SERVICETEMPLATEPROPERTYREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyMapping.MdaTypes.SERVICETEMPLATEPROPERTYREF_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TPropertyMapping.targetObjectRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("70f5370b-d28c-4872-a605-7db045aec092")
    public String getTargetObjectRef() {
        String value = this.elt.getProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyMapping.MdaTypes.TARGETOBJECTREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyMapping.MdaTypes.TARGETOBJECTREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyMapping.MdaTypes.TARGETOBJECTREF_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TPropertyMapping.targetPropertyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("41553e65-3179-45f2-8e35-628c7f9e7f08")
    public String getTargetPropertyRef() {
        String value = this.elt.getProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT, value, this.elt);
    }

    @objid ("bc820ec2-fc39-4b5e-8884-c62d432ebe12")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TPropertyMapping.serviceTemplatePropertyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f2b7970d-618e-455b-97a5-4fcafb4da6be")
    public void setServiceTemplatePropertyRef(final String value) {
        this.elt.setProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                             TPropertyMapping.MdaTypes.SERVICETEMPLATEPROPERTYREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyMapping.MdaTypes.SERVICETEMPLATEPROPERTYREF_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TPropertyMapping.targetObjectRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d8d43b48-742f-4edd-ab1f-3ef77e19f4a5")
    public void setTargetObjectRef(final String value) {
        this.elt.setProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                             TPropertyMapping.MdaTypes.TARGETOBJECTREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyMapping.MdaTypes.TARGETOBJECTREF_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TPropertyMapping.targetPropertyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8674d7e0-14b1-4f49-84d3-7db0f296f759")
    public void setTargetPropertyRef(final String value) {
        this.elt.setProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                             TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT, value));
    }

    @objid ("894eb603-7ccb-4f1d-9a60-af8f77dbca9a")
    protected  TPropertyMapping(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("e5ce75e1-f7a7-4753-8828-74c47c5c48d1")
    public static final class MdaTypes {
        @objid ("bfb5bce1-a1f5-4c6d-8939-13572010c4f2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a729a125-f84a-4b27-9006-414bd177a8a4")
        public static PropertyDefinition SERVICETEMPLATEPROPERTYREF_PROPERTY_ELT;

        @objid ("a92436ed-6c9b-416e-a23e-657fcf57b203")
        public static PropertyDefinition TARGETOBJECTREF_PROPERTY_ELT;

        @objid ("2ca54e16-69b6-4854-84c4-a4109cb0d75f")
        public static PropertyDefinition TARGETPROPERTYREF_PROPERTY_ELT;

        @objid ("218d166e-1e92-4f9c-842f-a21aec8ea21f")
        private static Stereotype MDAASSOCDEP;

        @objid ("5ddcdd4c-8c8b-4321-b351-5734af51c9be")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("658b013c-53f4-4da8-8cce-08ede32191c8")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "b0f69853-92ba-4a8f-85d9-d3956f9b8b16", "TPropertyMapping");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "bb814e9a-7316-4a1f-aabe-0018d8dabdc1", "serviceTemplatePropertyRef");
            SERVICETEMPLATEPROPERTYREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (SERVICETEMPLATEPROPERTYREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "69243494-2229-47d6-ba07-7bb4d5dd087b", "targetObjectRef");
            TARGETOBJECTREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TARGETOBJECTREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "4435e6ee-07b0-4592-a66d-503aecf89cc8", "targetPropertyRef");
            TARGETPROPERTYREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TARGETPROPERTYREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

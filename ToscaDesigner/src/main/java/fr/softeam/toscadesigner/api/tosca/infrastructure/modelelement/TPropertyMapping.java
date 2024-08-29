/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 17:58 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TPropertyMapping >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("18542b9e-b144-45f6-b538-cbdd585c882d")
public class TPropertyMapping implements IMdaProxy {
    @objid ("7aa4971d-7b3e-4d8c-8329-daa4a3f130a6")
    public static final String STEREOTYPE_NAME = "TPropertyMapping";

    @objid ("ff08d5b9-2239-4290-860a-27df064c1847")
    public static final String SERVICETEMPLATEPROPERTYREF_PROPERTY = "serviceTemplatePropertyRef";

    @objid ("1ccaafaf-c99b-497b-834a-0a03a02f358e")
    public static final String TARGETOBJECTREF_PROPERTY = "targetObjectRef";

    @objid ("72d5fb9a-041e-4373-b992-34601b16a019")
    public static final String TARGETPROPERTYREF_PROPERTY = "targetPropertyRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("fb22f6a5-3435-48b8-8175-2963ebcf0a50")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPropertyMapping proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyMapping >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("550e5300-f432-44cf-90a2-1e4c3acddf05")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyMapping.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyMapping.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyMapping >> then instantiate a {@link TPropertyMapping} proxy.
     * 
     * @return a {@link TPropertyMapping} proxy on the created {@link ModelElement}.
     */
    @objid ("bcde0810-13da-4fc8-8579-32881c7cd3d2")
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
    @objid ("6a6ea2ee-905c-46dc-bc1a-ae73e6f0e6f6")
    public static TPropertyMapping instantiate(final ModelElement obj) {
        return TPropertyMapping.canInstantiate(obj) ? new TPropertyMapping(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPropertyMapping} proxy from a {@link ModelElement} stereotyped << TPropertyMapping >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TPropertyMapping} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e288bd1d-6d45-48cb-b7c9-dabaa4f8892c")
    public static TPropertyMapping safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyMapping.canInstantiate(obj))
        	return new TPropertyMapping(obj);
        else
        	throw new IllegalArgumentException("TPropertyMapping: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aeb4607a-ed32-4bda-95d5-c1670a12cd6d")
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
    @objid ("3be187aa-4500-4c35-8232-ad4a425056ae")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPropertyMapping.serviceTemplatePropertyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ef59c042-863f-4653-a7fb-3e73cd6754f3")
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
    @objid ("76da7651-f591-4c9b-bf81-13dfa60bacf4")
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
    @objid ("768577b8-7c0e-4f07-85b1-7c4a7853f019")
    public String getTargetPropertyRef() {
        String value = this.elt.getProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("f97b2c5d-6d7f-46d5-a805-bda3c18a30cb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TPropertyMapping.serviceTemplatePropertyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bcdbb769-4682-4021-accf-89947c7966fc")
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
    @objid ("8caa9d78-4961-4f36-9121-2eb17e59bb23")
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
    @objid ("ef82117e-0129-476e-a88d-5c3f12a24edf")
    public void setTargetPropertyRef(final String value) {
        this.elt.setProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                             TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT, value));
    }

    @objid ("715b4f9b-6cf5-4086-bbfb-94cf46616242")
    protected  TPropertyMapping(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("e5ce75e1-f7a7-4753-8828-74c47c5c48d1")
    public static final class MdaTypes {
        @objid ("ed5a1f24-7f1a-4383-b4f7-c0fd25d85f54")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4dd82eeb-5e96-478c-a728-be78a14069ea")
        public static PropertyDefinition SERVICETEMPLATEPROPERTYREF_PROPERTY_ELT;

        @objid ("aff4aeb8-a9fa-4bfb-865c-10657927e012")
        public static PropertyDefinition TARGETOBJECTREF_PROPERTY_ELT;

        @objid ("474e687b-4779-4e8a-a7f6-47ba7fbf976d")
        public static PropertyDefinition TARGETPROPERTYREF_PROPERTY_ELT;

        @objid ("c6e2200e-3a41-4057-9a5f-076dd529c962")
        private static Stereotype MDAASSOCDEP;

        @objid ("67e98220-9cd5-43a1-b1bb-5c03c105acb5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("742f9268-854c-431e-bb46-4828276d2f3f")
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

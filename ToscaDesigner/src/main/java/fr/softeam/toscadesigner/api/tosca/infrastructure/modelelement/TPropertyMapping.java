/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/09/2024 10:28 by Modelio Studio.
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
    @objid ("222cfe55-4f3e-4c40-bfbb-9e43d5c50360")
    public static final String STEREOTYPE_NAME = "TPropertyMapping";

    @objid ("d4dbd0cd-5efd-4cd5-8fe2-f2b6fea8a4a7")
    public static final String SERVICETEMPLATEPROPERTYREF_PROPERTY = "serviceTemplatePropertyRef";

    @objid ("9f3cd7a4-ac71-4ffd-9ec4-41244b6cbc3a")
    public static final String TARGETOBJECTREF_PROPERTY = "targetObjectRef";

    @objid ("3bf518e9-ebf9-48c1-a731-09691bdaec35")
    public static final String TARGETPROPERTYREF_PROPERTY = "targetPropertyRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("bca46b0b-7ed4-4a2d-a937-bbf4b556dfb3")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPropertyMapping proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyMapping >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c3bf657f-1122-4bc4-879c-cdef26d3095b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyMapping.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyMapping.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyMapping >> then instantiate a {@link TPropertyMapping} proxy.
     * 
     * @return a {@link TPropertyMapping} proxy on the created {@link ModelElement}.
     */
    @objid ("ae9f16a4-3096-4d3f-9f60-e70f6e2b969b")
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
    @objid ("ef865ffb-e28f-438f-bb05-8e7d82e3f88d")
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
    @objid ("07f97a6c-700d-4055-8b71-fe34dd92d28c")
    public static TPropertyMapping safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyMapping.canInstantiate(obj))
        	return new TPropertyMapping(obj);
        else
        	throw new IllegalArgumentException("TPropertyMapping: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("47ccf485-00d6-4987-af86-42371dde4c2a")
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
    @objid ("d3bc5569-4f77-49e0-b51c-9e9c1d806b46")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPropertyMapping.serviceTemplatePropertyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("18c2392c-85a7-455a-a4ae-c24187d6b035")
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
    @objid ("bede2158-d961-4702-980d-7f9c4555c6e8")
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
    @objid ("f647f7c4-a653-433f-a728-ce0e14698b92")
    public String getTargetPropertyRef() {
        String value = this.elt.getProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("6ef0a6e7-5be0-4fbf-86b0-cd8c985e3bbd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TPropertyMapping.serviceTemplatePropertyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b19db846-b127-44f9-bc29-fd0858af79ed")
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
    @objid ("50a6bdf1-aa74-4ea3-ae81-8360b558ad80")
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
    @objid ("99781140-584d-4610-9ebd-148af788d9db")
    public void setTargetPropertyRef(final String value) {
        this.elt.setProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                             TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT, value));
    }

    @objid ("ca94e62e-aa65-456a-8cfb-9c4b441d82db")
    protected  TPropertyMapping(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("e5ce75e1-f7a7-4753-8828-74c47c5c48d1")
    public static final class MdaTypes {
        @objid ("ab72a03e-824a-43ea-bb9a-68c9cf35c2c8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1086fa80-f24e-47a7-bc1e-4e2d6cdf6f9b")
        public static PropertyDefinition SERVICETEMPLATEPROPERTYREF_PROPERTY_ELT;

        @objid ("7dcd7551-45b6-45a0-a88b-1c91416bcfa0")
        public static PropertyDefinition TARGETOBJECTREF_PROPERTY_ELT;

        @objid ("216d3b94-f8a6-4c74-877d-28ec9ec98c35")
        public static PropertyDefinition TARGETPROPERTYREF_PROPERTY_ELT;

        @objid ("b45ddf8f-a37e-472b-bda1-6cc778c6675f")
        private static Stereotype MDAASSOCDEP;

        @objid ("f70626bf-07c3-4d16-8e72-48b6a18e9cb4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ea0d9560-7006-46c3-bd39-c9a694a612f6")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 11:15 by Modelio Studio.
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
@objid ("b67dfd0c-365b-4317-bc0e-ebaf3b6a06bc")
public class TPropertyMapping implements IMdaProxy {
    @objid ("c1eb8ea8-40c1-4e9a-84da-c9faa610ee2a")
    public static final String STEREOTYPE_NAME = "TPropertyMapping";

    @objid ("9417da39-a791-4aae-b408-e6acc0e9a1d0")
    public static final String SERVICETEMPLATEPROPERTYREF_PROPERTY = "serviceTemplatePropertyRef";

    @objid ("e087b8ca-aad9-4660-94d2-5904b04e45bf")
    public static final String TARGETOBJECTREF_PROPERTY = "targetObjectRef";

    @objid ("91ca2982-263f-4e83-851c-112766a66639")
    public static final String TARGETPROPERTYREF_PROPERTY = "targetPropertyRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("87c21327-bde8-45b7-922f-d22550c41562")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPropertyMapping proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyMapping >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d99456cd-c902-48ef-b2ab-91cbdaeaaf66")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyMapping.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyMapping.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyMapping >> then instantiate a {@link TPropertyMapping} proxy.
     * 
     * @return a {@link TPropertyMapping} proxy on the created {@link ModelElement}.
     */
    @objid ("80b4243b-2086-4393-988d-0dae3bd7ca17")
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
    @objid ("d064899b-a211-4766-9d9e-3d47db7741b5")
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
    @objid ("df5bfdd1-6d95-4aa3-ade4-053e983f47ca")
    public static TPropertyMapping safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyMapping.canInstantiate(obj))
        	return new TPropertyMapping(obj);
        else
        	throw new IllegalArgumentException("TPropertyMapping: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4d241657-4df7-4c1b-9fcb-6b67cf10ef23")
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
    @objid ("f6d2a1ce-9e67-4df5-8eff-e72455cefb20")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPropertyMapping.serviceTemplatePropertyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e2db94fe-23b9-48dd-967c-b969e2b8a560")
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
    @objid ("6d9c0698-7e4c-4df1-9947-7bbc01232b0f")
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
    @objid ("b4ae6d70-5e21-4460-b8d1-1b33f4fd8046")
    public String getTargetPropertyRef() {
        String value = this.elt.getProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("04c95a93-afe5-49a5-a588-a874ac3d07a9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TPropertyMapping.serviceTemplatePropertyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("68135b46-b1fe-4fa3-b7a8-6f195200d86b")
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
    @objid ("c3f45e01-1867-4d81-8b3e-858e06166fb7")
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
    @objid ("289f5931-f1a5-4af0-b2a2-8ea461c26638")
    public void setTargetPropertyRef(final String value) {
        this.elt.setProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                             TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT, value));
    }

    @objid ("6abfd72a-4162-4196-b2d0-df26a6c7c98c")
    protected  TPropertyMapping(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d1939267-56fc-4cca-995f-940d91923042")
    public static final class MdaTypes {
        @objid ("112074be-0266-4592-a30b-8078ef1fce9b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6035e4f6-2442-42ae-9c10-2fa85b052040")
        public static PropertyDefinition SERVICETEMPLATEPROPERTYREF_PROPERTY_ELT;

        @objid ("068e7fa8-5997-4d26-9f2b-8d184c926a1b")
        public static PropertyDefinition TARGETOBJECTREF_PROPERTY_ELT;

        @objid ("1bba026e-1b1f-46b5-92b0-7c2ae9a2d4d5")
        public static PropertyDefinition TARGETPROPERTYREF_PROPERTY_ELT;

        @objid ("77826cd3-4d87-48ae-896a-745afde878d2")
        private static Stereotype MDAASSOCDEP;

        @objid ("7ff1af3f-b7ca-48c6-9c61-97e7c707c470")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("beaf815c-48ea-4af5-a17f-f91d17feda15")
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

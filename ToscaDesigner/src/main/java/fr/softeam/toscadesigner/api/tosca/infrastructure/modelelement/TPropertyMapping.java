/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/08/2024 17:44 by Modelio Studio.
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
    @objid ("61b7baf1-8f91-474e-93bb-671aea7f9033")
    public static final String STEREOTYPE_NAME = "TPropertyMapping";

    @objid ("f79fa9d9-adca-4f5e-8690-07d4f780550a")
    public static final String SERVICETEMPLATEPROPERTYREF_PROPERTY = "serviceTemplatePropertyRef";

    @objid ("acb06154-878c-4493-be40-9a2680477c08")
    public static final String TARGETOBJECTREF_PROPERTY = "targetObjectRef";

    @objid ("446b3679-ff9c-4382-9709-84aa93975023")
    public static final String TARGETPROPERTYREF_PROPERTY = "targetPropertyRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("4b5bbc70-1fe8-40bb-b3dd-7303c85c6217")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPropertyMapping proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyMapping >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ff49bde2-c56c-4c26-9174-ac76a6315ec6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyMapping.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyMapping.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyMapping >> then instantiate a {@link TPropertyMapping} proxy.
     * @return a {@link TPropertyMapping} proxy on the created {@link ModelElement}.
     */
    @objid ("d302dc8c-dca6-4a93-b728-6e941c885fc3")
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
    @objid ("dc7c61f6-ba53-4418-aa11-dda4446800a0")
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
    @objid ("d376b8a2-c353-4337-8eca-5edf152ed5dd")
    public static TPropertyMapping safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyMapping.canInstantiate(obj))
            return new TPropertyMapping(obj);
        else
            throw new IllegalArgumentException("TPropertyMapping: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d7295727-e1d9-447c-a416-4720c62baa30")
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
    @objid ("12dbcd83-8176-476a-ab59-9d2eb0568101")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPropertyMapping.serviceTemplatePropertyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4b5866bd-acd5-4752-bfe1-88f5200f2357")
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
    @objid ("549495ba-a2b6-4682-b879-19396105ad8c")
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
    @objid ("2b7e7d29-474b-49dc-a21b-43090c8d5713")
    public String getTargetPropertyRef() {
        String value = this.elt.getProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT, value, this.elt);
    }

    @objid ("b8a03d49-2590-4fd2-ac87-30628a5104ef")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TPropertyMapping.serviceTemplatePropertyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3ae955cf-2103-4f01-898c-32c715500a1b")
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
    @objid ("1123dc3e-c2ff-473d-9594-d621e3044194")
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
    @objid ("dd92736e-fee0-46a8-86f0-90ecbbcb396d")
    public void setTargetPropertyRef(final String value) {
        this.elt.setProperty(TPropertyMapping.MdaTypes.STEREOTYPE_ELT,
                             TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyMapping.MdaTypes.TARGETPROPERTYREF_PROPERTY_ELT, value));
    }

    @objid ("fa4db419-2101-4896-8dc7-9a4e02e67af6")
    protected  TPropertyMapping(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d1939267-56fc-4cca-995f-940d91923042")
    public static final class MdaTypes {
        @objid ("7212090c-45d3-4868-8824-f50fa46468e5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0f6dd1c4-ea47-4930-aec0-48cb555b1b70")
        public static PropertyDefinition SERVICETEMPLATEPROPERTYREF_PROPERTY_ELT;

        @objid ("21aa302f-ee18-4aa7-b1ca-2d24b5dd1990")
        public static PropertyDefinition TARGETOBJECTREF_PROPERTY_ELT;

        @objid ("6bbed206-d605-4446-af28-7dd570bb3b12")
        public static PropertyDefinition TARGETPROPERTYREF_PROPERTY_ELT;

        @objid ("a0c42bfe-3e85-4a6b-bd68-fb7b80051f00")
        private static Stereotype MDAASSOCDEP;

        @objid ("91ea0f06-d848-499a-a5ed-56e2304a6f80")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("28ccf482-9a86-4e74-8970-9d9420c3b7cc")
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

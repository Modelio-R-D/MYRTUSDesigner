/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 14:48 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << Trigger >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7e938ac4-dea7-4f30-88e4-e568c4057302")
public class Trigger implements IMdaProxy {
    @objid ("618cefe6-ff22-4fe7-b9a0-2b83cc03069f")
    public static final String STEREOTYPE_NAME = "Trigger";

    @objid ("0d25b360-9d95-4637-826d-cc4ae00e9243")
    public static final String ACTION_PROPERTY = "action";

    @objid ("afc764a4-c95f-4e85-aa9a-7bc1541fc9a6")
    public static final String CONDITION_PROPERTY = "condition";

    @objid ("cf499dd3-0175-4f94-bc35-9d9f4909064f")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("4455d7b0-4718-4718-bf4f-01abb6a0060d")
    public static final String EVENT_PROPERTY = "event";

    @objid ("7c89ecfa-42e6-42c9-adf1-c1a1ab76f21c")
    public static final String SCHEDULE_PROPERTY = "schedule";

    @objid ("1a879691-30b3-4bff-9687-50c3c91d2681")
    public static final String TARGET_FILTER_PROPERTY = "target_filter";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("40101512-1ce5-48a2-a9d6-267ae279498f")
    protected final Class elt;

    /**
     * Tells whether a {@link Trigger proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Trigger >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("be4adb29-b387-41aa-a7f2-63970fd48a98")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (Trigger.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(Trigger.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << Trigger >> then instantiate a {@link Trigger} proxy.
     * 
     * @return a {@link Trigger} proxy on the created {@link Class}.
     */
    @objid ("7c1056eb-4996-4a35-9a4f-e9762145cfef")
    public static Trigger create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(Trigger.MdaTypes.STEREOTYPE_ELT);
        return Trigger.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Trigger} proxy from a {@link Class} stereotyped << Trigger >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Trigger} proxy or <i>null</i>.
     */
    @objid ("4c9c1f1f-9ea5-4f46-972c-5d1fe34cf08d")
    public static Trigger instantiate(final Class obj) {
        return Trigger.canInstantiate(obj) ? new Trigger(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Trigger} proxy from a {@link Class} stereotyped << Trigger >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Trigger} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b26bd9d7-362d-4782-ab44-9a5ed11352cf")
    public static Trigger safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Trigger.canInstantiate(obj))
        	return new Trigger(obj);
        else
        	throw new IllegalArgumentException("Trigger: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("68f25ac3-9d24-42e6-979b-016c9b2b467d")
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
        Trigger other = (Trigger) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'Trigger.action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a31e83d1-b550-4af5-977c-ea532b49bf91")
    public String getAction() {
        String value = this.elt.getProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                                            Trigger.MdaTypes.ACTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = Trigger.MdaTypes.ACTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(Trigger.MdaTypes.ACTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'Trigger.condition'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4325d34b-5615-48d6-b75c-823bc3ba620e")
    public String getCondition() {
        String value = this.elt.getProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                                            Trigger.MdaTypes.CONDITION_PROPERTY_ELT.getName());
        if (value == null) {
          value = Trigger.MdaTypes.CONDITION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(Trigger.MdaTypes.CONDITION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'Trigger.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ef60f6b0-649e-4f92-a471-f4a32b1f8823")
    public String getDescription() {
        String value = this.elt.getProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                                            Trigger.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = Trigger.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(Trigger.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ff40e5a4-f9f9-412e-9480-306138c52e5e")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'Trigger.event'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b1d3db85-05d8-4db2-9c1a-6c51b25f7aae")
    public String getEvent() {
        String value = this.elt.getProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                                            Trigger.MdaTypes.EVENT_PROPERTY_ELT.getName());
        if (value == null) {
          value = Trigger.MdaTypes.EVENT_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(Trigger.MdaTypes.EVENT_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'Trigger.schedule'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("14e834e8-e904-4de9-847f-d64caca0f2ef")
    public String getSchedule() {
        String value = this.elt.getProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                                            Trigger.MdaTypes.SCHEDULE_PROPERTY_ELT.getName());
        if (value == null) {
          value = Trigger.MdaTypes.SCHEDULE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(Trigger.MdaTypes.SCHEDULE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'Trigger.target_filter'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("42450a23-4704-4307-bbe7-09b9a8d6606b")
    public String getTarget_filter() {
        String value = this.elt.getProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                                            Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getName());
        if (value == null) {
          value = Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("5aba57c4-94eb-4409-ae8b-7c38c70dea49")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'Trigger.action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d6673fcb-dea1-478a-924e-f5582262c96b")
    public void setAction(final String value) {
        this.elt.setProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                             Trigger.MdaTypes.ACTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(Trigger.MdaTypes.ACTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'Trigger.condition'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("74bd8ccd-6252-4f3c-8b5c-106910d79b3a")
    public void setCondition(final String value) {
        this.elt.setProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                             Trigger.MdaTypes.CONDITION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(Trigger.MdaTypes.CONDITION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'Trigger.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8ff83175-5577-44a9-915d-31ee79ae464b")
    public void setDescription(final String value) {
        this.elt.setProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                             Trigger.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(Trigger.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'Trigger.event'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("85b35863-2a40-4763-b118-d6ab5a9921cc")
    public void setEvent(final String value) {
        this.elt.setProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                             Trigger.MdaTypes.EVENT_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(Trigger.MdaTypes.EVENT_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'Trigger.schedule'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9146eadf-2442-4757-b626-adbdc8548063")
    public void setSchedule(final String value) {
        this.elt.setProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                             Trigger.MdaTypes.SCHEDULE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(Trigger.MdaTypes.SCHEDULE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'Trigger.target_filter'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5c089ef3-ddbb-4ba6-a0b2-6ee21cec6de5")
    public void setTarget_filter(final String value) {
        this.elt.setProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                             Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT, value));
    }

    @objid ("764600f3-e16b-4014-9b7c-6748e656d225")
    protected  Trigger(final Class elt) {
        this.elt = elt;
    }

    @objid ("efc4d027-9be6-4834-8af1-fd2bea507d82")
    public static final class MdaTypes {
        @objid ("02c72fd6-7662-43d7-8fb4-26bb1505c40d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("79f9d798-90d2-4a0f-b03c-65f817c5db3d")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("32f70f19-e78b-4826-841f-05eaefdf5b46")
        public static PropertyDefinition EVENT_PROPERTY_ELT;

        @objid ("9857e9df-3f56-4453-b39f-99a75cd3ae09")
        public static PropertyDefinition SCHEDULE_PROPERTY_ELT;

        @objid ("a9e6e99a-69a9-4fb6-9f44-cedfa4dc759e")
        public static PropertyDefinition TARGET_FILTER_PROPERTY_ELT;

        @objid ("f95089a5-09b3-4ad6-a1e2-9150a79da23e")
        public static PropertyDefinition CONDITION_PROPERTY_ELT;

        @objid ("e2f107a4-2784-4aa0-88bb-e9acfb97bfc7")
        public static PropertyDefinition ACTION_PROPERTY_ELT;

        @objid ("e22bedf9-1bdd-4def-91b8-f25b15cde42c")
        private static Stereotype MDAASSOCDEP;

        @objid ("b792fc5e-df40-4be9-8d8b-096733a99b24")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("496e58fd-d90b-48b6-8530-e33f9de2281e")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "d385b57a-f3ae-45f5-90b4-bfc96c3ea0c3", "Trigger");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "fac4213e-fedc-4b4a-bb7f-58ded7db4daf", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "f9ac630e-402c-476a-9114-1fcda706a805", "event");
            EVENT_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (EVENT_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "55a175de-5780-45b4-9fd8-28f8c398e75c", "schedule");
            SCHEDULE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (SCHEDULE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "95dcbcf5-84f5-40ff-9f03-c137f73d52ab", "target_filter");
            TARGET_FILTER_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TARGET_FILTER_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b1c6b620-7693-44b5-93a6-42b2442efac0", "condition");
            CONDITION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CONDITION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "6efd2a53-9853-45db-88d1-ba94ff7ce87b", "action");
            ACTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ACTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

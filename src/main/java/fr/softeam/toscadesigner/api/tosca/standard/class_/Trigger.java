/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 04/06/2025 20:07 by Modelio Studio.
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
@objid ("e800ae78-803f-42de-872e-c03cbf09a0c5")
public class Trigger implements IMdaProxy {
    @objid ("3e3bfcca-2a66-4a1a-a7a0-4aa2059085f0")
    public static final String STEREOTYPE_NAME = "Trigger";

    @objid ("fed9661f-51a2-4e4d-9df8-948c438a54c2")
    public static final String ACTION_PROPERTY = "action";

    @objid ("76d471be-461f-498e-89bd-482c8c58db1e")
    public static final String CONDITION_PROPERTY = "condition";

    @objid ("c82d3d3a-a98b-4ad4-aefa-1213edc7baf6")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("b599f248-1168-43a6-ae5e-cff5d26d4081")
    public static final String EVENT_PROPERTY = "event";

    @objid ("3412cf94-75d4-4e3f-a063-b5fb0a95515b")
    public static final String SCHEDULE_PROPERTY = "schedule";

    @objid ("d12258ef-8f76-4496-93e3-886a9e22abe1")
    public static final String TARGET_FILTER_PROPERTY = "target_filter";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("1dcd8ab9-c375-4eb6-a6bb-f7c1ff4624c3")
    protected final Class elt;

    /**
     * Tells whether a {@link Trigger proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Trigger >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b8dfaf9a-9c5c-4d31-a2d6-111052f34639")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (Trigger.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(Trigger.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << Trigger >> then instantiate a {@link Trigger} proxy.
     * 
     * @return a {@link Trigger} proxy on the created {@link Class}.
     */
    @objid ("66175cc0-ee73-40e1-a523-eac1dc8dc426")
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
    @objid ("db972ee5-3160-45fd-9f5d-3ef3ce8fce7e")
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
    @objid ("707be58f-e2f3-4230-9fca-099021a2fcad")
    public static Trigger safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Trigger.canInstantiate(obj))
        	return new Trigger(obj);
        else
        	throw new IllegalArgumentException("Trigger: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b6777f54-4ac4-4397-bbe1-cc7cdee7951b")
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
    @objid ("b787b811-6551-4b3f-b7ba-0088e2750953")
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
    @objid ("4e0b735f-96a2-4465-bca7-c25548edb25f")
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
    @objid ("07240184-841e-4704-8e77-71dfc7458826")
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
    @objid ("0f98204b-ec5e-4c14-81c6-a180bc6a71f9")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'Trigger.event'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0ef59637-3b62-48b4-a823-1271ec5dad94")
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
    @objid ("4a431d15-be33-4a66-8e9b-4b1b8c7e46aa")
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
    @objid ("d807ab98-ac55-4532-8780-71f7b9b51364")
    public String getTarget_filter() {
        String value = this.elt.getProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                                            Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getName());
        if (value == null) {
          value = Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("f33e963f-ea6c-4db7-942d-00bbee5fed04")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'Trigger.action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("14832be7-6bcd-4e15-9ca0-9bfbd0038dac")
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
    @objid ("26ce69b9-39d8-43ac-a5f7-0a85fd5e09df")
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
    @objid ("bd51c27e-f5a3-496e-9cb1-0472dccd711a")
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
    @objid ("b34ce564-7811-4882-8e3c-ff8a55a425c1")
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
    @objid ("1b741486-3623-452b-924c-8b2e4268be58")
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
    @objid ("a4ea1fdf-4013-4e6d-9188-2f0298cb24b9")
    public void setTarget_filter(final String value) {
        this.elt.setProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                             Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT, value));
    }

    @objid ("16b37098-581f-44a1-ab4f-3aadf3291f90")
    protected  Trigger(final Class elt) {
        this.elt = elt;
    }

    @objid ("bdf4f8cb-2a7c-4bef-b993-a3fb7690eeb6")
    public static final class MdaTypes {
        @objid ("70f8924e-fd22-4750-af76-e6229df5215b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("035b92ee-a322-48fb-8256-d60fb61fc193")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("23738977-23bf-4343-91c4-01c0d76c1aa6")
        public static PropertyDefinition EVENT_PROPERTY_ELT;

        @objid ("f51c3f9e-1c68-44ec-a526-f92b7472b102")
        public static PropertyDefinition SCHEDULE_PROPERTY_ELT;

        @objid ("3bd6b873-79f9-4f5d-96b7-143790a11473")
        public static PropertyDefinition TARGET_FILTER_PROPERTY_ELT;

        @objid ("6a1cec2f-3e5d-438d-870b-b21c90a2c132")
        public static PropertyDefinition CONDITION_PROPERTY_ELT;

        @objid ("b89b0284-4507-458f-a5c9-18f36ff544b7")
        public static PropertyDefinition ACTION_PROPERTY_ELT;

        @objid ("15d98a76-3e09-43e8-8baf-77c86dccdc7b")
        private static Stereotype MDAASSOCDEP;

        @objid ("c6ead805-86f4-4c03-96a3-1822a1ca5a94")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9738a1c5-4ad8-4938-92bd-b96918905206")
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

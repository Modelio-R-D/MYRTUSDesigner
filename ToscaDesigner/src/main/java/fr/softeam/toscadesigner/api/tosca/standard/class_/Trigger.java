/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
    @objid ("48b24cef-ec80-4186-867e-80f288717b33")
    public static final String STEREOTYPE_NAME = "Trigger";

    @objid ("f53b7ef2-c99e-4931-9fc4-20964bb07e87")
    public static final String ACTION_PROPERTY = "action";

    @objid ("6eff4644-004b-4c9b-b8bc-a651f1ab25a6")
    public static final String CONDITION_PROPERTY = "condition";

    @objid ("15f65285-d5f2-4f0b-bd71-ed204f207659")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("b546e24b-e4e8-459a-b144-21e0be3c75c0")
    public static final String EVENT_PROPERTY = "event";

    @objid ("76ac17d7-6739-4995-8431-91b4de1d1c77")
    public static final String SCHEDULE_PROPERTY = "schedule";

    @objid ("8e601a54-a466-4f30-a483-53ec62f3d694")
    public static final String TARGET_FILTER_PROPERTY = "target_filter";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("36978255-f0ce-4c61-b0c6-c49cc1101c2a")
    protected final Class elt;

    /**
     * Tells whether a {@link Trigger proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Trigger >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("91a17214-1165-498b-b611-5cba64cbd0aa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (Trigger.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(Trigger.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << Trigger >> then instantiate a {@link Trigger} proxy.
     * 
     * @return a {@link Trigger} proxy on the created {@link Class}.
     */
    @objid ("0d3caf59-d475-4ed2-bb49-bfc96aad1a4a")
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
    @objid ("e66fcb87-ae1f-45fc-ab6b-5c0bb9847fcb")
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
    @objid ("2245a1eb-1dbf-42a9-9a00-fe89bbe3671c")
    public static Trigger safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Trigger.canInstantiate(obj))
        	return new Trigger(obj);
        else
        	throw new IllegalArgumentException("Trigger: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b2049555-6b43-4424-a372-4f891de9363b")
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
    @objid ("a265bb22-1567-446d-98ec-158c38638e36")
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
    @objid ("80b962a5-aff8-45f3-8174-79d86a85f0a5")
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
    @objid ("2582bbcb-40ed-45da-abdc-989f979d9d25")
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
    @objid ("29c80308-30d0-44c0-bc6c-bef599a1fa58")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'Trigger.event'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e3747f26-d97b-40ca-b748-da6c6558961a")
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
    @objid ("7ee319ed-5319-42ed-8cd8-9e8d80821ec7")
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
    @objid ("47f1eacb-abb0-421f-b51d-4287f9487c8a")
    public String getTarget_filter() {
        String value = this.elt.getProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                                            Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getName());
        if (value == null) {
          value = Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("24a64818-1f3d-4838-8bd6-d5f4b669d40c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'Trigger.action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("20224897-323f-46fe-b3d6-cf9f1b26346e")
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
    @objid ("bf96df67-2390-4cc0-a1b2-c5570ff3e572")
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
    @objid ("33aba946-0201-4a66-9bd5-94f8b58f4d9e")
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
    @objid ("1c6c066c-a667-4f54-b4a3-b82a734ed09e")
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
    @objid ("8a96d3bc-c654-46d0-a482-a475b5c9f456")
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
    @objid ("5f3edc5e-def5-4bc6-9f05-daa9dd728180")
    public void setTarget_filter(final String value) {
        this.elt.setProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                             Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT, value));
    }

    @objid ("68a61ced-4b53-492f-a7f9-d218f069987d")
    protected  Trigger(final Class elt) {
        this.elt = elt;
    }

    @objid ("efc4d027-9be6-4834-8af1-fd2bea507d82")
    public static final class MdaTypes {
        @objid ("4e7ab637-c443-4aa6-9d63-29dfc0958ca2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6621b5cb-0702-4ecd-9ee1-c66711155976")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("68d6cbaa-0366-4bb8-9ec3-364ba3bc5c46")
        public static PropertyDefinition EVENT_PROPERTY_ELT;

        @objid ("da94a2c6-b1b4-4f78-a373-0ad091aba26e")
        public static PropertyDefinition SCHEDULE_PROPERTY_ELT;

        @objid ("02645a2e-21f7-42a5-997c-7989a2d3a5a3")
        public static PropertyDefinition TARGET_FILTER_PROPERTY_ELT;

        @objid ("8deff58f-120c-4f44-9a03-bfe6def7890e")
        public static PropertyDefinition CONDITION_PROPERTY_ELT;

        @objid ("64e943ed-fb78-49f1-9c40-c73a987e6d12")
        public static PropertyDefinition ACTION_PROPERTY_ELT;

        @objid ("760d1c7d-4cf8-4bef-8fa0-b0454493c578")
        private static Stereotype MDAASSOCDEP;

        @objid ("13633f43-8579-41ff-913c-932638d52453")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("28f93f6c-d5a4-44c0-94cb-c5307b4e3852")
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

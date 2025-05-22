/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
    @objid ("5e0de545-ecbc-41de-b1dc-fd60b9a4708d")
    public static final String STEREOTYPE_NAME = "Trigger";

    @objid ("c81145fa-135b-470c-b6db-f84abb287644")
    public static final String ACTION_PROPERTY = "action";

    @objid ("67b0bae1-cbb7-43f0-88a4-28b45d601e52")
    public static final String CONDITION_PROPERTY = "condition";

    @objid ("47e68ca0-663c-4fc7-a755-00e3ddd2514c")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("3e7b6af1-82c0-4819-a645-b07d2b16ee0b")
    public static final String EVENT_PROPERTY = "event";

    @objid ("fa3f23ec-dc70-4ed9-9684-ce724428811f")
    public static final String SCHEDULE_PROPERTY = "schedule";

    @objid ("0eee7028-12c2-4f17-99c6-36dfd4f678fa")
    public static final String TARGET_FILTER_PROPERTY = "target_filter";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("47919b75-e0e8-4629-8508-69740e7c40b1")
    protected final Class elt;

    /**
     * Tells whether a {@link Trigger proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Trigger >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("31ca6495-66f1-4f4f-8ad0-e54e93b3df23")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (Trigger.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(Trigger.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << Trigger >> then instantiate a {@link Trigger} proxy.
     * @return a {@link Trigger} proxy on the created {@link Class}.
     */
    @objid ("f8b9482e-24ca-4987-8af4-1e0a1e40ff62")
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
    @objid ("fb7d6a3d-044b-425e-a61b-592cce871519")
    public static Trigger instantiate(final Class obj) {
        return Trigger.canInstantiate(obj) ? new Trigger(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Trigger} proxy from a {@link Class} stereotyped << Trigger >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Trigger} proxy.
     */
    @objid ("e7b9327d-9cb0-41cc-b804-feec2ab88ff8")
    public static Trigger safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Trigger.canInstantiate(obj))
            return new Trigger(obj);
        else
            throw new IllegalArgumentException("Trigger: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4a75e09b-d527-445f-9af3-1c1425ff8a8a")
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
    @objid ("69dd8f63-9380-4698-aa17-88fd8b1a3c0b")
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
    @objid ("a38ee22b-8bd3-4136-87d3-638f6250218d")
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
    @objid ("d670bc20-af0c-498d-a9ff-2febb2c9d839")
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
    @objid ("649539d6-4e90-44e5-9dee-f2982808f8b9")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'Trigger.event'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("16205e0e-b61f-4a1f-b530-6a29c2abaea0")
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
    @objid ("11666ced-a0f1-42c8-88ef-2171062f82a4")
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
    @objid ("8e754ef5-d0d6-4af0-9273-c4b3aba8d217")
    public String getTarget_filter() {
        String value = this.elt.getProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                                            Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getName());
        if (value == null) {
          value = Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT, value, this.elt);
    }

    @objid ("0dcc8c75-3baf-4ac7-a578-1db73abc34d0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'Trigger.action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("22c5b226-1650-4be1-8e71-83474da6ae35")
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
    @objid ("7ed804a8-76a6-403b-80ac-14cae585848d")
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
    @objid ("671aaa68-7428-46c3-aa7d-b925fdead529")
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
    @objid ("822b6caa-b53a-4c93-94cb-9608425464de")
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
    @objid ("f6763ac8-05be-4dbd-ad9b-e9342ec50b88")
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
    @objid ("bf20e388-8746-49e5-a3b4-1e74852a22ca")
    public void setTarget_filter(final String value) {
        this.elt.setProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                             Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT, value));
    }

    @objid ("56486e68-007c-44eb-8752-19bdc569e57d")
    protected  Trigger(final Class elt) {
        this.elt = elt;
    }

    @objid ("efc4d027-9be6-4834-8af1-fd2bea507d82")
    public static final class MdaTypes {
        @objid ("dbee85ea-d975-4ee9-9cae-034c42d1a54c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1b3c7565-0a6d-4e58-922d-6a58b32b0629")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("6a355251-8ea0-40fa-a465-5b0f49e8df86")
        public static PropertyDefinition EVENT_PROPERTY_ELT;

        @objid ("0b40a5e3-1a70-40eb-add8-cb6c9879eb71")
        public static PropertyDefinition SCHEDULE_PROPERTY_ELT;

        @objid ("6c5b46c8-9aa3-46dd-98da-196cd98093ec")
        public static PropertyDefinition TARGET_FILTER_PROPERTY_ELT;

        @objid ("be7fc47a-45c7-4065-9528-188636f31a96")
        public static PropertyDefinition CONDITION_PROPERTY_ELT;

        @objid ("0734ce7f-1ca6-4797-8f48-2b13ae711413")
        public static PropertyDefinition ACTION_PROPERTY_ELT;

        @objid ("13408ea5-199f-49cb-9868-1c5b71a18427")
        private static Stereotype MDAASSOCDEP;

        @objid ("acb21351-4c03-41f3-a7cd-528267b431df")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1007317d-a905-40fb-bf8f-fcf5dec146bb")
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

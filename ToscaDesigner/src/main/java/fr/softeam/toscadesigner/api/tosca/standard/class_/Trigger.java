/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 18:02 by Modelio Studio.
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
    @objid ("35f76d91-a053-449a-82a7-17164fdfb906")
    public static final String STEREOTYPE_NAME = "Trigger";

    @objid ("f37c6993-45cb-4d0d-b8a5-7c35f7cf1222")
    public static final String ACTION_PROPERTY = "action";

    @objid ("43406710-82cb-497b-9d40-d9315ec78992")
    public static final String CONDITION_PROPERTY = "condition";

    @objid ("27fde26a-a2ea-4e4a-b7d2-438960298d7c")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("0cd2b0da-9a62-4fcb-b826-423a524f70d7")
    public static final String EVENT_PROPERTY = "event";

    @objid ("7989d390-c31d-42fe-808f-93d68dc99df8")
    public static final String SCHEDULE_PROPERTY = "schedule";

    @objid ("33b5f558-cfab-4b2c-8af3-1118822c0285")
    public static final String TARGET_FILTER_PROPERTY = "target_filter";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("8808f7be-4c7a-400f-8bc8-a156dcfb17c3")
    protected final Class elt;

    /**
     * Tells whether a {@link Trigger proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Trigger >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("717675eb-a3fa-41dc-8d19-03c579980d88")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (Trigger.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(Trigger.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << Trigger >> then instantiate a {@link Trigger} proxy.
     * 
     * @return a {@link Trigger} proxy on the created {@link Class}.
     */
    @objid ("3af7b7d0-ff50-4798-b296-e187f6caf729")
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
    @objid ("181850a7-09b0-4f5e-8956-ca0fdbf430b5")
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
    @objid ("338f79c2-64a2-4e4c-a34c-878603394176")
    public static Trigger safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Trigger.canInstantiate(obj))
        	return new Trigger(obj);
        else
        	throw new IllegalArgumentException("Trigger: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("338729ef-bacd-4960-8e70-17f479df3b7f")
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
    @objid ("c7dfaf86-b600-4502-b36b-db7a583ad5d8")
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
    @objid ("1bcc2926-a901-4e9c-be0d-ec6c9cafec6c")
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
    @objid ("783c7089-b0f2-4514-9a9c-5dbf9766c741")
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
    @objid ("f615f077-11bb-4820-adb0-e9635d85f00c")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'Trigger.event'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6ff2c8b6-ed63-4b86-b555-48d86b9b6242")
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
    @objid ("9412d764-5a12-4622-9951-f428ca1df1c6")
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
    @objid ("355dfadb-f755-4fc9-9923-44fcff801d82")
    public String getTarget_filter() {
        String value = this.elt.getProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                                            Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getName());
        if (value == null) {
          value = Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("858615cb-83ed-42b9-8d51-f8614002a174")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'Trigger.action'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("99379fef-8125-47e0-8337-f45f8ed44be5")
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
    @objid ("5b234c1f-a0fc-4d9d-a29f-42df6cd28892")
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
    @objid ("3e66d1ac-9f01-4d6e-87de-7fffe50303a1")
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
    @objid ("cb4acb04-5bf8-461f-a4c0-c697ca0a1283")
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
    @objid ("ee1a4549-64e3-43fe-9003-a9c3917fa7ac")
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
    @objid ("d64e9a43-aea7-4df2-a49b-f008688114b7")
    public void setTarget_filter(final String value) {
        this.elt.setProperty(Trigger.MdaTypes.STEREOTYPE_ELT,
                             Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(Trigger.MdaTypes.TARGET_FILTER_PROPERTY_ELT, value));
    }

    @objid ("588d9634-6bb3-4e81-b01b-8f5e4e1d121d")
    protected  Trigger(final Class elt) {
        this.elt = elt;
    }

    @objid ("efc4d027-9be6-4834-8af1-fd2bea507d82")
    public static final class MdaTypes {
        @objid ("4b32443b-f41e-4fac-8666-5b001bdd4f9b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f64e1dc5-b1a2-4b23-88fc-7057ae3eb1bd")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("5d7b444c-5465-4301-a59f-25971267134e")
        public static PropertyDefinition EVENT_PROPERTY_ELT;

        @objid ("d6c1c32b-408e-4a8b-ab10-055e1b5eb103")
        public static PropertyDefinition SCHEDULE_PROPERTY_ELT;

        @objid ("e5907d33-8af1-4ed3-b4b7-a2689f6fd7bc")
        public static PropertyDefinition TARGET_FILTER_PROPERTY_ELT;

        @objid ("0ca7a117-b5e4-4a9c-a892-a46af7ffa7cc")
        public static PropertyDefinition CONDITION_PROPERTY_ELT;

        @objid ("d47d4d59-8bd8-42ed-8d7d-2492a7456669")
        public static PropertyDefinition ACTION_PROPERTY_ELT;

        @objid ("a6ec55db-5857-47da-b925-2eec6a9713ca")
        private static Stereotype MDAASSOCDEP;

        @objid ("c0465a01-34b7-4f27-8587-ed50340cf0eb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5a1ba114-5637-4c81-8e5d-c2113fb51470")
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

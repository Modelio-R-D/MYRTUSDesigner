/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << InstanceStateType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4d7a5381-f890-4582-a1ee-eff4058f9333")
public class InstanceStateType implements IMdaProxy {
    @objid ("79a12745-169d-4075-864f-d7854bc6fe59")
    public static final String STEREOTYPE_NAME = "InstanceStateType";

    @objid ("3b9490b4-76e2-4955-98c3-e69d431ae544")
    public static final String STATE_TAGTYPE = "state";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("e8860b90-f279-4115-9818-030fe01b2eec")
    protected final Class elt;

    /**
     * Tells whether a {@link InstanceStateType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InstanceStateType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0c0c9f95-cf8f-4139-8246-3874627c2b88")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InstanceStateType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InstanceStateType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InstanceStateType >> then instantiate a {@link InstanceStateType} proxy.
     * 
     * @return a {@link InstanceStateType} proxy on the created {@link Class}.
     */
    @objid ("2933b38b-bd4a-4215-801c-9f92e70248b4")
    public static InstanceStateType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(InstanceStateType.MdaTypes.STEREOTYPE_ELT);
        return InstanceStateType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link InstanceStateType} proxy from a {@link Class} stereotyped << InstanceStateType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link InstanceStateType} proxy or <i>null</i>.
     */
    @objid ("ae15046d-a5d8-4310-aaeb-25188ed397bc")
    public static InstanceStateType instantiate(final Class obj) {
        return InstanceStateType.canInstantiate(obj) ? new InstanceStateType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InstanceStateType} proxy from a {@link Class} stereotyped << InstanceStateType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link InstanceStateType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5c45cd2a-ece2-4950-9372-8d92d5d3b9a9")
    public static InstanceStateType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InstanceStateType.canInstantiate(obj))
        	return new InstanceStateType(obj);
        else
        	throw new IllegalArgumentException("InstanceStateType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a09b2879-9133-45f6-b87b-0ceead0555f3")
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
        InstanceStateType other = (InstanceStateType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("c19e2e5f-a192-4733-a420-1d42906ca947")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("000fe3f9-62c5-4560-87c2-e8bdd0d1051c")
    public String getState() {
        return this.elt.getTagValue(InstanceStateType.MdaTypes.STATE_TAGTYPE_ELT);
    }

    @objid ("e2962bd8-fcad-4e9a-b36e-545df9b69e46")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'state'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9c699878-3060-465d-8986-9d3ccbfea87d")
    public void setState(final String value) {
        this.elt.putTagValue(InstanceStateType.MdaTypes.STATE_TAGTYPE_ELT, value);
    }

    @objid ("b4609da0-3732-4c6e-9001-0122dd861f79")
    protected  InstanceStateType(final Class elt) {
        this.elt = elt;
    }

    @objid ("01db84a6-ec85-44d1-9bc6-7ea58d33f723")
    public static final class MdaTypes {
        @objid ("acd75cfa-976d-4150-824e-cb1dff766234")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("89874ab5-f476-4b84-9e38-b7e19b7bb0da")
        public static TagType STATE_TAGTYPE_ELT;

        @objid ("5af15eb6-23d8-4beb-8188-6d0068523638")
        private static Stereotype MDAASSOCDEP;

        @objid ("f468212e-eb49-4467-8e82-016d1504dd9c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a9b6f21c-a9e8-4e51-9316-52a56e848cc2")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "17542f25-7d53-4414-ad44-cda8dcefd24c", "InstanceStateType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "3b1a149f-4f8f-4b4f-9e19-9b01218d74ba", "state");
            STATE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (STATE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

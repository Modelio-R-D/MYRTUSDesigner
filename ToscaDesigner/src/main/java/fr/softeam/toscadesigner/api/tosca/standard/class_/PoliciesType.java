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
 * Proxy class to handle a {@link Class} with << PoliciesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f004ba23-ab57-4eb0-aca6-372d741428a7")
public class PoliciesType implements IMdaProxy {
    @objid ("0150d621-c4bb-4aec-9733-ade330a5a5d3")
    public static final String STEREOTYPE_NAME = "PoliciesType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("b72395a0-ca34-429f-a016-e0422aeb6907")
    protected final Class elt;

    /**
     * Tells whether a {@link PoliciesType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PoliciesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dd2d988a-dc21-45be-bf2b-31fccadb446c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (PoliciesType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(PoliciesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << PoliciesType >> then instantiate a {@link PoliciesType} proxy.
     * 
     * @return a {@link PoliciesType} proxy on the created {@link Class}.
     */
    @objid ("428ab7c8-54ea-4da2-abe6-eb0f9d6a14c0")
    public static PoliciesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(PoliciesType.MdaTypes.STEREOTYPE_ELT);
        return PoliciesType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PoliciesType} proxy from a {@link Class} stereotyped << PoliciesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link PoliciesType} proxy or <i>null</i>.
     */
    @objid ("cf3defae-f9ee-4a80-861b-c1e980fb8880")
    public static PoliciesType instantiate(final Class obj) {
        return PoliciesType.canInstantiate(obj) ? new PoliciesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PoliciesType} proxy from a {@link Class} stereotyped << PoliciesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link PoliciesType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("56101e7c-a209-4f07-b430-9d99d27b23f7")
    public static PoliciesType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PoliciesType.canInstantiate(obj))
        	return new PoliciesType(obj);
        else
        	throw new IllegalArgumentException("PoliciesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1eae8641-edad-4964-a0c7-12737c214a80")
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
        PoliciesType other = (PoliciesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ff1f651c-124c-4fee-bc5c-236c14a1ece5")
    public Class getElement() {
        return this.elt;
    }

    @objid ("9d392e47-6b9b-4cdb-83e8-6ae723b78292")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("dfbe37f4-1bf2-4c49-9ca0-731899dd01a8")
    protected  PoliciesType(final Class elt) {
        this.elt = elt;
    }

    @objid ("9b5b457c-6f77-426d-b394-87b1e1869628")
    public static final class MdaTypes {
        @objid ("850f467e-0c69-417e-9a0b-b90f6980ea0f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("09376e0b-26ba-49e2-8c35-e10d1dca8fc1")
        private static Stereotype MDAASSOCDEP;

        @objid ("3f25cbcf-685a-414c-9705-e5f1726849cc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("af503ae9-7057-476f-bc42-f9bbefa60fd3")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "d4897b52-a366-4cb7-9760-2e3571815c1f", "PoliciesType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
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

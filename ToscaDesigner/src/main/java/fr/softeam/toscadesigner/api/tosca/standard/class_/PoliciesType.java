/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 12/06/2024 14:58 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.List;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link Class} with << PoliciesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e99bf1e5-d645-4cb9-8a23-449042d5c0a9")
public class PoliciesType implements IMdaProxy {
    @objid ("3cc920d2-c016-424e-bd9c-d8f8ea572d6e")
    public static final String STEREOTYPE_NAME = "PoliciesType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("0831c2d0-b366-4599-a15c-cb84896b355c")
    protected final Class elt;

    /**
     * Tells whether a {@link PoliciesType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PoliciesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ee2e0933-3f5c-4799-946b-69c53499b5e3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (PoliciesType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(PoliciesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << PoliciesType >> then instantiate a {@link PoliciesType} proxy.
     * 
     * @return a {@link PoliciesType} proxy on the created {@link Class}.
     */
    @objid ("b266ddc9-7639-4078-8313-9562c817975e")
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
    @objid ("0b0e3ac2-fa2a-4012-9f0a-7c6fddf6155f")
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
    @objid ("c8b9b817-1dd5-4c5e-884a-49b049c4115f")
    public static PoliciesType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PoliciesType.canInstantiate(obj))
        	return new PoliciesType(obj);
        else
        	throw new IllegalArgumentException("PoliciesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c0b1cd39-68d2-4c1e-9e31-3c3be07e4090")
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
    @objid ("a3e35f43-90f0-441f-8cd9-63c5b4939446")
    public Class getElement() {
        return this.elt;
    }

    @objid ("503c750e-4f7d-434a-8c39-2b0dcfd799dd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("9ad691a4-e857-4c06-8e3b-e6bd9ee1dc27")
    protected  PoliciesType(final Class elt) {
        this.elt = elt;
    }

    @objid ("3d02256f-9e60-4abb-a38b-34b82c7390f3")
    public static final class MdaTypes {
        @objid ("b329a283-97c0-4e64-8c55-3ddb33f1a0f5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4237b76a-cd5f-4ccf-91f8-b00b56045e75")
        private static Stereotype MDAASSOCDEP;

        @objid ("a07a3201-4553-4c5e-9f88-83ede499bde0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7ebfe938-db82-417f-a909-eaf6bd1098e6")
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

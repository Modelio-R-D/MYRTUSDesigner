/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TCapability >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("15113e6b-a9fd-4a01-b397-5ba429ab33af")
public class TCapability implements IMdaProxy {
    @objid ("208ccf8e-2a71-403e-a170-1fc0de60cc17")
    public static final String STEREOTYPE_NAME = "TCapability";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("7bebac09-d63b-4888-9add-734f1354a629")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapability proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapability >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("70f67680-2389-40e7-ae2e-99f4350fddc3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapability.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapability.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapability >> then instantiate a {@link TCapability} proxy.
     * @return a {@link TCapability} proxy on the created {@link Class}.
     */
    @objid ("a3bf7f26-d95b-4872-8caf-d3e0fbb93526")
    public static TCapability create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TCapability.MdaTypes.STEREOTYPE_ELT);
        return TCapability.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TCapability} proxy from a {@link Class} stereotyped << TCapability >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TCapability} proxy or <i>null</i>.
     */
    @objid ("d8fdfa21-5892-4b7b-805d-5113fcaec53a")
    public static TCapability instantiate(final Class obj) {
        return TCapability.canInstantiate(obj) ? new TCapability(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapability} proxy from a {@link Class} stereotyped << TCapability >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapability} proxy.
     */
    @objid ("d027c325-7670-4cbc-8f3e-5550ea5f065c")
    public static TCapability safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapability.canInstantiate(obj))
            return new TCapability(obj);
        else
            throw new IllegalArgumentException("TCapability: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a395c796-59fc-48b9-9100-87a0a32da62b")
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
        TCapability other = (TCapability) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1b79191b-e21a-4e24-a426-0dba240daf3c")
    public Class getElement() {
        return this.elt;
    }

    @objid ("4cb498fd-5f59-43b2-9d69-a063e21198db")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2f25f00c-7915-492d-872e-e6eb01e8c23c")
    protected  TCapability(final Class elt) {
        this.elt = elt;
    }

    @objid ("a279b09b-43e2-425b-8f16-f2590abd5a47")
    public static final class MdaTypes {
        @objid ("c8657945-fb5f-4982-8c05-05313b3195fd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("01aac746-8110-49c6-9f08-8dd9b7909509")
        private static Stereotype MDAASSOCDEP;

        @objid ("aa0caca3-a50b-4896-abca-16966dc737db")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("51d1f337-24e6-4cff-91b8-caf3ea688b90")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "92831533-b614-4124-8961-3cd7ebcad536", "TCapability");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 20/03/2024 15:20 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TExtensibleElements >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0a9b1304-5d1e-4519-a764-0bb4af8f8b78")
public class TExtensibleElements implements IMdaProxy {
    @objid ("33b92b58-6dd2-4f59-94f8-798bb540a97e")
    public static final String STEREOTYPE_NAME = "TExtensibleElements";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("a1cb9c81-b709-46df-bb80-7ea384fcc411")
    protected final Class elt;

    /**
     * Tells whether a {@link TExtensibleElements proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TExtensibleElements >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("205d6ccc-7f27-4455-9e73-9bcea01036ba")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TExtensibleElements.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TExtensibleElements.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TExtensibleElements >> then instantiate a {@link TExtensibleElements} proxy.
     * @return a {@link TExtensibleElements} proxy on the created {@link Class}.
     */
    @objid ("c52be0a1-2331-4721-9445-ed86603b3fd3")
    public static TExtensibleElements create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TExtensibleElements.MdaTypes.STEREOTYPE_ELT);
        return TExtensibleElements.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TExtensibleElements} proxy from a {@link Class} stereotyped << TExtensibleElements >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TExtensibleElements} proxy or <i>null</i>.
     */
    @objid ("5a34797f-3719-48f2-9b7a-82a1cc8f7eca")
    public static TExtensibleElements instantiate(final Class obj) {
        return TExtensibleElements.canInstantiate(obj) ? new TExtensibleElements(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExtensibleElements} proxy from a {@link Class} stereotyped << TExtensibleElements >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TExtensibleElements} proxy.
     */
    @objid ("1789cdc1-cd72-41b6-ac3a-c141c2e684fd")
    public static TExtensibleElements safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TExtensibleElements.canInstantiate(obj))
            return new TExtensibleElements(obj);
        else
            throw new IllegalArgumentException("TExtensibleElements: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a8fbeb45-c3f9-4670-bb69-6934559f6ccf")
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
        TExtensibleElements other = (TExtensibleElements) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("95e5859c-3c08-4c8e-93cb-e9340d4f13a2")
    public Class getElement() {
        return this.elt;
    }

    @objid ("b9a06f44-1902-4144-8b6f-24640a0a4d40")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5998355c-8c9d-4215-ad4e-d1770a4163ca")
    protected  TExtensibleElements(final Class elt) {
        this.elt = elt;
    }

    @objid ("ed889216-d6a3-45ec-8bd6-fafa99aa9da8")
    public static final class MdaTypes {
        @objid ("8f7f3fc8-bd70-42d7-b89a-cf8d0fbfb0f2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f186e6f6-664a-46f2-a72e-9c15d7b3e73b")
        private static Stereotype MDAASSOCDEP;

        @objid ("1dd6b771-6e27-4c4b-b9ae-fa2e7efb98fe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2d51d34f-3955-43cb-82ff-afbe714d89d1")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "e0b7e96b-63d9-4cee-adef-064c9c5f1ba0", "TExtensibleElements");
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

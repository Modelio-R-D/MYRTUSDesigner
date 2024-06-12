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
 * Proxy class to handle a {@link Class} with << TCapability >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("269f61bb-60fa-4ebd-ad56-9a9ac222f13c")
public class TCapability implements IMdaProxy {
    @objid ("80aa654e-eff5-46a6-8cf2-87f4232bbb50")
    public static final String STEREOTYPE_NAME = "TCapability";

    @objid ("e0e61406-f768-4012-a929-c8242130b25c")
    public static final String NAME_TAGTYPE = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("1ff2b446-b99c-4c41-a1ee-21a237d6e95b")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapability proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapability >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("16e90f0e-05d5-4313-8294-04bc2475ee6d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapability.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapability.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapability >> then instantiate a {@link TCapability} proxy.
     * 
     * @return a {@link TCapability} proxy on the created {@link Class}.
     */
    @objid ("6abe41cd-be6c-43ec-a8a4-25fdaf91ba58")
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
    @objid ("eded7b89-60e3-4655-b010-41399b89f922")
    public static TCapability instantiate(final Class obj) {
        return TCapability.canInstantiate(obj) ? new TCapability(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapability} proxy from a {@link Class} stereotyped << TCapability >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapability} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1c7d41f1-9af1-4301-94b1-53a6c5e6f5fa")
    public static TCapability safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapability.canInstantiate(obj))
        	return new TCapability(obj);
        else
        	throw new IllegalArgumentException("TCapability: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c3a9b6fb-4991-40ba-891b-9b47a37c8a9b")
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
    @objid ("e7253319-731f-4e11-aaaa-1faf7f10c3d2")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f0daaedd-0c74-4dc0-ae1f-c29541bce081")
    public String getName() {
        return this.elt.getTagValue(TCapability.MdaTypes.NAME_TAGTYPE_ELT);
    }

    @objid ("313659bd-d5d9-4048-8d1d-161da75bf8bd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a1347009-121b-4c5e-b09e-2b5bd5c81547")
    public void setName(final String value) {
        this.elt.putTagValue(TCapability.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    @objid ("bd2c559d-0170-4083-a8d1-e64d8e4876c2")
    protected  TCapability(final Class elt) {
        this.elt = elt;
    }

    @objid ("3c779036-bf23-4772-b290-52f0da936260")
    public static final class MdaTypes {
        @objid ("13cf6f51-5ddb-430a-99ba-dc4bdb5b2594")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7114ec75-cdad-4505-9f00-0ffbae65d01f")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("d55c7f43-1c1f-4ec4-95c3-d9bf2c04493a")
        private static Stereotype MDAASSOCDEP;

        @objid ("bb7929d3-fba9-4d97-a806-c6965d5b86f5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9a58eb00-cbd3-4f6e-9d90-cac841decca4")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "92831533-b614-4124-8961-3cd7ebcad536", "TCapability");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "224dc1e1-9646-43bf-8a70-4e84323d4dde", "name");
            NAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (NAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

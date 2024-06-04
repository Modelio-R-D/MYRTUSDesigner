/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 08/03/2024 09:55 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << ArtifactTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e5b7a7e5-4299-40e0-b240-afab2efa13e6")
public class ArtifactTemplate implements IMdaProxy {
    @objid ("3807e980-2ff2-4eac-a8b8-1acb6eb412b5")
    public static final String STEREOTYPE_NAME = "ArtifactTemplate";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("7e13bb52-d9dc-4d9a-85d5-a2d48c890495")
    protected final Class elt;

    /**
     * Tells whether a {@link ArtifactTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ArtifactTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dc5d270c-f2c5-41b2-acbd-eb1ef7badb51")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (ArtifactTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(ArtifactTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << ArtifactTemplate >> then instantiate a {@link ArtifactTemplate} proxy.
     * @return a {@link ArtifactTemplate} proxy on the created {@link Class}.
     */
    @objid ("8813a1c2-7895-490a-ae97-deb63a6bc43f")
    public static ArtifactTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(ArtifactTemplate.MdaTypes.STEREOTYPE_ELT);
        return ArtifactTemplate.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ArtifactTemplate} proxy from a {@link Class} stereotyped << ArtifactTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ArtifactTemplate} proxy or <i>null</i>.
     */
    @objid ("bcdf5b92-3fc2-421d-81f7-603fa73bac1a")
    public static ArtifactTemplate instantiate(final Class obj) {
        return ArtifactTemplate.canInstantiate(obj) ? new ArtifactTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ArtifactTemplate} proxy from a {@link Class} stereotyped << ArtifactTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ArtifactTemplate} proxy.
     */
    @objid ("158acdf5-3b16-45b4-a6d5-54d32f43a4f3")
    public static ArtifactTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ArtifactTemplate.canInstantiate(obj))
            return new ArtifactTemplate(obj);
        else
            throw new IllegalArgumentException("ArtifactTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("30b3ef4d-aa77-4589-a51c-ae72b39b4e1d")
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
        ArtifactTemplate other = (ArtifactTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("051f1491-844e-400c-9406-8f8b3260b30c")
    public Class getElement() {
        return this.elt;
    }

    @objid ("14c86c38-3595-45cb-a5b8-2542f223d6c6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("57f58cd9-b0d9-4be1-afe7-e6a60c88f903")
    protected  ArtifactTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("dc253aac-1f2c-45cf-8573-00b768432bcd")
    public static final class MdaTypes {
        @objid ("aba88d6d-72a6-4ec4-81c5-6f37e956da8f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e9a56b65-4bff-4223-a8ba-ed9429be7959")
        private static Stereotype MDAASSOCDEP;

        @objid ("9c6b1777-5c13-4058-92f4-4e68cd3f90fe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("56e637a1-6050-4db0-8cbe-b02fe6e59227")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "9470b61d-47b8-455e-9d73-1119e307cdcc", "ArtifactTemplate");
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

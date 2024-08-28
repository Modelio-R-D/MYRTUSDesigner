/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << ConstraintType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4a0f52fe-ee1e-4b20-aa28-39906a751486")
public class ConstraintType1 implements IMdaProxy {
    @objid ("1324b385-db7f-4b98-b043-96e48ab9665c")
    public static final String STEREOTYPE_NAME = "ConstraintType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("698619e0-ce92-46b2-8a71-c988b236059e")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ConstraintType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ConstraintType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3da5582d-c520-46ce-b867-5c8dde6fc8a4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ConstraintType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ConstraintType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ConstraintType1 >> then instantiate a {@link ConstraintType1} proxy.
     * @return a {@link ConstraintType1} proxy on the created {@link ModelElement}.
     */
    @objid ("bcdcf351-ced6-4d2d-bd56-b2b847d3c643")
    public static ConstraintType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(ConstraintType1.MdaTypes.STEREOTYPE_ELT);
        return ConstraintType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ConstraintType1} proxy from a {@link ModelElement} stereotyped << ConstraintType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ConstraintType1} proxy or <i>null</i>.
     */
    @objid ("0179f7f5-61fa-4637-a71b-dc16500035b7")
    public static ConstraintType1 instantiate(final ModelElement obj) {
        return ConstraintType1.canInstantiate(obj) ? new ConstraintType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConstraintType1} proxy from a {@link ModelElement} stereotyped << ConstraintType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ConstraintType1} proxy.
     */
    @objid ("8792bcbe-baaf-484e-93a8-88f88508bc3e")
    public static ConstraintType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ConstraintType1.canInstantiate(obj))
            return new ConstraintType1(obj);
        else
            throw new IllegalArgumentException("ConstraintType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3b653450-76a0-4642-91ee-087cb80a6ce6")
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
        ConstraintType1 other = (ConstraintType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("637d44c2-3497-4847-8fd7-6b0ebbfa6174")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("3fb9b42d-2f44-4826-9a39-1ef4e3fd2a74")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1690dacc-75c9-4578-a952-c74a5ee8a30b")
    protected  ConstraintType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("66c8cfbd-405c-4c11-9b6c-f31dd0125ef8")
    public static final class MdaTypes {
        @objid ("ff6317a0-5fa1-43c4-bf9b-9b5e8f3dafe4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("be120998-bf3b-447d-a87d-eaaaaa012325")
        private static Stereotype MDAASSOCDEP;

        @objid ("51baabad-4242-4a1b-9954-48cccb495c71")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5496263d-30c3-465a-b888-3d94a52b6d45")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "167e6d59-234e-44f0-b3b9-f845efc8ec75", "ConstraintType1");
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

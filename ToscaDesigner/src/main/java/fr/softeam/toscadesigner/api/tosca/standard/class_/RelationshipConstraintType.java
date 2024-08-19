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
 * Proxy class to handle a {@link Class} with << RelationshipConstraintType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("07c0de92-47ff-41b8-a261-52225de89650")
public class RelationshipConstraintType implements IMdaProxy {
    @objid ("04d1f9a8-8ee8-4334-ba62-055df99633d0")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintType";

    @objid ("979cafe0-b038-4427-b89f-827c924ab01d")
    public static final String ANY_TAGTYPE = "any";

    @objid ("4f38613b-3c02-4a78-8e1d-acb5a53311ad")
    public static final String CONSTRAINTTYPE_TAGTYPE = "constraintType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("813ef0c7-6cf9-4ce1-ad47-518b8d1708a4")
    protected final Class elt;

    /**
     * Tells whether a {@link RelationshipConstraintType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RelationshipConstraintType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3bbb5d2b-762f-42ff-9e3c-45ce92f0ceb5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RelationshipConstraintType >> then instantiate a {@link RelationshipConstraintType} proxy.
     * @return a {@link RelationshipConstraintType} proxy on the created {@link Class}.
     */
    @objid ("58df5894-e89e-4f89-b50a-a0edf4b82b9b")
    public static RelationshipConstraintType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT);
        return RelationshipConstraintType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RelationshipConstraintType} proxy from a {@link Class} stereotyped << RelationshipConstraintType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RelationshipConstraintType} proxy or <i>null</i>.
     */
    @objid ("70171545-2c6d-4a13-9bb0-f5f81854791f")
    public static RelationshipConstraintType instantiate(final Class obj) {
        return RelationshipConstraintType.canInstantiate(obj) ? new RelationshipConstraintType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RelationshipConstraintType} proxy from a {@link Class} stereotyped << RelationshipConstraintType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RelationshipConstraintType} proxy.
     */
    @objid ("1ec7f9e5-fa6b-4d68-b0f5-d8a3cce369c6")
    public static RelationshipConstraintType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RelationshipConstraintType.canInstantiate(obj))
            return new RelationshipConstraintType(obj);
        else
            throw new IllegalArgumentException("RelationshipConstraintType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8ed0458d-aa54-42a5-9a7e-1c878b7c1914")
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
        RelationshipConstraintType other = (RelationshipConstraintType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b2400fc6-9bf4-44d9-8de4-6c0f704f3971")
    public String getAny() {
        return this.elt.getTagValue(RelationshipConstraintType.MdaTypes.ANY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e9a7668a-38d2-4b60-83d9-bbb09f19a41e")
    public String getConstraintType() {
        return this.elt.getTagValue(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("283fa198-b5c6-4afd-b93a-e207bfee4d1a")
    public Class getElement() {
        return this.elt;
    }

    @objid ("de504382-67dd-4ab8-a8bc-e4440da58ddc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4e4229cb-365b-4605-97ae-f62d69071971")
    public void setAny(final String value) {
        this.elt.putTagValue(RelationshipConstraintType.MdaTypes.ANY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("71f14488-0154-4746-bfd2-c56c6e05d9a4")
    public void setConstraintType(final String value) {
        this.elt.putTagValue(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_TAGTYPE_ELT, value);
    }

    @objid ("1b8bd6de-16cf-4b31-8d12-46fb98ad569b")
    protected  RelationshipConstraintType(final Class elt) {
        this.elt = elt;
    }

    @objid ("b8b225d7-4551-4e9e-a70d-53553b064eb1")
    public static final class MdaTypes {
        @objid ("f81bf269-9676-4bc5-a648-856ae658941f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("770edcd7-24ef-4dc3-8b6f-fa1365737940")
        public static TagType CONSTRAINTTYPE_TAGTYPE_ELT;

        @objid ("105683fa-7e6e-41ee-b251-d49f57385645")
        public static TagType ANY_TAGTYPE_ELT;

        @objid ("4c95d736-ec1c-4425-82a5-728e2e6f39b0")
        private static Stereotype MDAASSOCDEP;

        @objid ("c64b90b2-d855-4644-b684-603dae025f5d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c5cff790-7fe4-4890-8066-cc397519c389")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "c0831a7b-bda2-433b-9120-b18e7e871edf", "RelationshipConstraintType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "decdf774-2815-4cd8-98da-92a22715cdf5", "constraintType");
            CONSTRAINTTYPE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (CONSTRAINTTYPE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "af827af8-e116-452d-b802-f2de41fcf61d", "any");
            ANY_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (ANY_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

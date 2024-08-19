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
 * Proxy class to handle a {@link Class} with << RelationshipConstraintsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("53a9d564-ac7a-49d2-87a2-450302bc887e")
public class RelationshipConstraintsType implements IMdaProxy {
    @objid ("aad06e6d-1393-4d3e-90e4-a99689c28e48")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("b081280d-df9f-4e39-9521-3c2a939c58cc")
    protected final Class elt;

    /**
     * Tells whether a {@link RelationshipConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RelationshipConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fc4dbf88-b7df-4314-b8c4-1e6673568290")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RelationshipConstraintsType >> then instantiate a {@link RelationshipConstraintsType} proxy.
     * @return a {@link RelationshipConstraintsType} proxy on the created {@link Class}.
     */
    @objid ("283b57b6-b581-4ef6-b829-c7e8e521f370")
    public static RelationshipConstraintsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT);
        return RelationshipConstraintsType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RelationshipConstraintsType} proxy from a {@link Class} stereotyped << RelationshipConstraintsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RelationshipConstraintsType} proxy or <i>null</i>.
     */
    @objid ("940702d6-499f-4827-8b76-a92319e716eb")
    public static RelationshipConstraintsType instantiate(final Class obj) {
        return RelationshipConstraintsType.canInstantiate(obj) ? new RelationshipConstraintsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RelationshipConstraintsType} proxy from a {@link Class} stereotyped << RelationshipConstraintsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RelationshipConstraintsType} proxy.
     */
    @objid ("2c028a4a-af9a-4425-b49e-45cb04932a11")
    public static RelationshipConstraintsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RelationshipConstraintsType.canInstantiate(obj))
            return new RelationshipConstraintsType(obj);
        else
            throw new IllegalArgumentException("RelationshipConstraintsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8c98d30a-0349-46c8-8c7d-1dfce5b341d5")
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
        RelationshipConstraintsType other = (RelationshipConstraintsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("6e68d4ac-b32a-4480-a888-21c7b087615b")
    public Class getElement() {
        return this.elt;
    }

    @objid ("b3d6fb13-0c0b-457a-a5d1-d8e4566c7361")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e2a22de3-587e-43e0-b418-edd40ae3f68a")
    protected  RelationshipConstraintsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("85f0e754-100d-4a60-984b-b49caac11d97")
    public static final class MdaTypes {
        @objid ("cc725350-ba23-49eb-9817-f4d4a228b0a6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7c76d86c-3648-492b-a94e-6bea0e4f6eec")
        private static Stereotype MDAASSOCDEP;

        @objid ("3e91f09a-bac8-436e-a4ee-a61df4547ca7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("df71f98a-573a-4c8e-b794-69d3fade3e72")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7956674f-ca58-44ad-86e0-eb4f37747af7", "RelationshipConstraintsType");
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

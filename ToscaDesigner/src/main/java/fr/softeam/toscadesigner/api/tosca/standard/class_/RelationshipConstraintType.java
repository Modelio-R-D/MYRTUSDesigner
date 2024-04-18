/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << RelationshipConstraintType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("475bec4c-c31c-4be6-91d5-fb588f7bb93c")
public class RelationshipConstraintType implements IMdaProxy {
    @objid ("eea6766e-8cf0-4264-8324-71ffaf25ab53")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintType";

    @objid ("4dbd49ae-f19d-4619-9464-f6ad706356d0")
    public static final String ANY_TAGTYPE = "any";

    @objid ("7a05cf6a-3b59-4be2-a069-e2d2437ede79")
    public static final String CONSTRAINTTYPE_TAGTYPE = "constraintType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("382d3c38-be4c-41dd-b373-0372cb1b349d")
    protected final Class elt;

    /**
     * Tells whether a {@link RelationshipConstraintType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RelationshipConstraintType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a1d3a82c-e126-4ab6-a372-b213b530bd6c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RelationshipConstraintType >> then instantiate a {@link RelationshipConstraintType} proxy.
     * @return a {@link RelationshipConstraintType} proxy on the created {@link Class}.
     */
    @objid ("04839c84-e9db-4a83-804a-26b4aca33022")
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
    @objid ("a9fd58fb-0a41-473a-82e2-30051a311c96")
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
    @objid ("b1640284-f202-4a5f-9291-0b79a0577d3a")
    public static RelationshipConstraintType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RelationshipConstraintType.canInstantiate(obj))
            return new RelationshipConstraintType(obj);
        else
            throw new IllegalArgumentException("RelationshipConstraintType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9156e2d3-bbd6-4742-97e6-f30c26365ac3")
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
    @objid ("81836aab-9234-42c9-9663-f36441544d4d")
    public String getAny() {
        return this.elt.getTagValue(RelationshipConstraintType.MdaTypes.ANY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ad8d219a-5629-429c-bd10-18577e26cf26")
    public String getConstraintType() {
        return this.elt.getTagValue(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("715961c6-cdaa-4747-b155-2077d69e208e")
    public Class getElement() {
        return this.elt;
    }

    @objid ("afc38172-1882-46ca-bc9f-255cdc8fe54c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9aac7a7b-7cd9-482a-8f65-e46ad2754586")
    public void setAny(final String value) {
        this.elt.putTagValue(RelationshipConstraintType.MdaTypes.ANY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8ddf6a18-acd3-4fe7-9fa4-d20938c5aec0")
    public void setConstraintType(final String value) {
        this.elt.putTagValue(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_TAGTYPE_ELT, value);
    }

    @objid ("71577785-06fe-4ea9-88fe-36a509503605")
    protected  RelationshipConstraintType(final Class elt) {
        this.elt = elt;
    }

    @objid ("c5387001-1241-4ba3-91f3-0d158f274576")
    public static final class MdaTypes {
        @objid ("bc702c90-140f-43bf-a3fa-addd3c8e45cb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1dddcf8a-47f8-4b1d-969a-aecd75a426ca")
        public static TagType CONSTRAINTTYPE_TAGTYPE_ELT;

        @objid ("1a74dc5d-f7ad-4431-8b3d-cbbfcf4066f2")
        public static TagType ANY_TAGTYPE_ELT;

        @objid ("d00c4f05-889f-4647-ab64-7efd63e9278c")
        private static Stereotype MDAASSOCDEP;

        @objid ("478a1613-2739-4b7f-8039-71f719e0b8ea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2becf700-4756-45f8-95c5-6cb86e485ef1")
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

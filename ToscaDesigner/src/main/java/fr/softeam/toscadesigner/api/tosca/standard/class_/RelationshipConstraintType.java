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
    @objid ("44715005-56b5-40bf-a8d0-651c3a210d15")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintType";

    @objid ("1e1fc160-f0e3-403e-b965-698e40953735")
    public static final String ANY_TAGTYPE = "any";

    @objid ("19555bc0-6ba5-4594-9862-13d541cfd7d3")
    public static final String CONSTRAINTTYPE_TAGTYPE = "constraintType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("b7be6cec-9f9b-4dbe-a5cb-e4f451315067")
    protected final Class elt;

    /**
     * Tells whether a {@link RelationshipConstraintType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RelationshipConstraintType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("af1164ac-f007-449b-a6b6-9f9202b91422")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RelationshipConstraintType >> then instantiate a {@link RelationshipConstraintType} proxy.
     * @return a {@link RelationshipConstraintType} proxy on the created {@link Class}.
     */
    @objid ("09b513df-8b09-4e6d-a327-20acd165b23b")
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
    @objid ("0ae57d62-bf7f-4efe-8c9c-0a0b02f1e236")
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
    @objid ("3375fb25-c481-4ef3-af3e-36db177aaf4c")
    public static RelationshipConstraintType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RelationshipConstraintType.canInstantiate(obj))
            return new RelationshipConstraintType(obj);
        else
            throw new IllegalArgumentException("RelationshipConstraintType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("03108294-0d83-4848-a0fa-050a7081b1ef")
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
    @objid ("12578b6e-0426-4042-b88a-c9b97e7c15d8")
    public String getAny() {
        return this.elt.getTagValue(RelationshipConstraintType.MdaTypes.ANY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1f6cb667-73df-4acf-b75f-43a57a480bf3")
    public String getConstraintType() {
        return this.elt.getTagValue(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("2eac1dcc-7bcf-4fdb-a880-e1bb8f2c076a")
    public Class getElement() {
        return this.elt;
    }

    @objid ("68dc2737-e235-46bc-99eb-6b40f9056ac4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("05bd6859-dbe0-4c06-9142-ead7ea0201aa")
    public void setAny(final String value) {
        this.elt.putTagValue(RelationshipConstraintType.MdaTypes.ANY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5c6db594-223c-42bc-af50-91ed8574fcf3")
    public void setConstraintType(final String value) {
        this.elt.putTagValue(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_TAGTYPE_ELT, value);
    }

    @objid ("f1f7cd01-2e32-4015-addd-5a96c501c70e")
    protected  RelationshipConstraintType(final Class elt) {
        this.elt = elt;
    }

    @objid ("c5387001-1241-4ba3-91f3-0d158f274576")
    public static final class MdaTypes {
        @objid ("ffec9d3c-349d-40d9-a328-dbeca0fe1a54")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9a76a469-c748-40ae-86dd-2df06e6d3b03")
        public static TagType CONSTRAINTTYPE_TAGTYPE_ELT;

        @objid ("f4bf8022-3d18-439c-b158-09a5188d5e0e")
        public static TagType ANY_TAGTYPE_ELT;

        @objid ("6543b75d-7b54-4754-a9c7-d5b1a58384ed")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ef1eef4-7950-4d19-b734-47aa13439d79")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b781f63a-5a84-4782-8fb0-183fa91152e3")
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

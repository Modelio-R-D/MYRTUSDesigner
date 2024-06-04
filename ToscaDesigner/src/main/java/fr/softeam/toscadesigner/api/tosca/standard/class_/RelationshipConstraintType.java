/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 15:45 by Modelio Studio.
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
@objid ("8d4a20ee-5cbf-4b0b-abb3-e88a0203640c")
public class RelationshipConstraintType implements IMdaProxy {
    @objid ("bf75137a-7318-4dfa-9dbd-fb2819c7017d")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintType";

    @objid ("6358df40-3a87-4b0f-b789-cd070fc9dd8d")
    public static final String ANY_TAGTYPE = "any";

    @objid ("d0f59c8e-37f0-4072-828f-99bb73d78879")
    public static final String CONSTRAINTTYPE_TAGTYPE = "constraintType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("37d14dd2-36f3-45df-885d-44f5b45ed944")
    protected final Class elt;

    /**
     * Tells whether a {@link RelationshipConstraintType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RelationshipConstraintType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6ff02c9a-f114-4977-b230-86c06070f144")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RelationshipConstraintType >> then instantiate a {@link RelationshipConstraintType} proxy.
     * 
     * @return a {@link RelationshipConstraintType} proxy on the created {@link Class}.
     */
    @objid ("94a36501-82e5-48b3-b4f3-7cf16b51ea06")
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
    @objid ("59f2ff3b-bea6-428b-a7bf-c02139efa432")
    public static RelationshipConstraintType instantiate(final Class obj) {
        return RelationshipConstraintType.canInstantiate(obj) ? new RelationshipConstraintType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RelationshipConstraintType} proxy from a {@link Class} stereotyped << RelationshipConstraintType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RelationshipConstraintType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ee793fea-e964-4b06-b32d-6edeeb7cd368")
    public static RelationshipConstraintType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RelationshipConstraintType.canInstantiate(obj))
        	return new RelationshipConstraintType(obj);
        else
        	throw new IllegalArgumentException("RelationshipConstraintType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d42a490b-64ed-48ff-b7b4-3f21c1d83dbf")
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
    @objid ("3810da4f-d219-41bd-9aad-de326245ceb3")
    public String getAny() {
        return this.elt.getTagValue(RelationshipConstraintType.MdaTypes.ANY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("544549ee-ed90-4ecc-846f-06582a332873")
    public String getConstraintType() {
        return this.elt.getTagValue(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("61d71d98-740b-419b-a9cc-594b10dbf0e7")
    public Class getElement() {
        return this.elt;
    }

    @objid ("eace07e0-efba-4b54-b4c8-2bc97ef61d6a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("184feb7e-8160-4c32-a3bc-44614dba26ab")
    public void setAny(final String value) {
        this.elt.putTagValue(RelationshipConstraintType.MdaTypes.ANY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b600b854-46b6-4186-9304-57af1093432d")
    public void setConstraintType(final String value) {
        this.elt.putTagValue(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_TAGTYPE_ELT, value);
    }

    @objid ("07ee8708-1746-42ec-8375-0ae6a92219a2")
    protected  RelationshipConstraintType(final Class elt) {
        this.elt = elt;
    }

    @objid ("f19d02d1-6f65-440d-b88c-dab01df39124")
    public static final class MdaTypes {
        @objid ("60c991f2-24c7-44df-afcb-e3056447a69b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("213a9054-810e-4194-b814-f3d339a758e1")
        public static TagType CONSTRAINTTYPE_TAGTYPE_ELT;

        @objid ("55b7d17e-92af-47b5-8d04-0a96b28ea85b")
        public static TagType ANY_TAGTYPE_ELT;

        @objid ("eb1af70a-6134-4281-8615-cef9a9049746")
        private static Stereotype MDAASSOCDEP;

        @objid ("8dc3c52e-9aa7-4743-9dae-3feca56670ac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("04119040-d7bb-4c06-b255-3494c1a9d496")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
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
    @objid ("33f2bfb4-adab-4ce0-97a7-5f4ebc92bb68")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintType";

    @objid ("87d01ca2-8d56-4369-8b63-c9614951de90")
    public static final String ANY_TAGTYPE = "any";

    @objid ("32917b04-029c-4632-8b8c-8b1b8f3aa2d5")
    public static final String CONSTRAINTTYPE_TAGTYPE = "constraintType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("5fc1def5-90ef-444e-b87d-d1b9bba5cd9d")
    protected final Class elt;

    /**
     * Tells whether a {@link RelationshipConstraintType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RelationshipConstraintType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4721a9f9-6444-4591-967c-1e07773d2ab4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RelationshipConstraintType >> then instantiate a {@link RelationshipConstraintType} proxy.
     * 
     * @return a {@link RelationshipConstraintType} proxy on the created {@link Class}.
     */
    @objid ("d6723db0-6f24-45f0-8f7e-8a0c435def35")
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
    @objid ("06d8f465-ae5f-4228-9456-16b0e0a5b1f7")
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
    @objid ("7ce11a98-f6fd-4359-a15d-3c8db29275c9")
    public static RelationshipConstraintType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RelationshipConstraintType.canInstantiate(obj))
        	return new RelationshipConstraintType(obj);
        else
        	throw new IllegalArgumentException("RelationshipConstraintType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("36c0b7cf-1c52-4f54-9fc7-0342b6de239a")
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
    @objid ("d59e4dbe-a788-4c8b-a6fd-24805aee909f")
    public String getAny() {
        return this.elt.getTagValue(RelationshipConstraintType.MdaTypes.ANY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9ba6c98f-2613-4155-865f-cf4c8c4fe637")
    public String getConstraintType() {
        return this.elt.getTagValue(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("6eac886d-f066-47a1-b8e3-46108a9b50e7")
    public Class getElement() {
        return this.elt;
    }

    @objid ("f973d03f-4092-4e3f-96c6-84db4dad67dc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6ee26aef-cb84-4d3a-82a0-33b623c60a1b")
    public void setAny(final String value) {
        this.elt.putTagValue(RelationshipConstraintType.MdaTypes.ANY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("854a0b67-7838-4598-8a40-1f3780c337fe")
    public void setConstraintType(final String value) {
        this.elt.putTagValue(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_TAGTYPE_ELT, value);
    }

    @objid ("0efe3c91-9e98-4683-9d2c-1f474e1736c0")
    protected  RelationshipConstraintType(final Class elt) {
        this.elt = elt;
    }

    @objid ("c5387001-1241-4ba3-91f3-0d158f274576")
    public static final class MdaTypes {
        @objid ("1d1f2c36-5e54-4776-88dd-e7e02836c099")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("130c52fa-e482-4474-99ed-f19bf591d48b")
        public static TagType CONSTRAINTTYPE_TAGTYPE_ELT;

        @objid ("031b3d8c-30cf-4dd9-bd7d-ea60d36a5131")
        public static TagType ANY_TAGTYPE_ELT;

        @objid ("570a13a0-0bf2-48d7-bf12-ea71456681af")
        private static Stereotype MDAASSOCDEP;

        @objid ("b0185cc4-2eba-41a3-b16d-7bce80180de3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0641f21a-eb5a-4495-94c0-ced5ab0050b7")
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

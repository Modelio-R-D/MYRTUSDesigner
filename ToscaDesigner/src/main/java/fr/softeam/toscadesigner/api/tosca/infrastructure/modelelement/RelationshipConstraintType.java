/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 13/08/2024 17:47 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << RelationshipConstraintType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ef021592-491f-4784-b4b1-d658ae345803")
public class RelationshipConstraintType implements IMdaProxy {
    @objid ("1f598efe-221f-4f38-af16-51cd0d132eed")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintType";

    @objid ("90fbb984-36bd-499c-9282-8231bc1c3b47")
    public static final String ANY_PROPERTY = "any";

    @objid ("2ca2671e-8d07-46f7-b158-1001704e4a22")
    public static final String CONSTRAINTTYPE_PROPERTY = "constraintType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("b46d2cac-0f09-40da-8d19-9e2c4cae6d94")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipConstraintType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipConstraintType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1219b145-7501-4669-9a82-a3458f89e786")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipConstraintType >> then instantiate a {@link RelationshipConstraintType} proxy.
     * 
     * @return a {@link RelationshipConstraintType} proxy on the created {@link ModelElement}.
     */
    @objid ("d0b27a4c-4efb-4065-82a0-9549f9df30b5")
    public static RelationshipConstraintType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT);
        return RelationshipConstraintType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link RelationshipConstraintType} proxy from a {@link ModelElement} stereotyped << RelationshipConstraintType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link RelationshipConstraintType} proxy or <i>null</i>.
     */
    @objid ("ff2720f6-e714-476d-9533-a005d5175e01")
    public static RelationshipConstraintType instantiate(final ModelElement obj) {
        return RelationshipConstraintType.canInstantiate(obj) ? new RelationshipConstraintType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RelationshipConstraintType} proxy from a {@link ModelElement} stereotyped << RelationshipConstraintType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link RelationshipConstraintType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5178fcb6-f9f9-4c70-873a-2a7fef45559d")
    public static RelationshipConstraintType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RelationshipConstraintType.canInstantiate(obj))
        	return new RelationshipConstraintType(obj);
        else
        	throw new IllegalArgumentException("RelationshipConstraintType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("453cd7e4-b23c-4ade-9142-a3dc0755f063")
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
     * Getter for property 'RelationshipConstraintType.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a8cf4925-23fc-4684-9c41-d4f4de208d43")
    public String getAny() {
        String value = this.elt.getProperty(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT,
                                            RelationshipConstraintType.MdaTypes.ANY_PROPERTY_ELT.getName());
        if (value == null) {
          value = RelationshipConstraintType.MdaTypes.ANY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(RelationshipConstraintType.MdaTypes.ANY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'RelationshipConstraintType.constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5e68b736-0570-445a-b215-6446117ba758")
    public String getConstraintType() {
        String value = this.elt.getProperty(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT,
                                            RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("650efc66-052f-4753-b857-91c1b0f87279")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("8ccc1cae-4448-4862-ac9f-a742529bb503")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'RelationshipConstraintType.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("27838351-9e67-4322-913d-634da6c3815d")
    public void setAny(final String value) {
        this.elt.setProperty(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipConstraintType.MdaTypes.ANY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipConstraintType.MdaTypes.ANY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'RelationshipConstraintType.constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1f87253d-a3d2-44ab-bfc4-7b3b75b4de71")
    public void setConstraintType(final String value) {
        this.elt.setProperty(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value));
    }

    @objid ("6b28f179-5150-4bd1-be53-0a54ff900dd1")
    protected  RelationshipConstraintType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("4659dc59-3422-4f9a-9f5c-721cb5e1e67f")
    public static final class MdaTypes {
        @objid ("d051ef49-dbb5-42aa-9925-a81ec32278ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("67669b7f-75e4-430f-a069-b5be60bf57d3")
        public static PropertyDefinition CONSTRAINTTYPE_PROPERTY_ELT;

        @objid ("800e52f4-2f2c-42f3-892f-0b4a54c5870d")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("2be392e3-75ab-4df5-ac40-1a57a456fba8")
        private static Stereotype MDAASSOCDEP;

        @objid ("c7b89be7-44c0-4c1d-b73c-952fdcbc58db")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("40b63b04-a043-43c1-8ff0-7b2d52ff1605")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "26400e89-c60e-410b-ac9d-3e5d043376f9", "RelationshipConstraintType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "65b7f41c-716b-402a-802a-9898b96de652", "constraintType");
            CONSTRAINTTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CONSTRAINTTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "f73aba0e-38b6-4024-9e98-75395a41b93c", "any");
            ANY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ANY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

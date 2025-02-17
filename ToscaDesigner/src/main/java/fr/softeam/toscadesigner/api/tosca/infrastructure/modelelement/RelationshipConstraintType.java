/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 15:39 by Modelio Studio.
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
@objid ("91f25bf0-dbd9-4231-9eb0-6cccf3277ddb")
public class RelationshipConstraintType implements IMdaProxy {
    @objid ("b0b5e64d-6f87-4778-9878-f8a53c0d0d46")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintType";

    @objid ("eef958be-45b8-491c-ad52-9a2d0c67bfa5")
    public static final String ANY_PROPERTY = "any";

    @objid ("feab19a8-b7c8-47ba-b21a-07e1cbcd7456")
    public static final String CONSTRAINTTYPE_PROPERTY = "constraintType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6db2ab2a-f1a9-4f33-b6cd-6e5c4e582737")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipConstraintType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipConstraintType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4b23ca90-23a3-4f00-8598-547d2a788447")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipConstraintType >> then instantiate a {@link RelationshipConstraintType} proxy.
     * 
     * @return a {@link RelationshipConstraintType} proxy on the created {@link ModelElement}.
     */
    @objid ("8baacdd4-eecd-462e-8c84-3434034d8058")
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
    @objid ("35068635-7188-49a4-9b00-87b1a57aa0ce")
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
    @objid ("8e381474-c1a2-4145-8e98-29986de046a2")
    public static RelationshipConstraintType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RelationshipConstraintType.canInstantiate(obj))
        	return new RelationshipConstraintType(obj);
        else
        	throw new IllegalArgumentException("RelationshipConstraintType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("14b589ce-2b78-4d18-b88a-20c8b6843d70")
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
    @objid ("40df4c35-d3ff-47c9-93da-27be312c3b9e")
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
    @objid ("7d68e6c9-9c83-409f-95f3-67e279cebd66")
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
    @objid ("d18fc8f7-e43f-45fe-9c73-cc2469944f38")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("bde89773-c984-4b3d-8c24-e832096df20e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'RelationshipConstraintType.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("db264e20-b3e2-4973-b725-a7c2d6130f1f")
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
    @objid ("50c89117-4e49-4bc9-bbc2-198522c37f18")
    public void setConstraintType(final String value) {
        this.elt.setProperty(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value));
    }

    @objid ("b12bdfd9-27c9-4d27-95f0-c7cd412ce0bb")
    protected  RelationshipConstraintType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("9e8ff9b3-2ec6-49dd-a49a-588edc00291d")
    public static final class MdaTypes {
        @objid ("866a6205-2311-4cfb-ba6e-f97d073dafd4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d9dcf82d-5d3f-4a43-ba38-4ba724356753")
        public static PropertyDefinition CONSTRAINTTYPE_PROPERTY_ELT;

        @objid ("ae05d587-2549-40da-bd04-fa296f6e0986")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("db485651-ee18-49b9-93bd-7b74d9e2a382")
        private static Stereotype MDAASSOCDEP;

        @objid ("4ca63b4d-5260-482b-971e-71843f6f73aa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("429c7e3f-eed8-423d-9a86-a39cee952a57")
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

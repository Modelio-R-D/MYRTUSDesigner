/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 16:04 by Modelio Studio.
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
@objid ("bce2ef1a-76f2-40da-be93-86b693dd327c")
public class RelationshipConstraintType implements IMdaProxy {
    @objid ("7d4da5e1-2a7d-4153-966f-6991a9d24db6")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintType";

    @objid ("1f593e89-4c4f-4b5f-af42-3dbe735ee83f")
    public static final String ANY_PROPERTY = "any";

    @objid ("ffeb490c-071a-4abd-a7c0-923a88eb50b1")
    public static final String CONSTRAINTTYPE_PROPERTY = "constraintType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("d08b9c59-ba60-4742-b3e5-ccbd0ad87b62")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipConstraintType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipConstraintType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e9c5703c-a0f3-416a-813e-3ac12058436e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipConstraintType >> then instantiate a {@link RelationshipConstraintType} proxy.
     * 
     * @return a {@link RelationshipConstraintType} proxy on the created {@link ModelElement}.
     */
    @objid ("d613e5c7-cba4-4d1a-ba7f-ab608e3e7c15")
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
    @objid ("65273b74-55f0-4845-9533-3d9a14bd5cb8")
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
    @objid ("ade9d5a9-e673-46e6-ba5c-44747f3f298b")
    public static RelationshipConstraintType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RelationshipConstraintType.canInstantiate(obj))
        	return new RelationshipConstraintType(obj);
        else
        	throw new IllegalArgumentException("RelationshipConstraintType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("36704f49-d501-4f80-bed7-c6b7b726eeda")
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
    @objid ("a8fb4072-7599-4984-8275-9fbbbcc926ce")
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
    @objid ("adfd9a90-24b5-41a2-a77b-fc9e1818a585")
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
    @objid ("edca9cdf-05d8-4fa2-b408-704e7ef9de3a")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("21816a45-5ba2-427e-b1e1-f3fe351cfc6a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'RelationshipConstraintType.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("083dbc08-0a5b-430b-bf58-4622a8b91cd0")
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
    @objid ("ef4074b8-4775-46c9-84e9-82649d2a7247")
    public void setConstraintType(final String value) {
        this.elt.setProperty(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value));
    }

    @objid ("63d04bb0-f143-40c0-a0b7-4dc1cc56362a")
    protected  RelationshipConstraintType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d07d5886-c417-4099-999a-9a3282cab5c2")
    public static final class MdaTypes {
        @objid ("95af0e81-2b22-4be8-ba58-3a420ed7c859")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e63f75d0-9b41-457e-9cf8-69cd6a17b0b5")
        public static PropertyDefinition CONSTRAINTTYPE_PROPERTY_ELT;

        @objid ("94cda328-d489-43ab-8a53-cd183257cf0b")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("c951b9bc-1651-4798-9721-681a730709a4")
        private static Stereotype MDAASSOCDEP;

        @objid ("bcf81de2-49c4-4e5d-8d1b-ee77345b6540")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("66618736-08db-41ba-bd46-4aa505544bc7")
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

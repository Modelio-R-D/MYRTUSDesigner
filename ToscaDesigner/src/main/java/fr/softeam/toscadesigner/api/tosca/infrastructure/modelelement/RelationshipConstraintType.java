/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/10/2024 11:40 by Modelio Studio.
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
    @objid ("8084d8f6-f2d2-4575-86c1-16ad974c126a")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintType";

    @objid ("0020e704-f72c-4502-9a22-c5ef0b83bf0c")
    public static final String ANY_PROPERTY = "any";

    @objid ("4695e6d3-b656-446c-b439-3eb8b18d43dc")
    public static final String CONSTRAINTTYPE_PROPERTY = "constraintType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("71372b44-adbe-4152-a24c-4edb784340c8")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipConstraintType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipConstraintType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2f66f12e-1677-4104-96c0-8ebd7c5bd03a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipConstraintType >> then instantiate a {@link RelationshipConstraintType} proxy.
     * 
     * @return a {@link RelationshipConstraintType} proxy on the created {@link ModelElement}.
     */
    @objid ("91233073-728a-4c48-b198-6488c24b3e39")
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
    @objid ("16230897-2716-49f2-a330-9e2b24a81dda")
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
    @objid ("d06a13d9-4627-46cc-ab52-33802fada042")
    public static RelationshipConstraintType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RelationshipConstraintType.canInstantiate(obj))
        	return new RelationshipConstraintType(obj);
        else
        	throw new IllegalArgumentException("RelationshipConstraintType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b368cc26-ec09-449a-8df3-413eabcbe3c9")
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
    @objid ("87a7bc4f-70ab-4c43-b24e-931e83e78a97")
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
    @objid ("c2bef3fb-d08c-48d6-9f32-4fc7288d1406")
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
    @objid ("4475d9a3-c084-49f2-95cd-3610358125ff")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("89bfae0f-6198-4b17-9b2d-9fa689abfa51")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'RelationshipConstraintType.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6dd787ae-b876-4ff2-baa8-95b212b7baee")
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
    @objid ("f13ccddf-a0cc-432c-9c4b-c9ea252ba35a")
    public void setConstraintType(final String value) {
        this.elt.setProperty(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value));
    }

    @objid ("501ae439-9be4-4382-b788-c7d6a9f4d0f1")
    protected  RelationshipConstraintType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d07d5886-c417-4099-999a-9a3282cab5c2")
    public static final class MdaTypes {
        @objid ("b2163257-9ccf-429e-bedc-57c3077411a8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("78e94ef6-e65f-45c1-a0f0-2e4ac800cb46")
        public static PropertyDefinition CONSTRAINTTYPE_PROPERTY_ELT;

        @objid ("2e12c14b-57d6-4b79-971b-8f815690e632")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("a35c2f01-df68-4326-bf9a-da0e95597efe")
        private static Stereotype MDAASSOCDEP;

        @objid ("d625c004-73c2-4f9f-9efb-2527e889fad1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d30bd9da-f677-43f2-b7f9-1ea8bf5bf8ff")
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

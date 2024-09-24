/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 24/09/2024 16:22 by Modelio Studio.
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
    @objid ("e731afad-8a8d-4d4b-99e1-2f6fc794cf4d")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintType";

    @objid ("bb89aa63-cb51-4e7e-9c32-2fbd6575fd59")
    public static final String ANY_PROPERTY = "any";

    @objid ("3bab01f8-c959-49f5-8171-0d9d02bdd179")
    public static final String CONSTRAINTTYPE_PROPERTY = "constraintType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("09b7affe-2f94-4a5e-9b64-8fbbf998785a")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipConstraintType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipConstraintType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e85817e6-c1e3-44d3-a2a1-b3c9c70dd71b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipConstraintType >> then instantiate a {@link RelationshipConstraintType} proxy.
     * 
     * @return a {@link RelationshipConstraintType} proxy on the created {@link ModelElement}.
     */
    @objid ("af168e85-ae32-4626-8d6f-5e8482da0b1f")
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
    @objid ("75c99d72-bbc5-46a8-9021-c7bb6d7fe9f0")
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
    @objid ("5172e4ef-eec5-427a-8654-0766c221ae14")
    public static RelationshipConstraintType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RelationshipConstraintType.canInstantiate(obj))
        	return new RelationshipConstraintType(obj);
        else
        	throw new IllegalArgumentException("RelationshipConstraintType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("39ab1651-c1e3-466f-bd79-3af8ffed0898")
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
    @objid ("db5071d6-65be-4532-9787-8a429cd7c832")
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
    @objid ("423bafe9-1467-4b6a-9994-411f542d9765")
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
    @objid ("c5ae719d-fd99-4cdc-9d84-9583d76cdef2")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("da3d1866-a0da-4957-b42e-3af14fdccb95")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'RelationshipConstraintType.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("260bc8c7-27e9-4304-9be6-dd9a093fa960")
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
    @objid ("402002d3-2812-4a36-a291-ef29e3160c38")
    public void setConstraintType(final String value) {
        this.elt.setProperty(RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipConstraintType.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value));
    }

    @objid ("6d9bd306-7eba-4411-8aa5-63ae6096e6b2")
    protected  RelationshipConstraintType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d07d5886-c417-4099-999a-9a3282cab5c2")
    public static final class MdaTypes {
        @objid ("c3f1eb6e-7be0-4fb9-9558-652e13c2f85f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dc4bb330-839c-445f-a0e8-982f3590bddd")
        public static PropertyDefinition CONSTRAINTTYPE_PROPERTY_ELT;

        @objid ("65340ac3-1430-430a-81f0-0b1be2989e8e")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("7aed67b5-8ac3-41a5-a2d2-1901209b6fb9")
        private static Stereotype MDAASSOCDEP;

        @objid ("f6c0cc64-3e25-46e7-9503-7dc87b274ee8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dce5512c-4e66-46c2-be5c-381c8aa6c8b0")
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

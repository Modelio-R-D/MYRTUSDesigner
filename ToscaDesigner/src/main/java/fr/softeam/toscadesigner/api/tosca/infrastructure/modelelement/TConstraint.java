/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 11:20 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("828b2130-7574-4ae9-9838-db05af212523")
public class TConstraint implements IMdaProxy {
    @objid ("35f2de93-efdf-46a7-83f8-3807c563169f")
    public static final String STEREOTYPE_NAME = "TConstraint";

    @objid ("2797d380-8ff3-4291-ac07-14d7e09db72a")
    public static final String ANY_PROPERTY = "any";

    @objid ("0dfd9cbd-4ad6-470d-9701-5bfc6d89e0a6")
    public static final String CONSTRAINTTYPE_PROPERTY = "constraintType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("b5bf3cc4-e2b9-4fde-8442-84eed807d48b")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c5404d0c-0073-4991-9370-7ccf299a558c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TConstraint.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TConstraint.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TConstraint >> then instantiate a {@link TConstraint} proxy.
     * 
     * @return a {@link TConstraint} proxy on the created {@link ModelElement}.
     */
    @objid ("7b6c3461-2af4-41f0-b47d-663faa044e18")
    public static TConstraint create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TConstraint.MdaTypes.STEREOTYPE_ELT);
        return TConstraint.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TConstraint} proxy from a {@link ModelElement} stereotyped << TConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TConstraint} proxy or <i>null</i>.
     */
    @objid ("b2d9c35e-0b73-4ce6-bb44-f3e0e05b30de")
    public static TConstraint instantiate(final ModelElement obj) {
        return TConstraint.canInstantiate(obj) ? new TConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TConstraint} proxy from a {@link ModelElement} stereotyped << TConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("267b6f21-13aa-4225-be8e-a1ec335094a5")
    public static TConstraint safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TConstraint.canInstantiate(obj))
        	return new TConstraint(obj);
        else
        	throw new IllegalArgumentException("TConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9c2f0b46-0837-40cd-b46f-7c3232012d6d")
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
        TConstraint other = (TConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TConstraint.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8cc51aff-6ff1-4e88-8028-b435c3d5aa54")
    public String getAny() {
        String value = this.elt.getProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                                            TConstraint.MdaTypes.ANY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TConstraint.MdaTypes.ANY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TConstraint.MdaTypes.ANY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TConstraint.constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("673ad9ca-01eb-48b2-8221-5b4a8b031d73")
    public String getConstraintType() {
        String value = this.elt.getProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                                            TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("79dacc55-0813-4f30-ad83-486bf7880d49")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("d08577e8-62fa-4956-8f2b-512e0814353a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TConstraint.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d9f8818e-b40f-4f90-90f5-49c736ab8065")
    public void setAny(final String value) {
        this.elt.setProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                             TConstraint.MdaTypes.ANY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TConstraint.MdaTypes.ANY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TConstraint.constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("efd65e81-cfa3-469d-86c8-7a057522e21d")
    public void setConstraintType(final String value) {
        this.elt.setProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                             TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value));
    }

    @objid ("ee5c1346-3ba1-4745-b1c8-e90992474bc7")
    protected  TConstraint(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("632c46d2-f11b-4edd-96cf-89f8acfb07ff")
    public static final class MdaTypes {
        @objid ("33a942d1-0ac7-484b-9af1-734992bb7584")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("017a79db-d36b-44e6-9c43-9ab7b812128c")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("74989f08-cb98-439d-bd7a-698a2fd0beb3")
        public static PropertyDefinition CONSTRAINTTYPE_PROPERTY_ELT;

        @objid ("a49ce6f3-cc86-4846-9df6-94a3e6c84580")
        private static Stereotype MDAASSOCDEP;

        @objid ("31d16a21-79ef-413d-89f0-5d0144054cde")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("132cfb29-42cb-40ed-a2f1-18fe3adc2d14")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "78fc63ae-0ad0-45f4-840f-4dbadc0922cb", "TConstraint");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "919faa40-beb7-4c4d-81e3-95ffcaf681a3", "any");
            ANY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ANY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "e6d29f3f-38de-4a5f-b204-5e04f31c4ada", "constraintType");
            CONSTRAINTTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CONSTRAINTTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

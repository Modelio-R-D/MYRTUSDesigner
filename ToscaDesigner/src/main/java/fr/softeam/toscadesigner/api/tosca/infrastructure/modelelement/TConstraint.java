/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 18/02/2025 10:30 by Modelio Studio.
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
@objid ("8b1e14c2-eef0-4fe7-a3d8-fe99a41635af")
public class TConstraint implements IMdaProxy {
    @objid ("95778d25-c513-4c78-aa24-cacbeef93f5d")
    public static final String STEREOTYPE_NAME = "TConstraint";

    @objid ("80aaa6b7-37b9-4d49-a5d4-fe4bc4fdb4e0")
    public static final String ANY_PROPERTY = "any";

    @objid ("24e080b7-d257-4d05-9720-52953a75b74e")
    public static final String CONSTRAINTTYPE_PROPERTY = "constraintType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("1437c185-dfcf-4034-9155-10576a5b6e7c")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("84a4e263-97f9-481d-82b7-88e2585c59bd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TConstraint.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TConstraint.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TConstraint >> then instantiate a {@link TConstraint} proxy.
     * 
     * @return a {@link TConstraint} proxy on the created {@link ModelElement}.
     */
    @objid ("4182a4fa-09d5-4af8-9317-a79fc384121f")
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
    @objid ("7fc86ad9-fb01-453f-97d2-873b1639e43f")
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
    @objid ("ad30fc3b-3f91-40af-97fb-2ee97f1801e0")
    public static TConstraint safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TConstraint.canInstantiate(obj))
        	return new TConstraint(obj);
        else
        	throw new IllegalArgumentException("TConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("45de1ffd-0095-4380-8519-c61fe2795fdb")
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
    @objid ("85da48b4-a429-46df-baf0-a529694f64ab")
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
    @objid ("506ed3d4-57ea-4a87-a28c-7a92306660e9")
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
    @objid ("e58e28c8-836f-40cd-a478-142811cc6365")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("234f5d49-dbee-4251-9d2e-31f804ac3ebc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TConstraint.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4549c1bb-bda4-4478-9687-f49b795c470b")
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
    @objid ("99f00a50-2910-4ffc-a56b-bf7ff5edde14")
    public void setConstraintType(final String value) {
        this.elt.setProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                             TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value));
    }

    @objid ("26b78a19-acaf-48c7-9a71-c853f3c8a78f")
    protected  TConstraint(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("22a574a6-4a82-487b-a1e9-752c9e8b5b46")
    public static final class MdaTypes {
        @objid ("2354ce73-4f6b-499b-9ec4-8509b36b1751")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3386e604-d0f5-4ee9-bc29-be1d1d92c997")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("05d75ed2-3118-4d9b-8057-a7a562b077e9")
        public static PropertyDefinition CONSTRAINTTYPE_PROPERTY_ELT;

        @objid ("d6cd6d79-406d-4933-ac65-253018bc9a1f")
        private static Stereotype MDAASSOCDEP;

        @objid ("17a51f6b-a266-42df-bf77-f8c00ccb9afb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("14ead289-1661-4fc3-8c66-973986b1acd2")
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

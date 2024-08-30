/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 17:44 by Modelio Studio.
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
@objid ("8797c5a5-4ea6-45dc-828c-175df53eeaa8")
public class TConstraint implements IMdaProxy {
    @objid ("01550c70-d44c-499a-9044-fb8533c746d5")
    public static final String STEREOTYPE_NAME = "TConstraint";

    @objid ("4fdd9ef8-3916-4e05-a065-017ebdbed906")
    public static final String ANY_PROPERTY = "any";

    @objid ("aa3b1244-2288-4db4-a299-5f4508c2fa81")
    public static final String CONSTRAINTTYPE_PROPERTY = "constraintType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("c04680b1-dd80-4f5b-be15-ba0e9052d44e")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("60576de6-2ef5-4e7b-92b8-738fc7546a50")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TConstraint.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TConstraint.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TConstraint >> then instantiate a {@link TConstraint} proxy.
     * 
     * @return a {@link TConstraint} proxy on the created {@link ModelElement}.
     */
    @objid ("b5b7989e-0545-44f6-bd52-4aad0cf61d20")
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
    @objid ("2fdb735f-f728-42ef-9281-7410f116040e")
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
    @objid ("bf595ae3-1625-4d7a-85f1-2c3a6e78baef")
    public static TConstraint safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TConstraint.canInstantiate(obj))
        	return new TConstraint(obj);
        else
        	throw new IllegalArgumentException("TConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("36e904bc-26f1-48c0-a9da-6e933191dde2")
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
    @objid ("0bd2d7e2-5adb-4fd4-bf05-e56d4440ce1c")
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
    @objid ("a726a812-302c-40ff-9144-4b3533616db2")
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
    @objid ("3002d3c9-085d-405e-bc42-a2a1edd4d7e2")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("65b7b27b-23f0-452d-821d-28bb87b62d91")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TConstraint.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("67432afe-3de4-44b1-9b60-212d055a8c2b")
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
    @objid ("b2b7b006-8010-4cdd-b859-3dbc5d72ddd2")
    public void setConstraintType(final String value) {
        this.elt.setProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                             TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value));
    }

    @objid ("4eac05ab-22a1-4e21-9829-cc0fc74846e3")
    protected  TConstraint(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("712667a0-1c48-48fe-a624-48dc0243794e")
    public static final class MdaTypes {
        @objid ("427d0170-5b1d-4b55-aba1-e272d77c9e46")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b4fdf478-9b60-4d79-b454-098e74f77b74")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("65bf551c-46d0-46b5-be4d-36640d4731a4")
        public static PropertyDefinition CONSTRAINTTYPE_PROPERTY_ELT;

        @objid ("2dd94508-180c-4a31-8042-f3e248f802e0")
        private static Stereotype MDAASSOCDEP;

        @objid ("d458d0d1-42df-4752-802c-0de68c7b1d5b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d17f2daf-b7af-4c56-a0bf-c700847fe6fe")
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

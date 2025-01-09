/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 12:14 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TCondition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("93819e8c-38a6-4596-98cf-f0bf66d239d5")
public class TCondition implements IMdaProxy {
    @objid ("cc6c074a-4eb0-4e46-826a-fa56ff9dcbc3")
    public static final String STEREOTYPE_NAME = "TCondition";

    @objid ("0f6a82a8-91e7-4455-a0c6-4e60db1f5819")
    public static final String ANY_PROPERTY = "any";

    @objid ("e647a6d6-f962-4f44-9727-2571b4345118")
    public static final String EXPRESSIONLANGUAGE_PROPERTY = "expressionLanguage";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("410806d6-d751-4584-948c-2e0eada501f3")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TCondition proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TCondition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5d64d0b3-9792-40ac-baf2-d0de34ab33fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TCondition.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TCondition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TCondition >> then instantiate a {@link TCondition} proxy.
     * 
     * @return a {@link TCondition} proxy on the created {@link ModelElement}.
     */
    @objid ("b2988c7b-86dd-43c9-b089-1eba8e18dbc5")
    public static TCondition create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TCondition.MdaTypes.STEREOTYPE_ELT);
        return TCondition.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TCondition} proxy from a {@link ModelElement} stereotyped << TCondition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TCondition} proxy or <i>null</i>.
     */
    @objid ("99039aea-fc0f-44fa-b227-bcb5192d6594")
    public static TCondition instantiate(final ModelElement obj) {
        return TCondition.canInstantiate(obj) ? new TCondition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCondition} proxy from a {@link ModelElement} stereotyped << TCondition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TCondition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("536b4241-58bf-4662-a04a-61b2d5f76a3d")
    public static TCondition safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TCondition.canInstantiate(obj))
        	return new TCondition(obj);
        else
        	throw new IllegalArgumentException("TCondition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bcca2dbe-cfda-46c8-bda1-98f421c47fc8")
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
        TCondition other = (TCondition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TCondition.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("89c1cbd2-1f77-4ee3-8c22-6c70dff55e8e")
    public String getAny() {
        String value = this.elt.getProperty(TCondition.MdaTypes.STEREOTYPE_ELT,
                                            TCondition.MdaTypes.ANY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCondition.MdaTypes.ANY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCondition.MdaTypes.ANY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("6ce0dc26-cb8e-4105-954a-97638b7e9d58")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TCondition.expressionLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0da9baad-1a82-42d7-b1cf-2f5aada48d07")
    public String getExpressionLanguage() {
        String value = this.elt.getProperty(TCondition.MdaTypes.STEREOTYPE_ELT,
                                            TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("3a7ade04-01bb-4c40-800c-1a59342df9c8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TCondition.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("db0f1c8e-f7cc-450f-9131-d8d6c1314fb4")
    public void setAny(final String value) {
        this.elt.setProperty(TCondition.MdaTypes.STEREOTYPE_ELT,
                             TCondition.MdaTypes.ANY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCondition.MdaTypes.ANY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCondition.expressionLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("354b0337-84f2-4c49-812b-88afce728486")
    public void setExpressionLanguage(final String value) {
        this.elt.setProperty(TCondition.MdaTypes.STEREOTYPE_ELT,
                             TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT, value));
    }

    @objid ("874e5a87-09ee-4bd5-9ab9-2d92c4c2e02a")
    protected  TCondition(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("46f9734e-ca6a-4874-915e-09c91f95b29b")
    public static final class MdaTypes {
        @objid ("c28fa183-6f1e-43c3-924e-3123bebe026b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("94d1b440-76cf-4124-b443-ccf2995affb4")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("ac9bac10-6a89-4437-9c4c-4dbb58fd25fb")
        public static PropertyDefinition EXPRESSIONLANGUAGE_PROPERTY_ELT;

        @objid ("02cfc76a-52e4-4146-82c4-428364015280")
        private static Stereotype MDAASSOCDEP;

        @objid ("24982bc8-64d0-4cf8-a92a-c0e49590cc6c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f1950c4c-ed81-429a-8606-3f8629c8eed9")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "23173eee-1647-44eb-8aad-825b079ed69f", "TCondition");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "9a036a9c-c9e9-46bd-aa0a-593f9a158d78", "any");
            ANY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ANY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "8d6a532c-5e56-4a8f-93e2-2384d66134b3", "expressionLanguage");
            EXPRESSIONLANGUAGE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (EXPRESSIONLANGUAGE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

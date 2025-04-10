/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 10:12 by Modelio Studio.
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
@objid ("d765c671-5f11-4ec2-ae0f-577b4b47e3ae")
public class TCondition implements IMdaProxy {
    @objid ("15382100-21cd-4b1d-b921-0b19d4825f09")
    public static final String STEREOTYPE_NAME = "TCondition";

    @objid ("0f320ae5-2f94-4183-b680-11fd933a33f1")
    public static final String ANY_PROPERTY = "any";

    @objid ("40ba2c7c-5513-4498-8501-8ccf1da17fe4")
    public static final String EXPRESSIONLANGUAGE_PROPERTY = "expressionLanguage";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6acbeb66-e83d-4261-ba4a-110633c6588e")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TCondition proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TCondition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e1003d26-b6e6-4464-9be6-068f23a5e9c4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TCondition.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TCondition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TCondition >> then instantiate a {@link TCondition} proxy.
     * 
     * @return a {@link TCondition} proxy on the created {@link ModelElement}.
     */
    @objid ("d3f27222-1dec-4bc7-ac7e-f83a930ab266")
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
    @objid ("29127521-48b4-41c2-97cf-982f3abe49e5")
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
    @objid ("b2bbf759-be20-472a-ac78-9946a24d850e")
    public static TCondition safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TCondition.canInstantiate(obj))
        	return new TCondition(obj);
        else
        	throw new IllegalArgumentException("TCondition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b4bf6fe6-5a53-42d2-aa4e-03d9c2521476")
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
    @objid ("8267d0d8-5fee-4585-ac40-29e28a78114d")
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
    @objid ("6984357d-51c5-4641-aa41-c4cc243b3d26")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TCondition.expressionLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9c9ca702-cf88-4e9a-a120-2c5ba371fe42")
    public String getExpressionLanguage() {
        String value = this.elt.getProperty(TCondition.MdaTypes.STEREOTYPE_ELT,
                                            TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("c46a1b5d-66ce-4bad-8ec1-4ab5f2d5b0f2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TCondition.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f950d97b-3a19-4b6a-a7e0-0bf1f8a88903")
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
    @objid ("969ad959-3ea2-4d47-a3c2-f7ecfa9f604f")
    public void setExpressionLanguage(final String value) {
        this.elt.setProperty(TCondition.MdaTypes.STEREOTYPE_ELT,
                             TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT, value));
    }

    @objid ("5e26a938-0d26-4109-9dec-a976693a3e90")
    protected  TCondition(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("eec5c688-496e-43a2-940c-fec0bc627327")
    public static final class MdaTypes {
        @objid ("7806f579-5fd4-40f9-b6d0-38a6695bab96")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f6dd0052-f841-488e-a166-b7e2e1dddf34")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("7346ef7a-eefa-44cc-b595-1f4b4e8d63e6")
        public static PropertyDefinition EXPRESSIONLANGUAGE_PROPERTY_ELT;

        @objid ("e27753cd-ee51-41e7-aff6-81bb4cf934bd")
        private static Stereotype MDAASSOCDEP;

        @objid ("0a23e74f-800f-4cd1-925d-8a76f377f18d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6730373e-b571-46b7-8670-973b8bf714d9")
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

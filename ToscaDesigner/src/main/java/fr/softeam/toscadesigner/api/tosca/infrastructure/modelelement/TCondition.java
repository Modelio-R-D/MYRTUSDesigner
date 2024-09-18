/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 12:01 by Modelio Studio.
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
    @objid ("ac9fec15-e7d6-4489-bb8f-c712e5d68418")
    public static final String STEREOTYPE_NAME = "TCondition";

    @objid ("becb29ff-a412-4b9c-8500-0199183217e3")
    public static final String ANY_PROPERTY = "any";

    @objid ("e0f22c11-0a60-45a9-968f-38a5d3d0bc79")
    public static final String EXPRESSIONLANGUAGE_PROPERTY = "expressionLanguage";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("aeecd393-3351-489e-9040-e40caa0c50b8")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TCondition proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TCondition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a435f609-0f56-4394-9573-b08a434f0d82")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TCondition.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TCondition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TCondition >> then instantiate a {@link TCondition} proxy.
     * 
     * @return a {@link TCondition} proxy on the created {@link ModelElement}.
     */
    @objid ("de9aafda-a8b7-4a6d-866d-0bd9261dc794")
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
    @objid ("e210cec9-dae2-41d5-99e5-37e863a261d8")
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
    @objid ("4425e189-cdc7-4760-beac-aab856204f2b")
    public static TCondition safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TCondition.canInstantiate(obj))
        	return new TCondition(obj);
        else
        	throw new IllegalArgumentException("TCondition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e6afce0a-44d7-40bd-b8a2-f09af0092465")
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
    @objid ("b066fd66-35b4-49bb-8954-883bc63691a2")
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
    @objid ("954ca02f-1b7f-4504-bb06-58b501776573")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TCondition.expressionLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c2da9dec-2550-4922-ad22-d520dc9a5220")
    public String getExpressionLanguage() {
        String value = this.elt.getProperty(TCondition.MdaTypes.STEREOTYPE_ELT,
                                            TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("e37259af-f009-4f3a-bf2b-1f5fd72cd336")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TCondition.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("44cc7f25-eea6-4ca0-a025-0a8bc6b538e8")
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
    @objid ("9092aac3-84c5-40b9-9dcb-509a6592410c")
    public void setExpressionLanguage(final String value) {
        this.elt.setProperty(TCondition.MdaTypes.STEREOTYPE_ELT,
                             TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT, value));
    }

    @objid ("b26f1a75-a248-4450-8a89-02c420178c39")
    protected  TCondition(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("46f9734e-ca6a-4874-915e-09c91f95b29b")
    public static final class MdaTypes {
        @objid ("65b58870-5da1-48e2-9882-5b04d42ae4f6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8259e8b9-3662-4df6-82d6-d246d718d54a")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("75509a1d-562c-4bd3-909b-308e3cf808f4")
        public static PropertyDefinition EXPRESSIONLANGUAGE_PROPERTY_ELT;

        @objid ("c140d1f1-bf9a-4ff2-89a5-2a77ea3e4ec0")
        private static Stereotype MDAASSOCDEP;

        @objid ("088bca3f-0ce3-479d-be09-303707d8e6ab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9fff6054-d712-4104-9f20-ff4161c43616")
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

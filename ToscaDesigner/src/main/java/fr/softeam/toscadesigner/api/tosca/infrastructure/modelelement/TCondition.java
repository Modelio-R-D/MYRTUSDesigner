/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/09/2024 16:32 by Modelio Studio.
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
    @objid ("818ee666-1b5e-4174-97c5-b5eb58a197a1")
    public static final String STEREOTYPE_NAME = "TCondition";

    @objid ("d1d634b2-13b1-4e52-bdad-bd47407c4951")
    public static final String ANY_PROPERTY = "any";

    @objid ("29665ee3-6eff-457a-a2a9-1cda931fb3fb")
    public static final String EXPRESSIONLANGUAGE_PROPERTY = "expressionLanguage";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("4d7edb01-94b3-43b3-908f-6c8837fbce89")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TCondition proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TCondition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c13354e6-bbda-4c67-a617-e6bc11607e67")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TCondition.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TCondition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TCondition >> then instantiate a {@link TCondition} proxy.
     * 
     * @return a {@link TCondition} proxy on the created {@link ModelElement}.
     */
    @objid ("12351b7e-f671-4b7c-a0c8-3586e4990400")
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
    @objid ("5a598fd1-643c-41af-9bf0-6a46650f01b8")
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
    @objid ("d83584f4-7388-4875-95c1-37f88c675637")
    public static TCondition safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TCondition.canInstantiate(obj))
        	return new TCondition(obj);
        else
        	throw new IllegalArgumentException("TCondition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ebb86f6e-4389-48f4-8375-e2a4125c6189")
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
    @objid ("699ccf91-c57c-4b77-b1f9-8bc12a977504")
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
    @objid ("70663506-4573-45d8-b9bd-4aeebe349c21")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TCondition.expressionLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aaaf25bf-d25c-4ce1-9832-db10951efc3e")
    public String getExpressionLanguage() {
        String value = this.elt.getProperty(TCondition.MdaTypes.STEREOTYPE_ELT,
                                            TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("92927ccc-ae58-45bf-91f4-04a7af81a347")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TCondition.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3eb5a7de-c1c4-48cf-952b-22d241e02f6e")
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
    @objid ("962abd8d-7e4a-461b-b970-99049f5967b7")
    public void setExpressionLanguage(final String value) {
        this.elt.setProperty(TCondition.MdaTypes.STEREOTYPE_ELT,
                             TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT, value));
    }

    @objid ("42ae4cb6-4336-4cc1-a7df-3b830b5d3019")
    protected  TCondition(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("46f9734e-ca6a-4874-915e-09c91f95b29b")
    public static final class MdaTypes {
        @objid ("9d9a7dc4-0e81-4c7a-a1b2-a2958d9e4365")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("77be3d33-861a-472d-a100-bd5589a701a1")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("7e231383-eddc-466f-8225-09715e539aa9")
        public static PropertyDefinition EXPRESSIONLANGUAGE_PROPERTY_ELT;

        @objid ("0f338c53-f02c-4a39-b9e0-091a9cbb45f7")
        private static Stereotype MDAASSOCDEP;

        @objid ("fefdb165-4574-470b-b14d-df5845e900cd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2c898202-18c2-48fe-a61d-3b339b5c03a9")
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

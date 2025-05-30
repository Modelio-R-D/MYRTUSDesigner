/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 22/05/2025 15:07 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.List;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link ModelElement} with << TCondition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d765c671-5f11-4ec2-ae0f-577b4b47e3ae")
public class TCondition implements IMdaProxy {
    @objid ("cdb6f68d-ad3d-493d-8e04-bd9feb7ba9e8")
    public static final String STEREOTYPE_NAME = "TCondition";

    @objid ("c397456c-610b-4363-af4e-3fbcce3f8e09")
    public static final String ANY_PROPERTY = "any";

    @objid ("ba54f8b8-946c-4752-9870-27cc142784b1")
    public static final String EXPRESSIONLANGUAGE_PROPERTY = "expressionLanguage";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("207f5ebd-5c12-430d-a02a-7e0f7a929559")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TCondition proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TCondition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9f014675-c291-4b20-9bfb-5d951854c92f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TCondition.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TCondition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TCondition >> then instantiate a {@link TCondition} proxy.
     * 
     * @return a {@link TCondition} proxy on the created {@link ModelElement}.
     */
    @objid ("5e768d09-515d-43de-a89b-92bfd5cab966")
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
    @objid ("8818386d-a082-436e-8620-15f34525f932")
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
    @objid ("612faf8f-9ff5-4e16-a25c-8e4c8b0e8eb9")
    public static TCondition safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TCondition.canInstantiate(obj))
        	return new TCondition(obj);
        else
        	throw new IllegalArgumentException("TCondition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7e0e1f84-ff9b-473b-a781-065335d2bcdf")
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
    @objid ("5a85acef-f856-4829-b5b0-25e5e865d137")
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
    @objid ("f0ad8957-79c0-4683-a502-2ea5d0281087")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TCondition.expressionLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3a398451-c3b7-429a-a710-4f81d8b4efa4")
    public String getExpressionLanguage() {
        String value = this.elt.getProperty(TCondition.MdaTypes.STEREOTYPE_ELT,
                                            TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("c1ad319d-92b8-4879-92cc-42982c1e16cc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TCondition.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c7e4e497-8578-4774-aa2a-5593d17dc7e5")
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
    @objid ("fb0f08e8-9695-4d7c-90ce-5b59eb18355f")
    public void setExpressionLanguage(final String value) {
        this.elt.setProperty(TCondition.MdaTypes.STEREOTYPE_ELT,
                             TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCondition.MdaTypes.EXPRESSIONLANGUAGE_PROPERTY_ELT, value));
    }

    @objid ("888e7486-01bb-4bf4-a1a7-d6b7301d5dba")
    protected  TCondition(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("eec5c688-496e-43a2-940c-fec0bc627327")
    public static final class MdaTypes {
        @objid ("6ea84486-743f-4266-acc6-d0b49e31dc7d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("80e45dbf-7c1f-4537-a05f-c067d58ccf40")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("bab477af-0123-44ce-966b-3582e1794ccf")
        public static PropertyDefinition EXPRESSIONLANGUAGE_PROPERTY_ELT;

        @objid ("62783770-30a3-433a-8ddc-52f6f7fd522c")
        private static Stereotype MDAASSOCDEP;

        @objid ("7b8b9c56-94c6-4ddf-881a-0cdf35ba1399")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7845ef9d-c6c1-4e4b-a41d-3f0972fba706")
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

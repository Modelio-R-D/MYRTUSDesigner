/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/09/2024 10:28 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Attribute} with << TRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4227ef12-f706-4f1e-bf28-70cf6fdeb36f")
public class TRequirement implements IMdaProxy {
    @objid ("dffd1b0f-8af2-45a0-87ec-f10d01c0231d")
    public static final String STEREOTYPE_NAME = "TRequirement";

    @objid ("fe46db8e-1d57-4589-a1e5-86ceea70d9d9")
    public static final String CAPABILITY_PROPERTY = "capability";

    @objid ("2d8bc239-848e-4680-9f94-f30b80d45206")
    public static final String NODE_PROPERTY = "node";

    @objid ("17042ff9-8065-44e1-a5c8-053289eb5f16")
    public static final String REQUIREMENTDEF_PROPERTY = "requirementDef";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("fc629a31-5cc7-47db-8ace-064d2d768107")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("32fde1f2-253e-4e75-898c-f358f5bce4e3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TRequirement.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TRequirement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TRequirement >> then instantiate a {@link TRequirement} proxy.
     * 
     * @return a {@link TRequirement} proxy on the created {@link Attribute}.
     */
    @objid ("285b16c3-c51e-4a2a-a8b8-efa42c72a5a9")
    public static TRequirement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(TRequirement.MdaTypes.STEREOTYPE_ELT);
        return TRequirement.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link TRequirement} proxy from a {@link Attribute} stereotyped << TRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link TRequirement} proxy or <i>null</i>.
     */
    @objid ("ec259129-c00b-4074-80d7-55064f28e34d")
    public static TRequirement instantiate(final Attribute obj) {
        return TRequirement.canInstantiate(obj) ? new TRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirement} proxy from a {@link Attribute} stereotyped << TRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fae36769-a8fa-4818-b9f6-5eaaeaa2d875")
    public static TRequirement safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TRequirement.canInstantiate(obj))
        	return new TRequirement(obj);
        else
        	throw new IllegalArgumentException("TRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b0e87290-cbd6-45a7-abd9-29670b15272f")
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
        TRequirement other = (TRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TRequirement.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9d920d46-edd6-4207-9994-4a922a4f99db")
    public String getCapability() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("73c6171e-5fe2-4a7a-b33d-0d6491884021")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirement.node'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("15b853bd-4bd3-4cab-81b5-525dcdd8fc45")
    public String getNode() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.NODE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.NODE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.NODE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRequirement.requirementDef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a7e5b4e4-dd65-4a1d-9f1b-57bed7b2376c")
    public String getRequirementDef() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("533fb8b6-c505-4883-9c35-fdfc3abf1f87")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirement.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4a1b157b-3662-4f6b-9846-8243101d93b4")
    public void setCapability(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirement.node'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8f9731df-b8f7-4ed9-bf5a-31787632c433")
    public void setNode(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.NODE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.NODE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirement.requirementDef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c35edfd4-b9f5-40e6-b954-9f1f12dec76e")
    public void setRequirementDef(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT, value));
    }

    @objid ("21bd285b-4b14-4309-af54-aa172e228e0e")
    protected  TRequirement(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("330e4713-4f21-4a54-9a2a-3083028517ba")
    public static final class MdaTypes {
        @objid ("641b78cd-ac06-4125-97fd-543234be67be")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("120aae31-972d-4bd4-b12e-cdce9332537c")
        public static PropertyDefinition REQUIREMENTDEF_PROPERTY_ELT;

        @objid ("4887d2e7-ed41-458f-bb1f-c7255409a3c3")
        public static PropertyDefinition NODE_PROPERTY_ELT;

        @objid ("3e3700d5-861d-44c6-90ee-366c29bea29f")
        public static PropertyDefinition CAPABILITY_PROPERTY_ELT;

        @objid ("eac0cc88-d6ae-4d73-bb8f-d4511c88a927")
        private static Stereotype MDAASSOCDEP;

        @objid ("1d45563b-3c90-42b4-a6e7-0818f84e27f5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ede947d6-2822-4c17-a264-0c2dc650c4c4")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2a38f650-7f59-41a7-a928-ac9cbe326f84", "TRequirement");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "95a52b2f-43dd-469a-b6da-a187ef6573a1", "requirementDef");
            REQUIREMENTDEF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIREMENTDEF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "9b71e3fd-b9be-40ac-8927-65d4c036620d", "node");
            NODE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NODE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a2fbc97c-1332-41c8-be52-510fbfcb4bf2", "capability");
            CAPABILITY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CAPABILITY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

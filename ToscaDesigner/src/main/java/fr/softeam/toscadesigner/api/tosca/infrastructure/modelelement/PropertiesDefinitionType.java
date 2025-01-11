/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 16:04 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << PropertiesDefinitionType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e355a5a8-2254-41ae-ae4c-f21c6da25a45")
public class PropertiesDefinitionType implements IMdaProxy {
    @objid ("d7eb7e84-e7d2-4160-a0d3-54eb35505172")
    public static final String STEREOTYPE_NAME = "PropertiesDefinitionType";

    @objid ("ea859dc0-7e35-40c2-81d3-bcb6ff2f350c")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("0d7ddaca-b299-431e-97de-c3dee7d3391d")
    public static final String ELEMENT_PROPERTY_PROPERTY = "element_property";

    @objid ("c64f857b-6761-4d7e-b6e6-3fa737ca1993")
    public static final String REQUIRED_PROPERTY = "required";

    @objid ("52cad883-8757-4c29-bbd6-dc46e5c63941")
    public static final String TYPE_PROPERTY = "type";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("5a34e042-f06a-4366-94ba-6ed2e1e52b2b")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertiesDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertiesDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ca2a658c-2118-4944-9e36-d6c0c510f7d8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertiesDefinitionType >> then instantiate a {@link PropertiesDefinitionType} proxy.
     * 
     * @return a {@link PropertiesDefinitionType} proxy on the created {@link ModelElement}.
     */
    @objid ("1fe0a071-80e4-4b8f-a85d-d31c6f4f81cc")
    public static PropertiesDefinitionType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT);
        return PropertiesDefinitionType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PropertiesDefinitionType} proxy from a {@link ModelElement} stereotyped << PropertiesDefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PropertiesDefinitionType} proxy or <i>null</i>.
     */
    @objid ("1163eaa4-5c77-499c-9376-aee64674c2a9")
    public static PropertiesDefinitionType instantiate(final ModelElement obj) {
        return PropertiesDefinitionType.canInstantiate(obj) ? new PropertiesDefinitionType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertiesDefinitionType} proxy from a {@link ModelElement} stereotyped << PropertiesDefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PropertiesDefinitionType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("442f835c-a4ec-45d4-97ae-192441d69d8e")
    public static PropertiesDefinitionType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertiesDefinitionType.canInstantiate(obj))
        	return new PropertiesDefinitionType(obj);
        else
        	throw new IllegalArgumentException("PropertiesDefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b0c4575a-07ce-41be-a4d3-205a901f69e6")
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
        PropertiesDefinitionType other = (PropertiesDefinitionType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'PropertiesDefinitionType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6a76075c-1a3c-4b76-a271-19c0b86308c5")
    public String getDescription() {
        String value = this.elt.getProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesDefinitionType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesDefinitionType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesDefinitionType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("bc416cd8-59f1-43a4-9a83-a2f4cb929bc1")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertiesDefinitionType.element_property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e98064d7-287a-4e8e-af8e-d6f5c616e367")
    public String getElement_property() {
        String value = this.elt.getProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesDefinitionType.MdaTypes.ELEMENT_PROPERTY_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesDefinitionType.MdaTypes.ELEMENT_PROPERTY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesDefinitionType.MdaTypes.ELEMENT_PROPERTY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'PropertiesDefinitionType.required'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("86606efd-c687-4a27-a8b3-e990da6173ab")
    public Boolean getRequired() {
        String value = this.elt.getProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(PropertiesDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'PropertiesDefinitionType.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b432e0d1-6c89-4580-92ab-2bae0f40ef47")
    public String getType() {
        String value = this.elt.getProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("c36b1d78-16fc-4a78-9202-aa478439e822")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'PropertiesDefinitionType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4ada4bd1-d3b7-4b44-bfca-dcef74576a14")
    public void setDescription(final String value) {
        this.elt.setProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                             PropertiesDefinitionType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesDefinitionType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'PropertiesDefinitionType.element_property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("87a5ca27-f94f-4630-8735-260bec59555d")
    public void setElement_property(final String value) {
        this.elt.setProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                             PropertiesDefinitionType.MdaTypes.ELEMENT_PROPERTY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesDefinitionType.MdaTypes.ELEMENT_PROPERTY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'PropertiesDefinitionType.required'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("28d9fb39-9698-4c1e-9e5e-2dc3ea5d49c7")
    public void setRequired(final Boolean value) {
        this.elt.setProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                             PropertiesDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'PropertiesDefinitionType.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b9795ac9-c27d-48f5-8f13-ae9bd05d9029")
    public void setType(final String value) {
        this.elt.setProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                             PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("4f9daf8b-01d8-4775-9e77-a5cb7acc65ae")
    protected  PropertiesDefinitionType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("312989d6-8ef3-47a1-adc6-884399e7fa89")
    public static final class MdaTypes {
        @objid ("8008d60d-212f-446c-b600-df2e330dceba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("13175d8d-9cb4-4b75-b889-b1df20f9ad90")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("f745f7a0-f4be-4e2d-b19e-f4d4893d35bf")
        public static PropertyDefinition ELEMENT_PROPERTY_PROPERTY_ELT;

        @objid ("a7483dc6-eb3a-4798-9da3-baac9313d718")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("64764434-eb26-4924-b4f7-180b6ca1300e")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("c0a90d28-a1ad-4644-b276-99cb896dc8e3")
        private static Stereotype MDAASSOCDEP;

        @objid ("2d7dc4f6-5701-46d2-8f1d-70d595332aa2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44e4f4b7-1f77-40e5-862c-3aaeb470989c")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7ecb11d2-75ea-4784-a37c-8b9bf860e0c5", "PropertiesDefinitionType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "7ac74fca-52c6-4481-90a2-bb03560bb8e5", "type");
            TYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "1f0d4780-9aa3-4766-aa1b-a9bd0c5adc4a", "element_property");
            ELEMENT_PROPERTY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ELEMENT_PROPERTY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "0374144b-a1c1-40d4-9927-a5fd77ccd5e5", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "c7ba08ca-428f-422d-b74d-69dda506bb94", "required");
            REQUIRED_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIRED_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

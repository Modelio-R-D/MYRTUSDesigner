/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 20/08/2024 17:06 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TEntityTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bf9303b1-8a37-41ad-b5fc-a178c8fab98e")
public class TEntityTemplate extends TExtensibleElements implements IMdaProxy {
    @objid ("ace95223-7988-40d5-aa5d-5bd3204e3dcb")
    public static final String STEREOTYPE_NAME = "TEntityTemplate";

    @objid ("81309661-448b-44d9-92a9-0674a0a4656d")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("a8d96bd7-e573-4247-a34f-9ad3a829958a")
    public static final String ID_PROPERTY = "id";

    @objid ("9af3a75b-3d3b-46fb-8f3e-5870d4a5306c")
    public static final String PROPERTIES_PROPERTY = "properties";

    @objid ("231ba13d-71cb-42ce-8360-bcad207c3bfc")
    public static final String PROPERTYCONSTRAINTS_PROPERTY = "propertyConstraints";

    @objid ("8424cceb-6d10-40ce-8dea-3c6b562e72cc")
    public static final String TYPE_PROPERTY = "type";

    /**
     * Tells whether a {@link TEntityTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TEntityTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2a04c495-d92b-4385-a5e6-8afb2a9eb842")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TEntityTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TEntityTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TEntityTemplate >> then instantiate a {@link TEntityTemplate} proxy.
     * 
     * @return a {@link TEntityTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("da11823a-b060-4cd2-9ae0-00121f9ba987")
    public static TEntityTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TEntityTemplate.MdaTypes.STEREOTYPE_ELT);
        return TEntityTemplate.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TEntityTemplate} proxy from a {@link ModelElement} stereotyped << TEntityTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TEntityTemplate} proxy or <i>null</i>.
     */
    @objid ("28980a34-a137-41df-b745-e70b3a3e0aa3")
    public static TEntityTemplate instantiate(final ModelElement obj) {
        return TEntityTemplate.canInstantiate(obj) ? new TEntityTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TEntityTemplate} proxy from a {@link ModelElement} stereotyped << TEntityTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TEntityTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6b3ab4f2-6117-4415-88df-819ce47117bf")
    public static TEntityTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TEntityTemplate.canInstantiate(obj))
        	return new TEntityTemplate(obj);
        else
        	throw new IllegalArgumentException("TEntityTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f3f2d3da-1d59-460a-8b4a-e822cb44fc66")
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
        TEntityTemplate other = (TEntityTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TEntityTemplate.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cc4dc8d5-d9bc-446b-8484-fa6c77eec529")
    public String getDescription() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("be907c2a-4092-45e3-9c3e-4f4f34c3a11a")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TEntityTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b9dca85a-45bf-45fa-a0b2-d2395b7c0bd9")
    public String getId() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.ID_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.ID_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.ID_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityTemplate.properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("702e4465-8126-458c-a416-ed6ff8a43c25")
    public String getProperties() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.PROPERTIES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.PROPERTIES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.PROPERTIES_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityTemplate.propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e0a10bd4-5f4e-405f-8a4b-89b7ebba554b")
    public String getPropertyConstraints() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityTemplate.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7e92001c-b985-43c1-a7c1-fed27860ff42")
    public String getType() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("750cad49-601b-47f8-a8dc-7313998c6717")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TEntityTemplate.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fe0952c3-ce60-448f-8bef-08d8dd7d68eb")
    public void setDescription(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("28d611af-6fb1-4d33-9631-cfe74c9450ef")
    public void setId(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.ID_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.ID_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityTemplate.properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7dd8aeb3-d3d2-41e8-acf1-642a982d2611")
    public void setProperties(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.PROPERTIES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.PROPERTIES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityTemplate.propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("74776d81-d096-4dad-b7fe-c99d9394f32c")
    public void setPropertyConstraints(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityTemplate.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e5c0014a-5a88-4769-973d-0fbd98b53ceb")
    public void setType(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("a82184bb-97e1-4702-89d3-a3b35f23ea87")
    protected  TEntityTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("a9fbeafb-2ffa-4300-9873-116c7717ab8f")
    public static final class MdaTypes {
        @objid ("113dfa14-91f4-4496-a293-01b5b9397e24")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4c954881-9ff7-444a-a7b1-a52f3842eada")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("1c082d74-125d-4a9c-bd42-5747d4e4c405")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("8ee73f92-ff54-4dc6-9856-66e7dce5a51c")
        public static PropertyDefinition PROPERTIES_PROPERTY_ELT;

        @objid ("7a21a86e-7f9a-484f-9f74-7560792829aa")
        public static PropertyDefinition PROPERTYCONSTRAINTS_PROPERTY_ELT;

        @objid ("a07bddd9-74f3-4797-9f41-867e81dd6798")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("14f8ebaf-3751-491e-b845-67a9863de1e2")
        private static Stereotype MDAASSOCDEP;

        @objid ("c3f2bf72-0a4b-4b54-86a4-126c7245ad9b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c4a869fc-ddcd-479d-8fbf-f93603e940a7")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "a32cca04-f738-421e-b834-b0f13524e19e", "TEntityTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "08cf32f2-2ecf-4716-9cdc-57e005f102f4", "id");
            ID_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ID_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "81ce7b34-f210-44ca-aa8e-ea79ded8c354", "type");
            TYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "c002b78d-ef37-4be9-a9a3-01222916e38c", "properties");
            PROPERTIES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTIES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "3f291b75-a5ed-4de1-841e-0cdf4bdc3ba7", "propertyConstraints");
            PROPERTYCONSTRAINTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTYCONSTRAINTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "2c03e40a-2b38-45bc-b8a5-84369f877275", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

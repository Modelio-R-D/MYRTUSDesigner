/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 12:38 by Modelio Studio.
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
@objid ("0b49d91c-2cd5-4bf0-b5b2-148cef59883d")
public class TEntityTemplate extends TExtensibleElements implements IMdaProxy {
    @objid ("cb2c4029-54a5-4392-ad46-b14e157a82af")
    public static final String STEREOTYPE_NAME = "TEntityTemplate";

    @objid ("27f61106-2153-4090-b348-a31e0cd402e3")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("a6200fdd-6678-4bb2-b0b6-a6e840e379a5")
    public static final String ID_PROPERTY = "id";

    @objid ("1ef23305-9eff-467d-b41d-f6963aeedbc0")
    public static final String PROPERTIES_PROPERTY = "properties";

    @objid ("b243372b-acfa-4776-bc83-4dc646ef2310")
    public static final String PROPERTYCONSTRAINTS_PROPERTY = "propertyConstraints";

    @objid ("6564e7cd-88c9-4253-9d16-cddb531f983e")
    public static final String TYPE_PROPERTY = "type";

    /**
     * Tells whether a {@link TEntityTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TEntityTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("238e65bc-eac0-4e38-9418-c1579d64a51f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TEntityTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TEntityTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TEntityTemplate >> then instantiate a {@link TEntityTemplate} proxy.
     * 
     * @return a {@link TEntityTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("4566b88c-b1a5-49fd-a3ca-38240f7f19ca")
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
    @objid ("35ef049a-4be1-4546-be47-dd78db5f03cb")
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
    @objid ("0c8e30bb-df44-4167-ab3a-ae71da11f7ac")
    public static TEntityTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TEntityTemplate.canInstantiate(obj))
        	return new TEntityTemplate(obj);
        else
        	throw new IllegalArgumentException("TEntityTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0c098286-5864-4599-87af-ac91409d6544")
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
    @objid ("887e6725-0b2e-46eb-936b-6a84dc95bd93")
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
    @objid ("9543ff6c-c611-480a-be49-820dce12cc1f")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TEntityTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a91b57d7-1a0b-46f5-93a7-f1ef2dbcb31e")
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
    @objid ("2d3e9714-fa07-456f-a889-67242344d1e2")
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
    @objid ("4273beaa-ddb0-40cc-b148-d329a241ca6c")
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
    @objid ("0e50783b-a46a-49a6-b4d6-44d8236460d2")
    public String getType() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("653bf97d-cdc2-451d-a2cd-bffb4e530dd2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TEntityTemplate.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("545c6852-a0c2-4b43-9353-0893f6ea52c3")
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
    @objid ("c6b89672-aed5-4b44-bdac-3daf4c3d8291")
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
    @objid ("3f9672a8-0f58-4233-99bc-fb063a445736")
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
    @objid ("f1a438df-f61a-4dd2-89aa-7a01575f0686")
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
    @objid ("b105875f-d23b-430c-ac0b-96699b18f35d")
    public void setType(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("f2205299-1010-4470-9062-2364ea7efbb0")
    protected  TEntityTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("588d5c3b-fe99-4461-8677-0c884d4f904f")
    public static final class MdaTypes {
        @objid ("c077c78a-3c9c-49cf-a914-e2a2b8fe93c0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2da5f158-e787-43da-9ff2-1be646ac1c8f")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("7b8aa5ec-f7e8-425b-8db5-7a68341bc93f")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("e1a4512f-0e59-4d44-b3b3-2750eba087d0")
        public static PropertyDefinition PROPERTIES_PROPERTY_ELT;

        @objid ("402f6a6f-e785-49d2-8206-35d1c89f4572")
        public static PropertyDefinition PROPERTYCONSTRAINTS_PROPERTY_ELT;

        @objid ("fde416ca-2df7-466e-857d-ed448f0a3bbf")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("4e3232a3-0798-417e-bbfd-ea88130cb65d")
        private static Stereotype MDAASSOCDEP;

        @objid ("70695c91-c1cd-466d-856a-c0aa49ba2810")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1e95b9f4-7e9b-44de-a29c-a208f008f256")
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

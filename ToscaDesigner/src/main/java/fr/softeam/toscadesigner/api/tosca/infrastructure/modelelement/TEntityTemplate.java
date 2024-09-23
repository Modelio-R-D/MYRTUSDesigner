/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 23/09/2024 12:50 by Modelio Studio.
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
    @objid ("4ad87585-bcb6-4b99-b214-1fc60be645e7")
    public static final String STEREOTYPE_NAME = "TEntityTemplate";

    @objid ("4c36a934-f726-4149-b812-443838af26ca")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("7a83ee5a-4193-4ee6-a506-043e49b29653")
    public static final String ID_PROPERTY = "id";

    @objid ("1e46ff6b-f2fb-4235-809a-b53cfe85ee2f")
    public static final String PROPERTIES_PROPERTY = "properties";

    @objid ("4ef39107-c5de-426a-b3ca-0354a356c4db")
    public static final String PROPERTYCONSTRAINTS_PROPERTY = "propertyConstraints";

    @objid ("3b2559f9-32f0-441d-9579-f86c876e1b93")
    public static final String TYPE_PROPERTY = "type";

    /**
     * Tells whether a {@link TEntityTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TEntityTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c1ac0e8d-d299-4be8-9290-932d4bcdd5cd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TEntityTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TEntityTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TEntityTemplate >> then instantiate a {@link TEntityTemplate} proxy.
     * 
     * @return a {@link TEntityTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("325f5b81-b391-42e8-aa5b-581546e74597")
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
    @objid ("0ec19938-d95c-4b71-a53f-503a783bca42")
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
    @objid ("03225159-71dd-456a-9df4-9677e782a11a")
    public static TEntityTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TEntityTemplate.canInstantiate(obj))
        	return new TEntityTemplate(obj);
        else
        	throw new IllegalArgumentException("TEntityTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("56794aeb-556c-46e1-9bce-0f6bfd452ab6")
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
    @objid ("062da37a-f11b-4d78-9916-7fcf0d8828dc")
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
    @objid ("c715145d-5a3f-48a2-be0c-91370000c0ed")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TEntityTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("39da6c93-80b1-4e0f-b40a-6a8142d6812c")
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
    @objid ("e70f06e5-8b97-4f2c-a03b-01d1afcc6fd1")
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
    @objid ("19b360a0-183a-4dd9-bc0d-a32a51716652")
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
    @objid ("1d8e9eba-4542-4400-939f-ff03e6c50531")
    public String getType() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("a14b7e90-9c84-4cdc-9c6b-4889db8de060")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TEntityTemplate.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1526bd3a-b501-4ffc-aed4-2da742497da5")
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
    @objid ("bb9e0d63-2dcc-48ed-9531-17204242c15e")
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
    @objid ("976dfb53-e5f2-4bb0-a2bc-43ab8c634ea0")
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
    @objid ("1c0af66f-8ba3-4ff3-a7bd-a1a86aa935fa")
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
    @objid ("fb6ee557-9e8b-48c1-991b-ce1647288576")
    public void setType(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("91abb00a-b9f8-4e06-817e-e9296c061810")
    protected  TEntityTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("588d5c3b-fe99-4461-8677-0c884d4f904f")
    public static final class MdaTypes {
        @objid ("399f1fb9-01fd-4d65-a924-e51b1898217d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b9e5d1aa-e592-4ab2-bfdb-9b0fd59bb8af")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("6bda3b62-72f3-4956-8e14-ae29767cdd25")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("6d2b3e0b-e078-43d9-9791-cea087605396")
        public static PropertyDefinition PROPERTIES_PROPERTY_ELT;

        @objid ("7f0da6fb-2cf9-404e-a2b3-ded41bef9b84")
        public static PropertyDefinition PROPERTYCONSTRAINTS_PROPERTY_ELT;

        @objid ("087410b7-00eb-4c36-a3f3-e5f95d3b894c")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("ac42f887-2899-480d-964c-67034f4d3a94")
        private static Stereotype MDAASSOCDEP;

        @objid ("64ee9438-5079-4e55-9f55-f1a0a7f351e8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a3c53f43-e1d7-4a0f-af3c-425855a7d070")
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

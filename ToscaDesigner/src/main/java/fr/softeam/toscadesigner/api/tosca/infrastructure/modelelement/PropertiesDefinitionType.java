/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 15:39 by Modelio Studio.
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
@objid ("ec635d3d-383b-4721-a044-086713ea1b46")
public class PropertiesDefinitionType implements IMdaProxy {
    @objid ("02a9a145-d008-4b4f-a083-84ea03b73d3c")
    public static final String STEREOTYPE_NAME = "PropertiesDefinitionType";

    @objid ("b62301ea-9f7b-4283-896e-582b6cf24b44")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("0c154cdd-9b19-44e6-b4af-33ee6822a5b4")
    public static final String ELEMENT_PROPERTY_PROPERTY = "element_property";

    @objid ("529b8552-faf5-465b-81f7-63b3abf299d0")
    public static final String REQUIRED_PROPERTY = "required";

    @objid ("1c4fe40f-5881-4970-831f-d59e21bb33be")
    public static final String TYPE_PROPERTY = "type";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("35d107ab-8a90-4514-87c2-781bff0c376e")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertiesDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertiesDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("360c5e46-37d6-49a1-8211-b9aee31cb2be")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertiesDefinitionType >> then instantiate a {@link PropertiesDefinitionType} proxy.
     * 
     * @return a {@link PropertiesDefinitionType} proxy on the created {@link ModelElement}.
     */
    @objid ("aed46c51-7c02-45c7-a7fe-9d799e9401a8")
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
    @objid ("9080b651-4e52-4c44-9f67-78b2a5220b90")
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
    @objid ("e456e533-8a47-440a-8465-af8ce1215417")
    public static PropertiesDefinitionType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertiesDefinitionType.canInstantiate(obj))
        	return new PropertiesDefinitionType(obj);
        else
        	throw new IllegalArgumentException("PropertiesDefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7f1b962c-2000-4992-8d34-a6f771c3f3dd")
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
    @objid ("61321b64-bd90-454d-8057-5f1629a69587")
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
    @objid ("41ed4f4c-81fe-4679-9e4c-5514d59053a4")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertiesDefinitionType.element_property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6871f925-c9ac-4376-bb9b-9d2a0107405e")
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
    @objid ("a4b2dbff-fefe-4c65-b776-4468c50408e6")
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
    @objid ("62a89ec6-88e2-4979-8365-6f0a47438703")
    public String getType() {
        String value = this.elt.getProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("260442c6-921c-429b-9951-8d4e3ea16624")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'PropertiesDefinitionType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c540fadc-5e35-45aa-8d8d-574166b1753b")
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
    @objid ("e6c5b6cd-c1c5-477c-83f3-24203984357b")
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
    @objid ("605a5c4e-51aa-439a-bf5e-d743b4f56a34")
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
    @objid ("d796e43a-3b84-4cb8-a7ae-ac1c960e7554")
    public void setType(final String value) {
        this.elt.setProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                             PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("9dba3b4a-c23d-42eb-bbf7-710013630cc4")
    protected  PropertiesDefinitionType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("7b63e436-b7d8-4549-b266-af8b74f65c3c")
    public static final class MdaTypes {
        @objid ("7536d3dd-9465-4a2d-8b92-058a653f6c64")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d64d8b66-1bdd-4139-be13-616fdf057ab5")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("8fdd5ee1-333d-4a80-9dcb-4270173a41a4")
        public static PropertyDefinition ELEMENT_PROPERTY_PROPERTY_ELT;

        @objid ("5b073ab7-9e8f-4cc8-90ab-614dfb707fd7")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("f969f64f-e599-429b-bd1b-5878c0f34aa2")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("e0cd14e5-52dd-40ff-9702-5d3200f0468c")
        private static Stereotype MDAASSOCDEP;

        @objid ("cdcdcab0-7d8b-447d-b1ca-29559389efd4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f4a6a672-dab2-46b4-877f-e01b7fe9074c")
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

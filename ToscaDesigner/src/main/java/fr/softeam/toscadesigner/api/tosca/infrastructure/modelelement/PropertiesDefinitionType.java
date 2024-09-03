/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 15:34 by Modelio Studio.
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
@objid ("4ed840b8-027b-48da-b2d7-451260fe1618")
public class PropertiesDefinitionType implements IMdaProxy {
    @objid ("dbc05cb4-50ce-4920-9219-34cecca97671")
    public static final String STEREOTYPE_NAME = "PropertiesDefinitionType";

    @objid ("0668628a-6a6c-4732-a3de-f9dc793b4684")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("d6c9ba11-48a7-4d34-b6ee-b65741a2642c")
    public static final String ELEMENT_PROPERTY_PROPERTY = "element_property";

    @objid ("00e97646-c31c-4918-a667-449b62f54c28")
    public static final String REQUIRED_PROPERTY = "required";

    @objid ("71e8ea15-3385-4da9-a74e-2e9ee3eb2ecf")
    public static final String TYPE_PROPERTY = "type";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("d0bdda20-1a79-4a71-9a36-33fe9f357142")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertiesDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertiesDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e003adf4-d4e3-429b-ba76-cb07e2ae6b45")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertiesDefinitionType >> then instantiate a {@link PropertiesDefinitionType} proxy.
     * 
     * @return a {@link PropertiesDefinitionType} proxy on the created {@link ModelElement}.
     */
    @objid ("1ed5cadd-76ed-40f8-9637-7f1bc219b128")
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
    @objid ("65807f2b-b49a-40a7-a061-078d308f2f98")
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
    @objid ("e2a2d754-7de4-483b-a4d9-3e0218b71ec3")
    public static PropertiesDefinitionType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertiesDefinitionType.canInstantiate(obj))
        	return new PropertiesDefinitionType(obj);
        else
        	throw new IllegalArgumentException("PropertiesDefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("59191500-14b4-48bc-b097-2efef79ff743")
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
    @objid ("e5bce226-f712-4f01-b504-d6855bc6c753")
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
    @objid ("b754cce8-1f20-4878-afdb-cf39055a9607")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertiesDefinitionType.element_property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eace3828-a876-4ed0-9517-73b8423daa01")
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
    @objid ("be67aacd-ef8c-4743-b14e-cae4f9cbe714")
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
    @objid ("27d70046-c5ec-43ea-8fd1-30727478c4a5")
    public String getType() {
        String value = this.elt.getProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("34f8b3bc-33cc-4748-9ec1-eaa42dd69567")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'PropertiesDefinitionType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d9b96315-d24c-40cd-a833-32357dee3030")
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
    @objid ("301ba7ff-707e-47cc-b70a-94cb110da86d")
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
    @objid ("892ffd0c-55de-4ce9-8c0a-87c6e5f6f471")
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
    @objid ("265e0421-dd47-4deb-8c2e-0198fde5d584")
    public void setType(final String value) {
        this.elt.setProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                             PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("6c48f9d5-63a9-4e48-8bc4-cc427772121f")
    protected  PropertiesDefinitionType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("c1775e19-b9b9-44ba-8157-9260c3d30149")
    public static final class MdaTypes {
        @objid ("9f96b2cf-6ae4-4198-93b9-05476d892564")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("58638916-70ad-4e12-bc36-7a3ddae56139")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("8a62b17c-f285-4186-bb2f-eee68264ab7e")
        public static PropertyDefinition ELEMENT_PROPERTY_PROPERTY_ELT;

        @objid ("83119ac9-6e24-4ee0-bba7-b19263a1639e")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("9cb96259-93f1-44d2-b5db-a5a01ffbd134")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("4b1d51b8-e8e6-48f6-a026-30d8cfea801a")
        private static Stereotype MDAASSOCDEP;

        @objid ("0fc3915e-054c-4c93-942d-bdb6d97f36f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("482ee69e-7ad4-430d-9a9b-5e97b3c740e5")
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

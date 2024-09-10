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
 * Proxy class to handle a {@link ModelElement} with << PropertiesDefinitionType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e355a5a8-2254-41ae-ae4c-f21c6da25a45")
public class PropertiesDefinitionType implements IMdaProxy {
    @objid ("0ff16c42-6f35-4c7c-ae5a-139e861f12c6")
    public static final String STEREOTYPE_NAME = "PropertiesDefinitionType";

    @objid ("56ea7e80-6190-4423-a447-1e6754631017")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("487266a7-0406-47fa-a2a0-3db1455a7043")
    public static final String ELEMENT_PROPERTY_PROPERTY = "element_property";

    @objid ("20f6aa4f-a063-4203-948d-f4d77ca98e03")
    public static final String REQUIRED_PROPERTY = "required";

    @objid ("ad300cf8-4214-4707-a23a-8751da07e1d9")
    public static final String TYPE_PROPERTY = "type";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("111ad9c0-3c3f-48c7-b947-da1eaa200075")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertiesDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertiesDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3833f61b-1bdc-4923-8a7b-9a8a6cfe6e43")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertiesDefinitionType >> then instantiate a {@link PropertiesDefinitionType} proxy.
     * 
     * @return a {@link PropertiesDefinitionType} proxy on the created {@link ModelElement}.
     */
    @objid ("589b54c9-219f-48f7-b8e7-7ee3181b30cb")
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
    @objid ("59585a3a-cdb1-42ec-adb9-1c094c4be3b5")
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
    @objid ("ad369956-4dff-4f85-9bf3-9c3287247bf8")
    public static PropertiesDefinitionType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertiesDefinitionType.canInstantiate(obj))
        	return new PropertiesDefinitionType(obj);
        else
        	throw new IllegalArgumentException("PropertiesDefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9fba1b3c-b813-4d8e-9d57-aa75351dbd95")
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
    @objid ("5abbf73e-dd8d-493c-b0a1-4bcb64551df3")
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
    @objid ("22b7b318-14fe-4c5f-ae54-e6f5f02905de")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertiesDefinitionType.element_property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b474f013-98c3-4ef6-ae7a-8a166c5d5257")
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
    @objid ("d0f557db-5411-4e1c-bf82-2fb33a952505")
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
    @objid ("a2c5cc8a-2887-4ee9-aa53-76a600eb1463")
    public String getType() {
        String value = this.elt.getProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("0b7fcd73-ec89-4759-a598-85f54b40d1c8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'PropertiesDefinitionType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d4989681-f2a8-4867-be98-47dec429ef5d")
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
    @objid ("449ccc3d-3db8-41b6-846d-a52dbe6b5433")
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
    @objid ("98bdaa09-3f70-4323-a5ff-c211dbadba9e")
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
    @objid ("3ee6484a-b121-4d07-ad31-3c8fa2cf69d3")
    public void setType(final String value) {
        this.elt.setProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                             PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("0dbddc82-0074-4035-981a-709b3d6a4404")
    protected  PropertiesDefinitionType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("312989d6-8ef3-47a1-adc6-884399e7fa89")
    public static final class MdaTypes {
        @objid ("4c8bcdbd-c8b3-4013-937c-ef2cea0ae09c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1543f258-2cb2-4361-af43-df4b266554f4")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("50e4e517-96ef-4c0d-9ed6-91f1053d5746")
        public static PropertyDefinition ELEMENT_PROPERTY_PROPERTY_ELT;

        @objid ("d77d8283-bd20-46f0-8590-f5d1ae96655d")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("4afcc2e6-374e-4fd0-ab7b-a691896b4cb7")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("83046f78-ce4f-4619-bb59-9795b50549f4")
        private static Stereotype MDAASSOCDEP;

        @objid ("d914d428-fb8c-4cf0-bcec-8c49b4c176db")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ff3a9dcd-454d-4053-921b-1e486b05ce9b")
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

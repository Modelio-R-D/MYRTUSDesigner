/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
    @objid ("289c01d8-a2a3-4274-873f-1509f2e86dc5")
    public static final String STEREOTYPE_NAME = "PropertiesDefinitionType";

    @objid ("6d56365b-6ad7-4d89-8364-ba4ff8c3a2b5")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("20dd872a-f63b-4f14-9631-381ec76b9867")
    public static final String ELEMENT_PROPERTY_PROPERTY = "element_property";

    @objid ("72172256-c1e1-4bb6-90d6-5bf5d9c001f3")
    public static final String REQUIRED_PROPERTY = "required";

    @objid ("7aaeae72-f938-4f3b-8623-cf2e0a9dfb06")
    public static final String TYPE_PROPERTY = "type";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("c6601854-e867-4d63-9d80-e46611626c92")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertiesDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertiesDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("41e66995-19d9-424c-a431-d13d24352bac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertiesDefinitionType >> then instantiate a {@link PropertiesDefinitionType} proxy.
     * @return a {@link PropertiesDefinitionType} proxy on the created {@link ModelElement}.
     */
    @objid ("db808134-5786-4958-828b-21865b209afa")
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
    @objid ("f2b58880-784e-43ab-b4e5-a788b87890f3")
    public static PropertiesDefinitionType instantiate(final ModelElement obj) {
        return PropertiesDefinitionType.canInstantiate(obj) ? new PropertiesDefinitionType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertiesDefinitionType} proxy from a {@link ModelElement} stereotyped << PropertiesDefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PropertiesDefinitionType} proxy.
     */
    @objid ("f7aed0a2-d6cf-41ba-a7a8-319bb6440896")
    public static PropertiesDefinitionType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertiesDefinitionType.canInstantiate(obj))
            return new PropertiesDefinitionType(obj);
        else
            throw new IllegalArgumentException("PropertiesDefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cf44c18e-082f-4216-b3f4-8f53fdb78d9f")
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
    @objid ("64c0b033-421f-42f2-a5a5-b1838286f4b0")
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
    @objid ("4fee4d70-7dba-4da0-af1a-685a0f1f9978")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertiesDefinitionType.element_property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4694581f-3810-42a1-b609-edb39538f967")
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
    @objid ("c6cfa483-f9d5-43e7-8d2e-de7eb798e9ca")
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
    @objid ("5fcbac7b-e841-46d4-8d11-7c128c40c3ae")
    public String getType() {
        String value = this.elt.getProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("4e3fba14-a049-4b65-b4b3-1924b433c6d9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'PropertiesDefinitionType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d12a9121-b3f6-4375-a7a2-fc9b578b4b85")
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
    @objid ("f0333b5c-b715-4c4f-a97c-a32658a9826a")
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
    @objid ("cf002c5d-0dfd-497d-909e-7f72ab74c76d")
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
    @objid ("93f0edb9-2a1a-49fa-aa2d-9afba80e0924")
    public void setType(final String value) {
        this.elt.setProperty(PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT,
                             PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesDefinitionType.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("3a50f5d8-3b69-43ac-a860-d64eeb573c00")
    protected  PropertiesDefinitionType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("7b63e436-b7d8-4549-b266-af8b74f65c3c")
    public static final class MdaTypes {
        @objid ("59cd685b-c61b-43a9-94fe-5d3ea6844b83")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("42c37f08-2d1d-483b-b80d-fee223ccb8e1")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("c655a0ca-43c2-4292-96a3-91a791868043")
        public static PropertyDefinition ELEMENT_PROPERTY_PROPERTY_ELT;

        @objid ("b514a34f-799d-45c7-83b0-4dae7420eab1")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("6029c6c6-cd4e-4cb7-a7b1-89bd599675b0")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("3d2fd360-d65a-4dd3-8ecd-6e75fb27cce2")
        private static Stereotype MDAASSOCDEP;

        @objid ("8eaa1c01-f063-4e23-8c08-94992eae4702")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d8b9a0b8-fd46-48ae-87db-6782f8655483")
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

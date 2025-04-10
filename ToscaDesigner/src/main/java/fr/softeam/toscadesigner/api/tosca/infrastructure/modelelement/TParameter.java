/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:52 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TParameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("788fffe4-0ee3-414e-8a2e-87343a731006")
public class TParameter implements IMdaProxy {
    @objid ("52ac0ded-bb31-4221-b0d7-b5d43005ece8")
    public static final String STEREOTYPE_NAME = "TParameter";

    @objid ("82f75606-8c88-4bf9-b889-9826a1219e4e")
    public static final String CONSTRAINTS_PROPERTY = "constraints";

    @objid ("f61958a0-d4d6-46e6-8cf3-41c97d602c4f")
    public static final String DEFAULT_PROPERTY = "default";

    @objid ("355bee62-7772-400d-8812-b24d1338f5b1")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("e2772851-1a7d-412e-b026-b9301a3af7e4")
    public static final String NAME_PROPERTY = "name";

    @objid ("cfd1b5d7-8076-4931-86b0-b1043251b6db")
    public static final String REQUIRED_PROPERTY = "required";

    @objid ("a12bd35e-ea0d-43d9-9aa0-8df8450c7aa0")
    public static final String STATUS_PROPERTY = "status";

    @objid ("3492e354-9244-4851-8992-28d4a065561c")
    public static final String TYPE_PROPERTY = "type";

    @objid ("502b7b43-2500-474c-ba07-29e517b279dc")
    public static final String VALUE_PROPERTY = "value";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("e0d49b36-3d7b-45e6-85d5-cd71899198fb")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TParameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6c3b5d40-0a45-4d85-a064-2522217858bd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TParameter.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TParameter.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TParameter >> then instantiate a {@link TParameter} proxy.
     * 
     * @return a {@link TParameter} proxy on the created {@link ModelElement}.
     */
    @objid ("3cb9e19b-19c2-4457-8e36-673951fc2668")
    public static TParameter create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TParameter.MdaTypes.STEREOTYPE_ELT);
        return TParameter.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TParameter} proxy from a {@link ModelElement} stereotyped << TParameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TParameter} proxy or <i>null</i>.
     */
    @objid ("cc4b8f74-45d4-4610-921a-04b049fb3b8b")
    public static TParameter instantiate(final ModelElement obj) {
        return TParameter.canInstantiate(obj) ? new TParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TParameter} proxy from a {@link ModelElement} stereotyped << TParameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1fca84f3-5ce9-4a69-be8d-97ef9adbdc0d")
    public static TParameter safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TParameter.canInstantiate(obj))
        	return new TParameter(obj);
        else
        	throw new IllegalArgumentException("TParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d6325b07-7292-466b-a4d6-6969699fd2ce")
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
        TParameter other = (TParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TParameter.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b6b9d531-0f70-4951-ba6b-44cccc812660")
    public String getConstraints() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.CONSTRAINTS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TParameter.default'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8cfad065-fec1-44be-9316-daf55f661685")
    public String getDefault() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.DEFAULT_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.DEFAULT_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.DEFAULT_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TParameter.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3518c003-b100-44cf-bff8-298181c4e05e")
    public String getDescription() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("04f3e2c0-d580-4def-b9bd-eba0d7dd7dc4")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TParameter.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b0fd445f-9712-4037-b550-bed2879bf862")
    public String getName() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TParameter.required'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("96867ca7-80fa-4a24-bca2-e34e0975ac39")
    public Boolean getRequired() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.REQUIRED_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.REQUIRED_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(TParameter.MdaTypes.REQUIRED_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TParameter.status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("01774120-af93-4490-b042-f14e11bbb3a9")
    public String getStatus() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.STATUS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.STATUS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.STATUS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TParameter.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("56b46bac-4d42-49dd-967b-6c1d23c1c316")
    public String getType() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TParameter.value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e7393cb9-5c16-4434-9aa5-7aff0ab6508f")
    public String getValue() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.VALUE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.VALUE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.VALUE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("bd0f4de1-d75b-498b-b631-6324caa2ee95")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TParameter.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("47fb4c69-56f9-4ec3-abd1-376f9f0912d2")
    public void setConstraints(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.CONSTRAINTS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.default'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3cf71172-0567-4995-9e34-fda796788bef")
    public void setDefault(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.DEFAULT_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.DEFAULT_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1e56ae0b-c7fe-496a-9cf0-8b81247da4b9")
    public void setDescription(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7c1dc68c-37c3-488b-a420-46627396c14b")
    public void setName(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.required'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3fe778f3-1c8b-456d-a4e5-033ca672d4db")
    public void setRequired(final Boolean value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.REQUIRED_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.REQUIRED_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f55da2c4-89f1-4f02-bc2b-a6b215e5cd39")
    public void setStatus(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.STATUS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.STATUS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4aa2d81d-75eb-4986-8c82-b8b6fe997456")
    public void setType(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("82aef4ff-3aaf-44be-befe-c688807a2fb8")
    public void setValue(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.VALUE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.VALUE_PROPERTY_ELT, value));
    }

    @objid ("d7f16754-645d-404c-89c3-aadf66591024")
    protected  TParameter(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("7cb430c3-c37e-4c75-84df-48bf8f850b03")
    public static final class MdaTypes {
        @objid ("31c03e3a-bf93-4e22-81ad-3c45eed3aa04")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7d378ed1-c007-4ae0-a3c8-6f388c679be8")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("1c719b2f-725f-4d92-aaa9-525eb0cb3936")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("c486914d-a86c-4f03-935c-d1c904f570a8")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("b887aaa7-4f0f-4e78-8649-ab1468d0472b")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("bdec718b-50da-463b-a555-0cb67415a600")
        public static PropertyDefinition VALUE_PROPERTY_ELT;

        @objid ("0ace6a1e-2ec9-4aa8-be79-31fe38376549")
        public static PropertyDefinition DEFAULT_PROPERTY_ELT;

        @objid ("8fdb0771-5a80-4a1f-a0f1-931b137846cf")
        public static PropertyDefinition STATUS_PROPERTY_ELT;

        @objid ("8bc7ab1a-639f-4d61-9027-4b79a93b0063")
        public static PropertyDefinition CONSTRAINTS_PROPERTY_ELT;

        @objid ("6133a578-3511-4547-9e14-80453c60c027")
        private static Stereotype MDAASSOCDEP;

        @objid ("e549e07a-d73f-4c19-9772-bea18e0d6cfe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("58272a49-0448-4eeb-b856-eee65b08d541")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "88f765a0-a1fe-42d8-9b52-f45ff541469f", "TParameter");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "ae68e1f0-3464-42e1-a2d5-d8d14a7aa4fe", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "3091bbf3-2697-463a-92be-b410cc5a1f82", "required");
            REQUIRED_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIRED_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a6d4ef82-d89c-4b98-ad06-c9abb7992402", "type");
            TYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "73c42be6-f152-4cd9-96e7-811cbdc19855", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b90789da-89e2-4e67-95f5-afaeae60527f", "value");
            VALUE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALUE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "77d5b3fc-e752-44d0-a52c-3d3b6fa2755a", "default");
            DEFAULT_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DEFAULT_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "af62ecb0-8deb-4e68-bb5f-c38a90d1ddc6", "status");
            STATUS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (STATUS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "5e5812ea-e124-41ef-8d85-dc46d49636a9", "constraints");
            CONSTRAINTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CONSTRAINTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:09 by Modelio Studio.
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
    @objid ("9053b426-2ceb-45b8-a4af-6c554551cd4f")
    public static final String STEREOTYPE_NAME = "TParameter";

    @objid ("e7b52f4d-f64d-46ad-af92-c06e9c483dbd")
    public static final String CONSTRAINTS_PROPERTY = "constraints";

    @objid ("86f78360-7292-487a-9c5e-c06fc777f82b")
    public static final String DEFAULT_PROPERTY = "default";

    @objid ("118a44af-78fc-47aa-8dd5-e5591a25d067")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("234123db-3d11-4495-807a-cbcbbc07abb2")
    public static final String NAME_PROPERTY = "name";

    @objid ("d5b0a6b9-ebed-448c-9411-98080b1cefac")
    public static final String REQUIRED_PROPERTY = "required";

    @objid ("8d9d5821-0c64-48ef-8733-ab844246b35b")
    public static final String STATUS_PROPERTY = "status";

    @objid ("1f10ec7d-c25c-4c84-bc5d-48d8c7c276b9")
    public static final String TYPE_PROPERTY = "type";

    @objid ("6d32d27b-cd44-4098-913a-5d77b792b383")
    public static final String VALUE_PROPERTY = "value";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("c04dce14-2bf1-4e10-ab57-d28e762c803a")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TParameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5b62d3c3-45bd-4385-8903-16a583f7a743")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TParameter.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TParameter.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TParameter >> then instantiate a {@link TParameter} proxy.
     * 
     * @return a {@link TParameter} proxy on the created {@link ModelElement}.
     */
    @objid ("314b0004-5029-43f1-b2a9-46ea2383b02b")
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
    @objid ("2b881a9d-5c32-4a80-8297-2737ab5e31eb")
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
    @objid ("05e49dca-d2dc-419a-941c-7bb00286a30f")
    public static TParameter safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TParameter.canInstantiate(obj))
        	return new TParameter(obj);
        else
        	throw new IllegalArgumentException("TParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("302d2e7b-fb53-4e63-aa34-d0b03b81559b")
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
    @objid ("7e6d85d3-739b-4106-8bbf-73e6ce645024")
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
    @objid ("25b6d0b6-538c-476b-a320-17a53c394a36")
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
    @objid ("d5c18dbe-f6c1-4dd5-9b03-6d3febd548a9")
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
    @objid ("f1e78c3e-4ba9-438b-99a3-194c1b02cefe")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TParameter.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6f100c12-0587-40cb-b63f-8ca4df16632f")
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
    @objid ("7361142f-ab59-42c3-9856-8f8e28a381eb")
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
    @objid ("7fc4eb91-643e-4b64-b4d5-e014191f9a63")
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
    @objid ("4f6141fb-d5c1-4a6b-9c3e-618cfe93539a")
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
    @objid ("db9d10e9-ebae-4639-9e67-1d738ab4e53f")
    public String getValue() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.VALUE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.VALUE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.VALUE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("c0c1e034-4040-4aac-8a8e-8cc8cda5fad1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TParameter.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d4174f15-a390-4eb6-b92a-e94830890b1d")
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
    @objid ("1098a1c2-6231-4a12-b3e7-0d05404e4c01")
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
    @objid ("03dbbfc3-fa81-4aa0-ae5a-545566c30f8f")
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
    @objid ("f39a357d-08de-4c6e-a632-b37545db74db")
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
    @objid ("cb319225-74b2-4c54-bcb6-353d14f99251")
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
    @objid ("e4634686-e875-43ed-911e-e94bde7ad957")
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
    @objid ("dd0a68ce-b4c4-4cf2-aa37-ef91abf2bd7b")
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
    @objid ("9215171b-a5b2-41ee-a3d3-9a875020fddf")
    public void setValue(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.VALUE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.VALUE_PROPERTY_ELT, value));
    }

    @objid ("f691c849-b4a7-4382-b6ac-87613e38cde1")
    protected  TParameter(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("7cb430c3-c37e-4c75-84df-48bf8f850b03")
    public static final class MdaTypes {
        @objid ("a01c3c1b-5dae-498a-b98a-a19fe8119dde")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("75596b51-97ee-4f3d-895b-49def63742c2")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("2468667b-711a-4e23-8441-836d8507cc27")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("25c717fa-68bb-4332-b520-04f49b5a787e")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("bcff00f3-3dda-49bf-8920-804abc71543b")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("57e52389-9895-4710-9eba-96fb2a307de3")
        public static PropertyDefinition VALUE_PROPERTY_ELT;

        @objid ("fcc2c586-a6ea-411d-9749-96f45b4e2032")
        public static PropertyDefinition DEFAULT_PROPERTY_ELT;

        @objid ("7b2ab61d-c546-4085-b1bf-067279cf9f25")
        public static PropertyDefinition STATUS_PROPERTY_ELT;

        @objid ("72cde0c5-a8d7-43e2-95ae-80c08d44ee25")
        public static PropertyDefinition CONSTRAINTS_PROPERTY_ELT;

        @objid ("14eacddb-3b4f-4cc6-8cb0-79b70c844918")
        private static Stereotype MDAASSOCDEP;

        @objid ("b57b5d0f-dcf7-4f86-82ab-9242ff36a495")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1921d5c3-cd58-4e4f-a1d7-2066decd0d80")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 17:54 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TEntityType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("387bacbd-d882-4047-aac0-74834319e71d")
public class TEntityType implements IMdaProxy {
    @objid ("56b33889-0fae-458c-9b4d-47b6d6f0db1b")
    public static final String STEREOTYPE_NAME = "TEntityType";

    @objid ("9719f26c-d2aa-4fdc-989f-21d05afa665d")
    public static final String ABSTRACT_PROPERTY = "abstract";

    @objid ("c4a3107c-8b74-4cef-ac57-1afc8f61f902")
    public static final String DERIVEDFROM_PROPERTY = "derivedFrom";

    @objid ("56e0306d-540d-49d8-b3b7-b37215b16f39")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("f599c0ca-980e-42cf-8a5d-eb00de61a921")
    public static final String FINAL_PROPERTY = "final";

    @objid ("91d7355e-7f7b-4beb-b4ab-de3a6bbc53bc")
    public static final String NAME_PROPERTY = "name";

    @objid ("cb37a58a-c646-44ad-843e-4d38e777420f")
    public static final String PROPERTIESDEFINITION_PROPERTY = "propertiesDefinition";

    @objid ("86ce98bf-b45c-46e8-a664-47ddb988fb27")
    public static final String TAGS_PROPERTY = "tags";

    @objid ("6b6e1b56-56f0-4ba8-bd9b-56efd093527a")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("105a0808-ac27-4ef5-bb47-b52106c5610b")
    protected final Class elt;

    /**
     * Tells whether a {@link TEntityType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TEntityType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("96b57aad-7ed0-4d09-874a-d7b430bc7b88")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TEntityType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TEntityType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TEntityType >> then instantiate a {@link TEntityType} proxy.
     * 
     * @return a {@link TEntityType} proxy on the created {@link Class}.
     */
    @objid ("f50cb6b1-413a-4fca-afaa-f19a9ee82943")
    public static TEntityType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TEntityType.MdaTypes.STEREOTYPE_ELT);
        return TEntityType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TEntityType} proxy from a {@link Class} stereotyped << TEntityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TEntityType} proxy or <i>null</i>.
     */
    @objid ("ea2772a1-cece-4622-8875-78233dd420dc")
    public static TEntityType instantiate(final Class obj) {
        return TEntityType.canInstantiate(obj) ? new TEntityType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TEntityType} proxy from a {@link Class} stereotyped << TEntityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TEntityType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("51f16bf9-33de-48ba-93ea-3144ff6c8bcc")
    public static TEntityType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TEntityType.canInstantiate(obj))
        	return new TEntityType(obj);
        else
        	throw new IllegalArgumentException("TEntityType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7e92a459-2671-4273-aa6d-401e035b1d82")
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
        TEntityType other = (TEntityType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TEntityType.abstract'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d02d9837-ee97-4b98-bc6d-2ca71febf98c")
    public Boolean getAbstract() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.ABSTRACT_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.ABSTRACT_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(TEntityType.MdaTypes.ABSTRACT_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityType.derivedFrom'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7011eac2-c588-42c9-ac2a-66eb6f836866")
    public String getDerivedFrom() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.DERIVEDFROM_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.DERIVEDFROM_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.DERIVEDFROM_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3ab815ca-8311-4ce7-8fb8-e75bc9603aee")
    public String getDescription() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d04aa5a0-022a-4565-aea2-057282910de4")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TEntityType.final'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7c04386b-23f3-451d-b9a3-efd6f687a30a")
    public Boolean getFinal() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.FINAL_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.FINAL_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(TEntityType.MdaTypes.FINAL_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityType.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9130a6e9-00a3-48d1-b565-27021404be22")
    public String getName() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityType.propertiesDefinition'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b1602355-808d-4808-b2f2-a315b887744d")
    public String getPropertiesDefinition() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.PROPERTIESDEFINITION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.PROPERTIESDEFINITION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.PROPERTIESDEFINITION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityType.tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("134c7ad8-5646-4e32-a47d-c85aff1bf580")
    public String getTags() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.TAGS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.TAGS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.TAGS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityType.targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3a0700d0-11f5-4d31-9366-af898300cdca")
    public String getTargetNamespace() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("284f735f-2d4c-4024-9121-b10ed79adbf9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TEntityType.abstract'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b360fbd0-bf94-4c28-8f16-354102cde8d6")
    public void setAbstract(final Boolean value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.ABSTRACT_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.ABSTRACT_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityType.derivedFrom'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8936d467-f6de-44a9-b670-29943dd0d9d6")
    public void setDerivedFrom(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.DERIVEDFROM_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.DERIVEDFROM_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cef92f9b-a484-4825-8113-0e43148795ec")
    public void setDescription(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityType.final'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0b3859ef-89b1-4533-b4bd-a71792500f8b")
    public void setFinal(final Boolean value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.FINAL_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.FINAL_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityType.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3f9dfd3c-198a-43e6-bd88-cbcf73574b6b")
    public void setName(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityType.propertiesDefinition'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7442ac25-c484-4e55-8dfc-ed3a2a017825")
    public void setPropertiesDefinition(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.PROPERTIESDEFINITION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.PROPERTIESDEFINITION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityType.tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("536fd5d5-c3df-4746-a885-0bad989c29c9")
    public void setTags(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.TAGS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.TAGS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityType.targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("05f1ea28-2a91-4438-b951-90096d818ba5")
    public void setTargetNamespace(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("3318a825-d99e-42f2-8bfa-aeeff3fd18e8")
    protected  TEntityType(final Class elt) {
        this.elt = elt;
    }

    @objid ("8ca8d840-6a7d-4185-944d-d717e8fe3a82")
    public static final class MdaTypes {
        @objid ("3ea23e56-ce99-47f1-b23e-575bcc42d60d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("977a030a-d45e-4737-b232-ece9b5669163")
        public static PropertyDefinition TAGS_PROPERTY_ELT;

        @objid ("598d15b5-0c7d-4219-8bb0-2eeb1c8a36bf")
        public static PropertyDefinition DERIVEDFROM_PROPERTY_ELT;

        @objid ("71743adf-1961-4ffd-b0f8-760dbd3db0e6")
        public static PropertyDefinition PROPERTIESDEFINITION_PROPERTY_ELT;

        @objid ("7eb99e1b-2cb7-4e9a-9f2d-6cc96d38a56c")
        public static PropertyDefinition ABSTRACT_PROPERTY_ELT;

        @objid ("ec7e9857-5cda-408e-bf8d-a53bee1cd2ea")
        public static PropertyDefinition FINAL_PROPERTY_ELT;

        @objid ("ced30a58-9506-4853-ac99-7fdf65190ec1")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("aa66ae85-9720-400c-8184-366fae979a06")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("9e453500-de93-4075-89b0-d14a4fa65f33")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("a5a16797-5742-42e3-aabf-7055319fd413")
        private static Stereotype MDAASSOCDEP;

        @objid ("7e4c42f4-58e1-471c-9fb0-0b78d2bc9042")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("05e6e4be-4166-44e7-a15b-d6ed5df52a44")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "fecd81a5-da41-4a07-a507-6bfaf5bbadd2", "TEntityType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "9d69d99b-499b-4753-be0a-7267d4a368ec", "tags");
            TAGS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TAGS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "1bb27208-5a4c-4ef2-a52e-94718a97c61c", "derivedFrom");
            DERIVEDFROM_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DERIVEDFROM_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "8e60acb6-8df2-4d2b-bb91-d0b944eb9d28", "propertiesDefinition");
            PROPERTIESDEFINITION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTIESDEFINITION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "fae87299-dec9-4059-8d8d-6312ed7c3f02", "abstract");
            ABSTRACT_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ABSTRACT_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "ed02ddaf-13c8-47e0-ba8b-cb537374933a", "final");
            FINAL_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (FINAL_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "207f27b1-c6d9-4541-8a5c-a3fc9d0e3132", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "5bfcc6b2-f0ee-4854-9ac0-4ceaa8c9e21b", "targetNamespace");
            TARGETNAMESPACE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TARGETNAMESPACE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "3a4ea736-740c-4c66-8ef7-f2f6838a6fa0", "description");
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

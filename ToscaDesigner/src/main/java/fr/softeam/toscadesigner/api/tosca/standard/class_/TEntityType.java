/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
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
    @objid ("a387071a-3d51-403f-9ad4-e5ee18c2c98e")
    public static final String STEREOTYPE_NAME = "TEntityType";

    @objid ("d66ddd07-6823-4ef4-92df-40217db8a59a")
    public static final String ABSTRACT_PROPERTY = "abstract";

    @objid ("b381776a-1080-4386-89d4-228b458aff78")
    public static final String DERIVEDFROM_PROPERTY = "derivedFrom";

    @objid ("ed71b08d-dbdd-4b36-8576-5f1a281bbc9b")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("4d4d4ff1-aeaf-4701-8be1-ba35ac75d0be")
    public static final String FINAL_PROPERTY = "final";

    @objid ("8caae779-852b-47e9-9ef8-820fc4d54664")
    public static final String NAME_PROPERTY = "name";

    @objid ("75eb86a0-4320-46d7-a350-550b60d75e0c")
    public static final String PROPERTIESDEFINITION_PROPERTY = "propertiesDefinition";

    @objid ("6bcd16b6-9d9a-48b7-8cb0-52f4805b718f")
    public static final String TAGS_PROPERTY = "tags";

    @objid ("89004897-2478-4cbe-a923-16a44e28dc68")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("3f3cbcf8-0fe0-457f-8c29-7873def3466d")
    protected final Class elt;

    /**
     * Tells whether a {@link TEntityType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TEntityType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("09e981ea-090b-4e1b-8d45-2c521cc4ba2a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TEntityType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TEntityType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TEntityType >> then instantiate a {@link TEntityType} proxy.
     * @return a {@link TEntityType} proxy on the created {@link Class}.
     */
    @objid ("3689bbdf-031d-4d9b-9bbb-fb5ef4c7deb8")
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
    @objid ("a905b884-427c-42ec-a571-d6a97ad62e71")
    public static TEntityType instantiate(final Class obj) {
        return TEntityType.canInstantiate(obj) ? new TEntityType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TEntityType} proxy from a {@link Class} stereotyped << TEntityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TEntityType} proxy.
     */
    @objid ("b0a41eeb-5456-4f09-ae27-b76675c6a616")
    public static TEntityType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TEntityType.canInstantiate(obj))
            return new TEntityType(obj);
        else
            throw new IllegalArgumentException("TEntityType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("82a32f12-92ae-4677-af96-14d83f458422")
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
    @objid ("b7a31a3e-cb6f-4604-91e8-88385bab90fc")
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
    @objid ("70175a5a-0eda-4630-9ef6-eb89a878c386")
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
    @objid ("ffd99065-3b66-4e52-b193-8783ab5d9d0f")
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
    @objid ("ba1c40f8-d47a-411f-b2c5-c84def2d7df2")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TEntityType.final'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2c85e3be-9729-4022-90dc-ab13b9df0564")
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
    @objid ("47ae0a79-60cb-4ea2-89f1-81df62c55ca5")
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
    @objid ("d689b9e7-5fc8-46a2-9bcc-f302f74bc54f")
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
    @objid ("fe8bb57f-b0ff-42be-89a1-288198984203")
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
    @objid ("aa1ee06a-e94a-4c79-ba6f-871ff615a119")
    public String getTargetNamespace() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("dffb034e-bbd8-4b69-841c-90b7cfa13832")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TEntityType.abstract'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2ba9e665-d280-4e59-a199-3feba566d421")
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
    @objid ("c888cbe1-85b3-4f02-92ab-deb0242611b3")
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
    @objid ("8222c4bf-e5d1-490d-9be8-236a6365f4e5")
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
    @objid ("c78c24c4-c791-44ee-8bd7-a0d8864f0f33")
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
    @objid ("825e6ec0-4ab9-4dba-9168-9a33c01f29e6")
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
    @objid ("a40f9a89-309c-49b2-9fb5-d1ead854a666")
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
    @objid ("839447a7-937b-4904-94ba-8780f02b3bf7")
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
    @objid ("974c291e-cd6c-4fdf-abc1-d7a3b7b2eebf")
    public void setTargetNamespace(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("dce4419f-b1ca-4d81-9974-69eeeab22823")
    protected  TEntityType(final Class elt) {
        this.elt = elt;
    }

    @objid ("8ca8d840-6a7d-4185-944d-d717e8fe3a82")
    public static final class MdaTypes {
        @objid ("5b7bc3e4-63ae-49a7-a507-c03f956fa2df")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9e28a765-03f5-4281-a662-8e41ff8923ea")
        public static PropertyDefinition TAGS_PROPERTY_ELT;

        @objid ("7bb22d29-9093-42e8-8c97-6cb6b7434dc1")
        public static PropertyDefinition DERIVEDFROM_PROPERTY_ELT;

        @objid ("9d5f2a30-b8b1-43cf-8fe7-7b6bfb2c5440")
        public static PropertyDefinition PROPERTIESDEFINITION_PROPERTY_ELT;

        @objid ("4fd500f3-56ed-4290-9243-c7684c4ca7df")
        public static PropertyDefinition ABSTRACT_PROPERTY_ELT;

        @objid ("4e300340-b05c-48a3-8b91-6eb181f7b86b")
        public static PropertyDefinition FINAL_PROPERTY_ELT;

        @objid ("4ae51740-0b8b-4c40-8fe6-8251eb480878")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("ecd64462-aea4-4c53-a876-c3da0b787fe1")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("20779891-d19b-4a93-a7de-8404fabe8e92")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("6f2b1af4-6b34-4ce2-ba90-ecb22e3344b5")
        private static Stereotype MDAASSOCDEP;

        @objid ("39dcbf50-3a4f-482e-8a7e-57dd7c4eae68")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f6178e57-343d-4c09-b73f-176a40fa3d1b")
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

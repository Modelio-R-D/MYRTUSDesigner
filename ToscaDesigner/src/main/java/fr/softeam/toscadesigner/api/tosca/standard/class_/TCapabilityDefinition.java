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
 * Proxy class to handle a {@link Class} with << TCapabilityDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6bf9ef2a-9b3c-48fe-8c8d-eca182032ada")
public class TCapabilityDefinition implements IMdaProxy {
    @objid ("c1782ef0-6d1c-4f5e-b5f6-a131d6859b44")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinition";

    @objid ("1019fb6f-0c91-4274-8675-ea8f9fd5ccbb")
    public static final String CAPABILITYTYPE_PROPERTY = "capabilityType";

    @objid ("21601737-71ff-4ddc-8c9d-3ca0324f4275")
    public static final String CONSTRAINTS_PROPERTY = "constraints";

    @objid ("6ea3fb7c-23a1-4a69-a46f-5194651eadbf")
    public static final String LOWERBOUND_PROPERTY = "lowerBound";

    @objid ("52b0e2cc-9ded-4bdd-8760-f3d49428be75")
    public static final String UPPERBOUND_PROPERTY = "upperBound";

    @objid ("d4e31af3-7b14-4ec6-9bf8-19e9bc3ac56f")
    public static final String VALID_SOURCE_TYOES_PROPERTY = "valid_source_tyoes";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("e7e10dc3-d596-4b6b-bb98-819ee4e94afa")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapabilityDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f4d769be-d397-4dac-a5d0-7162ad2a88db")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinition >> then instantiate a {@link TCapabilityDefinition} proxy.
     * @return a {@link TCapabilityDefinition} proxy on the created {@link Class}.
     */
    @objid ("a875ffef-b120-4da9-8a9c-81c1909b64d4")
    public static TCapabilityDefinition create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityDefinition.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinition} proxy from a {@link Class} stereotyped << TCapabilityDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TCapabilityDefinition} proxy or <i>null</i>.
     */
    @objid ("5bdfbdf7-802a-4261-b70a-ea7b4d42e319")
    public static TCapabilityDefinition instantiate(final Class obj) {
        return TCapabilityDefinition.canInstantiate(obj) ? new TCapabilityDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinition} proxy from a {@link Class} stereotyped << TCapabilityDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapabilityDefinition} proxy.
     */
    @objid ("52738812-ab59-424f-8565-0005f36bebb0")
    public static TCapabilityDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityDefinition.canInstantiate(obj))
            return new TCapabilityDefinition(obj);
        else
            throw new IllegalArgumentException("TCapabilityDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6e7b5f18-99e7-4b98-a65b-ba982283648e")
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
        TCapabilityDefinition other = (TCapabilityDefinition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TCapabilityDefinition.capabilityType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8ab9cd13-59fc-4507-9590-8285ef30b7a9")
    public String getCapabilityType() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TCapabilityDefinition.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5ade5b6e-fa25-448e-833a-8cf305bca5a2")
    public String getConstraints() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("a8174d15-a6e8-4878-beec-748cc15e167e")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TCapabilityDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d8afd247-1dcd-4677-a8b3-30b48e9985f2")
    public Integer getLowerBound() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (Integer) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TCapabilityDefinition.upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0f21695d-90e2-4288-8b77-37b463f547fd")
    public Integer getUpperBound() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (Integer) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TCapabilityDefinition.valid_source_tyoes'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1c54a06b-6fdf-4799-adae-5ecf68d97fad")
    public String getValid_source_tyoes() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT, value, this.elt);
    }

    @objid ("a96bac09-3ba0-47df-9be6-63649673352c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TCapabilityDefinition.capabilityType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fc94aae2-4d1c-4e9c-a3e9-85fef7ce6aee")
    public void setCapabilityType(final String value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1e647ab2-f6c9-402a-b627-b768e4cd2b26")
    public void setConstraints(final String value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e3708898-5e9c-446e-b086-5c97ea7c889b")
    public void setLowerBound(final Integer value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("39232437-b10a-49da-bfe8-7b0f401f2ce1")
    public void setUpperBound(final Integer value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.valid_source_tyoes'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("833c1d0c-774a-43e2-8e67-3013c978df31")
    public void setValid_source_tyoes(final String value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT, value));
    }

    @objid ("b3af0806-a83a-472f-af7f-507302be8fa6")
    protected  TCapabilityDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("9675724e-242a-4983-bdd5-a14ed8d0af57")
    public static final class MdaTypes {
        @objid ("4791aa89-d36f-499b-9e33-f3ddea89b879")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9debee61-ed47-423d-a3fc-eabd59c3b4ca")
        public static PropertyDefinition CONSTRAINTS_PROPERTY_ELT;

        @objid ("a6358c7c-7601-46a7-8177-1d1be8a12b54")
        public static PropertyDefinition CAPABILITYTYPE_PROPERTY_ELT;

        @objid ("802771ef-bc15-4e62-9777-bee2594c8106")
        public static PropertyDefinition LOWERBOUND_PROPERTY_ELT;

        @objid ("b67fdee4-caa3-4918-8007-22ee8d1df1ad")
        public static PropertyDefinition UPPERBOUND_PROPERTY_ELT;

        @objid ("656e564c-6304-4704-99a9-f5fbc1ff6eb2")
        public static PropertyDefinition VALID_SOURCE_TYOES_PROPERTY_ELT;

        @objid ("67a052b0-1f61-4e4a-bff4-c66f34c3f6fa")
        private static Stereotype MDAASSOCDEP;

        @objid ("5eed9319-f384-4cfa-af8d-a239c9423b38")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6b2b4f1b-dc91-4104-b539-dbc4a1ff72eb")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "92f8cb40-9498-4759-9c75-6b4df72de355", "TCapabilityDefinition");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "21aae7e2-a2bd-418d-8df8-70c4fa8d4d13", "constraints");
            CONSTRAINTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CONSTRAINTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d92d0b5f-92dc-4ece-8007-afd0ea307098", "capabilityType");
            CAPABILITYTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CAPABILITYTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "2a352928-d0d5-4e77-bbb4-9f69dc69b952", "lowerBound");
            LOWERBOUND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (LOWERBOUND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d94c64cf-02f1-4a6b-a229-35c8b8b6303b", "upperBound");
            UPPERBOUND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (UPPERBOUND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "e012d64d-3433-419e-a7b1-62e1cd38891a", "valid_source_tyoes");
            VALID_SOURCE_TYOES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALID_SOURCE_TYOES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

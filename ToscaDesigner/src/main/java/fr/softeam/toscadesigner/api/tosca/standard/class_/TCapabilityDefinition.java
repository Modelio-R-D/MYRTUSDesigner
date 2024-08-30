/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 17:26 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TCapabilityDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6bf9ef2a-9b3c-48fe-8c8d-eca182032ada")
public class TCapabilityDefinition implements IMdaProxy {
    @objid ("df601721-5dae-4635-97ae-ec2fb4121da1")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinition";

    @objid ("8a9a2349-d4cb-4ae5-811d-282b5b67e8c5")
    public static final String CAPABILITYTYPE_PROPERTY = "capabilityType";

    @objid ("24b0b29a-0fa1-4815-a55c-6737c9521b1b")
    public static final String CONSTRAINTS_PROPERTY = "constraints";

    @objid ("cad2733e-a9e1-4534-92b2-0a02045bcdf5")
    public static final String LOWERBOUND_PROPERTY = "lowerBound";

    @objid ("6abcbd2e-25a7-4aad-8a71-2cebc8fc1b53")
    public static final String UPPERBOUND_PROPERTY = "upperBound";

    @objid ("eda56332-aabc-4249-afd3-c8db3fa44160")
    public static final String VALID_SOURCE_TYOES_PROPERTY = "valid_source_tyoes";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("8a44f306-352f-4561-a948-5c3008f0a433")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapabilityDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d7266166-2203-4c25-98ef-3ccdb8b4ae4b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinition >> then instantiate a {@link TCapabilityDefinition} proxy.
     * 
     * @return a {@link TCapabilityDefinition} proxy on the created {@link Class}.
     */
    @objid ("14c15048-29d4-4cec-a3ea-85e30c06cfac")
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
    @objid ("81f11e42-a569-47ed-8409-ce900194d3c4")
    public static TCapabilityDefinition instantiate(final Class obj) {
        return TCapabilityDefinition.canInstantiate(obj) ? new TCapabilityDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinition} proxy from a {@link Class} stereotyped << TCapabilityDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapabilityDefinition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1c98f829-1a47-4a27-94fb-0c7f3b5687c4")
    public static TCapabilityDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityDefinition.canInstantiate(obj))
        	return new TCapabilityDefinition(obj);
        else
        	throw new IllegalArgumentException("TCapabilityDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0247d891-76e6-40ca-afbb-5415f13790f2")
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
    @objid ("f729c54c-1810-4777-981d-eb0f130f94a2")
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
    @objid ("d03bad34-a030-4edb-b4f8-f21a11129d7c")
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
    @objid ("6c0efffb-5fe5-4be8-b34d-a1c9050f63bb")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TCapabilityDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e790079e-7f3a-4d20-9aac-4447d0e6ae1e")
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
    @objid ("7d247ed8-4406-4cb6-8b92-7b237636380c")
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
    @objid ("99c81119-4c2c-4689-bb3b-4fb6829b13ef")
    public String getValid_source_tyoes() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("d6255746-4488-47db-81c4-652db04fda88")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TCapabilityDefinition.capabilityType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0adbc375-ac3b-4e72-b4c0-8ead9d89c194")
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
    @objid ("cd7d6732-fac1-42c0-9b19-29c49a158011")
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
    @objid ("aab36f22-6d90-4a5e-8ae4-e45a857cdb49")
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
    @objid ("4924f305-b79b-4681-ac16-9f05192d56f3")
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
    @objid ("842ab0c4-754a-4039-8690-28bd7165200d")
    public void setValid_source_tyoes(final String value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT, value));
    }

    @objid ("de538de3-761b-4816-b199-5047b9291e07")
    protected  TCapabilityDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("9675724e-242a-4983-bdd5-a14ed8d0af57")
    public static final class MdaTypes {
        @objid ("5aec7d43-1327-447e-b7a5-5968b6a288ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ce647fad-7236-42bd-9378-e4a622e0fce8")
        public static PropertyDefinition CONSTRAINTS_PROPERTY_ELT;

        @objid ("743dc985-14cb-4037-bc9a-02cbe48b4842")
        public static PropertyDefinition CAPABILITYTYPE_PROPERTY_ELT;

        @objid ("918aea9b-1547-49b1-9e0f-c61729bcf204")
        public static PropertyDefinition LOWERBOUND_PROPERTY_ELT;

        @objid ("5b56a77e-13e9-4c96-a1fe-f84dbddf4bc9")
        public static PropertyDefinition UPPERBOUND_PROPERTY_ELT;

        @objid ("b3d34ef3-cd2b-4f10-aad3-049e5498bc0d")
        public static PropertyDefinition VALID_SOURCE_TYOES_PROPERTY_ELT;

        @objid ("c9823449-ebb6-42fa-9c81-8b47d8634bef")
        private static Stereotype MDAASSOCDEP;

        @objid ("f27dd059-7345-496f-98ab-2bd86f5d0261")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f4a2396b-8cbb-461f-96c6-e402841b5797")
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

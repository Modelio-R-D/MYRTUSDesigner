/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 13/08/2024 17:47 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRequirementDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e1af5b9d-68b0-4f97-91c3-a168b073bd2b")
public class TRequirementDefinition implements IMdaProxy {
    @objid ("896e8098-e052-452b-93b2-5561d8916743")
    public static final String STEREOTYPE_NAME = "TRequirementDefinition";

    @objid ("3dd6f9ad-cae4-45dd-a10f-da413e130aa5")
    public static final String CAPABILITY_PROPERTY = "capability";

    @objid ("e111b7ae-f9de-4bbc-8798-20ab86f5354e")
    public static final String LOWERBOUND_PROPERTY = "lowerBound";

    @objid ("a96339dd-d6f2-4ea4-b64e-9ad10678ac02")
    public static final String NAME_PROPERTY = "name";

    @objid ("e0686171-003f-42af-90b2-ba6a2c059a8f")
    public static final String NODE_PROPERTY = "node";

    @objid ("47dd089a-488f-4609-8c4f-d5e2d0e5a955")
    public static final String RELATIONSHIPTYPE_PROPERTY = "relationshipType";

    @objid ("66489f8f-29ac-4730-a856-29b0b3cf2eb3")
    public static final String REQUIREMENTTYPE_PROPERTY = "requirementType";

    @objid ("84ed2015-830e-40f4-946b-8a85e58bc739")
    public static final String UPPERBOUND_PROPERTY = "upperBound";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("e5781142-e94a-4672-a634-3e5712aa16fe")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirementDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirementDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5e06bd4f-a74c-43a9-ac91-393b574d006f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirementDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirementDefinition >> then instantiate a {@link TRequirementDefinition} proxy.
     * 
     * @return a {@link TRequirementDefinition} proxy on the created {@link Class}.
     */
    @objid ("2794cdc7-c962-4c48-a827-36af7c500972")
    public static TRequirementDefinition create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT);
        return TRequirementDefinition.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinition} proxy from a {@link Class} stereotyped << TRequirementDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRequirementDefinition} proxy or <i>null</i>.
     */
    @objid ("ab7db108-5c6a-41b8-93aa-e9efe0078c10")
    public static TRequirementDefinition instantiate(final Class obj) {
        return TRequirementDefinition.canInstantiate(obj) ? new TRequirementDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinition} proxy from a {@link Class} stereotyped << TRequirementDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRequirementDefinition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("64926789-3086-4836-96a7-e1f4f52b5ba5")
    public static TRequirementDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirementDefinition.canInstantiate(obj))
        	return new TRequirementDefinition(obj);
        else
        	throw new IllegalArgumentException("TRequirementDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3a445991-e1fe-4604-9fec-16bd09efefb3")
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
        TRequirementDefinition other = (TRequirementDefinition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TRequirementDefinition.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9358782c-b9d2-4cb2-87b0-54823a6f2f28")
    public String getCapability() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.CAPABILITY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.CAPABILITY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.CAPABILITY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e9549fcc-1da0-43ce-8fb2-a7adaa4e1ffa")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirementDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0f0f317b-c374-4ab0-997a-34fda1776d21")
    public String getLowerBound() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRequirementDefinition.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0a6ba7b5-d42c-46b5-b389-9fadd8903302")
    public String getName() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRequirementDefinition.node'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("73a64a06-78ad-493e-ae5a-c4428bfb66fd")
    public String getNode() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.NODE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.NODE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.NODE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRequirementDefinition.relationshipType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a5553612-37e3-4907-8529-30b5c4429827")
    public String getRelationshipType() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.RELATIONSHIPTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.RELATIONSHIPTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.RELATIONSHIPTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRequirementDefinition.requirementType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("22491e84-68df-4448-941a-d62608acf247")
    public String getRequirementType() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRequirementDefinition.upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1bc467c7-5c19-482e-ba45-d9d45c292d13")
    public String getUpperBound() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("53fced9d-a98b-465e-923d-8622e2e4c81e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirementDefinition.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e5775b9d-5a19-444d-a410-beb97475f6b3")
    public void setCapability(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.CAPABILITY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.CAPABILITY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirementDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6979bd99-24dd-4d61-9b01-5412e8f62094")
    public void setLowerBound(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirementDefinition.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0e2f090f-cd0a-498c-b733-b15af1cc385f")
    public void setName(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirementDefinition.node'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b2055e20-2d59-44b7-aec8-8133bd7c7da8")
    public void setNode(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.NODE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.NODE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirementDefinition.relationshipType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("77dbd699-81c5-498c-856a-b869d92205d8")
    public void setRelationshipType(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.RELATIONSHIPTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.RELATIONSHIPTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirementDefinition.requirementType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c0d045be-afca-4e91-be1e-6ae04dfa1acd")
    public void setRequirementType(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirementDefinition.upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e9989fdd-79aa-445e-a3e8-9eaf2f81f20c")
    public void setUpperBound(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value));
    }

    @objid ("760b945d-4dcb-4db3-9d99-c647154b89a9")
    protected  TRequirementDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("9915e373-e52a-48e7-b42f-8f36fc5c59c5")
    public static final class MdaTypes {
        @objid ("5b6c7708-c304-48d4-a013-21f281dd5426")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ec0b5c1b-b5e0-4b88-97c1-26074e43376a")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("5b9a8f10-63e1-4100-9c8f-d284defc635f")
        public static PropertyDefinition LOWERBOUND_PROPERTY_ELT;

        @objid ("d49a9870-993b-4188-867b-b154d6a7d17e")
        public static PropertyDefinition UPPERBOUND_PROPERTY_ELT;

        @objid ("689e9083-6df5-4e86-996d-3ec987bf80a8")
        public static PropertyDefinition REQUIREMENTTYPE_PROPERTY_ELT;

        @objid ("e279dc01-e52a-4e26-aaf8-fe85d7fb046e")
        public static PropertyDefinition CAPABILITY_PROPERTY_ELT;

        @objid ("0245577b-2560-4ec0-94ad-b8325458e034")
        public static PropertyDefinition NODE_PROPERTY_ELT;

        @objid ("eec35ef9-4efa-4a0c-87d0-7cab491406c4")
        public static PropertyDefinition RELATIONSHIPTYPE_PROPERTY_ELT;

        @objid ("92427875-d0b8-469f-9c8d-38c1721a4e6f")
        private static Stereotype MDAASSOCDEP;

        @objid ("da7de993-9c0b-4af1-ad07-e44220503e1e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("29035a17-86cb-464a-9818-78ab1b4258b7")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2637c4bd-ca93-4012-82ea-8ef2ba5ca444", "TRequirementDefinition");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "9c566aec-ad96-40ff-a064-234052f3d025", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "91760dfd-39c9-4ee5-86f3-3f66d6cd56fe", "lowerBound");
            LOWERBOUND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (LOWERBOUND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "db6cac6e-1eab-4d18-a9f6-07531e0eff4f", "upperBound");
            UPPERBOUND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (UPPERBOUND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b8f4932e-2500-4aa3-882b-7ca4d95a2f70", "requirementType");
            REQUIREMENTTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIREMENTTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "4699ffd2-e5f2-47b5-99eb-adea71856f66", "capability");
            CAPABILITY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CAPABILITY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "e2bdc4d9-4e3e-468b-a7d8-425a7f61ee74", "node");
            NODE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NODE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "c8fde60c-6d12-4e8e-b8c9-cf11d459c151", "relationshipType");
            RELATIONSHIPTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (RELATIONSHIPTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

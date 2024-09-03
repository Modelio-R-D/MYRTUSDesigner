/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 15:34 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Attribute} with << TRequirementDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0f87c424-2110-40e4-b8fc-121a03c42988")
public class TRequirementDefinition implements IMdaProxy {
    @objid ("d5050a82-2669-47f2-aff9-6b2b4421bcc5")
    public static final String STEREOTYPE_NAME = "TRequirementDefinition";

    @objid ("ee0058a6-1020-4fc3-8f53-c680f4286bed")
    public static final String CAPABILITY_PROPERTY = "capability";

    @objid ("4857f813-9efc-493b-9704-fe75c0bfeffd")
    public static final String LOWERBOUND_PROPERTY = "lowerBound";

    @objid ("3db425c1-8960-4a6d-88aa-20077dd5fb70")
    public static final String NAME_PROPERTY = "name";

    @objid ("1deadc92-8729-4270-9598-b22a8e5057a3")
    public static final String NODE_PROPERTY = "node";

    @objid ("31302696-3eb7-4006-983f-a7e43ee4c500")
    public static final String RELATIONSHIPTYPE_PROPERTY = "relationshipType";

    @objid ("b79cc81f-49b5-4afc-a91b-4717b72a1682")
    public static final String REQUIREMENTTYPE_PROPERTY = "requirementType";

    @objid ("83bb6804-5632-4f65-bf37-e13e76fa2cde")
    public static final String UPPERBOUND_PROPERTY = "upperBound";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("42459af5-b070-45ef-b671-b7e5547f20f4")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TRequirementDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TRequirementDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("06cdb1e7-a944-4049-bfa9-3f967c89c88d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TRequirementDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TRequirementDefinition >> then instantiate a {@link TRequirementDefinition} proxy.
     * 
     * @return a {@link TRequirementDefinition} proxy on the created {@link Attribute}.
     */
    @objid ("16643e3e-4b08-42bc-9013-af0f6f1e06bc")
    public static TRequirementDefinition create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT);
        return TRequirementDefinition.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinition} proxy from a {@link Attribute} stereotyped << TRequirementDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link TRequirementDefinition} proxy or <i>null</i>.
     */
    @objid ("0ee9ad8d-9b8c-4ba7-80d2-e722f6f263f2")
    public static TRequirementDefinition instantiate(final Attribute obj) {
        return TRequirementDefinition.canInstantiate(obj) ? new TRequirementDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinition} proxy from a {@link Attribute} stereotyped << TRequirementDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TRequirementDefinition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("044415f5-d41f-45d7-87e7-2ccdbff56802")
    public static TRequirementDefinition safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TRequirementDefinition.canInstantiate(obj))
        	return new TRequirementDefinition(obj);
        else
        	throw new IllegalArgumentException("TRequirementDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("924c6d07-8339-4444-8466-3174cc6c56a4")
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
    @objid ("07c8108e-1487-43f5-a8f8-6ba300a7c48f")
    public String getCapability() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.CAPABILITY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.CAPABILITY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.CAPABILITY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("a0d68919-9ec7-446a-8c47-a6744bd30bd5")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirementDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7d8f4643-1c2f-430e-922c-73a2059efa02")
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
    @objid ("8cd23bac-5cb3-45f7-9918-4b65b0bf438d")
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
    @objid ("438505ba-8232-44a3-93dd-1753d8947a62")
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
    @objid ("2b79c32c-760b-4f29-ad5a-31b413dce0da")
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
    @objid ("be4511ee-909a-4543-b54c-2003c039d502")
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
    @objid ("87028a67-62ff-4a93-9978-9e27a45dd891")
    public String getUpperBound() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("c88cc02a-8078-4544-8fa4-56dd3ba73290")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirementDefinition.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6a2ba40e-08e8-4781-a174-78f1f26e0c3e")
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
    @objid ("1d3fa2c3-7990-43e1-8381-27ef09794ab8")
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
    @objid ("f8ecef48-2313-4f65-8a8f-2acad886fc2c")
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
    @objid ("74e2269a-04e1-4470-803d-37e2e872d5d3")
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
    @objid ("898cc380-5e5b-46f6-9299-095f9b5488f1")
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
    @objid ("9ac20b15-36cf-4165-b4c8-b0bdb4187b55")
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
    @objid ("d2240e82-102b-47ce-a252-ef72dd47b9f2")
    public void setUpperBound(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value));
    }

    @objid ("59edb51a-1bc8-4ad0-ada5-09b6e6c6cb4a")
    protected  TRequirementDefinition(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("239719f7-8029-4ad8-b59f-c586369aea18")
    public static final class MdaTypes {
        @objid ("a0ff0e37-50b9-4154-ad15-541ebe475728")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("df79a074-bb22-48b1-b8fe-3864cd6f7580")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("8f38e2ff-635a-426f-989c-afdf306515b4")
        public static PropertyDefinition LOWERBOUND_PROPERTY_ELT;

        @objid ("770aa529-c91a-4c51-a0f7-e41214bb45e2")
        public static PropertyDefinition UPPERBOUND_PROPERTY_ELT;

        @objid ("3d51fa1f-785e-475b-a702-b6a8ab51018c")
        public static PropertyDefinition REQUIREMENTTYPE_PROPERTY_ELT;

        @objid ("4126bc1e-075a-4c66-b83d-f16dc57ddb9b")
        public static PropertyDefinition CAPABILITY_PROPERTY_ELT;

        @objid ("0ab39daf-997f-4671-93f8-49d41564a3ea")
        public static PropertyDefinition NODE_PROPERTY_ELT;

        @objid ("bba43d87-98ed-46c6-b24d-f9e5d646e6ba")
        public static PropertyDefinition RELATIONSHIPTYPE_PROPERTY_ELT;

        @objid ("cf10feef-2784-43a2-aaba-51c97d9e178b")
        private static Stereotype MDAASSOCDEP;

        @objid ("bd084541-d2b9-474a-b433-d7db18ece88f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("51478177-0f42-4c32-bf63-6b871a721c1d")
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

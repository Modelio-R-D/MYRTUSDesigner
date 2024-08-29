/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 14:48 by Modelio Studio.
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
@objid ("0f87c424-2110-40e4-b8fc-121a03c42988")
public class TRequirementDefinition implements IMdaProxy {
    @objid ("1236a0bb-ead7-4b23-9a67-7d3ec1f21e01")
    public static final String STEREOTYPE_NAME = "TRequirementDefinition";

    @objid ("a1e38fe8-3e81-46fb-a2e7-39f8845cded2")
    public static final String CAPABILITY_PROPERTY = "capability";

    @objid ("44742143-7d4a-4e04-98ff-90440492a9e1")
    public static final String LOWERBOUND_PROPERTY = "lowerBound";

    @objid ("34e3012e-40c8-459a-81df-298cf5ede51a")
    public static final String NAME_PROPERTY = "name";

    @objid ("801783f1-0a35-4e37-bb87-f78a6a560e51")
    public static final String NODE_PROPERTY = "node";

    @objid ("13577ab8-6954-4cc0-bb83-81df6aacc47e")
    public static final String RELATIONSHIPTYPE_PROPERTY = "relationshipType";

    @objid ("aed5f220-f8dd-423f-bd32-6924e70ef15e")
    public static final String REQUIREMENTTYPE_PROPERTY = "requirementType";

    @objid ("0ea36e19-753e-4a49-85bd-fddd31972e85")
    public static final String UPPERBOUND_PROPERTY = "upperBound";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("8b1e2926-4e90-4e36-9b53-17751b3a8128")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirementDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirementDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1642b421-c3e9-45fd-9d8d-cc47f4dc99ca")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirementDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirementDefinition >> then instantiate a {@link TRequirementDefinition} proxy.
     * 
     * @return a {@link TRequirementDefinition} proxy on the created {@link Class}.
     */
    @objid ("e78d8e34-14b2-437e-8a43-9ea71364a4ac")
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
    @objid ("6648c8ae-d5b4-4ad3-90cb-3f0d1b547cd5")
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
    @objid ("6b9c0b89-4177-45c6-b904-95b54711e339")
    public static TRequirementDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirementDefinition.canInstantiate(obj))
        	return new TRequirementDefinition(obj);
        else
        	throw new IllegalArgumentException("TRequirementDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7e2bb1db-5709-4ac5-8315-d729efde7084")
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
    @objid ("4e9ac4fb-c44d-4512-b47d-d46ec8f1cba7")
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
    @objid ("14f982f8-8d12-49b3-bbde-02302ec19fd1")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirementDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bb535ea7-7bde-4822-aa5c-8a5a74562754")
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
    @objid ("94952fbc-74b3-4de4-a474-7bc4d0b595ec")
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
    @objid ("9282d9b4-5579-4928-a576-77f2594c0c80")
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
    @objid ("820030c6-eb76-4bdc-9ac4-5a1b385335f9")
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
    @objid ("cf715a97-a7df-4afa-9fac-3b29cd6f0a00")
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
    @objid ("2fda1242-b634-48be-b383-d5c2d17a8270")
    public String getUpperBound() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("fc93a09e-239b-4dd5-9980-ce8eb258fae3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirementDefinition.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a6ccbdf5-3c60-441f-8860-5016581da62e")
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
    @objid ("37deedd7-cf89-430f-9635-cda4349256ce")
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
    @objid ("f0bcdc7d-2699-43d6-b5f5-582f900910e0")
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
    @objid ("864265d3-556c-4e8b-8589-5d6eb59e2000")
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
    @objid ("3130a007-5f48-41b8-8e9a-9c80fb2a542a")
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
    @objid ("3de7f974-7c9a-4d96-a5e6-27aabfe64989")
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
    @objid ("4eeb4043-b17a-402b-b99a-e1f9405b767d")
    public void setUpperBound(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value));
    }

    @objid ("30ae3934-1921-47c5-8716-8fe026592f20")
    protected  TRequirementDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("239719f7-8029-4ad8-b59f-c586369aea18")
    public static final class MdaTypes {
        @objid ("9c008658-1292-4b18-a25c-de35d977e047")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c12daaad-b48e-45bd-9fd7-34d128787b86")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("332f29f3-4ef2-4fcb-8d62-87a774b19544")
        public static PropertyDefinition LOWERBOUND_PROPERTY_ELT;

        @objid ("b68afe7f-293b-459b-8a85-e204e3b5c6bd")
        public static PropertyDefinition UPPERBOUND_PROPERTY_ELT;

        @objid ("bc4cd5b6-f7c1-44ea-847e-6d829e71acc6")
        public static PropertyDefinition REQUIREMENTTYPE_PROPERTY_ELT;

        @objid ("7ea1fc97-4305-47b3-bfd4-5ba42bfbc1f7")
        public static PropertyDefinition CAPABILITY_PROPERTY_ELT;

        @objid ("691408ed-1bff-4ba4-aac9-efd40b03a744")
        public static PropertyDefinition NODE_PROPERTY_ELT;

        @objid ("099c909b-2a9e-4661-a5d1-99433ef41086")
        public static PropertyDefinition RELATIONSHIPTYPE_PROPERTY_ELT;

        @objid ("343b4524-1b18-4870-8b6e-fca3ecedf022")
        private static Stereotype MDAASSOCDEP;

        @objid ("8d16712e-dbd7-48c8-ac07-f3dfac0e1550")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e4ddf254-ee8a-47ce-b5d9-14fdfbe368d5")
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

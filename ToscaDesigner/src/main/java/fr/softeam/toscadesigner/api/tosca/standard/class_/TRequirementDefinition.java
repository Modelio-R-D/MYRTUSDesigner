/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 16:27 by Modelio Studio.
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
    @objid ("780eb88c-d362-43e6-b9e9-417827b25c86")
    public static final String STEREOTYPE_NAME = "TRequirementDefinition";

    @objid ("9b7c0658-d1ab-4554-b277-c2ac5181f0cf")
    public static final String CAPABILITY_PROPERTY = "capability";

    @objid ("78f30e18-556e-4175-b258-bf08526b70e4")
    public static final String LOWERBOUND_PROPERTY = "lowerBound";

    @objid ("8a8ef556-13df-41b7-8ad8-d7fd9c2499c7")
    public static final String NAME_PROPERTY = "name";

    @objid ("dfe09b7a-02b4-43b6-b76a-047953a7624f")
    public static final String NODE_PROPERTY = "node";

    @objid ("bd60d2af-0854-444f-8831-f7f02d6251a3")
    public static final String RELATIONSHIPTYPE_PROPERTY = "relationshipType";

    @objid ("fc4edc11-40f1-49c0-89b2-9d42f8c54209")
    public static final String REQUIREMENTTYPE_PROPERTY = "requirementType";

    @objid ("8321f793-52cc-4e74-9e7c-9a54c7aa7e5c")
    public static final String UPPERBOUND_PROPERTY = "upperBound";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("f102ba70-34ef-4fdf-a84c-415e92b2ebed")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirementDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirementDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4f64fd99-3360-42c3-9d46-a798edf0ae8f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirementDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirementDefinition >> then instantiate a {@link TRequirementDefinition} proxy.
     * @return a {@link TRequirementDefinition} proxy on the created {@link Class}.
     */
    @objid ("d6d2de09-6a7c-4851-a2d9-8081ea20e9fa")
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
    @objid ("edfa3802-207a-49a3-b895-d5b053e3cbb0")
    public static TRequirementDefinition instantiate(final Class obj) {
        return TRequirementDefinition.canInstantiate(obj) ? new TRequirementDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinition} proxy from a {@link Class} stereotyped << TRequirementDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRequirementDefinition} proxy.
     */
    @objid ("df754e94-0e5c-4894-9a56-dc2b493bce89")
    public static TRequirementDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirementDefinition.canInstantiate(obj))
            return new TRequirementDefinition(obj);
        else
            throw new IllegalArgumentException("TRequirementDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e603a3f7-01cb-4602-ae85-0f588f387447")
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
    @objid ("6dda5f26-a8bb-4910-bb10-a5599f510141")
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
    @objid ("2c03b291-fdd4-4837-83b6-b8f79067a7ed")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirementDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a0e82a02-cb95-47e2-84b7-0d746ef65e98")
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
    @objid ("b5696f0f-4503-488b-bfcb-915be5cf0c78")
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
    @objid ("673ce61d-7a97-4dde-ad92-27b9db3e4a50")
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
    @objid ("59c4d2c4-9929-4898-8cda-9031ecf3dbc5")
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
    @objid ("9b85760e-3808-4511-a058-9c0560a78c43")
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
    @objid ("f1c976b8-8b99-4b68-9c15-7b02e0347d7e")
    public String getUpperBound() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value, this.elt);
    }

    @objid ("89b67f15-4c8e-48e2-b955-7f4f82cd2185")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TRequirementDefinition.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("17e2c43c-4237-46f6-a938-913a79b916ad")
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
    @objid ("ddd8d039-32e4-415e-b66e-07f335c55bd5")
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
    @objid ("66cfae93-93bd-49d6-85fc-465c525b3881")
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
    @objid ("6346920c-9090-4744-af6b-4a6383d3b211")
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
    @objid ("966de5c3-9321-4cdf-a9a5-c08408ee552e")
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
    @objid ("c1f04e80-a428-4dbf-b833-d1a60fece5b5")
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
    @objid ("c4d4976c-9221-4f99-989c-4473302b430e")
    public void setUpperBound(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value));
    }

    @objid ("1e4ebfed-bb01-4577-afda-9a44267fc5ce")
    protected  TRequirementDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("9915e373-e52a-48e7-b42f-8f36fc5c59c5")
    public static final class MdaTypes {
        @objid ("45b87910-6fc1-460c-a32c-76b15388bbbf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d4477126-3f30-4b79-96ef-00c35f7250bb")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("6f63a826-f7a6-4f67-b41b-ee2986593e77")
        public static PropertyDefinition LOWERBOUND_PROPERTY_ELT;

        @objid ("92f6d97f-99ec-4fc5-aa82-0359eae343d3")
        public static PropertyDefinition UPPERBOUND_PROPERTY_ELT;

        @objid ("85739c65-8bc2-4b50-a32a-4346e8c68e59")
        public static PropertyDefinition REQUIREMENTTYPE_PROPERTY_ELT;

        @objid ("cd4f8c89-d48f-4a71-93ff-511e05662815")
        public static PropertyDefinition CAPABILITY_PROPERTY_ELT;

        @objid ("6d641411-e039-4917-8944-12306780230c")
        public static PropertyDefinition NODE_PROPERTY_ELT;

        @objid ("55644639-3719-45b2-ae98-4e24937cb653")
        public static PropertyDefinition RELATIONSHIPTYPE_PROPERTY_ELT;

        @objid ("cbbbc6cf-3f0b-4199-a324-95e3a313cbe6")
        private static Stereotype MDAASSOCDEP;

        @objid ("08b86df6-6f92-4cf7-b5ae-3b81263f6507")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4e8ced7c-733c-4812-bf3f-aee6dbe7249f")
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

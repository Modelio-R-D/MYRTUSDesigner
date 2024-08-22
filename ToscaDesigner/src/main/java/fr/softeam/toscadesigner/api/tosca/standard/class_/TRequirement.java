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
 * Proxy class to handle a {@link Class} with << TRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7441d43a-6384-456d-a82a-7133317114d4")
public class TRequirement implements IMdaProxy {
    @objid ("d55e40c8-8b85-454d-a80f-daa4b5c88939")
    public static final String STEREOTYPE_NAME = "TRequirement";

    @objid ("e26ba2c2-c7a7-460b-8117-87b226317f13")
    public static final String CAPABILITY_PROPERTY = "capability";

    @objid ("5bece9f9-e6e2-42f6-b4be-05c401ffe0f2")
    public static final String NODE_PROPERTY = "node";

    @objid ("c6f898b6-5bb7-489b-8e70-c45308d41320")
    public static final String REQUIREMENTDEF_PROPERTY = "requirementDef";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("f85a6dec-3565-4965-9e2e-87fcc1c9fe8e")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6bf8c64c-982a-460a-9de5-8b03c894c324")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirement.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirement >> then instantiate a {@link TRequirement} proxy.
     * @return a {@link TRequirement} proxy on the created {@link Class}.
     */
    @objid ("87b7d1c9-ace1-4810-afa9-dcb32e2c7309")
    public static TRequirement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRequirement.MdaTypes.STEREOTYPE_ELT);
        return TRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRequirement} proxy from a {@link Class} stereotyped << TRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRequirement} proxy or <i>null</i>.
     */
    @objid ("7ff1c918-8198-49ef-b2dc-f346becaf9d7")
    public static TRequirement instantiate(final Class obj) {
        return TRequirement.canInstantiate(obj) ? new TRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirement} proxy from a {@link Class} stereotyped << TRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRequirement} proxy.
     */
    @objid ("33baf87d-18f2-4e73-bcfd-855652d1bc29")
    public static TRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirement.canInstantiate(obj))
            return new TRequirement(obj);
        else
            throw new IllegalArgumentException("TRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0428da82-e566-4268-87b2-5c8268b508e5")
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
        TRequirement other = (TRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TRequirement.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2bea9cd2-4278-4228-905a-dc9c4ef54edb")
    public String getCapability() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1c3d8e5c-6b31-4540-bb5a-54b61f61cd39")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirement.node'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d4636d98-7291-4437-8a8c-7103bbf2677f")
    public String getNode() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.NODE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.NODE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.NODE_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TRequirement.requirementDef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("39281137-60af-4cc7-a265-4bc392690b5c")
    public String getRequirementDef() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT, value, this.elt);
    }

    @objid ("41974196-f79b-41ad-b192-1705779d2dff")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TRequirement.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("67ddae34-b174-4cfb-80f0-9e64cbfade2d")
    public void setCapability(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirement.node'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5aec1362-86bb-479d-8361-045ec9de50a8")
    public void setNode(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.NODE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.NODE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirement.requirementDef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d75f5a91-f8ec-498a-9070-a2ca4aed5f95")
    public void setRequirementDef(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT, value));
    }

    @objid ("0078f9a1-4bdd-4534-bc24-055e30ac8ec2")
    protected  TRequirement(final Class elt) {
        this.elt = elt;
    }

    @objid ("31efaf6b-695c-472a-9430-e6d8d4f1c34a")
    public static final class MdaTypes {
        @objid ("75c83098-566e-4432-8378-f6f0887d9dd1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6bead612-f812-448f-a45b-7f9c4f75a4cb")
        public static PropertyDefinition REQUIREMENTDEF_PROPERTY_ELT;

        @objid ("d36cd4e0-07dd-47c9-9bde-1e60c9b0b744")
        public static PropertyDefinition NODE_PROPERTY_ELT;

        @objid ("e7514f05-9cdc-4402-9c0f-8294a4eb6441")
        public static PropertyDefinition CAPABILITY_PROPERTY_ELT;

        @objid ("c6eb97f4-e56a-4ae4-9fc2-6871f341dc22")
        private static Stereotype MDAASSOCDEP;

        @objid ("d7e95e96-ca18-4ede-bb1c-ddd348c3d52c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ad9f108a-f223-445c-aef4-48137e730c7b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2a38f650-7f59-41a7-a928-ac9cbe326f84", "TRequirement");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "95a52b2f-43dd-469a-b6da-a187ef6573a1", "requirementDef");
            REQUIREMENTDEF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIREMENTDEF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "9b71e3fd-b9be-40ac-8927-65d4c036620d", "node");
            NODE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NODE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a2fbc97c-1332-41c8-be52-510fbfcb4bf2", "capability");
            CAPABILITY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CAPABILITY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

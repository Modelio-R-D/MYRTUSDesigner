/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:52 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << NodeOperationType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7369d13d-d771-41c7-8226-4dea89447373")
public class NodeOperationType implements IMdaProxy {
    @objid ("2a427614-53a6-4edf-afb3-f07b31729ae6")
    public static final String STEREOTYPE_NAME = "NodeOperationType";

    @objid ("7c15c7fc-a22b-4d59-9b42-2c472f9052a0")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("8e02e20b-e593-4c5d-b62c-eb4e8c3b8416")
    public static final String NODEREF_PROPERTY = "nodeRef";

    @objid ("1e33a0a4-a600-4355-85ce-b47b2e9fab23")
    public static final String OPERTATIONNAME_PROPERTY = "opertationName";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("3ffe8bf2-7b51-49d8-ba3f-57f4a2709001")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link NodeOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NodeOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a8fd76ae-2b7f-46c9-b362-e64af1feaeb3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (NodeOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(NodeOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << NodeOperationType >> then instantiate a {@link NodeOperationType} proxy.
     * 
     * @return a {@link NodeOperationType} proxy on the created {@link ModelElement}.
     */
    @objid ("0d7f1bb4-bb80-404c-a588-c5da28eb5d16")
    public static NodeOperationType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(NodeOperationType.MdaTypes.STEREOTYPE_ELT);
        return NodeOperationType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link NodeOperationType} proxy from a {@link ModelElement} stereotyped << NodeOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link NodeOperationType} proxy or <i>null</i>.
     */
    @objid ("f23ea8d0-2dbe-4ae9-adba-e06b200f1e42")
    public static NodeOperationType instantiate(final ModelElement obj) {
        return NodeOperationType.canInstantiate(obj) ? new NodeOperationType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NodeOperationType} proxy from a {@link ModelElement} stereotyped << NodeOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link NodeOperationType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ec93bffe-fe3e-4da0-8661-14cdbd775751")
    public static NodeOperationType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (NodeOperationType.canInstantiate(obj))
        	return new NodeOperationType(obj);
        else
        	throw new IllegalArgumentException("NodeOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dfc30cc0-c824-425b-b75d-661b33cf0b9f")
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
        NodeOperationType other = (NodeOperationType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("401208d3-8c46-4288-9e31-7c731c92a1c3")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'NodeOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("85f3a1c7-29f6-4b9d-9d83-9c4248e74f71")
    public String getInterfaceName() {
        String value = this.elt.getProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                                            NodeOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = NodeOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(NodeOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'NodeOperationType.nodeRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("99ebfe2e-8e37-48e1-bbb5-661efdc07703")
    public String getNodeRef() {
        String value = this.elt.getProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                                            NodeOperationType.MdaTypes.NODEREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = NodeOperationType.MdaTypes.NODEREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(NodeOperationType.MdaTypes.NODEREF_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'NodeOperationType.opertationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("82db4a33-be52-4b77-b564-2e4d5cdb406d")
    public String getOpertationName() {
        String value = this.elt.getProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                                            NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("5ad89e46-cccf-48a5-9dfb-e2513aed27b4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'NodeOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("95df085d-1c1d-4e49-bd8f-a5b154070f48")
    public void setInterfaceName(final String value) {
        this.elt.setProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                             NodeOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(NodeOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'NodeOperationType.nodeRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ff38a15e-8fa2-4b28-87b8-19c1aacdb4f4")
    public void setNodeRef(final String value) {
        this.elt.setProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                             NodeOperationType.MdaTypes.NODEREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(NodeOperationType.MdaTypes.NODEREF_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'NodeOperationType.opertationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3e3c2f2c-2b6f-419f-961a-f8a410696e8d")
    public void setOpertationName(final String value) {
        this.elt.setProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                             NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT, value));
    }

    @objid ("92abfe39-18e4-498f-aa1e-82297f75cbb0")
    protected  NodeOperationType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("7015e067-e16d-4c92-a776-7e743673ae43")
    public static final class MdaTypes {
        @objid ("a9130bd4-1068-4f0b-a824-b12be4e9b4d5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3353925e-7d6a-4231-b39b-ccb151299f72")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("771778e4-daae-491d-a54e-3c2f1665a428")
        public static PropertyDefinition NODEREF_PROPERTY_ELT;

        @objid ("7323f683-b2f2-4e72-9989-ebf948b7af9f")
        public static PropertyDefinition OPERTATIONNAME_PROPERTY_ELT;

        @objid ("64d0f569-768b-4590-be5c-40a210e00be0")
        private static Stereotype MDAASSOCDEP;

        @objid ("22000f1d-d808-468c-a098-322550365489")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("63db11b9-2522-4fd3-a1f1-49ae12f1b04b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2832c453-5360-4e0a-a716-48fb2104dd5d", "NodeOperationType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d0f636eb-f398-45b4-a441-bdaafb2da927", "interfaceName");
            INTERFACENAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INTERFACENAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "5585cc15-5f38-4131-b6b7-c53aeba2d278", "nodeRef");
            NODEREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NODEREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "89df8b10-e13e-409c-afd2-121788c6a20e", "opertationName");
            OPERTATIONNAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (OPERTATIONNAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

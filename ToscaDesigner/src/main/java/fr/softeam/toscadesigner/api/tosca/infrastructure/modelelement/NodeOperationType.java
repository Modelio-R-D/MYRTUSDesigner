/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 23/09/2024 12:50 by Modelio Studio.
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
@objid ("09ae7654-463f-4c7c-90de-b0600bc75492")
public class NodeOperationType implements IMdaProxy {
    @objid ("ab60b16d-aa04-49f1-83f5-a34b68333391")
    public static final String STEREOTYPE_NAME = "NodeOperationType";

    @objid ("64c29b47-7d51-4b93-baa8-ab643a8fb9fc")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("96d3f32a-aa97-445d-b611-1cf168076bbd")
    public static final String NODEREF_PROPERTY = "nodeRef";

    @objid ("391ae45e-32bf-459b-b4db-f1aeecb599d9")
    public static final String OPERTATIONNAME_PROPERTY = "opertationName";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("76cf218a-3d3c-4931-a6e3-92e3fd11792f")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link NodeOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NodeOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0b4016cc-b390-453e-9d66-4a2ed6130055")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (NodeOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(NodeOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << NodeOperationType >> then instantiate a {@link NodeOperationType} proxy.
     * 
     * @return a {@link NodeOperationType} proxy on the created {@link ModelElement}.
     */
    @objid ("6430ba6e-3abd-4a5e-bb6b-a05119d93c3c")
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
    @objid ("22a1628c-b6fa-421e-9a3c-02c08eaeac74")
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
    @objid ("4d54861c-e2cc-447f-a935-cd4cdad78a82")
    public static NodeOperationType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (NodeOperationType.canInstantiate(obj))
        	return new NodeOperationType(obj);
        else
        	throw new IllegalArgumentException("NodeOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("36bc26df-6825-422a-8bbe-2e3e4d357087")
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
    @objid ("154a0fec-606a-4a9d-8b85-e4ac592b729e")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'NodeOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1acbd7c1-0525-4811-8491-5fca85535267")
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
    @objid ("22a1c866-db51-4f35-a0fa-43855d7816a1")
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
    @objid ("06067f2d-83c8-47af-8780-6288d4c49821")
    public String getOpertationName() {
        String value = this.elt.getProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                                            NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("cb6f9723-6261-47f4-9f98-816a9d49a877")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'NodeOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fcbcdea8-1910-4e69-9f75-274fa279f254")
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
    @objid ("5664e8a7-d322-4a50-a6fc-77f4eb06723e")
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
    @objid ("81d0700d-0395-4aef-8232-173e9670d3ac")
    public void setOpertationName(final String value) {
        this.elt.setProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                             NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT, value));
    }

    @objid ("22d5d5c8-06f3-47e3-8575-89ad959a67eb")
    protected  NodeOperationType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("a14492aa-6c13-431f-9dcc-d0cc3a262c33")
    public static final class MdaTypes {
        @objid ("7d8dc4ed-2a39-4213-85d2-2666a627138c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bdcbfa43-0b13-4f9f-8ec4-f1495fb8df3f")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("7ddbd541-ca46-4677-84c5-08681eff405a")
        public static PropertyDefinition NODEREF_PROPERTY_ELT;

        @objid ("cd611803-c9e7-44ef-ba12-496acc125d07")
        public static PropertyDefinition OPERTATIONNAME_PROPERTY_ELT;

        @objid ("6d3d5e17-b6d5-4d7b-8ce6-e12c9cda22eb")
        private static Stereotype MDAASSOCDEP;

        @objid ("00858f70-3086-4a2a-af95-cbf75513bcf0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6950e81b-7cda-42e6-9ac9-dad75a5d57e6")
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

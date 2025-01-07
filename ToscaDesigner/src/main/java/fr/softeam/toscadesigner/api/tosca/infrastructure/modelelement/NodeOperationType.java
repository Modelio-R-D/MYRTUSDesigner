/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 11:20 by Modelio Studio.
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
    @objid ("f25565a6-d9e2-4a6a-98cf-c86f3e34bcff")
    public static final String STEREOTYPE_NAME = "NodeOperationType";

    @objid ("fe6fef71-7337-42d1-bb0f-7412983fbb7b")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("285753ba-6633-46da-95b1-466fc05cf3c0")
    public static final String NODEREF_PROPERTY = "nodeRef";

    @objid ("fe8bb945-b603-42e3-b7b7-e6c31516e638")
    public static final String OPERTATIONNAME_PROPERTY = "opertationName";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("712447a4-e82d-4b0f-a979-3d9fec260cc8")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link NodeOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NodeOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fb2f6cc8-a266-42a1-97f2-662446f64154")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (NodeOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(NodeOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << NodeOperationType >> then instantiate a {@link NodeOperationType} proxy.
     * 
     * @return a {@link NodeOperationType} proxy on the created {@link ModelElement}.
     */
    @objid ("e760535a-0d8f-4796-aa4b-c5658deaa896")
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
    @objid ("1f674929-380f-453a-8f9a-5850d6bdbacb")
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
    @objid ("3849210d-9bef-431f-b12e-aaef0cfffd7a")
    public static NodeOperationType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (NodeOperationType.canInstantiate(obj))
        	return new NodeOperationType(obj);
        else
        	throw new IllegalArgumentException("NodeOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a0858e92-27ae-46e4-b23e-4a9ce35c18fd")
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
    @objid ("9418ed8b-55cb-4452-ba64-75ca4843e63a")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'NodeOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("016505bd-2a3f-4fa8-ae92-035e155f3c20")
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
    @objid ("8014d7bd-d330-41cb-944c-d9f3c64bc317")
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
    @objid ("da7b5e5e-b0e6-449a-bd1e-ca1d989a2f3c")
    public String getOpertationName() {
        String value = this.elt.getProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                                            NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("72c2dc71-77dd-4ab9-b9c2-ef0af2f42b3c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'NodeOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1a31c5a3-3ae2-412b-959b-df69a40220dc")
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
    @objid ("4f817707-224d-4f0c-9df0-d7d2d03d639a")
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
    @objid ("89648e8b-73ed-47e1-8cd7-2fc8380c321c")
    public void setOpertationName(final String value) {
        this.elt.setProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                             NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT, value));
    }

    @objid ("7e281978-d76a-4aea-a739-dedc3175d7d3")
    protected  NodeOperationType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("a14492aa-6c13-431f-9dcc-d0cc3a262c33")
    public static final class MdaTypes {
        @objid ("0e370c17-c38f-44f7-a2ca-604668bf097c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3a428740-134e-412b-b7bf-4c4b86fc0589")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("f5f3fa4c-d001-427c-bf38-74c8d562a886")
        public static PropertyDefinition NODEREF_PROPERTY_ELT;

        @objid ("94f0d9e8-f381-43b6-bff8-2d865891a674")
        public static PropertyDefinition OPERTATIONNAME_PROPERTY_ELT;

        @objid ("0c5d3a20-c2c7-4649-8d84-3af2e5f02a70")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ff267fa-3172-40e0-a3ba-231c71c0327c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aec053cd-4556-42d9-a29c-c481fb247caf")
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

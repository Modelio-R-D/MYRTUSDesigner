/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/09/2024 11:42 by Modelio Studio.
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
    @objid ("60f99126-f635-470b-9bb3-83f5562051f6")
    public static final String STEREOTYPE_NAME = "NodeOperationType";

    @objid ("38860df2-faad-482c-9e84-8aef185f6b0c")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("fc377d93-f348-4756-abf7-f059790cfc07")
    public static final String NODEREF_PROPERTY = "nodeRef";

    @objid ("17a6db3f-0bfc-48cd-bff1-379eb2622827")
    public static final String OPERTATIONNAME_PROPERTY = "opertationName";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("89ce7694-ef59-4c10-b663-9d8a320cde38")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link NodeOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NodeOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("29ff951a-256a-4fd5-be62-7c4315e8aafb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (NodeOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(NodeOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << NodeOperationType >> then instantiate a {@link NodeOperationType} proxy.
     * 
     * @return a {@link NodeOperationType} proxy on the created {@link ModelElement}.
     */
    @objid ("7f649262-09b8-4071-a666-33d259a86c39")
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
    @objid ("ac43f5ff-4bbf-4384-8700-ca00a9a2265a")
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
    @objid ("5b765d73-a2d6-46ef-a7f1-bd2c3935eec8")
    public static NodeOperationType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (NodeOperationType.canInstantiate(obj))
        	return new NodeOperationType(obj);
        else
        	throw new IllegalArgumentException("NodeOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6b3944d2-fa85-4aa2-afe6-2f68ffb1cad0")
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
    @objid ("3454681c-4882-486e-8b93-a08e514146c3")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'NodeOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("07f934c3-3cee-4475-bd6d-fa320defcc52")
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
    @objid ("7a317b29-d8d0-4d74-aea0-932f4011dd4f")
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
    @objid ("26d64df1-d2fe-4c25-8120-b6ef2fc1ef7d")
    public String getOpertationName() {
        String value = this.elt.getProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                                            NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("eeb62e64-79e3-49b4-b75f-adff11289db3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'NodeOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a590cd0a-b38b-4320-a7ce-45c579fbc90c")
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
    @objid ("4b16aa29-c66e-4e53-99c3-6a7f1208e057")
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
    @objid ("7bbdc4d2-1470-467e-8b01-b790e7d0cd7d")
    public void setOpertationName(final String value) {
        this.elt.setProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                             NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT, value));
    }

    @objid ("72f3f7d1-5c9e-43c9-9c12-048684f54706")
    protected  NodeOperationType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("a14492aa-6c13-431f-9dcc-d0cc3a262c33")
    public static final class MdaTypes {
        @objid ("e5105f01-a3b8-498e-a050-22f88c5df8d0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("11ac2962-bbd7-4977-9111-091089c47d0c")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("c7863b6e-6743-472e-92e2-053dcc64e3d5")
        public static PropertyDefinition NODEREF_PROPERTY_ELT;

        @objid ("bd33dbd7-1011-45d1-92f2-be0963dd9dab")
        public static PropertyDefinition OPERTATIONNAME_PROPERTY_ELT;

        @objid ("ca665290-0e87-4bb5-9213-77bc8da5f3e1")
        private static Stereotype MDAASSOCDEP;

        @objid ("52aed960-bf72-4b7c-8ab7-c6a514270ce4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1ba4e48a-c229-4f53-bdd5-9229541c866c")
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

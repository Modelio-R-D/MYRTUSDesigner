/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 24/09/2024 16:22 by Modelio Studio.
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
    @objid ("fb298ec9-04b8-405e-b708-2697f84a5deb")
    public static final String STEREOTYPE_NAME = "NodeOperationType";

    @objid ("55baf40e-a0c1-432e-adf0-76dc0d499df4")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("977d0cd4-fed9-4622-b754-3a4510f677c4")
    public static final String NODEREF_PROPERTY = "nodeRef";

    @objid ("1479eb11-9cb9-4c14-a56c-7d2f903c86c6")
    public static final String OPERTATIONNAME_PROPERTY = "opertationName";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("1a1de2bb-030e-4403-88ad-6929dcda7f69")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link NodeOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NodeOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a2c43490-05b7-49fc-a736-c1173e20724f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (NodeOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(NodeOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << NodeOperationType >> then instantiate a {@link NodeOperationType} proxy.
     * 
     * @return a {@link NodeOperationType} proxy on the created {@link ModelElement}.
     */
    @objid ("ab7a7003-a912-4507-a049-6b3622954679")
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
    @objid ("b8618615-fe00-44d5-923c-12c98e33ba45")
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
    @objid ("8b5fb46a-6ee6-4e7b-859b-d98e08fd9faa")
    public static NodeOperationType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (NodeOperationType.canInstantiate(obj))
        	return new NodeOperationType(obj);
        else
        	throw new IllegalArgumentException("NodeOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("feaf4e80-b6db-4307-b001-322fd3db404a")
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
    @objid ("4e70d239-2ce3-4197-bfa4-b2aa6270256d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'NodeOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("55be76ab-6383-4ec6-be84-c9d64a7630dd")
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
    @objid ("728cd77d-9949-4137-bfe3-c1170815de9f")
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
    @objid ("2a4339b8-9889-495b-a374-d5d3ab0f7c14")
    public String getOpertationName() {
        String value = this.elt.getProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                                            NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("57ba8b1a-d805-4a0a-87eb-522469acccb6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'NodeOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("376d245d-1c18-499f-88eb-e15afb06a291")
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
    @objid ("fe0411e4-6011-4f93-a47b-4ccf455dd21c")
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
    @objid ("72ea1953-a505-4b8a-a7bf-7c4462789758")
    public void setOpertationName(final String value) {
        this.elt.setProperty(NodeOperationType.MdaTypes.STEREOTYPE_ELT,
                             NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(NodeOperationType.MdaTypes.OPERTATIONNAME_PROPERTY_ELT, value));
    }

    @objid ("dab427cc-cd78-45ab-be3b-d2ffc3df04e9")
    protected  NodeOperationType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("a14492aa-6c13-431f-9dcc-d0cc3a262c33")
    public static final class MdaTypes {
        @objid ("5b0f5e85-5dc1-4d28-b6b6-9d3d94c13907")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9d365ace-fedb-4503-9656-38827bfa6c6a")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("11ca8dae-e61d-4fab-9c11-02e12ee6c13a")
        public static PropertyDefinition NODEREF_PROPERTY_ELT;

        @objid ("228a8b94-1984-4297-9fb5-681541697d92")
        public static PropertyDefinition OPERTATIONNAME_PROPERTY_ELT;

        @objid ("146fc3b9-355a-4c72-8ffe-abc79b6b8b79")
        private static Stereotype MDAASSOCDEP;

        @objid ("41aa7b4e-ac37-418c-a94d-051c63093f58")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7a911f0b-0f71-45d4-834e-624b286440d8")
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

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
 * Proxy class to handle a {@link ModelElement} with << NodeTypeReferenceType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c19077d4-951f-4cfa-9590-36f22d7334c4")
public class NodeTypeReferenceType implements IMdaProxy {
    @objid ("e3da0c9c-7b1b-4a8a-8e67-db9863adf686")
    public static final String STEREOTYPE_NAME = "NodeTypeReferenceType";

    @objid ("cb62fda2-0fca-49dc-ae4c-7e867f159927")
    public static final String TYPEREF_PROPERTY = "typeRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("a02f37f8-301a-4d6d-8d28-ab9123615782")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link NodeTypeReferenceType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NodeTypeReferenceType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d0f78dac-b361-4273-9483-8982e65d7322")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << NodeTypeReferenceType >> then instantiate a {@link NodeTypeReferenceType} proxy.
     * 
     * @return a {@link NodeTypeReferenceType} proxy on the created {@link ModelElement}.
     */
    @objid ("859ab6d4-9c11-4667-87af-63bebbf060b3")
    public static NodeTypeReferenceType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT);
        return NodeTypeReferenceType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link NodeTypeReferenceType} proxy from a {@link ModelElement} stereotyped << NodeTypeReferenceType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link NodeTypeReferenceType} proxy or <i>null</i>.
     */
    @objid ("9570c937-9e8c-48e4-aabf-2242562ba77b")
    public static NodeTypeReferenceType instantiate(final ModelElement obj) {
        return NodeTypeReferenceType.canInstantiate(obj) ? new NodeTypeReferenceType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NodeTypeReferenceType} proxy from a {@link ModelElement} stereotyped << NodeTypeReferenceType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link NodeTypeReferenceType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("030898b1-11a3-41b1-b2b1-4ba5918c8eb9")
    public static NodeTypeReferenceType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (NodeTypeReferenceType.canInstantiate(obj))
        	return new NodeTypeReferenceType(obj);
        else
        	throw new IllegalArgumentException("NodeTypeReferenceType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("600fd59d-f782-4690-8076-9d803f9a5e37")
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
        NodeTypeReferenceType other = (NodeTypeReferenceType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("8e701098-67d1-46b3-9e25-8c815cfb2f27")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'NodeTypeReferenceType.typeRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bbd35ad4-77b9-42b0-a1c9-fded6cd643b1")
    public String getTypeRef() {
        String value = this.elt.getProperty(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT,
                                            NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("2e5e83ad-2bff-4ee6-aca2-a78d9e9aa6a7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'NodeTypeReferenceType.typeRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7767bdf3-6cf7-4531-a10e-ddaad17afecc")
    public void setTypeRef(final String value) {
        this.elt.setProperty(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT,
                             NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT, value));
    }

    @objid ("042a7d7c-76c3-4a3f-8fde-745088cac38c")
    protected  NodeTypeReferenceType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("fe0f62f2-0eb9-4af3-ab7b-718496a27fb5")
    public static final class MdaTypes {
        @objid ("6d9d0f58-9ee3-4829-bab9-a68c4ba22097")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("544fa97a-8e2b-4420-83a4-51259dc3feee")
        public static PropertyDefinition TYPEREF_PROPERTY_ELT;

        @objid ("b4420eb8-8287-4b92-ac77-7a92e1f48c34")
        private static Stereotype MDAASSOCDEP;

        @objid ("02ec3578-6be8-410f-b35e-9693b3948409")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("87463c42-189f-46ab-b8ff-013579af283d")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "506839bb-7acf-4044-b5d0-0bed642f3902", "NodeTypeReferenceType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "42f61b18-eb26-44fc-b6f0-34360771b65c", "typeRef");
            TYPEREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TYPEREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

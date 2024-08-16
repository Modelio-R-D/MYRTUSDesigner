/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
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
@objid ("881c1c29-3642-47ff-b00e-44117f641468")
public class NodeTypeReferenceType implements IMdaProxy {
    @objid ("fa2be2b5-8b21-4a5a-b239-21d0ee4a2f5c")
    public static final String STEREOTYPE_NAME = "NodeTypeReferenceType";

    @objid ("57e61123-0a50-41d9-be46-d770e47cc10d")
    public static final String TYPEREF_PROPERTY = "typeRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("07b4e998-553d-43b4-82c1-7de47d089d8d")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link NodeTypeReferenceType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NodeTypeReferenceType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2d7ff8e0-3245-4c32-bfa4-c535cabdd4fc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << NodeTypeReferenceType >> then instantiate a {@link NodeTypeReferenceType} proxy.
     * 
     * @return a {@link NodeTypeReferenceType} proxy on the created {@link ModelElement}.
     */
    @objid ("d965ef83-a194-467b-af16-b764f2229109")
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
    @objid ("f74a50ab-ad55-4beb-9162-e1b0072c5eba")
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
    @objid ("daaf301b-2e30-4912-ae2b-6716dbba418e")
    public static NodeTypeReferenceType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (NodeTypeReferenceType.canInstantiate(obj))
        	return new NodeTypeReferenceType(obj);
        else
        	throw new IllegalArgumentException("NodeTypeReferenceType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ba113f2d-8e16-4d71-a5ea-c53670a1a794")
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
    @objid ("47d662da-d0ae-4b0d-b151-7e2582a7665f")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'NodeTypeReferenceType.typeRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cd802720-3f63-4152-b650-ed2664ea59a3")
    public String getTypeRef() {
        String value = this.elt.getProperty(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT,
                                            NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("2475460d-c4e2-4ab9-9e8b-04bf1de1a230")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'NodeTypeReferenceType.typeRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6e07bec2-25bd-45cb-bf54-106ecc4c82a0")
    public void setTypeRef(final String value) {
        this.elt.setProperty(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT,
                             NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT, value));
    }

    @objid ("b4343944-ad23-4234-8920-8dcdf4d61eb9")
    protected  NodeTypeReferenceType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("ed767b33-94e2-4483-8c0a-8da2d007634b")
    public static final class MdaTypes {
        @objid ("969dcb9a-6838-4544-b03a-740933caa290")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6c2cb372-1f1b-4578-a0c4-96b0041bd3b5")
        public static PropertyDefinition TYPEREF_PROPERTY_ELT;

        @objid ("7f1c1b19-adf0-4e87-aabf-f3fadc582f5b")
        private static Stereotype MDAASSOCDEP;

        @objid ("1c6dac48-702b-4498-9e68-a47521366321")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("19158f10-f11b-48d1-b152-7171127b5147")
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

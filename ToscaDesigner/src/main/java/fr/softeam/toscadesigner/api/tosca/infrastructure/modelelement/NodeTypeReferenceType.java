/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 11:15 by Modelio Studio.
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
    @objid ("a1813995-ee19-4443-81d0-b850308162a4")
    public static final String STEREOTYPE_NAME = "NodeTypeReferenceType";

    @objid ("d686bf7c-49db-446c-8ad7-43ea82d621ff")
    public static final String TYPEREF_PROPERTY = "typeRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("933a2ea8-078c-485c-8800-c5f2d4f1f505")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link NodeTypeReferenceType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NodeTypeReferenceType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0824c412-92a7-460c-a520-2a6c96f072cf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << NodeTypeReferenceType >> then instantiate a {@link NodeTypeReferenceType} proxy.
     * 
     * @return a {@link NodeTypeReferenceType} proxy on the created {@link ModelElement}.
     */
    @objid ("e2274aed-55ed-445f-afab-67bb9e45024d")
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
    @objid ("0c511cec-6dcd-4830-b7d0-ac68eee0b834")
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
    @objid ("8ed9644e-9297-49f0-9f2d-2c000dc8321b")
    public static NodeTypeReferenceType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (NodeTypeReferenceType.canInstantiate(obj))
        	return new NodeTypeReferenceType(obj);
        else
        	throw new IllegalArgumentException("NodeTypeReferenceType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("73f03cac-5376-433a-80ab-4b471f05c83d")
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
    @objid ("b155e2ee-fc97-4bc4-8f6b-8d1d86e64286")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'NodeTypeReferenceType.typeRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("616364cf-526c-4e3c-9e97-78d6eae70175")
    public String getTypeRef() {
        String value = this.elt.getProperty(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT,
                                            NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("fb36500f-c5e9-4d64-90d5-3ce93e84c313")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'NodeTypeReferenceType.typeRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b0141bbf-a9bd-476d-ab93-a45b3bf59fba")
    public void setTypeRef(final String value) {
        this.elt.setProperty(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT,
                             NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT, value));
    }

    @objid ("319f9692-f8bf-461e-88b3-db494374cb19")
    protected  NodeTypeReferenceType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("ed767b33-94e2-4483-8c0a-8da2d007634b")
    public static final class MdaTypes {
        @objid ("5c4c9f0b-5315-43be-ac06-95e046b45e03")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2932def5-824a-4e20-ae5f-ac7996cecb7a")
        public static PropertyDefinition TYPEREF_PROPERTY_ELT;

        @objid ("ebbfec6c-238d-41dc-94b6-1fba220e89e3")
        private static Stereotype MDAASSOCDEP;

        @objid ("f6a1c5e3-e17d-48f5-a5e9-1730510cb71a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5e0ace67-6d64-4f4b-a7dd-49ebfb09dfdb")
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

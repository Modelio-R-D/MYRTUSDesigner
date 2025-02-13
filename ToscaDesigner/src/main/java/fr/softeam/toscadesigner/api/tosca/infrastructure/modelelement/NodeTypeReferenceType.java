/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 13/02/2025 17:54 by Modelio Studio.
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
    @objid ("68a0ec6f-3afd-4aab-ae64-b8099f1d29af")
    public static final String STEREOTYPE_NAME = "NodeTypeReferenceType";

    @objid ("50a0284f-05da-443e-abc8-fcbaa313a55c")
    public static final String TYPEREF_PROPERTY = "typeRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("4fbcf3de-7885-4346-8dca-f54cdda92d26")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link NodeTypeReferenceType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NodeTypeReferenceType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e087ada6-c17e-4aa5-837e-c74620fcd759")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << NodeTypeReferenceType >> then instantiate a {@link NodeTypeReferenceType} proxy.
     * 
     * @return a {@link NodeTypeReferenceType} proxy on the created {@link ModelElement}.
     */
    @objid ("60bb9d08-d976-45b8-98aa-2f09e021f30c")
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
    @objid ("44f1b3a2-57b5-4505-a50f-12bc99b7f45f")
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
    @objid ("ecf70f6f-5a48-4d38-aaa6-7976ed779a80")
    public static NodeTypeReferenceType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (NodeTypeReferenceType.canInstantiate(obj))
        	return new NodeTypeReferenceType(obj);
        else
        	throw new IllegalArgumentException("NodeTypeReferenceType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c2a4c834-c5e8-4c5e-ae50-6709cbebdb9d")
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
    @objid ("9142bedd-3307-4b55-8bb0-5695d4ffde84")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'NodeTypeReferenceType.typeRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7c6c9d84-c6bd-4b96-a399-9c7362ebb021")
    public String getTypeRef() {
        String value = this.elt.getProperty(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT,
                                            NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("5e652325-5b69-49ce-8caf-c3723f148b9c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'NodeTypeReferenceType.typeRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("32e94f59-c1ae-4cb8-83fa-05ffb5653992")
    public void setTypeRef(final String value) {
        this.elt.setProperty(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT,
                             NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT, value));
    }

    @objid ("e1137f08-6606-47a2-82bf-b94120820274")
    protected  NodeTypeReferenceType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("fe0f62f2-0eb9-4af3-ab7b-718496a27fb5")
    public static final class MdaTypes {
        @objid ("d11b55b6-a737-477b-93e9-9a240d086e11")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4f3bec4c-5be5-4f25-b774-1e6faab9b6e0")
        public static PropertyDefinition TYPEREF_PROPERTY_ELT;

        @objid ("cbe8fa23-d35a-4606-a61b-bfcdf5c5d557")
        private static Stereotype MDAASSOCDEP;

        @objid ("81728992-bd4c-4247-89e9-f0f89dd20230")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9f27b210-f0e0-4176-a212-dcd587c8263a")
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

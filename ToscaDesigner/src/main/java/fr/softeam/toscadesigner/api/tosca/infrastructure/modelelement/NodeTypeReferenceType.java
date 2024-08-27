/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << NodeTypeReferenceType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("98070637-3eca-45a7-ab85-820c9a719a3f")
public class NodeTypeReferenceType implements IMdaProxy {
    @objid ("80062c4d-db76-40b9-a60e-240e1a97cfc0")
    public static final String STEREOTYPE_NAME = "NodeTypeReferenceType";

    @objid ("76dc94d4-4cc6-4528-8fd7-451541d00e99")
    public static final String TYPEREF_PROPERTY = "typeRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("cb51af30-4372-4f42-8cb5-553e5c22f73b")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link NodeTypeReferenceType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << NodeTypeReferenceType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("51abed4c-fac7-43ca-a4ce-a161eb7ca303")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << NodeTypeReferenceType >> then instantiate a {@link NodeTypeReferenceType} proxy.
     * @return a {@link NodeTypeReferenceType} proxy on the created {@link ModelElement}.
     */
    @objid ("10eab12c-b011-4442-a9d0-68532659e4e1")
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
    @objid ("41a083ea-36e9-4d15-847c-8f5356c0a4bc")
    public static NodeTypeReferenceType instantiate(final ModelElement obj) {
        return NodeTypeReferenceType.canInstantiate(obj) ? new NodeTypeReferenceType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NodeTypeReferenceType} proxy from a {@link ModelElement} stereotyped << NodeTypeReferenceType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link NodeTypeReferenceType} proxy.
     */
    @objid ("2671e462-422e-404d-877f-3ee3fe26aca6")
    public static NodeTypeReferenceType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (NodeTypeReferenceType.canInstantiate(obj))
            return new NodeTypeReferenceType(obj);
        else
            throw new IllegalArgumentException("NodeTypeReferenceType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c7bf602f-cced-421b-94ab-2bdafa43c435")
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
    @objid ("49060671-e168-4d24-ba4f-37226b8bdb27")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'NodeTypeReferenceType.typeRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("26d18322-5ce1-4e99-bda3-bb3e8185da16")
    public String getTypeRef() {
        String value = this.elt.getProperty(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT,
                                            NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT, value, this.elt);
    }

    @objid ("6d86d40e-69a9-4aa2-86fe-a1abebcc87d4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'NodeTypeReferenceType.typeRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8a53b3a1-77e5-4c2e-8b3a-7e4c4b9a8d07")
    public void setTypeRef(final String value) {
        this.elt.setProperty(NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT,
                             NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(NodeTypeReferenceType.MdaTypes.TYPEREF_PROPERTY_ELT, value));
    }

    @objid ("7aa340c0-902a-40b3-a9f3-f6d25a41b732")
    protected  NodeTypeReferenceType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("e4097d73-42dd-44af-84c8-7ef258e16b5f")
    public static final class MdaTypes {
        @objid ("f57d256a-86c6-4a19-94d8-0813e517f675")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2b9c703a-8372-4f9f-86bf-bb41adbb370f")
        public static PropertyDefinition TYPEREF_PROPERTY_ELT;

        @objid ("95c6f146-dea2-477f-897d-d497312a5969")
        private static Stereotype MDAASSOCDEP;

        @objid ("3e1356c5-833c-4860-9744-e070af95805d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1ed76a17-3e37-4e6f-a89d-cc70c6e6fdea")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TArtifactType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("72e7b93a-c285-47c2-aa99-9fa8e95e63c4")
public class TArtifactType extends TEntityType implements IMdaProxy {
    @objid ("24c151e5-763a-45f3-a7a2-0753419d021a")
    public static final String STEREOTYPE_NAME = "TArtifactType";

    /**
     * Tells whether a {@link TArtifactType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TArtifactType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fba6dc48-8c59-4499-9088-d18b105a5512")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TArtifactType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TArtifactType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TArtifactType >> then instantiate a {@link TArtifactType} proxy.
     * @return a {@link TArtifactType} proxy on the created {@link Class}.
     */
    @objid ("a78aff70-6b3a-40b3-9a1e-35fac22f9f6b")
    public static TArtifactType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TArtifactType.MdaTypes.STEREOTYPE_ELT);
        return TArtifactType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TArtifactType} proxy from a {@link Class} stereotyped << TArtifactType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TArtifactType} proxy or <i>null</i>.
     */
    @objid ("dd36d98f-ec56-4772-93f9-fdc3c113bebd")
    public static TArtifactType instantiate(final Class obj) {
        return TArtifactType.canInstantiate(obj) ? new TArtifactType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TArtifactType} proxy from a {@link Class} stereotyped << TArtifactType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TArtifactType} proxy.
     */
    @objid ("33525c7d-cc3c-4023-b2df-3c8e1890d1e6")
    public static TArtifactType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TArtifactType.canInstantiate(obj))
            return new TArtifactType(obj);
        else
            throw new IllegalArgumentException("TArtifactType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e3daf874-edbd-4ca5-91ae-47c8e9eeab40")
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
        TArtifactType other = (TArtifactType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("9eb279d2-adcc-4185-8c12-e0e5862fc7a5")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("08f67d20-a2a1-4e98-a2fd-96d1df9f5667")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("26a1c53f-e6ec-4fb5-95dd-e4cd91b2da33")
    protected  TArtifactType(final Class elt) {
        super(elt);
    }

    @objid ("7210780f-a7d1-4c40-88df-896951f6cdd3")
    public static final class MdaTypes {
        @objid ("27e25d2d-957e-4e92-82f7-e1603f41c6af")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0c333a74-1aac-40e7-9ece-d3a8b5343a29")
        private static Stereotype MDAASSOCDEP;

        @objid ("e475e8f4-dd5f-4972-9677-ab040e955977")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7cb04974-6ca0-445a-a87e-89b8544f33b3")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "08c1d0af-1987-4d3f-8dda-3b28c1aadcb9", "TArtifactType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
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

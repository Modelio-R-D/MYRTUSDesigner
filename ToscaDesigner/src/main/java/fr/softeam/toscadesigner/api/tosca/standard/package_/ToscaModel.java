/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.package_;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Package} with << ToscaModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("82423d5f-a98e-486b-969f-d61d9e2313f5")
public class ToscaModel implements IMdaProxy {
    @objid ("fd15ae5e-0e0d-4c07-b3aa-00db947cc0ce")
    public static final String STEREOTYPE_NAME = "ToscaModel";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     * 
     */
    @objid ("879b2c32-4ea3-4c63-a744-a18db1c81bd2")
    protected final Package elt;

    /**
     * Tells whether a {@link ToscaModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ToscaModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("68984b13-9412-4aa7-9d55-6baadc7dbb92")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (ToscaModel.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(ToscaModel.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << ToscaModel >> then instantiate a {@link ToscaModel} proxy.
     * @return a {@link ToscaModel} proxy on the created {@link Package}.
     */
    @objid ("85bdbded-0e54-4490-acbe-bc2c2ba9c038")
    public static ToscaModel create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Package");
        e.getExtension().add(ToscaModel.MdaTypes.STEREOTYPE_ELT);
        return ToscaModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ToscaModel} proxy from a {@link Package} stereotyped << ToscaModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link ToscaModel} proxy or <i>null</i>.
     */
    @objid ("18579b0e-f215-413f-9bb8-7d17608c35ca")
    public static ToscaModel instantiate(final Package obj) {
        return ToscaModel.canInstantiate(obj) ? new ToscaModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ToscaModel} proxy from a {@link Package} stereotyped << ToscaModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link ToscaModel} proxy.
     */
    @objid ("547f68fb-8bbd-448d-9ea4-5cc1df6da400")
    public static ToscaModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ToscaModel.canInstantiate(obj))
            return new ToscaModel(obj);
        else
            throw new IllegalArgumentException("ToscaModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dfbf1b15-1089-452a-bb0b-c365994bb2bc")
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
        ToscaModel other = (ToscaModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}.
     * @return the Package represented by this proxy, never null.
     */
    @objid ("00156a91-1ebf-4754-a8d4-67c353286141")
    public Package getElement() {
        return this.elt;
    }

    @objid ("34afc819-6f19-4d6f-af8f-b9b20206c97e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("aba7c9cf-f727-48c2-9054-290dcf149be9")
    protected  ToscaModel(final Package elt) {
        this.elt = elt;
    }

    @objid ("9726c196-afe8-4949-96bd-9c6d582b52ea")
    public static final class MdaTypes {
        @objid ("394a0168-3fab-403d-b7a2-73216203ac5f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("79107938-99cb-4047-bcb3-210332f1028c")
        private static Stereotype MDAASSOCDEP;

        @objid ("42980998-81e4-4c48-a59d-22663ce67631")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("df69d6fc-62f1-41ad-968e-2a781f8d5644")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "20565008-115d-4fad-800f-134ab276f611", "ToscaModel");
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

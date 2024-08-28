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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << TPropertyConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4da4c4f7-4b3d-49d3-bcad-7c95b833ed1c")
public class TPropertyConstraint extends TConstraint implements IMdaProxy {
    @objid ("ab529ec3-24f1-4e60-9d33-6e6be4a83ba4")
    public static final String STEREOTYPE_NAME = "TPropertyConstraint";

    /**
     * Tells whether a {@link TPropertyConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4f832fcb-efe8-4576-b7e9-ca7496bb9d07")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyConstraint.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyConstraint.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyConstraint >> then instantiate a {@link TPropertyConstraint} proxy.
     * @return a {@link TPropertyConstraint} proxy on the created {@link ModelElement}.
     */
    @objid ("1173a1cc-7fd4-47ba-9acf-0e5430caec01")
    public static TPropertyConstraint create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TPropertyConstraint.MdaTypes.STEREOTYPE_ELT);
        return TPropertyConstraint.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TPropertyConstraint} proxy from a {@link ModelElement} stereotyped << TPropertyConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TPropertyConstraint} proxy or <i>null</i>.
     */
    @objid ("683b0b6f-f5ff-437b-abf0-ccaf71a30edb")
    public static TPropertyConstraint instantiate(final ModelElement obj) {
        return TPropertyConstraint.canInstantiate(obj) ? new TPropertyConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPropertyConstraint} proxy from a {@link ModelElement} stereotyped << TPropertyConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TPropertyConstraint} proxy.
     */
    @objid ("8ac5500b-8ca0-4238-82b7-7d4660c15642")
    public static TPropertyConstraint safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyConstraint.canInstantiate(obj))
            return new TPropertyConstraint(obj);
        else
            throw new IllegalArgumentException("TPropertyConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9a8213d6-ff64-4a91-bc27-5026f197817a")
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
        TPropertyConstraint other = (TPropertyConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("1c6c5b98-d80b-4735-8e4c-3ccf349f9bbc")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("30a4bb2c-e1e5-41e3-b576-8dbcfcc6cac0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d4a8dcaa-b23b-44ab-8e48-8feeddfed7c3")
    protected  TPropertyConstraint(final ModelElement elt) {
        super(elt);
    }

    @objid ("4cd38298-6a35-428c-a0b0-4d003e7832ce")
    public static final class MdaTypes {
        @objid ("ca40972c-bcd8-4ac5-96c8-41a075d4274c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("367b6bf4-e07a-40de-af0c-a9b6e4df2be4")
        private static Stereotype MDAASSOCDEP;

        @objid ("29346562-0176-4c0e-80b2-1fd6ee88874a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d8ce3233-1649-4ebe-b9cb-5802fa828a75")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "85f116c1-fe2c-435b-a801-c3389c84beef", "TPropertyConstraint");
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

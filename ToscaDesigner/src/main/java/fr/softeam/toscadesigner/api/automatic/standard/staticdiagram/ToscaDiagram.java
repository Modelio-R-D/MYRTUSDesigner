/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 22/05/2025 15:07 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.automatic.standard.staticdiagram;

import java.util.ArrayList;
import java.util.List;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link StaticDiagram} with << ToscaDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f69e9027-ea93-4817-83ee-f0667cde21da")
public class ToscaDiagram implements IMdaProxy {
    @objid ("ef511ac4-18e4-4dfd-b6b8-074de93fc7f8")
    public static final String STEREOTYPE_NAME = "ToscaDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("12146510-fe01-4e22-839d-c9708c2f714d")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ToscaDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ToscaDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("393420d7-4a99-419f-a61e-0163498b8d53")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ToscaDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ToscaDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ToscaDiagram >> then instantiate a {@link ToscaDiagram} proxy.
     * 
     * @return a {@link ToscaDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("2fad92ac-b592-4d59-8f80-b94ad461e6bb")
    public static ToscaDiagram create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.StaticDiagram");
        e.getExtension().add(ToscaDiagram.MdaTypes.STEREOTYPE_ELT);
        return ToscaDiagram.instantiate((StaticDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ToscaDiagram} proxy from a {@link StaticDiagram} stereotyped << ToscaDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StaticDiagram
     * @return a {@link ToscaDiagram} proxy or <i>null</i>.
     */
    @objid ("35fe1701-e6db-4605-abb1-86d0878381e0")
    public static ToscaDiagram instantiate(final StaticDiagram obj) {
        return ToscaDiagram.canInstantiate(obj) ? new ToscaDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ToscaDiagram} proxy from a {@link StaticDiagram} stereotyped << ToscaDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link ToscaDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f05723b3-6712-4544-8a12-49c1498d05da")
    public static ToscaDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ToscaDiagram.canInstantiate(obj))
        	return new ToscaDiagram(obj);
        else
        	throw new IllegalArgumentException("ToscaDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4a9b7fd0-ef7f-4c71-91f4-7b302ffcd3ef")
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
        ToscaDiagram other = (ToscaDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StaticDiagram}. 
     * @return the StaticDiagram represented by this proxy, never null.
     */
    @objid ("cf30515c-3833-4bba-8f0b-419abaea2ba9")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("9f7f6cbe-c656-451d-9a74-699b39687797")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("3fc0095e-d6fa-41ce-84d3-2a76d6ceb0e6")
    protected  ToscaDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("2ea70049-a79a-41f1-9653-1f0b748d8ae8")
    public static final class MdaTypes {
        @objid ("99c40362-c15e-4511-be51-1e9dd6b8d169")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e0ca74d3-ebd0-48a8-a6df-81d1c6e32afe")
        private static Stereotype MDAASSOCDEP;

        @objid ("e5187a68-4228-4251-80f9-39a8ecfb49d5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4d146780-0e70-4bc5-b28a-d50a17f862a8")
        public static void init(final IModelingSession session) throws fr.softeam.toscadesigner.impl.MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "dddbe647-1f21-42d1-93cd-f61109a8afd3", "ToscaDiagram");
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

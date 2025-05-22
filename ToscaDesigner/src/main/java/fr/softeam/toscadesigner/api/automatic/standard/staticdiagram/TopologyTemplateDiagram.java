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
 * Proxy class to handle a {@link StaticDiagram} with << TopologyTemplateDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5690a531-d748-4d21-a33e-03dd25aeea24")
public class TopologyTemplateDiagram implements IMdaProxy {
    @objid ("e958ff8e-a50c-431b-bead-f0eafc07b111")
    public static final String STEREOTYPE_NAME = "TopologyTemplateDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("49c4fa40-5223-48cb-87ee-63c1697262ea")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link TopologyTemplateDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b6d846fd-525a-4272-b6c8-9249f4e1ac18")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (TopologyTemplateDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(TopologyTemplateDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >> then instantiate a {@link TopologyTemplateDiagram} proxy.
     * 
     * @return a {@link TopologyTemplateDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("786f8693-d5fc-477e-9ef1-fe7acc53052c")
    public static TopologyTemplateDiagram create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.StaticDiagram");
        e.getExtension().add(TopologyTemplateDiagram.MdaTypes.STEREOTYPE_ELT);
        return TopologyTemplateDiagram.instantiate((StaticDiagram)e);
    }

    /**
     * Tries to instantiate a {@link TopologyTemplateDiagram} proxy from a {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StaticDiagram
     * @return a {@link TopologyTemplateDiagram} proxy or <i>null</i>.
     */
    @objid ("b8994dea-db34-4e92-8a2c-8543fbf43743")
    public static TopologyTemplateDiagram instantiate(final StaticDiagram obj) {
        return TopologyTemplateDiagram.canInstantiate(obj) ? new TopologyTemplateDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TopologyTemplateDiagram} proxy from a {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link TopologyTemplateDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("165d68cf-34e0-4658-b6a8-1e69553618a9")
    public static TopologyTemplateDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (TopologyTemplateDiagram.canInstantiate(obj))
        	return new TopologyTemplateDiagram(obj);
        else
        	throw new IllegalArgumentException("TopologyTemplateDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ab877a35-e966-440f-aa94-1ff1de989d7b")
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
        TopologyTemplateDiagram other = (TopologyTemplateDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StaticDiagram}. 
     * @return the StaticDiagram represented by this proxy, never null.
     */
    @objid ("c5959679-51f6-48c0-82ce-0fccfc9146af")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("29606805-223d-4fdc-906d-aae4679a4e4f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("0bf3c564-2ff9-4c47-9510-ab872fed4d0b")
    protected  TopologyTemplateDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("a75a5020-1077-4e84-8bb0-72f5c433615f")
    public static final class MdaTypes {
        @objid ("d0e72192-a010-4e6f-b606-06af7d7ac9c8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("85cf4d05-212c-4e0c-90df-2cb1479608ca")
        private static Stereotype MDAASSOCDEP;

        @objid ("ceb75425-b71b-4b85-a927-31b6b15ccd68")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("40ca8b01-275a-4380-bebc-eef9d4667347")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "0313d7f3-dcd0-4c93-981e-705f3d4bcc82", "TopologyTemplateDiagram");
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

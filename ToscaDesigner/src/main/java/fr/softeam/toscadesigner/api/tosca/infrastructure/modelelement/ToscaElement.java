/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 18/02/2025 10:30 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.List;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link ModelElement} with << ToscaElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("391f35e9-ca81-4f88-96f1-eceb9c08b9be")
public class ToscaElement implements IMdaProxy {
    @objid ("8a255be3-e0db-432c-9159-9e227b56ce90")
    public static final String STEREOTYPE_NAME = "ToscaElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("9d7443b7-41ba-48fb-b920-e9899f522c7c")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ToscaElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ToscaElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9b79a043-c67e-4aa3-b8e0-a211edbcde82")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ToscaElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ToscaElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ToscaElement >> then instantiate a {@link ToscaElement} proxy.
     * 
     * @return a {@link ToscaElement} proxy on the created {@link ModelElement}.
     */
    @objid ("58af55fc-e25e-4666-b461-5159a40a0df7")
    public static ToscaElement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(ToscaElement.MdaTypes.STEREOTYPE_ELT);
        return ToscaElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ToscaElement} proxy from a {@link ModelElement} stereotyped << ToscaElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ToscaElement} proxy or <i>null</i>.
     */
    @objid ("836321bd-f909-4eb4-b385-abb69c7bfed2")
    public static ToscaElement instantiate(final ModelElement obj) {
        return ToscaElement.canInstantiate(obj) ? new ToscaElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ToscaElement} proxy from a {@link ModelElement} stereotyped << ToscaElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ToscaElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a0ffc3bc-b31e-4f08-94f7-2989e9caf41a")
    public static ToscaElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ToscaElement.canInstantiate(obj))
        	return new ToscaElement(obj);
        else
        	throw new IllegalArgumentException("ToscaElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bec1d75b-7bcf-40f9-a226-e6dec12d8bc5")
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
        ToscaElement other = (ToscaElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("76b9899a-7002-4e57-94d8-33f0cb793e40")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("b38eafa4-4842-4914-b950-56d17bbf6cba")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("27435de4-f53d-4fea-bfa9-6713897ea3db")
    protected  ToscaElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("737184ef-854b-4455-ac6a-d815c4391895")
    public static final class MdaTypes {
        @objid ("232328dd-dae4-4acc-a28f-db8efb07aafb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e7afed91-6205-4280-a570-e1896f6f6020")
        private static Stereotype MDAASSOCDEP;

        @objid ("f58845ab-03bf-425b-89e8-b16ee2a021ac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("470db055-609f-496c-b92c-4bb5b7ef6f17")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "11eac153-1560-420f-a4f6-f5387b6c8a98", "ToscaElement");
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

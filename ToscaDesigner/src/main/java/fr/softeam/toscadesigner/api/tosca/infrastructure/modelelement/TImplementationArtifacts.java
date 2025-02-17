/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 18:02 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TImplementationArtifacts >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9ea9aa1a-63c6-42a7-889d-3d86e9594447")
public class TImplementationArtifacts implements IMdaProxy {
    @objid ("a1dc8b47-8fa7-48e5-8736-e3ab422d2077")
    public static final String STEREOTYPE_NAME = "TImplementationArtifacts";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("415b4bfe-fa63-42c2-a0af-e8f6b3fd267c")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TImplementationArtifacts proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TImplementationArtifacts >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("33d4e56f-266f-4f92-94fb-ea830fb28b15")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TImplementationArtifacts.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TImplementationArtifacts.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TImplementationArtifacts >> then instantiate a {@link TImplementationArtifacts} proxy.
     * 
     * @return a {@link TImplementationArtifacts} proxy on the created {@link ModelElement}.
     */
    @objid ("10caf73a-a639-47d6-977c-02f9feeb8661")
    public static TImplementationArtifacts create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TImplementationArtifacts.MdaTypes.STEREOTYPE_ELT);
        return TImplementationArtifacts.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TImplementationArtifacts} proxy from a {@link ModelElement} stereotyped << TImplementationArtifacts >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TImplementationArtifacts} proxy or <i>null</i>.
     */
    @objid ("1e853553-6b55-402f-b43d-01dcbfbf35f7")
    public static TImplementationArtifacts instantiate(final ModelElement obj) {
        return TImplementationArtifacts.canInstantiate(obj) ? new TImplementationArtifacts(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TImplementationArtifacts} proxy from a {@link ModelElement} stereotyped << TImplementationArtifacts >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TImplementationArtifacts} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("722a3762-bffc-43a0-820b-4d0206910ece")
    public static TImplementationArtifacts safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TImplementationArtifacts.canInstantiate(obj))
        	return new TImplementationArtifacts(obj);
        else
        	throw new IllegalArgumentException("TImplementationArtifacts: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8a1c0ac3-d60b-43db-95a6-453ffefed60a")
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
        TImplementationArtifacts other = (TImplementationArtifacts) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("50d96da4-acb7-45dd-a67f-400e408ce321")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("9ced6e5c-a1c0-4d85-b79d-fbee9469b0bb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("c5d0de9f-6e11-409f-bdcb-8a97cece68ae")
    protected  TImplementationArtifacts(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("02a58cbc-6bbd-4f84-89b5-a88535e44f65")
    public static final class MdaTypes {
        @objid ("c35bcbf2-ec95-48e3-981e-329415365b45")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9aa96358-da73-4c38-9875-9d1b41554f1d")
        private static Stereotype MDAASSOCDEP;

        @objid ("f36e2908-38a1-47e1-84d6-342869fb8181")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("20fcc368-b7ad-4ada-8523-9947e09719f4")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "3ad8973b-47c6-4931-ab79-c240d70c0ca6", "TImplementationArtifacts");
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

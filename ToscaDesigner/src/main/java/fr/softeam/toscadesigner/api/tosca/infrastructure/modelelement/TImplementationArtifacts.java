/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 18:12 by Modelio Studio.
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
@objid ("c2e7eca4-4095-49f2-861c-679c68df5b8e")
public class TImplementationArtifacts implements IMdaProxy {
    @objid ("2ad4d15c-8971-4eea-a91f-a5e1a471bc01")
    public static final String STEREOTYPE_NAME = "TImplementationArtifacts";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("0f063cfe-5578-4f77-a8e4-4e0791c37bdc")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TImplementationArtifacts proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TImplementationArtifacts >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0220962a-ca51-4187-983b-c9c41c910129")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TImplementationArtifacts.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TImplementationArtifacts.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TImplementationArtifacts >> then instantiate a {@link TImplementationArtifacts} proxy.
     * 
     * @return a {@link TImplementationArtifacts} proxy on the created {@link ModelElement}.
     */
    @objid ("62aa9403-4b46-491f-ad9d-0b4090ce23d3")
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
    @objid ("1672603e-9017-4d27-93d1-3e09aaabb14e")
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
    @objid ("5ac29c1a-1805-4173-9307-adea86b0e5ca")
    public static TImplementationArtifacts safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TImplementationArtifacts.canInstantiate(obj))
        	return new TImplementationArtifacts(obj);
        else
        	throw new IllegalArgumentException("TImplementationArtifacts: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9cd359f7-fba3-4a50-a784-d48c755e916b")
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
    @objid ("f9584c30-9fc9-461b-a133-a10216322db3")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("add4146d-334e-4906-9167-6d3985d80ddb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("b3a8ec48-6cff-4b8c-b7a7-3c7656f29dc2")
    protected  TImplementationArtifacts(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("2dd3834b-3d06-44ce-a210-711608429518")
    public static final class MdaTypes {
        @objid ("5d9d9415-c1d2-4e52-bb73-6348022a6397")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e1fe0b5e-5f25-4470-abb0-8cad3d0bd7ad")
        private static Stereotype MDAASSOCDEP;

        @objid ("5c21b69a-e6a7-48fc-8bfd-78a924b0db37")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8846d549-0bad-4ad2-9d4d-25c4c8ac047a")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 14:48 by Modelio Studio.
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
    @objid ("0d015924-6fc7-43e0-a2ff-c381e5be4909")
    public static final String STEREOTYPE_NAME = "TImplementationArtifacts";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("1237b58c-44ca-42d9-b7b2-78527eb1f9d4")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TImplementationArtifacts proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TImplementationArtifacts >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4e716409-7292-4159-8e5e-570006c38795")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TImplementationArtifacts.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TImplementationArtifacts.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TImplementationArtifacts >> then instantiate a {@link TImplementationArtifacts} proxy.
     * 
     * @return a {@link TImplementationArtifacts} proxy on the created {@link ModelElement}.
     */
    @objid ("bcfd812e-cefc-4e36-bed6-ad3606387f1f")
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
    @objid ("716123d8-2393-4f60-8d2b-271e93f6e263")
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
    @objid ("d8251149-dc5d-4823-be4c-cd6bcc02d37a")
    public static TImplementationArtifacts safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TImplementationArtifacts.canInstantiate(obj))
        	return new TImplementationArtifacts(obj);
        else
        	throw new IllegalArgumentException("TImplementationArtifacts: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("585ebb79-9e0f-4914-8d87-203b024d61af")
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
    @objid ("f1edc15b-6e5a-41db-8570-e6c9d2bff239")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("160a7a97-8d8e-400f-90b7-2ab23e8bc7d3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("625ea44f-4e0d-4fe6-9317-817ca98176e8")
    protected  TImplementationArtifacts(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("02a58cbc-6bbd-4f84-89b5-a88535e44f65")
    public static final class MdaTypes {
        @objid ("1ff4d88c-4c6f-4117-9c70-fe400ec66f4d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b5a835ba-7700-4ade-bb69-50b00987b6ba")
        private static Stereotype MDAASSOCDEP;

        @objid ("40eb95fb-ee2b-48ee-bc28-ecedd7bbbe9f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("84fa7ffa-19c3-482a-ab70-1de81796a7e6")
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

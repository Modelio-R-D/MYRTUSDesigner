/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 23/09/2024 12:50 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << DocumentRoot >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e1f528ef-b16e-4401-916a-a3dd942e9a2d")
public class DocumentRoot implements IMdaProxy {
    @objid ("ba86460e-a0fc-473e-92f6-fd8a05132e0f")
    public static final String STEREOTYPE_NAME = "DocumentRoot";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("92a89bfa-53b8-403a-b717-f63c4918fed8")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link DocumentRoot proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << DocumentRoot >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d93611b0-48c5-4b45-acbe-4375b19ad6f3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (DocumentRoot.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(DocumentRoot.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << DocumentRoot >> then instantiate a {@link DocumentRoot} proxy.
     * 
     * @return a {@link DocumentRoot} proxy on the created {@link ModelElement}.
     */
    @objid ("db6249a9-5518-4c6e-97a6-c25c22e5a02f")
    public static DocumentRoot create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(DocumentRoot.MdaTypes.STEREOTYPE_ELT);
        return DocumentRoot.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link DocumentRoot} proxy from a {@link ModelElement} stereotyped << DocumentRoot >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link DocumentRoot} proxy or <i>null</i>.
     */
    @objid ("88fd0c15-21a4-4285-a89b-5e958acdec98")
    public static DocumentRoot instantiate(final ModelElement obj) {
        return DocumentRoot.canInstantiate(obj) ? new DocumentRoot(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DocumentRoot} proxy from a {@link ModelElement} stereotyped << DocumentRoot >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link DocumentRoot} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("14dbbc71-7655-43ec-b278-6bf34986ea51")
    public static DocumentRoot safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (DocumentRoot.canInstantiate(obj))
        	return new DocumentRoot(obj);
        else
        	throw new IllegalArgumentException("DocumentRoot: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e75effd8-3bbe-4ebe-ad1b-1a87c3c587fb")
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
        DocumentRoot other = (DocumentRoot) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("18fa860a-af19-4f2f-ad5b-196d30caa5c4")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("b2f580f9-ae72-48ff-b2b2-59a21f64a9c9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("e2dfd420-282e-44de-996b-a91672deb790")
    protected  DocumentRoot(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("f4e51eb0-488c-484f-96e1-e2b5225d87f7")
    public static final class MdaTypes {
        @objid ("bfd2c333-0be8-4e75-b54e-10438eea4b0d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4851c7f6-cfcd-4080-aecb-bd962911395f")
        private static Stereotype MDAASSOCDEP;

        @objid ("be7c78a7-b087-425d-89b8-2bc2155b32a8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cfb76e5c-3f69-4813-b054-bc0e7fb0a87b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "563abadf-65d6-454e-98b2-d0bc9732634d", "DocumentRoot");
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

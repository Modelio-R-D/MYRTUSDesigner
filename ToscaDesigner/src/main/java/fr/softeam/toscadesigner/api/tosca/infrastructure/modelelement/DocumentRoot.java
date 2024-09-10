/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/09/2024 12:00 by Modelio Studio.
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
@objid ("4741f6f4-cf3f-48ad-b524-345498924d72")
public class DocumentRoot implements IMdaProxy {
    @objid ("68137b09-b0e4-4f47-91e9-9976bffe2b0c")
    public static final String STEREOTYPE_NAME = "DocumentRoot";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("e84b8e98-ad14-45e0-8b82-173e3c306887")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link DocumentRoot proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << DocumentRoot >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f37ea69a-0cf5-4f05-bf79-3c1a6e993871")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (DocumentRoot.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(DocumentRoot.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << DocumentRoot >> then instantiate a {@link DocumentRoot} proxy.
     * 
     * @return a {@link DocumentRoot} proxy on the created {@link ModelElement}.
     */
    @objid ("392e8605-5859-4174-8cb7-af05f2af694c")
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
    @objid ("6af3e83e-a605-4cb2-9cab-16892b187ba4")
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
    @objid ("150fe286-e9f2-4d60-b47e-61933367050a")
    public static DocumentRoot safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (DocumentRoot.canInstantiate(obj))
        	return new DocumentRoot(obj);
        else
        	throw new IllegalArgumentException("DocumentRoot: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5c82c55e-ad0a-41af-81b6-73aadfd0547a")
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
    @objid ("5da0cb48-c14b-4f37-9188-812349641362")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("b19cfb24-4f31-4364-bc6f-82fd9d60aa15")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("288917e3-e840-4e2c-958b-58d82a33361a")
    protected  DocumentRoot(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("dfa28a4d-4a29-4f7b-8d49-f19e93f4e490")
    public static final class MdaTypes {
        @objid ("cf8442c4-c01d-4e61-a6bd-808c43a557cc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("83b91d74-e789-4d0e-9ee6-dccf5945d482")
        private static Stereotype MDAASSOCDEP;

        @objid ("9344c01e-e073-44f2-a47e-45b18dad56be")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("95e4ea76-b140-477f-a7d4-aeb5b16deb9b")
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

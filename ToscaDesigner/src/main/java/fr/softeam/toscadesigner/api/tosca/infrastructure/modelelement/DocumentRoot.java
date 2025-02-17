/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 15:39 by Modelio Studio.
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
@objid ("35c30a8f-4fc7-46dd-918d-4e1f45deee77")
public class DocumentRoot implements IMdaProxy {
    @objid ("3c1970ca-b81b-4d70-9020-5aeaaa03f435")
    public static final String STEREOTYPE_NAME = "DocumentRoot";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("a18234e7-93bd-4dbc-93f6-935220bf123a")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link DocumentRoot proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << DocumentRoot >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2ff71ccd-e84e-49ef-824e-acb9ac1e92b8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (DocumentRoot.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(DocumentRoot.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << DocumentRoot >> then instantiate a {@link DocumentRoot} proxy.
     * 
     * @return a {@link DocumentRoot} proxy on the created {@link ModelElement}.
     */
    @objid ("ecb8bc0f-4aa2-4ced-80fd-adef83d7429b")
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
    @objid ("64bd629b-151f-4652-ab37-36b5df73948a")
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
    @objid ("6891527e-eb8e-4310-a855-4d319620088f")
    public static DocumentRoot safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (DocumentRoot.canInstantiate(obj))
        	return new DocumentRoot(obj);
        else
        	throw new IllegalArgumentException("DocumentRoot: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("12fe523c-abe1-4b13-934b-b227b782d1e0")
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
    @objid ("985c2137-df9a-4050-9bcc-bd6f6daa1f84")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("3529cc37-14f0-434d-96a7-17ea60d972dc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("75c7a180-39dc-435b-a0ae-b2bc3e19bd8b")
    protected  DocumentRoot(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("fceba24e-2e00-4753-aad9-3efe7f57d112")
    public static final class MdaTypes {
        @objid ("1cbcf4d1-aeb1-4360-a49d-02938c402046")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("019d8d60-9f2d-4532-b38f-22b62c468d2e")
        private static Stereotype MDAASSOCDEP;

        @objid ("2dbf9be1-f308-4ff8-ae86-775bdcfd802a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8f09cf7c-9280-49bb-a861-52959fc3c845")
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

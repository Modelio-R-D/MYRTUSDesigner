/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 16:27 by Modelio Studio.
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
@objid ("8b02e19f-e705-42c5-9d44-a2e347903f0e")
public class DocumentRoot implements IMdaProxy {
    @objid ("474cabbb-79eb-456e-8d92-264361d50e55")
    public static final String STEREOTYPE_NAME = "DocumentRoot";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("e7f28a5a-9607-449e-9ecb-175a2ce408ac")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link DocumentRoot proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << DocumentRoot >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7ae7d1a0-1e66-4491-8d43-41bce9be28c0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (DocumentRoot.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(DocumentRoot.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << DocumentRoot >> then instantiate a {@link DocumentRoot} proxy.
     * 
     * @return a {@link DocumentRoot} proxy on the created {@link ModelElement}.
     */
    @objid ("92d1a45c-b154-4f6b-8611-4ad742cf6827")
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
    @objid ("abe477dd-48a8-4abf-8548-cb68960ef409")
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
    @objid ("afec66e0-b297-401f-b6bb-a3984a96ab1b")
    public static DocumentRoot safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (DocumentRoot.canInstantiate(obj))
        	return new DocumentRoot(obj);
        else
        	throw new IllegalArgumentException("DocumentRoot: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("06b21d32-ee9a-4def-ac49-285b4323fef9")
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
    @objid ("9cf9f9ac-b470-4c1a-94c8-69a4e30d9e14")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("b7a43269-a243-48fd-8486-5f23e67f04d1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("9752d052-ba26-4eb5-87ab-7eb50caec786")
    protected  DocumentRoot(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d0b26d45-0cd1-4a53-8996-9363a6d509d3")
    public static final class MdaTypes {
        @objid ("87fee119-cac7-4b01-b7d1-1e2b664885da")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2fa18e4d-5468-44e9-b846-42634e3c3050")
        private static Stereotype MDAASSOCDEP;

        @objid ("87a78f7c-0f32-460f-97ae-853378e51db8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("68d68a4b-a7ef-47e1-9d43-ed9f20ad290b")
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

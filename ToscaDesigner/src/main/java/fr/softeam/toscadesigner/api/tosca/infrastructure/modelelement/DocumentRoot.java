/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
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
    @objid ("814c5bfb-ca79-4c58-a658-47909afb8fe2")
    public static final String STEREOTYPE_NAME = "DocumentRoot";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("989ca252-0f23-4efc-86ac-3b533a8ef242")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link DocumentRoot proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << DocumentRoot >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("51200caa-b1a9-4653-821c-1053c656a729")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (DocumentRoot.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(DocumentRoot.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << DocumentRoot >> then instantiate a {@link DocumentRoot} proxy.
     * 
     * @return a {@link DocumentRoot} proxy on the created {@link ModelElement}.
     */
    @objid ("bafcbbc6-6acd-43da-9931-05ab1e04ab2c")
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
    @objid ("917bc484-cf0d-4927-a1fd-9019ce328953")
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
    @objid ("39466f1e-e30c-4dd8-9903-0d646c3f9e4c")
    public static DocumentRoot safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (DocumentRoot.canInstantiate(obj))
        	return new DocumentRoot(obj);
        else
        	throw new IllegalArgumentException("DocumentRoot: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("eb4e993d-80e2-45be-92da-78f8b5a12bad")
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
    @objid ("64d356d4-002d-43a2-8f40-3b2d3d2b75ae")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("a91e0cc1-13ba-446c-b9bc-fc7f2aa9f39c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("2c6b1e17-8bcf-4381-8adb-4db24ec30527")
    protected  DocumentRoot(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d0b26d45-0cd1-4a53-8996-9363a6d509d3")
    public static final class MdaTypes {
        @objid ("2761b94c-a103-43eb-8b95-0fbd3c99ca2b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7a564504-c1fb-40fc-822f-19158e1e2e32")
        private static Stereotype MDAASSOCDEP;

        @objid ("ae9d057c-ec2c-4354-9752-9eef02a3c3fd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("98d408cf-6c26-42d0-8044-de541e3d34b2")
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

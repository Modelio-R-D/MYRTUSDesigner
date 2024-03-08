/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 08/03/2024 09:55 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TExtensibleElements >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f9a66cf0-00d7-4632-9054-412284270221")
public class TExtensibleElements implements IMdaProxy {
    @objid ("e830093c-a030-49dc-98ae-90ad5acab276")
    public static final String STEREOTYPE_NAME = "TExtensibleElements";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("e785124b-86f6-4d7f-accd-3680103e24ae")
    protected final Class elt;

    /**
     * Tells whether a {@link TExtensibleElements proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TExtensibleElements >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("10834831-014d-4286-a12b-2969d9522a92")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TExtensibleElements.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TExtensibleElements.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TExtensibleElements >> then instantiate a {@link TExtensibleElements} proxy.
     * 
     * @return a {@link TExtensibleElements} proxy on the created {@link Class}.
     */
    @objid ("cd42fc74-a70e-4a40-a1e0-1c42fadb27ca")
    public static TExtensibleElements create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TExtensibleElements.MdaTypes.STEREOTYPE_ELT);
        return TExtensibleElements.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TExtensibleElements} proxy from a {@link Class} stereotyped << TExtensibleElements >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TExtensibleElements} proxy or <i>null</i>.
     */
    @objid ("6bab23ee-59cd-43cb-a377-2e509923d633")
    public static TExtensibleElements instantiate(final Class obj) {
        return TExtensibleElements.canInstantiate(obj) ? new TExtensibleElements(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExtensibleElements} proxy from a {@link Class} stereotyped << TExtensibleElements >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TExtensibleElements} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3cc1d5f0-8bb4-4f33-abda-96ac432e8939")
    public static TExtensibleElements safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TExtensibleElements.canInstantiate(obj))
        	return new TExtensibleElements(obj);
        else
        	throw new IllegalArgumentException("TExtensibleElements: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("667c7f64-98a3-46c7-b91f-c97fb0b164cd")
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
        TExtensibleElements other = (TExtensibleElements) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8f42221b-8618-4cf6-8b75-c9dc037be94c")
    public Class getElement() {
        return this.elt;
    }

    @objid ("4f1eb082-a3cd-4fcc-92a6-c097d1ca314c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("c58fd487-e78b-4117-b280-d4b01013f073")
    protected  TExtensibleElements(final Class elt) {
        this.elt = elt;
    }

    @objid ("645ebf8b-016a-4d81-853b-fdc5cba8fa62")
    public static final class MdaTypes {
        @objid ("d5a291c7-83e1-4989-b4a6-1118b44fcf29")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f67d6f2d-56f0-407e-a11f-7633d72d93d8")
        private static Stereotype MDAASSOCDEP;

        @objid ("66a3f5fe-6295-4c50-a52b-e14546625d73")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e0248ccd-cf25-4701-b0e3-45cd06b5f628")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "e0b7e96b-63d9-4cee-adef-064c9c5f1ba0", "TExtensibleElements");
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

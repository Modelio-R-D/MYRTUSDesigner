/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 20/03/2024 15:20 by Modelio Studio.
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
    @objid ("6e194d7d-0fd9-4652-9715-7b4aaf7c7ece")
    public static final String STEREOTYPE_NAME = "TExtensibleElements";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("125d05e8-368d-4cab-ae76-2d3a32e86ba7")
    protected final Class elt;

    /**
     * Tells whether a {@link TExtensibleElements proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TExtensibleElements >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4cb46098-6c49-4125-b897-f6ba7df66f7d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TExtensibleElements.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TExtensibleElements.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TExtensibleElements >> then instantiate a {@link TExtensibleElements} proxy.
     * 
     * @return a {@link TExtensibleElements} proxy on the created {@link Class}.
     */
    @objid ("0c652230-2b7c-4a81-ad98-9b1a48234b9a")
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
    @objid ("895989e6-00bb-4734-87f2-f30762be83cd")
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
    @objid ("7f5963fb-644c-464a-a470-dbfc14396516")
    public static TExtensibleElements safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TExtensibleElements.canInstantiate(obj))
        	return new TExtensibleElements(obj);
        else
        	throw new IllegalArgumentException("TExtensibleElements: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5ba0a0c8-11f6-4e64-97e0-4a9e6d3bfd46")
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
    @objid ("c6cc8d9d-7433-41bf-b09f-c663979b2a16")
    public Class getElement() {
        return this.elt;
    }

    @objid ("654d1482-d316-4126-9f23-4d3f6b23b0e2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("762b8ef1-ead9-4d86-860f-b4363cfd0d1b")
    protected  TExtensibleElements(final Class elt) {
        this.elt = elt;
    }

    @objid ("645ebf8b-016a-4d81-853b-fdc5cba8fa62")
    public static final class MdaTypes {
        @objid ("76b30313-457a-4f25-8038-120a614bc35f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("02c5ec3c-9519-453f-a8d3-1408d05fab48")
        private static Stereotype MDAASSOCDEP;

        @objid ("6cf7826c-2c89-4da2-b646-823e516f034f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a7c417f9-903c-4af1-b455-ffa9723b8615")
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

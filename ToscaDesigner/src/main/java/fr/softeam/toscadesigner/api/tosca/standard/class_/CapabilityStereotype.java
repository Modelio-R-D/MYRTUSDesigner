/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 06/02/2025 17:32 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << CapabilityStereotype >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c3cd8c5a-2317-4577-a43f-48adfafbf708")
public class CapabilityStereotype implements IMdaProxy {
    @objid ("d5d12af0-139f-4b13-82e3-7c833e8925b4")
    public static final String STEREOTYPE_NAME = "CapabilityStereotype";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("cb554d9c-d37d-421c-aca2-75f535dde641")
    protected final Class elt;

    /**
     * Tells whether a {@link CapabilityStereotype proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CapabilityStereotype >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d91a407c-db88-4be8-a2b1-3eb457d8cd24")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (CapabilityStereotype.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(CapabilityStereotype.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << CapabilityStereotype >> then instantiate a {@link CapabilityStereotype} proxy.
     * 
     * @return a {@link CapabilityStereotype} proxy on the created {@link Class}.
     */
    @objid ("93da0862-4d3d-470b-a6d6-2f28c797e12b")
    public static CapabilityStereotype create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(CapabilityStereotype.MdaTypes.STEREOTYPE_ELT);
        return CapabilityStereotype.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CapabilityStereotype} proxy from a {@link Class} stereotyped << CapabilityStereotype >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CapabilityStereotype} proxy or <i>null</i>.
     */
    @objid ("5bb5ef3f-9fc1-480d-9509-fc5e61a5feac")
    public static CapabilityStereotype instantiate(final Class obj) {
        return CapabilityStereotype.canInstantiate(obj) ? new CapabilityStereotype(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CapabilityStereotype} proxy from a {@link Class} stereotyped << CapabilityStereotype >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CapabilityStereotype} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("557bb11c-045f-4864-b162-ad07bb812021")
    public static CapabilityStereotype safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CapabilityStereotype.canInstantiate(obj))
        	return new CapabilityStereotype(obj);
        else
        	throw new IllegalArgumentException("CapabilityStereotype: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("006ff37a-24b4-4c85-980b-127cb929a42e")
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
        CapabilityStereotype other = (CapabilityStereotype) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("0314c8aa-c1a7-40e1-8ace-0e927bf081d6")
    public Class getElement() {
        return this.elt;
    }

    @objid ("c1084af0-5690-4414-9112-93c4332fb0fa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("379c4c13-9ab3-489e-a759-72914a5b41d9")
    protected  CapabilityStereotype(final Class elt) {
        this.elt = elt;
    }

    @objid ("81126b1a-07e3-4950-95af-a06ccd7c5c2e")
    public static final class MdaTypes {
        @objid ("0d812bbb-ad84-466d-ab4f-9f7a53d3b040")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d559009f-7a5b-4b28-8c9c-7a167971fda1")
        private static Stereotype MDAASSOCDEP;

        @objid ("bcbe9c36-4e00-47ae-9a05-4f895c4eb6d2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b792c45b-ef8c-4f34-9732-ee4ac0408bf3")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "54f6e81a-afca-4381-aad4-5cf823fcf192", "CapabilityStereotype");
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

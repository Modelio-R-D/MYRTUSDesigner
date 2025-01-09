/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 16:04 by Modelio Studio.
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
    @objid ("7cfa8149-9a06-422f-b527-4cd53cc343fc")
    public static final String STEREOTYPE_NAME = "CapabilityStereotype";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("0f5eb745-5b9f-4905-94de-927c8b0ecc56")
    protected final Class elt;

    /**
     * Tells whether a {@link CapabilityStereotype proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CapabilityStereotype >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("65b6f33d-0e7a-42c4-970f-c3701d8defc2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (CapabilityStereotype.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(CapabilityStereotype.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << CapabilityStereotype >> then instantiate a {@link CapabilityStereotype} proxy.
     * 
     * @return a {@link CapabilityStereotype} proxy on the created {@link Class}.
     */
    @objid ("3d541466-f934-4902-a84d-ba0843524cad")
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
    @objid ("1de17490-85a8-402d-82f1-557450db71df")
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
    @objid ("a0842c25-8669-4c3f-b692-87161e3ecef0")
    public static CapabilityStereotype safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CapabilityStereotype.canInstantiate(obj))
        	return new CapabilityStereotype(obj);
        else
        	throw new IllegalArgumentException("CapabilityStereotype: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e6438fb8-360e-4f38-835c-de3693d7b3ae")
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
    @objid ("b377d0b6-6b8f-41d7-8323-ba08da22c2ac")
    public Class getElement() {
        return this.elt;
    }

    @objid ("bf8ff534-708e-442d-949f-c2849399db0f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("9d040e17-ef10-49bb-b9fe-f0514a56ac37")
    protected  CapabilityStereotype(final Class elt) {
        this.elt = elt;
    }

    @objid ("81126b1a-07e3-4950-95af-a06ccd7c5c2e")
    public static final class MdaTypes {
        @objid ("e5a878e5-730e-46cf-bcbf-b069145a376f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("11d12a00-96db-44f6-9859-5c7dc774cae6")
        private static Stereotype MDAASSOCDEP;

        @objid ("334db437-4fe8-440c-aa34-56fda1552292")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("34a53bfb-25c1-49c1-87f3-758ae319be6f")
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

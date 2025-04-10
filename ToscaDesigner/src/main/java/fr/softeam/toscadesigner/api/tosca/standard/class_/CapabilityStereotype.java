/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 10:12 by Modelio Studio.
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
@objid ("bc897695-03a8-42b1-beb1-8f8a2a0ec1f5")
public class CapabilityStereotype implements IMdaProxy {
    @objid ("40b826fa-8543-41c4-bafe-817ca4543f0c")
    public static final String STEREOTYPE_NAME = "CapabilityStereotype";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("b5797e96-582e-47f6-94ab-0c5abfcbadc4")
    protected final Class elt;

    /**
     * Tells whether a {@link CapabilityStereotype proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CapabilityStereotype >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("42b8009f-d7a2-4d02-87d6-eec03b0bfc74")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (CapabilityStereotype.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(CapabilityStereotype.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << CapabilityStereotype >> then instantiate a {@link CapabilityStereotype} proxy.
     * 
     * @return a {@link CapabilityStereotype} proxy on the created {@link Class}.
     */
    @objid ("e5337d41-8db7-415a-a7d9-d85ecc8f3b5d")
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
    @objid ("bf914c0c-3f8c-43c7-a3b3-bd6bc85b03c9")
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
    @objid ("385ff302-04de-4c8b-9d1e-01567bb409f0")
    public static CapabilityStereotype safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CapabilityStereotype.canInstantiate(obj))
        	return new CapabilityStereotype(obj);
        else
        	throw new IllegalArgumentException("CapabilityStereotype: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("58aa07eb-572e-4fd1-8346-29806199b721")
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
    @objid ("25b3604f-fd61-4248-936c-73e10c851120")
    public Class getElement() {
        return this.elt;
    }

    @objid ("c5db2105-199d-4f74-a0ed-9a9a059f730e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("b43c2757-6f92-4aca-bcb4-a661e0ec53ba")
    protected  CapabilityStereotype(final Class elt) {
        this.elt = elt;
    }

    @objid ("55a49bc8-116f-4c52-92b4-8d0a55872bf5")
    public static final class MdaTypes {
        @objid ("82d5199f-591f-45da-9fec-a4adb0665666")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c2dad07b-326f-45b2-b600-e502e53e4127")
        private static Stereotype MDAASSOCDEP;

        @objid ("4a38a03c-bba1-440e-9d09-3f8c261dc44b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bbb7c10c-2ce0-4635-b027-3ca6c67e22b2")
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

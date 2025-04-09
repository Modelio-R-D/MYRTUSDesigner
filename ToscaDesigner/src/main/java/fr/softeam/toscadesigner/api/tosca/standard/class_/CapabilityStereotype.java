/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
    @objid ("230f07b9-8829-4382-a91a-15bfe3fd8dd1")
    public static final String STEREOTYPE_NAME = "CapabilityStereotype";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("2f3c9be8-5cea-4e9c-b054-98f43eaee775")
    protected final Class elt;

    /**
     * Tells whether a {@link CapabilityStereotype proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CapabilityStereotype >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("662a2e42-81e3-4012-8b75-4fec49678eb3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (CapabilityStereotype.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(CapabilityStereotype.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << CapabilityStereotype >> then instantiate a {@link CapabilityStereotype} proxy.
     * 
     * @return a {@link CapabilityStereotype} proxy on the created {@link Class}.
     */
    @objid ("7a8ee95a-5945-4093-b5b1-b731a6c2d831")
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
    @objid ("32288b21-c002-480c-8b11-c5eb2c82dadb")
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
    @objid ("e10e593f-c07e-4ce9-a0a9-f9ec557e97f4")
    public static CapabilityStereotype safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CapabilityStereotype.canInstantiate(obj))
        	return new CapabilityStereotype(obj);
        else
        	throw new IllegalArgumentException("CapabilityStereotype: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d4a050dc-f3c2-4a2c-8e32-b857eea2ed32")
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
    @objid ("453a8859-d4a5-4ac5-b09c-0800252e0440")
    public Class getElement() {
        return this.elt;
    }

    @objid ("3f4daa2a-5620-499e-af1b-5474040e0cd7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("5d2fb51a-1fc7-4c75-bcd0-8c41d11eaf2b")
    protected  CapabilityStereotype(final Class elt) {
        this.elt = elt;
    }

    @objid ("55a49bc8-116f-4c52-92b4-8d0a55872bf5")
    public static final class MdaTypes {
        @objid ("e7404f01-f008-4d5c-919f-782d85d2a6ae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f157fa38-37c7-4683-97da-fad410458675")
        private static Stereotype MDAASSOCDEP;

        @objid ("67166cf2-0453-4638-9a95-821d7583ede8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d822912f-8b6f-4f82-ba56-038d9207e8fa")
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

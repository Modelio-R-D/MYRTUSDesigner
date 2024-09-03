/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 17:56 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Attribute} with << Metadata >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3f0b4190-b10a-4ac9-8c38-6bcb8f707fbe")
public class Metadata implements IMdaProxy {
    @objid ("a8f6642c-8045-4904-bbb6-569b53e34781")
    public static final String STEREOTYPE_NAME = "Metadata";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("34531fab-a2ba-49a0-bbec-357285b7a709")
    protected final Attribute elt;

    /**
     * Tells whether a {@link Metadata proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Metadata >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("54d5bfc6-053f-4b54-8349-50fb9938e4be")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (Metadata.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(Metadata.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Metadata >> then instantiate a {@link Metadata} proxy.
     * 
     * @return a {@link Metadata} proxy on the created {@link Attribute}.
     */
    @objid ("eb2f5da7-ffe5-4282-9ae4-50ecef947f4a")
    public static Metadata create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(Metadata.MdaTypes.STEREOTYPE_ELT);
        return Metadata.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link Metadata} proxy from a {@link Attribute} stereotyped << Metadata >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link Metadata} proxy or <i>null</i>.
     */
    @objid ("b1179cd0-66c1-4a7e-983b-6334047ce9c8")
    public static Metadata instantiate(final Attribute obj) {
        return Metadata.canInstantiate(obj) ? new Metadata(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Metadata} proxy from a {@link Attribute} stereotyped << Metadata >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link Metadata} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("59dc3c14-a22b-4637-ad6b-432934243ee4")
    public static Metadata safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (Metadata.canInstantiate(obj))
        	return new Metadata(obj);
        else
        	throw new IllegalArgumentException("Metadata: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("42060728-1af2-4466-a7bb-d1025f708c5b")
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
        Metadata other = (Metadata) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("78db4774-2828-43de-aa8c-54c230819b08")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("ca83819b-d092-4dc0-b16c-2c209c7e862e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("b907770c-7398-42be-96b3-8a41d4bc53ae")
    protected  Metadata(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("8fdaccbc-dcda-4810-821b-5f4384df5854")
    public static final class MdaTypes {
        @objid ("fc7867e3-50a2-4d45-89a1-641cedaf9edb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0cc47e13-6441-4d4f-bff8-6803eef0830c")
        private static Stereotype MDAASSOCDEP;

        @objid ("d68bd33a-9532-402d-8e2e-bfa697752ec3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8870c9e4-9b51-4783-840b-f4b2133a82c1")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "d0b4eda0-d876-4c48-8bc7-604458678120", "Metadata");
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

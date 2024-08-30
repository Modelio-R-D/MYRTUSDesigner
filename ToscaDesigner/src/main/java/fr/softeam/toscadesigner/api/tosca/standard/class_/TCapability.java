/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 17:26 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TCapability >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("15113e6b-a9fd-4a01-b397-5ba429ab33af")
public class TCapability implements IMdaProxy {
    @objid ("8fbbceec-7fb9-4d9d-846a-5389a011e08b")
    public static final String STEREOTYPE_NAME = "TCapability";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("ce3d44c3-d80e-407c-b3d5-ea77c03f2d3e")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapability proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapability >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0fff51dd-a73d-4f1e-bb68-c9a6916c043a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapability.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapability.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapability >> then instantiate a {@link TCapability} proxy.
     * 
     * @return a {@link TCapability} proxy on the created {@link Class}.
     */
    @objid ("2f2bc734-96e6-49fb-a689-5b35379b384d")
    public static TCapability create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TCapability.MdaTypes.STEREOTYPE_ELT);
        return TCapability.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TCapability} proxy from a {@link Class} stereotyped << TCapability >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TCapability} proxy or <i>null</i>.
     */
    @objid ("ac899654-af15-4583-b155-0feb4e8ee69b")
    public static TCapability instantiate(final Class obj) {
        return TCapability.canInstantiate(obj) ? new TCapability(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapability} proxy from a {@link Class} stereotyped << TCapability >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapability} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1e58cac5-f6a5-4824-8bf9-4f1067520875")
    public static TCapability safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapability.canInstantiate(obj))
        	return new TCapability(obj);
        else
        	throw new IllegalArgumentException("TCapability: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("863be552-97f6-4b25-ac8d-05561aec8cfb")
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
        TCapability other = (TCapability) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e955a8bc-be18-4514-bb0c-b5afd94f8560")
    public Class getElement() {
        return this.elt;
    }

    @objid ("c0021c29-bfa0-40a0-ac87-a9934d0d1d6d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("dcec62b0-18f6-4904-801c-bac882f06303")
    protected  TCapability(final Class elt) {
        this.elt = elt;
    }

    @objid ("a279b09b-43e2-425b-8f16-f2590abd5a47")
    public static final class MdaTypes {
        @objid ("7deaec11-0336-432b-9ac0-6bcc34bf1623")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9250dfb1-6ab9-4008-b3c8-a0ab8bd48dfd")
        private static Stereotype MDAASSOCDEP;

        @objid ("0e4efe9b-ea45-48b1-bca4-6db71e022538")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("419e44c4-71fd-46d6-a5cf-e039c9a23ad8")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "92831533-b614-4124-8961-3cd7ebcad536", "TCapability");
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

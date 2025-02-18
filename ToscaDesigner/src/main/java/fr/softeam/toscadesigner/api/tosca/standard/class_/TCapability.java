/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 18/02/2025 10:30 by Modelio Studio.
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
@objid ("467dfeb7-6b87-40d5-984a-2a232c3c58a0")
public class TCapability implements IMdaProxy {
    @objid ("197057a4-c1fe-4036-864a-86563de3933f")
    public static final String STEREOTYPE_NAME = "TCapability";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("d335c03f-6def-426c-9ba1-fdea63280f7a")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapability proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapability >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b1e16484-080b-4398-9112-44ea2ef372d8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapability.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapability.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapability >> then instantiate a {@link TCapability} proxy.
     * 
     * @return a {@link TCapability} proxy on the created {@link Class}.
     */
    @objid ("b628100f-457f-40a9-85bc-5e7e486a38ef")
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
    @objid ("df19043d-0092-4d20-a738-c23cd20827c2")
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
    @objid ("a975dced-b7b2-48d1-aed8-6772b604b3fe")
    public static TCapability safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapability.canInstantiate(obj))
        	return new TCapability(obj);
        else
        	throw new IllegalArgumentException("TCapability: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8bca5e35-f6df-40a2-905c-bc8839dbce75")
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
    @objid ("a027dc93-f57c-4e4c-ab18-887364bf106f")
    public Class getElement() {
        return this.elt;
    }

    @objid ("3111fc57-99b3-4309-9b24-076e8aac71d4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("b7d3d058-e9dd-4c7e-859a-5a9867b2f00b")
    protected  TCapability(final Class elt) {
        this.elt = elt;
    }

    @objid ("e5bb7dea-f850-4fb6-a159-028f428181d6")
    public static final class MdaTypes {
        @objid ("a3873e1b-44f0-4644-8755-b2345b62ebd8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("274e00e8-80f1-47b3-afc5-926abee4fab4")
        private static Stereotype MDAASSOCDEP;

        @objid ("1029306f-005d-4e61-b53a-0a64ae9f207e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b3eccdc9-84c4-4433-8a56-059897378278")
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

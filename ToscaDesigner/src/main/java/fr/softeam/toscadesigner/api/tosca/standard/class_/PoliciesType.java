/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << PoliciesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("efa48374-5dba-4631-8ac7-f4e814fd38a9")
public class PoliciesType implements IMdaProxy {
    @objid ("56f77361-cefe-4bb7-b1eb-2fb72128b360")
    public static final String STEREOTYPE_NAME = "PoliciesType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("3f33f869-d99b-4fe3-aebe-2a2e4da42a8d")
    protected final Class elt;

    /**
     * Tells whether a {@link PoliciesType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PoliciesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("eee3ef64-d6ce-4f1d-a3ab-4610808bb3be")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (PoliciesType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(PoliciesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << PoliciesType >> then instantiate a {@link PoliciesType} proxy.
     * @return a {@link PoliciesType} proxy on the created {@link Class}.
     */
    @objid ("b1f101dc-28c7-40a2-98e8-60328a08bfb1")
    public static PoliciesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(PoliciesType.MdaTypes.STEREOTYPE_ELT);
        return PoliciesType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link PoliciesType} proxy from a {@link Class} stereotyped << PoliciesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link PoliciesType} proxy or <i>null</i>.
     */
    @objid ("34acc7af-3d59-444d-906b-c7870ae2b58a")
    public static PoliciesType instantiate(final Class obj) {
        return PoliciesType.canInstantiate(obj) ? new PoliciesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PoliciesType} proxy from a {@link Class} stereotyped << PoliciesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link PoliciesType} proxy.
     */
    @objid ("7be6c1b6-4eaa-4f4c-a48f-36ee1ff2f98a")
    public static PoliciesType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PoliciesType.canInstantiate(obj))
            return new PoliciesType(obj);
        else
            throw new IllegalArgumentException("PoliciesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("eecc1178-5976-4673-88ad-00119d45992f")
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
        PoliciesType other = (PoliciesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("6fc3dfb0-297b-45e5-994b-b8a8a354b699")
    public Class getElement() {
        return this.elt;
    }

    @objid ("590ade24-b2d7-4785-9f57-fb46c72024aa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("40178b99-6df2-4a5d-ac5c-8e58ab74b056")
    protected  PoliciesType(final Class elt) {
        this.elt = elt;
    }

    @objid ("e0424526-67dc-43ae-9059-9cee6f02c6ca")
    public static final class MdaTypes {
        @objid ("32486931-f4cf-47b3-b6c0-03814604f900")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8a6dbfe5-0789-497b-a0ba-23b84ec307ec")
        private static Stereotype MDAASSOCDEP;

        @objid ("6f619318-d101-4ed4-9d79-35bebd8a23fa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4f6dd42d-75f6-47e8-a526-5cdcf979539d")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "d4897b52-a366-4cb7-9760-2e3571815c1f", "PoliciesType");
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

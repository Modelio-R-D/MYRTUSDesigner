/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 16:27 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TPlan >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cc6006e4-6517-405a-9102-4e2164167c93")
public class TPlan implements IMdaProxy {
    @objid ("179f6ef2-3530-47b6-aab1-e3d5c5e0243b")
    public static final String STEREOTYPE_NAME = "TPlan";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("532530b0-a8a1-49a0-a6a4-f41ad3ce64f5")
    protected final Class elt;

    /**
     * Tells whether a {@link TPlan proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPlan >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("702a9cbb-c960-47ff-84ae-6deccd4d5c48")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPlan.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPlan.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPlan >> then instantiate a {@link TPlan} proxy.
     * @return a {@link TPlan} proxy on the created {@link Class}.
     */
    @objid ("d580e46d-7e14-43c8-beda-6b62931cf3f6")
    public static TPlan create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TPlan.MdaTypes.STEREOTYPE_ELT);
        return TPlan.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TPlan} proxy from a {@link Class} stereotyped << TPlan >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TPlan} proxy or <i>null</i>.
     */
    @objid ("73ca81bc-2aa7-400c-a3f6-b3d935565ca9")
    public static TPlan instantiate(final Class obj) {
        return TPlan.canInstantiate(obj) ? new TPlan(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPlan} proxy from a {@link Class} stereotyped << TPlan >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TPlan} proxy.
     */
    @objid ("689d2dc1-ab30-41bd-815e-81c710a32760")
    public static TPlan safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPlan.canInstantiate(obj))
            return new TPlan(obj);
        else
            throw new IllegalArgumentException("TPlan: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("681e83c4-74fb-42f7-9563-0a99e9eb0f25")
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
        TPlan other = (TPlan) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("fc958da6-8cf8-4bb7-b27f-4f46fcaa8d24")
    public Class getElement() {
        return this.elt;
    }

    @objid ("7c0e838c-eff4-4bb3-aef5-3713c08979cb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6eddbec2-4f13-4cc7-a236-638104a60297")
    protected  TPlan(final Class elt) {
        this.elt = elt;
    }

    @objid ("d68a9af0-cfd0-4bd4-9f9c-ea9cdc8ee352")
    public static final class MdaTypes {
        @objid ("bdc14948-8bf5-4eb9-8725-84262c723d1b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b19f4d24-6fc3-4342-86e2-952491bac660")
        private static Stereotype MDAASSOCDEP;

        @objid ("d30b5013-74b2-4653-ab02-37cd3275d386")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ad85a580-3709-459f-87f1-b45d2c3c5dd8")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "182e3894-ba54-49ce-bfdc-c97d06294a29", "TPlan");
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

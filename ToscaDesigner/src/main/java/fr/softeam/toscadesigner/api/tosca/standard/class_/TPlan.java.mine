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
 * Proxy class to handle a {@link Class} with << TPlan >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cde5427c-d8ef-43e4-bfcc-bc81d23e0663")
public class TPlan implements IMdaProxy {
    @objid ("8da138e1-fbea-4237-959f-eaff70cd439a")
    public static final String STEREOTYPE_NAME = "TPlan";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("8cfd46b2-30e4-49b3-8be7-6f358c77174c")
    protected final Class elt;

    /**
     * Tells whether a {@link TPlan proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPlan >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("788d8b56-de54-4e6c-9fa0-2072a29988bc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPlan.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPlan.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPlan >> then instantiate a {@link TPlan} proxy.
     * @return a {@link TPlan} proxy on the created {@link Class}.
     */
    @objid ("1a1a5bbb-cf5d-4308-bc8b-fb8624953c73")
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
    @objid ("4384803d-1745-45fa-bdfe-e901f00f8370")
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
    @objid ("40d0cd66-efd5-40bf-9d81-c93cec12a1e9")
    public static TPlan safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPlan.canInstantiate(obj))
            return new TPlan(obj);
        else
            throw new IllegalArgumentException("TPlan: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ce0a2b49-d1e5-4381-8c54-2eba58aa2fe7")
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
    @objid ("c981d75e-5531-459c-820f-df91c920cf91")
    public Class getElement() {
        return this.elt;
    }

    @objid ("8f56ac20-402f-4d7e-a805-2299517e3735")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("1097bf72-227a-401d-a79a-b96271addc0f")
    protected  TPlan(final Class elt) {
        this.elt = elt;
    }

    @objid ("31efa35b-d5a8-413c-ad3f-b3ac7cb9ac01")
    public static final class MdaTypes {
        @objid ("b2d0f006-8cc0-463a-9fd1-d121ea0ba228")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6c08938b-daf3-4703-a8f4-a3d237d09765")
        private static Stereotype MDAASSOCDEP;

        @objid ("d1e635f1-d2ac-4786-8ee7-311907093331")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3ce981a3-e091-4485-83f6-fe6b4be968f4")
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

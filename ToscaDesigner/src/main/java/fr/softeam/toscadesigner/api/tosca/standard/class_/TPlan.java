/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/10/2024 11:40 by Modelio Studio.
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
@objid ("d0e0ec6c-43fc-4fd7-a8b7-6a9421f93d91")
public class TPlan implements IMdaProxy {
    @objid ("fc8f8e46-a3df-459b-8c57-f46d7d75ac61")
    public static final String STEREOTYPE_NAME = "TPlan";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("19195cdb-162b-4992-a0c0-b52eab117995")
    protected final Class elt;

    /**
     * Tells whether a {@link TPlan proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPlan >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("506acee6-7068-4bf3-8403-1da880c2419f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPlan.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPlan.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPlan >> then instantiate a {@link TPlan} proxy.
     * 
     * @return a {@link TPlan} proxy on the created {@link Class}.
     */
    @objid ("b31ac8a4-89e4-4b1f-94b2-b6ce41c73c6d")
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
    @objid ("c68571c3-e585-4b98-bee7-c9ba4d852cfa")
    public static TPlan instantiate(final Class obj) {
        return TPlan.canInstantiate(obj) ? new TPlan(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPlan} proxy from a {@link Class} stereotyped << TPlan >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TPlan} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("12ee39dc-9d45-40b7-8012-3157eae82641")
    public static TPlan safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPlan.canInstantiate(obj))
        	return new TPlan(obj);
        else
        	throw new IllegalArgumentException("TPlan: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5e92de35-ec80-49ba-97a6-d7f8b60a2145")
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
    @objid ("9f706eb7-e3cc-451c-aed0-b4b50dda42d9")
    public Class getElement() {
        return this.elt;
    }

    @objid ("19296f3c-8fb0-410f-8927-e6234ec4db7f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("a4d86f56-9a35-465f-9b3a-b353489c9e66")
    protected  TPlan(final Class elt) {
        this.elt = elt;
    }

    @objid ("05b7256d-08e0-4ebc-ad55-d191078dc8c0")
    public static final class MdaTypes {
        @objid ("5903f9c2-ee79-4e0b-ae36-7ea48c8dd51a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fe5e8ad4-acc7-4ccb-a980-174276c0fa4b")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a6bc30d-1827-43b7-8f45-49680180b1d2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ccb6a0a-38a8-4b55-92c1-2b9c60489aed")
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

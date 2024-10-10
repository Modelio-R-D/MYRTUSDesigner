/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/10/2024 11:39 by Modelio Studio.
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
    @objid ("4142a06b-ed79-4584-8c55-dd2f05750fb2")
    public static final String STEREOTYPE_NAME = "TPlan";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("03ac27ae-f846-4755-9dcb-4479cd26c59c")
    protected final Class elt;

    /**
     * Tells whether a {@link TPlan proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPlan >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0442066f-84d8-481c-afc0-2301549052ab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPlan.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPlan.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPlan >> then instantiate a {@link TPlan} proxy.
     * 
     * @return a {@link TPlan} proxy on the created {@link Class}.
     */
    @objid ("f9a607a0-02f6-4e83-ad50-bcca71fc6e3e")
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
    @objid ("671a04c3-614d-412a-9817-31828cffa025")
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
    @objid ("dd7b9c08-dd2d-46a3-bc6b-3b0169b7dba6")
    public static TPlan safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPlan.canInstantiate(obj))
        	return new TPlan(obj);
        else
        	throw new IllegalArgumentException("TPlan: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5d9332fd-4ecf-48d2-89f2-1143845a4459")
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
    @objid ("d3d24d30-43dd-41fa-9982-32decfce0eae")
    public Class getElement() {
        return this.elt;
    }

    @objid ("df4673be-00b9-4f48-b01d-74bc1f726253")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("d32cd89d-d91e-4ec0-b1e7-ac893922645d")
    protected  TPlan(final Class elt) {
        this.elt = elt;
    }

    @objid ("05b7256d-08e0-4ebc-ad55-d191078dc8c0")
    public static final class MdaTypes {
        @objid ("d44b0bc2-77b0-440e-8b30-51cb7897c700")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("055fc772-9bf6-4ff8-9a23-04be8a5991ba")
        private static Stereotype MDAASSOCDEP;

        @objid ("b555f19a-7dfc-4609-9c2c-01891c5419f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("029cfd6c-831c-49d2-8bdc-e136cb66d985")
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

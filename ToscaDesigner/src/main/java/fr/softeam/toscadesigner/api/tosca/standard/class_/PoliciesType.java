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
    @objid ("221ae4b0-5a20-4ba5-a494-6367381a7fda")
    public static final String STEREOTYPE_NAME = "PoliciesType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("c409860e-b71a-49fa-af4b-919c9aa47447")
    protected final Class elt;

    /**
     * Tells whether a {@link PoliciesType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PoliciesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cb84c72d-e20a-4f87-b365-ba370130333f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (PoliciesType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(PoliciesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << PoliciesType >> then instantiate a {@link PoliciesType} proxy.
     * @return a {@link PoliciesType} proxy on the created {@link Class}.
     */
    @objid ("c076be4d-b6fb-43d8-8112-991d8305c4d1")
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
    @objid ("f8cc61f7-d866-4f47-9b38-e4549ea951b4")
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
    @objid ("fd74b7aa-5ea8-4cf8-a084-84f411d7f5d0")
    public static PoliciesType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PoliciesType.canInstantiate(obj))
            return new PoliciesType(obj);
        else
            throw new IllegalArgumentException("PoliciesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ed704f61-0c32-4c6a-b7e3-2b66a45ca675")
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
    @objid ("77d0d54c-d160-4864-8369-8d831cceebef")
    public Class getElement() {
        return this.elt;
    }

    @objid ("c58cf7c2-285d-4d5c-9249-3fccc11ffe8c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("381ba7fb-bf54-4417-8e98-5167040974c9")
    protected  PoliciesType(final Class elt) {
        this.elt = elt;
    }

    @objid ("e0424526-67dc-43ae-9059-9cee6f02c6ca")
    public static final class MdaTypes {
        @objid ("6ef47d25-36fc-410b-a563-7d7722b903f1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5ace3f72-820b-4381-baea-47501873fa57")
        private static Stereotype MDAASSOCDEP;

        @objid ("2f14a99b-39f5-405c-8fe5-a4cf969cf200")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4e4bfc24-550a-4596-a440-0d0782463aff")
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

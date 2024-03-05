/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 05/03/2024 18:02 by Modelio Studio.
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
    @objid ("df1a2394-032e-488b-a1dc-c6b772a079c4")
    public static final String STEREOTYPE_NAME = "PoliciesType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("7a524017-d396-44c2-96a3-42ff9708206f")
    protected final Class elt;

    /**
     * Tells whether a {@link PoliciesType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << PoliciesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4af727c7-3d61-4dcf-a2de-99ace06b88da")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (PoliciesType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(PoliciesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << PoliciesType >> then instantiate a {@link PoliciesType} proxy.
     * 
     * @return a {@link PoliciesType} proxy on the created {@link Class}.
     */
    @objid ("2ed769bf-4815-400f-a728-25426070825c")
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
    @objid ("52ba3f2e-3d45-41e6-8e43-ba6d38ce9cb8")
    public static PoliciesType instantiate(final Class obj) {
        return PoliciesType.canInstantiate(obj) ? new PoliciesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PoliciesType} proxy from a {@link Class} stereotyped << PoliciesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link PoliciesType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4a8e83a9-f8a8-4445-b805-feb1a715fdd3")
    public static PoliciesType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (PoliciesType.canInstantiate(obj))
        	return new PoliciesType(obj);
        else
        	throw new IllegalArgumentException("PoliciesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("305967de-f912-415c-86bf-c66e4d7f8cde")
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
    @objid ("3c38ca0c-c1e8-48f7-87fa-3930c58c6a7c")
    public Class getElement() {
        return this.elt;
    }

    @objid ("a17d2c90-73ec-44d6-82a7-ac65d7d33e9b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("edfdb2a6-b9f4-4c67-9ddf-49ac4af21c73")
    protected  PoliciesType(final Class elt) {
        this.elt = elt;
    }

    @objid ("e0424526-67dc-43ae-9059-9cee6f02c6ca")
    public static final class MdaTypes {
        @objid ("d0fff7fb-88ec-4726-8f24-e4e8750eac43")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d55437e7-c665-483a-b9a5-1b2ed9a85a42")
        private static Stereotype MDAASSOCDEP;

        @objid ("0b5cf065-12b0-4781-b1ee-8b45220ca7de")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("27a4b6e0-2141-4ea7-a707-3a28eb17c050")
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

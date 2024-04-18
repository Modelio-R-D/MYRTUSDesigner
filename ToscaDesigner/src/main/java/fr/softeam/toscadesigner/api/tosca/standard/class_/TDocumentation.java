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
 * Proxy class to handle a {@link Class} with << TDocumentation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9fcf11ab-0f2c-4aed-8c52-aa6ab8904781")
public class TDocumentation implements IMdaProxy {
    @objid ("b558461f-5226-4e89-9b73-2baa45538d70")
    public static final String STEREOTYPE_NAME = "TDocumentation";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("b7e7cf41-b613-4a35-aa47-1342a3ae3dd6")
    protected final Class elt;

    /**
     * Tells whether a {@link TDocumentation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDocumentation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("71aaf8c3-81d7-4e70-ba14-caa5c744b4a8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDocumentation.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDocumentation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDocumentation >> then instantiate a {@link TDocumentation} proxy.
     * @return a {@link TDocumentation} proxy on the created {@link Class}.
     */
    @objid ("9e96c8ea-2647-4f65-ad61-0fb71daaad73")
    public static TDocumentation create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TDocumentation.MdaTypes.STEREOTYPE_ELT);
        return TDocumentation.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TDocumentation} proxy from a {@link Class} stereotyped << TDocumentation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TDocumentation} proxy or <i>null</i>.
     */
    @objid ("1981eeb0-f5dd-40fe-9bc5-38d3c07ad7dc")
    public static TDocumentation instantiate(final Class obj) {
        return TDocumentation.canInstantiate(obj) ? new TDocumentation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDocumentation} proxy from a {@link Class} stereotyped << TDocumentation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TDocumentation} proxy.
     */
    @objid ("a9305c3e-de7d-40f2-ac11-90cdf1dc9d91")
    public static TDocumentation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDocumentation.canInstantiate(obj))
            return new TDocumentation(obj);
        else
            throw new IllegalArgumentException("TDocumentation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5ca33107-2f06-4e71-9d5d-39ce0806a9b7")
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
        TDocumentation other = (TDocumentation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("3fec6f2b-3074-4cad-974e-4b0fbcfe75d8")
    public Class getElement() {
        return this.elt;
    }

    @objid ("bf52ea20-760a-4d90-b369-8805800efd20")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("21cfe8ed-1b9f-4d2c-9e31-f2dbff937115")
    protected  TDocumentation(final Class elt) {
        this.elt = elt;
    }

    @objid ("73d2cbcb-889f-4abc-ae65-8d5100b61417")
    public static final class MdaTypes {
        @objid ("c3e5e33d-13fc-4a6e-8998-2cdaa9af203b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("da74a88d-e7b5-4e9d-933e-4c809afbca71")
        private static Stereotype MDAASSOCDEP;

        @objid ("116fefa5-c3e2-46a4-91bc-8012b938b975")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8a7e17b9-6108-4215-b9bb-42b7e84f80a8")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1bcf2312-727a-4971-aac1-87f1c896f928", "TDocumentation");
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

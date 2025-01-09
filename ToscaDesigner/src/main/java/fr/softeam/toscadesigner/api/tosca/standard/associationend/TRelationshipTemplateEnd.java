/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 11:56 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link AssociationEnd} with << TRelationshipTemplateEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("05e7d440-860b-49b0-a554-4e82d28431d4")
public class TRelationshipTemplateEnd implements IMdaProxy {
    @objid ("1e42f720-873d-4f7d-ba2a-9d08f1e817de")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplateEnd";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("6dba1e05-f480-4062-aa21-0631f14408dc")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link TRelationshipTemplateEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("564ae7f1-c88a-4b53-9ba2-b8bec866f018")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && (TRelationshipTemplateEnd.MdaTypes.STEREOTYPE_ELT!=null) && ((AssociationEnd) elt).isStereotyped(TRelationshipTemplateEnd.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >> then instantiate a {@link TRelationshipTemplateEnd} proxy.
     * 
     * @return a {@link TRelationshipTemplateEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("2f54ba40-5c30-44dc-a548-49bf2d59ab29")
    public static TRelationshipTemplateEnd create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.AssociationEnd");
        e.getExtension().add(TRelationshipTemplateEnd.MdaTypes.STEREOTYPE_ELT);
        return TRelationshipTemplateEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplateEnd} proxy from a {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link TRelationshipTemplateEnd} proxy or <i>null</i>.
     */
    @objid ("621888e2-afd1-4517-aa26-abebb834db11")
    public static TRelationshipTemplateEnd instantiate(final AssociationEnd obj) {
        return TRelationshipTemplateEnd.canInstantiate(obj) ? new TRelationshipTemplateEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplateEnd} proxy from a {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link TRelationshipTemplateEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2510800d-854e-4510-979b-5430e5bee941")
    public static TRelationshipTemplateEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (TRelationshipTemplateEnd.canInstantiate(obj))
        	return new TRelationshipTemplateEnd(obj);
        else
        	throw new IllegalArgumentException("TRelationshipTemplateEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4eacd659-773d-4e3a-8620-9bb27741151f")
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
        TRelationshipTemplateEnd other = (TRelationshipTemplateEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("bb469255-e875-45be-a125-973d2c30ea8f")
    public AssociationEnd getElement() {
        return this.elt;
    }

    @objid ("d3959b84-44c1-470c-a0cd-54d68288b9b8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("c6dde6cc-50a4-4d70-b75e-0184d4d8a60f")
    protected  TRelationshipTemplateEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("60b3c940-e053-420b-a0e4-0fb9c5cefcdf")
    public static final class MdaTypes {
        @objid ("aa542f3e-e7ec-40ab-8041-eb628c01b25f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4c21f33c-3d4c-483c-94df-7585211190fd")
        private static Stereotype MDAASSOCDEP;

        @objid ("43e314b8-d1e6-4f38-bf28-9994093b4eba")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f983229e-c8fa-4b94-b630-3b9fe3749912")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "3b481377-24b9-4efa-bfae-9110a4732892", "TRelationshipTemplateEnd");
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

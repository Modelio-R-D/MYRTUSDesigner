/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 13/02/2025 17:54 by Modelio Studio.
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
@objid ("e445ee6a-938a-42d7-8ff3-c15c1f5b4354")
public class TRelationshipTemplateEnd implements IMdaProxy {
    @objid ("94424c82-c2c2-4954-9891-e0f3b46ab9d0")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplateEnd";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("26bf9734-c9c0-4207-9ab0-538d30b84ff8")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link TRelationshipTemplateEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ad5a156d-ac32-402d-ac1f-b8a8ad00adeb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && (TRelationshipTemplateEnd.MdaTypes.STEREOTYPE_ELT!=null) && ((AssociationEnd) elt).isStereotyped(TRelationshipTemplateEnd.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >> then instantiate a {@link TRelationshipTemplateEnd} proxy.
     * 
     * @return a {@link TRelationshipTemplateEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("1aae476b-692c-46a4-8fe9-5720461a6932")
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
    @objid ("1ba47acc-6303-4c03-84e3-28f2930a27ed")
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
    @objid ("1cb65d6c-eee9-4870-9e35-2afdcbc37752")
    public static TRelationshipTemplateEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (TRelationshipTemplateEnd.canInstantiate(obj))
        	return new TRelationshipTemplateEnd(obj);
        else
        	throw new IllegalArgumentException("TRelationshipTemplateEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d8ae2da-ed74-4e1a-95ab-1865348ec6f3")
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
    @objid ("75833d51-e246-4fdf-a0a9-82ab76978240")
    public AssociationEnd getElement() {
        return this.elt;
    }

    @objid ("9e8b4b5b-2b36-4c2c-8189-364c6af43c0e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("039b39b2-5ca8-436a-902c-3b6f16fbb778")
    protected  TRelationshipTemplateEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("e9b70c56-bbb5-48da-bb63-dccc857a6a89")
    public static final class MdaTypes {
        @objid ("ad0f4afd-f856-4949-a615-47c0eef2bb83")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6d7755dc-91a8-4889-92d6-1cd95dc887a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("8e0cdff3-1ebf-4165-8da5-856dd9b4b6c6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0caaa0b5-f50a-4c66-b744-9a87ad82d14f")
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

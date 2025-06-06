/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 04/06/2025 20:07 by Modelio Studio.
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
@objid ("32747e28-7968-4f2e-b595-7b9b851786c5")
public class TRelationshipTemplateEnd implements IMdaProxy {
    @objid ("4566e60e-e28c-4d77-8475-c90476237932")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplateEnd";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("7db93b94-36a8-4903-9590-6784e627fa06")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link TRelationshipTemplateEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("aa127169-b07b-41a9-8c33-2b7b914f560b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && (TRelationshipTemplateEnd.MdaTypes.STEREOTYPE_ELT!=null) && ((AssociationEnd) elt).isStereotyped(TRelationshipTemplateEnd.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >> then instantiate a {@link TRelationshipTemplateEnd} proxy.
     * 
     * @return a {@link TRelationshipTemplateEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("b61bff1b-3be4-448f-b8d2-886479fca0cd")
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
    @objid ("17a79ae0-2305-401d-a61e-19a2584eff2e")
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
    @objid ("ab0b1eb2-7417-4e96-bf15-c63325b3526e")
    public static TRelationshipTemplateEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (TRelationshipTemplateEnd.canInstantiate(obj))
        	return new TRelationshipTemplateEnd(obj);
        else
        	throw new IllegalArgumentException("TRelationshipTemplateEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ed3d8fbe-35b0-4a1a-ac29-72c748916b59")
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
    @objid ("52f6399c-6235-4a53-b59a-1ef26ccb0039")
    public AssociationEnd getElement() {
        return this.elt;
    }

    @objid ("a2dfce8b-1519-44e2-9881-1cef80b64710")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("057c12b8-dc9d-4a41-8ca3-95b41d840ee8")
    protected  TRelationshipTemplateEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("ecc6236e-5af5-44d5-80ee-e633631fb989")
    public static final class MdaTypes {
        @objid ("7c28d89d-b096-4238-b30b-fac64fdec9fe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a7a78270-ae17-4d27-87d6-f86b67736c54")
        private static Stereotype MDAASSOCDEP;

        @objid ("dfeca38b-0e78-47f2-9696-e41024dc9ba5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c9400b2a-58aa-4eda-83be-cfbdc028b713")
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

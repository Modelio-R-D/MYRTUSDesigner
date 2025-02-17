/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 15:39 by Modelio Studio.
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
    @objid ("af0ff7f0-cf0d-4816-885c-fc9ee66ce457")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplateEnd";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     */
    @objid ("34353e4f-51fd-4285-80d9-949b2a1931c4")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link TRelationshipTemplateEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("592a466d-2f87-424c-a8ba-75e17be15ff4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && (TRelationshipTemplateEnd.MdaTypes.STEREOTYPE_ELT!=null) && ((AssociationEnd) elt).isStereotyped(TRelationshipTemplateEnd.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >> then instantiate a {@link TRelationshipTemplateEnd} proxy.
     * 
     * @return a {@link TRelationshipTemplateEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("4ae123a7-1980-4ec7-b558-75d51a9a318e")
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
    @objid ("5987d172-2a74-489f-a9e9-4172521acdb4")
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
    @objid ("17e66948-f100-42b6-8f73-40e540f8ed4a")
    public static TRelationshipTemplateEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (TRelationshipTemplateEnd.canInstantiate(obj))
        	return new TRelationshipTemplateEnd(obj);
        else
        	throw new IllegalArgumentException("TRelationshipTemplateEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d2ca111-0af4-4765-b74f-1e1c5b836e2c")
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
    @objid ("316cad00-2f98-4842-8e6e-a1376c3abc6a")
    public AssociationEnd getElement() {
        return this.elt;
    }

    @objid ("5da8655a-81c6-425e-9b2f-e01d32db407c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("09234af7-ca36-4905-a1ac-0a4e34b03579")
    protected  TRelationshipTemplateEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("e9b70c56-bbb5-48da-bb63-dccc857a6a89")
    public static final class MdaTypes {
        @objid ("04aafbc2-f94b-4c66-8a6a-a63e19d39870")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ddc5df70-801c-4d78-8644-5efec0c48fc8")
        private static Stereotype MDAASSOCDEP;

        @objid ("b82058ef-8f45-4e72-ae3f-dea9f8d39b62")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("46d7c8c0-405a-4a1a-b8e5-7b1836cbec22")
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

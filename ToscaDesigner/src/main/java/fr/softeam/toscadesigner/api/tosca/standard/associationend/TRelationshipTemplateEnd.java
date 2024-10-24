/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
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
    @objid ("de65e8df-48e3-4202-b098-699069ac6c74")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplateEnd";

    /**
     * The underlying {@link AssociationEnd} represented by this proxy, never null.
     * 
     */
    @objid ("b552b285-98d2-46f8-92da-88b086f8808b")
    protected final AssociationEnd elt;

    /**
     * Tells whether a {@link TRelationshipTemplateEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bfab069d-45c6-43ea-be22-80e25b452853")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && (TRelationshipTemplateEnd.MdaTypes.STEREOTYPE_ELT!=null) && ((AssociationEnd) elt).isStereotyped(TRelationshipTemplateEnd.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >> then instantiate a {@link TRelationshipTemplateEnd} proxy.
     * @return a {@link TRelationshipTemplateEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("9e68cbde-11ae-4d56-85c4-bd2ffbb5e731")
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
    @objid ("1b46f208-d497-42c4-83cd-a86fbd2e0baa")
    public static TRelationshipTemplateEnd instantiate(final AssociationEnd obj) {
        return TRelationshipTemplateEnd.canInstantiate(obj) ? new TRelationshipTemplateEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplateEnd} proxy from a {@link AssociationEnd} stereotyped << TRelationshipTemplateEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link TRelationshipTemplateEnd} proxy.
     */
    @objid ("2d035ae5-5d33-4b65-b896-72c7587c7ae7")
    public static TRelationshipTemplateEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (TRelationshipTemplateEnd.canInstantiate(obj))
            return new TRelationshipTemplateEnd(obj);
        else
            throw new IllegalArgumentException("TRelationshipTemplateEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a87e39d7-04d1-4dad-b04e-a4e1d11746f4")
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
    @objid ("801f3b30-0c07-4228-b03d-05a81eb9313d")
    public AssociationEnd getElement() {
        return this.elt;
    }

    @objid ("33d6de90-2574-473f-9a03-9a59b3933eb7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("13b16ff6-1f4b-4bfb-ae2f-37fba1df26e0")
    protected  TRelationshipTemplateEnd(final AssociationEnd elt) {
        this.elt = elt;
    }

    @objid ("60b3c940-e053-420b-a0e4-0fb9c5cefcdf")
    public static final class MdaTypes {
        @objid ("4d20560e-d70a-41dc-949c-c455138ab56d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a6cd48d9-a3cc-4cc2-a46f-1e326d089511")
        private static Stereotype MDAASSOCDEP;

        @objid ("999658bc-fdce-4f32-a1d8-b270656d8307")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9b3c78aa-f993-452e-96d3-f29b3aa5ef99")
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

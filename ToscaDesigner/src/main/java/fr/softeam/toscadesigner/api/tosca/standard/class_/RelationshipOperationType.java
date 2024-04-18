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
 * Proxy class to handle a {@link Class} with << RelationshipOperationType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("06ea21f0-1682-427b-a117-4bb3fb43239f")
public class RelationshipOperationType implements IMdaProxy {
    @objid ("ab9e0d7a-0c08-4eb4-a9c1-d54585b13327")
    public static final String STEREOTYPE_NAME = "RelationshipOperationType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("25b3f604-10a2-4785-8b53-af332188ad61")
    protected final Class elt;

    /**
     * Tells whether a {@link RelationshipOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RelationshipOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b0765b88-23e1-4355-8700-41efbe6ca0b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RelationshipOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RelationshipOperationType >> then instantiate a {@link RelationshipOperationType} proxy.
     * @return a {@link RelationshipOperationType} proxy on the created {@link Class}.
     */
    @objid ("4477fa92-47dd-4070-a18f-7567bfbdeb6c")
    public static RelationshipOperationType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT);
        return RelationshipOperationType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RelationshipOperationType} proxy from a {@link Class} stereotyped << RelationshipOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RelationshipOperationType} proxy or <i>null</i>.
     */
    @objid ("577fdaba-bf22-4452-aff2-21ac0431c628")
    public static RelationshipOperationType instantiate(final Class obj) {
        return RelationshipOperationType.canInstantiate(obj) ? new RelationshipOperationType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RelationshipOperationType} proxy from a {@link Class} stereotyped << RelationshipOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RelationshipOperationType} proxy.
     */
    @objid ("1978b7a1-156b-4025-ae8f-f2a02c9432ca")
    public static RelationshipOperationType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RelationshipOperationType.canInstantiate(obj))
            return new RelationshipOperationType(obj);
        else
            throw new IllegalArgumentException("RelationshipOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9c8e4f1d-8240-4fa1-9289-c3c7330f8e51")
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
        RelationshipOperationType other = (RelationshipOperationType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("9d413434-9cb8-4ee1-ad19-111ffaa0ac25")
    public Class getElement() {
        return this.elt;
    }

    @objid ("904852a1-3a16-4346-a668-a1dde9f72760")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c4e1d303-b439-4b80-9a40-9a5ed359e568")
    protected  RelationshipOperationType(final Class elt) {
        this.elt = elt;
    }

    @objid ("0281d496-fe1e-425d-85af-3ca427e20b06")
    public static final class MdaTypes {
        @objid ("e1dfcdaf-356c-4ef6-804f-2b75fa712c8f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f70e71a5-eb75-4a69-8aad-3f0f1aa72f7b")
        private static Stereotype MDAASSOCDEP;

        @objid ("0126d875-fd8e-4d12-a421-5c2da5bcb001")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7bf623ee-462d-4bdf-ab6f-f3fc0ba5836f")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "283533e7-c53c-4104-a644-9d71d040726f", "RelationshipOperationType");
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

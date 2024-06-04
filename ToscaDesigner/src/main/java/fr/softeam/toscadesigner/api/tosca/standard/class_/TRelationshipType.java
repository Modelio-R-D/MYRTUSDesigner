/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRelationshipType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("68169ae9-570b-4bd2-9cd8-e946110381b2")
public class TRelationshipType implements IMdaProxy {
    @objid ("52668f77-6581-495f-bc81-0c78592393b7")
    public static final String STEREOTYPE_NAME = "TRelationshipType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("3963c08d-1c6d-45f0-8983-cd9b526e238e")
    protected final Class elt;

    /**
     * Tells whether a {@link TRelationshipType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRelationshipType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d30448a3-8fdf-4d9e-84db-75b4fcb61234")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRelationshipType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRelationshipType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRelationshipType >> then instantiate a {@link TRelationshipType} proxy.
     * 
     * @return a {@link TRelationshipType} proxy on the created {@link Class}.
     */
    @objid ("944dc22c-3203-4a21-810e-a6d48737ad31")
    public static TRelationshipType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRelationshipType.MdaTypes.STEREOTYPE_ELT);
        return TRelationshipType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRelationshipType} proxy from a {@link Class} stereotyped << TRelationshipType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRelationshipType} proxy or <i>null</i>.
     */
    @objid ("2396b611-3c99-4a6b-bf57-850e9c915f8b")
    public static TRelationshipType instantiate(final Class obj) {
        return TRelationshipType.canInstantiate(obj) ? new TRelationshipType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipType} proxy from a {@link Class} stereotyped << TRelationshipType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRelationshipType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f1bf9963-7e9b-4277-9dc3-17b8e61664d3")
    public static TRelationshipType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRelationshipType.canInstantiate(obj))
        	return new TRelationshipType(obj);
        else
        	throw new IllegalArgumentException("TRelationshipType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("efbfc731-d1e9-4d93-8f91-fb4d9f1a587f")
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
        TRelationshipType other = (TRelationshipType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("3848157b-6908-4d15-b20f-5910253f9b43")
    public Class getElement() {
        return this.elt;
    }

    @objid ("0d0980cd-1775-4c37-8066-1b472b2d5369")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("f7f740d8-24bc-4106-85fe-21c8c102069e")
    protected  TRelationshipType(final Class elt) {
        this.elt = elt;
    }

    @objid ("09d12a81-ee70-43ac-b0e2-976fa052dc8a")
    public static final class MdaTypes {
        @objid ("76800730-d67f-4c50-a0dd-0f6fa7d5acd8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("efdaad09-2555-47f8-a502-08f2377f2652")
        private static Stereotype MDAASSOCDEP;

        @objid ("a493b714-3243-4e91-9e7b-70e231d5c6bd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("faeb36a6-fd9e-4a66-bfbd-daa327cdba04")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1b11c098-c9e5-4e5d-beca-3351909bc6ce", "TRelationshipType");
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

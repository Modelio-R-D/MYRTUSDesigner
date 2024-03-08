/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 08/03/2024 09:55 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRelationshipTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a2355551-417e-4b9a-b842-5a3a0d94362e")
public class TRelationshipTemplate implements IMdaProxy {
    @objid ("c66834ce-65a8-4262-8477-0d0f2c1de89d")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplate";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("7e5f3942-c452-4644-a9a3-c78954421554")
    protected final Class elt;

    /**
     * Tells whether a {@link TRelationshipTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRelationshipTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("614dd365-e844-4bc7-92fb-fcc7ac04890b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRelationshipTemplate >> then instantiate a {@link TRelationshipTemplate} proxy.
     * 
     * @return a {@link TRelationshipTemplate} proxy on the created {@link Class}.
     */
    @objid ("f7b592ad-50eb-4fe2-9f60-15ff23aec187")
    public static TRelationshipTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT);
        return TRelationshipTemplate.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplate} proxy from a {@link Class} stereotyped << TRelationshipTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRelationshipTemplate} proxy or <i>null</i>.
     */
    @objid ("cac9c434-81f8-45c7-8ca7-0787def4d790")
    public static TRelationshipTemplate instantiate(final Class obj) {
        return TRelationshipTemplate.canInstantiate(obj) ? new TRelationshipTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplate} proxy from a {@link Class} stereotyped << TRelationshipTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRelationshipTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("93892c9d-59d9-4711-b618-315afa0b26ed")
    public static TRelationshipTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRelationshipTemplate.canInstantiate(obj))
        	return new TRelationshipTemplate(obj);
        else
        	throw new IllegalArgumentException("TRelationshipTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("94e92c5d-bacd-473f-bad4-e7ce9dabc892")
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
        TRelationshipTemplate other = (TRelationshipTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("bd504be1-4711-458f-8ffb-2ca16236f8ab")
    public Class getElement() {
        return this.elt;
    }

    @objid ("32caa28e-a297-4989-9d2a-250df33eca17")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("c7cc6a77-1be5-407d-96ef-1087df89c8bf")
    protected  TRelationshipTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("d6cdbf9d-3bee-45cf-b04e-4a31f668d827")
    public static final class MdaTypes {
        @objid ("6d1daeca-c2f8-4fc7-ad6d-9e3cc8758646")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4785c01e-0854-49b6-8037-d938f87febb4")
        private static Stereotype MDAASSOCDEP;

        @objid ("edf429b1-10a4-4243-80e3-365d123184a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6b0df83d-5200-412e-94bc-abe5973bb9b3")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7f01001b-511e-4017-b6b4-729f68c85911", "TRelationshipTemplate");
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

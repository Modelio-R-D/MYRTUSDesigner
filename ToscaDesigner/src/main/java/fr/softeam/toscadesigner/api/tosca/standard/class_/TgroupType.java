/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 24/09/2024 16:22 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TgroupType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("39f193a1-127c-495d-be75-44587d7d007d")
public class TgroupType implements IMdaProxy {
    @objid ("2f2b622a-28f1-4228-b5a5-a3825cd40f7c")
    public static final String STEREOTYPE_NAME = "TgroupType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("3330a171-23cc-4220-b69c-51c591fa36d7")
    protected final Class elt;

    /**
     * Tells whether a {@link TgroupType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TgroupType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bed049bc-58d9-4d0a-a341-170c0d1d4ae2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TgroupType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TgroupType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TgroupType >> then instantiate a {@link TgroupType} proxy.
     * 
     * @return a {@link TgroupType} proxy on the created {@link Class}.
     */
    @objid ("208334ad-5370-4451-b096-203c9ab387fa")
    public static TgroupType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TgroupType.MdaTypes.STEREOTYPE_ELT);
        return TgroupType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TgroupType} proxy from a {@link Class} stereotyped << TgroupType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TgroupType} proxy or <i>null</i>.
     */
    @objid ("83a84e6c-954e-494b-8dec-d2bed3beff50")
    public static TgroupType instantiate(final Class obj) {
        return TgroupType.canInstantiate(obj) ? new TgroupType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TgroupType} proxy from a {@link Class} stereotyped << TgroupType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TgroupType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9f210d85-86d3-49e3-9209-ba75e509975f")
    public static TgroupType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TgroupType.canInstantiate(obj))
        	return new TgroupType(obj);
        else
        	throw new IllegalArgumentException("TgroupType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5347097c-f852-4382-8917-22e2aa7cc40b")
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
        TgroupType other = (TgroupType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("9797029f-8de3-47e8-8464-f5ba181ececb")
    public Class getElement() {
        return this.elt;
    }

    @objid ("b32b30ad-ae6d-4def-a9b7-a02f5e69990e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("e3364f41-36cd-4b1e-8c29-3f2dc2fd7078")
    protected  TgroupType(final Class elt) {
        this.elt = elt;
    }

    @objid ("95f59d83-2128-4004-9924-10b684ba49ab")
    public static final class MdaTypes {
        @objid ("415e2b5a-1cef-423b-93cf-79aa5852a43a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bed1ad40-ac72-4b50-a1c1-ae9ab724a3f6")
        private static Stereotype MDAASSOCDEP;

        @objid ("b6499ed2-c264-4cad-9dce-198944d58e2b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d8d40530-6b7f-49bd-b61a-b431ab095837")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "94a5619a-6aed-4b34-a0d8-03e85419ad55", "TgroupType");
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

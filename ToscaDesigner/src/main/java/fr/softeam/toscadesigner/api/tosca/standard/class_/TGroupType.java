/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TGroupType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3260555d-a059-445b-8e28-f0b93ba18e42")
public class TGroupType extends TEntityType implements IMdaProxy {
    @objid ("a119eaac-b3ee-4ffc-805d-834803971d5d")
    public static final String STEREOTYPE_NAME = "TGroupType";

    /**
     * Tells whether a {@link TGroupType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TGroupType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("56431e6a-7885-4558-845d-90af889c47e0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TGroupType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TGroupType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TGroupType >> then instantiate a {@link TGroupType} proxy.
     * 
     * @return a {@link TGroupType} proxy on the created {@link Class}.
     */
    @objid ("243572a0-95e3-46cb-bc81-147197b5404c")
    public static TGroupType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TGroupType.MdaTypes.STEREOTYPE_ELT);
        return TGroupType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TGroupType} proxy from a {@link Class} stereotyped << TGroupType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TGroupType} proxy or <i>null</i>.
     */
    @objid ("85913f92-3bf7-465e-bcc6-5de5858aaca5")
    public static TGroupType instantiate(final Class obj) {
        return TGroupType.canInstantiate(obj) ? new TGroupType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TGroupType} proxy from a {@link Class} stereotyped << TGroupType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TGroupType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("da4229aa-d264-47f6-a9ba-65dba625e7ea")
    public static TGroupType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TGroupType.canInstantiate(obj))
        	return new TGroupType(obj);
        else
        	throw new IllegalArgumentException("TGroupType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fb479ef1-eef9-42e9-8604-d2935bb182a2")
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
        TGroupType other = (TGroupType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f88708e8-56bc-420d-a341-6860102e9562")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("f594e351-bce4-47e8-9200-1f01734b3d1d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("d6a39bbf-a534-493f-88b0-70ba7aac1ce0")
    protected  TGroupType(final Class elt) {
        super(elt);
    }

    @objid ("a65ab7d8-037e-46bd-b324-5bff6265ee04")
    public static final class MdaTypes {
        @objid ("404e0a86-60dd-4c45-9412-3005531e4b29")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e4cc9658-2f3e-4782-b5eb-da6bab8a17c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("9f0fb359-df44-45b9-b638-1609289b9779")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3fda2a97-d9fc-441f-aaee-5b295070fc70")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "94a5619a-6aed-4b34-a0d8-03e85419ad55", "TGroupType");
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

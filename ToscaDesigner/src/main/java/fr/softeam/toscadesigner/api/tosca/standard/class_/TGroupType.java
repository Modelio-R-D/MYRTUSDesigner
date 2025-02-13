/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 06/02/2025 17:32 by Modelio Studio.
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
@objid ("f4c28396-7fb6-4bf9-b700-b5cf93f47ac7")
public class TGroupType extends TEntityType implements IMdaProxy {
    @objid ("cb7c9706-18a3-471f-8173-655dfb06b2ad")
    public static final String STEREOTYPE_NAME = "TGroupType";

    /**
     * Tells whether a {@link TGroupType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TGroupType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("306490f5-969b-45c8-8930-e37230965336")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TGroupType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TGroupType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TGroupType >> then instantiate a {@link TGroupType} proxy.
     * @return a {@link TGroupType} proxy on the created {@link Class}.
     */
    @objid ("c42b1223-59e1-45a6-8134-e6be85bf335f")
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
    @objid ("479aa875-8e1f-416e-87b4-7ab84abaac6c")
    public static TGroupType instantiate(final Class obj) {
        return TGroupType.canInstantiate(obj) ? new TGroupType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TGroupType} proxy from a {@link Class} stereotyped << TGroupType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TGroupType} proxy.
     */
    @objid ("e638d29c-c412-4128-a470-130de24ae404")
    public static TGroupType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TGroupType.canInstantiate(obj))
            return new TGroupType(obj);
        else
            throw new IllegalArgumentException("TGroupType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("874bd414-5c04-4716-835a-abaa47d47aad")
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
    @objid ("fc58ba14-c5be-4dac-aa58-4138f13af8c4")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("39ade173-e0b5-41c1-af8e-5e4ab32dd371")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9699ccba-fd6f-45b4-a04e-d3c3da48b5b4")
    protected  TGroupType(final Class elt) {
        super(elt);
    }

    @objid ("7fbe8214-a9a0-4d42-ac39-23bfb75abbc4")
    public static final class MdaTypes {
        @objid ("c6fc7806-8c49-4582-ae6f-255dbe88acf3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("59ecd504-ad63-47ca-8721-8056a25e3d4e")
        private static Stereotype MDAASSOCDEP;

        @objid ("2efefab8-c062-4d66-8327-384e50e4c385")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("44e4e626-34da-41b4-b6bd-2e68dcef6a14")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 01/03/2024 11:13 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << CapabilityDefinitionsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f4a4e084-f5f6-4188-b87d-f58fedb0ef03")
public class CapabilityDefinitionsType implements IMdaProxy {
    @objid ("34c9a7ad-76bb-43f6-8a61-df0a9ff767b5")
    public static final String STEREOTYPE_NAME = "CapabilityDefinitionsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("a80cdcd5-7efa-4242-be0a-d716045ec406")
    protected final Class elt;

    /**
     * Tells whether a {@link CapabilityDefinitionsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CapabilityDefinitionsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4436b58c-869f-40cc-802c-1bd8f1b57112")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (CapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(CapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << CapabilityDefinitionsType >> then instantiate a {@link CapabilityDefinitionsType} proxy.
     * 
     * @return a {@link CapabilityDefinitionsType} proxy on the created {@link Class}.
     */
    @objid ("bf4db79f-7a12-4751-b65c-cf9e9e54e841")
    public static CapabilityDefinitionsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(CapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT);
        return CapabilityDefinitionsType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CapabilityDefinitionsType} proxy from a {@link Class} stereotyped << CapabilityDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CapabilityDefinitionsType} proxy or <i>null</i>.
     */
    @objid ("19223f7d-bbd2-4f2b-98a3-88dabe044520")
    public static CapabilityDefinitionsType instantiate(final Class obj) {
        return CapabilityDefinitionsType.canInstantiate(obj) ? new CapabilityDefinitionsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CapabilityDefinitionsType} proxy from a {@link Class} stereotyped << CapabilityDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CapabilityDefinitionsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9f77706f-dbe1-4451-b00d-8e5c2900d73f")
    public static CapabilityDefinitionsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CapabilityDefinitionsType.canInstantiate(obj))
        	return new CapabilityDefinitionsType(obj);
        else
        	throw new IllegalArgumentException("CapabilityDefinitionsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("71787864-30b5-46c6-9371-c4dade745995")
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
        CapabilityDefinitionsType other = (CapabilityDefinitionsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("291ebefd-6db8-4917-8633-56ed787623c3")
    public Class getElement() {
        return this.elt;
    }

    @objid ("0607ceab-025e-4225-a559-9cc836efcf5e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("de4f2c3a-af7e-4ff6-a92c-5cbaf8e97b59")
    protected  CapabilityDefinitionsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("d180b65a-9491-446a-92c8-8d7a32a4640d")
    public static final class MdaTypes {
        @objid ("d3d94ddc-1b8f-42f3-a818-1e9e461d234a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e868e25c-2bd2-4b62-b070-fd1123425964")
        private static Stereotype MDAASSOCDEP;

        @objid ("9d3a474c-5942-413a-92d1-06622f0c3bf9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("503a9055-3743-4c21-8cfb-cf43c26dfc30")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "ac0418b1-a726-46e6-ac59-310f0055050f", "CapabilityDefinitionsType");
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

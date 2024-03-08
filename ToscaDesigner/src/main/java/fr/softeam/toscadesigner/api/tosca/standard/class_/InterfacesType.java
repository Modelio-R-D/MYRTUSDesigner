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
 * Proxy class to handle a {@link Class} with << InterfacesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e1ec5352-a78e-4a35-919a-fdf3a09eb4eb")
public class InterfacesType implements IMdaProxy {
    @objid ("24868405-a7c5-4146-b91e-e53d36518a9a")
    public static final String STEREOTYPE_NAME = "InterfacesType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("73d70f9f-f473-440d-884e-1b873b1aec3e")
    protected final Class elt;

    /**
     * Tells whether a {@link InterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << InterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4ea6b921-ec4f-47b5-b57b-63237635bce5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (InterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(InterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << InterfacesType >> then instantiate a {@link InterfacesType} proxy.
     * 
     * @return a {@link InterfacesType} proxy on the created {@link Class}.
     */
    @objid ("35b09009-5e0d-41f0-b8f1-1e7452e8e530")
    public static InterfacesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(InterfacesType.MdaTypes.STEREOTYPE_ELT);
        return InterfacesType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link InterfacesType} proxy from a {@link Class} stereotyped << InterfacesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link InterfacesType} proxy or <i>null</i>.
     */
    @objid ("7fec020c-eeb7-40f0-9c23-d979985722e5")
    public static InterfacesType instantiate(final Class obj) {
        return InterfacesType.canInstantiate(obj) ? new InterfacesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterfacesType} proxy from a {@link Class} stereotyped << InterfacesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link InterfacesType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1e9c62bb-65c2-43cf-8516-031b754a0963")
    public static InterfacesType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (InterfacesType.canInstantiate(obj))
        	return new InterfacesType(obj);
        else
        	throw new IllegalArgumentException("InterfacesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("117239de-89c0-44ea-bd40-510e71024648")
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
        InterfacesType other = (InterfacesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("02f971b7-c1ee-440d-94f6-32e68906ac85")
    public Class getElement() {
        return this.elt;
    }

    @objid ("9eec3013-fbc4-47af-b9a2-c6d51e51f5e0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("5e0995cc-247b-4065-a1c3-65715619cf42")
    protected  InterfacesType(final Class elt) {
        this.elt = elt;
    }

    @objid ("4309b581-0dd9-4e5c-a770-380b5c620f46")
    public static final class MdaTypes {
        @objid ("ab0ab575-55ff-4537-9d56-da112e088044")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("21e60025-2fe1-4f0d-a509-5ac6e96becc8")
        private static Stereotype MDAASSOCDEP;

        @objid ("47608a93-3a14-4200-b6d9-c1083bcf984a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c1d4525-368a-48d1-bc72-7aa64c8cd7c9")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "52b9c42d-29c2-4a9c-a9af-c3d178e32339", "InterfacesType");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 15:42 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TCapabilityType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("df4c6a7d-ab07-4d7f-807d-a2220e3ed9c9")
public class TCapabilityType extends CapabilityStereotype implements IMdaProxy {
    @objid ("a8a94bda-2688-45dd-bde6-f1ab98922bcc")
    public static final String STEREOTYPE_NAME = "TCapabilityType";

    /**
     * Tells whether a {@link TCapabilityType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d0c6400c-eb15-475b-b8cd-f35cc4d9e221")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityType >> then instantiate a {@link TCapabilityType} proxy.
     * 
     * @return a {@link TCapabilityType} proxy on the created {@link Class}.
     */
    @objid ("dfbe181e-e099-4ee3-880f-a3eddd553cca")
    public static TCapabilityType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TCapabilityType.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityType} proxy from a {@link Class} stereotyped << TCapabilityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TCapabilityType} proxy or <i>null</i>.
     */
    @objid ("0ff083ef-88be-49b4-870d-26a757cf9bff")
    public static TCapabilityType instantiate(final Class obj) {
        return TCapabilityType.canInstantiate(obj) ? new TCapabilityType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityType} proxy from a {@link Class} stereotyped << TCapabilityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapabilityType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("03e40956-1372-40e4-adfd-bbf076a5538c")
    public static TCapabilityType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityType.canInstantiate(obj))
        	return new TCapabilityType(obj);
        else
        	throw new IllegalArgumentException("TCapabilityType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e2dbae58-ff57-42cd-b05f-39f5da34a25b")
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
        TCapabilityType other = (TCapabilityType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("dc09b6a5-cbf5-4051-b912-c928ab6432e6")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("12cdb42d-d5a0-47eb-809b-f98d13a316e5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("58b29707-854e-4985-a048-00e7c55bc434")
    protected  TCapabilityType(final Class elt) {
        super(elt);
    }

    @objid ("4f23151a-ea23-49ca-9cf0-d94cb227254e")
    public static final class MdaTypes {
        @objid ("b8df5964-af22-4528-8fe6-66b23e873f58")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6cdfbfb2-0e56-46ab-b31e-26092a6fa25a")
        private static Stereotype MDAASSOCDEP;

        @objid ("34689b19-f114-4476-8e5c-3a6b190304a6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b3d57ab9-aea7-4372-be01-d81b4f7c5d21")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "42438c96-0721-406a-a8b9-c4a85931cc60", "TCapabilityType");
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

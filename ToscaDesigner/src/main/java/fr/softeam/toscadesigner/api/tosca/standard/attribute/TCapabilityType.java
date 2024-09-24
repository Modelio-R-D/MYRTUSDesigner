/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 24/09/2024 16:22 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Attribute} with << TCapabilityType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("df4c6a7d-ab07-4d7f-807d-a2220e3ed9c9")
public class TCapabilityType implements IMdaProxy {
    @objid ("2d6a676b-504a-4e35-83d6-22c92733cc24")
    public static final String STEREOTYPE_NAME = "TCapabilityType";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("87b4aed6-b6bf-4e41-990e-c99683c28037")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TCapabilityType proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TCapabilityType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e8b8503c-4d7e-4873-bfec-533ec5cedfe9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TCapabilityType.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TCapabilityType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TCapabilityType >> then instantiate a {@link TCapabilityType} proxy.
     * 
     * @return a {@link TCapabilityType} proxy on the created {@link Attribute}.
     */
    @objid ("9fc452a6-8c8f-453a-bc6f-808615d6506e")
    public static TCapabilityType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(TCapabilityType.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityType.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityType} proxy from a {@link Attribute} stereotyped << TCapabilityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link TCapabilityType} proxy or <i>null</i>.
     */
    @objid ("2a62505f-19b6-4249-8e19-c045740bb98e")
    public static TCapabilityType instantiate(final Attribute obj) {
        return TCapabilityType.canInstantiate(obj) ? new TCapabilityType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityType} proxy from a {@link Attribute} stereotyped << TCapabilityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TCapabilityType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fb774971-2f5c-4e28-9ec6-13f0e6faddb4")
    public static TCapabilityType safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TCapabilityType.canInstantiate(obj))
        	return new TCapabilityType(obj);
        else
        	throw new IllegalArgumentException("TCapabilityType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6928e5cf-53fc-44fc-86e9-908550f2cd4f")
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
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("b26cfa0f-9838-4389-b39a-2813a1dc0934")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("8de3ef4c-1640-4b49-a53e-eca67a5efb7b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("0f54e683-f8b9-47f2-a4d4-52b456e077d7")
    protected  TCapabilityType(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("4f23151a-ea23-49ca-9cf0-d94cb227254e")
    public static final class MdaTypes {
        @objid ("a61c94ea-f9d1-4fc4-abd3-09b144b21978")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a3b53b5b-e0ab-46a5-96f4-e26c8efe0d05")
        private static Stereotype MDAASSOCDEP;

        @objid ("88aaebcf-7e3f-4699-988c-4c9247ef2197")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ecac99e0-3897-4be3-9c44-69ca6f8c76c7")
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

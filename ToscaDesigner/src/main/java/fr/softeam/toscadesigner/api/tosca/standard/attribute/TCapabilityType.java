/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 23/09/2024 12:50 by Modelio Studio.
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
    @objid ("c065749a-b79f-47df-8b01-3f391222cd75")
    public static final String STEREOTYPE_NAME = "TCapabilityType";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("421c120f-1360-4f8c-bb48-951d2ede8666")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TCapabilityType proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TCapabilityType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6b76a22d-c6a2-4a81-9225-4f27294a5c1e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TCapabilityType.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TCapabilityType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TCapabilityType >> then instantiate a {@link TCapabilityType} proxy.
     * 
     * @return a {@link TCapabilityType} proxy on the created {@link Attribute}.
     */
    @objid ("7819b76a-2b6f-4a2c-9ec4-f722b6a40605")
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
    @objid ("451fa39d-8f67-4b1b-8fd7-f0bcd3c39288")
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
    @objid ("0f66e356-cd3b-4592-ad57-b4d1991cab23")
    public static TCapabilityType safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TCapabilityType.canInstantiate(obj))
        	return new TCapabilityType(obj);
        else
        	throw new IllegalArgumentException("TCapabilityType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("da1926ef-fcc9-40d4-aa20-3f43075ee2fd")
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
    @objid ("a3f0f0f5-c966-45e2-abfd-2f1680411538")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("e41d583f-f521-44e7-bed8-b63eb3f1ddbc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("9d522a1c-a113-42d3-8651-8e94f47ddded")
    protected  TCapabilityType(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("4f23151a-ea23-49ca-9cf0-d94cb227254e")
    public static final class MdaTypes {
        @objid ("0ffcc8e9-42f5-4f49-99ae-a7fccbd7b6dc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("30a42eac-0e74-4a84-bbfe-e950d2ec2bc2")
        private static Stereotype MDAASSOCDEP;

        @objid ("a241d585-ade6-4819-bc65-a8448db3129d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d373e48c-d290-42da-812a-fc142492cb37")
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

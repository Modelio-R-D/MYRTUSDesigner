/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
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
    @objid ("5f225a40-f3a2-443a-8c12-edf97f3014e2")
    public static final String STEREOTYPE_NAME = "TCapabilityType";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     * 
     */
    @objid ("9c2a3933-8be3-478e-8d34-c904ba38ad65")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TCapabilityType proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TCapabilityType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a1edeb60-dea7-4be3-9531-4fb3f6a1afbd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TCapabilityType.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TCapabilityType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TCapabilityType >> then instantiate a {@link TCapabilityType} proxy.
     * @return a {@link TCapabilityType} proxy on the created {@link Attribute}.
     */
    @objid ("85d5e6ba-f8a3-4cf8-9527-d1aa4ffaeb40")
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
    @objid ("82b9a551-9d74-4e3a-91cd-59564ef21bf0")
    public static TCapabilityType instantiate(final Attribute obj) {
        return TCapabilityType.canInstantiate(obj) ? new TCapabilityType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityType} proxy from a {@link Attribute} stereotyped << TCapabilityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TCapabilityType} proxy.
     */
    @objid ("d8d1016d-ca85-4029-84a8-181d814932f7")
    public static TCapabilityType safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TCapabilityType.canInstantiate(obj))
            return new TCapabilityType(obj);
        else
            throw new IllegalArgumentException("TCapabilityType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dfd81946-3435-4370-befc-e6e55afa9291")
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
    @objid ("85ed6496-72cc-42f6-b3a4-8d0b8f4dd4f5")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("d39bfeb9-31d9-43d0-978d-367f8db516a0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("40d37e78-1b8f-44ac-bf67-d657c5fadc8e")
    protected  TCapabilityType(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("4f23151a-ea23-49ca-9cf0-d94cb227254e")
    public static final class MdaTypes {
        @objid ("b03ee957-419f-4642-93af-5c5c59d9b8b9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a035689f-ca03-4dad-9d38-42377fa7c923")
        private static Stereotype MDAASSOCDEP;

        @objid ("37e66afd-186d-4d01-9dda-11f50a2fa36a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("da1424c9-fd98-4abb-877c-999b42302d72")
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

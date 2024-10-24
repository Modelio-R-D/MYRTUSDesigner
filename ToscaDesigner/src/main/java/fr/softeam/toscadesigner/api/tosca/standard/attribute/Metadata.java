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
 * Proxy class to handle a {@link Attribute} with << Metadata >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ee7ae353-0ed0-48f4-a226-0edc7f0e36e9")
public class Metadata implements IMdaProxy {
    @objid ("7e65be48-2406-47ee-a4b6-4bed714b29e6")
    public static final String STEREOTYPE_NAME = "Metadata";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     * 
     */
    @objid ("050aa560-bd32-44cb-b71c-9dfb04cd7a17")
    protected final Attribute elt;

    /**
     * Tells whether a {@link Metadata proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Metadata >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("15b760d2-78eb-44d5-9f8a-2ffaf6e01686")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (Metadata.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(Metadata.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Metadata >> then instantiate a {@link Metadata} proxy.
     * @return a {@link Metadata} proxy on the created {@link Attribute}.
     */
    @objid ("c574ff95-a0f9-4a5d-9ae9-ef8dee4ecbb1")
    public static Metadata create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(Metadata.MdaTypes.STEREOTYPE_ELT);
        return Metadata.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link Metadata} proxy from a {@link Attribute} stereotyped << Metadata >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link Metadata} proxy or <i>null</i>.
     */
    @objid ("76c782bc-829d-44a1-bca0-2c1af27e69d6")
    public static Metadata instantiate(final Attribute obj) {
        return Metadata.canInstantiate(obj) ? new Metadata(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Metadata} proxy from a {@link Attribute} stereotyped << Metadata >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link Metadata} proxy.
     */
    @objid ("3c218df5-fc4b-40a5-8f89-7af8e7d7eca0")
    public static Metadata safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (Metadata.canInstantiate(obj))
            return new Metadata(obj);
        else
            throw new IllegalArgumentException("Metadata: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("62503800-d465-44b3-999b-98eb9480ed26")
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
        Metadata other = (Metadata) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}.
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("72332474-bd2c-43dd-8a07-9eacc798274a")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("063705c3-90e3-4077-9927-1ad0b8f27595")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f2fa9c0a-34e0-4797-bc0e-a81d077b48ec")
    protected  Metadata(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("23d5a82c-0450-4160-8dd4-3c52dc587c05")
    public static final class MdaTypes {
        @objid ("e5fee372-0c03-4a39-9616-2a9ca9da2d0e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4dbb0845-5e17-43f7-86ed-608d4e738c63")
        private static Stereotype MDAASSOCDEP;

        @objid ("12973da3-159f-4aa5-94f6-dea9c7c92d46")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("73cdef3f-6245-4abd-820e-65be59c9d408")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "d0b4eda0-d876-4c48-8bc7-604458678120", "Metadata");
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

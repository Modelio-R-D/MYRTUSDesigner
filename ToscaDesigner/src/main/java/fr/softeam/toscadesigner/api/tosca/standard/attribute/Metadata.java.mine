/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 06/02/2025 17:32 by Modelio Studio.
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
@objid ("670c462a-4c17-4e77-84a1-0873b8a5c837")
public class Metadata implements IMdaProxy {
    @objid ("e09902e5-8f82-495f-897c-f1ed2f4c5870")
    public static final String STEREOTYPE_NAME = "Metadata";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     * 
     */
    @objid ("d9c170fb-856b-4b98-9049-d6fb85be6c7f")
    protected final Attribute elt;

    /**
     * Tells whether a {@link Metadata proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Metadata >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c63b1d33-e92a-482b-ae26-396f64f1834c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (Metadata.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(Metadata.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Metadata >> then instantiate a {@link Metadata} proxy.
     * @return a {@link Metadata} proxy on the created {@link Attribute}.
     */
    @objid ("677c3877-7db6-4aa9-8848-3c04139a530d")
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
    @objid ("7d0c23ab-318b-415a-bc3c-4670a50b823a")
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
    @objid ("36499f64-efed-4862-a154-ce55a811aff6")
    public static Metadata safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (Metadata.canInstantiate(obj))
            return new Metadata(obj);
        else
            throw new IllegalArgumentException("Metadata: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("be2178fa-7fc6-46f4-80f1-ffad5d69fc4a")
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
    @objid ("cde96cb5-d969-4a30-94e6-7a8a6e25e5c7")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("9825074a-306a-481c-8e0e-f63393637f51")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("bc21929c-60c5-4733-8e4d-87d53e52d8e6")
    protected  Metadata(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("2e5e201d-0f55-4604-ba6a-715dd2260df7")
    public static final class MdaTypes {
        @objid ("caa6f4e7-5185-4c71-a54e-25e3b80285a2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2195bc26-5a5d-4590-bc0f-ab779ba36479")
        private static Stereotype MDAASSOCDEP;

        @objid ("b112a2c8-1b0b-4937-a184-51d6a88b2ca6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a7768775-258f-4e4c-a428-688e3285d941")
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

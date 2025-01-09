/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 16:04 by Modelio Studio.
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
    @objid ("8fc7d891-243c-4754-94b0-0053bfad7a0c")
    public static final String STEREOTYPE_NAME = "Metadata";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("40258cfe-4916-4086-b1ae-061d54c71aba")
    protected final Attribute elt;

    /**
     * Tells whether a {@link Metadata proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Metadata >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("973d965d-8532-43ef-9963-0473846a4793")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (Metadata.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(Metadata.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Metadata >> then instantiate a {@link Metadata} proxy.
     * 
     * @return a {@link Metadata} proxy on the created {@link Attribute}.
     */
    @objid ("56d86d74-1fca-4b4d-8199-d2dbb861f0ac")
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
    @objid ("96e8e34a-5b79-4ce2-a884-98c6244e8532")
    public static Metadata instantiate(final Attribute obj) {
        return Metadata.canInstantiate(obj) ? new Metadata(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Metadata} proxy from a {@link Attribute} stereotyped << Metadata >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link Metadata} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2347cb14-3ffd-45e1-aa6b-649fc887e424")
    public static Metadata safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (Metadata.canInstantiate(obj))
        	return new Metadata(obj);
        else
        	throw new IllegalArgumentException("Metadata: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("75aa6bcd-dc13-41e6-a345-1d76fdfc99ef")
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
    @objid ("a3e2eaad-ea64-4615-bd00-0f52e4af6114")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("e6b249cc-ed44-4698-a7f8-d5d445e29d5c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("c16e3653-0e2f-46c0-a6ea-a35596b3b0ed")
    protected  Metadata(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("23d5a82c-0450-4160-8dd4-3c52dc587c05")
    public static final class MdaTypes {
        @objid ("7e556137-acdb-4d66-969e-f1d9d9c78931")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("32e22c00-41e4-44d7-8ad5-06448f06f100")
        private static Stereotype MDAASSOCDEP;

        @objid ("e2c016b5-93da-43c1-9879-2122e1d9321c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b08e6ac4-188f-4a39-a297-0893460acda1")
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

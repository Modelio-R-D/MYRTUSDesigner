/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 11:56 by Modelio Studio.
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
    @objid ("79d778fb-ebc5-4fa7-b076-9b042b8409b0")
    public static final String STEREOTYPE_NAME = "Metadata";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("555a077d-2af1-4f3c-a737-9ba7edbaf8a6")
    protected final Attribute elt;

    /**
     * Tells whether a {@link Metadata proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << Metadata >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2afb06a1-2551-4230-b22f-57322900202f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (Metadata.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(Metadata.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << Metadata >> then instantiate a {@link Metadata} proxy.
     * 
     * @return a {@link Metadata} proxy on the created {@link Attribute}.
     */
    @objid ("1c8a180d-77bd-4ab6-96bd-65025bbb8e3e")
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
    @objid ("f129280e-790c-463f-adf2-f3e38a886d90")
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
    @objid ("eaf03db4-7ecf-4f00-af69-117f4a72677d")
    public static Metadata safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (Metadata.canInstantiate(obj))
        	return new Metadata(obj);
        else
        	throw new IllegalArgumentException("Metadata: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e01ece42-d671-43cf-95aa-ef680a7b9c37")
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
    @objid ("05c19e97-4096-4595-846d-0f3d538f41fb")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("1baa0695-748f-428d-aca4-e2f0c73474a3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("8457eba2-a75a-4524-9e63-779cff422de5")
    protected  Metadata(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("23d5a82c-0450-4160-8dd4-3c52dc587c05")
    public static final class MdaTypes {
        @objid ("3371a14e-3da6-4abe-b3ab-c63b5e07084e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("74aaab84-4a04-442f-85dd-3b3d247bfeb1")
        private static Stereotype MDAASSOCDEP;

        @objid ("333e520c-5314-421a-b819-2c972edcae55")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6ed71652-f823-46e3-ad96-c5f878a085d5")
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

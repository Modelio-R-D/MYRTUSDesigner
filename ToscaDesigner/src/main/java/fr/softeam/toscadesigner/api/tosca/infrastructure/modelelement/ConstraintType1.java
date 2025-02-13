/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 13/02/2025 17:54 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << ConstraintType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("01346bfe-00f6-4720-ad11-babe8a4a7128")
public class ConstraintType1 implements IMdaProxy {
    @objid ("7ab03674-1f4c-47ae-ad94-d3d94b6d4216")
    public static final String STEREOTYPE_NAME = "ConstraintType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("78cd11be-5e05-4e18-b11b-90db3281b7da")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ConstraintType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ConstraintType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("78e5269b-c8a2-43ca-b03d-9515a5078838")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ConstraintType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ConstraintType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ConstraintType1 >> then instantiate a {@link ConstraintType1} proxy.
     * 
     * @return a {@link ConstraintType1} proxy on the created {@link ModelElement}.
     */
    @objid ("bf9f8f12-be41-4d0a-9e34-8ee9407631ef")
    public static ConstraintType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(ConstraintType1.MdaTypes.STEREOTYPE_ELT);
        return ConstraintType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ConstraintType1} proxy from a {@link ModelElement} stereotyped << ConstraintType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ConstraintType1} proxy or <i>null</i>.
     */
    @objid ("53523064-4ed0-418c-9eb0-fc10fa87d3d2")
    public static ConstraintType1 instantiate(final ModelElement obj) {
        return ConstraintType1.canInstantiate(obj) ? new ConstraintType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConstraintType1} proxy from a {@link ModelElement} stereotyped << ConstraintType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ConstraintType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8e4fe85b-005b-4ef3-a99d-3503a61ca561")
    public static ConstraintType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ConstraintType1.canInstantiate(obj))
        	return new ConstraintType1(obj);
        else
        	throw new IllegalArgumentException("ConstraintType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a9bd30ab-27d7-4348-9409-10f0b6f67d37")
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
        ConstraintType1 other = (ConstraintType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("715477aa-56cc-4016-b04e-d79f7a8bf558")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("4f64d5dc-b34f-4cb0-96e0-3ae4ff592065")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("25b86f8b-8b0a-49e1-9b20-80aa3680ddc4")
    protected  ConstraintType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1400f529-92d2-4af1-99f1-2b58ade9ba04")
    public static final class MdaTypes {
        @objid ("11887489-1a78-438f-b76b-60f80b475182")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("db1b87c1-923e-4037-95db-3766e4f989ca")
        private static Stereotype MDAASSOCDEP;

        @objid ("61431c03-bdd2-4e13-99d5-1069879fd147")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0e5fd92c-6cf0-42a4-8215-73e162ce25c9")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "167e6d59-234e-44f0-b3b9-f845efc8ec75", "ConstraintType1");
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

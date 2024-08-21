/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 11:15 by Modelio Studio.
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
@objid ("e6be320a-e47e-454e-bd9f-70d0d5b87a7b")
public class ConstraintType1 implements IMdaProxy {
    @objid ("c372c74d-6ca8-45f0-b95a-07b855cd6b0d")
    public static final String STEREOTYPE_NAME = "ConstraintType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("1b7d49b5-54bd-4036-9ee9-64e346c3e257")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ConstraintType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ConstraintType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1e24f525-ab28-4a7e-899a-c7fe118b22f0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ConstraintType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ConstraintType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ConstraintType1 >> then instantiate a {@link ConstraintType1} proxy.
     * 
     * @return a {@link ConstraintType1} proxy on the created {@link ModelElement}.
     */
    @objid ("cb420132-6238-4d45-94ce-125f3e68ea4f")
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
    @objid ("9338807d-b47d-4ea8-b31c-efb4a2b5d67d")
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
    @objid ("d951f2e1-4769-4486-895b-597947a28d9e")
    public static ConstraintType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ConstraintType1.canInstantiate(obj))
        	return new ConstraintType1(obj);
        else
        	throw new IllegalArgumentException("ConstraintType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ff271ea4-5378-442e-a64f-b8e1ded15e80")
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
    @objid ("4be77ce2-7964-439f-904b-704028691070")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("cfb5d989-6e9d-4613-b607-0384ff4dcccb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("bae3d0fb-3c40-4021-9f2d-cd9f9d940110")
    protected  ConstraintType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("0d57c2b9-e5cf-402d-9d64-9e015a784c81")
    public static final class MdaTypes {
        @objid ("7e760b3a-bc91-4080-a4ff-2444a21c7ea0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b1160172-38d6-4bc5-ad28-6941f863e9a9")
        private static Stereotype MDAASSOCDEP;

        @objid ("022ffccd-fb32-40f6-a45f-9c4fbd479b89")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d1d346c-7419-4935-84f8-60f13f22b7e5")
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

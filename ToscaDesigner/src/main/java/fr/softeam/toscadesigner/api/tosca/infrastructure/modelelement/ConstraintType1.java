/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 17:58 by Modelio Studio.
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
@objid ("4a0f52fe-ee1e-4b20-aa28-39906a751486")
public class ConstraintType1 implements IMdaProxy {
    @objid ("ddb26baf-2b06-4d9e-867e-da40cd20882d")
    public static final String STEREOTYPE_NAME = "ConstraintType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("e450b7b6-1a65-4f3a-aa97-6056edd1fcd4")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ConstraintType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ConstraintType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c2ca4fc1-fbed-4b9f-a3b9-343eff40e9d1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ConstraintType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ConstraintType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ConstraintType1 >> then instantiate a {@link ConstraintType1} proxy.
     * 
     * @return a {@link ConstraintType1} proxy on the created {@link ModelElement}.
     */
    @objid ("d91238c6-23cf-4aee-bb5f-ea7ef802be56")
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
    @objid ("f3028c4c-1df4-4fc8-a254-026b99fe6c5d")
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
    @objid ("939148ef-eeab-44c5-87df-a05bdac6ed7b")
    public static ConstraintType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ConstraintType1.canInstantiate(obj))
        	return new ConstraintType1(obj);
        else
        	throw new IllegalArgumentException("ConstraintType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7195fd14-7321-42c3-8e1d-b73e877c72a6")
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
    @objid ("c4426519-4919-495f-b5a5-9bd54b5b2cce")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("a3dea3c3-56f1-4c84-9bbf-b206ab90cad3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("89a9746c-e243-4e40-a033-e23f9f59353f")
    protected  ConstraintType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("66c8cfbd-405c-4c11-9b6c-f31dd0125ef8")
    public static final class MdaTypes {
        @objid ("e5530c12-8102-412a-89c9-0e8050427419")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3bbebac7-b003-4074-9793-27f502f89bfc")
        private static Stereotype MDAASSOCDEP;

        @objid ("e3bae996-c88b-45d8-a631-4c115d554921")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0fa294e6-5560-47ed-a475-52c70ca56eff")
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

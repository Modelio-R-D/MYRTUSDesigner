/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 13:03 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TPropertyConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d1e9611d-8cc9-42d2-9081-81d4e72a8d3c")
public class TPropertyConstraint extends TConstraint implements IMdaProxy {
    @objid ("f58a28d2-442a-4f48-8806-9f53fc5e7a50")
    public static final String STEREOTYPE_NAME = "TPropertyConstraint";

    /**
     * Tells whether a {@link TPropertyConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9ea7c3fc-7a67-4582-a938-426a12b913df")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyConstraint.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyConstraint.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyConstraint >> then instantiate a {@link TPropertyConstraint} proxy.
     * 
     * @return a {@link TPropertyConstraint} proxy on the created {@link ModelElement}.
     */
    @objid ("469ffe7a-bb5d-41c7-97eb-e0dc6e42573b")
    public static TPropertyConstraint create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TPropertyConstraint.MdaTypes.STEREOTYPE_ELT);
        return TPropertyConstraint.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TPropertyConstraint} proxy from a {@link ModelElement} stereotyped << TPropertyConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TPropertyConstraint} proxy or <i>null</i>.
     */
    @objid ("e625d007-13f9-421d-a459-98db6a1fa95e")
    public static TPropertyConstraint instantiate(final ModelElement obj) {
        return TPropertyConstraint.canInstantiate(obj) ? new TPropertyConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPropertyConstraint} proxy from a {@link ModelElement} stereotyped << TPropertyConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TPropertyConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8a3eb2f2-a9c5-4088-bf3d-2df628f55a7d")
    public static TPropertyConstraint safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyConstraint.canInstantiate(obj))
        	return new TPropertyConstraint(obj);
        else
        	throw new IllegalArgumentException("TPropertyConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("786e4288-eacb-41f0-b24a-65c99cb4fe39")
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
        TPropertyConstraint other = (TPropertyConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("939d98ae-cdec-4d78-9a94-f311e234afe5")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("bdaaeb3b-f929-4fdd-be53-21764313fd9f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("6f935415-989b-4b28-85c4-83ff86262abb")
    protected  TPropertyConstraint(final ModelElement elt) {
        super(elt);
    }

    @objid ("fcc57cd5-12c0-49d3-b5b8-7ef4993285a2")
    public static final class MdaTypes {
        @objid ("19339332-23b8-48bc-b033-038c728e1a3a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("83d2f26d-e631-4ac1-ae36-5ca4c310580a")
        private static Stereotype MDAASSOCDEP;

        @objid ("b1352bef-fbfd-40ce-9d5f-6a8ac9e18d6e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("58c2c392-8b58-4e26-bba6-ba3f5ec958d7")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "85f116c1-fe2c-435b-a801-c3389c84beef", "TPropertyConstraint");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
@objid ("54e2b540-382f-49a8-a11a-aec8d923ab60")
public class TPropertyConstraint extends TConstraint implements IMdaProxy {
    @objid ("1acd3d4d-acb4-45a3-93c8-d84b0a992d37")
    public static final String STEREOTYPE_NAME = "TPropertyConstraint";

    /**
     * Tells whether a {@link TPropertyConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c3e342d6-866a-4c5e-a3b0-f1e004918cb6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyConstraint.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyConstraint.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyConstraint >> then instantiate a {@link TPropertyConstraint} proxy.
     * @return a {@link TPropertyConstraint} proxy on the created {@link ModelElement}.
     */
    @objid ("5b5758aa-cc29-49f7-83bc-e0cd9ee40e5a")
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
    @objid ("1666a178-e3bc-4d9b-a3bf-47aa57f8ab67")
    public static TPropertyConstraint instantiate(final ModelElement obj) {
        return TPropertyConstraint.canInstantiate(obj) ? new TPropertyConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPropertyConstraint} proxy from a {@link ModelElement} stereotyped << TPropertyConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TPropertyConstraint} proxy.
     */
    @objid ("0b8747f7-3f5e-4ef0-acd7-5e21ee03ac17")
    public static TPropertyConstraint safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyConstraint.canInstantiate(obj))
            return new TPropertyConstraint(obj);
        else
            throw new IllegalArgumentException("TPropertyConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6cb6e40c-d646-40e1-8b58-737b6042eaac")
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
    @objid ("2a901122-a057-4ccc-97ef-8c895f7f617b")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("7bc79921-ea49-4aea-98b9-7f57d48ef46f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5564cd03-718a-4ac1-b26a-d74ca072b89b")
    protected  TPropertyConstraint(final ModelElement elt) {
        super(elt);
    }

    @objid ("1375dca8-66c7-4307-bf50-b7f3fc71f66c")
    public static final class MdaTypes {
        @objid ("a6ecfa1f-8d9b-49da-abc9-d395bd69f99e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("43b6320f-6b95-4863-bbf5-f42cdd347e7f")
        private static Stereotype MDAASSOCDEP;

        @objid ("07a39e20-f4d9-4ccf-b381-ce8bac869438")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9c9bd3ed-2abf-443e-868e-16065f7f626c")
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

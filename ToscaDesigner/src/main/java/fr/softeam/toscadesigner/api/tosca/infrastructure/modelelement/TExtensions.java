/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 18:02 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TExtensions >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4cc9f846-eb47-417a-b09c-9da64a4adcd8")
public class TExtensions extends TExtensibleElements implements IMdaProxy {
    @objid ("a32dcd37-410a-4be7-9ea6-29ed265907ca")
    public static final String STEREOTYPE_NAME = "TExtensions";

    /**
     * Tells whether a {@link TExtensions proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtensions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("90a0a040-f07b-49b0-9f87-f91d30471fb2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtensions.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtensions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtensions >> then instantiate a {@link TExtensions} proxy.
     * 
     * @return a {@link TExtensions} proxy on the created {@link ModelElement}.
     */
    @objid ("d1969243-201b-46af-a0c7-6c8595a1a778")
    public static TExtensions create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TExtensions.MdaTypes.STEREOTYPE_ELT);
        return TExtensions.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TExtensions} proxy from a {@link ModelElement} stereotyped << TExtensions >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TExtensions} proxy or <i>null</i>.
     */
    @objid ("8376652a-9c54-4784-8be2-3a0c73fb2431")
    public static TExtensions instantiate(final ModelElement obj) {
        return TExtensions.canInstantiate(obj) ? new TExtensions(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExtensions} proxy from a {@link ModelElement} stereotyped << TExtensions >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TExtensions} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c17276b9-09bb-4b33-a525-7f94bce1b067")
    public static TExtensions safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExtensions.canInstantiate(obj))
        	return new TExtensions(obj);
        else
        	throw new IllegalArgumentException("TExtensions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a89473bb-018d-447d-b044-69b7c10bb5e3")
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
        TExtensions other = (TExtensions) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("9219255a-2db8-4efd-8c0f-da678b11041d")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("16207a47-ff14-4f18-b247-6301bb06b062")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("d4202eb4-64c4-484f-be54-d0fc5e288d0d")
    protected  TExtensions(final ModelElement elt) {
        super(elt);
    }

    @objid ("52a30eef-2612-4066-8055-2f3030985e82")
    public static final class MdaTypes {
        @objid ("d402d50e-38ec-4b1f-b0fe-2b6a4551857e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("26fce5dc-acb5-409b-971b-0f329f36fd1a")
        private static Stereotype MDAASSOCDEP;

        @objid ("7817d5ac-27a6-47cd-b95c-77130ed9a6ae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8c427009-f8cb-47e5-8681-ece2b1f91c5b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "b4e0c420-7fe8-4cd6-ade7-67b1d8957c5a", "TExtensions");
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

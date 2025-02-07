/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 06/02/2025 17:32 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << DefinitionType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("863a0626-99d2-4acd-8269-b87fce8411a7")
public class DefinitionType extends TDefinitions implements IMdaProxy {
    @objid ("46b38cdd-cfde-477c-9377-4d98ad94bba7")
    public static final String STEREOTYPE_NAME = "DefinitionType";

    /**
     * Tells whether a {@link DefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << DefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("14af7b30-46e1-41af-801a-eb2dd8586c38")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (DefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(DefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << DefinitionType >> then instantiate a {@link DefinitionType} proxy.
     * 
     * @return a {@link DefinitionType} proxy on the created {@link ModelElement}.
     */
    @objid ("bc7a43f5-0f8e-4d72-91f0-c25c4d506962")
    public static DefinitionType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(DefinitionType.MdaTypes.STEREOTYPE_ELT);
        return DefinitionType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link DefinitionType} proxy from a {@link ModelElement} stereotyped << DefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link DefinitionType} proxy or <i>null</i>.
     */
    @objid ("f00f0be0-58cc-4193-b9a9-d9e299013f14")
    public static DefinitionType instantiate(final ModelElement obj) {
        return DefinitionType.canInstantiate(obj) ? new DefinitionType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DefinitionType} proxy from a {@link ModelElement} stereotyped << DefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link DefinitionType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4d559f85-0be0-4269-a84a-243b039c5a9a")
    public static DefinitionType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (DefinitionType.canInstantiate(obj))
        	return new DefinitionType(obj);
        else
        	throw new IllegalArgumentException("DefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ab8bb6f7-8b10-4bf7-82ac-3ae5c3981815")
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
        DefinitionType other = (DefinitionType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("19c6ba73-909a-4f5a-a05e-fdb49b0851b0")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("d3bfb87e-bf3a-4019-b2e6-ab88b1f48b60")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("c160b262-a9b8-41b2-82ee-2929911520e0")
    protected  DefinitionType(final ModelElement elt) {
        super(elt);
    }

    @objid ("46e31c9a-812d-4a79-988c-5254579d9f13")
    public static final class MdaTypes {
        @objid ("0b76c3bd-ded4-4713-90a4-0135f5f8f566")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a5fe1cdd-2f83-4678-8d00-580f76912e15")
        private static Stereotype MDAASSOCDEP;

        @objid ("022d3024-895e-4a0f-a502-3f9701845de5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4c8eee5a-ba2a-4bf2-a4ec-50bf505352c6")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "acfbb136-0cbf-4fc9-9da7-edeb0b51e9d7", "DefinitionType");
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

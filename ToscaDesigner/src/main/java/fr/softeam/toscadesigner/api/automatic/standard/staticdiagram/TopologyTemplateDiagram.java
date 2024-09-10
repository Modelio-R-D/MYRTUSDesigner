/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/09/2024 10:28 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.automatic.standard.staticdiagram;

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
import org.modelio.metamodel.diagrams.StaticDiagram;
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
 * Proxy class to handle a {@link StaticDiagram} with << TopologyTemplateDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("14ed8883-d9ac-4522-b41c-97f9c7da9df8")
public class TopologyTemplateDiagram implements IMdaProxy {
    @objid ("0f1d9cb8-c0f1-451f-98d5-82ddb86624dc")
    public static final String STEREOTYPE_NAME = "TopologyTemplateDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("de6f8122-bdc0-4eef-8b6d-103004e84958")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link TopologyTemplateDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e88149bb-037e-4336-b6fb-287ac4fe1c31")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (TopologyTemplateDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(TopologyTemplateDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >> then instantiate a {@link TopologyTemplateDiagram} proxy.
     * 
     * @return a {@link TopologyTemplateDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("6c0cbb12-15bd-40da-bbef-15cd94292b79")
    public static TopologyTemplateDiagram create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.StaticDiagram");
        e.getExtension().add(TopologyTemplateDiagram.MdaTypes.STEREOTYPE_ELT);
        return TopologyTemplateDiagram.instantiate((StaticDiagram)e);
    }

    /**
     * Tries to instantiate a {@link TopologyTemplateDiagram} proxy from a {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StaticDiagram
     * @return a {@link TopologyTemplateDiagram} proxy or <i>null</i>.
     */
    @objid ("039bd02c-d9f4-48d1-945f-de1a9931525a")
    public static TopologyTemplateDiagram instantiate(final StaticDiagram obj) {
        return TopologyTemplateDiagram.canInstantiate(obj) ? new TopologyTemplateDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TopologyTemplateDiagram} proxy from a {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link TopologyTemplateDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ee9c764c-1ee9-4164-a266-eaa5b6c8c411")
    public static TopologyTemplateDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (TopologyTemplateDiagram.canInstantiate(obj))
        	return new TopologyTemplateDiagram(obj);
        else
        	throw new IllegalArgumentException("TopologyTemplateDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e3d04328-668c-4fa8-9720-c96966530220")
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
        TopologyTemplateDiagram other = (TopologyTemplateDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StaticDiagram}. 
     * @return the StaticDiagram represented by this proxy, never null.
     */
    @objid ("c1db9dda-897a-4380-8002-d2b09a4476ac")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("7b42a62d-1167-4ab6-956a-d409eafb2317")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("21fc5c83-39eb-4b8c-9d0d-640d5b51532e")
    protected  TopologyTemplateDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("4372a31e-37b0-4302-8407-0b61f58e1252")
    public static final class MdaTypes {
        @objid ("163f99c6-44de-4a5e-b517-8b46cb8e2f8d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f0baf412-e55d-4b52-a067-98a906d905c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("ea98782e-25de-40fb-b113-09df93967afd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1241d224-b27e-4a2d-b432-9b4e1005339b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "0313d7f3-dcd0-4c93-981e-705f3d4bcc82", "TopologyTemplateDiagram");
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

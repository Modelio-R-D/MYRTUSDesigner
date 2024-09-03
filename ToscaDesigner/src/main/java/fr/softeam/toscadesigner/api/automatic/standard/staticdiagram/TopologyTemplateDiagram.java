/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 17:56 by Modelio Studio.
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
    @objid ("351f6c76-0116-4fbb-80c7-3794428771e7")
    public static final String STEREOTYPE_NAME = "TopologyTemplateDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("6760bbea-f52c-44fb-b79a-4ef55273dcb2")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link TopologyTemplateDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("45e262c3-2cd8-4c10-923e-a1573183c7a7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (TopologyTemplateDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(TopologyTemplateDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >> then instantiate a {@link TopologyTemplateDiagram} proxy.
     * 
     * @return a {@link TopologyTemplateDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("4206a910-e21e-4282-a219-3cb48327a7ae")
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
    @objid ("0fcb8de2-e79e-4661-a685-0f2c980fa7b2")
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
    @objid ("9013b743-ca40-4d4b-8855-df23a7ae265d")
    public static TopologyTemplateDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (TopologyTemplateDiagram.canInstantiate(obj))
        	return new TopologyTemplateDiagram(obj);
        else
        	throw new IllegalArgumentException("TopologyTemplateDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("eb19ff21-17ba-4988-bae7-a439ce07fb8d")
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
    @objid ("b341f4d9-17f1-4945-99b8-90e7c3902d65")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("d461c373-aba7-4de8-9a55-af0f25615fdd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("a1e0fd41-f9d8-4a1d-9acb-dd75867e10fe")
    protected  TopologyTemplateDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("4372a31e-37b0-4302-8407-0b61f58e1252")
    public static final class MdaTypes {
        @objid ("5d4eb223-b3f3-4fcb-ad88-b771692714c5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5ba2fc43-195f-4244-bfba-5a225bb3393d")
        private static Stereotype MDAASSOCDEP;

        @objid ("e081deb0-cee0-4367-96a1-83a3b7740859")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a2a0a2ea-1739-450a-bc81-de84ba04e5a0")
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

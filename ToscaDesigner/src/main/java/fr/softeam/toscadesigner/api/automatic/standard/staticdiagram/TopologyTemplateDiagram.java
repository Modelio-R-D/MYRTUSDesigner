/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 14:48 by Modelio Studio.
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
    @objid ("47ef1878-d96d-411f-880a-47b39e879fc8")
    public static final String STEREOTYPE_NAME = "TopologyTemplateDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("e78d82ca-169a-4be4-bf15-c18ae0c5c8a2")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link TopologyTemplateDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2134cb36-0fe3-4faa-9fa6-438bba84aaca")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (TopologyTemplateDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(TopologyTemplateDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >> then instantiate a {@link TopologyTemplateDiagram} proxy.
     * 
     * @return a {@link TopologyTemplateDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("8cc2e084-0648-4232-956a-5762c96df992")
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
    @objid ("f41d54e0-2313-4a72-8bca-4e9dc3d35175")
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
    @objid ("96072ac4-241c-441b-9a74-8ab724b9d1da")
    public static TopologyTemplateDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (TopologyTemplateDiagram.canInstantiate(obj))
        	return new TopologyTemplateDiagram(obj);
        else
        	throw new IllegalArgumentException("TopologyTemplateDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f09a4077-e559-4387-a4d7-a30a8929e053")
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
    @objid ("5c8a0af8-535b-4557-8898-b1ecc8faf510")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("c3254571-99c6-412a-a134-bfa884e10a13")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("686f6215-d4f1-4a8d-843e-d3120fce101a")
    protected  TopologyTemplateDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("4372a31e-37b0-4302-8407-0b61f58e1252")
    public static final class MdaTypes {
        @objid ("d472a46f-9d0a-498f-8284-a7556dd0fabe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9a7fd295-b872-4e25-84a5-e77bf55c5fc7")
        private static Stereotype MDAASSOCDEP;

        @objid ("4c381484-d98e-47d4-80d2-99065f0f0ee1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("31c3ac7b-2d32-4390-8d7c-c67efda69817")
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

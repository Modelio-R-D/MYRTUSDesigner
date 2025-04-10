/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:09 by Modelio Studio.
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
@objid ("5690a531-d748-4d21-a33e-03dd25aeea24")
public class TopologyTemplateDiagram implements IMdaProxy {
    @objid ("334d09c9-6033-4a8e-ad68-198fbd1579a0")
    public static final String STEREOTYPE_NAME = "TopologyTemplateDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("c6aec5ac-fb09-4747-8605-cdaaacdca1af")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link TopologyTemplateDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8b38f389-7bb6-4483-a5d3-9bbe15148bcf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (TopologyTemplateDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(TopologyTemplateDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << TopologyTemplateDiagram >> then instantiate a {@link TopologyTemplateDiagram} proxy.
     * 
     * @return a {@link TopologyTemplateDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("aeb29220-0f8d-4fbf-801a-4f1a2cb4a429")
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
    @objid ("286651aa-d36f-4957-9322-93c0d3d098e9")
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
    @objid ("551d2fb4-4495-4144-abd5-b8356306a653")
    public static TopologyTemplateDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (TopologyTemplateDiagram.canInstantiate(obj))
        	return new TopologyTemplateDiagram(obj);
        else
        	throw new IllegalArgumentException("TopologyTemplateDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e088a16e-6c31-4947-bce3-41843d5afbae")
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
    @objid ("60732594-24dd-48f3-b16d-0dca86451c2b")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("39cfd626-ad87-45d2-a4f8-b0ab39bb086f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("3b7f16b9-423c-4abf-b5d4-b4aa1b642fe9")
    protected  TopologyTemplateDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("a75a5020-1077-4e84-8bb0-72f5c433615f")
    public static final class MdaTypes {
        @objid ("1c7fe4ed-8aeb-4d4a-9ac7-28b8bc881612")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("baefd922-4660-4ecc-91f0-052a7b0e7422")
        private static Stereotype MDAASSOCDEP;

        @objid ("b1e4a90c-d1e3-4402-9901-bebbedeb1ce3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("54a569b8-ade4-49b9-893d-38de88290f0a")
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

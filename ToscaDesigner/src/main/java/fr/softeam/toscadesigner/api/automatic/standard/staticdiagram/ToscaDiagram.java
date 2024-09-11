/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 14:25 by Modelio Studio.
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
 * Proxy class to handle a {@link StaticDiagram} with << ToscaDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0fa85812-9761-4c3b-b08a-6477551af622")
public class ToscaDiagram implements IMdaProxy {
    @objid ("f82460a4-0622-44d1-b40b-47b822d99a11")
    public static final String STEREOTYPE_NAME = "ToscaDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("bc1f5e47-857c-431c-91fb-e3ce585acdad")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ToscaDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ToscaDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9f68b7a7-7ff2-4fb9-b302-7f68bb26900a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ToscaDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ToscaDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ToscaDiagram >> then instantiate a {@link ToscaDiagram} proxy.
     * 
     * @return a {@link ToscaDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("adc73a1f-08f2-407d-8354-442bd369b745")
    public static ToscaDiagram create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.StaticDiagram");
        e.getExtension().add(ToscaDiagram.MdaTypes.STEREOTYPE_ELT);
        return ToscaDiagram.instantiate((StaticDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ToscaDiagram} proxy from a {@link StaticDiagram} stereotyped << ToscaDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StaticDiagram
     * @return a {@link ToscaDiagram} proxy or <i>null</i>.
     */
    @objid ("19eb2132-a576-45ff-8926-23ccbfb640d2")
    public static ToscaDiagram instantiate(final StaticDiagram obj) {
        return ToscaDiagram.canInstantiate(obj) ? new ToscaDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ToscaDiagram} proxy from a {@link StaticDiagram} stereotyped << ToscaDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link ToscaDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("964c573e-a58e-44cf-8807-f229442546d2")
    public static ToscaDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ToscaDiagram.canInstantiate(obj))
        	return new ToscaDiagram(obj);
        else
        	throw new IllegalArgumentException("ToscaDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9e381ef5-4a9d-4edf-ab8d-ec8c877a2f90")
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
        ToscaDiagram other = (ToscaDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StaticDiagram}. 
     * @return the StaticDiagram represented by this proxy, never null.
     */
    @objid ("d5485586-d028-4898-bb63-bbf583866489")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("794ce71d-91a3-4f44-9bf0-122605c97b40")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("dcb09eb0-1f50-48ac-adff-0515480e69bd")
    protected  ToscaDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("cf3c32f5-d159-4ca0-91fa-0b4137560cc2")
    public static final class MdaTypes {
        @objid ("8839210b-9332-45ba-853f-1e2e62b82042")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c880d554-dac6-4321-a747-cdf6ce424283")
        private static Stereotype MDAASSOCDEP;

        @objid ("0a798e27-5d67-4891-91c1-595043827a2d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d6e76855-e4a4-4e54-aa53-c3d69d622fd3")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "dddbe647-1f21-42d1-93cd-f61109a8afd3", "ToscaDiagram");
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

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
 * Proxy class to handle a {@link ModelElement} with << ImplementationArtifactType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("596a22eb-f1eb-46a8-a690-c875d7a1d5fc")
public class ImplementationArtifactType extends TImplementationArtifact implements IMdaProxy {
    @objid ("d885bb30-1a40-4535-ac8a-bf0828e06845")
    public static final String STEREOTYPE_NAME = "ImplementationArtifactType";

    /**
     * Tells whether a {@link ImplementationArtifactType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ImplementationArtifactType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6ae60d54-b2da-44a7-82da-23e794d06414")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ImplementationArtifactType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ImplementationArtifactType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ImplementationArtifactType >> then instantiate a {@link ImplementationArtifactType} proxy.
     * @return a {@link ImplementationArtifactType} proxy on the created {@link ModelElement}.
     */
    @objid ("482b94ff-48b7-4a57-898e-693adf1462fa")
    public static ImplementationArtifactType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(ImplementationArtifactType.MdaTypes.STEREOTYPE_ELT);
        return ImplementationArtifactType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ImplementationArtifactType} proxy from a {@link ModelElement} stereotyped << ImplementationArtifactType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ImplementationArtifactType} proxy or <i>null</i>.
     */
    @objid ("34e64872-bc5f-4649-ad4b-1ac0a7a2380f")
    public static ImplementationArtifactType instantiate(final ModelElement obj) {
        return ImplementationArtifactType.canInstantiate(obj) ? new ImplementationArtifactType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ImplementationArtifactType} proxy from a {@link ModelElement} stereotyped << ImplementationArtifactType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ImplementationArtifactType} proxy.
     */
    @objid ("b26e9c31-fa47-4066-a038-430bff510fc6")
    public static ImplementationArtifactType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ImplementationArtifactType.canInstantiate(obj))
            return new ImplementationArtifactType(obj);
        else
            throw new IllegalArgumentException("ImplementationArtifactType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("92aa62be-941d-4f97-8a90-71c2b52b56f4")
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
        ImplementationArtifactType other = (ImplementationArtifactType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("f7f96bdc-fade-4b7c-923c-da0261b3d6c4")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("603034b0-5e51-4ef5-8086-451930ee9e0c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("a7613281-04d7-4f6e-b48d-f69fbc15f992")
    protected  ImplementationArtifactType(final ModelElement elt) {
        super(elt);
    }

    @objid ("80467fe9-33ba-4210-81d0-f2de43e497a7")
    public static final class MdaTypes {
        @objid ("e2c3782a-321c-4f03-b4ca-b9ee292d9c63")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9f266769-8be6-429d-8811-32de14b5cccc")
        private static Stereotype MDAASSOCDEP;

        @objid ("8eac13a3-6010-4830-a953-bffab564d0ec")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("090ae507-5f8c-46cf-9e0e-8b03e71e6e81")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "0599d5cf-f2a0-44c3-9214-4f2715bfc1b4", "ImplementationArtifactType");
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

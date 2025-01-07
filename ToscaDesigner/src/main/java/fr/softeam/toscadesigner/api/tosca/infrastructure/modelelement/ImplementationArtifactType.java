/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 11:20 by Modelio Studio.
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
    @objid ("09f5bc86-bc42-4e09-98f8-1ce1d298d0fc")
    public static final String STEREOTYPE_NAME = "ImplementationArtifactType";

    /**
     * Tells whether a {@link ImplementationArtifactType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ImplementationArtifactType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b20ea56f-0da6-4e82-8211-fc653786632a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ImplementationArtifactType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ImplementationArtifactType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ImplementationArtifactType >> then instantiate a {@link ImplementationArtifactType} proxy.
     * 
     * @return a {@link ImplementationArtifactType} proxy on the created {@link ModelElement}.
     */
    @objid ("004acecf-318c-4515-9671-27b59c32c01c")
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
    @objid ("c242bff5-5804-46c1-80c4-443a5b2e7cc5")
    public static ImplementationArtifactType instantiate(final ModelElement obj) {
        return ImplementationArtifactType.canInstantiate(obj) ? new ImplementationArtifactType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ImplementationArtifactType} proxy from a {@link ModelElement} stereotyped << ImplementationArtifactType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ImplementationArtifactType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ff8e42a2-e360-47e0-88cb-b18d2779be89")
    public static ImplementationArtifactType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ImplementationArtifactType.canInstantiate(obj))
        	return new ImplementationArtifactType(obj);
        else
        	throw new IllegalArgumentException("ImplementationArtifactType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1fdffdac-17e4-46fa-a423-885aead08fdf")
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
    @objid ("a9e93408-4c36-4fab-9055-5bf0584f39fb")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("89933f6a-65b5-42d6-acbd-36946a5f906b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("fd7464a5-adb4-4717-8a77-21fa1bce99e3")
    protected  ImplementationArtifactType(final ModelElement elt) {
        super(elt);
    }

    @objid ("80467fe9-33ba-4210-81d0-f2de43e497a7")
    public static final class MdaTypes {
        @objid ("7d26df56-7949-42c0-9e0e-a83751075dde")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6200626a-0a06-4aa6-9504-1e41bb315c60")
        private static Stereotype MDAASSOCDEP;

        @objid ("9223b5bd-141a-4fa4-9ac8-8f8c87f0e338")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4ddb59fa-d974-4490-948c-613a555dbe00")
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

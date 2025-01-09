/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 11:56 by Modelio Studio.
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
    @objid ("5ed7dea8-b04f-4c39-8e21-f58bf1b24e06")
    public static final String STEREOTYPE_NAME = "ImplementationArtifactType";

    /**
     * Tells whether a {@link ImplementationArtifactType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ImplementationArtifactType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("32d7f26c-d0e3-4fa0-8d9f-a9522f734c7e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ImplementationArtifactType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ImplementationArtifactType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ImplementationArtifactType >> then instantiate a {@link ImplementationArtifactType} proxy.
     * 
     * @return a {@link ImplementationArtifactType} proxy on the created {@link ModelElement}.
     */
    @objid ("dfd4d9bf-d7bf-4bae-84c3-146d9a86d180")
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
    @objid ("b129e03f-6a37-41c5-a6f5-06ca99f1f71e")
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
    @objid ("3aabeae6-47c5-4143-ad9d-82218f914e0c")
    public static ImplementationArtifactType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ImplementationArtifactType.canInstantiate(obj))
        	return new ImplementationArtifactType(obj);
        else
        	throw new IllegalArgumentException("ImplementationArtifactType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0828b3cf-4449-408b-9fc4-ce400fc5daf9")
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
    @objid ("97fe27de-87a3-4d3b-be9e-348b579738cb")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("7fcd2d94-57fd-4781-bc71-62b920086188")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("5e8626e7-5643-44fc-8c24-40b539b00496")
    protected  ImplementationArtifactType(final ModelElement elt) {
        super(elt);
    }

    @objid ("80467fe9-33ba-4210-81d0-f2de43e497a7")
    public static final class MdaTypes {
        @objid ("122795ec-5fb8-4ccd-ad42-92555c15478b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b48f1977-ea33-4fe2-a42a-bb49cd6979cf")
        private static Stereotype MDAASSOCDEP;

        @objid ("3530265b-1581-4e98-bed4-57278b0020da")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b56a74da-f782-46da-9981-2329f8f6c8b8")
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

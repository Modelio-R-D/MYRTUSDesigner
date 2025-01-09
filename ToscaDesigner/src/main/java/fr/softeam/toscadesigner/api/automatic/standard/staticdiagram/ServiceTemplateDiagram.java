/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 11:56 by Modelio Studio.
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
 * Proxy class to handle a {@link StaticDiagram} with << ServiceTemplateDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6410d22d-7798-4501-8617-a7b9c2035a03")
public class ServiceTemplateDiagram implements IMdaProxy {
    @objid ("5289fe57-be86-40e9-b688-7a74c8890b68")
    public static final String STEREOTYPE_NAME = "ServiceTemplateDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("9ede2dfa-6355-4a5e-b82f-78bcf101e52f")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ServiceTemplateDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("210bd541-d44c-47d0-b74a-a4c9167940f7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ServiceTemplateDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ServiceTemplateDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >> then instantiate a {@link ServiceTemplateDiagram} proxy.
     * 
     * @return a {@link ServiceTemplateDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("78e50e10-777a-4d83-883b-5cd21c40df60")
    public static ServiceTemplateDiagram create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.StaticDiagram");
        e.getExtension().add(ServiceTemplateDiagram.MdaTypes.STEREOTYPE_ELT);
        return ServiceTemplateDiagram.instantiate((StaticDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ServiceTemplateDiagram} proxy from a {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StaticDiagram
     * @return a {@link ServiceTemplateDiagram} proxy or <i>null</i>.
     */
    @objid ("3a4ba9ba-c1a2-4b20-9ae7-8e5c8b439384")
    public static ServiceTemplateDiagram instantiate(final StaticDiagram obj) {
        return ServiceTemplateDiagram.canInstantiate(obj) ? new ServiceTemplateDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ServiceTemplateDiagram} proxy from a {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link ServiceTemplateDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("15862046-d540-4f94-975d-1b06e5578948")
    public static ServiceTemplateDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ServiceTemplateDiagram.canInstantiate(obj))
        	return new ServiceTemplateDiagram(obj);
        else
        	throw new IllegalArgumentException("ServiceTemplateDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d0b088a2-d67e-4f59-a9c7-a753cd31f821")
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
        ServiceTemplateDiagram other = (ServiceTemplateDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StaticDiagram}. 
     * @return the StaticDiagram represented by this proxy, never null.
     */
    @objid ("a6f7d255-b460-497b-b989-236a8f86a552")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("d6a4402d-f24d-4500-933e-72a10f7cec81")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("ccc68c40-6203-4319-b0f9-705ac834266b")
    protected  ServiceTemplateDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("f4f8acbe-52e0-4947-9cbf-c86b468b39dc")
    public static final class MdaTypes {
        @objid ("6a456d0e-9214-4bde-b6a9-956f5e44ca16")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bbe8d263-788c-4b5a-aef7-86a9795b3271")
        private static Stereotype MDAASSOCDEP;

        @objid ("e0aef303-ad20-4b62-aa41-6181f51347c8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2895c2de-c5f0-4e7f-b250-d1efbbc2240b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "f9953d92-a710-4f60-aac1-ebb34e59967c", "ServiceTemplateDiagram");
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

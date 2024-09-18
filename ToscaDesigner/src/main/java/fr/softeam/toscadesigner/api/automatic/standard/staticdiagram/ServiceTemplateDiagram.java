/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 13:03 by Modelio Studio.
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
    @objid ("e71b2d81-023d-4ae3-a9d7-fef4a8335508")
    public static final String STEREOTYPE_NAME = "ServiceTemplateDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("25c439c9-e394-4594-b65c-43a559cb0f50")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ServiceTemplateDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("47ec9d12-03ae-4e79-a59b-7a6906f588d8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ServiceTemplateDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ServiceTemplateDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >> then instantiate a {@link ServiceTemplateDiagram} proxy.
     * 
     * @return a {@link ServiceTemplateDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("ddeccfcf-4aca-410a-bc44-58bfd8466ad9")
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
    @objid ("a740f3ff-bc4f-4205-bb7f-7e0225efd9d9")
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
    @objid ("0e497c63-cff8-4f3c-946d-eb1e93f9b615")
    public static ServiceTemplateDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ServiceTemplateDiagram.canInstantiate(obj))
        	return new ServiceTemplateDiagram(obj);
        else
        	throw new IllegalArgumentException("ServiceTemplateDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ad02dd4c-12ff-4b66-af7a-3921dbe4ecff")
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
    @objid ("60e89067-656a-48bd-9c8a-088753658208")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("e4cec8c9-fe0a-41e8-b6cd-ecc25933144d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("6191acb8-9cec-4d4b-aa39-034825588178")
    protected  ServiceTemplateDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("f4f8acbe-52e0-4947-9cbf-c86b468b39dc")
    public static final class MdaTypes {
        @objid ("cc52d1ff-f177-40b1-88ab-e8da06729826")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("166ab64a-ca1e-44b3-8135-3974d3959fa5")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c514fea-e779-4aa5-a602-300f33782c46")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c9a2785d-2420-4a20-b464-6c526c4d9bb2")
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

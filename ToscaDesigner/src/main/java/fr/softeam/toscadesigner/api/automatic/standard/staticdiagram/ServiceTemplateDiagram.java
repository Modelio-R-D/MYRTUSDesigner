/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
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
@objid ("9d4da9ca-2131-444a-a6d6-b665a5bed195")
public class ServiceTemplateDiagram implements IMdaProxy {
    @objid ("a058b6ec-ba6a-4550-99d1-da37f7a5913a")
    public static final String STEREOTYPE_NAME = "ServiceTemplateDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     * 
     */
    @objid ("c6c8fa2a-136f-43fe-9ba2-f6d9aa86893b")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ServiceTemplateDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2c2f0145-084f-4ea4-9f89-4ad1d8a04e28")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ServiceTemplateDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ServiceTemplateDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >> then instantiate a {@link ServiceTemplateDiagram} proxy.
     * @return a {@link ServiceTemplateDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("94a4d374-2ea5-44a1-bce2-ef5ab727ce40")
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
    @objid ("e5663687-3dc2-43ae-9ad1-d7f74db0cb79")
    public static ServiceTemplateDiagram instantiate(final StaticDiagram obj) {
        return ServiceTemplateDiagram.canInstantiate(obj) ? new ServiceTemplateDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ServiceTemplateDiagram} proxy from a {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link ServiceTemplateDiagram} proxy.
     */
    @objid ("f47640cc-be2b-45e7-a3f3-bec8bab2b5f8")
    public static ServiceTemplateDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ServiceTemplateDiagram.canInstantiate(obj))
            return new ServiceTemplateDiagram(obj);
        else
            throw new IllegalArgumentException("ServiceTemplateDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c48bb448-1336-4727-a18f-49772f9fb5d9")
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
    @objid ("5fc40c1d-e858-44a3-b76e-07ef5f87171b")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("366c6bdd-7fdb-4830-80dc-5be6014f7ca4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f8eb4bde-31c2-418d-8a3b-f3dd55ad3bc6")
    protected  ServiceTemplateDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("08ba1b65-2498-47f4-8559-0403208b2c52")
    public static final class MdaTypes {
        @objid ("5ffb2f41-ef2e-474e-9577-4eb98a4ad38c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fd91fa15-3b33-4a06-8bb2-8bd4a923a59c")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed1ec392-8b62-4ff3-859d-9c10a1ac044c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("927d83ae-a21a-4827-ade6-13d104f1dfa4")
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

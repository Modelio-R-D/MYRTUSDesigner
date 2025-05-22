/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
@objid ("ed792b19-3a0d-46f3-b2a8-c885af3a1414")
public class ServiceTemplateDiagram implements IMdaProxy {
    @objid ("57bd9e21-45a0-46bb-9432-f084dbbdc6d5")
    public static final String STEREOTYPE_NAME = "ServiceTemplateDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     * 
     */
    @objid ("452d5cee-7522-45ad-92e9-484499e2b67f")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ServiceTemplateDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c60fb045-d6cf-4a82-ba3d-687133b13e87")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ServiceTemplateDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ServiceTemplateDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >> then instantiate a {@link ServiceTemplateDiagram} proxy.
     * @return a {@link ServiceTemplateDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("3a6a052a-269a-42c3-9fe0-c74c0a503fe3")
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
    @objid ("79a71efb-e46c-4565-92d9-f92f927856a7")
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
    @objid ("a8aac38d-be79-40e5-904b-e74ab2e0c2c0")
    public static ServiceTemplateDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ServiceTemplateDiagram.canInstantiate(obj))
            return new ServiceTemplateDiagram(obj);
        else
            throw new IllegalArgumentException("ServiceTemplateDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dde4503c-81bb-418c-9226-dc40ae7eee44")
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
    @objid ("e8ef3a75-f47b-49db-be5e-a4d4874a44da")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("162f2002-65bc-4497-8f6a-f9210350b6fe")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("6ec2c9f9-e44a-474c-9a38-e5060fd95f24")
    protected  ServiceTemplateDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("4b6fef3f-101c-4384-86b5-c7c7a22b250c")
    public static final class MdaTypes {
        @objid ("5f2d5a35-5bf9-4416-b3bd-82bd32e759ae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4771a861-5e74-4742-8cb6-0669203d1e59")
        private static Stereotype MDAASSOCDEP;

        @objid ("b8f1bc77-a3f0-4909-b788-f22a5be53608")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d1223fe5-36e9-4cd5-b5f5-191e5bebc9d3")
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

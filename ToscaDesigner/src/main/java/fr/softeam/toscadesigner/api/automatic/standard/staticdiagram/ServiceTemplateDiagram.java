/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 23/09/2024 12:50 by Modelio Studio.
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
    @objid ("c6b038da-6059-48a0-8c20-dd10c6724b44")
    public static final String STEREOTYPE_NAME = "ServiceTemplateDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("326232ce-1889-47f4-a6d1-28de20807c7b")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ServiceTemplateDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("880488d8-03a2-4e7d-8114-d9cd2d648b91")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ServiceTemplateDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ServiceTemplateDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ServiceTemplateDiagram >> then instantiate a {@link ServiceTemplateDiagram} proxy.
     * 
     * @return a {@link ServiceTemplateDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("a89f6ad4-9123-4e09-b1e1-30b17be5eddf")
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
    @objid ("755390dd-e9e1-490b-b301-84d988cf591b")
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
    @objid ("353c4cb7-5720-4840-a226-d43c7486defc")
    public static ServiceTemplateDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ServiceTemplateDiagram.canInstantiate(obj))
        	return new ServiceTemplateDiagram(obj);
        else
        	throw new IllegalArgumentException("ServiceTemplateDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f4435fa9-d11f-4b7c-8180-5317f68352ea")
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
    @objid ("f1aa02ad-bd06-4abc-b214-223c9f5b1cd1")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("d3afcafa-ce28-4cc0-b344-4ef141892282")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("a931f4fa-c870-41c0-8adb-cdd40aed8b52")
    protected  ServiceTemplateDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("f4f8acbe-52e0-4947-9cbf-c86b468b39dc")
    public static final class MdaTypes {
        @objid ("43d8fb96-07fd-4b76-a3b1-b84990f5cd87")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7c627735-5618-4b67-b06a-2a36acb2f983")
        private static Stereotype MDAASSOCDEP;

        @objid ("bfd502d8-5542-4a80-bb8c-6d68b67004e2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d5ef9bc0-86b3-40e5-9cd7-3f363a58849a")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 05/03/2024 12:38 by Modelio Studio.
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
 * Proxy class to handle a {@link StaticDiagram} with << CloudServiceArchiveDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("14644635-a422-47d2-a521-6f92f8f4c732")
public class CloudServiceArchiveDiagram implements IMdaProxy {
    @objid ("cb27ee0b-6bd8-4745-a84a-cbd6c07f841a")
    public static final String STEREOTYPE_NAME = "CloudServiceArchiveDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("2de96471-3781-42d6-9c4a-4616da2e1427")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link CloudServiceArchiveDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("188084cb-8428-4f27-a35e-1fdff03c63cc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (CloudServiceArchiveDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(CloudServiceArchiveDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >> then instantiate a {@link CloudServiceArchiveDiagram} proxy.
     * 
     * @return a {@link CloudServiceArchiveDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("03d9531a-bc74-44c5-9c44-f25c2a8b7ddc")
    public static CloudServiceArchiveDiagram create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.StaticDiagram");
        e.getExtension().add(CloudServiceArchiveDiagram.MdaTypes.STEREOTYPE_ELT);
        return CloudServiceArchiveDiagram.instantiate((StaticDiagram)e);
    }

    /**
     * Tries to instantiate a {@link CloudServiceArchiveDiagram} proxy from a {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StaticDiagram
     * @return a {@link CloudServiceArchiveDiagram} proxy or <i>null</i>.
     */
    @objid ("8d08c59c-b996-4178-8ae9-bf0c1c7f49e4")
    public static CloudServiceArchiveDiagram instantiate(final StaticDiagram obj) {
        return CloudServiceArchiveDiagram.canInstantiate(obj) ? new CloudServiceArchiveDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudServiceArchiveDiagram} proxy from a {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link CloudServiceArchiveDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ffea990b-1ac2-4402-94bd-d642f7d6b46e")
    public static CloudServiceArchiveDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (CloudServiceArchiveDiagram.canInstantiate(obj))
        	return new CloudServiceArchiveDiagram(obj);
        else
        	throw new IllegalArgumentException("CloudServiceArchiveDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1faa2d78-2c1e-45c4-a0f4-c22caf070e1b")
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
        CloudServiceArchiveDiagram other = (CloudServiceArchiveDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StaticDiagram}. 
     * @return the StaticDiagram represented by this proxy, never null.
     */
    @objid ("288a6e3c-3878-474c-94d3-aeb6f4f1d282")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("d3c47928-d2b9-478e-953f-9b0b8673361b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("8ec3c122-5175-4b36-abd7-1d1093be8f30")
    protected  CloudServiceArchiveDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("f9b8aa63-12e2-456c-a0b9-3c670d965b7a")
    public static final class MdaTypes {
        @objid ("601ee118-b0c7-4fb5-b59d-96ec7918b9e3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7abe2de7-e399-43d3-bb73-12c618168c6f")
        private static Stereotype MDAASSOCDEP;

        @objid ("415d7d57-0ddb-4e93-877d-39525d475482")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dbb2a4b8-17c4-43bc-81db-afa4f140bf7d")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "dddbe647-1f21-42d1-93cd-f61109a8afd3", "CloudServiceArchiveDiagram");
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

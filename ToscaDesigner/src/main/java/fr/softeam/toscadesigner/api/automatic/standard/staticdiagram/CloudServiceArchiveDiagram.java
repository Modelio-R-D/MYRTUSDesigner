/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 11:15 by Modelio Studio.
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
@objid ("5359af4a-ee3a-41bd-b442-8a2d88a31098")
public class CloudServiceArchiveDiagram implements IMdaProxy {
    @objid ("d0b837f9-dd27-4bac-996f-a6f918a85b30")
    public static final String STEREOTYPE_NAME = "CloudServiceArchiveDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("bd606e27-ad8d-442c-a049-752454285843")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link CloudServiceArchiveDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("917264bf-4a59-4183-bc2d-718d698e5330")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (CloudServiceArchiveDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(CloudServiceArchiveDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >> then instantiate a {@link CloudServiceArchiveDiagram} proxy.
     * 
     * @return a {@link CloudServiceArchiveDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("2379a12c-369f-4131-ae31-18251954a169")
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
    @objid ("5701cdca-782a-40d8-8aaa-59f387630f17")
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
    @objid ("e7ae9755-8f34-411a-932a-d6a727e5b89e")
    public static CloudServiceArchiveDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (CloudServiceArchiveDiagram.canInstantiate(obj))
        	return new CloudServiceArchiveDiagram(obj);
        else
        	throw new IllegalArgumentException("CloudServiceArchiveDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("952c0e30-980e-4220-81cb-4ded11832c35")
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
    @objid ("5fcfe2e3-4caf-4c73-9af3-da94f8b37946")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("ed22a444-e449-4571-b8fe-2be32d49b1cd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("d1340e98-7284-4464-a1c3-a7ab456e1d54")
    protected  CloudServiceArchiveDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("1557c17b-bdbb-4f49-b0e6-52d1ac52369d")
    public static final class MdaTypes {
        @objid ("4235bf9e-6e41-44e7-b438-7653b43883d1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c61acc58-7fc1-4a04-8b40-00fd014fc84c")
        private static Stereotype MDAASSOCDEP;

        @objid ("130262ee-d81a-4230-a221-d20ea0b86c31")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5c9b0254-b787-4292-9b8d-8183bf5e5ab9")
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

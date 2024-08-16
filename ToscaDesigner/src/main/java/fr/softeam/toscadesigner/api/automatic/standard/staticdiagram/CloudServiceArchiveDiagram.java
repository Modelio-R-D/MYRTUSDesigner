/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
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
    @objid ("cfdb7ec2-7a29-4656-ac03-109a5ea22fc9")
    public static final String STEREOTYPE_NAME = "CloudServiceArchiveDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("8b6c58d7-b8a5-470b-9098-5325cdf4dd11")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link CloudServiceArchiveDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2b36d16e-f8cb-44c8-b50e-105fd1cdbdbd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (CloudServiceArchiveDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(CloudServiceArchiveDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >> then instantiate a {@link CloudServiceArchiveDiagram} proxy.
     * 
     * @return a {@link CloudServiceArchiveDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("5d0f6c33-327c-4f87-8ccb-9180b64d4b7b")
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
    @objid ("2905db78-189a-48e4-be9f-7977ed8ec95b")
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
    @objid ("1d0dcb9a-f37d-4a8c-8c20-044d20982539")
    public static CloudServiceArchiveDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (CloudServiceArchiveDiagram.canInstantiate(obj))
        	return new CloudServiceArchiveDiagram(obj);
        else
        	throw new IllegalArgumentException("CloudServiceArchiveDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("86cbac81-364c-408c-a81c-57bc527661ec")
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
    @objid ("ba17715b-99f5-4e2a-a135-505b319921d8")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("6d75f65f-2c6a-4c19-97ad-f67edf413f31")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("bd9acfb7-c270-4273-a89b-c40f17f64668")
    protected  CloudServiceArchiveDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("1557c17b-bdbb-4f49-b0e6-52d1ac52369d")
    public static final class MdaTypes {
        @objid ("0ccd9c95-572c-49e6-9009-25daeb055cfa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a9fac621-2462-402c-bd6c-720b7af6712b")
        private static Stereotype MDAASSOCDEP;

        @objid ("a5440564-f74a-4d8f-a8e5-38b5a9936db2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f24fab64-29c7-4283-85ad-d83ff453ff65")
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

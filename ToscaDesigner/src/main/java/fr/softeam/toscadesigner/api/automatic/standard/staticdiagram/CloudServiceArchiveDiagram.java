/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 15:45 by Modelio Studio.
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
@objid ("84bc7a57-7634-43e0-a680-b15abe46342f")
public class CloudServiceArchiveDiagram implements IMdaProxy {
    @objid ("30ff0f76-6dae-4490-9e59-a21b2b87dbf7")
    public static final String STEREOTYPE_NAME = "CloudServiceArchiveDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     */
    @objid ("3ccb6565-f0c9-43f8-be8c-669cad857503")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link CloudServiceArchiveDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("01b2c448-96d3-4417-877f-8de33b53ba73")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (CloudServiceArchiveDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(CloudServiceArchiveDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << CloudServiceArchiveDiagram >> then instantiate a {@link CloudServiceArchiveDiagram} proxy.
     * 
     * @return a {@link CloudServiceArchiveDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("dca1a0d6-870c-4b49-8d94-14b339fa9bc3")
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
    @objid ("597dabe1-98a0-484c-ba5d-b1f3156eb081")
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
    @objid ("308befe5-f353-44cf-898d-bd6e7ddee69b")
    public static CloudServiceArchiveDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (CloudServiceArchiveDiagram.canInstantiate(obj))
        	return new CloudServiceArchiveDiagram(obj);
        else
        	throw new IllegalArgumentException("CloudServiceArchiveDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1552346a-322d-42ef-b866-122ddb2b1bdb")
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
    @objid ("68977429-e48f-48c8-be4a-15e193b3d6fd")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("9e43c3a2-a123-4c5a-9684-1b7b8d3e1f15")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("19b347c0-22c7-43f2-b1cb-00b59bfefce7")
    protected  CloudServiceArchiveDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("aca6748d-5cc9-475b-9827-53751b34620d")
    public static final class MdaTypes {
        @objid ("5e1c45de-61b3-44ea-8c95-25c4d404c701")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0c796c46-3c44-4e6c-9e6d-d987b821fb67")
        private static Stereotype MDAASSOCDEP;

        @objid ("eadb9c79-09c5-405f-893a-f175fbf9272b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dfe14abc-9abe-449f-9a96-ac8fe81a957c")
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

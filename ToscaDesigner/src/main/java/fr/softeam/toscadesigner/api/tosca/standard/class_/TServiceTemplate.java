/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TServiceTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("702ea51b-242c-4056-aac1-b369008df6a6")
public class TServiceTemplate implements IMdaProxy {
    @objid ("426368b3-6d26-4cd7-830f-dfda41951331")
    public static final String STEREOTYPE_NAME = "TServiceTemplate";

    @objid ("aff5b66a-164d-4843-9b9a-d36efcfea9ec")
    public static final String BOUNDARYDEFINITIONS_TAGTYPE = "boundaryDefinitions";

    @objid ("c7fc0b38-0e21-4ec2-b590-5edb9ec8b355")
    public static final String ID_TAGTYPE = "id";

    @objid ("40718f1f-c554-4928-aba3-28bc74958959")
    public static final String NAME_TAGTYPE = "name";

    @objid ("445f5489-3ebe-4ee9-b2cc-dd693c85c67e")
    public static final String SUBSTITUTABLENODETYPE_TAGTYPE = "substitutableNodeType";

    @objid ("12785b77-e7fe-40f4-aca9-9562a5f3db05")
    public static final String TAGS_TAGTYPE = "tags";

    @objid ("baf52f23-99af-420d-ba3c-0f089e9ed2f9")
    public static final String TARGETNAMESPACE_TAGTYPE = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("be92fd7c-2b9e-42bc-a255-c5e3a1bb4234")
    protected final Class elt;

    /**
     * Tells whether a {@link TServiceTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TServiceTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0353b48f-c4bd-45cc-a443-81238718ca3f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TServiceTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TServiceTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TServiceTemplate >> then instantiate a {@link TServiceTemplate} proxy.
     * @return a {@link TServiceTemplate} proxy on the created {@link Class}.
     */
    @objid ("24eed84d-b014-4879-86d6-be9fa2bc7f89")
    public static TServiceTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TServiceTemplate.MdaTypes.STEREOTYPE_ELT);
        return TServiceTemplate.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TServiceTemplate} proxy from a {@link Class} stereotyped << TServiceTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TServiceTemplate} proxy or <i>null</i>.
     */
    @objid ("e9b16f85-0a45-47df-b7a3-afd28ae21640")
    public static TServiceTemplate instantiate(final Class obj) {
        return TServiceTemplate.canInstantiate(obj) ? new TServiceTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TServiceTemplate} proxy from a {@link Class} stereotyped << TServiceTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TServiceTemplate} proxy.
     */
    @objid ("05cb624c-e1aa-4533-80df-79512d0c73ed")
    public static TServiceTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TServiceTemplate.canInstantiate(obj))
            return new TServiceTemplate(obj);
        else
            throw new IllegalArgumentException("TServiceTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8d2d527f-0db0-43a0-bbc2-c60ea04d5721")
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
        TServiceTemplate other = (TServiceTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'boundaryDefinitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("84c997e2-d549-4f83-940f-3f80b178fb10")
    public String getBoundaryDefinitions() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("2bb939bd-c5c7-4491-97c3-83824163ffc5")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d2ebbcb5-93d2-4db2-bddd-80929cc9d6e9")
    public String getId() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("08bd0546-166e-44a5-b6ca-b468d5ac7b56")
    public String getName() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'plans' role.<p>
     * Role description:
     * null
     */
    @objid ("7f8752e3-056e-47e9-b52d-344074a48725")
    public TPlans getPlans() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "plans")
                  && TPlans.canInstantiate(d.getDependsOn())) {
                     return (TPlans)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPlans.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'substitutableNodeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("27f33d70-6a5e-4ecf-988a-e34c06fa3cec")
    public String getSubstitutableNodeType() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cfde3fde-d506-49db-8b89-16216896567d")
    public String getTags() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.TAGS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("84ab888e-d280-4edf-a6c5-f338bb69bf46")
    public String getTargetNamespace() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.TARGETNAMESPACE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     */
    @objid ("b050201c-6aba-45c8-8b10-df8b61e5d9f9")
    public TTopologyTemplate getTopologyTemplate() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "topologyTemplate")
                  && TTopologyTemplate.canInstantiate(d.getDependsOn())) {
                     return (TTopologyTemplate)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TTopologyTemplate.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("6d2943d7-7e97-4cdb-86c6-ce0cfa02fd63")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'boundaryDefinitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3c0c210b-72fd-44f6-9950-7bc951c43f41")
    public void setBoundaryDefinitions(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9fe486db-dfbc-4a61-9587-e731ee8b4199")
    public void setId(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7c92517d-033f-450f-94f6-720a1bac4b46")
    public void setName(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'plans' role.<p>
     * Role description:
     * null
     */
    @objid ("ecb7913e-970d-4eba-ac60-78bdd8724987")
    public void setPlans(final TPlans obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "plans")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TServiceTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("plans");      dep.putTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE, "plans");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'substitutableNodeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("982ed1e2-c59e-4352-82f9-873ae2e69a7e")
    public void setSubstitutableNodeType(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("843fe9b3-63c7-4067-8193-03cf2a002000")
    public void setTags(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.TAGS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d8f4a0f0-e1ad-4183-9795-5523aed18ad4")
    public void setTargetNamespace(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.TARGETNAMESPACE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     */
    @objid ("0c6cac1b-5f8d-4489-9279-f835151aea19")
    public void setTopologyTemplate(final TTopologyTemplate obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "topologyTemplate")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TServiceTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("topologyTemplate");      dep.putTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE, "topologyTemplate");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("ddfdbb7f-a9c1-4133-afd1-7435eadbd519")
    protected  TServiceTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("100385ff-70ff-443c-a6c2-3698d3627b6c")
    public static final class MdaTypes {
        @objid ("f0b449c0-ddd3-4257-a581-02d0c2408e0c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bc4b52c7-4027-4f0e-a938-355a2d7737f4")
        public static TagType TAGS_TAGTYPE_ELT;

        @objid ("b43838f8-ba02-4230-81d6-8c81c10f2a59")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("aab988e7-9501-4992-956c-e5e3e00ea0c2")
        public static TagType TARGETNAMESPACE_TAGTYPE_ELT;

        @objid ("c05ad9e6-f84f-4047-9d92-c239c48eb0da")
        public static TagType SUBSTITUTABLENODETYPE_TAGTYPE_ELT;

        @objid ("7ab258ad-aa62-4c57-ae60-963ab64d5058")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("318062b0-7902-4adc-8142-658e076bba78")
        public static TagType BOUNDARYDEFINITIONS_TAGTYPE_ELT;

        @objid ("4a4da8b1-76f1-4863-91d0-92969ce8db0b")
        private static Stereotype MDAASSOCDEP;

        @objid ("47bb6aa7-0e63-4f35-a540-ab487beb9759")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b6623724-5a4f-4ea0-9973-f1bbb464b1f0")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "09682faf-27b8-4c4b-a5e6-22fe18303161", "TServiceTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "ddecaa33-6336-43e5-aa39-1213b9564dc6", "tags");
            TAGS_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (TAGS_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "6ae4660e-2bb6-436b-a91f-7f62f99aeca5", "name");
            NAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (NAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "293beffb-ce5a-45d2-b13a-6fe3c7333967", "targetNamespace");
            TARGETNAMESPACE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (TARGETNAMESPACE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "8559129d-7391-4297-8366-1bd701a15d0b", "substitutableNodeType");
            SUBSTITUTABLENODETYPE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (SUBSTITUTABLENODETYPE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "025fd2ff-dda0-4162-bfc0-fdd51b5af804", "id");
            ID_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (ID_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "65afaab6-bc9c-437c-be88-8060c62cc14d", "boundaryDefinitions");
            BOUNDARYDEFINITIONS_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (BOUNDARYDEFINITIONS_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
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
    @objid ("3eab7c33-0109-4fca-86db-66327d92e0a7")
    public static final String STEREOTYPE_NAME = "TServiceTemplate";

    @objid ("8c3c9b8d-cb80-460b-832e-00fe14eac45f")
    public static final String BOUNDARYDEFINITIONS_TAGTYPE = "boundaryDefinitions";

    @objid ("15ce9be6-12d2-43d4-bda2-338aaf99e954")
    public static final String ID_TAGTYPE = "id";

    @objid ("6c8c3c93-7403-4d7f-a52e-86d4b578bfe9")
    public static final String NAME_TAGTYPE = "name";

    @objid ("0dc12ba5-823c-44c5-8f3e-33d08d6d7807")
    public static final String SUBSTITUTABLENODETYPE_TAGTYPE = "substitutableNodeType";

    @objid ("21e46b7f-a748-4f69-bd59-4599e6cefc54")
    public static final String TAGS_TAGTYPE = "tags";

    @objid ("41b36465-8ab5-4115-b8a4-d5febf3fc438")
    public static final String TARGETNAMESPACE_TAGTYPE = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("4cf0591e-40ce-4e95-a1aa-113ea011934e")
    protected final Class elt;

    /**
     * Tells whether a {@link TServiceTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TServiceTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0bf10c43-5107-4da1-b8bc-0104f91aa423")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TServiceTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TServiceTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TServiceTemplate >> then instantiate a {@link TServiceTemplate} proxy.
     * 
     * @return a {@link TServiceTemplate} proxy on the created {@link Class}.
     */
    @objid ("f80ece14-9df0-4fba-873c-f3ebab4da055")
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
    @objid ("e5a8c60c-0c83-46c3-8abd-c83ea7cb6f0f")
    public static TServiceTemplate instantiate(final Class obj) {
        return TServiceTemplate.canInstantiate(obj) ? new TServiceTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TServiceTemplate} proxy from a {@link Class} stereotyped << TServiceTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TServiceTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e80bf92b-99d2-4b6d-bfd3-b48094c8ed29")
    public static TServiceTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TServiceTemplate.canInstantiate(obj))
        	return new TServiceTemplate(obj);
        else
        	throw new IllegalArgumentException("TServiceTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5d59781d-0404-4608-9699-352a93ca8584")
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
    @objid ("3eed4728-8266-41a7-ae68-b956e3ef0565")
    public String getBoundaryDefinitions() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("71cca79c-41de-471a-b50f-56f6c49272aa")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fac2305d-d1dd-47db-85f5-b9763e939cd9")
    public String getId() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("718f8a16-b418-44a4-bf50-2f21f1736ca2")
    public String getName() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("894a0d6a-c5f2-4967-83bc-97259646b4b3")
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
    @objid ("500ec5c3-f656-4f6a-b6e0-7f4aac030dd3")
    public String getSubstitutableNodeType() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("affdd188-776d-4314-af1f-fe6d7a154980")
    public String getTags() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.TAGS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("71c3348a-588c-40fc-ae43-d600b891292e")
    public String getTargetNamespace() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.TARGETNAMESPACE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("61e61900-8b8f-427e-8e05-50cd2ea4df9f")
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

    @objid ("7bfa515c-9680-4018-bd23-b7f4b54f2421")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'boundaryDefinitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1bc91373-cf58-490b-a0ae-81fa213f3c9a")
    public void setBoundaryDefinitions(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ea083213-97aa-4f72-9179-83fb0564a009")
    public void setId(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6082298b-e2e8-46b3-b3b4-a50591faeab7")
    public void setName(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e96558d6-0a8c-4a01-98cc-d0bf76609557")
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
    @objid ("d37a1863-38c4-487f-b1c2-75bdabb4f06c")
    public void setSubstitutableNodeType(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cf888808-cbae-4fc8-8fc9-1d65835d23ba")
    public void setTags(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.TAGS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("70efc2f4-e737-48bd-8764-69b3ab7e67d6")
    public void setTargetNamespace(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.TARGETNAMESPACE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9d869616-b82c-463c-9cfb-11ac372d1840")
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

    @objid ("dbcfb870-bda3-4da8-97f2-56d1097f216b")
    protected  TServiceTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("100385ff-70ff-443c-a6c2-3698d3627b6c")
    public static final class MdaTypes {
        @objid ("63447e9b-8b6a-4b42-8644-0ec5a3f48534")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("624a6aaa-07e9-4e43-833f-af5d1eb6758a")
        public static TagType TAGS_TAGTYPE_ELT;

        @objid ("da2bec95-8ddb-45bc-9f81-076c2f1edef4")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("15a8f09b-bb1c-4465-91ab-f4259612cd7a")
        public static TagType TARGETNAMESPACE_TAGTYPE_ELT;

        @objid ("3a159b82-a9dd-4466-9e5f-846013560635")
        public static TagType SUBSTITUTABLENODETYPE_TAGTYPE_ELT;

        @objid ("0e3dea06-6794-40af-b7de-f9ec0a13a83b")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("72012d21-b7f7-4473-b58f-d62a6b555709")
        public static TagType BOUNDARYDEFINITIONS_TAGTYPE_ELT;

        @objid ("87344702-ccaa-4eee-a54c-48e19cb67e1c")
        private static Stereotype MDAASSOCDEP;

        @objid ("ca891bca-87b8-46c5-9f51-948ba6a3b430")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0b185af8-87a5-4d21-86c9-387719d508dc")
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

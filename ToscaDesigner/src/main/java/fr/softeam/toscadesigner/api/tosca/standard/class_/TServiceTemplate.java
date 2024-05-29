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
    @objid ("8248be99-137c-47f7-b49c-c1a34f89e3ad")
    public static final String STEREOTYPE_NAME = "TServiceTemplate";

    @objid ("eb617417-789a-4fb0-b4c4-50c0623d2304")
    public static final String BOUNDARYDEFINITIONS_TAGTYPE = "boundaryDefinitions";

    @objid ("86d7336a-2e78-4a39-9762-180095c483c1")
    public static final String ID_TAGTYPE = "id";

    @objid ("bfb3f9be-0720-4fd5-8fb1-0904b05491a6")
    public static final String NAME_TAGTYPE = "name";

    @objid ("a4b0941d-5ffb-4f19-88fb-0411fea917f0")
    public static final String SUBSTITUTABLENODETYPE_TAGTYPE = "substitutableNodeType";

    @objid ("1b0e04d5-97ca-4091-beb8-81b17151e50d")
    public static final String TAGS_TAGTYPE = "tags";

    @objid ("ec00c579-3fef-470d-8317-4a64655d5601")
    public static final String TARGETNAMESPACE_TAGTYPE = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("589fc6d7-c4d8-46f7-9c80-c6b1ef68d0fb")
    protected final Class elt;

    /**
     * Tells whether a {@link TServiceTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TServiceTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("97a20041-87f9-420d-88ff-76ff427dd31b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TServiceTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TServiceTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TServiceTemplate >> then instantiate a {@link TServiceTemplate} proxy.
     * @return a {@link TServiceTemplate} proxy on the created {@link Class}.
     */
    @objid ("eb4b4745-c7ef-477d-96d7-12c898147946")
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
    @objid ("d6a889d7-4a22-4456-84bd-5ef36148479e")
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
    @objid ("cd960358-9cbc-430a-a720-cbd05ebfa4cd")
    public static TServiceTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TServiceTemplate.canInstantiate(obj))
            return new TServiceTemplate(obj);
        else
            throw new IllegalArgumentException("TServiceTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("66d7ae4a-5cc0-405e-b94e-6f11cf74ecbe")
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
    @objid ("fe557755-aea7-41f7-9574-9f9a6a1aa172")
    public String getBoundaryDefinitions() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("988fa681-34b5-44da-bb0e-a732d85f0c8c")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9cad99b5-23f2-4dfd-9f4e-802d870a9b5b")
    public String getId() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ceb457f8-40eb-423d-b4ce-9598a1108395")
    public String getName() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'plans' role.<p>
     * Role description:
     * null
     */
    @objid ("910c5025-0195-4cfa-9bd1-d13927c735f1")
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
    @objid ("36893d61-5618-4522-b72c-d63711711bcf")
    public String getSubstitutableNodeType() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4b331688-5be6-40c4-95c6-1f3091d804af")
    public String getTags() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.TAGS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("64b06b40-2b7c-435b-ad26-f05002d3fcc0")
    public String getTargetNamespace() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.TARGETNAMESPACE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     */
    @objid ("290a78e0-1295-45d8-8d73-b1645415939d")
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

    @objid ("e208fa05-b17a-4827-900f-eb24c89e3414")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'boundaryDefinitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("50b524f9-2917-40c5-b5e6-f46896861543")
    public void setBoundaryDefinitions(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("45f822f6-17dc-4e8e-8a53-90ff577bbf40")
    public void setId(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7dd2628e-5650-4126-ab9d-333ac444a12b")
    public void setName(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'plans' role.<p>
     * Role description:
     * null
     */
    @objid ("0b4b1eb5-90d6-44d6-89b9-7ecb9384fb1e")
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
    @objid ("eb513de9-e402-43d8-ba79-48bebc37fbdf")
    public void setSubstitutableNodeType(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4ad44880-b773-431f-8c8a-32d28d6b492e")
    public void setTags(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.TAGS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1170d879-4926-4714-933d-ddfbaed85a02")
    public void setTargetNamespace(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.TARGETNAMESPACE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     */
    @objid ("e964af36-eeb0-4d96-ab79-4bc9d6a149b2")
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

    @objid ("5ce0f730-866a-406b-9bb1-ac917d71d105")
    protected  TServiceTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("100385ff-70ff-443c-a6c2-3698d3627b6c")
    public static final class MdaTypes {
        @objid ("7dc768da-882d-46e6-beb5-2d4019d47c3f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f6038028-c5fc-40d1-9525-a65b9c0da13f")
        public static TagType TAGS_TAGTYPE_ELT;

        @objid ("111dcbd0-29b7-441c-aa73-0b1eb966de14")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("fe33ec6f-23e1-4f39-acf1-1def6b7fa4fc")
        public static TagType TARGETNAMESPACE_TAGTYPE_ELT;

        @objid ("d04b05f6-6e95-4fcf-928e-cda1e54b4e29")
        public static TagType SUBSTITUTABLENODETYPE_TAGTYPE_ELT;

        @objid ("28920b72-9035-4e5f-b4d6-905a37623edf")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("0382a548-cdbe-46fd-810d-b5c261c42cbb")
        public static TagType BOUNDARYDEFINITIONS_TAGTYPE_ELT;

        @objid ("d8452b8f-4150-4f16-8727-f1893fba8c79")
        private static Stereotype MDAASSOCDEP;

        @objid ("2eefeb60-a5a3-4933-93a9-34d9253c514c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9642d504-6179-4fa6-be4a-968a4ebb21a9")
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

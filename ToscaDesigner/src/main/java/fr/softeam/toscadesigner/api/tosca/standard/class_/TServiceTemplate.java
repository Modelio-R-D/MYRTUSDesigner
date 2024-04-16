/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:38 by Modelio Studio.
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
    @objid ("3d4e9123-3484-469c-927a-09837997fd74")
    public static final String STEREOTYPE_NAME = "TServiceTemplate";

    @objid ("6309f3d3-16f1-49ce-bbd7-be8d0f440aae")
    public static final String BOUNDARYDEFINITIONS_TAGTYPE = "boundaryDefinitions";

    @objid ("7ea7de6a-a266-4c88-a8b1-a87eb3d0bdaa")
    public static final String ID_TAGTYPE = "id";

    @objid ("742b6a4c-df7a-45c3-9055-723788c4da9b")
    public static final String NAME_TAGTYPE = "name";

    @objid ("221956a3-6938-45b8-aaba-e0cb86fdf4b5")
    public static final String SUBSTITUTABLENODETYPE_TAGTYPE = "substitutableNodeType";

    @objid ("643a2d2e-9f82-4e82-8c19-7f13a3e6d183")
    public static final String TAGS_TAGTYPE = "tags";

    @objid ("f875e4f8-a1b8-42d1-81c3-e5accdc7cef0")
    public static final String TARGETNAMESPACE_TAGTYPE = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("4f61fa08-2e03-4e4e-85f1-b9c57999155b")
    protected final Class elt;

    /**
     * Tells whether a {@link TServiceTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TServiceTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("186fd05e-f987-4f0c-8f2b-925ac49da84a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TServiceTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TServiceTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TServiceTemplate >> then instantiate a {@link TServiceTemplate} proxy.
     * 
     * @return a {@link TServiceTemplate} proxy on the created {@link Class}.
     */
    @objid ("4fc3a545-89e8-414b-9a38-4efea133aece")
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
    @objid ("495d036a-d959-4b09-9ea7-bf26f092cac3")
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
    @objid ("6e47ccdd-552c-4d23-a0b7-11749a84e4d5")
    public static TServiceTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TServiceTemplate.canInstantiate(obj))
        	return new TServiceTemplate(obj);
        else
        	throw new IllegalArgumentException("TServiceTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1889cb82-a110-4fff-a23f-0e26616b156d")
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
    @objid ("9e88c4ac-4ab7-4109-a625-84a4b31975b4")
    public String getBoundaryDefinitions() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("2e9555d6-5b04-45f0-a741-6b0586eb4eb4")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9bccae0c-3890-4dcb-a460-8bd6a627dfe2")
    public String getId() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("964e5cc1-8e42-4cfa-a44d-8306e2e1e473")
    public String getName() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("19b8dd8d-09ff-4917-9264-58dece9bc849")
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
    @objid ("9c6fba3b-e554-4bc2-96ca-0b6376bfe5c2")
    public String getSubstitutableNodeType() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8265a84c-5fab-4635-a9ae-356412a7bfb0")
    public String getTags() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.TAGS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8aeb7211-4576-42dc-b46e-575f8ee9668f")
    public String getTargetNamespace() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.TARGETNAMESPACE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e93bf623-73b8-4e95-865f-fbe17439a7c0")
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

    @objid ("6df5cca3-99dc-4486-9d2f-80417fce287f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'boundaryDefinitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0c43c330-2eef-48f7-a686-7082e57b5b2a")
    public void setBoundaryDefinitions(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d6c0800c-1880-4ac1-94a6-12550909da59")
    public void setId(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("672f851f-1fb9-46bd-ae66-8228f590697a")
    public void setName(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b32c4755-1bae-4429-9c96-4d28849a43c5")
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
    @objid ("6b579b6e-818c-4b03-8d89-35bbbad27310")
    public void setSubstitutableNodeType(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6228f421-d36b-4f4a-aca9-cdc923d6c2d1")
    public void setTags(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.TAGS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d7044874-82fc-43c1-b8d7-24d35a70da4a")
    public void setTargetNamespace(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.TARGETNAMESPACE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("48ad79c6-4b1c-43eb-a865-d1838bc5535e")
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

    @objid ("f46ff9af-7c42-4d69-80b2-873852884004")
    protected  TServiceTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("100385ff-70ff-443c-a6c2-3698d3627b6c")
    public static final class MdaTypes {
        @objid ("4e2d1257-0792-4b95-8ff4-1d2a83102b91")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("97babd32-7bd4-44d6-9676-66a30ac28bdf")
        public static TagType TAGS_TAGTYPE_ELT;

        @objid ("2dfe08a9-8621-4366-83ba-fd0733d478ce")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("33ceb08c-e9a8-4319-ba14-c029e20dcd4b")
        public static TagType TARGETNAMESPACE_TAGTYPE_ELT;

        @objid ("5e1b8881-f162-496a-930c-67518747a4ed")
        public static TagType SUBSTITUTABLENODETYPE_TAGTYPE_ELT;

        @objid ("3344ebf4-8a9f-4d99-963b-29c79e90798d")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("4708d058-c477-417a-b4e1-f975db0c50e9")
        public static TagType BOUNDARYDEFINITIONS_TAGTYPE_ELT;

        @objid ("2d375b4c-ed8b-49cc-afe3-09a17f6671b8")
        private static Stereotype MDAASSOCDEP;

        @objid ("880be1a7-8b2f-4250-8d1c-66335bb9011c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7793c182-064d-4519-aec9-f71930f72b44")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
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
@objid ("35098d03-1ac4-4035-b782-a0b3a0dc51ca")
public class TServiceTemplate implements IMdaProxy {
    @objid ("0f77550b-b434-4e8c-8110-4fb8e14c5d86")
    public static final String STEREOTYPE_NAME = "TServiceTemplate";

    @objid ("ca9d9199-8be3-4af1-94e4-a934224f95f2")
    public static final String BOUNDARYDEFINITIONS_TAGTYPE = "boundaryDefinitions";

    @objid ("669e6164-ab76-48af-b6f4-a36077307725")
    public static final String ID_TAGTYPE = "id";

    @objid ("4c6381d1-002a-4ca8-9ef0-819fa3c46dca")
    public static final String NAME_TAGTYPE = "name";

    @objid ("90452e21-461d-49e9-a4ad-9cd61e1cd97f")
    public static final String SUBSTITUTABLENODETYPE_TAGTYPE = "substitutableNodeType";

    @objid ("3ebda20a-9336-4cc2-b231-bc6dcae736f6")
    public static final String TAGS_TAGTYPE = "tags";

    @objid ("bb07909e-ad58-4a5d-b7b2-15b72d1298f3")
    public static final String TARGETNAMESPACE_TAGTYPE = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("5e981499-e024-41be-8aff-def52e117751")
    protected final Class elt;

    /**
     * Tells whether a {@link TServiceTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TServiceTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("59ef9726-0d79-44b2-ab8d-779e95d627a5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TServiceTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TServiceTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TServiceTemplate >> then instantiate a {@link TServiceTemplate} proxy.
     * 
     * @return a {@link TServiceTemplate} proxy on the created {@link Class}.
     */
    @objid ("911fb8e5-af20-48a4-8f89-d096d5bde0a2")
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
    @objid ("90dcf2b7-bb69-437d-8fd1-4fb96cf24d31")
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
    @objid ("bafa9c3c-f49c-4794-ac9e-f1706270c31e")
    public static TServiceTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TServiceTemplate.canInstantiate(obj))
        	return new TServiceTemplate(obj);
        else
        	throw new IllegalArgumentException("TServiceTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1a8f91ae-b011-4600-a1de-1385f2688499")
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
    @objid ("5c2997a9-2fdd-42dd-9787-ff339afc219d")
    public String getBoundaryDefinitions() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ee5b3f32-05df-4ef9-acc6-06a209cc8e9e")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ca79bec7-6c8e-4d2c-a5d6-cf856533a5f7")
    public String getId() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6429f6d6-b3fb-452a-af2b-a761d164b3f4")
    public String getName() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d11f22a7-4c6e-486b-85d0-a2968caf93c0")
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
    @objid ("8b20d97a-83c3-42a5-8632-5eb596000905")
    public String getSubstitutableNodeType() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e414592c-7916-4381-a3b5-947ab35f1a03")
    public String getTags() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.TAGS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c934f2d3-c406-4eb4-937b-037c46aab640")
    public String getTargetNamespace() {
        return this.elt.getTagValue(TServiceTemplate.MdaTypes.TARGETNAMESPACE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("aade3222-1ff2-4167-85c0-87a3d1fa4ee9")
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

    @objid ("e143e46f-0896-4bb2-a4d2-735d19b80260")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'boundaryDefinitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bb7883ff-5140-4b39-a860-3db6664c55b8")
    public void setBoundaryDefinitions(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0429233f-0e02-44a4-bc5f-0a3f2f380493")
    public void setId(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0578819a-100c-4571-bb62-d51d58a65bae")
    public void setName(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("79262dc0-0aa6-49b3-92ac-f5fdcff8ab07")
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
    @objid ("22f801be-d5dc-4aaa-8474-f2d13562d973")
    public void setSubstitutableNodeType(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d70a6412-68f5-4e62-b52a-cc93d3ec9558")
    public void setTags(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.TAGS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("69fefe8a-2e56-4597-b99b-adb6aefb1618")
    public void setTargetNamespace(final String value) {
        this.elt.putTagValue(TServiceTemplate.MdaTypes.TARGETNAMESPACE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("56b57026-04f1-4e64-94e7-66b6b84e1b44")
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

    @objid ("3a775c2c-e700-4358-bad6-846764809f1d")
    protected  TServiceTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("0c9136ad-d0ba-4661-91b1-6977f01575a6")
    public static final class MdaTypes {
        @objid ("17715c97-2eaf-474a-be25-70bb8f7f8125")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b0f8556c-235f-4c1b-9fef-8fbed4666e87")
        public static TagType TAGS_TAGTYPE_ELT;

        @objid ("ad9cf651-ff9a-4adf-847e-9e5cc8529c25")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("a1de0a40-467b-4653-8cca-f4e1f5287a8e")
        public static TagType TARGETNAMESPACE_TAGTYPE_ELT;

        @objid ("8bf904dc-7d95-4d9c-a23f-c9c6da72682c")
        public static TagType SUBSTITUTABLENODETYPE_TAGTYPE_ELT;

        @objid ("c57097a6-e794-4ccc-8192-4ae6cc27e25e")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("c4b78244-081e-4ace-b9b8-76b43f1d97f5")
        public static TagType BOUNDARYDEFINITIONS_TAGTYPE_ELT;

        @objid ("f284a4a4-45fa-4605-a66a-89a947bfd720")
        private static Stereotype MDAASSOCDEP;

        @objid ("4f28572a-72ef-4b1b-92d8-2e3295ee8e71")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bc65994b-d118-4330-841d-b593b40d6a06")
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

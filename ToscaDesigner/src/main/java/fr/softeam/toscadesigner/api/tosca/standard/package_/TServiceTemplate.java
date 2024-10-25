/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/10/2024 12:02 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.package_;

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
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TPlans;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Package} with << TServiceTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6859ddfe-2833-4693-b7ce-095d92b4b7f1")
public class TServiceTemplate implements IMdaProxy {
    @objid ("61eb2f21-f1b4-4b49-a1e1-e9d129f20eb6")
    public static final String STEREOTYPE_NAME = "TServiceTemplate";

    @objid ("d8e3b0ca-459b-4875-b77c-c0fdac785957")
    public static final String BOUNDARYDEFINITIONS_PROPERTY = "boundaryDefinitions";

    @objid ("e0f78d8a-db3b-4348-90e2-b9283130b72f")
    public static final String ID_PROPERTY = "id";

    @objid ("049633b7-9135-4251-97f9-de0c12de8af9")
    public static final String NAME_PROPERTY = "name";

    @objid ("e4f08dd4-f583-4c7c-80d3-387d9e72a52d")
    public static final String SUBSTITUTABLENODETYPE_PROPERTY = "substitutableNodeType";

    @objid ("16a4086a-deb2-4c99-a534-f74fd1b10e3c")
    public static final String TAGS_PROPERTY = "tags";

    @objid ("0a74405e-1486-4b75-942a-6d00e15b9d63")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("6a110fa7-3cee-42a9-8c85-929f757df577")
    protected final Package elt;

    /**
     * Tells whether a {@link TServiceTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TServiceTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("472678e9-5250-46fa-bed9-b554fb16c2bb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (TServiceTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(TServiceTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << TServiceTemplate >> then instantiate a {@link TServiceTemplate} proxy.
     * 
     * @return a {@link TServiceTemplate} proxy on the created {@link Package}.
     */
    @objid ("69cbb9f9-0765-4011-82b3-c528ff392c50")
    public static TServiceTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Package");
        e.getExtension().add(TServiceTemplate.MdaTypes.STEREOTYPE_ELT);
        return TServiceTemplate.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link TServiceTemplate} proxy from a {@link Package} stereotyped << TServiceTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link TServiceTemplate} proxy or <i>null</i>.
     */
    @objid ("0c2cf426-a71d-4437-bb6b-ed95643a3320")
    public static TServiceTemplate instantiate(final Package obj) {
        return TServiceTemplate.canInstantiate(obj) ? new TServiceTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TServiceTemplate} proxy from a {@link Package} stereotyped << TServiceTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link TServiceTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("de6c853b-bb50-4f9e-83f1-4036bfcf392b")
    public static TServiceTemplate safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (TServiceTemplate.canInstantiate(obj))
        	return new TServiceTemplate(obj);
        else
        	throw new IllegalArgumentException("TServiceTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'groups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7582600b-1e64-4c0e-ab82-72793f3f5b2f")
    public void addGroups(final TGroup obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TServiceTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("groups");
            d.putTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE, "groups");
        }
    }

    /**
     * Add a value to the 'nodeTypes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("93ea5eaa-1370-4522-a663-6c1b68afb892")
    public void addNodeTypes(final TNodeType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TServiceTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("nodeTypes");
            d.putTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE, "nodeTypes");
        }
    }

    /**
     * Add a value to the 'relationships' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3e3c6a43-fe90-4b96-9f62-5474c950ff53")
    public void addRelationships(final TRelationshipType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TServiceTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("relationships");
            d.putTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE, "relationships");
        }
    }

    @objid ("7b9fa000-c90a-4ecc-b803-456811433813")
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
     * Getter for property 'TServiceTemplate.boundaryDefinitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3e4fb6c9-2b4f-4f9c-8f29-bf64f60c8083")
    public String getBoundaryDefinitions() {
        String value = this.elt.getProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("53d7a7bc-87a1-4bbf-bd58-fbed11d1bca3")
    public Package getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'groups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ee80a0a1-e5c8-4446-b3c3-225761989bd4")
    public List<TGroup> getGroups() {
        List<TGroup> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "groups")
              && TGroup.canInstantiate(d.getDependsOn()))
                results.add((TGroup)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TGroup.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for property 'TServiceTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5050a9c0-695c-4df9-9833-45cc0ebf323a")
    public String getId() {
        String value = this.elt.getProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TServiceTemplate.MdaTypes.ID_PROPERTY_ELT.getName());
        if (value == null) {
          value = TServiceTemplate.MdaTypes.ID_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TServiceTemplate.MdaTypes.ID_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TServiceTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("84487ac0-c356-41e3-8f2e-0279e3ee20cb")
    public String getName() {
        String value = this.elt.getProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TServiceTemplate.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TServiceTemplate.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TServiceTemplate.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the values of the 'nodeTypes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e3e17f5d-425a-40f3-aa67-0f88765ec7f4")
    public List<TNodeType> getNodeTypes() {
        List<TNodeType> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "nodeTypes")
              && TNodeType.canInstantiate(d.getDependsOn()))
                results.add((TNodeType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TNodeType.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7a5f7b20-04ec-4947-a71e-4996e24574df")
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
     * Get the values of the 'relationships' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f3b54cd3-69b6-493c-b68a-5c62f4a787a4")
    public List<TRelationshipType> getRelationships() {
        List<TRelationshipType> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "relationships")
              && TRelationshipType.canInstantiate(d.getDependsOn()))
                results.add((TRelationshipType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRelationshipType.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for property 'TServiceTemplate.substitutableNodeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cf07cff6-665f-436c-94fd-67e576522ed6")
    public String getSubstitutableNodeType() {
        String value = this.elt.getProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TServiceTemplate.tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bc6dce23-d636-4923-8c7a-90bc8d2bffb4")
    public String getTags() {
        String value = this.elt.getProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TServiceTemplate.MdaTypes.TAGS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TServiceTemplate.MdaTypes.TAGS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TServiceTemplate.MdaTypes.TAGS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TServiceTemplate.targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1df4b4ee-2add-45e3-b912-982f592c208c")
    public String getTargetNamespace() {
        String value = this.elt.getProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TServiceTemplate.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TServiceTemplate.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TServiceTemplate.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8c5ea5fe-642e-4b45-96fa-e5c8fa8603d4")
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

    @objid ("ea3f7a16-18f5-48e5-9150-8be84ea5ca36")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'groups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2d38eed2-92f9-4a2f-84cf-04d39707558b")
    public boolean removeGroups(final TGroup obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Remove a value from the 'nodeTypes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5936766d-b6b4-45e7-a9ea-5491bb5bfa8c")
    public boolean removeNodeTypes(final TNodeType obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Remove a value from the 'relationships' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bc60145e-5574-4c58-9bf4-fcb116330597")
    public boolean removeRelationships(final TRelationshipType obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Setter for property 'TServiceTemplate.boundaryDefinitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a16430ec-4973-462f-806b-fe0c6d8a0904")
    public void setBoundaryDefinitions(final String value) {
        this.elt.setProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                             TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TServiceTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("98763646-4123-4829-8b4c-21a6e5cc7a0b")
    public void setId(final String value) {
        this.elt.setProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                             TServiceTemplate.MdaTypes.ID_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TServiceTemplate.MdaTypes.ID_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TServiceTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("869c53cb-bd74-43c0-9540-52bb3d7c0f88")
    public void setName(final String value) {
        this.elt.setProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                             TServiceTemplate.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TServiceTemplate.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("24bd042d-5acc-4b98-9abc-fd618332eeac")
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
     * Setter for property 'TServiceTemplate.substitutableNodeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fc5320c6-bfe2-45d9-9a9e-5d99c7f76a60")
    public void setSubstitutableNodeType(final String value) {
        this.elt.setProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                             TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TServiceTemplate.tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6248df99-6c00-46c2-9408-ff568c5f0167")
    public void setTags(final String value) {
        this.elt.setProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                             TServiceTemplate.MdaTypes.TAGS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TServiceTemplate.MdaTypes.TAGS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TServiceTemplate.targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("57c51c67-0a27-4d84-9914-c7cb84c52002")
    public void setTargetNamespace(final String value) {
        this.elt.setProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                             TServiceTemplate.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TServiceTemplate.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c62f91c3-a4ea-4203-8a8e-b719e3ba62a7")
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

    @objid ("03775316-9b26-490e-819d-0497afcb9ff9")
    protected  TServiceTemplate(final Package elt) {
        this.elt = elt;
    }

    @objid ("7e5b7f91-d9cb-42d3-bd18-54c3ee07b11f")
    public static final class MdaTypes {
        @objid ("6faa3d5e-4884-4972-9d8b-3cb79996a3a7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c4bd8fcf-031d-4dc4-88df-1cdb88b9a4e6")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("c75c8822-d034-43d3-a4c9-6d72c8f911d3")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("ca9ae432-ac9e-49c2-bfe4-9ce1c62b419e")
        public static PropertyDefinition SUBSTITUTABLENODETYPE_PROPERTY_ELT;

        @objid ("e2fcb312-c529-44a6-bffb-d18c26d66435")
        public static PropertyDefinition TAGS_PROPERTY_ELT;

        @objid ("96a088de-56ac-4a41-ba1e-0b891f887daa")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("aa2fc406-9017-4c4f-91d2-185c8fe036b6")
        public static PropertyDefinition BOUNDARYDEFINITIONS_PROPERTY_ELT;

        @objid ("de118a3d-b245-40e1-ac6a-33da3721e644")
        private static Stereotype MDAASSOCDEP;

        @objid ("46d54675-1bc1-4f5d-a269-010b9523d3ac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("693ba8cf-1ef0-458f-a25f-aac708cc1ef5")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "09682faf-27b8-4c4b-a5e6-22fe18303161", "TServiceTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "38d584e8-a8fd-4a07-9ccb-48a03bd4fd1c", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "389a946d-a1b9-4a7d-9029-f6d2a6e1300c", "id");
            ID_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ID_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a98375ac-db7d-41f4-8316-7f8cef3dfecf", "substitutableNodeType");
            SUBSTITUTABLENODETYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (SUBSTITUTABLENODETYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d0cd7ce7-c73a-4738-8eac-88f2b007927a", "tags");
            TAGS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TAGS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "c099e5c2-f307-48e8-9542-f9225cb5fd83", "targetNamespace");
            TARGETNAMESPACE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TARGETNAMESPACE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "5a3a745d-2aed-4def-b0db-f11b198ded44", "boundaryDefinitions");
            BOUNDARYDEFINITIONS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (BOUNDARYDEFINITIONS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

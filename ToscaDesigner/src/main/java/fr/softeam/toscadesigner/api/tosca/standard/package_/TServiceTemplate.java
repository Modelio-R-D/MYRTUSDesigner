/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 15:42 by Modelio Studio.
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
    @objid ("511f43fa-9922-4363-b7ac-2f88a5881fab")
    public static final String STEREOTYPE_NAME = "TServiceTemplate";

    @objid ("52bd69c0-ed5a-43e3-84b8-9f4a82b8bba4")
    public static final String BOUNDARYDEFINITIONS_PROPERTY = "boundaryDefinitions";

    @objid ("15164f56-e435-4b04-b683-925c1861c312")
    public static final String ID_PROPERTY = "id";

    @objid ("2bc45562-87ca-4a8e-bf83-570bad58975e")
    public static final String NAME_PROPERTY = "name";

    @objid ("548c48d3-44e4-4d24-ade7-a0f04d0f6fae")
    public static final String SUBSTITUTABLENODETYPE_PROPERTY = "substitutableNodeType";

    @objid ("95e89b81-ac37-41f3-8a27-54c6d97dcab0")
    public static final String TAGS_PROPERTY = "tags";

    @objid ("33a6130b-8ed4-4477-93e3-25e0caf3ce04")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("14f38b73-a1a2-4fa7-9243-5635a6bd03a0")
    protected final Package elt;

    /**
     * Tells whether a {@link TServiceTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TServiceTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2c9768ef-44c8-435d-b857-6dedd1c24381")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (TServiceTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(TServiceTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << TServiceTemplate >> then instantiate a {@link TServiceTemplate} proxy.
     * 
     * @return a {@link TServiceTemplate} proxy on the created {@link Package}.
     */
    @objid ("4ac84099-950e-4f7e-90e8-c0afda0f1b9f")
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
    @objid ("da1896ab-9b58-4d9f-9c39-596986e94bcd")
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
    @objid ("b6578b35-bcc7-4262-a4c9-3fd850eb1f34")
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
    @objid ("dcadb48c-aae3-4cbc-9a19-c8d8e7f6cde2")
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
    @objid ("3a68d178-08f0-49bf-af48-740c9d17a16a")
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
    @objid ("50ff4353-ee3a-4fa2-8e44-55485814323b")
    public void addRelationships(final TRelationshipType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TServiceTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("relationships");
            d.putTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE, "relationships");
        }
    }

    @objid ("42430c32-5f7f-40aa-ba70-43cbb7db1018")
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
    @objid ("8a939c3e-5ee3-494e-9dbb-6b69c1c9a293")
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
    @objid ("cf7db60c-4654-4cde-a863-9e285bfc5552")
    public Package getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'groups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c3369b05-5b06-40ce-9cfd-d21e2080fc18")
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
    @objid ("c7b00a2c-bd78-48ef-be2c-0108bdcc168c")
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
    @objid ("f040610f-7807-4284-86af-91dcd0f155c4")
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
    @objid ("0c2f1383-9bdb-4779-bf66-ba8c0ec30f9e")
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
    @objid ("ef56b20b-cfa1-4bb0-81f2-cde094d2b3ad")
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
    @objid ("f71c4c1f-a487-41a1-81f4-21dafdf67dd5")
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
    @objid ("04675af4-a048-4eed-b946-2b9f0fe79a65")
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
    @objid ("8dec43f6-2d70-48ca-9599-5c98bd63c52f")
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
    @objid ("1113d008-89b5-4052-818a-c6fadaf75e10")
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
    @objid ("f4960343-ba7d-486c-9d75-76bb30a327c2")
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

    @objid ("f4382941-776e-49e2-ba0e-cef9b8d6d67b")
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
    @objid ("1a89481f-22e6-454e-ae8c-8c818ed3f6a5")
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
    @objid ("999e48f2-7277-4433-95e7-8b481f3a5662")
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
    @objid ("b2a8ea43-6a88-4d42-96df-a7642a6944e7")
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
    @objid ("aefe55fc-0358-4a86-af84-bbf36fce6944")
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
    @objid ("5baa8375-694d-483e-bfa8-56038f6ab8b7")
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
    @objid ("1233b88d-8982-4dee-87e7-e4dc073fb4a9")
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
    @objid ("7cd98967-8076-4e9f-9eea-67b89062e08e")
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
    @objid ("8e0dd446-8da3-40b5-8466-b4b1dc988197")
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
    @objid ("a135b187-27b1-47b1-9e3a-5eaa316a293a")
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
    @objid ("8ade32ca-f374-416c-80a6-97b700aff467")
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
    @objid ("a4b3ca23-7aab-4545-9d8d-105db9b79dcf")
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

    @objid ("3a940d4e-6a12-43a4-aa53-36efce8a9b08")
    protected  TServiceTemplate(final Package elt) {
        this.elt = elt;
    }

    @objid ("7e5b7f91-d9cb-42d3-bd18-54c3ee07b11f")
    public static final class MdaTypes {
        @objid ("4753d8bb-64c4-450c-ac9f-44f4845a6b2a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ce1394b2-a6ba-480a-8253-52cf448f938a")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("b6efebff-4d8b-4939-9b7c-72001236d5e1")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("0aa9fc35-7401-4919-bc01-95b9f4d50215")
        public static PropertyDefinition SUBSTITUTABLENODETYPE_PROPERTY_ELT;

        @objid ("c4da3579-d01d-488d-81fe-89b6d75f1c46")
        public static PropertyDefinition TAGS_PROPERTY_ELT;

        @objid ("d310b744-d818-4408-91e5-a02cdc2b4c88")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("5e3b2919-3d3c-4959-9334-8a7f147c2c5f")
        public static PropertyDefinition BOUNDARYDEFINITIONS_PROPERTY_ELT;

        @objid ("eb188cb0-958e-4d2a-9e4f-98d065c792ec")
        private static Stereotype MDAASSOCDEP;

        @objid ("23e2d967-2c82-4a26-8ae0-1bd1c30be48a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cc2d72a8-a4ee-44fb-95db-2d97de1f7445")
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

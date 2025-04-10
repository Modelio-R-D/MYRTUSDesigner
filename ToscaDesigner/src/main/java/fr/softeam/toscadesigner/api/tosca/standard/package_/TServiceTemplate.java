/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:09 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.class_.TTopologyTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.Tgroup;
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
@objid ("4ada64b1-ab87-4e0a-abae-4dc944e1fbcf")
public class TServiceTemplate implements IMdaProxy {
    @objid ("00a41a76-0dd9-4144-953c-56002365b840")
    public static final String STEREOTYPE_NAME = "TServiceTemplate";

    @objid ("3c4c105b-a22b-454e-97d5-fa5c89b22893")
    public static final String BOUNDARYDEFINITIONS_PROPERTY = "boundaryDefinitions";

    @objid ("440fd122-acf1-4adb-85a5-746954c670c0")
    public static final String ID_PROPERTY = "id";

    @objid ("bab8932b-5d31-46c5-afc0-48be8c51a5ea")
    public static final String NAME_PROPERTY = "name";

    @objid ("fd9de100-f6e3-489a-8e6e-039c212e1e4c")
    public static final String SUBSTITUTABLENODETYPE_PROPERTY = "substitutableNodeType";

    @objid ("1e083009-8428-453e-9dc4-179644543ca6")
    public static final String TAGS_PROPERTY = "tags";

    @objid ("5bda6d5a-3e1c-4a13-88ee-9e40f520ccb0")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("8142bee8-a088-4cdc-9871-32b0ea01ca20")
    protected final Package elt;

    /**
     * Tells whether a {@link TServiceTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TServiceTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("883189d8-68b9-4a94-b466-cd80b73f01d3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (TServiceTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(TServiceTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << TServiceTemplate >> then instantiate a {@link TServiceTemplate} proxy.
     * 
     * @return a {@link TServiceTemplate} proxy on the created {@link Package}.
     */
    @objid ("e85700d4-b037-4ce2-81a2-55fe82695c36")
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
    @objid ("a7059ba8-e97e-4e16-ab7d-583e8cda4001")
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
    @objid ("2807fc15-003c-49dd-a12c-adc74ffd87c3")
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
    @objid ("515d5fce-ef24-48cd-9e4e-236539baa4f8")
    public void addGroups(final Tgroup obj) {
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
    @objid ("9cd8ede5-db5b-4359-b185-c89e47b447f9")
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
    @objid ("677f4313-277e-42b4-8525-a3752c1645e8")
    public void addRelationships(final TRelationshipType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TServiceTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("relationships");
            d.putTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE, "relationships");
        }
    }

    @objid ("fb9b5b75-e9f6-4b4a-97db-4264429d33ed")
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
    @objid ("bfe65472-eb91-47b3-b718-1b3fb4ae9d69")
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
    @objid ("463285f6-eef8-4c91-b3d2-b404e792a021")
    public Package getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'groups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("df47a0db-11c6-4daf-947b-3f01315990fc")
    public List<Tgroup> getGroups() {
        List<Tgroup> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "groups")
              && Tgroup.canInstantiate(d.getDependsOn()))
                results.add((Tgroup)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), Tgroup.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for property 'TServiceTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("be691eea-b5bc-49c6-a17e-2ff29f3875dd")
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
    @objid ("c89efdc3-7da4-4d69-a1c3-15cf81c94472")
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
    @objid ("1e9ddf0b-86a2-4ef3-9c1b-3d53607827fa")
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
    @objid ("47e61eac-09a5-43a6-92d5-f4d04a782feb")
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
    @objid ("1ef5ef11-6c4f-4afb-b74d-79fce5640b96")
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
    @objid ("b8118630-e9d1-48a9-b656-7baa1fa87bc0")
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
    @objid ("748e6e2a-9d1f-48db-83fe-d821c76505c4")
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
    @objid ("850679af-bca3-4764-a102-7a583bafbf3b")
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
    @objid ("ec098588-1ecb-49f8-9333-2b6cc17b2b8b")
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

    @objid ("cb48fc55-87fc-4bd4-8d30-2008d8871fb3")
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
    @objid ("320b3de9-f1b0-417f-bdc1-8a04f07937cf")
    public boolean removeGroups(final Tgroup obj) {
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
    @objid ("f54adead-8e02-4ef3-99ba-61571c0efc90")
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
    @objid ("f92372b0-79d9-411f-b884-6b2ae8bb4ee4")
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
    @objid ("cd015bef-fcd4-4262-b03e-5df97ebcdb6d")
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
    @objid ("ca493b51-a962-4aa4-beed-d1cc54a05271")
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
    @objid ("46838b20-c7e4-4dbf-b34c-d0fc69e1b042")
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
    @objid ("a186e34b-a55b-4118-8051-2ba046ee5022")
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
    @objid ("e245b3ce-a3b2-4d5b-b82b-e06a03c140f5")
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
    @objid ("019dc3b5-5126-4fcf-a08e-553419131802")
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
    @objid ("ab4d211a-f85d-4a1c-a03f-0a855b52efd8")
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
    @objid ("3c63f10f-bf30-4153-b8f7-17cd91e2fe49")
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

    @objid ("bb2df97b-720d-4cea-88e5-e3280d45b906")
    protected  TServiceTemplate(final Package elt) {
        this.elt = elt;
    }

    @objid ("0506712d-281c-4bc9-a5f4-58ac9416af50")
    public static final class MdaTypes {
        @objid ("7fa550bf-4342-46b0-a1a0-34047d2486a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7d237746-e62f-428c-aaee-623c07614f9c")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("0704fdd6-0e1f-4788-a3dd-8deb5b0602bc")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("5dbee8c5-8d63-4873-86ed-f612c07b26a9")
        public static PropertyDefinition SUBSTITUTABLENODETYPE_PROPERTY_ELT;

        @objid ("2b7127a7-963a-42fc-b196-cbe3e15120b9")
        public static PropertyDefinition TAGS_PROPERTY_ELT;

        @objid ("d94555cb-1023-4ce2-835e-9a725aea206b")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("b0286a93-228c-4ab7-b354-aa0d229d49d0")
        public static PropertyDefinition BOUNDARYDEFINITIONS_PROPERTY_ELT;

        @objid ("585ae323-16c6-49aa-9567-183b3e540b5f")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e407d60-5354-493f-9438-5c15ea52d52e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("89fb07c8-b1ac-4ab2-9c99-fc6799bfefd5")
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

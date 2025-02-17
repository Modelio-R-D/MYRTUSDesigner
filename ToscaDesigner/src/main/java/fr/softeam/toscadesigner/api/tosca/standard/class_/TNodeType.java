/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 15:39 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImportElement;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.InterfacesType;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.PropertiesDefinitionType;
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
 * Proxy class to handle a {@link Class} with << TNodeType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("df479288-aab7-4f9b-b54f-475aef22763f")
public class TNodeType extends TEntityType implements IMdaProxy {
    @objid ("856d032f-8723-4a16-878f-9b6f0c4ce235")
    public static final String STEREOTYPE_NAME = "TNodeType";

    /**
     * Tells whether a {@link TNodeType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("562c998a-de1c-49ee-8224-d85927fb5667")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeType >> then instantiate a {@link TNodeType} proxy.
     * 
     * @return a {@link TNodeType} proxy on the created {@link Class}.
     */
    @objid ("f7245d64-52f9-44c3-8164-caeee7eea3b9")
    public static TNodeType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TNodeType.MdaTypes.STEREOTYPE_ELT);
        return TNodeType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TNodeType} proxy from a {@link Class} stereotyped << TNodeType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TNodeType} proxy or <i>null</i>.
     */
    @objid ("57020135-3815-4429-931f-50e339a36439")
    public static TNodeType instantiate(final Class obj) {
        return TNodeType.canInstantiate(obj) ? new TNodeType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TNodeType} proxy from a {@link Class} stereotyped << TNodeType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TNodeType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ac3fbba2-64f6-4245-ba7b-4f52e0d7f733")
    public static TNodeType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TNodeType.canInstantiate(obj))
        	return new TNodeType(obj);
        else
        	throw new IllegalArgumentException("TNodeType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'imports' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cb969d73-3f88-4872-9595-5c33d7297bab")
    public void addImports(final ImportElement obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TNodeType.MdaTypes.MDAASSOCDEP);
            d.setName("imports");
            d.putTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE, "imports");
        }
    }

    /**
     * Add a value to the 'properties' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b24d21c2-f74c-410d-ae4d-c9e0651866c9")
    public void addProperties(final PropertiesDefinitionType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TNodeType.MdaTypes.MDAASSOCDEP);
            d.setName("properties");
            d.putTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE, "properties");
        }
    }

    @objid ("dc7351d1-1c31-4588-bb68-4c4f8894b494")
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
        TNodeType other = (TNodeType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'capabilityDefinitions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2b79d656-0e06-4424-8642-f928b924aea1")
    public TCapabilityDefinitionsType getCapabilityDefinitions() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "capabilityDefinitions")
                  && TCapabilityDefinitionsType.canInstantiate(d.getDependsOn())) {
                     return (TCapabilityDefinitionsType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TCapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'derivedFrom' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("71eed424-bcec-48d4-bd97-6bcde205b21c")
    public TEntityType getDerivedFrom() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "derivedFrom")
                  && TEntityType.canInstantiate(d.getDependsOn())) {
                     return (TEntityType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TEntityType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f7c0f56e-fc60-46cb-b36a-495f059f3c04")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'imports' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ca7f0f5e-ab85-4cce-a290-ac7abfa1817d")
    public List<ImportElement> getImports() {
        List<ImportElement> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "imports")
              && ImportElement.canInstantiate(d.getDependsOn()))
                results.add((ImportElement)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), ImportElement.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'instanceStates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ee5dea25-0d25-468c-b170-273457a688eb")
    public TTopologyElementInstanceStates getInstanceStates() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "instanceStates")
                  && TTopologyElementInstanceStates.canInstantiate(d.getDependsOn())) {
                     return (TTopologyElementInstanceStates)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'interfaces' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8d9d6f6d-8a23-462e-a58c-be56ad2763ee")
    public InterfacesType getInterfaces() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "interfaces")
                  && InterfacesType.canInstantiate(d.getDependsOn())) {
                     return (InterfacesType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), InterfacesType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'properties' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e3af0b6e-59b4-40a7-9370-89e99dbfff2d")
    public List<PropertiesDefinitionType> getProperties() {
        List<PropertiesDefinitionType> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "properties")
              && PropertiesDefinitionType.canInstantiate(d.getDependsOn()))
                results.add((PropertiesDefinitionType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), PropertiesDefinitionType.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'requirementDefinitions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5ef4b553-b577-4db5-8fc8-d578ed4bb068")
    public TRequirementDefinitionType getRequirementDefinitions() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "requirementDefinitions")
                  && TRequirementDefinitionType.canInstantiate(d.getDependsOn())) {
                     return (TRequirementDefinitionType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("140191a1-28e6-472a-bff6-0c225412833e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'imports' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5a195208-dc7c-493c-9722-c93c3b035bf9")
    public boolean removeImports(final ImportElement obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Remove a value from the 'properties' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4dcb91df-3e67-47fd-9a20-890eddb8478c")
    public boolean removeProperties(final PropertiesDefinitionType obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Set the value of the 'capabilityDefinitions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d0ea7eca-171b-4bde-a5e2-bf7efa04ff66")
    public void setCapabilityDefinitions(final TCapabilityDefinitionsType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "capabilityDefinitions")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TNodeType.MdaTypes.MDAASSOCDEP);
              dep.setName("capabilityDefinitions");      dep.putTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE, "capabilityDefinitions");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Set the value of the 'derivedFrom' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b9f020da-437d-4b67-addd-c46823ebb6c4")
    public void setDerivedFrom(final TEntityType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "derivedFrom")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TNodeType.MdaTypes.MDAASSOCDEP);
              dep.setName("derivedFrom");      dep.putTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE, "derivedFrom");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Set the value of the 'instanceStates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("484717af-0ec1-40a1-bc48-74eae572e56d")
    public void setInstanceStates(final TTopologyElementInstanceStates obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "instanceStates")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TNodeType.MdaTypes.MDAASSOCDEP);
              dep.setName("instanceStates");      dep.putTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE, "instanceStates");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Set the value of the 'interfaces' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b86d30a4-5c77-451d-9703-91ff11b5b1a6")
    public void setInterfaces(final InterfacesType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "interfaces")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TNodeType.MdaTypes.MDAASSOCDEP);
              dep.setName("interfaces");      dep.putTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE, "interfaces");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Set the value of the 'requirementDefinitions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("41d250b9-d341-4f97-b2ca-b23b952a042f")
    public void setRequirementDefinitions(final TRequirementDefinitionType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TNodeType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE), "requirementDefinitions")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TNodeType.MdaTypes.MDAASSOCDEP);
              dep.setName("requirementDefinitions");      dep.putTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE, "requirementDefinitions");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    @objid ("db4268f7-92b8-4786-85a1-d693a9def437")
    protected  TNodeType(final Class elt) {
        super(elt);
    }

    @objid ("50499307-bbbe-4e1a-b479-59b290a6e892")
    public static final class MdaTypes {
        @objid ("56702918-5be4-4c10-b558-3ddf4fe6e7c0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9e0b429c-d2b9-4e9e-9e62-56c7f9906f62")
        private static Stereotype MDAASSOCDEP;

        @objid ("4fa95cde-f614-4cfe-90ac-7266004dae2a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("77d4100d-0f59-421f-9312-fffeb9139409")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "47cdd09e-013d-4670-b757-f5736d2bb48c", "TNodeType");
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

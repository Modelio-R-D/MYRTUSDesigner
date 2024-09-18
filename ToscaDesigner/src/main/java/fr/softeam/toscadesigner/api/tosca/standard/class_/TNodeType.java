/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 13:03 by Modelio Studio.
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
@objid ("ee3b057d-5f6b-4a82-ba1a-30afa22c6a20")
public class TNodeType extends TEntityType implements IMdaProxy {
    @objid ("3e0976ff-fd78-418d-b046-fb71681ce840")
    public static final String STEREOTYPE_NAME = "TNodeType";

    /**
     * Tells whether a {@link TNodeType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e525348f-2255-40e3-9de0-f7a4d021739e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeType >> then instantiate a {@link TNodeType} proxy.
     * 
     * @return a {@link TNodeType} proxy on the created {@link Class}.
     */
    @objid ("317c1857-5974-4fb9-a446-fabf76d46a54")
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
    @objid ("87b93439-ee1a-44a6-9fe4-a61136b2f677")
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
    @objid ("361690e4-5e7d-430d-8020-596a47153766")
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
    @objid ("84706145-7166-4932-ad0c-0976990e5a7d")
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
    @objid ("41f73be3-1092-45d0-9cc3-82d999ea2744")
    public void addProperties(final PropertiesDefinitionType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TNodeType.MdaTypes.MDAASSOCDEP);
            d.setName("properties");
            d.putTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE, "properties");
        }
    }

    @objid ("f19c32a1-c3fe-415c-a285-e5d129ede2e9")
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
    @objid ("b6a17f12-64da-4837-ae58-da6fb81d8928")
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
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("095584cd-5289-42b6-b542-a2ab1982bfc3")
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
    @objid ("d1d5ef0d-b61d-4221-b38a-125a1565b17e")
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
    @objid ("fc462353-4ebf-4928-9151-6aa345e1ae13")
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
    @objid ("42b4340e-748d-4800-84a1-6eb1601efda0")
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
    @objid ("a3b8e008-2ff4-48a3-8c78-5822a10883c1")
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
    @objid ("e88c29c3-16a4-409f-84ec-ce826c85e7db")
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

    @objid ("d0264b36-0622-4d89-b1d6-102a3a0cd442")
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
    @objid ("00c56a8a-0d9b-44e2-a964-6b171557c40f")
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
    @objid ("39305db6-319f-44a2-a8a5-3d539310ace4")
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
    @objid ("374ab938-b9c4-490a-8949-18317a6b2703")
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
     * Set the value of the 'instanceStates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5f0a1c3a-14e3-4dfb-9e0d-b68bb08ea51e")
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
    @objid ("1b887f30-8709-457e-a09f-47fe42db8594")
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
    @objid ("9d58491e-0b20-4335-a3d2-64879b76ff2a")
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

    @objid ("77431a0b-e6f8-4390-9805-9bb2dcefaa04")
    protected  TNodeType(final Class elt) {
        super(elt);
    }

    @objid ("67582cff-b523-4294-8745-d390fc0fb9ba")
    public static final class MdaTypes {
        @objid ("d3a4b66e-dcb1-4d53-a101-765a3d072b6a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("68ab5bc4-b6f9-4863-b312-22371e835b19")
        private static Stereotype MDAASSOCDEP;

        @objid ("7e6b2b3a-9afe-4060-aa94-504cae180630")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("27a39ec5-053b-4c86-b792-1ad744060a98")
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

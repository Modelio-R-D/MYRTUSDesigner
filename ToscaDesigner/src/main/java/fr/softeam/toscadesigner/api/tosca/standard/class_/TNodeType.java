/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/10/2024 11:40 by Modelio Studio.
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
    @objid ("72ed7ef6-2397-4d26-8bd1-38a3e41b6f98")
    public static final String STEREOTYPE_NAME = "TNodeType";

    /**
     * Tells whether a {@link TNodeType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8b4fadf2-55db-4e0e-a2c1-11fb30513430")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeType >> then instantiate a {@link TNodeType} proxy.
     * 
     * @return a {@link TNodeType} proxy on the created {@link Class}.
     */
    @objid ("253dea90-14b8-4182-875b-090cca0b91ff")
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
    @objid ("c06d5866-25e3-47d6-82d7-def08a564d60")
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
    @objid ("939ecc13-5f31-4bf1-992c-b605171868ab")
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
    @objid ("14b557c2-e9ea-4690-be49-f18da743c155")
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
    @objid ("6a450e67-b9e2-4e59-8c8f-2dbc73a65b24")
    public void addProperties(final PropertiesDefinitionType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TNodeType.MdaTypes.MDAASSOCDEP);
            d.setName("properties");
            d.putTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE, "properties");
        }
    }

    @objid ("9465aede-873c-43cc-a92c-529f02b1df39")
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
    @objid ("73ba8554-f88f-4acf-9070-d388d3cf4169")
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
    @objid ("90a340e5-877b-468f-88bc-193218be6be4")
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
    @objid ("0e96005d-aa63-4f2a-ab82-56eb5aa39c93")
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
    @objid ("e823cebf-3bd9-459b-858c-7d90b8e4d328")
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
    @objid ("63751eee-686f-4039-a587-f23a49414f6a")
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
    @objid ("808b3364-5cee-4017-87c0-b7d74ab59bce")
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
    @objid ("85297283-3f78-4b9a-8b91-b02312bd612d")
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

    @objid ("3b71b593-0706-4c16-ab8b-a04fefc28782")
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
    @objid ("5da80e0c-d4f4-403c-9d0d-e8aadd25fa71")
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
    @objid ("0ed09ccf-a9ca-4fac-8488-4de64c38a4dc")
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
    @objid ("27781de6-8b7a-4d81-b584-d59c47ed9af4")
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
    @objid ("3a031a17-ff7b-43d0-be0d-ac1d6db4700d")
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
    @objid ("6bc66cb0-7191-46c2-b72e-69fe2b7d328f")
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
    @objid ("eb52ffe2-c2b5-43b9-8672-87e1735d2e27")
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

    @objid ("c6aef75a-fa83-42fe-839b-50c28ebb61d8")
    protected  TNodeType(final Class elt) {
        super(elt);
    }

    @objid ("67582cff-b523-4294-8745-d390fc0fb9ba")
    public static final class MdaTypes {
        @objid ("618a3ff7-a341-49fe-b6ae-9a7aa994bf2c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("12436e31-ed13-4026-be8f-8bb617372c2a")
        private static Stereotype MDAASSOCDEP;

        @objid ("c8af0401-cdf2-459b-b521-485540ef5c35")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("29b5de2f-7aa2-4f40-8e4a-d68ec291ca7e")
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

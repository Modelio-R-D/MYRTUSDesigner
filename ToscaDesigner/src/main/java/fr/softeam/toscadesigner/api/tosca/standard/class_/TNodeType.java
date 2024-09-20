/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 19/09/2024 15:04 by Modelio Studio.
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
    @objid ("8d685674-031d-495d-aa2c-ddc32e604db5")
    public static final String STEREOTYPE_NAME = "TNodeType";

    /**
     * Tells whether a {@link TNodeType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c41da656-b518-4f45-ad9f-e90c317915f6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeType >> then instantiate a {@link TNodeType} proxy.
     * 
     * @return a {@link TNodeType} proxy on the created {@link Class}.
     */
    @objid ("3bcdb4ee-cb81-47e4-93fe-653674bb9125")
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
    @objid ("c6a889db-a4e2-4969-bd0f-e20419dc17eb")
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
    @objid ("1b755cb4-4bbf-46d2-bbbf-51de81214a30")
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
    @objid ("f274b173-5de7-418e-a683-f7740b46f66c")
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
    @objid ("d79fcbf4-a18f-4920-bd85-a8607c75deee")
    public void addProperties(final PropertiesDefinitionType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TNodeType.MdaTypes.MDAASSOCDEP);
            d.setName("properties");
            d.putTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE, "properties");
        }
    }

    @objid ("31f1acaf-bb51-41d0-8cb9-59137eed9a5b")
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
    @objid ("a3dbafea-996f-42ae-81b2-d024e5f246e3")
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
    @objid ("1d7eb17d-4605-4f17-b1de-ddd2392b8b14")
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
    @objid ("45900501-75a4-4a8a-bf49-e50d3d769812")
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
    @objid ("ea2f2779-a152-433e-9d78-6c98ee08072f")
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
    @objid ("cef827e6-fd70-451e-8a18-e04d9135742e")
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
    @objid ("c2ab8e89-ac4e-420b-9465-d3e4a5bcb6b8")
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
    @objid ("a2390d2a-e732-43b2-aae6-950304ef0b12")
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

    @objid ("0e172c18-ea74-4d92-b169-ff8960da3fcf")
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
    @objid ("19cef9e2-d092-4fc6-86b0-793f48ae2f02")
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
    @objid ("6410990d-cd4a-4943-b120-54bc99dace14")
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
    @objid ("41743504-be56-4900-8c75-6ddf568229c2")
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
    @objid ("9bd58fdc-9913-4ecb-8c73-06412c64eed4")
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
    @objid ("02dd8424-053b-40d8-addd-8ecf52694b4a")
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
    @objid ("b2496776-ee15-4e59-ad57-90515ff7d110")
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

    @objid ("3dadbd14-cb28-4671-8a43-ce3420c1925a")
    protected  TNodeType(final Class elt) {
        super(elt);
    }

    @objid ("67582cff-b523-4294-8745-d390fc0fb9ba")
    public static final class MdaTypes {
        @objid ("9cc15e18-9e73-46aa-afd3-77ef1cd1f77b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("92735007-50c2-4ad2-a999-53404c4a0fa5")
        private static Stereotype MDAASSOCDEP;

        @objid ("deddba00-266c-42c1-baf4-50bf3ad64e47")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e04eb22f-78c2-42c2-86ab-d969d9b754bc")
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

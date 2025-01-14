/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 17:57 by Modelio Studio.
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
    @objid ("24883930-ed5b-40b4-8b35-d1e74d1a234e")
    public static final String STEREOTYPE_NAME = "TNodeType";

    /**
     * Tells whether a {@link TNodeType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9d884de8-13d1-4041-a73f-ec1bec04ebfb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeType >> then instantiate a {@link TNodeType} proxy.
     * 
     * @return a {@link TNodeType} proxy on the created {@link Class}.
     */
    @objid ("408d5e43-c2f4-48c2-8078-1e006471a54b")
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
    @objid ("85f9e31e-0a4e-4b6d-8d0c-ebae9a6442d2")
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
    @objid ("129334c8-fb44-429d-83c3-c7dc5b06269e")
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
    @objid ("ffb340b3-2b67-484b-a70f-206ff23a4b58")
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
    @objid ("a7140b7f-0a6f-4a8e-a248-0ff1fd06864f")
    public void addProperties(final PropertiesDefinitionType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TNodeType.MdaTypes.MDAASSOCDEP);
            d.setName("properties");
            d.putTagValue(TNodeType.MdaTypes.MDAASSOCDEP_ROLE, "properties");
        }
    }

    @objid ("c53296ec-a5d3-429c-99d2-9a10f10d34c2")
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
    @objid ("ff387edd-7c7b-4cbf-86a5-76f3c844ee92")
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
    @objid ("0268799f-e4bf-4363-b4d8-dfb3d23a9247")
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
    @objid ("92b3415d-4999-4393-a187-5e5233800d56")
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
    @objid ("10206bc2-9680-49ff-92b7-d9aa22c34c2c")
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
    @objid ("350f5b53-506d-4845-86d9-40a1112774c4")
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
    @objid ("739a4176-bcca-41ad-990a-ccfda770311f")
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
    @objid ("1391da91-f043-4d55-8ab6-6f6cd7a4cbbb")
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

    @objid ("a710bbcc-2dde-4be6-a499-a357042de7f8")
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
    @objid ("c29ee9ff-ea51-42e5-971f-8fff4461c9e2")
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
    @objid ("f59366bd-ea8b-449e-805e-ebbc6dd0fd99")
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
    @objid ("ec367b20-1f63-457b-a786-79610f650c28")
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
    @objid ("9eee216a-4e20-4fbc-94d9-13f123a0cd1c")
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
    @objid ("92243918-8aa4-4e3b-8ea9-f049c5d1db80")
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
    @objid ("7f81a93e-72ad-4db7-8f5d-b54df3fb8f68")
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

    @objid ("fc495bdd-114b-4d79-aba4-3e8f6a46e8d9")
    protected  TNodeType(final Class elt) {
        super(elt);
    }

    @objid ("67582cff-b523-4294-8745-d390fc0fb9ba")
    public static final class MdaTypes {
        @objid ("245da306-54d2-4d49-8f54-ac245fc79c0c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("72039fe5-f20c-4398-835e-ec32a7bb936c")
        private static Stereotype MDAASSOCDEP;

        @objid ("4817039b-492d-4c24-b5f3-5d4a55041c10")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c32b5c30-78f3-41a0-92f9-d0e3564adc6b")
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

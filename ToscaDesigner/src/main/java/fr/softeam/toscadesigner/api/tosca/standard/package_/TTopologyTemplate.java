/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 11:20 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImportElement;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensibleElements;
import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
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
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Package} with << TTopologyTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cc9210a0-d039-42eb-b71a-18484fad938c")
public class TTopologyTemplate extends TExtensibleElements implements IMdaProxy {
    @objid ("b8ecbe5e-a951-43ec-ad2e-975f70135e0a")
    public static final String STEREOTYPE_NAME = "TTopologyTemplate";

    /**
     * Tells whether a {@link TTopologyTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TTopologyTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("95ea8f1a-a862-4444-8157-e9e5f089f9a0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (TTopologyTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(TTopologyTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << TTopologyTemplate >> then instantiate a {@link TTopologyTemplate} proxy.
     * 
     * @return a {@link TTopologyTemplate} proxy on the created {@link Package}.
     */
    @objid ("456b568e-78d3-4efe-81d3-59a45db2ae4f")
    public static TTopologyTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Package");
        e.getExtension().add(TTopologyTemplate.MdaTypes.STEREOTYPE_ELT);
        return TTopologyTemplate.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link TTopologyTemplate} proxy from a {@link Package} stereotyped << TTopologyTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link TTopologyTemplate} proxy or <i>null</i>.
     */
    @objid ("dee0b143-496d-4008-9bda-6646871546c2")
    public static TTopologyTemplate instantiate(final Package obj) {
        return TTopologyTemplate.canInstantiate(obj) ? new TTopologyTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TTopologyTemplate} proxy from a {@link Package} stereotyped << TTopologyTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link TTopologyTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5f6fba7d-caa0-4d31-93e6-e7469a418b9b")
    public static TTopologyTemplate safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (TTopologyTemplate.canInstantiate(obj))
        	return new TTopologyTemplate(obj);
        else
        	throw new IllegalArgumentException("TTopologyTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the '' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c46f7cfd-3429-4395-9db3-705ec45ca070")
    public void add(final ImportElement obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    /**
     * Add a value to the 'groups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("35af2e8b-6174-4775-9876-57134d2450a3")
    public void addGroups(final TGroup obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("groups");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "groups");
        }
    }

    /**
     * Add a value to the 'nodeTemplates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bcea1e42-87f5-4828-b92d-598f0ff72f97")
    public void addNodeTemplates(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("nodeTemplates");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "nodeTemplates");
        }
    }

    /**
     * Add a value to the 'relationshipTemplates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("52ef7340-47e9-4b6f-8b95-f6120bedd4f1")
    public void addRelationshipTemplates(final TRelationshipTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("relationshipTemplates");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "relationshipTemplates");
        }
    }

    @objid ("38bfeb9d-4ade-44ad-8380-38f2ac0f7647")
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
        TTopologyTemplate other = (TTopologyTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the '' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f5433545-5ecf-42f8-98d8-c1919041497d")
    public List<ImportElement> get() {
        List<ImportElement> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")
              && ImportElement.canInstantiate(d.getDependsOn()))
                results.add((ImportElement)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), ImportElement.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("8beb4890-27c9-4649-b3b7-a694cb6314e1")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the value of the 'group' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("55a6fecf-251e-4b5c-b138-f0541bfb2595")
    public Feature getGroup() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "group")
                  && Feature.class.isInstance(d.getDependsOn())) {
                      return (Feature)d.getDependsOn();
              }
        }
        return null;
    }

    /**
     * Get the values of the 'groups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d66fb631-67db-41dc-a298-a126dffc5e7d")
    public List<TGroup> getGroups() {
        List<TGroup> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "groups")
              && TGroup.canInstantiate(d.getDependsOn()))
                results.add((TGroup)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TGroup.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'nodeTemplates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5028068f-0b55-45aa-bf16-997de1c74c93")
    public List<TNodeTemplate> getNodeTemplates() {
        List<TNodeTemplate> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "nodeTemplates")
              && TNodeTemplate.canInstantiate(d.getDependsOn()))
                results.add((TNodeTemplate)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'relationshipTemplates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7731e089-a3a2-4d74-9167-e5c0a2caebcc")
    public List<TRelationshipTemplate> getRelationshipTemplates() {
        List<TRelationshipTemplate> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "relationshipTemplates")
              && TRelationshipTemplate.canInstantiate(d.getDependsOn()))
                results.add((TRelationshipTemplate)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e3d72efe-89bc-44d8-b824-0f19035200e0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the '' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b65d6716-f5d4-43c9-b589-c95a6e05a3da")
    public boolean remove(final ImportElement obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "imports")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Remove a value from the 'groups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("85bab260-9752-4fd6-b273-1091a5ba1fa6")
    public boolean removeGroups(final TGroup obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Remove a value from the 'nodeTemplates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f64251ee-60ff-4f48-abed-06a113d5fee8")
    public boolean removeNodeTemplates(final TNodeTemplate obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Remove a value from the 'relationshipTemplates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("98d7fd19-5bd9-46fa-baa9-48a39f20ee16")
    public boolean removeRelationshipTemplates(final TRelationshipTemplate obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Set the value of the 'group' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("51764bdd-94ac-4a9b-9de5-cad07cf4fe6f")
    public void setGroup(final Feature obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "group")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj, TTopologyTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("group");      dep.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "group");
          }
          dep.setDependsOn(obj);
        }
        
    }

    @objid ("cc598eb6-fe97-4b11-894c-eebcfa93d1ed")
    protected  TTopologyTemplate(final Package elt) {
        super(elt);
    }

    @objid ("41bad76e-a154-4529-9cbc-7adac2a3d503")
    public static final class MdaTypes {
        @objid ("61277ab5-02dd-4215-b03a-4b7d188af87d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2e9bb767-5f58-442b-bdf2-7ff463e6f2c9")
        private static Stereotype MDAASSOCDEP;

        @objid ("4d68a6df-f73c-4bc6-a36b-7e0b972ce296")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f66d7948-1a2b-4fac-8d5e-cada83a84cd4")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "a52f433c-cf19-4033-99c2-81b4af708744", "TTopologyTemplate");
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

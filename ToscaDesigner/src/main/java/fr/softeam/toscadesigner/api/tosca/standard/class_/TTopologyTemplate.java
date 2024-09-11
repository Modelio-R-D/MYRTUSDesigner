/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 14:25 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensibleElements;
import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
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
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TTopologyTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("cc9210a0-d039-42eb-b71a-18484fad938c")
public class TTopologyTemplate extends TExtensibleElements implements IMdaProxy {
    @objid ("d7b4aafd-c214-488f-9b3e-d420b81ce14b")
    public static final String STEREOTYPE_NAME = "TTopologyTemplate";

    /**
     * Tells whether a {@link TTopologyTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TTopologyTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f0ecbff8-c0ba-4fa4-8522-4dde7872b9d1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TTopologyTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TTopologyTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TTopologyTemplate >> then instantiate a {@link TTopologyTemplate} proxy.
     * 
     * @return a {@link TTopologyTemplate} proxy on the created {@link Class}.
     */
    @objid ("dc8b37c3-cd5d-4d11-a9ac-e143beeb1f27")
    public static TTopologyTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TTopologyTemplate.MdaTypes.STEREOTYPE_ELT);
        return TTopologyTemplate.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TTopologyTemplate} proxy from a {@link Class} stereotyped << TTopologyTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TTopologyTemplate} proxy or <i>null</i>.
     */
    @objid ("c2109f35-7d29-495a-80d1-def55aa6db90")
    public static TTopologyTemplate instantiate(final Class obj) {
        return TTopologyTemplate.canInstantiate(obj) ? new TTopologyTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TTopologyTemplate} proxy from a {@link Class} stereotyped << TTopologyTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TTopologyTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c94ec911-e74c-482c-b0b7-3eba4a99bbea")
    public static TTopologyTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
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
    @objid ("538c07f8-8ce0-4b14-89a8-25d773176869")
    public void add(final ImportElement obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    /**
     * Add a value to the 'nodeTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("337254fb-f063-4067-be21-b037fe0fb179")
    public void addNodeTemplate(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("nodeTemplate");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "nodeTemplate");
        }
    }

    /**
     * Add a value to the 'relationshipTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("eb528406-9d7e-4d1c-b40d-fb8155903b0a")
    public void addRelationshipTemplate(final TRelationshipTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("relationshipTemplate");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "relationshipTemplate");
        }
    }

    @objid ("a9455a76-1673-4215-9537-abb4eff2863e")
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
    @objid ("a3ef85d1-e8a1-4b54-a7c7-c3373687dc4d")
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
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("87d879e8-ab3a-4b40-a4d9-cb1577405953")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'group' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c8e614e7-2ed3-458e-98c4-a38a1b1a6c68")
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
     * Get the values of the 'nodeTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8d56e35b-fa94-4116-a388-4a95754928f0")
    public List<TNodeTemplate> getNodeTemplate() {
        List<TNodeTemplate> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "nodeTemplate")
              && TNodeTemplate.canInstantiate(d.getDependsOn()))
                results.add((TNodeTemplate)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'relationshipTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c4634312-b535-4082-8809-399985b901dc")
    public List<TRelationshipTemplate> getRelationshipTemplate() {
        List<TRelationshipTemplate> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "relationshipTemplate")
              && TRelationshipTemplate.canInstantiate(d.getDependsOn()))
                results.add((TRelationshipTemplate)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4a6cdf41-7142-4228-a4cc-c84124765cf0")
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
    @objid ("102ab25f-5bdd-47f4-ae32-7c302c3653c4")
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
     * Remove a value from the 'nodeTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1aab8f6f-3a38-4463-8aa1-f2fb3c6fb695")
    public boolean removeNodeTemplate(final TNodeTemplate obj) {
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
     * Remove a value from the 'relationshipTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bb49ec9d-9a88-4594-aafb-e5a564abe122")
    public boolean removeRelationshipTemplate(final TRelationshipTemplate obj) {
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
    @objid ("d36bf814-f40d-47cd-9cc8-8453831a13c0")
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

    @objid ("95c0a1bc-3023-49c8-b001-933e34a11783")
    protected  TTopologyTemplate(final Class elt) {
        super(elt);
    }

    @objid ("41bad76e-a154-4529-9cbc-7adac2a3d503")
    public static final class MdaTypes {
        @objid ("20cbbf4a-e4d7-4486-bc70-65cb93ce6976")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d71d4cb5-5fc4-4138-8393-cd11e199473e")
        private static Stereotype MDAASSOCDEP;

        @objid ("bb5c1a11-e29a-4abc-b9b7-7cbbe34ae289")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d9ae5b3-7dce-41c1-9a89-0001f42e9d48")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:38 by Modelio Studio.
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
@objid ("085877c8-d609-41ec-a2ca-430c5e11b06a")
public class TTopologyTemplate extends TExtensibleElements implements IMdaProxy {
    @objid ("3d10683e-4a56-4205-85d3-101321ab3b6e")
    public static final String STEREOTYPE_NAME = "TTopologyTemplate";

    /**
     * Tells whether a {@link TTopologyTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TTopologyTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("efee64b8-1c4f-4de3-b801-d4f6def35918")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TTopologyTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TTopologyTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TTopologyTemplate >> then instantiate a {@link TTopologyTemplate} proxy.
     * 
     * @return a {@link TTopologyTemplate} proxy on the created {@link Class}.
     */
    @objid ("cd5c814d-2dba-4b73-86d8-63f4ba0d9736")
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
    @objid ("408bc329-8ad2-4948-8ee7-16b46f08d785")
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
    @objid ("126e0fde-fb36-4655-89c9-e66da153ee2f")
    public static TTopologyTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TTopologyTemplate.canInstantiate(obj))
        	return new TTopologyTemplate(obj);
        else
        	throw new IllegalArgumentException("TTopologyTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'nodeTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ad4b79a4-f353-4b0c-9c4c-87a59bfed38e")
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
    @objid ("16fcde96-30a5-4abf-a191-06b465df750b")
    public void addRelationshipTemplate(final TRelationshipTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("relationshipTemplate");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "relationshipTemplate");
        }
    }

    @objid ("cdc859a1-57dd-46bc-93ba-8ba04f3b357e")
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
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1cb96716-3fd2-488b-9671-e7341bed7126")
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
    @objid ("ac9311ab-f8c5-4ecc-a7c7-d4371ab845c5")
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
    @objid ("c162cb1b-0583-4b56-bc8e-af0877f870d6")
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
    @objid ("5050ef34-7710-46b8-9634-a0aee5e4d76c")
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

    @objid ("9cfbaa6d-ce96-464c-a85b-6a9a3b0510a0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'nodeTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("acf7cd06-da19-48a6-806f-6b0cac7a06d0")
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
    @objid ("cf6bb691-365f-4fc1-a30f-e56d5e2915a1")
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
    @objid ("55385a20-5cdd-4d24-978f-8c74bb80900c")
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

    @objid ("44dad3b2-ae98-4d2d-a33d-ae2fb322c4f7")
    protected  TTopologyTemplate(final Class elt) {
        super(elt);
    }

    @objid ("892da50d-f7df-4799-a912-93603d2ffc4d")
    public static final class MdaTypes {
        @objid ("c93d7046-7994-471f-933c-d39598bea8cd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("511e27af-38fc-4619-99d6-421dc1cd4603")
        private static Stereotype MDAASSOCDEP;

        @objid ("81618dcd-9f6e-4629-8609-8f7e88c472af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("79c1e540-21f3-437f-8b42-e4062527652d")
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

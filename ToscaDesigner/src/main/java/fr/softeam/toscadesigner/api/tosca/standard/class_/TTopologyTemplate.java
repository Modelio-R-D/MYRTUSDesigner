/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
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
    @objid ("73b65883-d7d8-4320-a749-5e888b36c6d9")
    public static final String STEREOTYPE_NAME = "TTopologyTemplate";

    /**
     * Tells whether a {@link TTopologyTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TTopologyTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("13605f8d-f503-4a6d-8edd-a784bbc84b30")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TTopologyTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TTopologyTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TTopologyTemplate >> then instantiate a {@link TTopologyTemplate} proxy.
     * 
     * @return a {@link TTopologyTemplate} proxy on the created {@link Class}.
     */
    @objid ("d763d498-38a7-4a59-9a9c-ec671e72e2c4")
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
    @objid ("4d886bcf-01f8-4025-9eef-72d5dae2dd32")
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
    @objid ("af0ce569-8364-4b60-a94b-5c3f88a8c7f0")
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
    @objid ("3912541c-c72c-483c-85f6-ad8beae17725")
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
    @objid ("d3e5f708-a6aa-4480-b10f-caf9c9673b83")
    public void addRelationshipTemplate(final TRelationshipTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("relationshipTemplate");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "relationshipTemplate");
        }
    }

    @objid ("f2cb62d9-f702-43fd-8f75-9d8ef494be77")
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
    @objid ("4da6dc33-1976-46b1-b25f-797199106ae4")
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
    @objid ("d47d0bc3-db06-4318-9a46-f6a712f17206")
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
    @objid ("81af2ce2-b428-4d1d-a52a-2f716485a89e")
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
    @objid ("1f989596-03e5-416c-bd55-82507a64eb79")
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

    @objid ("ec8a5b3b-da9f-4a32-86f1-56f797b5996a")
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
    @objid ("f5e6312c-df84-4096-864e-1cf42c31ca84")
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
    @objid ("5d5e77d2-c6e4-44bd-b84e-e6fcc5b622cf")
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
    @objid ("edd4d19d-3c5a-4997-a3cf-d31334313a57")
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

    @objid ("bb5fcb01-8774-4a0a-9eeb-dbcc7c698c1f")
    protected  TTopologyTemplate(final Class elt) {
        super(elt);
    }

    @objid ("892da50d-f7df-4799-a912-93603d2ffc4d")
    public static final class MdaTypes {
        @objid ("33ad97c7-b072-48cb-b397-e4f01534911b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7f404576-e91b-43d0-b7d3-3512d6186dec")
        private static Stereotype MDAASSOCDEP;

        @objid ("157e2791-b5f0-4efd-b603-61b3b850d3b0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d8865670-2a2c-44fd-9cc9-124f905f7620")
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

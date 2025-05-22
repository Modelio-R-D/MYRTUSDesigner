/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TPropertyDef;
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
 * Proxy class to handle a {@link Class} with << TPolicy >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a24ca850-a68a-4662-916a-a2ed7e126ac7")
public class TPolicy implements IMdaProxy {
    @objid ("a890f55b-50e0-48e9-b9e8-e14de8ee518b")
    public static final String STEREOTYPE_NAME = "TPolicy";

    @objid ("8308ffc7-fc84-4b13-b5ce-b11343132843")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("ba255e91-bda3-4fd2-8f3e-e5559aacf655")
    public static final String POLICYREF_PROPERTY = "policyRef";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("15ed05d9-2df6-4bd4-a06a-66f482ab3611")
    protected final Class elt;

    /**
     * Tells whether a {@link TPolicy proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPolicy >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0b683e92-091f-4a5f-8441-4ddc9c5a60fe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPolicy.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPolicy.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPolicy >> then instantiate a {@link TPolicy} proxy.
     * @return a {@link TPolicy} proxy on the created {@link Class}.
     */
    @objid ("a051e61c-1373-410d-914a-3c872f198a13")
    public static TPolicy create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TPolicy.MdaTypes.STEREOTYPE_ELT);
        return TPolicy.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TPolicy} proxy from a {@link Class} stereotyped << TPolicy >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TPolicy} proxy or <i>null</i>.
     */
    @objid ("e34e7335-04ec-4235-a376-e3a8319b0f48")
    public static TPolicy instantiate(final Class obj) {
        return TPolicy.canInstantiate(obj) ? new TPolicy(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPolicy} proxy from a {@link Class} stereotyped << TPolicy >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TPolicy} proxy.
     */
    @objid ("46a7853f-79c7-4e59-99af-88f5af08602c")
    public static TPolicy safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPolicy.canInstantiate(obj))
            return new TPolicy(obj);
        else
            throw new IllegalArgumentException("TPolicy: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'properties' role.<p>
     * Role description:
     * null
     */
    @objid ("688e1328-e4c9-458c-abba-98f743c5e80d")
    public void addProperties(final TPropertyDef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TPolicy.MdaTypes.MDAASSOCDEP);
            d.setName("properties");
            d.putTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE, "properties");
        }
    }

    /**
     * Add a value to the 'targets' role.<p>
     * Role description:
     * null
     */
    @objid ("24509974-e271-4045-bbdf-989d43db83fe")
    public void addTargets(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TPolicy.MdaTypes.MDAASSOCDEP);
            d.setName("targets");
            d.putTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE, "targets");
        }
    }

    /**
     * Add a value to the 'triggers' role.<p>
     * Role description:
     * null
     */
    @objid ("f764203b-d275-448a-ac7e-ef51ec79b7b9")
    public void addTriggers(final Trigger obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TPolicy.MdaTypes.MDAASSOCDEP);
            d.setName("triggers");
            d.putTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE, "triggers");
        }
    }

    @objid ("a8783f66-35d7-4e13-b48c-bb22bdc0d641")
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
        TPolicy other = (TPolicy) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TPolicy.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("db079f75-f464-4b9b-aa0b-3919c5a37551")
    public String getDescription() {
        String value = this.elt.getProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                                            TPolicy.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicy.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicy.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("806f7261-5c80-4a4a-a33f-d542e2932428")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e21e0cbd-d2ad-4ded-bf0e-b66a6417e8f3")
    public String getPolicyRef() {
        String value = this.elt.getProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                                            TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Get the values of the 'properties' role.<p>
     * Role description:
     * null
     */
    @objid ("6d094a25-c3d4-4140-8830-58264fdfca1a")
    public List<TPropertyDef> getProperties() {
        List<TPropertyDef> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TPolicy.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE), "properties")
              && TPropertyDef.canInstantiate(d.getDependsOn()))
                results.add((TPropertyDef)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPropertyDef.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'targets' role.<p>
     * Role description:
     * null
     */
    @objid ("23c04920-121e-4c50-91e1-65a4edaae46f")
    public List<TNodeTemplate> getTargets() {
        List<TNodeTemplate> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TPolicy.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE), "targets")
              && TNodeTemplate.canInstantiate(d.getDependsOn()))
                results.add((TNodeTemplate)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'triggers' role.<p>
     * Role description:
     * null
     */
    @objid ("8f05a2cc-c5a8-4c33-9a16-24122f4c2271")
    public List<Trigger> getTriggers() {
        List<Trigger> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TPolicy.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE), "triggers")
              && Trigger.canInstantiate(d.getDependsOn()))
                results.add((Trigger)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), Trigger.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("811c2a18-0ea5-4797-89e8-4508a7077f62")
    public TPolicyType getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TPolicy.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE), "type")
                  && TPolicyType.canInstantiate(d.getDependsOn())) {
                     return (TPolicyType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPolicyType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("744759f3-491f-4c90-885a-671ecc74eb6b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'properties' role.<p>
     * Role description:
     * null
     */
    @objid ("e58a86c0-0f9e-4952-b755-7dcbb6c49f50")
    public boolean removeProperties(final TPropertyDef obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TPolicy.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'targets' role.<p>
     * Role description:
     * null
     */
    @objid ("1738f736-9401-4450-8f04-50c3c6732fc5")
    public boolean removeTargets(final TNodeTemplate obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TPolicy.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'triggers' role.<p>
     * Role description:
     * null
     */
    @objid ("a1503e19-4d77-47a5-a6ab-5525cc58b573")
    public boolean removeTriggers(final Trigger obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TPolicy.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for property 'TPolicy.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("02688347-d96e-4efa-8b11-0a89599a2ec7")
    public void setDescription(final String value) {
        this.elt.setProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                             TPolicy.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicy.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("72aa6264-7ac1-4790-8097-9215818b3685")
    public void setPolicyRef(final String value) {
        this.elt.setProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                             TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     */
    @objid ("7083200d-0029-4576-a12e-64908384abc6")
    public void setType(final TPolicyType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TPolicy.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TPolicy.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("09c245ef-0cd7-4216-b390-6621fe881d91")
    protected  TPolicy(final Class elt) {
        this.elt = elt;
    }

    @objid ("9e349956-4102-4e50-8d88-80be4b92a30a")
    public static final class MdaTypes {
        @objid ("0ab7b820-1a07-478a-9012-da71c62b60f2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2b5bf9e6-2e9c-4539-94ff-44d43daa10cb")
        public static PropertyDefinition POLICYREF_PROPERTY_ELT;

        @objid ("13a30c71-fb6c-4c9f-bc65-bcdf3e028831")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("34351a7e-6269-4148-baea-3e0e83b8edc5")
        private static Stereotype MDAASSOCDEP;

        @objid ("b6a8f918-2fc4-48db-a720-2a05b87f58ce")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("23bd4cc2-7e9f-4b09-b85a-fde66d8c6003")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "afe2c9ed-9fab-4a53-a2d2-b52d849d0799", "TPolicy");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "874eaba3-7da2-496d-b724-a3f411e15532", "policyRef");
            POLICYREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICYREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "0c7da924-89ac-4530-b76e-fbbc0034f15e", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

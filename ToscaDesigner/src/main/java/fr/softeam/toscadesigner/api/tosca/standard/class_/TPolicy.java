/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 06/02/2025 17:32 by Modelio Studio.
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
@objid ("c6151804-ffa2-41b1-a19f-75a3542d7e94")
public class TPolicy implements IMdaProxy {
    @objid ("ec4872f1-6bf4-4544-95c7-89c0c8865995")
    public static final String STEREOTYPE_NAME = "TPolicy";

    @objid ("504e5e07-661a-4421-9022-3ff93252eecc")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("7f6f0884-59b3-4c62-a67f-a32643fd0723")
    public static final String POLICYREF_PROPERTY = "policyRef";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("38c82902-8dc8-46ad-9827-a4637d1358cf")
    protected final Class elt;

    /**
     * Tells whether a {@link TPolicy proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPolicy >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("012d74af-5388-4199-a683-92c89ee29af3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPolicy.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPolicy.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPolicy >> then instantiate a {@link TPolicy} proxy.
     * 
     * @return a {@link TPolicy} proxy on the created {@link Class}.
     */
    @objid ("2db698bc-f8e2-4415-8f71-d385807f8990")
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
    @objid ("3684322c-90d9-4e6b-ac77-3d00dabdc91e")
    public static TPolicy instantiate(final Class obj) {
        return TPolicy.canInstantiate(obj) ? new TPolicy(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPolicy} proxy from a {@link Class} stereotyped << TPolicy >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TPolicy} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("843b8fdc-13af-444e-8870-3a0130d59bb8")
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
     * 
     */
    @objid ("df509dc7-853c-478b-8418-6f891290fff5")
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
     * 
     */
    @objid ("e81a3992-756e-4f04-a5f5-a475edcaf1a3")
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
     * 
     */
    @objid ("8c0be6a6-968f-48bd-841f-75762ea33161")
    public void addTriggers(final Trigger obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TPolicy.MdaTypes.MDAASSOCDEP);
            d.setName("triggers");
            d.putTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE, "triggers");
        }
    }

    @objid ("0c161f90-614f-4b50-945e-59ea7f6482ff")
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
    @objid ("c6a8491d-dae7-4d68-8b1f-5733d83c1c2a")
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
    @objid ("f085622f-ad8d-40ae-8a9b-22f463b6534f")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("76dcdd6d-f8e0-4a80-82e5-35fd59ab39d7")
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
     * 
     */
    @objid ("571c842c-f092-4ad3-838a-1f338db510ec")
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
     * 
     */
    @objid ("f249fdb8-aca5-4494-b9f3-9e8fa7c74b8f")
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
     * 
     */
    @objid ("7ddc48fa-c520-410d-be9d-36dbb34fd793")
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
     * 
     */
    @objid ("0d95b1b5-0fdb-459a-ba22-8acac821b6c4")
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

    @objid ("8c673a68-786b-4916-9d13-14174f3b88da")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'properties' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e1817539-6c39-4503-b535-5fee1fc71220")
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
     * 
     */
    @objid ("e357ea80-81c8-48f0-9eb2-39e9567a37e7")
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
     * 
     */
    @objid ("c0489eb2-ed00-44bb-af18-fdba0de8bd68")
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
    @objid ("ab0c68f2-94a1-4717-a07b-62f4e2537cc2")
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
    @objid ("d10877af-8485-489d-bd5f-74e6a6867438")
    public void setPolicyRef(final String value) {
        this.elt.setProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                             TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8499d114-cad0-4073-a3f1-19dd01db4a8f")
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

    @objid ("735597c8-b391-4a6d-ac84-bb9793ff4187")
    protected  TPolicy(final Class elt) {
        this.elt = elt;
    }

    @objid ("9cdabba3-5ee3-4167-9304-34532fa22246")
    public static final class MdaTypes {
        @objid ("c03df1e9-6b22-469e-904a-39ca4d94d1cb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9ade6f9a-803d-45d3-9984-e1cdbb06216c")
        public static PropertyDefinition POLICYREF_PROPERTY_ELT;

        @objid ("18a6c2d5-5f59-4ddf-b322-274804edfe31")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("1d2e3144-a2a3-49e1-bf7b-f75c328088f5")
        private static Stereotype MDAASSOCDEP;

        @objid ("b1220c0d-37f5-4c8d-b5a6-cac29481b4dc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("04c7c83e-7bf7-463c-bd40-c32c93824f90")
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

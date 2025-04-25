/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:52 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TCapabilityDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f3db7b7c-e2c6-4d95-9609-eab0084d3865")
public class TCapabilityDefinition extends CapabilityStereotype implements IMdaProxy {
    @objid ("16a9919b-6f1c-4f4c-a9c2-e5a1490786aa")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinition";

    @objid ("5f907694-a479-4d36-a9c0-6387d0ffdc5d")
    public static final String CONSTRAINTS_PROPERTY = "constraints";

    @objid ("3e728c16-e016-4dab-a6ee-6944c01f5fc3")
    public static final String LOWERBOUND_PROPERTY = "lowerBound";

    @objid ("546319a5-9d50-46d0-9619-e6238b56e48f")
    public static final String UPPERBOUND_PROPERTY = "upperBound";

    /**
     * Tells whether a {@link TCapabilityDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d5878326-c1e0-49ab-b057-ac74a5e23b02")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinition >> then instantiate a {@link TCapabilityDefinition} proxy.
     * 
     * @return a {@link TCapabilityDefinition} proxy on the created {@link Class}.
     */
    @objid ("ceae7e80-bcc7-4745-8dd3-845837f4d264")
    public static TCapabilityDefinition create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityDefinition.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinition} proxy from a {@link Class} stereotyped << TCapabilityDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TCapabilityDefinition} proxy or <i>null</i>.
     */
    @objid ("c6663ffe-1112-480f-b127-62a46fd21442")
    public static TCapabilityDefinition instantiate(final Class obj) {
        return TCapabilityDefinition.canInstantiate(obj) ? new TCapabilityDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinition} proxy from a {@link Class} stereotyped << TCapabilityDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapabilityDefinition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("04376bb0-63c1-48f3-b837-abaeb8750fe6")
    public static TCapabilityDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityDefinition.canInstantiate(obj))
        	return new TCapabilityDefinition(obj);
        else
        	throw new IllegalArgumentException("TCapabilityDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'validSourceType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c50a08dd-21e4-473e-8049-4df6fe4842a7")
    public void addValidSourceType(final TNodeType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TCapabilityDefinition.MdaTypes.MDAASSOCDEP);
            d.setName("validSourceType");
            d.putTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE, "validSourceType");
        }
    }

    @objid ("d54dc51f-d74b-422a-8432-a41dacf2a0d3")
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
        TCapabilityDefinition other = (TCapabilityDefinition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'capabilityType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1ac687b3-014f-4fd9-b52d-8b2191a9866d")
    public TCapabilityType getCapabilityType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TCapabilityDefinition.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE), "capabilityType")
                  && TCapabilityType.canInstantiate(d.getDependsOn())) {
                     return (TCapabilityType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TCapabilityType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for property 'TCapabilityDefinition.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2b5f5e9e-07d8-4576-8c40-24aafa11e370")
    public String getConstraints() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("006d1353-8f11-421f-a86e-3f0aea22986f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TCapabilityDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("72b2b738-8643-4ca1-af3c-70d444347b4e")
    public Integer getLowerBound() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (Integer) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TCapabilityDefinition.upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1d5d91fc-1118-47eb-ae88-c16f0bc1850c")
    public Integer getUpperBound() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (Integer) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the values of the 'validSourceType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cbb19e31-1c1e-4a0b-a1c1-ef979758e9a8")
    public List<TNodeType> getValidSourceType() {
        List<TNodeType> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TCapabilityDefinition.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE), "validSourceType")
              && TNodeType.canInstantiate(d.getDependsOn()))
                results.add((TNodeType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TNodeType.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f781ea8f-71ab-47f5-b8e0-77f6b79005f6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'validSourceType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7f4b179f-cdfd-4e87-8673-fb33d2de66f8")
    public boolean removeValidSourceType(final TNodeType obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TCapabilityDefinition.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Set the value of the 'capabilityType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("da1c54ac-bc0a-43f9-9923-65642fe3b285")
    public void setCapabilityType(final TCapabilityType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TCapabilityDefinition.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE), "capabilityType")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TCapabilityDefinition.MdaTypes.MDAASSOCDEP);
              dep.setName("capabilityType");      dep.putTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE, "capabilityType");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Setter for property 'TCapabilityDefinition.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bb656a82-708e-479b-ae3e-758b0d9ea765")
    public void setConstraints(final String value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e7ab803b-f190-4297-909a-251c060036aa")
    public void setLowerBound(final Integer value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fbfc3688-0a10-4075-8868-089e47a78329")
    public void setUpperBound(final Integer value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value));
    }

    @objid ("35156993-d8b8-4168-b690-5d628d590340")
    protected  TCapabilityDefinition(final Class elt) {
        super(elt);
    }

    @objid ("f3dcfbae-0782-484a-8a0d-abc3f817933b")
    public static final class MdaTypes {
        @objid ("b9884b41-8153-42f0-be2d-14ca9e64944e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d0b2d5e7-7da8-4752-b723-958b0157414e")
        public static PropertyDefinition CONSTRAINTS_PROPERTY_ELT;

        @objid ("f150ddbd-148d-43e3-8827-b59c6e843295")
        public static PropertyDefinition LOWERBOUND_PROPERTY_ELT;

        @objid ("9997484f-4cfc-463e-ad0e-0c7d05ec19a7")
        public static PropertyDefinition UPPERBOUND_PROPERTY_ELT;

        @objid ("e4d5d170-a401-43c1-94b7-ba2f0fa85e1a")
        private static Stereotype MDAASSOCDEP;

        @objid ("b4d2b182-653e-4a39-ac7b-2c28b4f7d3ae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("60c039a0-a35b-4f70-9e96-1ed327b10959")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "92f8cb40-9498-4759-9c75-6b4df72de355", "TCapabilityDefinition");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "21aae7e2-a2bd-418d-8df8-70c4fa8d4d13", "constraints");
            CONSTRAINTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CONSTRAINTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "2a352928-d0d5-4e77-bbb4-9f69dc69b952", "lowerBound");
            LOWERBOUND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (LOWERBOUND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d94c64cf-02f1-4a6b-a229-35c8b8b6303b", "upperBound");
            UPPERBOUND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (UPPERBOUND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

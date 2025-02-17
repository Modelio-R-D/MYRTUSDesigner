/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 15:39 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRequirementDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6f956c8f-0596-4f75-a545-bf089b7927aa")
public class TRequirementDefinition implements IMdaProxy {
    @objid ("aabc760f-480e-442e-ad7b-7a4a611182cf")
    public static final String STEREOTYPE_NAME = "TRequirementDefinition";

    @objid ("16c7d873-c624-42ab-95c6-ffd6a247d042")
    public static final String LOWERBOUND_PROPERTY = "lowerBound";

    @objid ("896a76be-6139-4487-b81a-d3cc7176ada6")
    public static final String NAME_PROPERTY = "name";

    @objid ("1629cb31-d20e-46ef-a701-aa659eb99f8d")
    public static final String REQUIREMENTTYPE_PROPERTY = "requirementType";

    @objid ("9d36643a-a72a-4eba-8f80-93b7c3669f3e")
    public static final String UPPERBOUND_PROPERTY = "upperBound";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("c1703f5b-b810-4449-ab77-7aaa0ebfd2f3")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirementDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirementDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b3d570e4-b591-43e9-9bab-8f9299798c85")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirementDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirementDefinition >> then instantiate a {@link TRequirementDefinition} proxy.
     * 
     * @return a {@link TRequirementDefinition} proxy on the created {@link Class}.
     */
    @objid ("c3505afe-67a9-4d00-84e9-fe3a02d3f164")
    public static TRequirementDefinition create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT);
        return TRequirementDefinition.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinition} proxy from a {@link Class} stereotyped << TRequirementDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRequirementDefinition} proxy or <i>null</i>.
     */
    @objid ("24bcf75d-610b-4177-8de5-62ac151abd42")
    public static TRequirementDefinition instantiate(final Class obj) {
        return TRequirementDefinition.canInstantiate(obj) ? new TRequirementDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinition} proxy from a {@link Class} stereotyped << TRequirementDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRequirementDefinition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c830f5e1-ee19-437c-a2e0-8930e17916d3")
    public static TRequirementDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirementDefinition.canInstantiate(obj))
        	return new TRequirementDefinition(obj);
        else
        	throw new IllegalArgumentException("TRequirementDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3559465a-3047-4731-83a3-fc81cf0820b4")
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
        TRequirementDefinition other = (TRequirementDefinition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'capability' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d2fb0afc-5d01-4705-a250-c85fb1d2d189")
    public TCapabilityType getCapability() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TRequirementDefinition.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TRequirementDefinition.MdaTypes.MDAASSOCDEP_ROLE), "capability")
                  && TCapabilityType.canInstantiate(d.getDependsOn())) {
                     return (TCapabilityType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TCapabilityType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("67335d78-4e84-4025-ab85-81e3167015bb")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirementDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("59f8979e-668b-4399-a7c4-18c04590f3a9")
    public String getLowerBound() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRequirementDefinition.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1cae1cce-0f6c-4856-ac2c-79920298db57")
    public String getName() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the value of the 'nodeType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("87467bd7-1fc4-4d99-b8e4-a4bebcf02cf8")
    public TNodeType getNodeType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TRequirementDefinition.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TRequirementDefinition.MdaTypes.MDAASSOCDEP_ROLE), "nodeType")
                  && TNodeType.canInstantiate(d.getDependsOn())) {
                     return (TNodeType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TNodeType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'relationshipType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("61ac73f8-495e-49a3-a323-51238d044508")
    public TRelationshipType getRelationshipType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TRequirementDefinition.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TRequirementDefinition.MdaTypes.MDAASSOCDEP_ROLE), "relationshipType")
                  && TRelationshipType.canInstantiate(d.getDependsOn())) {
                     return (TRelationshipType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRelationshipType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for property 'TRequirementDefinition.requirementType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("38360fb3-7228-4d82-bf53-883bcb6501be")
    public String getRequirementType() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRequirementDefinition.upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("11a239b1-d250-4053-8d18-aebf5c064c93")
    public String getUpperBound() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("78ded88a-2a0e-4b44-9986-a57f216ce348")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Set the value of the 'capability' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fd902937-e632-429c-bd65-49cde84599cc")
    public void setCapability(final TCapabilityType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TRequirementDefinition.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TRequirementDefinition.MdaTypes.MDAASSOCDEP_ROLE), "capability")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TRequirementDefinition.MdaTypes.MDAASSOCDEP);
              dep.setName("capability");      dep.putTagValue(TRequirementDefinition.MdaTypes.MDAASSOCDEP_ROLE, "capability");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Setter for property 'TRequirementDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8fb6d8c6-1e81-47a0-8365-7c0011ec2dec")
    public void setLowerBound(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirementDefinition.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2ef1bb4b-6b5e-4317-84c0-ea21796712d5")
    public void setName(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'nodeType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b91492b4-9aaa-4016-bc49-b4910f4a2cef")
    public void setNodeType(final TNodeType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TRequirementDefinition.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TRequirementDefinition.MdaTypes.MDAASSOCDEP_ROLE), "nodeType")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TRequirementDefinition.MdaTypes.MDAASSOCDEP);
              dep.setName("nodeType");      dep.putTagValue(TRequirementDefinition.MdaTypes.MDAASSOCDEP_ROLE, "nodeType");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Set the value of the 'relationshipType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("91f16850-93b6-4267-91e5-8b71460f9783")
    public void setRelationshipType(final TRelationshipType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TRequirementDefinition.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TRequirementDefinition.MdaTypes.MDAASSOCDEP_ROLE), "relationshipType")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TRequirementDefinition.MdaTypes.MDAASSOCDEP);
              dep.setName("relationshipType");      dep.putTagValue(TRequirementDefinition.MdaTypes.MDAASSOCDEP_ROLE, "relationshipType");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Setter for property 'TRequirementDefinition.requirementType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f0e76ce9-25bd-4342-a7c6-9b15a374e5ca")
    public void setRequirementType(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.REQUIREMENTTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirementDefinition.upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b6c907b5-633b-41e6-946c-c4676cce6f87")
    public void setUpperBound(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value));
    }

    @objid ("77c4e91b-7091-4f9b-87eb-8f55e17bc502")
    protected  TRequirementDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("57a64666-ae7a-43ec-afaa-f72b97c627a5")
    public static final class MdaTypes {
        @objid ("a9e9d137-4fd4-4205-9713-98b1133bc6b1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a7af2717-e415-4994-90a7-c9235ce9af76")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("adacc8b3-86be-4de4-96b0-dd8b89980b40")
        public static PropertyDefinition LOWERBOUND_PROPERTY_ELT;

        @objid ("e0b8b3cc-96e9-4cb3-8e7c-f687878d67f9")
        public static PropertyDefinition UPPERBOUND_PROPERTY_ELT;

        @objid ("36a0c5c3-d0e9-460e-a92b-ebe75e3d8d36")
        public static PropertyDefinition REQUIREMENTTYPE_PROPERTY_ELT;

        @objid ("f76b098f-46b4-4415-a82a-c6b5a51a6154")
        private static Stereotype MDAASSOCDEP;

        @objid ("2f6eba20-2b64-4119-97d7-d0c9aa964817")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8d1fd863-3be6-4e32-8e66-32e3e2d18d11")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2637c4bd-ca93-4012-82ea-8ef2ba5ca444", "TRequirementDefinition");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "9c566aec-ad96-40ff-a064-234052f3d025", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "91760dfd-39c9-4ee5-86f3-3f66d6cd56fe", "lowerBound");
            LOWERBOUND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (LOWERBOUND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "db6cac6e-1eab-4d18-a9f6-07531e0eff4f", "upperBound");
            UPPERBOUND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (UPPERBOUND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b8f4932e-2500-4aa3-882b-7ca4d95a2f70", "requirementType");
            REQUIREMENTTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIREMENTTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

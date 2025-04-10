/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:09 by Modelio Studio.
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
    @objid ("7477e2e7-2673-4fb6-9a4b-c458367c9727")
    public static final String STEREOTYPE_NAME = "TRequirementDefinition";

    @objid ("462c45d2-a80d-402d-a275-81df8f088730")
    public static final String LOWERBOUND_PROPERTY = "lowerBound";

    @objid ("b96bac7d-e142-4d21-b9ff-adba47331d72")
    public static final String NAME_PROPERTY = "name";

    @objid ("2f639bf5-0a78-43dd-8859-895d7f857dd0")
    public static final String REQUIREMENTTYPE_PROPERTY = "requirementType";

    @objid ("5b914b6c-ed69-4462-a27c-8f8dd65ba473")
    public static final String UPPERBOUND_PROPERTY = "upperBound";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("61fd4390-73ea-4785-89a0-907c19d57d71")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirementDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirementDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("28875063-b547-4e89-a621-7fb404349ca4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirementDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirementDefinition >> then instantiate a {@link TRequirementDefinition} proxy.
     * 
     * @return a {@link TRequirementDefinition} proxy on the created {@link Class}.
     */
    @objid ("810a027a-c047-4ae5-808d-122b78235bef")
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
    @objid ("8b1e933a-6db5-4131-897c-668536b6cdce")
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
    @objid ("87e085f1-13ef-4f1e-80fc-e7cc2f964d31")
    public static TRequirementDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirementDefinition.canInstantiate(obj))
        	return new TRequirementDefinition(obj);
        else
        	throw new IllegalArgumentException("TRequirementDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9a3f29ea-73f0-4cd4-8ae1-44b75cc0b643")
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
    @objid ("66b489a8-6025-47fc-b8a8-befc6b572b6b")
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
    @objid ("811ad987-a50e-46a9-bdd8-d3fe7b32980a")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirementDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eaf78bab-4979-461c-8342-07c630b64382")
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
    @objid ("b3ed4d7d-9447-43ca-9f6c-2c107144684c")
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
    @objid ("b7f1603b-745c-4329-ba62-fae85b98a0f1")
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
    @objid ("7e94aeb5-7288-496d-85d7-3e2740aa5698")
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
    @objid ("4a75f6fa-6381-48f3-84c2-b70019e5f902")
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
    @objid ("39d23c18-cfca-4904-a4fe-b1f7c6ef90b0")
    public String getUpperBound() {
        String value = this.elt.getProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("0f5e4a1d-a957-4647-90d1-d3e455f82b69")
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
    @objid ("85ab763a-64a9-49eb-a380-22494c41ac24")
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
    @objid ("703e93a5-dc8c-4aa2-9edc-c234fe089785")
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
    @objid ("35feade5-b0f8-40c9-b52c-bbee4eff8f30")
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
    @objid ("c02c0ac6-0d37-44a3-bc96-b11da01b0ba6")
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
    @objid ("d67e9288-eafb-4b10-adb4-59f9ff8d3007")
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
    @objid ("f5cba25c-fac4-43b3-8a21-d7d31dfda2ee")
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
    @objid ("65ce042f-c7ea-4654-956e-b188171f4348")
    public void setUpperBound(final String value) {
        this.elt.setProperty(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT,
                             TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value));
    }

    @objid ("e8be81a5-7546-4435-bf7d-6a070037412f")
    protected  TRequirementDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("57a64666-ae7a-43ec-afaa-f72b97c627a5")
    public static final class MdaTypes {
        @objid ("0e058996-2cca-4833-82d2-b3a7c31ff16e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5b44f74d-e0b9-4b83-8821-3aaf9bb2e379")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("441a4d37-7632-4aac-b872-8973a0358a1f")
        public static PropertyDefinition LOWERBOUND_PROPERTY_ELT;

        @objid ("93e159f3-0909-4601-b982-dcee600c9cbc")
        public static PropertyDefinition UPPERBOUND_PROPERTY_ELT;

        @objid ("b319c114-ce6b-4ae7-97da-cb9a0acaadd0")
        public static PropertyDefinition REQUIREMENTTYPE_PROPERTY_ELT;

        @objid ("cdc859fb-f2bb-4498-a8e8-0c2553052e9a")
        private static Stereotype MDAASSOCDEP;

        @objid ("0108464f-01b5-472f-80e3-914a6132c5b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16d03bc1-c4b7-4c04-83b8-08c34a74b707")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 18:12 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TNodeTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("692da0cb-3bf1-40a3-95f9-9bc3a4c61b47")
public class TNodeTemplate implements IMdaProxy {
    @objid ("2c22e08c-aacb-46b1-a30e-f44749b8fd7a")
    public static final String STEREOTYPE_NAME = "TNodeTemplate";

    @objid ("06944352-294f-4523-8c19-942b36baed4e")
    public static final String MAXINSTANCES_PROPERTY = "maxInstances";

    @objid ("a2429691-50c9-4df3-a26d-72ca5408638c")
    public static final String MININSTANCES_PROPERTY = "minInstances";

    @objid ("94d2335e-9866-4b0e-8775-e6760e0b8084")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("e1611904-958b-4ac6-9d70-607dd92d98da")
    protected final Class elt;

    /**
     * Tells whether a {@link TNodeTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ee280e9b-eb8e-48b7-ae41-a2d40ca610de")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeTemplate >> then instantiate a {@link TNodeTemplate} proxy.
     * 
     * @return a {@link TNodeTemplate} proxy on the created {@link Class}.
     */
    @objid ("8e799f95-fd2a-43a2-9b8a-9f3c1e649506")
    public static TNodeTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TNodeTemplate.MdaTypes.STEREOTYPE_ELT);
        return TNodeTemplate.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TNodeTemplate} proxy from a {@link Class} stereotyped << TNodeTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TNodeTemplate} proxy or <i>null</i>.
     */
    @objid ("594781d6-2afd-4046-b9c4-418bd9fbba2d")
    public static TNodeTemplate instantiate(final Class obj) {
        return TNodeTemplate.canInstantiate(obj) ? new TNodeTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TNodeTemplate} proxy from a {@link Class} stereotyped << TNodeTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TNodeTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("21d4362c-3e13-418e-8069-acd5243b4af7")
    public static TNodeTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TNodeTemplate.canInstantiate(obj))
        	return new TNodeTemplate(obj);
        else
        	throw new IllegalArgumentException("TNodeTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("410e99d1-a2f0-4fe4-be2b-aa6d9d27a9b8")
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
        TNodeTemplate other = (TNodeTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'deploymentArtifacts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c17fcdf7-1d56-4045-80a8-424d7ac17cf0")
    public TDeploymentArtifacts getDeploymentArtifacts() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "deploymentArtifacts")
                  && TDeploymentArtifacts.canInstantiate(d.getDependsOn())) {
                     return (TDeploymentArtifacts)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e2e5044d-5c3a-4705-8655-c3d94a1b5f25")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TNodeTemplate.maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e3ac66ee-3f88-41dc-835a-554a8e01a72b")
    public Integer getMaxInstances() {
        String value = this.elt.getProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TNodeTemplate.MdaTypes.MAXINSTANCES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TNodeTemplate.MdaTypes.MAXINSTANCES_PROPERTY_ELT.getDefaultValue();
        }
        return (Integer) PropertyConverter.convertToObject(TNodeTemplate.MdaTypes.MAXINSTANCES_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TNodeTemplate.minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c73309ad-a302-43ff-869a-42ffd4be8913")
    public Integer getMinInstances() {
        String value = this.elt.getProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TNodeTemplate.MdaTypes.MININSTANCES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TNodeTemplate.MdaTypes.MININSTANCES_PROPERTY_ELT.getDefaultValue();
        }
        return (Integer) PropertyConverter.convertToObject(TNodeTemplate.MdaTypes.MININSTANCES_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TNodeTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7b3b4e59-0bb5-4a98-ad9c-0daec5617071")
    public String getName() {
        String value = this.elt.getProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TNodeTemplate.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TNodeTemplate.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TNodeTemplate.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the value of the 'nodeType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("05ad8e40-1a18-4086-a140-0be6ef73e264")
    public TNodeType getNodeType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "nodeType")
                  && TNodeType.canInstantiate(d.getDependsOn())) {
                     return (TNodeType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TNodeType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'requirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c4c64ed2-c988-4fcf-922f-d80b5b42893c")
    public RequirementsType getRequirements() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "requirements")
                  && RequirementsType.canInstantiate(d.getDependsOn())) {
                     return (RequirementsType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), RequirementsType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("d6e12ecd-fc0e-4e74-9df3-ae98ba692db2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Set the value of the 'deploymentArtifacts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5347e2ad-8d37-498d-895e-218c820d76d6")
    public void setDeploymentArtifacts(final TDeploymentArtifacts obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "deploymentArtifacts")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TNodeTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("deploymentArtifacts");      dep.putTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE, "deploymentArtifacts");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Setter for property 'TNodeTemplate.maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("39f928ba-0b8a-4d88-b92f-e25aad7b9095")
    public void setMaxInstances(final Integer value) {
        this.elt.setProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                             TNodeTemplate.MdaTypes.MAXINSTANCES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TNodeTemplate.MdaTypes.MAXINSTANCES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TNodeTemplate.minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("40289e93-6f38-47fe-91a6-99e52722182e")
    public void setMinInstances(final Integer value) {
        this.elt.setProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                             TNodeTemplate.MdaTypes.MININSTANCES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TNodeTemplate.MdaTypes.MININSTANCES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TNodeTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bfb30091-b974-4c8b-b7c9-d0245de86954")
    public void setName(final String value) {
        this.elt.setProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                             TNodeTemplate.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TNodeTemplate.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'nodeType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3d1872d4-e7fa-48fb-a530-b4e4cf5d5654")
    public void setNodeType(final TNodeType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "nodeType")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TNodeTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("nodeType");      dep.putTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE, "nodeType");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Set the value of the 'requirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c6f65e86-404e-4251-8cd3-abfb0252f6a7")
    public void setRequirements(final RequirementsType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "requirements")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TNodeTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("requirements");      dep.putTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE, "requirements");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    @objid ("64af270b-a3e3-403d-b45e-cf214f199ebc")
    protected  TNodeTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("f38f996f-deae-4d24-a546-8257cb6e4526")
    public static final class MdaTypes {
        @objid ("97f23913-eebe-4223-9760-c6f7dc79c0a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("aa0e830d-fd3a-4700-81d6-d1ec32ba2389")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("62b5a001-b790-438b-a2f0-0a396def680b")
        public static PropertyDefinition MININSTANCES_PROPERTY_ELT;

        @objid ("3f5b34c7-6fbf-45a8-9dd5-d31be5e9a98c")
        public static PropertyDefinition MAXINSTANCES_PROPERTY_ELT;

        @objid ("a3652cfc-13e3-4c4b-96af-eda7477ba8cf")
        private static Stereotype MDAASSOCDEP;

        @objid ("da5bd165-2085-41a0-8bdc-22b8ac9ffea9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5269df08-a9a3-4116-b87c-7a469a4242f8")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1a20bf91-0a92-434a-9d1f-35c86788784e", "TNodeTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "bd9aa62a-17eb-4186-b69d-2bbf5a69a8be", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "4d6754bc-a92d-460c-ba8d-429b77f38a8c", "minInstances");
            MININSTANCES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (MININSTANCES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "8e4ef0cc-21bc-44ff-95db-b48e663f689d", "maxInstances");
            MAXINSTANCES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (MAXINSTANCES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 17:44 by Modelio Studio.
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
    @objid ("62d46b1c-4aca-4917-9ded-bb97491c009f")
    public static final String STEREOTYPE_NAME = "TNodeTemplate";

    @objid ("12fdbd68-21ad-438d-863b-9be7bcde20b9")
    public static final String MAXINSTANCES_PROPERTY = "maxInstances";

    @objid ("d7e986fa-fcfb-4dcc-a9ad-77349e3a3d0c")
    public static final String MININSTANCES_PROPERTY = "minInstances";

    @objid ("e82e9cfe-903b-45d6-bf9e-7df91b2c132b")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("bc6dd575-1067-4f77-aafb-b153a44ae1e2")
    protected final Class elt;

    /**
     * Tells whether a {@link TNodeTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("23c19790-b114-47ef-876a-166ae1cc9329")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeTemplate >> then instantiate a {@link TNodeTemplate} proxy.
     * 
     * @return a {@link TNodeTemplate} proxy on the created {@link Class}.
     */
    @objid ("7d24b59f-786b-44eb-855f-b3ea6410a110")
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
    @objid ("32677ba6-55fd-4749-aab9-fc18439c2b4f")
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
    @objid ("08416163-e554-447f-a325-a704917a86aa")
    public static TNodeTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TNodeTemplate.canInstantiate(obj))
        	return new TNodeTemplate(obj);
        else
        	throw new IllegalArgumentException("TNodeTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("455b6da1-4a5c-4d61-9994-2be5a151e424")
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
    @objid ("a80cc579-49cb-4ed7-a37d-7aa3861f156a")
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
    @objid ("64fa9539-09dd-4c88-bb71-8f645d44ec2d")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TNodeTemplate.maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e1b041b3-e3c6-43ba-9c20-67558a1b5879")
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
    @objid ("6e6b1d49-bc19-4f49-be03-2888734d8e03")
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
    @objid ("89011b0c-4e41-47d4-a76b-c723e6e77267")
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
    @objid ("904cfc37-61c3-46e9-bac7-a8b98629f4f5")
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
    @objid ("143edb3c-0665-4540-aa40-8a41fd1003db")
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

    @objid ("2428a764-aebe-4ac8-8390-79bcc031c197")
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
    @objid ("7d8d6799-cd3b-49e6-a4bf-85eda240624d")
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
    @objid ("4b14232c-a37f-4d53-85ca-839856bb651c")
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
    @objid ("a9670406-870f-41fc-bd3b-3e0dcf54f85e")
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
    @objid ("b36f3edd-88dc-455c-94a2-f0d07f92263e")
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
    @objid ("7c4982a5-984e-4660-9347-dd2469030c69")
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
    @objid ("ef7513c8-c24e-4d5c-b5f8-510c4c78b1af")
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

    @objid ("612abb43-b34d-4a40-90a3-d8adda2b0c12")
    protected  TNodeTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("f38f996f-deae-4d24-a546-8257cb6e4526")
    public static final class MdaTypes {
        @objid ("2743bbac-b5d8-4e0e-adb2-0abf2239b9e1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cac3f4bb-7cc4-436a-a8cd-128e9a1ec85e")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("133cc279-7fe8-4d76-8b4a-70b789fabc80")
        public static PropertyDefinition MININSTANCES_PROPERTY_ELT;

        @objid ("b20cf6e9-2063-4ef3-b685-30dc0dc111fc")
        public static PropertyDefinition MAXINSTANCES_PROPERTY_ELT;

        @objid ("60fe4875-60c9-4566-a29c-6dda5271b5db")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed3efd0b-4d37-40c4-b1d3-1f9a61b0fe09")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("533767fc-41da-4e80-af27-39a4e74bbe32")
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

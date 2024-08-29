/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 14:48 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyDef;
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
    @objid ("3eb53feb-e98b-4673-8907-8f77a6b04f88")
    public static final String STEREOTYPE_NAME = "TNodeTemplate";

    @objid ("d3ff6837-b690-4ea3-a8f5-b238e8d3351a")
    public static final String MAXINSTANCES_PROPERTY = "maxInstances";

    @objid ("568283da-7c42-4b0a-bb32-e3ed7035c779")
    public static final String MININSTANCES_PROPERTY = "minInstances";

    @objid ("69e2f914-b994-4ceb-8492-6af2de1912ac")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("aaf8cf07-a7b1-4d88-9ff2-c6c3c0bcc919")
    protected final Class elt;

    /**
     * Tells whether a {@link TNodeTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6f39514e-6ca5-4c31-9aa8-ba017342c70a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeTemplate >> then instantiate a {@link TNodeTemplate} proxy.
     * 
     * @return a {@link TNodeTemplate} proxy on the created {@link Class}.
     */
    @objid ("5dad6793-5331-46fd-8f55-d43e7cfeb272")
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
    @objid ("35b3f327-c6f1-42d8-95fb-deb3b03168b4")
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
    @objid ("a0d93189-4eea-4046-9895-284c817d6494")
    public static TNodeTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TNodeTemplate.canInstantiate(obj))
        	return new TNodeTemplate(obj);
        else
        	throw new IllegalArgumentException("TNodeTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'properties' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("08d1e8c2-3d0b-440d-9bd4-1386b4d27eab")
    public void addProperties(final TPropertyDef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TNodeTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("properties");
            d.putTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE, "properties");
        }
    }

    @objid ("3e34fb19-eb5e-468d-a69d-c0264cf2eea1")
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
    @objid ("78960260-7569-4458-9246-2fe982b23428")
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
    @objid ("33b922b5-e6fa-4783-bb53-b686befc5c97")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TNodeTemplate.maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("40959c98-82ab-453b-9120-63f0c7d04784")
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
    @objid ("adbd27a0-2472-42ea-9db2-36393b62af43")
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
    @objid ("da1278a0-9e4b-41d5-a5b4-3b4f0096bca6")
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
    @objid ("fabdacc3-0bb3-426e-ad54-214d85f6c673")
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
     * Get the values of the 'properties' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1bb6b325-d787-4264-ace0-27937750e970")
    public List<TPropertyDef> getProperties() {
        List<TPropertyDef> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "properties")
              && TPropertyDef.canInstantiate(d.getDependsOn()))
                results.add((TPropertyDef)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPropertyDef.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'requirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a05ae1e2-ec24-4637-905a-3732bd9ff9dd")
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

    @objid ("bb5db204-2b8b-470a-b7cc-1f61db34cdc7")
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
    @objid ("9cc99a1f-64c3-4eca-ba2d-f7b17059c538")
    public boolean removeProperties(final TPropertyDef obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Set the value of the 'deploymentArtifacts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8a800114-cbcf-4173-9e52-0663a82f9453")
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
    @objid ("00cd61bb-12a3-4304-a6c9-1eb8163ac752")
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
    @objid ("19f9515c-38fd-4fb0-a77b-9930287d417f")
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
    @objid ("0281b54e-e637-4c30-b171-274fb46d29ea")
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
    @objid ("c964cce8-334c-49a7-8cf1-8f8b30826915")
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
    @objid ("673f1dd0-ccec-468c-b8aa-691011c5b4b8")
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

    @objid ("b8e817b8-2fd4-42d5-8f8e-ee2da48f6eb9")
    protected  TNodeTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("f38f996f-deae-4d24-a546-8257cb6e4526")
    public static final class MdaTypes {
        @objid ("a1d5ba9d-bfa8-4467-8b48-79fe040f9468")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a684a296-28ce-4fdd-a90b-76e7c95085c5")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("057d07c1-2a46-41d9-a18c-ecc731923170")
        public static PropertyDefinition MININSTANCES_PROPERTY_ELT;

        @objid ("e2ecd83d-bd71-4934-ac2e-91e7c0a78368")
        public static PropertyDefinition MAXINSTANCES_PROPERTY_ELT;

        @objid ("7b44a39b-6909-4742-9776-f2916f616ecc")
        private static Stereotype MDAASSOCDEP;

        @objid ("431b1a27-8dc2-401d-9bfa-6de275ca91a9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("50958237-e882-4705-940a-29f6f6c87232")
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

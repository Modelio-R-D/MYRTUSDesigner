/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 16:27 by Modelio Studio.
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
@objid ("bec9b0e6-f107-4b03-93f9-cc205e285fe7")
public class TNodeTemplate implements IMdaProxy {
    @objid ("8dcd94c7-8b1e-4225-9e11-30e96c84835b")
    public static final String STEREOTYPE_NAME = "TNodeTemplate";

    @objid ("7765cd1e-1b5d-40bb-9cfc-27a7e9f716d4")
    public static final String MAXINSTANCES_PROPERTY = "maxInstances";

    @objid ("d2b3556f-42d2-47f1-9f4f-40ea6e0604d2")
    public static final String MININSTANCES_PROPERTY = "minInstances";

    @objid ("5f0745d5-8387-444f-8fc2-72c49dbe22e7")
    public static final String NAME_PROPERTY = "name";

    @objid ("b911e4d8-4962-4a17-80be-bb92e54b358e")
    public static final String TESTMULTIELEMENT_PROPERTY = "testMultiElement";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("9f235bb3-4afc-4bfe-ad46-c3aa3d1bf12b")
    protected final Class elt;

    /**
     * Tells whether a {@link TNodeTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("577f99ab-5bad-405f-bbf3-e5cfb7c85265")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeTemplate >> then instantiate a {@link TNodeTemplate} proxy.
     * 
     * @return a {@link TNodeTemplate} proxy on the created {@link Class}.
     */
    @objid ("6487a976-0d63-4220-9abe-cdbfb629a6d0")
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
    @objid ("5a784245-0226-48ad-8510-84fb8c8028eb")
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
    @objid ("1aab0053-294b-4516-b277-9af70932fb66")
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
    @objid ("06c06655-3396-4e2d-a757-13f2283e65df")
    public void addProperties(final TPropertyDef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TNodeTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("properties");
            d.putTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE, "properties");
        }
    }

    @objid ("63f6f936-4662-4604-86ee-58e08b1261ba")
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
    @objid ("9ee07e25-1dca-491c-a350-1c353562dc64")
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
    @objid ("ac0f9ac6-a4a2-418f-aaf5-0e85ff76ee9c")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TNodeTemplate.maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e4c2b549-3268-4ed0-9dfb-64f19dd0abfd")
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
    @objid ("9b9c86b6-8fdd-40e8-8087-5fb24155eb11")
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
    @objid ("54616831-16dc-4ded-98f4-d17c68566bda")
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
    @objid ("c576fc1e-7a1c-4d7e-81d3-4ea68d527e59")
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
    @objid ("453805e3-3435-4ecf-9a47-3fdd1e0341fd")
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
    @objid ("8b0fe016-1456-445e-9df6-420eaa04b3f1")
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

    /**
     * Getter for property 'TNodeTemplate.testMultiElement'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b01b3a1a-c5f8-4dcd-9069-31e77673649a")
    public String getTestMultiElement() {
        String value = this.elt.getProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TNodeTemplate.MdaTypes.TESTMULTIELEMENT_PROPERTY_ELT.getName());
        if (value == null) {
          value = TNodeTemplate.MdaTypes.TESTMULTIELEMENT_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TNodeTemplate.MdaTypes.TESTMULTIELEMENT_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("ff179e8a-60c4-4a03-88b5-c4802303abc7")
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
    @objid ("c402db72-34d9-4294-ba9a-3b5767685cd8")
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
    @objid ("16491f73-8199-4ae1-a450-d166b81dd8a8")
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
    @objid ("0f74ec93-cf76-4003-b727-da3b2dc77160")
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
    @objid ("317b9dcd-2265-4553-846e-c1bc4f475ce5")
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
    @objid ("976df35d-c069-45a2-97f8-85a14e733cd1")
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
    @objid ("c895349a-cbc0-491f-9f89-d093fbd58dbe")
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
    @objid ("8995df08-973e-46dd-b90a-d151684ce3da")
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

    /**
     * Setter for property 'TNodeTemplate.testMultiElement'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3528d85e-73b7-49e7-a493-d390cbb177c5")
    public void setTestMultiElement(final String value) {
        this.elt.setProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                             TNodeTemplate.MdaTypes.TESTMULTIELEMENT_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TNodeTemplate.MdaTypes.TESTMULTIELEMENT_PROPERTY_ELT, value));
    }

    @objid ("12f11b57-0b45-4d31-a366-7d9ad3cf4c45")
    protected  TNodeTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("830c1518-f325-44e9-b808-2549817da902")
    public static final class MdaTypes {
        @objid ("96d4b8ca-b01b-42b2-bf42-25b654e2523f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b489e8d1-e28e-4c27-9cd7-6dcae244eb46")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("f1aec631-ce39-4d87-aa24-5701e5288994")
        public static PropertyDefinition MININSTANCES_PROPERTY_ELT;

        @objid ("66a6d864-f442-46a2-adb0-8eeaf7dafb45")
        public static PropertyDefinition MAXINSTANCES_PROPERTY_ELT;

        @objid ("a5763dc9-a535-490d-a1f2-bccfad33e988")
        public static PropertyDefinition TESTMULTIELEMENT_PROPERTY_ELT;

        @objid ("c92a983a-6a7d-4db3-8e8c-d5bba4fc5ded")
        private static Stereotype MDAASSOCDEP;

        @objid ("c2895337-f818-4f6f-ac6a-e41206e28d8d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1bae81ca-d43c-4905-8ccb-ff2f142d69bd")
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
            
            mRef = new MRef(PropertyDefinition.MQNAME, "c70da6c5-e98d-4d4f-b2c2-b55dddeb2409", "testMultiElement");
            TESTMULTIELEMENT_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TESTMULTIELEMENT_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

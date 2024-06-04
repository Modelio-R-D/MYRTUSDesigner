/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
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
@objid ("7b44cbf7-ab18-4a70-917a-1b2e9b886ab0")
public class TNodeTemplate implements IMdaProxy {
    @objid ("0c1b4f34-a875-4c6e-871c-5b3312b708a6")
    public static final String STEREOTYPE_NAME = "TNodeTemplate";

    @objid ("ee798168-4fc7-4f43-97a5-251c40113f65")
    public static final String MAXINSTANCES_TAGTYPE = "maxInstances";

    @objid ("c32fa9d8-f1f4-4095-a3ff-ee3a43750948")
    public static final String MININSTANCES_TAGTYPE = "minInstances";

    @objid ("014a39af-7fc7-4b78-a7d2-721ea29f1d2a")
    public static final String NAME_TAGTYPE = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("561c6dd7-3eef-4d7a-afe6-242d573025f4")
    protected final Class elt;

    /**
     * Tells whether a {@link TNodeTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6b37f96f-ec8c-492a-8390-bc1f6703fff9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeTemplate >> then instantiate a {@link TNodeTemplate} proxy.
     * 
     * @return a {@link TNodeTemplate} proxy on the created {@link Class}.
     */
    @objid ("1ecac9b1-e03e-484b-bf94-50f1eef6daf7")
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
    @objid ("e4c0e262-ae64-426d-b835-16a7cc6e0bee")
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
    @objid ("fe98e5d8-73ae-43b9-acd2-e5395f31d108")
    public static TNodeTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TNodeTemplate.canInstantiate(obj))
        	return new TNodeTemplate(obj);
        else
        	throw new IllegalArgumentException("TNodeTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cebbed58-c3f2-447f-8dc7-e2e513b941a5")
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
     * Get the value of the 'capabilities' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a054d8c3-4cee-470f-ac1e-f4eb9070300a")
    public CapabilitiesType getCapabilities() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "capabilities")
                  && CapabilitiesType.canInstantiate(d.getDependsOn())) {
                     return (CapabilitiesType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), CapabilitiesType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'deploymentArtifacts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("468eb442-37db-45b4-8257-6391d205e7e2")
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
    @objid ("85f3c96a-92d0-4a39-88f9-9b313d033ed9")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("24401cfa-2370-4a6a-90cb-e24a27ecdb9e")
    public String getMaxInstances() {
        return this.elt.getTagValue(TNodeTemplate.MdaTypes.MAXINSTANCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e76b1c7b-1f59-48f0-8697-f789482b27a7")
    public String getMinInstances() {
        return this.elt.getTagValue(TNodeTemplate.MdaTypes.MININSTANCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ad35758b-fbc8-44af-8cf3-e9dc4154fe24")
    public String getName() {
        return this.elt.getTagValue(TNodeTemplate.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'policies' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("972f49e5-5331-4a01-8043-5d1fcbd4db38")
    public PoliciesType getPolicies() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "policies")
                  && PoliciesType.canInstantiate(d.getDependsOn())) {
                     return (PoliciesType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), PoliciesType.MdaTypes.STEREOTYPE_ELT.getName());
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
    @objid ("52c4d4c1-d5b1-4ec4-b079-65e7d0e0a9bb")
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

    @objid ("cd840a2c-ec8e-4bb0-abaf-ee489382ea59")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Set the value of the 'capabilities' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5f1b60f4-a64c-4a41-a8cb-197d9706d8b5")
    public void setCapabilities(final CapabilitiesType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "capabilities")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TNodeTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("capabilities");      dep.putTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE, "capabilities");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Set the value of the 'deploymentArtifacts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("401b68ad-0ec7-41a3-8691-784ba1e02ab9")
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
     * Setter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7807c873-db45-4e31-b117-139aa8492307")
    public void setMaxInstances(final String value) {
        this.elt.putTagValue(TNodeTemplate.MdaTypes.MAXINSTANCES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6107a702-c165-4d72-9750-c80ffcff2cd3")
    public void setMinInstances(final String value) {
        this.elt.putTagValue(TNodeTemplate.MdaTypes.MININSTANCES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f09dba4e-77e0-476c-9aee-acd2bdccfaa1")
    public void setName(final String value) {
        this.elt.putTagValue(TNodeTemplate.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'policies' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("56707ad9-2175-41e8-ad9e-e848f42e0590")
    public void setPolicies(final PoliciesType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "policies")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TNodeTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("policies");      dep.putTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE, "policies");
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
    @objid ("7a8a1d6a-9faf-4614-8d1e-f46216fa2f4c")
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

    @objid ("45d11229-bd18-46c3-a7cc-9258f56a5188")
    protected  TNodeTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("c33fe346-e9b4-476c-9bb4-3f4e68c8cfa4")
    public static final class MdaTypes {
        @objid ("c191b412-31cb-4709-85a6-186253239f72")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4485b0bc-4d70-4569-bb63-cd01cc25b7cd")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("3db9940f-38f7-4ef8-acd0-4a94f6f4ee04")
        public static TagType MININSTANCES_TAGTYPE_ELT;

        @objid ("863e7c30-dedb-468e-8454-0b0e72b1eaea")
        public static TagType MAXINSTANCES_TAGTYPE_ELT;

        @objid ("984341b5-6f09-47e4-aae4-be8164e664ae")
        private static Stereotype MDAASSOCDEP;

        @objid ("aca859fa-6ca3-4689-b7f7-aa4c6168dfd7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("07baa745-0c44-49ce-b81e-7029dc4e5901")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1a20bf91-0a92-434a-9d1f-35c86788784e", "TNodeTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "39d7794d-5063-4947-87a6-f943deb91b5d", "name");
            NAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (NAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "0187a7c0-8936-4be2-ae5f-f310b341e611", "minInstances");
            MININSTANCES_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (MININSTANCES_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "44eb663e-5497-485a-864f-3911fb108301", "maxInstances");
            MAXINSTANCES_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (MAXINSTANCES_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

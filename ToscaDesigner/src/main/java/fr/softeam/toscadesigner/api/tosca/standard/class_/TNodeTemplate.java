/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
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
@objid ("a77e7411-1763-439e-8e1e-e407412626d8")
public class TNodeTemplate implements IMdaProxy {
    @objid ("74f9cde3-aa5a-4941-a447-bcd2bab7bcbf")
    public static final String STEREOTYPE_NAME = "TNodeTemplate";

    @objid ("d09f8625-bd44-4521-86db-5bdcc9b3827f")
    public static final String MAXINSTANCES_TAGTYPE = "maxInstances";

    @objid ("6b74f7fd-4cd7-4f64-86b9-31881529d513")
    public static final String MININSTANCES_TAGTYPE = "minInstances";

    @objid ("f8670c53-567a-41ba-baac-88d03cce8061")
    public static final String NAME_TAGTYPE = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("2e49e7b8-d4bf-4693-bcf0-3b6e38e8ca31")
    protected final Class elt;

    /**
     * Tells whether a {@link TNodeTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("032c963c-4aca-47f5-a564-40e06b13d83b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeTemplate >> then instantiate a {@link TNodeTemplate} proxy.
     * 
     * @return a {@link TNodeTemplate} proxy on the created {@link Class}.
     */
    @objid ("b4d08c14-598f-4d20-b598-a69383084418")
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
    @objid ("0cdd84e0-0ed9-44de-b5f3-55124980473a")
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
    @objid ("4503a7e7-d269-43b2-ba33-cefa45e05f76")
    public static TNodeTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TNodeTemplate.canInstantiate(obj))
        	return new TNodeTemplate(obj);
        else
        	throw new IllegalArgumentException("TNodeTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e0138b5e-8cda-4191-8dd7-52855bb7ca3e")
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
    @objid ("06885c88-2193-4f01-853b-ec150e8ab9d8")
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
    @objid ("11b4befd-7e49-47ed-86a7-821e0779b9ae")
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
    @objid ("4a02e5b0-8f10-4ed5-9921-fad3d6e2b85c")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5bdc396f-be64-48c8-a836-12a14077c9c5")
    public String getMaxInstances() {
        return this.elt.getTagValue(TNodeTemplate.MdaTypes.MAXINSTANCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("60fe05c2-3dbf-48fe-a29c-1c3ea1f19c9b")
    public String getMinInstances() {
        return this.elt.getTagValue(TNodeTemplate.MdaTypes.MININSTANCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7489ff52-afc5-4fda-be27-9a6e806e8e5b")
    public String getName() {
        return this.elt.getTagValue(TNodeTemplate.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'policies' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("946e2f60-a61a-4e6d-b42c-459592aa64ef")
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
    @objid ("e03cf15c-dc91-42dc-a3c8-379910f3044e")
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

    @objid ("37a98bd4-050f-431f-a0bc-7140ecff1e0d")
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
    @objid ("83af9f5b-c8bc-4d4a-a96b-fd43c2866786")
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
    @objid ("ea14a06e-a863-485c-8928-9fda3326663e")
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
    @objid ("d192e41c-2fa0-4872-8b3a-5d7745364bbd")
    public void setMaxInstances(final String value) {
        this.elt.putTagValue(TNodeTemplate.MdaTypes.MAXINSTANCES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dd39cce1-a2b0-46dc-bfda-eaf58b3c7f78")
    public void setMinInstances(final String value) {
        this.elt.putTagValue(TNodeTemplate.MdaTypes.MININSTANCES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("922367d4-f86b-4bc0-a202-8f77ead5852a")
    public void setName(final String value) {
        this.elt.putTagValue(TNodeTemplate.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'policies' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("191d6cb6-fc01-407a-8f46-4fd9dfc1dc5b")
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
    @objid ("de66c2df-f937-40bb-9971-cd0e4b1f0933")
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

    @objid ("f437e407-39ad-45e3-ade7-a66eaa22e1f4")
    protected  TNodeTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("f40e464c-418c-4826-918d-655ca8dadd55")
    public static final class MdaTypes {
        @objid ("584d9dff-cbdb-47ef-b19e-cf51edbce3ba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("71a61808-9314-449b-910d-6dc62e943a92")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("b3a9f84b-e214-4e94-85c3-fb73bcfb3053")
        public static TagType MININSTANCES_TAGTYPE_ELT;

        @objid ("7992088e-dc33-4f10-8315-30160a25b2bb")
        public static TagType MAXINSTANCES_TAGTYPE_ELT;

        @objid ("ca7be944-c1c3-4594-bfb2-c838d5236683")
        private static Stereotype MDAASSOCDEP;

        @objid ("e180bdcf-7017-4ced-8bca-5cc9e5bc01e5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b7c285d6-8695-4941-af9d-11ecb08e6b88")
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

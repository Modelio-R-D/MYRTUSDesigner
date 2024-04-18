/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
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
    @objid ("d0d35e16-50a2-4f49-b86b-d0a533379a2e")
    public static final String STEREOTYPE_NAME = "TNodeTemplate";

    @objid ("a0e6895c-cadf-44ed-8ff3-effbb0891aa6")
    public static final String MAXINSTANCES_TAGTYPE = "maxInstances";

    @objid ("6864cfd7-6d70-4b09-8edd-0de8c41a2800")
    public static final String MININSTANCES_TAGTYPE = "minInstances";

    @objid ("606c8979-f2ee-4e0f-b072-5773a7e86528")
    public static final String NAME_TAGTYPE = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("3270e3f8-b572-4970-85a7-4bcc2b74acf1")
    protected final Class elt;

    /**
     * Tells whether a {@link TNodeTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("45432013-d841-4eeb-8955-b8fc6c9c8c80")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeTemplate >> then instantiate a {@link TNodeTemplate} proxy.
     * @return a {@link TNodeTemplate} proxy on the created {@link Class}.
     */
    @objid ("dd03a877-6aea-4cf2-9ac8-cf2bf6cb2ee8")
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
    @objid ("69d59614-2b3a-40ab-8eab-488512c6cc41")
    public static TNodeTemplate instantiate(final Class obj) {
        return TNodeTemplate.canInstantiate(obj) ? new TNodeTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TNodeTemplate} proxy from a {@link Class} stereotyped << TNodeTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TNodeTemplate} proxy.
     */
    @objid ("c6bda20a-b936-4a78-87c6-977d3f4e2a6d")
    public static TNodeTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TNodeTemplate.canInstantiate(obj))
            return new TNodeTemplate(obj);
        else
            throw new IllegalArgumentException("TNodeTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("75500886-d38d-46a7-8b32-4a3c2d58ee71")
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
     */
    @objid ("d82a977f-e184-4449-a3f3-dd73aa0c497b")
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
     */
    @objid ("9e2c9a43-13bb-4df8-9877-4872ff4d6917")
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
    @objid ("86ae645c-ac3d-4731-99ca-1630997b0821")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4bde3d8e-f2e2-48e6-bc36-a78ebf970e92")
    public String getMaxInstances() {
        return this.elt.getTagValue(TNodeTemplate.MdaTypes.MAXINSTANCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("db109a65-d0ba-4f68-b677-741b0f11740a")
    public String getMinInstances() {
        return this.elt.getTagValue(TNodeTemplate.MdaTypes.MININSTANCES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2565fc3f-9611-49f8-8ca2-51626db594f5")
    public String getName() {
        return this.elt.getTagValue(TNodeTemplate.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'policies' role.<p>
     * Role description:
     * null
     */
    @objid ("9f002154-ff4b-41f0-a0f6-635e6856e44f")
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
     */
    @objid ("7cf0565e-1145-4cc1-bef4-a1ff1c4d0663")
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

    @objid ("a7c854e2-8562-4dd1-b90b-48ea6fdce8e2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'capabilities' role.<p>
     * Role description:
     * null
     */
    @objid ("6a3b6eb6-09b1-47c4-b4a0-315a24841343")
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
     */
    @objid ("073cc206-7294-4b3c-bc98-4c15a393c355")
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
    @objid ("f6ff909f-27b9-47d0-a5df-23d03d380a1e")
    public void setMaxInstances(final String value) {
        this.elt.putTagValue(TNodeTemplate.MdaTypes.MAXINSTANCES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("283da1e3-3b06-4bfe-9c64-80dc7dea6c34")
    public void setMinInstances(final String value) {
        this.elt.putTagValue(TNodeTemplate.MdaTypes.MININSTANCES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("113574ac-4abb-4a04-ac80-4458323ecc32")
    public void setName(final String value) {
        this.elt.putTagValue(TNodeTemplate.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'policies' role.<p>
     * Role description:
     * null
     */
    @objid ("a38ee5d6-474b-42f8-b246-9e8502313911")
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
     */
    @objid ("f97039de-90b5-4ed5-8988-c114f3f78231")
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

    @objid ("7bd77f94-efbb-4ef5-ab0c-de9d94bef27d")
    protected  TNodeTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("f40e464c-418c-4826-918d-655ca8dadd55")
    public static final class MdaTypes {
        @objid ("1526827a-4ff9-47fa-a111-21d2ee9f2251")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("055ba2e1-2851-4bad-89ca-6eab867a429f")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("958459fd-5d8f-4b35-9d87-2c095ae4f29e")
        public static TagType MININSTANCES_TAGTYPE_ELT;

        @objid ("2ced2c4a-8e97-47c3-8922-388aa9b96c56")
        public static TagType MAXINSTANCES_TAGTYPE_ELT;

        @objid ("3baf9a56-fb8f-416e-9d9c-4b1f49e56afa")
        private static Stereotype MDAASSOCDEP;

        @objid ("a0be8164-858a-4696-b47d-c64992a46676")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e9fe2bbd-0e80-437a-a493-de79c988f2f0")
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

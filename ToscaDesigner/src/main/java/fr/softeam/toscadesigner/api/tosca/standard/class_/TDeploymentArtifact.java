/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensibleElements;
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
 * Proxy class to handle a {@link Class} with << TDeploymentArtifact >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a51d8bcc-6a31-4155-91d7-26c72aebe272")
public class TDeploymentArtifact extends TExtensibleElements implements IMdaProxy {
    @objid ("95b50814-d8b9-459d-b0a5-6b5df0f5ac0f")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("7dcdc60a-66d4-4cea-a6f8-af9f6fd76a67")
    public static final String ARTIFACT_VERSION_PROPERTY = "artifact_version";

    @objid ("0d9465b4-b0df-4f18-9530-89b67acaccfe")
    public static final String CHECKSUM_PROPERTY = "checksum";

    @objid ("9b4d5616-9245-4410-aaa2-de4cedc7a67b")
    public static final String CHECKSUM_ALGORTIHM_PROPERTY = "checksum_algortihm";

    @objid ("4a9bae27-94f9-44ed-bb0b-b851789231bc")
    public static final String DEPLOY_PATH_PROPERTY = "deploy_path";

    @objid ("09fa4c21-7ded-4f8f-9584-7c1a2137b273")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("301a01ce-3ace-4c82-8020-7d91eaad63f9")
    public static final String FILE_PROPERTY = "file";

    @objid ("cc4ef898-192e-4a4a-b3d9-3718c5b11b56")
    public static final String REPOSITORY_PROPERTY = "repository";

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3add172d-35df-4e2e-8057-2e07a2682c0a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * 
     * @return a {@link TDeploymentArtifact} proxy on the created {@link Class}.
     */
    @objid ("e802ac52-2b50-4ff1-9f3c-a3fcf66d8603")
    public static TDeploymentArtifact create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT);
        return TDeploymentArtifact.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifact} proxy from a {@link Class} stereotyped << TDeploymentArtifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TDeploymentArtifact} proxy or <i>null</i>.
     */
    @objid ("456b695a-5414-4166-b9d3-ad2942b9b9d8")
    public static TDeploymentArtifact instantiate(final Class obj) {
        return TDeploymentArtifact.canInstantiate(obj) ? new TDeploymentArtifact(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifact} proxy from a {@link Class} stereotyped << TDeploymentArtifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TDeploymentArtifact} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("efd24412-790b-4793-9aa1-f2e273db2a1a")
    public static TDeploymentArtifact safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
        	return new TDeploymentArtifact(obj);
        else
        	throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5a1d33d9-a0b2-4be4-acea-c1dce2fe0381")
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
        TDeploymentArtifact other = (TDeploymentArtifact) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TDeploymentArtifact.artifact_version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2ab0e7d4-eea9-41a6-9019-59cec30603f9")
    public String getArtifact_version() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.ARTIFACT_VERSION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.ARTIFACT_VERSION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.ARTIFACT_VERSION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDeploymentArtifact.checksum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f2abec02-5405-4a33-a134-05ab22881a15")
    public String getChecksum() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.CHECKSUM_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.CHECKSUM_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.CHECKSUM_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDeploymentArtifact.checksum_algortihm'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0f85a298-9cf8-4736-8306-1375fdffe981")
    public String getChecksum_algortihm() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.CHECKSUM_ALGORTIHM_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.CHECKSUM_ALGORTIHM_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.CHECKSUM_ALGORTIHM_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDeploymentArtifact.deploy_path'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5c4390ef-d6ed-4df0-99ac-9f2d026401ca")
    public String getDeploy_path() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDeploymentArtifact.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("94519a0c-1241-4eec-8c7d-cf5095f3875f")
    public String getDescription() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("9fad33b1-632a-4273-b298-4037588ca922")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TDeploymentArtifact.file'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("53a01608-8a06-4e28-a7a0-c71dc48af1d0")
    public String getFile() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDeploymentArtifact.repository'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("27a34c0c-8cf3-45f8-90b1-4502982e4bf4")
    public String getRepository() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.REPOSITORY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.REPOSITORY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.REPOSITORY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a2212097-a606-4eba-a852-045780d5050e")
    public TArtifactType getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TDeploymentArtifact.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TDeploymentArtifact.MdaTypes.MDAASSOCDEP_ROLE), "type")
                  && TArtifactType.canInstantiate(d.getDependsOn())) {
                     return (TArtifactType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TArtifactType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("987799e6-9570-446e-ba42-5faf23e558c7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDeploymentArtifact.artifact_version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b1018530-d6da-42e8-99cf-05b1dbdbfec9")
    public void setArtifact_version(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.ARTIFACT_VERSION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.ARTIFACT_VERSION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDeploymentArtifact.checksum'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e7d574dd-d718-4f2c-9e2a-5f7218eb2b40")
    public void setChecksum(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.CHECKSUM_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.CHECKSUM_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDeploymentArtifact.checksum_algortihm'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1758791a-b1b9-431f-910a-e75781a25a6f")
    public void setChecksum_algortihm(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.CHECKSUM_ALGORTIHM_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.CHECKSUM_ALGORTIHM_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDeploymentArtifact.deploy_path'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aa95e333-ac6c-43b3-9b40-3dd296a7b2b0")
    public void setDeploy_path(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDeploymentArtifact.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("95c049bc-a420-4041-8143-0327a2664199")
    public void setDescription(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDeploymentArtifact.file'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("79750ffa-e732-4c87-b9f3-f4e46b8292fe")
    public void setFile(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDeploymentArtifact.repository'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("08c7c605-40fd-4d3f-a430-d7aca73622ae")
    public void setRepository(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.REPOSITORY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.REPOSITORY_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("63ea9d32-8ced-47c8-b01a-30442e39bbc3")
    public void setType(final TArtifactType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TDeploymentArtifact.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TDeploymentArtifact.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TDeploymentArtifact.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(TDeploymentArtifact.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    @objid ("7b93daf4-53b4-4129-84f6-cae693f964ac")
    protected  TDeploymentArtifact(final Class elt) {
        super(elt);
    }

    @objid ("8e866227-6b99-484e-96b2-9a11e69b3497")
    public static final class MdaTypes {
        @objid ("aeeccf65-47d8-4ef5-b72a-0c515940a2ac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bb6e102a-06a8-49b6-bc17-3223b6cd50c3")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("37d66c8b-b7a8-47e0-8702-be880a965591")
        public static PropertyDefinition REPOSITORY_PROPERTY_ELT;

        @objid ("ca3c4ace-c261-41a5-b5da-29bf94ce3d66")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("34e51f74-bd38-4876-890d-d52fe9f8fc16")
        public static PropertyDefinition DEPLOY_PATH_PROPERTY_ELT;

        @objid ("a5992987-4db4-46a9-a283-444bbd9c7a73")
        public static PropertyDefinition ARTIFACT_VERSION_PROPERTY_ELT;

        @objid ("952a6462-af29-4e55-a407-49e807930192")
        public static PropertyDefinition CHECKSUM_PROPERTY_ELT;

        @objid ("520446bc-2346-4094-a75d-7da8eb4b0d46")
        public static PropertyDefinition CHECKSUM_ALGORTIHM_PROPERTY_ELT;

        @objid ("fe71dd4b-26b5-47f0-8623-1bea86407541")
        private static Stereotype MDAASSOCDEP;

        @objid ("ee3be26e-8f7c-4c5a-ae23-88dc8d843dd9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6b93ae3f-dbe8-4a14-bfc4-31edbdeaef24")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7c624564-a87e-4058-ab8b-8f6782b68031", "TDeploymentArtifact");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "7acf9bc4-9dc3-4663-8355-4368413f2578", "file");
            FILE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (FILE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "198ef816-98ff-465e-af75-32bdb5f9da13", "repository");
            REPOSITORY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REPOSITORY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "2fd370da-daeb-4519-9f06-967d3e3cb882", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "c8fa55fe-6ff5-4ec5-9d1f-f32385091030", "deploy_path");
            DEPLOY_PATH_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DEPLOY_PATH_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "1774043f-fb09-4265-bbe1-c43047c05ff7", "artifact_version");
            ARTIFACT_VERSION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ARTIFACT_VERSION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b7dc26ea-f4bf-4f9f-b847-cc89ba624530", "checksum");
            CHECKSUM_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CHECKSUM_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a0b664be-6ddd-4e45-8208-113c85c48101", "checksum_algortihm");
            CHECKSUM_ALGORTIHM_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CHECKSUM_ALGORTIHM_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

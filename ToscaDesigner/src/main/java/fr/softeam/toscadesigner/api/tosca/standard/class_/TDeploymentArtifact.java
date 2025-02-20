/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 18/02/2025 10:30 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ModelingSessionRegistry;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensibleElements;
import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link Class} with << TDeploymentArtifact >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a51d8bcc-6a31-4155-91d7-26c72aebe272")
public class TDeploymentArtifact extends TExtensibleElements implements IMdaProxy {
    @objid ("060c0174-c1da-4c8b-9f07-245bf8e057e4")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("6e7f26d1-b325-406c-b9eb-55a7d9c3cb4d")
    public static final String ARTIFACT_VERSION_PROPERTY = "artifact_version";

    @objid ("dc43a0e5-0c2c-4369-a6ac-5161ca4d5c9a")
    public static final String CHECKSUM_PROPERTY = "checksum";

    @objid ("00675ca9-cbb2-439c-b83f-d224291ee86c")
    public static final String CHECKSUM_ALGORTIHM_PROPERTY = "checksum_algortihm";

    @objid ("fae362f7-8cf6-4c62-a52a-a37777af68a9")
    public static final String DEPLOY_PATH_PROPERTY = "deploy_path";

    @objid ("d93b9a2b-8cb1-48da-9dcb-1c987a530c2e")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("212b71d1-aabd-4f11-aea8-56817cc30764")
    public static final String FILE_PROPERTY = "file";

    @objid ("a77b6b8f-6901-4609-86c0-f99782f5bcea")
    public static final String REPOSITORY_PROPERTY = "repository";

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d47e9d32-75ad-4041-b08f-3577901a0ef7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * 
     * @return a {@link TDeploymentArtifact} proxy on the created {@link Class}.
     */
    @objid ("97c58225-c180-4b23-b49b-5749a5ba7622")
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
    @objid ("502a1815-c73f-4345-ab47-a7a628130e3d")
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
    @objid ("eb94817b-1d12-4f74-856d-b966e7bfa846")
    public static TDeploymentArtifact safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
        	return new TDeploymentArtifact(obj);
        else
        	throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2f92ef1e-ceb6-4f47-94a0-61d057a45f67")
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
    @objid ("4925e14c-c337-44fa-8b97-0f13c647caa9")
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
    @objid ("f8a5c644-4e9d-4c08-b2da-627eeb50e4af")
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
    @objid ("f93bdd29-733f-4977-b440-b1b2479beb44")
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
    @objid ("56ed6308-e98d-48b4-b7fa-656b85a826ce")
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
    @objid ("ccd48dc6-b713-4962-ac66-d3eb2857e775")
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
    @objid ("2e0e15c8-e9ef-4ff3-9ef3-ba3a35e47588")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TDeploymentArtifact.file'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("78a1bf51-4fda-493f-846b-46832f3d6063")
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
    @objid ("79106ceb-9ee3-402c-8cb7-c92728cd3eab")
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
    @objid ("b14054f7-3f6a-4cda-b3fa-4474cce4e178")
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

    @objid ("4a1e8769-6a63-4f92-992d-13220658b5f0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDeploymentArtifact.artifact_version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b19999fe-754b-4ce1-ac67-675b3d089e93")
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
    @objid ("5ef301e2-2162-4e6a-9949-9045d4f1644c")
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
    @objid ("842d1065-b43b-4d6e-afb2-b2dbfa6de4f1")
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
    @objid ("b734a9c3-d055-4df3-93b8-cd3c242c300c")
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
    @objid ("55cf7233-2808-4f11-b4d9-53e4a2cf830e")
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
    @objid ("4f2fe76e-48e0-42c3-9b93-ca757ed2f810")
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
    @objid ("1caa97ae-4694-479f-ae04-6e9fa50101fb")
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
    @objid ("9712f10d-1902-4ad8-918c-9a040febd72d")
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

    @objid ("8cb9d7ff-f682-4b1c-b7be-04b2bbccd276")
    protected  TDeploymentArtifact(final Class elt) {
        super(elt);
    }

    @objid ("8e866227-6b99-484e-96b2-9a11e69b3497")
    public static final class MdaTypes {
        @objid ("5ebb8353-3495-47bc-8c18-052861560df9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("29ec2bda-4d9d-4c89-855b-e3518ed00737")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("c614d40e-9910-43ad-b9a8-52e81ad761ae")
        public static PropertyDefinition REPOSITORY_PROPERTY_ELT;

        @objid ("997e6cfb-40a7-44ed-b582-af1e9daae1a5")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("ab35ea56-4f25-41da-bb0f-4432cf6e066f")
        public static PropertyDefinition DEPLOY_PATH_PROPERTY_ELT;

        @objid ("1f1c4b82-c1c4-4a74-a490-daa518233312")
        public static PropertyDefinition ARTIFACT_VERSION_PROPERTY_ELT;

        @objid ("4512bfc6-db77-4aea-972e-07f24c6a3c72")
        public static PropertyDefinition CHECKSUM_PROPERTY_ELT;

        @objid ("4b401f32-7fce-43c6-b792-ef138a43af16")
        public static PropertyDefinition CHECKSUM_ALGORTIHM_PROPERTY_ELT;

        @objid ("37061ac4-7726-4530-a425-115a609c3787")
        private static Stereotype MDAASSOCDEP;

        @objid ("d267bccc-50bc-4d30-aba3-ebc620c28dc2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a4481772-9075-49d9-b461-6cb5533913c4")
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

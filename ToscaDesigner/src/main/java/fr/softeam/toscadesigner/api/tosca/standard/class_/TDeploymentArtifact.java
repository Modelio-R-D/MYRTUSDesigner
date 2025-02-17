/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 18:02 by Modelio Studio.
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
    @objid ("ee66cd00-233b-42da-9d32-69498458b6d1")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("4d5d0c8b-e613-4b7c-9444-c9b1e62175b7")
    public static final String ARTIFACT_VERSION_PROPERTY = "artifact_version";

    @objid ("70ddfd3e-c0a7-4e1e-9cd2-10b1bec7945f")
    public static final String CHECKSUM_PROPERTY = "checksum";

    @objid ("44a7e4f6-50f8-4920-8f1e-04296ec6762c")
    public static final String CHECKSUM_ALGORTIHM_PROPERTY = "checksum_algortihm";

    @objid ("eac6e321-74c7-439a-905c-cba041b7db0a")
    public static final String DEPLOY_PATH_PROPERTY = "deploy_path";

    @objid ("cbf49317-3c24-4e28-8ab4-808ad53f6094")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("f20413b3-ce23-45b3-b0c3-5c79404d6b7c")
    public static final String FILE_PROPERTY = "file";

    @objid ("cf4c9624-5e11-4a03-8217-e7736497fa58")
    public static final String REPOSITORY_PROPERTY = "repository";

    @objid ("823078bf-534d-47a1-8521-633a742e5f13")
    public static final String TYPE_PROPERTY = "type";

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("44fcfc1e-f9c6-455b-9a3a-22c6023f6a9c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * 
     * @return a {@link TDeploymentArtifact} proxy on the created {@link Class}.
     */
    @objid ("67186eca-4346-4aa4-bc17-6e1b7742e403")
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
    @objid ("a4ec0dea-af06-49de-a9a0-d1be66648ad8")
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
    @objid ("5db405d2-7d2e-497d-b486-b5fd7c12cc48")
    public static TDeploymentArtifact safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
        	return new TDeploymentArtifact(obj);
        else
        	throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("11fedf0a-f14b-4f36-870f-60507a7eddfb")
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
    @objid ("f9bfd33a-aa13-481a-8201-b1128dc1cf68")
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
    @objid ("dba1a4a2-a137-424c-b4fe-118e4c78ada9")
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
    @objid ("503e6ed1-3294-443b-89e5-c426fdb7ad47")
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
    @objid ("53df33ac-1962-4b37-83d6-4af8736aa9d1")
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
    @objid ("7dda4514-3a53-429d-b805-a9d1b77d9e25")
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
    @objid ("b5a701ca-2176-4ae1-aac4-2cb777d15abc")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TDeploymentArtifact.file'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4c249e2b-971e-4a10-bb24-8cfb52576059")
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
    @objid ("a3b959d5-1ff2-403c-9ba8-cc6478f95a8f")
    public String getRepository() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.REPOSITORY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.REPOSITORY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.REPOSITORY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDeploymentArtifact.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("85d37e43-5b0a-4405-814b-c48956ce5d5b")
    public String getType() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("77c9e73d-24f1-4475-8609-6822c8c66b10")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDeploymentArtifact.artifact_version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("90d75b03-2f4e-4c89-877f-47c7caa724ea")
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
    @objid ("3299dcda-d63a-42c6-b9da-068a4cb1d80b")
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
    @objid ("0c4b2b74-e540-47c9-87de-239416c00f75")
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
    @objid ("1e003bcf-eecd-4ff8-ab0b-62bd09bd747c")
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
    @objid ("5094bda1-7f4c-423a-82f6-bd9e9adf32fd")
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
    @objid ("479dbe93-83c8-4c5c-b554-a8085bc2e7d3")
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
    @objid ("09a088f0-ecb3-42d6-ad25-221fa10d7a7b")
    public void setRepository(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.REPOSITORY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.REPOSITORY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDeploymentArtifact.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("33d41f0f-4036-4b64-9ab3-dbc6de4c96b2")
    public void setType(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("7cfce613-c756-463c-a1f6-fa16fcc7b314")
    protected  TDeploymentArtifact(final Class elt) {
        super(elt);
    }

    @objid ("8e866227-6b99-484e-96b2-9a11e69b3497")
    public static final class MdaTypes {
        @objid ("90493bc7-4a4f-4997-ab81-5bbb522873a9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f09f31fd-4c9e-4357-a65e-78a2b262b3f7")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("e532c8b9-8cc2-4870-ac14-2026db594510")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("67dc9f21-5ecf-4c4b-aa80-7f0ac8ca8d08")
        public static PropertyDefinition REPOSITORY_PROPERTY_ELT;

        @objid ("b5c71681-aa8f-4e29-9f86-4212cd013510")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("51c3c1a5-fa25-4d47-b717-de42fb5c9058")
        public static PropertyDefinition DEPLOY_PATH_PROPERTY_ELT;

        @objid ("173ff121-4863-4df2-bf3a-6154176b69fc")
        public static PropertyDefinition ARTIFACT_VERSION_PROPERTY_ELT;

        @objid ("9bba0493-55f8-4677-ac13-ad783d145289")
        public static PropertyDefinition CHECKSUM_PROPERTY_ELT;

        @objid ("a6e6700f-459b-4a27-aeb6-39310858464b")
        public static PropertyDefinition CHECKSUM_ALGORTIHM_PROPERTY_ELT;

        @objid ("8cdc8a17-999f-4e51-a181-671031de6445")
        private static Stereotype MDAASSOCDEP;

        @objid ("eabdb7a8-23a5-4d0e-8783-db89f8ddd77c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b0b45f77-b2ab-45fd-b01e-9a89cc1b3003")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7c624564-a87e-4058-ab8b-8f6782b68031", "TDeploymentArtifact");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "11b2ec8c-7e88-4012-b051-c5ff3843b3d7", "type");
            TYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

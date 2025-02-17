/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 15:39 by Modelio Studio.
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
    @objid ("08d7a7fe-e87c-4fd3-8d0b-f2622b20c5ea")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("5b093d4a-1107-42a2-ac1a-454e514fbde5")
    public static final String ARTIFACT_VERSION_PROPERTY = "artifact_version";

    @objid ("90defc7f-6dc4-4cd4-bfd0-e4b7021b9358")
    public static final String CHECKSUM_PROPERTY = "checksum";

    @objid ("4725e620-1f05-4100-b932-5e9bfa8d8bb2")
    public static final String CHECKSUM_ALGORTIHM_PROPERTY = "checksum_algortihm";

    @objid ("07ce1ef5-048f-4913-8bee-1565b084edc1")
    public static final String DEPLOY_PATH_PROPERTY = "deploy_path";

    @objid ("53ebac18-725e-48dc-84ae-ea097916cfdd")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("b1e035ab-546a-4592-b021-498999096207")
    public static final String FILE_PROPERTY = "file";

    @objid ("7cffce19-17b7-4a66-856d-551d4b9e109c")
    public static final String REPOSITORY_PROPERTY = "repository";

    @objid ("d888cb7b-fecd-4200-9b19-3a66dc7def42")
    public static final String TYPE_PROPERTY = "type";

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cc05f71a-0055-40bb-ac27-b41f1987db75")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * 
     * @return a {@link TDeploymentArtifact} proxy on the created {@link Class}.
     */
    @objid ("93b44e67-3d3f-4010-98d8-e45c3f0410d9")
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
    @objid ("6394b334-1235-4c1d-abdc-6c9ac6e4c5b3")
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
    @objid ("2fffe668-5cd8-49c0-bfab-bbb1b2db0799")
    public static TDeploymentArtifact safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
        	return new TDeploymentArtifact(obj);
        else
        	throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c8b59f33-6747-4fb1-b122-bc565bb5a535")
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
    @objid ("01aedc8f-8c45-41de-9b91-a8030b9c3c37")
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
    @objid ("ee6ff1e2-b020-4cb8-a7d7-654aa8fe900e")
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
    @objid ("f667ecf8-d048-4bbb-b598-8868455e3c22")
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
    @objid ("5dffb16a-0dfb-448e-8309-d4db9ccffe88")
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
    @objid ("f200de04-a0f4-4256-aea9-a3ea09975dfa")
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
    @objid ("64abfc90-47ab-44d0-9208-d306e45b86f9")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TDeploymentArtifact.file'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9f40d394-9274-483c-a83a-67d30088ed9e")
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
    @objid ("299eb094-70bf-4446-a53c-7c818e1d9787")
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
    @objid ("354b1d5e-fde2-4477-9cb6-e3a4d73e7375")
    public String getType() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("f0f6b5f2-d448-473c-93ca-114cea51df42")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDeploymentArtifact.artifact_version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5e6f8fe5-8759-498d-b379-2925367179f9")
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
    @objid ("228f1b0b-a01e-483e-969a-c855c2093f66")
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
    @objid ("4c12e4c4-d2e6-4cd5-965a-3c5ee31088d6")
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
    @objid ("929b10f4-f663-4887-ab68-ee38abfe360c")
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
    @objid ("fb63915f-b1d0-4f7a-8f02-9a8d2b737b37")
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
    @objid ("ac4f117c-8f12-4794-87c4-9615f27d1860")
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
    @objid ("3b5bd42f-1afa-43ee-9d7f-70161808c842")
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
    @objid ("b7c0de48-5fee-4a7d-8dd1-b4625c1e1e6d")
    public void setType(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("d3b6dd36-4504-4579-bb90-8f2b7e2c031b")
    protected  TDeploymentArtifact(final Class elt) {
        super(elt);
    }

    @objid ("8e866227-6b99-484e-96b2-9a11e69b3497")
    public static final class MdaTypes {
        @objid ("e117ab1a-3891-40ef-83eb-0c412ed0e099")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("33f9d440-f506-4909-92ed-308bb670248a")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("38704e38-452c-43ea-9527-b8a23d99950a")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("6bd03bf9-8b5f-4cf2-b6bc-5d8c311b1b3c")
        public static PropertyDefinition REPOSITORY_PROPERTY_ELT;

        @objid ("bdb678a4-15e1-45d1-90bd-eb1cde97929c")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("e7df97a6-6e20-4a4f-a305-056bc05e2131")
        public static PropertyDefinition DEPLOY_PATH_PROPERTY_ELT;

        @objid ("284bd3d8-da94-43a7-b151-e3ab31886057")
        public static PropertyDefinition ARTIFACT_VERSION_PROPERTY_ELT;

        @objid ("96d6ca8a-4497-4f33-9962-5628ac03d1db")
        public static PropertyDefinition CHECKSUM_PROPERTY_ELT;

        @objid ("715fa353-7b20-487c-803e-0f2e454f4c33")
        public static PropertyDefinition CHECKSUM_ALGORTIHM_PROPERTY_ELT;

        @objid ("a2ba82d1-2869-483b-8e70-51f4a7aaebd8")
        private static Stereotype MDAASSOCDEP;

        @objid ("edb234c8-1272-4463-93e3-1ea07a6c2364")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("902589c8-5c49-4f8a-a8e5-8af9ece7f315")
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

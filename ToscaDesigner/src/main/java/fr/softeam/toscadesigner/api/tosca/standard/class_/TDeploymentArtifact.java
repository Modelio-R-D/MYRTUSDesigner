/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:52 by Modelio Studio.
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
    @objid ("23977480-d69f-4740-9786-eab2bff912eb")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("f6f4bd28-3180-4f3c-8dfb-357f13a59576")
    public static final String ARTIFACT_VERSION_PROPERTY = "artifact_version";

    @objid ("e38ebb86-c18b-4356-85f2-5a4e263f9a1d")
    public static final String CHECKSUM_PROPERTY = "checksum";

    @objid ("c5f41920-9900-433d-a006-d87a11b5df33")
    public static final String CHECKSUM_ALGORTIHM_PROPERTY = "checksum_algortihm";

    @objid ("3e5f4f32-147c-4813-bbe4-55eaa19028b9")
    public static final String DEPLOY_PATH_PROPERTY = "deploy_path";

    @objid ("87a68c50-5579-4ef6-8b38-d09972f0209d")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("6599d43f-3dcb-4a70-94db-c2f54d53dc3d")
    public static final String FILE_PROPERTY = "file";

    @objid ("2bb0fda2-531f-44f4-a3eb-b231367b101a")
    public static final String REPOSITORY_PROPERTY = "repository";

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8d81043b-e637-407c-a6ff-46f29649d540")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * 
     * @return a {@link TDeploymentArtifact} proxy on the created {@link Class}.
     */
    @objid ("3f3a43b6-8c62-45e5-9abb-ae54e8fef52c")
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
    @objid ("b496699d-53cb-49d7-8381-48e606d4225b")
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
    @objid ("f78a3054-aee6-49cb-b52e-617a59d3e644")
    public static TDeploymentArtifact safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
        	return new TDeploymentArtifact(obj);
        else
        	throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c7aa547b-cac1-4c36-a931-4b83b56abf93")
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
    @objid ("458211fd-2b82-461c-9c61-cd5727ed8008")
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
    @objid ("55adc7f0-d3c7-4556-a7df-2a1645b20ca6")
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
    @objid ("059f6de4-0305-45e2-b97a-f639c1de977d")
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
    @objid ("347acdbe-2fde-4408-9b07-be889aa3331b")
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
    @objid ("ee8aec9b-7609-4b0c-83a0-513bffc3b92b")
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
    @objid ("8e9d9c28-2637-4c8b-8db6-1db6cea5cf36")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TDeploymentArtifact.file'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4f85e882-1fda-4ffd-8f18-93f6bb8b09a5")
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
    @objid ("db6bca64-55fc-43b3-9001-a8902b9bb0c4")
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
    @objid ("2357177b-2b7b-40de-bbb8-f40e6dbe16ec")
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

    @objid ("a90e420d-9fce-4ad9-a359-e564ba8d97a3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDeploymentArtifact.artifact_version'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8b97559b-a84e-4ade-9932-98081e432620")
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
    @objid ("8ca98aec-95ab-4fab-9d83-5b9e591e6aea")
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
    @objid ("ffe1f239-ebc8-4a96-b969-f38a87b5bcef")
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
    @objid ("1ec8c281-94ba-413b-91e7-2df43580d0ff")
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
    @objid ("7fd17297-2100-4293-b065-79302fb5867a")
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
    @objid ("3c8d2026-e1ee-4045-b610-544dc1d71b9b")
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
    @objid ("1d7724c5-5d0d-4fb9-a7c7-50807d668b2c")
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
    @objid ("fc21e5ed-270e-4294-89f4-6ceadc764dc4")
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

    @objid ("7737a87a-3661-45f3-aab9-ca151d971ae6")
    protected  TDeploymentArtifact(final Class elt) {
        super(elt);
    }

    @objid ("8e866227-6b99-484e-96b2-9a11e69b3497")
    public static final class MdaTypes {
        @objid ("fd85d620-ae98-41af-b8c8-55f8adc47970")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2a0f6686-4e0c-4aa0-a912-4a255a213ddd")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("2b018de9-447a-42ad-be32-a73435951912")
        public static PropertyDefinition REPOSITORY_PROPERTY_ELT;

        @objid ("76560330-1ec4-43f2-87dc-b9b2803cc7c2")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("a55a3b21-7d88-452d-b27a-5c4f7735b564")
        public static PropertyDefinition DEPLOY_PATH_PROPERTY_ELT;

        @objid ("1fa5d3a8-de6b-4d5c-a5b5-c41c3d1190fa")
        public static PropertyDefinition ARTIFACT_VERSION_PROPERTY_ELT;

        @objid ("d6e2730b-7095-4032-a824-845b095c7533")
        public static PropertyDefinition CHECKSUM_PROPERTY_ELT;

        @objid ("c5869cb7-8723-4c1c-9752-f3712ece0719")
        public static PropertyDefinition CHECKSUM_ALGORTIHM_PROPERTY_ELT;

        @objid ("95e9b54c-0790-4087-a922-33c676af1e4d")
        private static Stereotype MDAASSOCDEP;

        @objid ("2fd4ec0e-f8d9-4804-bf17-34ae3bcfc867")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d6709f2-b53a-4f04-9b94-834a6a79a6f2")
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

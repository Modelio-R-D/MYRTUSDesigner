/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

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
import fr.softeam.toscadesigner.impl.MdaProxyException;
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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << TDeploymentArtifact >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("102eb1f1-1465-4fd6-8ee2-0415f2690123")
public class TDeploymentArtifact extends TExtensibleElements implements IMdaProxy {
    @objid ("44a2e7ca-65b0-4430-ba9f-5bd39e82c265")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("a0f26758-d6b8-4bad-8932-0a5a114da14b")
    public static final String DEPLOY_PATH_PROPERTY = "Deploy_path";

    @objid ("8161ab0b-8be0-488d-9aba-a3cdc4cb361e")
    public static final String FILE_PROPERTY = "File";

    @objid ("b95a4370-61a9-4c1b-b4bf-22c39e0c27a0")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("98fb4e78-66ef-4b28-9445-cf80829e4081")
    public static final String ARTIFACTREF_PROPERTY = "artifactref";

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ae833aac-ff23-411c-92f4-4cd9e43338aa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * 
     * @return a {@link TDeploymentArtifact} proxy on the created {@link ModelElement}.
     */
    @objid ("0640e7c4-6776-411f-8fb9-979bf0d4012a")
    public static TDeploymentArtifact create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT);
        return TDeploymentArtifact.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifact} proxy from a {@link ModelElement} stereotyped << TDeploymentArtifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TDeploymentArtifact} proxy or <i>null</i>.
     */
    @objid ("f4388280-124a-4c49-b7f7-cf0c7aceec68")
    public static TDeploymentArtifact instantiate(final ModelElement obj) {
        return TDeploymentArtifact.canInstantiate(obj) ? new TDeploymentArtifact(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifact} proxy from a {@link ModelElement} stereotyped << TDeploymentArtifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TDeploymentArtifact} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("20f851c5-4be5-43b0-a134-48f6c82cbace")
    public static TDeploymentArtifact safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
        	return new TDeploymentArtifact(obj);
        else
        	throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("044f93e8-3472-4263-989a-55c6dfda3a1a")
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
     * Getter for property 'TDeploymentArtifact.artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1a3c9a52-25c3-4bb8-add4-994852ee6d2f")
    public String getArtifactType() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDeploymentArtifact.artifactref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6f1f873b-3f66-4922-b685-a481cd8d7c53")
    public String getArtifactref() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TDeploymentArtifact.Deploy_path'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("692fccd0-9b2e-480b-809e-5faf3712ab3a")
    public String getDeploy_path() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("a2d4a2bc-5b2c-41d9-ba74-ad8f11383503")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TDeploymentArtifact.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9c50e311-e91c-482c-a35d-d11042e40fba")
    public String getFile() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("ca495b81-5605-425f-8f50-28d36b7a7c02")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDeploymentArtifact.artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a5f7d5b4-c420-4dc7-bca4-7de31cafce70")
    public void setArtifactType(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDeploymentArtifact.artifactref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7b2c34cc-180b-486f-8301-411b463b1296")
    public void setArtifactref(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDeploymentArtifact.Deploy_path'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f18141d4-b9f0-496e-b2b3-4f413a991b51")
    public void setDeploy_path(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDeploymentArtifact.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("74c0fef3-3535-4148-9f32-a7d46dad4cbd")
    public void setFile(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT, value));
    }

    @objid ("a37e2510-5a7a-4e08-9f38-ae8269b717ef")
    protected  TDeploymentArtifact(final ModelElement elt) {
        super(elt);
    }

    @objid ("430ed3fc-240f-45ff-a143-01f60fe0039f")
    public static final class MdaTypes {
        @objid ("1fde844b-7bca-46f4-aa1f-ce4f9d095266")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c2807817-cbdc-4a61-81fe-ee16253a6ffe")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("6efbbfdc-181d-4477-996e-40fbd0e1cd94")
        public static PropertyDefinition ARTIFACTREF_PROPERTY_ELT;

        @objid ("9394cfff-3b8d-4ce9-b8c6-4e2d4bb96526")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("0c2bfd79-c07e-4f78-8d6f-9430fd562b32")
        public static PropertyDefinition DEPLOY_PATH_PROPERTY_ELT;

        @objid ("eaf907ed-5f6a-4162-b646-8534deea8548")
        private static Stereotype MDAASSOCDEP;

        @objid ("3cf81541-45d0-4fdb-90e5-157bb94f8b02")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("416a93b4-23fe-4938-a4b2-071556eb3df0")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7c624564-a87e-4058-ab8b-8f6782b68031", "TDeploymentArtifact");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "11b2ec8c-7e88-4012-b051-c5ff3843b3d7", "artifactType");
            ARTIFACTTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ARTIFACTTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "7acf9bc4-9dc3-4663-8355-4368413f2578", "artifactref");
            ARTIFACTREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ARTIFACTREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "198ef816-98ff-465e-af75-32bdb5f9da13", "File");
            FILE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (FILE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "be5a4c69-add9-4d4c-99cb-05a0a69359ba", "Deploy_path");
            DEPLOY_PATH_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DEPLOY_PATH_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

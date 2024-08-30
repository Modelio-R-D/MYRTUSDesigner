/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 17:44 by Modelio Studio.
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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << TDeploymentArtifact >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d22f3225-0a08-4530-b64e-cc51eeec4ca1")
public class TDeploymentArtifact extends TExtensibleElements implements IMdaProxy {
    @objid ("720cfd41-7854-4a8c-a69b-e77911932619")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("003a38c3-387f-4b0d-83bb-1f8156ab4a97")
    public static final String DEPLOY_PATH_PROPERTY = "Deploy_path";

    @objid ("4a85dedf-4325-4ddc-81ae-282e704bc15b")
    public static final String FILE_PROPERTY = "File";

    @objid ("217aab78-f54a-468a-aeab-50261d3f7f1f")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("0b1e74a3-b1fa-4368-84cc-16681fb033a0")
    public static final String ARTIFACTREF_PROPERTY = "artifactref";

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0f0baf0f-000d-4aa2-9725-07bec60a9f1d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * 
     * @return a {@link TDeploymentArtifact} proxy on the created {@link ModelElement}.
     */
    @objid ("6cf240e4-7c4a-465e-a716-46ad70b6949b")
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
    @objid ("ea48fa62-e2ae-4f91-94d0-4e9cdd2cdc02")
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
    @objid ("ac282efe-efd2-4bb8-8638-a93d94ca6a32")
    public static TDeploymentArtifact safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
        	return new TDeploymentArtifact(obj);
        else
        	throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6710db41-08ae-45cb-96d0-095d4e68d9fe")
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
    @objid ("252862ef-4ea2-4a5c-9129-9a3b8afabfe1")
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
    @objid ("1d8139b2-5ee8-4e0f-b408-67e80ccad553")
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
    @objid ("a93f5b1f-b06a-4cc7-9f84-95448f726e87")
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
    @objid ("7902dc41-b9f4-4354-83e0-c883d9438912")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TDeploymentArtifact.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("54cd4d65-579d-4230-afd0-3b506209f06e")
    public String getFile() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("80ff2d0a-a223-4b7a-a733-077ba359ff55")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDeploymentArtifact.artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e181788f-44f3-4967-9da5-af8e1bf201d9")
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
    @objid ("07fc0008-73aa-40a7-a4e5-cf914b5a285b")
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
    @objid ("1e2c9e66-5b41-4192-8d07-10b880c3c440")
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
    @objid ("179b0203-f012-4e3d-bda3-ef56708dff60")
    public void setFile(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT, value));
    }

    @objid ("afd171a9-26c7-46ef-9902-7add48cb582d")
    protected  TDeploymentArtifact(final ModelElement elt) {
        super(elt);
    }

    @objid ("763b1f62-7408-480f-9b00-d71b7b439ad9")
    public static final class MdaTypes {
        @objid ("2d183704-8fea-4540-a515-07a977360e32")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("45d01476-6170-4cd6-899a-303c4bd432f1")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("e7332c6f-f26f-48c0-8fad-029e626e4cab")
        public static PropertyDefinition ARTIFACTREF_PROPERTY_ELT;

        @objid ("d882a9f6-d2fe-4aa1-92ea-86141705c578")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("1d748932-9a7a-4e41-b1fb-5c0f42567839")
        public static PropertyDefinition DEPLOY_PATH_PROPERTY_ELT;

        @objid ("255e66fd-4b3a-4290-92e5-1292b9a2e4d5")
        private static Stereotype MDAASSOCDEP;

        @objid ("4352e098-47d9-4980-a9fe-a5bcb3823ac1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("37fba539-6284-4441-84c4-ad3613f16047")
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

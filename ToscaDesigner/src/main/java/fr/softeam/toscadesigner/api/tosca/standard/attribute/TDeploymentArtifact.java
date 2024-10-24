/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Attribute} with << TDeploymentArtifact >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c9d539fa-8ef1-4d73-bd9f-3ab37946cf66")
public class TDeploymentArtifact extends TExtensibleElements implements IMdaProxy {
    @objid ("0122c8f0-a7b3-41da-858e-09f24ece190c")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("802ed003-6f6f-4c6d-a8f8-fe2439cbf1ef")
    public static final String DEPLOY_PATH_PROPERTY = "Deploy_path";

    @objid ("753dfab8-ca8b-41ae-8840-b594e9784352")
    public static final String FILE_PROPERTY = "File";

    @objid ("5e320360-82c4-41ea-84fb-a3b3c8a234a8")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("6ea916a0-23fe-49ab-b353-55595999a347")
    public static final String ARTIFACTREF_PROPERTY = "artifactref";

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b272ae23-a23e-412f-b46c-7e8fdce17804")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * @return a {@link TDeploymentArtifact} proxy on the created {@link Attribute}.
     */
    @objid ("131ee793-1cd3-43ea-be0e-12705bf3906b")
    public static TDeploymentArtifact create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT);
        return TDeploymentArtifact.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifact} proxy from a {@link Attribute} stereotyped << TDeploymentArtifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link TDeploymentArtifact} proxy or <i>null</i>.
     */
    @objid ("28275890-8e2a-4477-970a-3723ab44926f")
    public static TDeploymentArtifact instantiate(final Attribute obj) {
        return TDeploymentArtifact.canInstantiate(obj) ? new TDeploymentArtifact(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifact} proxy from a {@link Attribute} stereotyped << TDeploymentArtifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TDeploymentArtifact} proxy.
     */
    @objid ("f2885e42-ec56-40d5-8ee3-635b2326927c")
    public static TDeploymentArtifact safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
            return new TDeploymentArtifact(obj);
        else
            throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e4957835-ceec-4811-8ddf-7e8956b984d9")
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
    @objid ("f2954972-e1d2-424f-b864-336783c1d933")
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
    @objid ("725f61ba-d7f8-45ed-a74e-c25ee7195ae8")
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
    @objid ("e139916b-9cfd-4b74-b3a2-8bc41eed96b1")
    public String getDeploy_path() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.DEPLOY_PATH_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Get the underlying {@link Attribute}.
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("1918f78b-5fbd-43c7-ad53-40f4f8341d7c")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for property 'TDeploymentArtifact.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("688ec856-3a7c-43d6-b51b-5acaab7bf720")
    public String getFile() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("96651cd2-3597-4b24-89bd-5f8c04af3293")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TDeploymentArtifact.artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e36861ff-71d7-4e70-b0c5-69b201915707")
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
    @objid ("7321ae32-28c6-4bcc-b546-edc5a4a527bf")
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
    @objid ("a124068a-6773-4d32-a8fb-15aeea593232")
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
    @objid ("49175727-0ac9-484f-b9d8-1037f0cc8b83")
    public void setFile(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT, value));
    }

    @objid ("c019cbb5-74d0-4a3c-bd53-524407d76469")
    protected  TDeploymentArtifact(final Attribute elt) {
        super(elt);
    }

    @objid ("ce6066cf-cb01-427e-bcef-6dfdf4ea32b6")
    public static final class MdaTypes {
        @objid ("699c4f2d-9e10-456a-9c72-752faf334d65")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("71a4fa21-f253-411f-872b-9c7182f1f6bf")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("60ec52db-f3a8-4a18-b7c2-24e956d41d55")
        public static PropertyDefinition ARTIFACTREF_PROPERTY_ELT;

        @objid ("9256f651-0cfe-4129-9867-13cc14881da7")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("9786f07e-9e72-432c-adee-505285df2a43")
        public static PropertyDefinition DEPLOY_PATH_PROPERTY_ELT;

        @objid ("b08372ec-08f6-483f-a2bb-5fc5d08106ee")
        private static Stereotype MDAASSOCDEP;

        @objid ("50a18ba7-e92a-43d0-8c6e-2ec8f7e66063")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6f5d0a57-6406-4070-bc83-e59811b6780d")
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

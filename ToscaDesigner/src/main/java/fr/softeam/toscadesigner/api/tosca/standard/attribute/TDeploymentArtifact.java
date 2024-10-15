/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/10/2024 11:39 by Modelio Studio.
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
    @objid ("81637ffc-1a51-43b7-838a-f2cadef535dd")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("f9eb71d3-e063-4469-9010-c379c0b4c69d")
    public static final String DEPLOY_PATH_PROPERTY = "Deploy_path";

    @objid ("48076fcf-86fd-450f-8590-eeed3591727b")
    public static final String FILE_PROPERTY = "File";

    @objid ("8deee744-859b-4f0b-ab21-abfeeac18c17")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("f3c78754-aa68-4111-8fb0-d1f75ead6619")
    public static final String ARTIFACTREF_PROPERTY = "artifactref";

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("289cba4f-8c4c-4484-962d-873d825aee1e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * 
     * @return a {@link TDeploymentArtifact} proxy on the created {@link Attribute}.
     */
    @objid ("51dae06b-f732-4ae0-b952-5ece0a35c044")
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
    @objid ("d53e7ed5-c20c-419c-9380-16d2ce2b7543")
    public static TDeploymentArtifact instantiate(final Attribute obj) {
        return TDeploymentArtifact.canInstantiate(obj) ? new TDeploymentArtifact(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifact} proxy from a {@link Attribute} stereotyped << TDeploymentArtifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TDeploymentArtifact} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f8226158-5bd1-4045-b8d4-ceae1947f6b6")
    public static TDeploymentArtifact safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
        	return new TDeploymentArtifact(obj);
        else
        	throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5d763d51-1dd7-4882-aef5-e2e2d07e5ab0")
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
    @objid ("8aa4406f-d23e-4311-ab12-c5c2fde01b0b")
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
    @objid ("8f298735-5006-4b14-863a-d32392bc1360")
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
    @objid ("1e12f850-ee1f-4506-981e-3f7383d69936")
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
    @objid ("f81b1cbe-1aba-4ce1-bfbf-cba0aa83a131")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for property 'TDeploymentArtifact.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cb65d29b-191e-4065-a5ff-2e52665fcc16")
    public String getFile() {
        String value = this.elt.getProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("d1660e23-872d-4988-a268-0625858375fb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDeploymentArtifact.artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7c658796-d848-44f2-9585-cb2168c28573")
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
    @objid ("c0714cef-99f5-4515-9f69-bb84dcb1ca81")
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
    @objid ("64d8c82d-0f9f-489d-a606-0429d069852d")
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
    @objid ("33ae727a-2aca-4c5b-bb79-c4c066fa8095")
    public void setFile(final String value) {
        this.elt.setProperty(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT,
                             TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDeploymentArtifact.MdaTypes.FILE_PROPERTY_ELT, value));
    }

    @objid ("9933be83-417b-4f89-b2fd-053ddb3b93fe")
    protected  TDeploymentArtifact(final Attribute elt) {
        super(elt);
    }

    @objid ("ce6066cf-cb01-427e-bcef-6dfdf4ea32b6")
    public static final class MdaTypes {
        @objid ("5e969182-0c33-4ddd-a1d6-7f792365bef9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1812ead7-9ff8-4b9b-81e9-e2f7a5a1ad51")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("377f2708-d37f-4cfa-842b-f86b5ed620dd")
        public static PropertyDefinition ARTIFACTREF_PROPERTY_ELT;

        @objid ("a29b912f-23e5-415b-8b16-798a0c4dd8d5")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("bf9feab3-07e2-43c0-adff-0cd6d55cdc72")
        public static PropertyDefinition DEPLOY_PATH_PROPERTY_ELT;

        @objid ("6a03ea1c-7c7c-4722-b216-975fe53a7ac3")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a965105-a056-40a5-b223-bafdf8561973")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fdc57b28-9746-47d3-8806-3e5d669ae2a9")
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

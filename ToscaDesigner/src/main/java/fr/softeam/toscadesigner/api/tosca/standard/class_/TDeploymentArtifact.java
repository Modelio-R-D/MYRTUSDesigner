/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 12/06/2024 14:58 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TDeploymentArtifact >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a66cda53-5915-456f-a3fd-87befb5eab0f")
public class TDeploymentArtifact implements IMdaProxy {
    @objid ("56e75d7c-5945-43bd-b434-d5b919ebe072")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("539dc8af-1e25-415d-86bc-b5a36c0b8aed")
    public static final String ARTIFACTREF_TAGTYPE = "artifactRef";

    @objid ("299aeb94-929a-46a3-b21a-e6f1a3f8b69a")
    public static final String ARTIFACTTYPE_TAGTYPE = "artifactType";

    @objid ("87b1533c-0b81-4555-939a-906269161d9b")
    public static final String NAME_TAGTYPE = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("f0b198c9-2855-4159-b718-7bf5c7024879")
    protected final Class elt;

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d40d767a-195a-4080-877d-8138b9f7d461")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * @return a {@link TDeploymentArtifact} proxy on the created {@link Class}.
     */
    @objid ("c234b7c9-cfbf-425c-80c9-9fcdb289297c")
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
    @objid ("7ea2afb4-37a3-4402-9a93-a8aaaaaae5b0")
    public static TDeploymentArtifact instantiate(final Class obj) {
        return TDeploymentArtifact.canInstantiate(obj) ? new TDeploymentArtifact(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifact} proxy from a {@link Class} stereotyped << TDeploymentArtifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TDeploymentArtifact} proxy.
     */
    @objid ("ad60727f-ab63-46d1-ba2a-dcb66ec7a10b")
    public static TDeploymentArtifact safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
            return new TDeploymentArtifact(obj);
        else
            throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("38f802f3-c374-4b51-87a9-6ac84ae6642b")
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
     * Getter for string property 'artifactRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("156a3fb9-c720-456b-9c2e-f694413c75a7")
    public String getArtifactRef() {
        return this.elt.getTagValue(TDeploymentArtifact.MdaTypes.ARTIFACTREF_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("42644d3e-eff0-4805-98d4-11210a61b464")
    public String getArtifactType() {
        return this.elt.getTagValue(TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("96c7e5a8-280a-4d65-8476-ee02307b6626")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("93684896-cdfa-4214-a213-d048e1c27728")
    public String getName() {
        return this.elt.getTagValue(TDeploymentArtifact.MdaTypes.NAME_TAGTYPE_ELT);
    }

    @objid ("c63ddb5a-5886-459c-bbe4-25f69d343f4f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'artifactRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c70afc2e-6fc2-4a7d-a28d-864e43f634be")
    public void setArtifactRef(final String value) {
        this.elt.putTagValue(TDeploymentArtifact.MdaTypes.ARTIFACTREF_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d29756b1-1c16-4e8c-ad61-9dc1b0cd20fa")
    public void setArtifactType(final String value) {
        this.elt.putTagValue(TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("266e105c-502e-4077-aaf4-fcffc09e492b")
    public void setName(final String value) {
        this.elt.putTagValue(TDeploymentArtifact.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    @objid ("9713be32-b816-4e6b-bab0-5c56fb114fdb")
    protected  TDeploymentArtifact(final Class elt) {
        this.elt = elt;
    }

    @objid ("3ba30de3-e90c-43d3-b77b-38218e1a3cbc")
    public static final class MdaTypes {
        @objid ("69dbc0ec-ae45-42f4-adee-611e6aaf325d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("679b18de-40b6-44e3-bc5d-f71150805678")
        public static TagType ARTIFACTREF_TAGTYPE_ELT;

        @objid ("2fcbe07f-2990-440b-bd9f-d36c1de392f1")
        public static TagType ARTIFACTTYPE_TAGTYPE_ELT;

        @objid ("d363ed3e-dc2e-4217-a875-ee9f145629dc")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("993c86f8-4b42-4f7b-98df-29c4d52c0a5f")
        private static Stereotype MDAASSOCDEP;

        @objid ("378e4330-58ca-4a70-a189-de07ffad3607")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d752d493-16af-4728-a310-a67f9d76dd68")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7c624564-a87e-4058-ab8b-8f6782b68031", "TDeploymentArtifact");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "00f224d5-08f2-42a7-af61-f6e906e8305b", "artifactRef");
            ARTIFACTREF_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (ARTIFACTREF_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "22483516-011a-4784-bde3-0f4bcadf9d00", "artifactType");
            ARTIFACTTYPE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (ARTIFACTTYPE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "8e15fb0f-c599-408f-b15a-4c8affdd8658", "name");
            NAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (NAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

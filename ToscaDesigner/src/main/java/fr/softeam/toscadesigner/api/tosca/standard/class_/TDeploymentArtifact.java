/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/06/2024 17:18 by Modelio Studio.
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
@objid ("5c01806c-cfbf-4929-8787-a126def6907c")
public class TDeploymentArtifact implements IMdaProxy {
    @objid ("368582a7-9087-44d9-ab56-a5f80219cd71")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("33ac6e25-d74b-44b7-81c4-7be04570a20d")
    public static final String ARTIFACTREF_TAGTYPE = "artifactRef";

    @objid ("3b844cb4-2bcf-4952-9e92-6655addb7148")
    public static final String ARTIFACTTYPE_TAGTYPE = "artifactType";

    @objid ("acb6fafe-8aa5-475f-8b2b-102f44bb1535")
    public static final String NAME_TAGTYPE = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("ee416e12-f1ad-4520-be02-f5ad858e3245")
    protected final Class elt;

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5764bcad-d960-4650-9da0-c237be0fc62d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * 
     * @return a {@link TDeploymentArtifact} proxy on the created {@link Class}.
     */
    @objid ("1da1a444-6e86-47cf-9b57-7354ff6f4e79")
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
    @objid ("5bc8678b-e103-417d-a466-b61d93a9bf08")
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
    @objid ("d24d976a-ecc8-42d3-9049-5404763c753b")
    public static TDeploymentArtifact safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
        	return new TDeploymentArtifact(obj);
        else
        	throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ac7b726d-cec1-49e0-b372-a8ed6841eb51")
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
    @objid ("97068b11-7f68-4213-9dfd-455cbd79a9f5")
    public String getArtifactRef() {
        return this.elt.getTagValue(TDeploymentArtifact.MdaTypes.ARTIFACTREF_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7165e253-0570-43d2-80ee-e8cf96c7d3a5")
    public String getArtifactType() {
        return this.elt.getTagValue(TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1d7548c7-de0b-40fa-9364-2d5e37ef93fa")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("25fc67dc-4814-4899-b692-8f187a67c6b2")
    public String getName() {
        return this.elt.getTagValue(TDeploymentArtifact.MdaTypes.NAME_TAGTYPE_ELT);
    }

    @objid ("4de10000-37fb-4bb2-80a6-b6e2d194d288")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'artifactRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b6c65a90-064c-4c8c-9879-9393a0f1d262")
    public void setArtifactRef(final String value) {
        this.elt.putTagValue(TDeploymentArtifact.MdaTypes.ARTIFACTREF_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f3c94f96-3e9b-4f15-8d77-10a5de7cf8f8")
    public void setArtifactType(final String value) {
        this.elt.putTagValue(TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1bb19a48-751a-4cf5-8251-c1236addefe5")
    public void setName(final String value) {
        this.elt.putTagValue(TDeploymentArtifact.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    @objid ("f1741e6b-1de5-4428-a403-a4bae281168a")
    protected  TDeploymentArtifact(final Class elt) {
        this.elt = elt;
    }

    @objid ("c46501be-c548-4af5-b155-3fb6ef4c213a")
    public static final class MdaTypes {
        @objid ("3c069a9d-1a0a-4e3f-88b4-27c688ba5405")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8f95c15b-33f3-4b3c-8f8e-29d9cbfe75d2")
        public static TagType ARTIFACTREF_TAGTYPE_ELT;

        @objid ("2e9b901f-7f81-432d-a643-110c41c6cb55")
        public static TagType ARTIFACTTYPE_TAGTYPE_ELT;

        @objid ("f97f33ce-8147-4a1b-8a70-74cbda365e1e")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("9fbeee7b-8f04-44b0-aa7e-f1c47fe75f35")
        private static Stereotype MDAASSOCDEP;

        @objid ("e3765c98-6713-4d05-a5d9-8f6973a21892")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d7435f1b-7854-4ea8-9089-0e335ca641bb")
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

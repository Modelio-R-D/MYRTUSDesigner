/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
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
    @objid ("a665b269-00ed-4049-96a9-d14438e2a02e")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifact";

    @objid ("604cf401-ee6e-4d19-8e54-bd2540362cc5")
    public static final String ARTIFACTREF_TAGTYPE = "artifactRef";

    @objid ("4f90d257-d5f3-426b-84c7-ec86fc04a9a7")
    public static final String ARTIFACTTYPE_TAGTYPE = "artifactType";

    @objid ("3f65bc72-4cf9-44ba-8a5f-ddb56eef8411")
    public static final String NAME_TAGTYPE = "name";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("51e54c11-4177-4e3b-83ff-d970e8d220d9")
    protected final Class elt;

    /**
     * Tells whether a {@link TDeploymentArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e3cf47e4-fa3d-491b-9726-7b2352cd3f78")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifact >> then instantiate a {@link TDeploymentArtifact} proxy.
     * 
     * @return a {@link TDeploymentArtifact} proxy on the created {@link Class}.
     */
    @objid ("ffdd5e64-07b4-4460-a8de-59e88ce30cd9")
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
    @objid ("e37765fb-8a79-4234-961a-bfa42ef43a1b")
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
    @objid ("de098888-3556-4ea9-b2ba-5966dbdf186d")
    public static TDeploymentArtifact safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDeploymentArtifact.canInstantiate(obj))
        	return new TDeploymentArtifact(obj);
        else
        	throw new IllegalArgumentException("TDeploymentArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d52c838c-d2a3-409a-8e24-bb97d9984df0")
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
    @objid ("7af6810d-d968-4b4b-b5d0-55627d012b5e")
    public String getArtifactRef() {
        return this.elt.getTagValue(TDeploymentArtifact.MdaTypes.ARTIFACTREF_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b1532e68-3545-4083-b431-66cb49828942")
    public String getArtifactType() {
        return this.elt.getTagValue(TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("a650861a-ea0a-4f82-a3e2-306715c1126c")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("046945b9-f8e4-445e-b74b-ca3c8a23a78d")
    public String getName() {
        return this.elt.getTagValue(TDeploymentArtifact.MdaTypes.NAME_TAGTYPE_ELT);
    }

    @objid ("52a1f789-4b0b-42b7-b903-26a0a065274a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'artifactRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0e702e35-5502-42dd-af65-36cfa7113a66")
    public void setArtifactRef(final String value) {
        this.elt.putTagValue(TDeploymentArtifact.MdaTypes.ARTIFACTREF_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("61b0de24-dd20-4fe3-9468-94fd25451d2f")
    public void setArtifactType(final String value) {
        this.elt.putTagValue(TDeploymentArtifact.MdaTypes.ARTIFACTTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("780ea1e5-eaf6-4ca9-837a-99f85fdcc6ed")
    public void setName(final String value) {
        this.elt.putTagValue(TDeploymentArtifact.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    @objid ("efa94f86-da0a-4372-aa4d-d175a7e11883")
    protected  TDeploymentArtifact(final Class elt) {
        this.elt = elt;
    }

    @objid ("c46501be-c548-4af5-b155-3fb6ef4c213a")
    public static final class MdaTypes {
        @objid ("86549e61-1937-4f41-b120-cbaa4947b526")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("02cc9e3a-e326-452e-9535-b36e6ba01bfc")
        public static TagType ARTIFACTREF_TAGTYPE_ELT;

        @objid ("031ef7ab-31af-419b-9654-8bc5a1532763")
        public static TagType ARTIFACTTYPE_TAGTYPE_ELT;

        @objid ("c4a96726-96ef-49d5-a922-4ea1d7ced416")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("2e2c48f6-0ecb-45a8-90bc-fe3639ea2d16")
        private static Stereotype MDAASSOCDEP;

        @objid ("b3c3c79b-b4c0-41f8-be02-8005f342a374")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a9216efd-11cd-463a-a51c-ec43fc8a741e")
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

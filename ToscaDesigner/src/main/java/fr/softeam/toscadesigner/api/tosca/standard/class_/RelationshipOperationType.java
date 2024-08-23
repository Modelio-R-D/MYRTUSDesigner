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
 * Proxy class to handle a {@link Class} with << RelationshipOperationType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3b308ff4-23f4-4fbf-b62f-2c3b5964712d")
public class RelationshipOperationType implements IMdaProxy {
    @objid ("8e222278-2539-4770-bc09-bec00c03ab0a")
    public static final String STEREOTYPE_NAME = "RelationshipOperationType";

    @objid ("e3aaf0ae-33d5-45b0-8577-b686e84673c9")
    public static final String INTERFACENAME_TAGTYPE = "interfaceName";

    @objid ("6ee7f624-27b3-4b22-b6d9-a13f32d9b765")
    public static final String OPERATIONNAME_TAGTYPE = "operationName";

    @objid ("61973799-4b69-4cba-b570-a85013c60161")
    public static final String RELATIONSHIPREF_TAGTYPE = "relationshipRef";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("eb6e48a0-850c-4b6a-884a-7c37b71e5620")
    protected final Class elt;

    /**
     * Tells whether a {@link RelationshipOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RelationshipOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f827e93d-2e74-4389-927f-3545cc6d2601")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RelationshipOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RelationshipOperationType >> then instantiate a {@link RelationshipOperationType} proxy.
     * @return a {@link RelationshipOperationType} proxy on the created {@link Class}.
     */
    @objid ("ff44e8b5-f943-44d0-9cc9-10d444109cb3")
    public static RelationshipOperationType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT);
        return RelationshipOperationType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RelationshipOperationType} proxy from a {@link Class} stereotyped << RelationshipOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RelationshipOperationType} proxy or <i>null</i>.
     */
    @objid ("7a32019f-6b6e-47a9-8847-8e3f534bc87e")
    public static RelationshipOperationType instantiate(final Class obj) {
        return RelationshipOperationType.canInstantiate(obj) ? new RelationshipOperationType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RelationshipOperationType} proxy from a {@link Class} stereotyped << RelationshipOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RelationshipOperationType} proxy.
     */
    @objid ("7a86064b-1a9b-462f-b26b-9f113a2b2acc")
    public static RelationshipOperationType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RelationshipOperationType.canInstantiate(obj))
            return new RelationshipOperationType(obj);
        else
            throw new IllegalArgumentException("RelationshipOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2178f7cc-11f8-473d-90cf-d46aaf2911cb")
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
        RelationshipOperationType other = (RelationshipOperationType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("5eece3eb-bd70-4a4b-b692-d30619f24a50")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("83529d5a-2883-469d-9b3d-098558ab1cc9")
    public String getInterfaceName() {
        return this.elt.getTagValue(RelationshipOperationType.MdaTypes.INTERFACENAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("843b94a2-b3e5-4b98-b0cd-420a48374a9d")
    public String getOperationName() {
        return this.elt.getTagValue(RelationshipOperationType.MdaTypes.OPERATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'relationshipRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b2c7aefb-949f-4ed0-b733-74490cb26b06")
    public String getRelationshipRef() {
        return this.elt.getTagValue(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_TAGTYPE_ELT);
    }

    @objid ("aa7ead35-30f0-46f3-9b1f-7b3d06b97234")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("364c4125-6bca-4e62-b754-9ccdce3a6001")
    public void setInterfaceName(final String value) {
        this.elt.putTagValue(RelationshipOperationType.MdaTypes.INTERFACENAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1c542584-708e-462a-887d-5833fa742eb3")
    public void setOperationName(final String value) {
        this.elt.putTagValue(RelationshipOperationType.MdaTypes.OPERATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'relationshipRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a72e0a29-cc04-4e44-93c9-a4abfd9e070b")
    public void setRelationshipRef(final String value) {
        this.elt.putTagValue(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_TAGTYPE_ELT, value);
    }

    @objid ("ca248c1d-755c-4374-a2d8-641698e8c164")
    protected  RelationshipOperationType(final Class elt) {
        this.elt = elt;
    }

    @objid ("6dea73d0-799a-4b5b-80ec-d39300751770")
    public static final class MdaTypes {
        @objid ("fc406f5f-5631-405a-9561-f895a1d7cdee")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8220494f-cd28-46b4-8b4c-f7759b189e3e")
        public static TagType INTERFACENAME_TAGTYPE_ELT;

        @objid ("8025ce3d-bb76-4ed6-8268-e121323e11b0")
        public static TagType OPERATIONNAME_TAGTYPE_ELT;

        @objid ("854f86d6-f2ba-44cc-8b9e-4afbaf1a235c")
        public static TagType RELATIONSHIPREF_TAGTYPE_ELT;

        @objid ("855ea05e-0279-4981-92d3-44539bd3ffbd")
        private static Stereotype MDAASSOCDEP;

        @objid ("b39fb441-4576-4555-81ff-6ea8b5db3002")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4ab0ac5c-bb45-416e-91cd-4415a46b611f")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "283533e7-c53c-4104-a644-9d71d040726f", "RelationshipOperationType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "8d6c1c4c-5e1a-4857-8946-843232eea8fc", "interfaceName");
            INTERFACENAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (INTERFACENAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "eaa46eea-ea48-4149-8061-face0d75977f", "operationName");
            OPERATIONNAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (OPERATIONNAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "1a414145-2df0-4161-9346-e7c8330aa304", "relationshipRef");
            RELATIONSHIPREF_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (RELATIONSHIPREF_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

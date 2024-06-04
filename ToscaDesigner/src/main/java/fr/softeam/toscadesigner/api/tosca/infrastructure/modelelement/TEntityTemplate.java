/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TEntityTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3755a2fb-589d-4ca5-9376-f62f5356aa11")
public class TEntityTemplate extends TExtensibleElements implements IMdaProxy {
    @objid ("c20c499e-c55f-4cd6-ac04-bfb7b7dd1d6d")
    public static final String STEREOTYPE_NAME = "TEntityTemplate";

    @objid ("918d286d-623a-4b45-a0ec-9b67580d01ec")
    public static final String ID_TAGTYPE = "id";

    @objid ("3465f75d-75f1-4691-953f-2bc6f999e06a")
    public static final String PROPERTIES_TAGTYPE = "properties";

    @objid ("fbfd47b5-a28b-4ddb-a36b-c3bee5f16a5e")
    public static final String PROPERTYCONSTRAINTS_TAGTYPE = "propertyConstraints";

    @objid ("4f335839-e2b5-4bd3-bd27-c2c3c903ca38")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link TEntityTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TEntityTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a3f08921-db26-4b05-b4f4-865658123e7b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TEntityTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TEntityTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TEntityTemplate >> then instantiate a {@link TEntityTemplate} proxy.
     * 
     * @return a {@link TEntityTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("30f9a560-35da-4154-af8a-1053d4664777")
    public static TEntityTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TEntityTemplate.MdaTypes.STEREOTYPE_ELT);
        return TEntityTemplate.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TEntityTemplate} proxy from a {@link ModelElement} stereotyped << TEntityTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TEntityTemplate} proxy or <i>null</i>.
     */
    @objid ("8fc8a375-e413-4dcd-bbe9-a9367d83e18a")
    public static TEntityTemplate instantiate(final ModelElement obj) {
        return TEntityTemplate.canInstantiate(obj) ? new TEntityTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TEntityTemplate} proxy from a {@link ModelElement} stereotyped << TEntityTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TEntityTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9895fa18-9acf-4079-a58e-2a58118d4584")
    public static TEntityTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TEntityTemplate.canInstantiate(obj))
        	return new TEntityTemplate(obj);
        else
        	throw new IllegalArgumentException("TEntityTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("41db776d-1d27-45b3-9dc0-5b825d48a0ff")
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
        TEntityTemplate other = (TEntityTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("84f74b26-fd62-4744-a7e9-ed5b2b8f7cfd")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("80fb3749-2c8a-42be-b359-88bd3c602e22")
    public String getId() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a2ac6caf-97cd-4f48-8258-b29f7fc1a1d4")
    public String getProperties() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.PROPERTIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c53a6489-aa89-4aa5-a110-f67ff469f1ec")
    public String getPropertyConstraints() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("34062f8f-20e4-475e-a1f0-347059a538f2")
    public String getType() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @objid ("4b6e243f-6d41-45b8-a023-e1eb95a07e8a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("38d8cbfa-e795-4f58-a2b1-48a5d54f4ad8")
    public void setId(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ded988eb-ef9d-4cb3-a1c3-5d0a1d9f5e1c")
    public void setProperties(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.PROPERTIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("05dfc182-5fd8-4cf3-bb61-c5001770b3ba")
    public void setPropertyConstraints(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bdb74305-f3d5-4714-aa68-a1d3df352007")
    public void setType(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    @objid ("f95ebc0d-afec-405f-82b7-34910e4215de")
    protected  TEntityTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("db0f453b-312f-4dc2-a9b0-7bfbeba561bb")
    public static final class MdaTypes {
        @objid ("faa80a47-efc2-44d7-a047-dfb77c2fa031")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5595928a-0b84-447a-a835-9f6ffd3d8b55")
        public static TagType PROPERTIES_TAGTYPE_ELT;

        @objid ("8a9a05a0-8fd1-471d-9c28-df7d4a779c2d")
        public static TagType PROPERTYCONSTRAINTS_TAGTYPE_ELT;

        @objid ("7e66fd97-84f0-457b-9f74-a0a055c597eb")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("21fcc3ab-50f4-4d3a-b046-129ea3723397")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("8ba18287-ab10-4484-a4b9-d1535efb998e")
        private static Stereotype MDAASSOCDEP;

        @objid ("8867edd2-2f8f-4fbd-8893-e30fb5ace3a9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c4db67a3-4c1a-4941-863c-1b754cba1123")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "a32cca04-f738-421e-b834-b0f13524e19e", "TEntityTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "b146297a-aa0d-4c18-a0f4-c78f69c831cf", "properties");
            PROPERTIES_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (PROPERTIES_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "0e4aba23-900f-400f-aaa3-69b0697bf3d3", "propertyConstraints");
            PROPERTYCONSTRAINTS_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (PROPERTYCONSTRAINTS_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "53c84677-952b-4292-8a45-78a646366049", "id");
            ID_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (ID_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "be9e4c48-d3a9-452a-96ec-f5efdf1d105b", "type");
            TYPE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (TYPE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

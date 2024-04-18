/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
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
@objid ("ab2f9feb-3031-4cf3-a78b-63c1bbe9c53c")
public class TEntityTemplate extends TExtensibleElements implements IMdaProxy {
    @objid ("cb8f2e69-f110-4ca2-8ee5-18bbaaa6209d")
    public static final String STEREOTYPE_NAME = "TEntityTemplate";

    @objid ("4d4a16e1-8b56-49bb-b6b3-d02d247b1656")
    public static final String ID_TAGTYPE = "id";

    @objid ("de72c0f0-8f01-40c5-90f8-c26d2841d46f")
    public static final String PROPERTIES_TAGTYPE = "properties";

    @objid ("53d5e9bf-232d-4b30-b6d9-8cbe56724d60")
    public static final String PROPERTYCONSTRAINTS_TAGTYPE = "propertyConstraints";

    @objid ("6a3e7400-71f3-4837-8c00-b9990b8b3e9e")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link TEntityTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TEntityTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d10ef927-6078-42fb-98db-8bff9437d140")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TEntityTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TEntityTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TEntityTemplate >> then instantiate a {@link TEntityTemplate} proxy.
     * @return a {@link TEntityTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("e1126217-2048-4d5c-bdfe-b0cf913b1608")
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
    @objid ("0ee8e8e4-a8e9-4dde-b3ab-0cb0efa54ff2")
    public static TEntityTemplate instantiate(final ModelElement obj) {
        return TEntityTemplate.canInstantiate(obj) ? new TEntityTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TEntityTemplate} proxy from a {@link ModelElement} stereotyped << TEntityTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TEntityTemplate} proxy.
     */
    @objid ("8026bea2-2c0c-4045-bf67-7b9a805cc968")
    public static TEntityTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TEntityTemplate.canInstantiate(obj))
            return new TEntityTemplate(obj);
        else
            throw new IllegalArgumentException("TEntityTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("cc35738d-f1b4-47e1-baf2-dbf5ff7c724a")
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
    @objid ("fa8598bd-cfad-471e-bef9-8ab8a35514ae")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4a4d077d-4f8c-4385-9297-bcc13722d4ab")
    public String getId() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0278c8c7-7f63-4c36-918a-b93f3a92c9db")
    public String getProperties() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.PROPERTIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("39085efe-77bc-4811-a61a-76723291b268")
    public String getPropertyConstraints() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8154f6ac-5f54-4928-8e38-21dfd23eb378")
    public String getType() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @objid ("ec7935dc-44fd-4f0a-b597-e7e51439965f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0ef6067b-44f8-418f-9af0-33633b231c3c")
    public void setId(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a431b614-5af9-4428-b4ca-9c536baf3969")
    public void setProperties(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.PROPERTIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a03e4fea-fbd0-41df-b6e1-a974db8704a7")
    public void setPropertyConstraints(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bff89d94-5580-4f07-bd75-dc3f2309f18e")
    public void setType(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    @objid ("1bbb25b7-beac-4564-ab72-a0f01faed3d1")
    protected  TEntityTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("194254ba-64c5-466b-b849-b70a5759b433")
    public static final class MdaTypes {
        @objid ("eaa5a045-d8b1-4ac7-acf5-f1b87442d453")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("345b843f-0dd8-444e-9046-4a8af4094109")
        public static TagType PROPERTIES_TAGTYPE_ELT;

        @objid ("bcbb2766-d83f-4763-a095-2ddc066a7cb3")
        public static TagType PROPERTYCONSTRAINTS_TAGTYPE_ELT;

        @objid ("b2c4befe-c204-403d-a793-aea4de6d07c4")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("fc499ac8-f398-4845-bbdf-7f4b2425452b")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("e020687b-6893-4cb1-93a1-e4227a8b5c32")
        private static Stereotype MDAASSOCDEP;

        @objid ("e30e32c1-9407-42df-99fd-69026ee468fd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3fc73b78-6428-439f-bce9-64183e00bc58")
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

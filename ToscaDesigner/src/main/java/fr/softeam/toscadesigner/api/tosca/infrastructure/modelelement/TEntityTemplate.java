/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 15:45 by Modelio Studio.
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
    @objid ("815b57da-f47a-4367-9343-ba8aa67fd300")
    public static final String STEREOTYPE_NAME = "TEntityTemplate";

    @objid ("70f04c91-1de7-420f-8694-45a702fd7118")
    public static final String ID_TAGTYPE = "id";

    @objid ("fbb562bf-0008-41e9-aa0d-5fea124fcc44")
    public static final String PROPERTIES_TAGTYPE = "properties";

    @objid ("10d4aa64-8c00-423a-b38a-e6b485274511")
    public static final String PROPERTYCONSTRAINTS_TAGTYPE = "propertyConstraints";

    @objid ("376083f1-2d23-40fa-ab84-fd254c981dcb")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link TEntityTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TEntityTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("383f7bd8-9cf6-4c35-ac3a-3cebfc874552")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TEntityTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TEntityTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TEntityTemplate >> then instantiate a {@link TEntityTemplate} proxy.
     * 
     * @return a {@link TEntityTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("bdacefdd-d28e-4aa0-a7c7-9dbd053ed16e")
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
    @objid ("6884c946-4865-4ada-89a9-4f4c81d673c7")
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
    @objid ("4d5c14f8-c9bf-4603-9b15-cc10d23dc80d")
    public static TEntityTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TEntityTemplate.canInstantiate(obj))
        	return new TEntityTemplate(obj);
        else
        	throw new IllegalArgumentException("TEntityTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("20e6545a-e07e-4f0c-9cca-4fec068ba506")
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
    @objid ("896e703c-f548-41bd-99e7-913236fded76")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f65dfc5c-93c8-4a84-9435-85cb638a33eb")
    public String getId() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("42a677c9-4f9a-403c-9994-b24a2b5502ff")
    public String getProperties() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.PROPERTIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c8f6fdb3-2727-41b9-a6f0-940901b32d63")
    public String getPropertyConstraints() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3636e01e-970f-42ff-a3d6-223e6aa2232c")
    public String getType() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @objid ("839e12ad-eb8e-46f9-abb8-1ef4c3e1eee6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("140c1563-91b8-418e-8d99-1f2e49e239b9")
    public void setId(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b7eff3e5-15f9-4afd-9412-87bff0b165a2")
    public void setProperties(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.PROPERTIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("862cf8d3-70f3-4dac-9040-f78c758c2246")
    public void setPropertyConstraints(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f929cad9-35ba-4890-b018-055cef86e5ca")
    public void setType(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    @objid ("a1b00893-5481-4146-a4eb-16afa2c36a04")
    protected  TEntityTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("db0f453b-312f-4dc2-a9b0-7bfbeba561bb")
    public static final class MdaTypes {
        @objid ("ced3bb93-9b5f-445c-b0fc-840481e63f2e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7b519338-0e1d-4dfe-8096-44b9b03bfd2d")
        public static TagType PROPERTIES_TAGTYPE_ELT;

        @objid ("9a849d17-a932-4876-84a6-f85cb3d06745")
        public static TagType PROPERTYCONSTRAINTS_TAGTYPE_ELT;

        @objid ("c8e8fac3-afdc-4259-975a-482d71aac83d")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("b5d70b28-3c25-44ec-bc5f-42bf2c91c140")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("bf43aead-e928-4978-939f-3fbd35b47ca1")
        private static Stereotype MDAASSOCDEP;

        @objid ("491ff9d2-a52d-4ce2-8cbf-5ca282da8fcf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e7fa7b4a-7f73-41fd-ba34-15290abb3628")
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

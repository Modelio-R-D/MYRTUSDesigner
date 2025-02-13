/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 06/02/2025 17:32 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << PropertiesType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9caffca7-e226-49e1-bcab-1c41a4529994")
public class PropertiesType1 implements IMdaProxy {
    @objid ("ea5e4542-4965-4d68-b5a8-6b1bca742502")
    public static final String STEREOTYPE_NAME = "PropertiesType1";

    @objid ("9409c354-6292-49c1-87de-209d4bcdc36c")
    public static final String ANY_PROPERTY = "any";

    @objid ("cb2449d2-9c97-415d-8070-16c4b7e7d8a1")
    public static final String PROPERTYMAPPINGS_PROPERTY = "propertyMappings";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("2b8bfbf4-dce9-4b0b-9e7f-7e4356c328a5")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertiesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertiesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("46679949-cc80-4e6d-b794-02c47257410e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertiesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertiesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertiesType1 >> then instantiate a {@link PropertiesType1} proxy.
     * @return a {@link PropertiesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("f6d98566-6847-4c8d-ae01-f42d6b59994d")
    public static PropertiesType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(PropertiesType1.MdaTypes.STEREOTYPE_ELT);
        return PropertiesType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PropertiesType1} proxy from a {@link ModelElement} stereotyped << PropertiesType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PropertiesType1} proxy or <i>null</i>.
     */
    @objid ("07f020c6-7e96-4f7c-b9b0-afd7a5ac3f02")
    public static PropertiesType1 instantiate(final ModelElement obj) {
        return PropertiesType1.canInstantiate(obj) ? new PropertiesType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertiesType1} proxy from a {@link ModelElement} stereotyped << PropertiesType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PropertiesType1} proxy.
     */
    @objid ("79d9cd80-ae93-4ec0-9f2b-4416f0671f1a")
    public static PropertiesType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertiesType1.canInstantiate(obj))
            return new PropertiesType1(obj);
        else
            throw new IllegalArgumentException("PropertiesType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1529cb7f-0cec-4007-ab8b-a8405cbd22ff")
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
        PropertiesType1 other = (PropertiesType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'PropertiesType1.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("acb2bd6c-9da7-4287-9a70-53b310729075")
    public String getAny() {
        String value = this.elt.getProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesType1.MdaTypes.ANY_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesType1.MdaTypes.ANY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesType1.MdaTypes.ANY_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("4b74c9c2-7584-458f-895a-945694ccbb22")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertiesType1.propertyMappings'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("feaec56b-5eb2-4c88-b0b0-ce5d482a14c4")
    public String getPropertyMappings() {
        String value = this.elt.getProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT, value, this.elt);
    }

    @objid ("1e902b60-0b95-41b0-8f41-cf82320e1471")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'PropertiesType1.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fcad6158-8803-4e01-b961-14935886346d")
    public void setAny(final String value) {
        this.elt.setProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                             PropertiesType1.MdaTypes.ANY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesType1.MdaTypes.ANY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'PropertiesType1.propertyMappings'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("25bf95e6-2387-4b48-9dc5-d6c2761190cc")
    public void setPropertyMappings(final String value) {
        this.elt.setProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                             PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT, value));
    }

    @objid ("efcdf55b-052c-404a-ba74-e3ea89410d61")
    protected  PropertiesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("dbed800a-28da-42fc-ac16-d9fe26c33c6d")
    public static final class MdaTypes {
        @objid ("682f7331-45e6-4d39-83ad-d071e144481f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("32704e6d-4449-46c0-9b2f-46c1b6ae1f9c")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("1502f2bc-add5-49be-b0d1-343e2ad0f99d")
        public static PropertyDefinition PROPERTYMAPPINGS_PROPERTY_ELT;

        @objid ("cdc5332b-e705-4e78-aa3e-45de4917ef6c")
        private static Stereotype MDAASSOCDEP;

        @objid ("00ae44c2-d410-4626-a86b-1fe7ede8c454")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("96576c8a-29d0-4b1d-a242-10354816d46a")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "97773619-3e40-4898-b40d-522ae97cb4a1", "PropertiesType1");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "3638b880-c86d-4f45-97fb-a6406278a98f", "any");
            ANY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ANY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "6877b063-d9da-4d8c-aec0-fa07990b2ba6", "propertyMappings");
            PROPERTYMAPPINGS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTYMAPPINGS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

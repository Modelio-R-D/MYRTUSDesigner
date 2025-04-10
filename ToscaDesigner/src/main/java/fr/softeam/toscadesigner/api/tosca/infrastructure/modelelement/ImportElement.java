/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:09 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << ImportElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4f0e539a-823f-466d-8bd4-376ca944be83")
public class ImportElement implements IMdaProxy {
    @objid ("6205bdb4-c0c1-446a-8d2d-fb0ca2695843")
    public static final String STEREOTYPE_NAME = "ImportElement";

    @objid ("ff2c4469-966f-486f-90f8-59a365777962")
    public static final String FILE_PROPERTY = "File";

    @objid ("1eb3bbaa-fdbe-4894-84ef-611d6d3c98dd")
    public static final String NAMESPACE_PREFIX_PROPERTY = "Namespace_prefix";

    @objid ("32fc8de9-9834-4fd8-ab4b-134a6bb0c761")
    public static final String NAMESPACE_URI_PROPERTY = "Namespace_uri";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("121fc127-4890-44bb-9846-8d8194950bce")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ImportElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ImportElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a8edc557-0b31-4175-82ca-ab0f2581bbb0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ImportElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ImportElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ImportElement >> then instantiate a {@link ImportElement} proxy.
     * 
     * @return a {@link ImportElement} proxy on the created {@link ModelElement}.
     */
    @objid ("fc72f7ae-25e8-4bb2-98e2-15adf75ad7d9")
    public static ImportElement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(ImportElement.MdaTypes.STEREOTYPE_ELT);
        return ImportElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ImportElement} proxy from a {@link ModelElement} stereotyped << ImportElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ImportElement} proxy or <i>null</i>.
     */
    @objid ("9a2fe5ec-169a-4b28-bd54-cb5135f49006")
    public static ImportElement instantiate(final ModelElement obj) {
        return ImportElement.canInstantiate(obj) ? new ImportElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ImportElement} proxy from a {@link ModelElement} stereotyped << ImportElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ImportElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c2a3e408-7694-4b81-9ea0-40338a55da6d")
    public static ImportElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ImportElement.canInstantiate(obj))
        	return new ImportElement(obj);
        else
        	throw new IllegalArgumentException("ImportElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e174bfa5-ece8-4de8-8975-cc3720704e8c")
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
        ImportElement other = (ImportElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("f661c666-ff58-4b33-97cc-3770f910e18b")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'ImportElement.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("677b5292-3f5f-4549-8b75-d3da61f3dbee")
    public String getFile() {
        String value = this.elt.getProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                                            ImportElement.MdaTypes.FILE_PROPERTY_ELT.getName());
        if (value == null) {
          value = ImportElement.MdaTypes.FILE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(ImportElement.MdaTypes.FILE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'ImportElement.Namespace_prefix'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("efe620e0-eb8b-4a6f-92b5-0ee3ec120e48")
    public String getNamespace_prefix() {
        String value = this.elt.getProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                                            ImportElement.MdaTypes.NAMESPACE_PREFIX_PROPERTY_ELT.getName());
        if (value == null) {
          value = ImportElement.MdaTypes.NAMESPACE_PREFIX_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(ImportElement.MdaTypes.NAMESPACE_PREFIX_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'ImportElement.Namespace_uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f2e5b974-35f2-458f-a7c0-2515059d73d7")
    public String getNamespace_uri() {
        String value = this.elt.getProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                                            ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getName());
        if (value == null) {
          value = ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("5ff2d3fc-4044-463e-80da-e77eef45e724")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'ImportElement.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("900c7335-a16c-494d-b054-24eff81f4618")
    public void setFile(final String value) {
        this.elt.setProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                             ImportElement.MdaTypes.FILE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(ImportElement.MdaTypes.FILE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'ImportElement.Namespace_prefix'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c44aeac7-a18d-4a7f-b2cb-e24d476712a1")
    public void setNamespace_prefix(final String value) {
        this.elt.setProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                             ImportElement.MdaTypes.NAMESPACE_PREFIX_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(ImportElement.MdaTypes.NAMESPACE_PREFIX_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'ImportElement.Namespace_uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("86eb576f-0005-417e-8492-02c72ede8a80")
    public void setNamespace_uri(final String value) {
        this.elt.setProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                             ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT, value));
    }

    @objid ("ef0ed62f-93bc-4275-990d-895b7c435d8e")
    protected  ImportElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("8ab6dcc9-96d8-4970-85e8-9b33606fe19b")
    public static final class MdaTypes {
        @objid ("f01d9bcf-03af-42c6-8ea7-8e86791e6893")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b7642587-3a1b-48d2-be8a-4d42aa285b1d")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("ae356a03-dd2d-401d-b4de-cc56903d4530")
        public static PropertyDefinition NAMESPACE_URI_PROPERTY_ELT;

        @objid ("ee2363fb-5d98-49f3-8cee-30edc660e4ae")
        public static PropertyDefinition NAMESPACE_PREFIX_PROPERTY_ELT;

        @objid ("71229457-b0dd-4738-b561-69d927cb3f49")
        private static Stereotype MDAASSOCDEP;

        @objid ("550c5847-7745-4c2e-921a-eabb826bb17a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("81d349da-961b-414f-afab-7f4a683a6d53")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "938d9c3a-7446-4262-985d-cd583a7613b4", "ImportElement");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "f86ceca7-f290-4766-a466-bb5376c467be", "File");
            FILE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (FILE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "06798cf4-b3fd-4b9b-a4c6-365d9cfa61e2", "Namespace_uri");
            NAMESPACE_URI_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAMESPACE_URI_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "cc202e0d-0456-4ae5-b365-6aeaf7aa2bea", "Namespace_prefix");
            NAMESPACE_PREFIX_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAMESPACE_PREFIX_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

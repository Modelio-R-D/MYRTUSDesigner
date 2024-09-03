/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 17:56 by Modelio Studio.
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
@objid ("67af08d8-ac15-4654-b326-9a8303d77ecd")
public class ImportElement implements IMdaProxy {
    @objid ("e7e18b7e-ae71-4b35-8ae3-74ff50fa22f5")
    public static final String STEREOTYPE_NAME = "ImportElement";

    @objid ("8f1d7148-7947-4467-93b1-78e70105de32")
    public static final String FILE_PROPERTY = "File";

    @objid ("64b839fe-4ed7-469e-84ed-69aaf57e4c2d")
    public static final String NAMESPACE_PREFIX_PROPERTY = "Namespace_prefix";

    @objid ("f9b81692-7149-4d84-8d7b-795ccdbd0e70")
    public static final String NAMESPACE_URI_PROPERTY = "Namespace_uri";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("7cec57b0-ef17-418d-87e3-54d46c91fa44")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ImportElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ImportElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c07b2191-dcd8-4e97-af40-94b72ed7c2ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ImportElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ImportElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ImportElement >> then instantiate a {@link ImportElement} proxy.
     * 
     * @return a {@link ImportElement} proxy on the created {@link ModelElement}.
     */
    @objid ("ba174b13-19ea-4d26-ab4f-b292c2c40364")
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
    @objid ("407aa4e6-0c55-452b-a6bc-24fa35cc2213")
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
    @objid ("dd80b5a8-3573-4905-b8fd-7f65db6ef7e9")
    public static ImportElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ImportElement.canInstantiate(obj))
        	return new ImportElement(obj);
        else
        	throw new IllegalArgumentException("ImportElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f7bad4a0-cee6-4f88-8b26-50e6c472fc2d")
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
    @objid ("4a7313cb-51d7-4779-9d92-132ea9d3b960")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'ImportElement.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f4aa4d91-6ba8-47a5-92b3-950b312b7b12")
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
    @objid ("e4986a3a-cb45-45ff-86fb-d52b5bd79d7f")
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
    @objid ("c8921514-9690-4ac4-a468-a50b1ad49e78")
    public String getNamespace_uri() {
        String value = this.elt.getProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                                            ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getName());
        if (value == null) {
          value = ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("ba163d4f-a7c8-4b58-9e99-4c5ab4d21966")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'ImportElement.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("efe1c3f5-54c2-40d7-a397-bd3e59b14604")
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
    @objid ("196afb7e-d11c-4d3f-970a-b2f7f561e16a")
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
    @objid ("b5239ebb-6a50-4ae9-8e2b-d3c681ea979f")
    public void setNamespace_uri(final String value) {
        this.elt.setProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                             ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT, value));
    }

    @objid ("d4ee2f68-32b0-4678-a2b6-eb08af50d7dc")
    protected  ImportElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("37306504-fc75-4f17-8faa-593e13f0b96d")
    public static final class MdaTypes {
        @objid ("883614ba-d9eb-4db7-a81e-cee9b3fc8b1c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2a012ee7-569a-4b26-a593-5b1e0f4667e4")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("54449f31-e9de-4798-bb6e-84b84a81fc1b")
        public static PropertyDefinition NAMESPACE_URI_PROPERTY_ELT;

        @objid ("9a4816c6-e91b-4c7b-9ef7-c86eac499bd0")
        public static PropertyDefinition NAMESPACE_PREFIX_PROPERTY_ELT;

        @objid ("82ed3da5-4171-4bae-a5b4-9c4a8f4c62f3")
        private static Stereotype MDAASSOCDEP;

        @objid ("8bf4a8b5-d12d-43e7-91aa-9c9f1813eafd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("93c012f5-fb2c-4137-9bb8-fb03f432f59a")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 13:03 by Modelio Studio.
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
@objid ("063c0e1a-45bf-44f9-aad6-3e60ef4f5efc")
public class ImportElement implements IMdaProxy {
    @objid ("4d25ab62-0fe2-45f2-b23a-88746f7bbe1c")
    public static final String STEREOTYPE_NAME = "ImportElement";

    @objid ("b82d1dd5-8db6-41ea-ac20-6cb0e14def91")
    public static final String FILE_PROPERTY = "File";

    @objid ("5438e273-9eeb-4e1d-937c-da46d716a06b")
    public static final String NAMESPACE_PREFIX_PROPERTY = "Namespace_prefix";

    @objid ("e3a73658-8f1c-4255-b8d0-bc1cecedda00")
    public static final String NAMESPACE_URI_PROPERTY = "Namespace_uri";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("06237183-bdef-4bca-a5d7-0e9db9829b8c")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ImportElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ImportElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6e10030f-8130-4c53-a14e-334f1749e862")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ImportElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ImportElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ImportElement >> then instantiate a {@link ImportElement} proxy.
     * @return a {@link ImportElement} proxy on the created {@link ModelElement}.
     */
    @objid ("de9e5ce6-d711-41e8-96c1-aecb611b62f7")
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
    @objid ("46582da3-9c71-4928-9f90-826d34cd5483")
    public static ImportElement instantiate(final ModelElement obj) {
        return ImportElement.canInstantiate(obj) ? new ImportElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ImportElement} proxy from a {@link ModelElement} stereotyped << ImportElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ImportElement} proxy.
     */
    @objid ("92fc7c20-476d-464a-adb7-978b45b5c11e")
    public static ImportElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ImportElement.canInstantiate(obj))
            return new ImportElement(obj);
        else
            throw new IllegalArgumentException("ImportElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d4498ae5-535b-43b5-b685-485e36501579")
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
    @objid ("27048742-6000-4604-afd7-dd1b3a554cae")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'ImportElement.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("940a32e0-073b-4c50-9d86-068011bd62c6")
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
    @objid ("228346bd-26a9-4897-b957-b65b7e171369")
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
    @objid ("1eecd82f-687d-4a54-88c3-3d95510d23dc")
    public String getNamespace_uri() {
        String value = this.elt.getProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                                            ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getName());
        if (value == null) {
          value = ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT, value, this.elt);
    }

    @objid ("9afc1164-7d1b-429d-b113-60d4a44269ec")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'ImportElement.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4c773413-81ec-4535-9a23-b0261af2e364")
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
    @objid ("7a480528-2c74-4aba-84cf-d516325adb72")
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
    @objid ("169da0ce-80de-4e50-83f3-b4bbaebb644e")
    public void setNamespace_uri(final String value) {
        this.elt.setProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                             ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT, value));
    }

    @objid ("70e516bf-837d-43cf-aa86-aa56dd400f93")
    protected  ImportElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("6d787fc4-0d8a-4d24-a606-8ebbf10d004b")
    public static final class MdaTypes {
        @objid ("ebd0b79c-1a87-421b-a85f-6225e332319c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9e4b3fbe-d58b-4e6a-9a98-e75faaaaceed")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("6a68672d-e9c1-47f2-ac97-e554c9da27c2")
        public static PropertyDefinition NAMESPACE_URI_PROPERTY_ELT;

        @objid ("5b324614-1fc3-4709-8317-586bf794b01d")
        public static PropertyDefinition NAMESPACE_PREFIX_PROPERTY_ELT;

        @objid ("33115831-08ae-41d1-b68a-35f28b50823c")
        private static Stereotype MDAASSOCDEP;

        @objid ("d7ba7b9b-1e61-48ce-bf41-932c536056ba")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("593476b9-29fb-422e-86db-3c164721507a")
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

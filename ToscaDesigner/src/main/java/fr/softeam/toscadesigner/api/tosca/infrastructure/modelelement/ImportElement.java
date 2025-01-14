/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 15:42 by Modelio Studio.
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
    @objid ("6ce572ea-3c35-4efe-8309-5a0642e30ef0")
    public static final String STEREOTYPE_NAME = "ImportElement";

    @objid ("907f23cd-b6e9-4925-8456-6f30edda02af")
    public static final String FILE_PROPERTY = "File";

    @objid ("89309886-1bd6-45e7-ab1b-695314b12996")
    public static final String NAMESPACE_PREFIX_PROPERTY = "Namespace_prefix";

    @objid ("55b79171-122d-4140-b3d4-cfd6acf49f4a")
    public static final String NAMESPACE_URI_PROPERTY = "Namespace_uri";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("4784ac69-86d5-439c-ad21-99cdd017ed9d")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ImportElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ImportElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7fd50e1f-aaba-4116-9e9a-dee0669cd1f6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ImportElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ImportElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ImportElement >> then instantiate a {@link ImportElement} proxy.
     * 
     * @return a {@link ImportElement} proxy on the created {@link ModelElement}.
     */
    @objid ("3936df7a-0b68-4d14-ba8e-fefaee67ae26")
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
    @objid ("50e99958-e84e-4a68-a668-35a011c95231")
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
    @objid ("f13266cf-193d-4c3d-b51e-a1fa885bc617")
    public static ImportElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ImportElement.canInstantiate(obj))
        	return new ImportElement(obj);
        else
        	throw new IllegalArgumentException("ImportElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0c92ea1e-6e90-4c4a-8707-ebb62a73ca1f")
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
    @objid ("05b897c7-2ae5-4514-a979-fcf358dfca13")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'ImportElement.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("66eb803a-64fc-44bd-b614-abda04be9805")
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
    @objid ("61d9727f-9ae1-41e5-865c-7058e2475ba1")
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
    @objid ("14942cec-a017-4442-8721-869113f3c484")
    public String getNamespace_uri() {
        String value = this.elt.getProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                                            ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getName());
        if (value == null) {
          value = ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("bf3a0cd9-9774-4a10-a530-093a0de99d58")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'ImportElement.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eb3c73a8-1a57-40a5-a7d7-7b8070329310")
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
    @objid ("382b0aa1-5d11-4196-a864-209efee0035e")
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
    @objid ("9b9d10cd-1c43-4b72-9599-fd5bca4527da")
    public void setNamespace_uri(final String value) {
        this.elt.setProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                             ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT, value));
    }

    @objid ("d3880dc5-a72c-4357-ac83-c76934818b6d")
    protected  ImportElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("6d787fc4-0d8a-4d24-a606-8ebbf10d004b")
    public static final class MdaTypes {
        @objid ("18f276ec-1fe6-4804-a6a9-e7a3897e7fe7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4be19d86-2de9-4f43-97b6-d4a5aca57196")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("f753dbaf-2646-45af-be03-040485b89b69")
        public static PropertyDefinition NAMESPACE_URI_PROPERTY_ELT;

        @objid ("860dbcb7-d7b2-43a0-b402-1a7e43f33ae6")
        public static PropertyDefinition NAMESPACE_PREFIX_PROPERTY_ELT;

        @objid ("f85384eb-fb8b-405c-8a58-c5e72c7c168d")
        private static Stereotype MDAASSOCDEP;

        @objid ("89e1261d-70d3-4da2-84b2-e5d3660d960b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a158abcf-4c1c-4716-8a1a-f21bba831047")
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

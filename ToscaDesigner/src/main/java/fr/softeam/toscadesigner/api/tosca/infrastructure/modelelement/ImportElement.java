/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 12:14 by Modelio Studio.
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
    @objid ("6f25ad9e-8769-45db-9979-6a6dcadc825a")
    public static final String STEREOTYPE_NAME = "ImportElement";

    @objid ("53f675de-66de-40a5-bc05-1cd65bb0a5ae")
    public static final String FILE_PROPERTY = "File";

    @objid ("3e6ead0d-ed59-47a9-9468-622d5c1ac94e")
    public static final String NAMESPACE_PREFIX_PROPERTY = "Namespace_prefix";

    @objid ("22b92e8e-46c2-49ca-a99e-ad8806ac49b3")
    public static final String NAMESPACE_URI_PROPERTY = "Namespace_uri";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("d88d71f7-2142-4099-91eb-491abcf17543")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ImportElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ImportElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5ba0ce79-ded7-4133-9eb2-a06dd6f07ecb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ImportElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ImportElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ImportElement >> then instantiate a {@link ImportElement} proxy.
     * 
     * @return a {@link ImportElement} proxy on the created {@link ModelElement}.
     */
    @objid ("f9fb143b-5cd4-4983-adeb-c0c4228661d9")
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
    @objid ("714fc6ed-6439-4e59-a21a-0f5b7a70b0d1")
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
    @objid ("d9acf4bf-3d29-40b6-b129-6741531f7091")
    public static ImportElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ImportElement.canInstantiate(obj))
        	return new ImportElement(obj);
        else
        	throw new IllegalArgumentException("ImportElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("89724e15-21be-489b-8965-23a1af29a5c6")
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
    @objid ("2286fe31-6df3-4a2a-9167-00d9cdfab5c8")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'ImportElement.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("71f6138a-7360-490c-af21-9e234c92d1cc")
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
    @objid ("09cba0c9-f949-490e-b059-a1cc4d076734")
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
    @objid ("393e912f-7617-4cff-bd19-eac8fea37ae5")
    public String getNamespace_uri() {
        String value = this.elt.getProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                                            ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getName());
        if (value == null) {
          value = ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("f65d7b34-107f-43d5-8ad1-489a9dda9feb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'ImportElement.File'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9845746d-b4ea-48e3-adf8-a8c2c3eb61c9")
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
    @objid ("9fa56edb-5990-41b6-80c3-c10dde73710a")
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
    @objid ("5470eda9-7080-48ad-84c1-d20c50c73a53")
    public void setNamespace_uri(final String value) {
        this.elt.setProperty(ImportElement.MdaTypes.STEREOTYPE_ELT,
                             ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(ImportElement.MdaTypes.NAMESPACE_URI_PROPERTY_ELT, value));
    }

    @objid ("c9dad492-f850-4a7d-9e52-d7a8c4956189")
    protected  ImportElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("6d787fc4-0d8a-4d24-a606-8ebbf10d004b")
    public static final class MdaTypes {
        @objid ("1bf87703-96e4-4c6e-9ad4-af775d6072bd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0e531d60-3135-47c2-821f-850de3825577")
        public static PropertyDefinition FILE_PROPERTY_ELT;

        @objid ("66ba21ef-a1c2-44be-9e38-8a764d3e5812")
        public static PropertyDefinition NAMESPACE_URI_PROPERTY_ELT;

        @objid ("dda9d56e-9dcc-4d89-929b-4507983deb42")
        public static PropertyDefinition NAMESPACE_PREFIX_PROPERTY_ELT;

        @objid ("8e51c78c-8bb7-4df9-9c82-0bfbe91ab60c")
        private static Stereotype MDAASSOCDEP;

        @objid ("359e30b8-0eae-4f43-892a-45dd1c1b3ceb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("de9b6872-7488-4aa3-b9f5-c667998ccbab")
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

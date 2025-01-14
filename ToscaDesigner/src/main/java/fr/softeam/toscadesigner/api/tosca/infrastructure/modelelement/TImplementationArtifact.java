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
 * Proxy class to handle a {@link ModelElement} with << TImplementationArtifact >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("85c99a8f-82cf-4f46-913e-fd560ca5db9e")
public class TImplementationArtifact extends TExtensibleElements implements IMdaProxy {
    @objid ("968e0f98-af7b-427f-9c24-2e743479d136")
    public static final String STEREOTYPE_NAME = "TImplementationArtifact";

    @objid ("af1ab153-88f6-4174-8699-1f9481559584")
    public static final String ARTIFACTREF_PROPERTY = "artifactRef";

    @objid ("3e098ade-c656-4a62-a0df-4af6b0fd4d9f")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("2c9c48d3-8a8d-47df-9480-a5994a972930")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("7b240da7-6e82-46df-b99f-2c35cd6d8194")
    public static final String OPERATIONNAME_PROPERTY = "operationName";

    /**
     * Tells whether a {@link TImplementationArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TImplementationArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("abd2c522-3bef-4f12-80c2-e714c4b474c1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TImplementationArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TImplementationArtifact >> then instantiate a {@link TImplementationArtifact} proxy.
     * 
     * @return a {@link TImplementationArtifact} proxy on the created {@link ModelElement}.
     */
    @objid ("7c0d46e4-f4c9-4fda-a6ef-f91e8852aac5")
    public static TImplementationArtifact create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT);
        return TImplementationArtifact.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TImplementationArtifact} proxy from a {@link ModelElement} stereotyped << TImplementationArtifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TImplementationArtifact} proxy or <i>null</i>.
     */
    @objid ("91206203-4b08-4eab-bd4d-a3baaf406ac3")
    public static TImplementationArtifact instantiate(final ModelElement obj) {
        return TImplementationArtifact.canInstantiate(obj) ? new TImplementationArtifact(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TImplementationArtifact} proxy from a {@link ModelElement} stereotyped << TImplementationArtifact >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TImplementationArtifact} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c536dea6-4dcc-4ccc-8398-5f908b3e23e1")
    public static TImplementationArtifact safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TImplementationArtifact.canInstantiate(obj))
        	return new TImplementationArtifact(obj);
        else
        	throw new IllegalArgumentException("TImplementationArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ebecec34-0e2f-4b2f-a64d-63ea32909599")
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
        TImplementationArtifact other = (TImplementationArtifact) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TImplementationArtifact.artifactRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8ad871ed-6cc1-4284-8f4c-b58be8378eb2")
    public String getArtifactRef() {
        String value = this.elt.getProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TImplementationArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TImplementationArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TImplementationArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TImplementationArtifact.artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c7fbb7e2-aec3-4ef5-8ed8-5b6bb109a985")
    public String getArtifactType() {
        String value = this.elt.getProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TImplementationArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TImplementationArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TImplementationArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("4ba0fd20-0d64-42d4-b924-8bafe84d85ec")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TImplementationArtifact.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0f4eac21-0b59-4878-bf11-8f136e03b64e")
    public String getInterfaceName() {
        String value = this.elt.getProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TImplementationArtifact.MdaTypes.INTERFACENAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TImplementationArtifact.MdaTypes.INTERFACENAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TImplementationArtifact.MdaTypes.INTERFACENAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TImplementationArtifact.operationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("15314ca4-f936-4ad3-9bfe-4eba42b1edad")
    public String getOperationName() {
        String value = this.elt.getProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("84d7081d-45d4-416c-b622-f18cb40d9081")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TImplementationArtifact.artifactRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("17bf65bf-4358-4995-a620-cbb757faa505")
    public void setArtifactRef(final String value) {
        this.elt.setProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                             TImplementationArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TImplementationArtifact.MdaTypes.ARTIFACTREF_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TImplementationArtifact.artifactType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("597cd7f4-bdd3-465e-8a9a-de3785c8080f")
    public void setArtifactType(final String value) {
        this.elt.setProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                             TImplementationArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TImplementationArtifact.MdaTypes.ARTIFACTTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TImplementationArtifact.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("30c61ca8-38cc-4cfc-a6e5-140f60896d68")
    public void setInterfaceName(final String value) {
        this.elt.setProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                             TImplementationArtifact.MdaTypes.INTERFACENAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TImplementationArtifact.MdaTypes.INTERFACENAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TImplementationArtifact.operationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d8d74c42-aad0-4d57-9118-5748b3a83a28")
    public void setOperationName(final String value) {
        this.elt.setProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                             TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value));
    }

    @objid ("31085fec-1570-4e8c-90fc-b00f2026f099")
    protected  TImplementationArtifact(final ModelElement elt) {
        super(elt);
    }

    @objid ("74960c4c-b879-4456-b223-b81b00958093")
    public static final class MdaTypes {
        @objid ("e0f34a99-22e8-4511-8b1a-87ce7a2259d5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2eaea765-86e8-47bc-ba0a-556d36c2a7c3")
        public static PropertyDefinition ARTIFACTREF_PROPERTY_ELT;

        @objid ("1fca6998-333d-44bb-a809-b8782d6f1baa")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("8aa3bbaf-f6bf-40db-9887-b48017e26e38")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("a4ea5e71-0a29-4375-95fc-218b281cc75f")
        public static PropertyDefinition OPERATIONNAME_PROPERTY_ELT;

        @objid ("14f86f58-26c2-48ba-b517-d551df60ac41")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ca5cc43-19ae-48b6-95fd-69a41a5b5b52")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("45546df9-8a88-4b6f-9708-b85eb8284d80")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "0b27c72d-e3eb-4877-a3ab-c3c962ec28b1", "TImplementationArtifact");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "80275868-01ce-4087-afbd-6ee041c6bcb3", "artifactRef");
            ARTIFACTREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ARTIFACTREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a61c4a34-f857-40b8-8137-fe331488b041", "artifactType");
            ARTIFACTTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ARTIFACTTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "561ed1fb-76d2-46a8-9cab-c63877e4663c", "interfaceName");
            INTERFACENAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INTERFACENAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "9db3f361-b0b2-410a-97f7-2ae159b0d710", "operationName");
            OPERATIONNAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (OPERATIONNAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

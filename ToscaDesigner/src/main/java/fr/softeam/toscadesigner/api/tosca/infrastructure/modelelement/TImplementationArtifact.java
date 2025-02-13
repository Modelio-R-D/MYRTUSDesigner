/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 13/02/2025 17:54 by Modelio Studio.
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
@objid ("1a25f9eb-54fd-42d1-a02d-43cba8649590")
public class TImplementationArtifact extends TExtensibleElements implements IMdaProxy {
    @objid ("a4bedb15-fc05-471e-bb39-3d5b3caea1ac")
    public static final String STEREOTYPE_NAME = "TImplementationArtifact";

    @objid ("1a4dcec7-8d3b-4e24-84c8-41038ea37a43")
    public static final String ARTIFACTREF_PROPERTY = "artifactRef";

    @objid ("7f451b2c-e4f0-4e3b-88b6-c8d5258c8f28")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("4cb6ca3e-2596-47ac-b565-6da230f07de8")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("5ea838b2-76f4-4361-926f-fda62bbc7ca0")
    public static final String OPERATIONNAME_PROPERTY = "operationName";

    /**
     * Tells whether a {@link TImplementationArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TImplementationArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8dc73914-560e-42e9-9abe-e98f1c4973c9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TImplementationArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TImplementationArtifact >> then instantiate a {@link TImplementationArtifact} proxy.
     * 
     * @return a {@link TImplementationArtifact} proxy on the created {@link ModelElement}.
     */
    @objid ("e72fd9b7-c522-44cd-82f8-982ad9646baa")
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
    @objid ("e0398231-ecfa-487b-9760-e900d51ed14d")
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
    @objid ("11e67b37-f9d4-46cb-8b01-a3e4a89c86a3")
    public static TImplementationArtifact safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TImplementationArtifact.canInstantiate(obj))
        	return new TImplementationArtifact(obj);
        else
        	throw new IllegalArgumentException("TImplementationArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("710a6ed8-9e81-4b58-9585-c31edf81b203")
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
    @objid ("e2835a6b-71fd-4a1e-b279-9e9242e7fb46")
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
    @objid ("10d703d2-78fc-4b2b-aec1-f4522a4824ee")
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
    @objid ("3e7b59e5-6275-430a-b237-78411f610569")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TImplementationArtifact.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e09a5406-1f23-42b0-b0b8-2c6234bcdcc4")
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
    @objid ("ed6c07af-177b-42e9-bb87-6905b006cbcc")
    public String getOperationName() {
        String value = this.elt.getProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("0754fce7-6f9b-49f8-8021-d461b5a585ef")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TImplementationArtifact.artifactRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("72f6d777-1cc8-46c7-8f1f-22acae4478d0")
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
    @objid ("dd143395-b7b2-4ee8-9f4c-96ccf4c6d311")
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
    @objid ("89b94911-7171-460c-845a-5b28ab3b1924")
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
    @objid ("953573c6-cdc5-4a18-9d59-4752ee90d939")
    public void setOperationName(final String value) {
        this.elt.setProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                             TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value));
    }

    @objid ("87e65b64-b8d2-44d5-a858-36d5476ec7f9")
    protected  TImplementationArtifact(final ModelElement elt) {
        super(elt);
    }

    @objid ("bb146691-a35c-4877-a462-31296610bbec")
    public static final class MdaTypes {
        @objid ("49ea41ce-985d-4153-b334-a72523330fad")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7a1b4b18-3cea-4b0f-99b0-adb2fb995e88")
        public static PropertyDefinition ARTIFACTREF_PROPERTY_ELT;

        @objid ("21c0f3eb-9b39-438c-bf89-9f2817c251c0")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("442203de-450b-4177-8634-a17cfc0b8957")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("da89bba9-f274-4346-ad51-17c884a8b559")
        public static PropertyDefinition OPERATIONNAME_PROPERTY_ELT;

        @objid ("91b443fc-0cbe-4278-92bd-b60c13e652ae")
        private static Stereotype MDAASSOCDEP;

        @objid ("ba13fdfa-b45c-42bb-ae68-4a6208beece5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ef8fc7a1-8af1-4428-bb55-127acb7c51b3")
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

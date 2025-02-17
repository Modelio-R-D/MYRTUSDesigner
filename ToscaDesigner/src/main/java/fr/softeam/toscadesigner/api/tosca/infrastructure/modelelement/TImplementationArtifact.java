/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 15:39 by Modelio Studio.
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
    @objid ("cf8a7741-2f0e-4cdc-afde-7076eb50e5a1")
    public static final String STEREOTYPE_NAME = "TImplementationArtifact";

    @objid ("c87b4701-229f-4d5a-906b-7d7fc3ad51b0")
    public static final String ARTIFACTREF_PROPERTY = "artifactRef";

    @objid ("9cb4609c-e1ff-4daa-9318-ca22e7e323eb")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("84fec6ef-91fa-4b36-a4fa-597bacd60046")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("140601c6-58ed-4c81-9393-5d599115e32d")
    public static final String OPERATIONNAME_PROPERTY = "operationName";

    /**
     * Tells whether a {@link TImplementationArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TImplementationArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5575c27c-1c27-40b6-acaa-dcbe426b37cb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TImplementationArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TImplementationArtifact >> then instantiate a {@link TImplementationArtifact} proxy.
     * 
     * @return a {@link TImplementationArtifact} proxy on the created {@link ModelElement}.
     */
    @objid ("5d780250-fee9-41d3-a08c-56d5d7198ed2")
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
    @objid ("512b5030-67e9-4f5e-a174-2deef9a984a9")
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
    @objid ("c752fb02-13a9-409c-aeec-02202ea4710f")
    public static TImplementationArtifact safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TImplementationArtifact.canInstantiate(obj))
        	return new TImplementationArtifact(obj);
        else
        	throw new IllegalArgumentException("TImplementationArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("972df74c-9449-4415-8da9-88b712cbc505")
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
    @objid ("db387a17-bfb5-4bec-b6cb-6b76636f8e10")
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
    @objid ("c2e3c7f5-f254-404e-9304-abd8b122cf84")
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
    @objid ("c0e93fba-3091-4f47-9457-716d61240ffa")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TImplementationArtifact.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d227690e-aceb-4c0b-86b9-1f2073a516b3")
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
    @objid ("6d98b1f6-8deb-48a6-b7ec-51fc0d16af17")
    public String getOperationName() {
        String value = this.elt.getProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("e581286a-8831-452c-b0e4-859a222ce841")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TImplementationArtifact.artifactRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fc5d9dad-940b-4a2c-987c-2dcc8717966a")
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
    @objid ("6c6ae257-3a62-4c68-a091-579eef31f451")
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
    @objid ("8aa1d585-041d-4743-a498-5a507cde3930")
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
    @objid ("9484ed09-a42a-42dc-af74-405b412bf46c")
    public void setOperationName(final String value) {
        this.elt.setProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                             TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value));
    }

    @objid ("8f7c76c8-dc41-41c8-91c3-9bbddd6fe148")
    protected  TImplementationArtifact(final ModelElement elt) {
        super(elt);
    }

    @objid ("bb146691-a35c-4877-a462-31296610bbec")
    public static final class MdaTypes {
        @objid ("9182fe51-c8ba-4711-a890-1ebcef4beede")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("06fddadc-4ac1-46fc-96be-fd7e281ec41e")
        public static PropertyDefinition ARTIFACTREF_PROPERTY_ELT;

        @objid ("b7e04f76-2a02-4b17-8164-2a2f71bd472b")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("5e914e14-ef94-4925-8f33-a222fed33ae1")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("764d256f-da2b-42fc-8451-5746eea20fe5")
        public static PropertyDefinition OPERATIONNAME_PROPERTY_ELT;

        @objid ("3bc6de6d-38c8-430d-a6e7-7c4fe162e87e")
        private static Stereotype MDAASSOCDEP;

        @objid ("9501d769-e471-4b9e-93ad-724ff7766f3c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bfbfa153-5815-4558-9ac9-6005a58c381b")
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

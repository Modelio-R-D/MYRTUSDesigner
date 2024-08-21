/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 16:27 by Modelio Studio.
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
@objid ("13ed14cd-9829-4e1c-ab88-9d6faf398595")
public class TImplementationArtifact extends TExtensibleElements implements IMdaProxy {
    @objid ("ba8ce303-af95-4bfd-a143-9ca17393941e")
    public static final String STEREOTYPE_NAME = "TImplementationArtifact";

    @objid ("da8c4451-753d-4bd0-bee2-324d5e145e8e")
    public static final String ARTIFACTREF_PROPERTY = "artifactRef";

    @objid ("a1c3247f-39cd-49ec-9c89-22427bca64fa")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("2d8d8946-fc69-4533-90ab-cf7acc458149")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("567fd212-9393-4fda-be15-e8d65a054ecf")
    public static final String OPERATIONNAME_PROPERTY = "operationName";

    /**
     * Tells whether a {@link TImplementationArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TImplementationArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("68cff87c-3be5-4f27-aefb-0734506f4b4e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TImplementationArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TImplementationArtifact >> then instantiate a {@link TImplementationArtifact} proxy.
     * 
     * @return a {@link TImplementationArtifact} proxy on the created {@link ModelElement}.
     */
    @objid ("30c414e6-5f97-4310-ab14-896228163eb4")
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
    @objid ("43809fb5-44b8-427c-9d66-18fa516cb9d9")
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
    @objid ("e292724a-e86e-43aa-9b17-615212e8585c")
    public static TImplementationArtifact safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TImplementationArtifact.canInstantiate(obj))
        	return new TImplementationArtifact(obj);
        else
        	throw new IllegalArgumentException("TImplementationArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2d7bbddb-edbe-4817-b65f-8000086c76db")
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
    @objid ("0a12386f-7e48-455b-b91c-410569f602c5")
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
    @objid ("254f67a2-846d-4ba7-880a-55c12b6ee63d")
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
    @objid ("cce6b506-57c6-447e-9312-aad4ec838aa2")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TImplementationArtifact.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("82e0fa0f-06d8-4616-8d0b-34ac191ec422")
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
    @objid ("5c73a440-d146-4b0d-a343-5c15df94d482")
    public String getOperationName() {
        String value = this.elt.getProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("15ab22c5-02df-4a7d-a85a-f7830590ee86")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TImplementationArtifact.artifactRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("44430f34-8f84-48d7-83af-29dda2796f0b")
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
    @objid ("492f4a70-9e03-4b61-8d57-d50ade360652")
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
    @objid ("8b8dd482-c28e-47dc-97dd-7421884d8d98")
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
    @objid ("e7e9b6a5-2220-4ae7-bf0c-343ead9741fc")
    public void setOperationName(final String value) {
        this.elt.setProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                             TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value));
    }

    @objid ("f01dc578-0e3c-44c8-99d0-9f82dd836e51")
    protected  TImplementationArtifact(final ModelElement elt) {
        super(elt);
    }

    @objid ("0a672c73-6fd9-4a88-826a-f788ee90082b")
    public static final class MdaTypes {
        @objid ("d2ad4b06-1fde-472a-8502-5c4e32d06704")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("540eae17-a14a-4676-af50-050ab702c66c")
        public static PropertyDefinition ARTIFACTREF_PROPERTY_ELT;

        @objid ("33bd14fc-b073-4d4e-a851-4d5319f52899")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("1b0286a9-3809-4bdc-af05-b0c6c5743595")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("b05ab087-d51c-4c10-a552-9ea280cd0461")
        public static PropertyDefinition OPERATIONNAME_PROPERTY_ELT;

        @objid ("cdbaf3df-6896-4e3d-97fb-c8fee245b953")
        private static Stereotype MDAASSOCDEP;

        @objid ("a8a294f9-923e-4226-88c0-e7b5977bddf4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3efe2a58-88f7-4d35-b0bd-1955ef8c9054")
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

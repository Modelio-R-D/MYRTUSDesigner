/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 17:57 by Modelio Studio.
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
    @objid ("4c8fdc3d-cc5a-4be6-9e9d-4e0d3843da87")
    public static final String STEREOTYPE_NAME = "TImplementationArtifact";

    @objid ("f72b2d09-ffcd-43e3-8386-5b5eb4936978")
    public static final String ARTIFACTREF_PROPERTY = "artifactRef";

    @objid ("f82d1d8e-aca5-4343-816d-43e00bbccfaf")
    public static final String ARTIFACTTYPE_PROPERTY = "artifactType";

    @objid ("5b9cc05f-969f-4e64-9b98-7a7530a77058")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("c9b69724-a2bc-49ad-a9c0-b411c0f18efc")
    public static final String OPERATIONNAME_PROPERTY = "operationName";

    /**
     * Tells whether a {@link TImplementationArtifact proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TImplementationArtifact >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0ff0e311-b1db-451e-b430-271a3662fbb7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TImplementationArtifact.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TImplementationArtifact >> then instantiate a {@link TImplementationArtifact} proxy.
     * 
     * @return a {@link TImplementationArtifact} proxy on the created {@link ModelElement}.
     */
    @objid ("c61c94d9-3055-4d59-9b1b-dfbca0f29b84")
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
    @objid ("0e77a887-2fca-40ce-86b3-6abd9e4a4f07")
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
    @objid ("0f944977-01be-4b49-b915-fa2f9a8e2b1c")
    public static TImplementationArtifact safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TImplementationArtifact.canInstantiate(obj))
        	return new TImplementationArtifact(obj);
        else
        	throw new IllegalArgumentException("TImplementationArtifact: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("830e95ab-8194-49bf-a66a-c1040ad25d92")
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
    @objid ("8f8da24e-bdef-431b-8cb1-f770c10ace8d")
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
    @objid ("437fc6f9-371c-4236-a9cc-2236af28cd56")
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
    @objid ("16d79a41-59ce-4194-9d44-b8c9f27aa738")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TImplementationArtifact.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("48ba58a5-549b-4c78-b545-a2fb25cbd994")
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
    @objid ("93b566a4-86bf-4117-a5ab-47ccc8a8e34e")
    public String getOperationName() {
        String value = this.elt.getProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                                            TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("66f7045b-0a90-4d3d-8dfa-fbe7a6f7f72f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TImplementationArtifact.artifactRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3f364b33-f1c6-4b28-acb7-7474686165b9")
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
    @objid ("d509619c-04e8-497e-9cd7-42423fcbb882")
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
    @objid ("4c391d9f-b161-446b-868e-a156f48bfa64")
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
    @objid ("5a2d3c94-f22a-4a84-9ff4-a07c58e655bc")
    public void setOperationName(final String value) {
        this.elt.setProperty(TImplementationArtifact.MdaTypes.STEREOTYPE_ELT,
                             TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TImplementationArtifact.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value));
    }

    @objid ("c912f6cd-1280-48c4-a973-30812470a0f7")
    protected  TImplementationArtifact(final ModelElement elt) {
        super(elt);
    }

    @objid ("74960c4c-b879-4456-b223-b81b00958093")
    public static final class MdaTypes {
        @objid ("060321cd-92c5-4011-a656-92fe87a44232")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4c40b470-cfb8-4fa3-a188-d42f6e7fb77b")
        public static PropertyDefinition ARTIFACTREF_PROPERTY_ELT;

        @objid ("c4df29b1-a254-4f29-a010-0b6d5b63cea6")
        public static PropertyDefinition ARTIFACTTYPE_PROPERTY_ELT;

        @objid ("e6b2656b-2126-49f2-ac24-c237c8af5f31")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("6f87763c-3f19-4cf0-b9bb-328d836b25d2")
        public static PropertyDefinition OPERATIONNAME_PROPERTY_ELT;

        @objid ("fcab34d8-4c86-4a1e-865e-32746fa6d1c3")
        private static Stereotype MDAASSOCDEP;

        @objid ("23202fba-6299-4d18-a734-8b1da65d4bc0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dfb96bb0-8d97-429a-a338-6349476bce46")
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

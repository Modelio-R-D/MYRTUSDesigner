/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:52 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TOperation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("dd2a1df2-2e18-4e5b-8627-c2e2abb8652b")
public class TOperation implements IMdaProxy {
    @objid ("d3e0d785-e825-4038-9314-6d21d6053973")
    public static final String STEREOTYPE_NAME = "TOperation";

    @objid ("8389afbf-7ad4-499b-a093-37242d8bb449")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("5fee0451-f846-4a74-b241-b07a82725843")
    public static final String IMPLEMENTATION_PROPERTY = "implementation";

    @objid ("36c4c38a-23ef-40df-85eb-9a67f33446ab")
    public static final String INPUTS_PROPERTY = "inputs";

    @objid ("271b3cf0-8657-4ab0-8289-13da8769547f")
    public static final String NAME_PROPERTY = "name";

    @objid ("9bb60721-9bb8-494d-a24b-fcaeaf237fae")
    public static final String OUTPUTS_PROPERTY = "outputs";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("8e4626a8-b8eb-431e-9669-b1450f1568ca")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fb9cc170-f2e4-4a65-b002-2cfe698bda60")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TOperation >> then instantiate a {@link TOperation} proxy.
     * 
     * @return a {@link TOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("3c6b9515-8227-48ae-b036-60aa677e0222")
    public static TOperation create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TOperation.MdaTypes.STEREOTYPE_ELT);
        return TOperation.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TOperation} proxy from a {@link ModelElement} stereotyped << TOperation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TOperation} proxy or <i>null</i>.
     */
    @objid ("1cdf8f38-545d-4940-b7fd-372958be0259")
    public static TOperation instantiate(final ModelElement obj) {
        return TOperation.canInstantiate(obj) ? new TOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TOperation} proxy from a {@link ModelElement} stereotyped << TOperation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b30d0f24-af01-4080-b89c-0a71cefcd781")
    public static TOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TOperation.canInstantiate(obj))
        	return new TOperation(obj);
        else
        	throw new IllegalArgumentException("TOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("19a6f338-1e02-46ee-9d27-1087c2c94610")
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
        TOperation other = (TOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TOperation.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("16ea4935-26ad-41e1-8b68-ff66715b05e3")
    public String getDescription() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("955bb876-ae43-4742-bfef-a6901a2c973b")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TOperation.implementation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("64c06fa1-543a-490c-8646-e4e00ebd2cd5")
    public String getImplementation() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.IMPLEMENTATION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.IMPLEMENTATION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.IMPLEMENTATION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TOperation.inputs'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("425c1fb9-8fb7-4ab3-b197-b367c58876de")
    public String getInputs() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.INPUTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.INPUTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.INPUTS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TOperation.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("992497c6-a2f2-4843-99ef-ec6ff3236bf0")
    public String getName() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TOperation.outputs'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bacac09d-bf7a-42df-bf0b-1e6553ed4242")
    public String getOutputs() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("ea8b3b99-966a-4aa0-aa7c-1baef8c36bad")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TOperation.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e03cc855-7950-4471-a9d5-2f154df69148")
    public void setDescription(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TOperation.implementation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7c8e3d01-d5cb-4f39-868b-8255e290e128")
    public void setImplementation(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.IMPLEMENTATION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.IMPLEMENTATION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TOperation.inputs'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0c879acf-2138-403e-a128-8f930f72c02c")
    public void setInputs(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.INPUTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.INPUTS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TOperation.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2b9402f1-54f6-45c1-aa9b-6860a0637f40")
    public void setName(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TOperation.outputs'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f29ccfde-a268-4d2b-9f4d-53491d0d05d8")
    public void setOutputs(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT, value));
    }

    @objid ("a77d9c0d-fb52-41d4-88bf-6a975ee3a93c")
    protected  TOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("44437658-3b7b-4810-9cac-e05ae1432689")
    public static final class MdaTypes {
        @objid ("0d725bce-982f-42c6-a9e6-ae1cb37bff8f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("afba400e-e7cc-4d4b-addc-61c994ffba7c")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("7c0d8127-3850-48ed-888e-4249ff41723d")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("ac1570a2-4898-47d5-b685-4950d9cbf326")
        public static PropertyDefinition IMPLEMENTATION_PROPERTY_ELT;

        @objid ("0e4c256c-3c8a-421d-a598-02507abfe468")
        public static PropertyDefinition INPUTS_PROPERTY_ELT;

        @objid ("a379fe58-6d7b-4bb9-b9c0-b53bbd1624e3")
        public static PropertyDefinition OUTPUTS_PROPERTY_ELT;

        @objid ("93acbe9d-1256-4ac1-80c3-e21ba616ce17")
        private static Stereotype MDAASSOCDEP;

        @objid ("7efd2346-1545-4c70-9b53-59b89230b8ad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9f6e0553-fe9e-4903-91ea-5814245c12ec")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "24e1e933-2b93-498c-9e0d-0d899a81eb20", "TOperation");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "23652b9d-9d58-4dc9-9d5b-906fcf3594e4", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "7e07cefa-0db7-4a6c-99f5-099c223834eb", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d3330a11-ae5b-464f-862b-e587feba80ac", "implementation");
            IMPLEMENTATION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (IMPLEMENTATION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "30a6aef6-f577-4f54-a2eb-9df4e6bc46dd", "inputs");
            INPUTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INPUTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d75d43de-20d1-4375-8764-f8048532f746", "outputs");
            OUTPUTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (OUTPUTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 09/04/2025 17:17 by Modelio Studio.
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
    @objid ("e17ec1c5-bef3-4198-8d8e-3a3d93655a19")
    public static final String STEREOTYPE_NAME = "TOperation";

    @objid ("41752cc4-1366-4d1c-ba74-0233297d938d")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("1e1b6ae2-2544-4c54-b018-1db135c0ca01")
    public static final String IMPLEMENTATION_PROPERTY = "implementation";

    @objid ("ddc2bbbe-bef3-4901-904e-ae920f24762c")
    public static final String INPUTS_PROPERTY = "inputs";

    @objid ("96b70620-2313-4fd9-a9d9-c6eb1681c4d1")
    public static final String NAME_PROPERTY = "name";

    @objid ("46149b82-44a9-4201-9490-38de6aefdf38")
    public static final String OUTPUTS_PROPERTY = "outputs";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("63a649af-228e-4491-a6e7-d789fad70eac")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1ba77c39-643f-4267-87a3-284851942682")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TOperation >> then instantiate a {@link TOperation} proxy.
     * 
     * @return a {@link TOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("b15398a3-f3aa-4d96-baa8-04c38d7d2753")
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
    @objid ("b08f0d53-afb7-4ff9-bc2e-578e066fa5c7")
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
    @objid ("4d3f56f0-bfc1-4782-9e7b-733502296242")
    public static TOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TOperation.canInstantiate(obj))
        	return new TOperation(obj);
        else
        	throw new IllegalArgumentException("TOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d4e46495-5791-4df9-8a42-12c0e4501f96")
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
    @objid ("abf4e578-a103-49ba-b147-931508e7d463")
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
    @objid ("1cae4561-769c-41f3-8c09-2ec1953250e5")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TOperation.implementation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6ac70c79-6135-4baf-8a97-9f624a09f4d4")
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
    @objid ("a819f75f-3c39-4fdf-acbd-e82d33bdfb41")
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
    @objid ("44fcf3fe-9d25-4f0d-9c0b-c2845bec805c")
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
    @objid ("58fa67e6-d2a5-4952-a003-5a2d9234863e")
    public String getOutputs() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("91d06880-10c8-492b-9911-578cb2f62b93")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TOperation.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("691bb53e-6dc4-4fe7-bba3-6a2d0b8d6592")
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
    @objid ("be282c9a-8a9e-4cab-9132-fa0f75dfcc06")
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
    @objid ("80c157e6-5240-4f59-b946-6a6396bb9e88")
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
    @objid ("01a4b7c0-20f6-4978-8d86-8fabe9446fc6")
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
    @objid ("f668219b-171b-412a-8494-f89e9901a559")
    public void setOutputs(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT, value));
    }

    @objid ("c4de84ed-720d-4465-83e4-6fa205bf38e4")
    protected  TOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("44437658-3b7b-4810-9cac-e05ae1432689")
    public static final class MdaTypes {
        @objid ("1428e1ad-7055-4ef9-a613-94724bd82c0d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0fbe1224-848f-446f-9658-4eae10e06a53")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("c9c0d44a-fbb2-4c42-bbdd-361af4b39061")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("e61d13c1-8016-44d2-a817-a5d77261ff23")
        public static PropertyDefinition IMPLEMENTATION_PROPERTY_ELT;

        @objid ("194edae3-cd5d-4bf5-a8c1-d5b97a674021")
        public static PropertyDefinition INPUTS_PROPERTY_ELT;

        @objid ("c5df1bb0-609b-4cf8-9738-8744208b24c7")
        public static PropertyDefinition OUTPUTS_PROPERTY_ELT;

        @objid ("5e899488-2920-4d20-8268-a2c13541263d")
        private static Stereotype MDAASSOCDEP;

        @objid ("b4250bdc-d856-4b6f-8e3e-e7caea05187a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a45249fa-4d0d-43a6-b661-2feb48099ed7")
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

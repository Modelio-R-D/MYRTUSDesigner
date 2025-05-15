/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
    @objid ("8c068c87-7ecb-4475-8fc6-654a323452ca")
    public static final String STEREOTYPE_NAME = "TOperation";

    @objid ("1dd1075f-7b2e-48f4-b852-19861de46388")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("46ea014d-3cfa-4aff-a485-ddf19bf84e3b")
    public static final String IMPLEMENTATION_PROPERTY = "implementation";

    @objid ("570e68e1-c912-45bd-822b-789c52db42f4")
    public static final String INPUTS_PROPERTY = "inputs";

    @objid ("3be98313-4e09-4ad1-95fd-3d2d765172e8")
    public static final String NAME_PROPERTY = "name";

    @objid ("9ef94400-cdf9-48ae-b95d-656a7b1b972a")
    public static final String OUTPUTS_PROPERTY = "outputs";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("0690106e-81d2-46bc-89c6-5198789d5043")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("759e1059-b01e-4799-a3ad-c968c0317c9a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TOperation >> then instantiate a {@link TOperation} proxy.
     * 
     * @return a {@link TOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("5eddd434-c262-49f8-ba46-d43ed5bd87c2")
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
    @objid ("fe3c973f-592e-4b67-86c0-6b795225b909")
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
    @objid ("320165ff-7789-4512-aa71-e3c61efa63bf")
    public static TOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TOperation.canInstantiate(obj))
        	return new TOperation(obj);
        else
        	throw new IllegalArgumentException("TOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("77bd6da1-8244-41d4-8af0-46a045adda0e")
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
    @objid ("2b8f6693-503e-446c-b421-3d9647421b7a")
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
    @objid ("9676d511-f1cb-4dcb-a372-93c738f13ffb")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TOperation.implementation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("927842b6-aa0b-418b-aca8-b7c7faaeac68")
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
    @objid ("f7f3b436-efb7-4d8b-862e-92c1b33a6f97")
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
    @objid ("faca8929-81f9-42c5-bc66-76f4df7adc7a")
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
    @objid ("6dcd7bed-9a07-4b56-b93d-bb39b03fbd51")
    public String getOutputs() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("7a299adf-ecd2-4354-b9ce-9ae6caa1d9ff")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TOperation.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("26b0f9a3-4359-4a9f-8702-36afbd356f34")
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
    @objid ("26813a47-07f6-4f8f-aa65-9b7ebba20b4b")
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
    @objid ("cd36df1b-d40f-47dc-944b-6349bb13826d")
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
    @objid ("9374c7ab-b4a6-4169-b0f9-8b82d83edb83")
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
    @objid ("10e59753-b630-4653-a8e5-610f371f2f97")
    public void setOutputs(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT, value));
    }

    @objid ("12ed6a0d-c919-4fd7-b639-7e49458b2bdf")
    protected  TOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("44437658-3b7b-4810-9cac-e05ae1432689")
    public static final class MdaTypes {
        @objid ("5f7ebb36-e90f-4d35-a1ff-811c0043e1bc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d726d094-e32e-4401-9fcd-715d778318e9")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("29785ae9-d750-446e-ab63-bf6ff3b3a2fb")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("7407bbd1-d284-427c-89ea-21d279e74fed")
        public static PropertyDefinition IMPLEMENTATION_PROPERTY_ELT;

        @objid ("53799a88-29ef-4480-bdcc-dd7deff28077")
        public static PropertyDefinition INPUTS_PROPERTY_ELT;

        @objid ("46566217-1b1a-4042-979b-1097edeb5e9c")
        public static PropertyDefinition OUTPUTS_PROPERTY_ELT;

        @objid ("b132de2b-6a97-4034-b5bf-d94ac1efc4ea")
        private static Stereotype MDAASSOCDEP;

        @objid ("af4818c8-b552-4135-a8b5-7df3425ebdf3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("adef5794-5439-4984-b8ee-cb9709f3f369")
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

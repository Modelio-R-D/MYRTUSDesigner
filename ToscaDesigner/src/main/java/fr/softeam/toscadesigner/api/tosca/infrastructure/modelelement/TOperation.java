/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:09 by Modelio Studio.
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
    @objid ("9f08287a-2740-4941-b8bd-b50865849532")
    public static final String STEREOTYPE_NAME = "TOperation";

    @objid ("3d26894f-9546-488f-951e-9a710089ff0f")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("fb070d77-ce0e-419b-966f-ed258fb28499")
    public static final String IMPLEMENTATION_PROPERTY = "implementation";

    @objid ("d8e9ff02-fb5a-4d60-b555-21bc5fb6cf33")
    public static final String INPUTS_PROPERTY = "inputs";

    @objid ("6d2874fb-dd98-4280-a7b2-e0ea9c813743")
    public static final String NAME_PROPERTY = "name";

    @objid ("1aaede47-3b99-4c30-bc0f-8666635ab8ed")
    public static final String OUTPUTS_PROPERTY = "outputs";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("f538ec37-98bb-4144-a520-2bd5010c9416")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("de1918b1-afcb-456b-b219-89e398a2da1c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TOperation >> then instantiate a {@link TOperation} proxy.
     * 
     * @return a {@link TOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("a29db5a3-ad61-4d0c-82b1-0fb33083f56e")
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
    @objid ("8541e4d1-51d0-46e4-88e1-835741254dd6")
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
    @objid ("c7fc51ab-3011-417b-b83b-0aad9f854def")
    public static TOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TOperation.canInstantiate(obj))
        	return new TOperation(obj);
        else
        	throw new IllegalArgumentException("TOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a7324d79-a99b-4e6d-9da0-f950de0aab9e")
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
    @objid ("a410b2c1-13ac-47a5-853b-57577b6e8db5")
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
    @objid ("575877a3-b5e6-4e93-ad57-8ea4137209b0")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TOperation.implementation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f4950ecf-ca9a-48e6-8111-0421af4aa797")
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
    @objid ("73425743-b151-4f00-b2d1-b21695381bf2")
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
    @objid ("42e398d7-d472-473c-ab5c-55ed88ea91da")
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
    @objid ("67e4b622-4b16-44fd-98e1-fbabc263cc75")
    public String getOutputs() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("d1ffd529-0d1b-46b7-946d-9378e90a1f2d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TOperation.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aebaf586-e3de-4e98-b9af-d257b0a2bb61")
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
    @objid ("568200bc-979a-4575-aae3-fd366ea8f970")
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
    @objid ("a32bd0ba-2c31-4264-a52a-37813fa6f596")
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
    @objid ("61f762c9-a267-4b5f-a2c6-a58ffe4b0782")
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
    @objid ("ea09e08d-fecb-4c0d-98cf-56322a70dd3c")
    public void setOutputs(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.OUTPUTS_PROPERTY_ELT, value));
    }

    @objid ("e5f810b5-bd92-4cf9-a9ad-44e150ee0b42")
    protected  TOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("44437658-3b7b-4810-9cac-e05ae1432689")
    public static final class MdaTypes {
        @objid ("2adf9b24-568d-4a0e-8a34-b181921f7770")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e5763870-5757-4c5e-bde7-9f2f3b7ece12")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("3ec9e708-b59a-429f-88d6-52005621f847")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("a7b1c16d-22b6-45ec-aae0-972df75853e8")
        public static PropertyDefinition IMPLEMENTATION_PROPERTY_ELT;

        @objid ("82145f57-c0d3-48ca-86fd-dfa78eef971c")
        public static PropertyDefinition INPUTS_PROPERTY_ELT;

        @objid ("7c965bb3-a320-4a92-8db3-7b2a3fba98f7")
        public static PropertyDefinition OUTPUTS_PROPERTY_ELT;

        @objid ("26000d2c-60ae-4cb7-aff3-04570fe0d24f")
        private static Stereotype MDAASSOCDEP;

        @objid ("b44a1932-b469-40cd-ae29-ad0d21b233da")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5782e063-a36f-4d99-b087-91d807cd72a4")
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

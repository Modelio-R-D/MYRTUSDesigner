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
 * Proxy class to handle a {@link ModelElement} with << TOperation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4fece89b-fab2-4c23-b5a1-a52207ddb660")
public class TOperation implements IMdaProxy {
    @objid ("47386cb6-ec8e-4881-aacd-78911fac2892")
    public static final String STEREOTYPE_NAME = "TOperation";

    @objid ("9ddd2a8e-5cf6-43b6-ac26-918b618cea7c")
    public static final String INPUTPARAMETERS_PROPERTY = "inputParameters";

    @objid ("b0240114-d1cf-4d06-8831-f074aa32947d")
    public static final String NAME_PROPERTY = "name";

    @objid ("b0036800-93fe-4941-9de1-95f19fbd5b89")
    public static final String OUTPUTPARAMETERS_PROPERTY = "outputParameters";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("7f87fcdd-5dd1-41fd-bc69-cd166d413d98")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d66fa807-21ed-45c5-9efe-dd102cd09f8c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TOperation >> then instantiate a {@link TOperation} proxy.
     * 
     * @return a {@link TOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("82c1626c-c98f-476c-9c3e-034baf33e52e")
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
    @objid ("237d92c2-ebfc-48f1-9c8a-875deaff9a1b")
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
    @objid ("9a55a623-94f1-4b4a-a44d-5086ad5c128d")
    public static TOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TOperation.canInstantiate(obj))
        	return new TOperation(obj);
        else
        	throw new IllegalArgumentException("TOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("797becc5-5986-4f2b-ba6f-7954e9717aa7")
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
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("4ec1ca12-cef5-4595-bd04-07c38e33c7dd")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TOperation.inputParameters'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f2851078-6a29-4d8b-8b57-9753117aac1a")
    public String getInputParameters() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.INPUTPARAMETERS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.INPUTPARAMETERS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.INPUTPARAMETERS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TOperation.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f63d0fe0-c739-473b-8dc1-931e27d71a9e")
    public String getName() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TOperation.outputParameters'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("16c997cc-22a7-4839-8afb-e70cb85ab794")
    public String getOutputParameters() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("3a5d5474-0b5d-4adf-9c9a-3a241df92447")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TOperation.inputParameters'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d839e5e9-8a84-4407-ab7d-2cbb6ebb8341")
    public void setInputParameters(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.INPUTPARAMETERS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.INPUTPARAMETERS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TOperation.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b2fb5027-66a6-40bf-8679-4bace6a96955")
    public void setName(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TOperation.outputParameters'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3e35508f-e9b2-403d-a134-46a84b7dc4eb")
    public void setOutputParameters(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT, value));
    }

    @objid ("d65df96d-9e6f-47e5-9905-2a4213125ec8")
    protected  TOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d7cdfa86-64a4-43ce-b78f-c530b2fc6d09")
    public static final class MdaTypes {
        @objid ("f0b2a984-4243-47b3-af4f-af6abee46cae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b8220de5-af02-495b-8b3a-0ca17937535d")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("3beca77d-4f24-48e8-aa9a-af09475cc68b")
        public static PropertyDefinition INPUTPARAMETERS_PROPERTY_ELT;

        @objid ("25aac7fd-fa2e-475d-b98a-c8b72399a72a")
        public static PropertyDefinition OUTPUTPARAMETERS_PROPERTY_ELT;

        @objid ("c96a1609-aa62-4c79-80d0-b774bd683a76")
        private static Stereotype MDAASSOCDEP;

        @objid ("a089db54-bf8f-4c8f-9ce7-e7bf6ffea375")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a0d95673-cd57-48a3-b453-2c4c9397a636")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "24e1e933-2b93-498c-9e0d-0d899a81eb20", "TOperation");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "23652b9d-9d58-4dc9-9d5b-906fcf3594e4", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "7e07cefa-0db7-4a6c-99f5-099c223834eb", "inputParameters");
            INPUTPARAMETERS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INPUTPARAMETERS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d3330a11-ae5b-464f-862b-e587feba80ac", "outputParameters");
            OUTPUTPARAMETERS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (OUTPUTPARAMETERS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

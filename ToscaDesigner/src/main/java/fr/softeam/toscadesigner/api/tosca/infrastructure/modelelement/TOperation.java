/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 11:45 by Modelio Studio.
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
    @objid ("a947d49e-b5e6-471a-825a-f3ba1f9328a1")
    public static final String STEREOTYPE_NAME = "TOperation";

    @objid ("0c74aa77-5a19-4842-bd1c-a56bee435721")
    public static final String INPUTPARAMETERS_PROPERTY = "inputParameters";

    @objid ("9763094d-fbca-4e52-95e6-bba8b366c9b5")
    public static final String NAME_PROPERTY = "name";

    @objid ("ce3fe502-114b-493c-8af0-f4bee00f75fe")
    public static final String OUTPUTPARAMETERS_PROPERTY = "outputParameters";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("4ecbd669-a41a-4b81-8c10-b582e2be87ad")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("09b47d59-77c5-4fe8-b0cc-d29754f7f51e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TOperation >> then instantiate a {@link TOperation} proxy.
     * 
     * @return a {@link TOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("a4bae3fc-dc5d-46b9-b72a-4cf5e5361768")
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
    @objid ("5f92f612-8de4-4df4-b68f-6b9bd0a99299")
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
    @objid ("cc2cd72b-ceed-4262-b9c3-27e88e449de5")
    public static TOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TOperation.canInstantiate(obj))
        	return new TOperation(obj);
        else
        	throw new IllegalArgumentException("TOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9c451a1d-bad5-4f5c-9e14-f3cec455339d")
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
    @objid ("2d9b628d-c09f-4f9d-8c1f-dd0659c3b534")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TOperation.inputParameters'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("076529c8-66bf-4159-9f64-ff730367fc4d")
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
    @objid ("8eebe44d-2b97-4e7f-be11-b990ec8c1e10")
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
    @objid ("7452f2ea-aa6b-44b8-9eb4-bb8c503f3bd8")
    public String getOutputParameters() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("aa73850b-887b-4214-be88-17fc8a5c5a67")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TOperation.inputParameters'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dcad91f1-c9b4-4f6d-8df5-72a32db2d6c7")
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
    @objid ("90363acf-7764-47cc-a69d-25b83fd5af08")
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
    @objid ("230c0f86-864b-49dc-afc5-3ec26ab54daa")
    public void setOutputParameters(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT, value));
    }

    @objid ("9a3dfdb9-ac42-4463-b000-0b4efc7ac739")
    protected  TOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d7cdfa86-64a4-43ce-b78f-c530b2fc6d09")
    public static final class MdaTypes {
        @objid ("d17f0209-4f8e-43e8-a361-0cb0fd903f57")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("18368041-321e-4f9a-b8da-7ab1fce646fd")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("5dbe0dce-5666-48b6-82fd-119d379e5362")
        public static PropertyDefinition INPUTPARAMETERS_PROPERTY_ELT;

        @objid ("ae86e344-8328-404a-b9b9-5912ee66de05")
        public static PropertyDefinition OUTPUTPARAMETERS_PROPERTY_ELT;

        @objid ("c5ef2244-ca0a-4424-8016-be91663ea443")
        private static Stereotype MDAASSOCDEP;

        @objid ("c595cfd8-45c2-4e61-9be5-73a61765e507")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f0ba8a28-c585-4d98-9248-0af9c1195e8d")
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

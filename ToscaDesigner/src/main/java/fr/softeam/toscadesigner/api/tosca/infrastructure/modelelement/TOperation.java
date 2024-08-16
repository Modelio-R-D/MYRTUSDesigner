/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/08/2024 17:44 by Modelio Studio.
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
@objid ("a0b5b408-8ba5-4c64-9d88-fa3efb30b0c2")
public class TOperation implements IMdaProxy {
    @objid ("177d4fb3-ca27-4c4f-8976-f6af04db06c1")
    public static final String STEREOTYPE_NAME = "TOperation";

    @objid ("1e0cab34-91ff-4ae1-994c-3c2713a70625")
    public static final String INPUTPARAMETERS_PROPERTY = "inputParameters";

    @objid ("9453d09f-9546-4d6e-9695-040ada03695f")
    public static final String NAME_PROPERTY = "name";

    @objid ("d7beffe4-7cc1-484c-8b2b-d176d4e88532")
    public static final String OUTPUTPARAMETERS_PROPERTY = "outputParameters";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("7880114d-5fcf-4358-b573-f6f8232cf6b7")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("192049fc-127b-4f00-be53-b373426af9a4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TOperation >> then instantiate a {@link TOperation} proxy.
     * @return a {@link TOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("e788880a-34c6-4625-87f5-b0b48c5b61bc")
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
    @objid ("60ea43f8-1bec-4ef9-97d1-44bd34ec9b1b")
    public static TOperation instantiate(final ModelElement obj) {
        return TOperation.canInstantiate(obj) ? new TOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TOperation} proxy from a {@link ModelElement} stereotyped << TOperation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TOperation} proxy.
     */
    @objid ("f1f948d0-95e6-4d10-b262-5d6ce27f50ec")
    public static TOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TOperation.canInstantiate(obj))
            return new TOperation(obj);
        else
            throw new IllegalArgumentException("TOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e48459aa-e6d9-4ff6-901a-06d5f805f358")
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
    @objid ("917c7139-c680-4b68-bab7-ac5fd69cb344")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TOperation.inputParameters'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bcc37f57-7525-4783-9995-2178b1159b72")
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
    @objid ("adc8d34b-d19f-4ac6-ab02-9f6cecd16183")
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
    @objid ("3f249a7e-6d54-4677-9232-f8af69ac6c7e")
    public String getOutputParameters() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT, value, this.elt);
    }

    @objid ("7f900951-ce8a-4892-b7f5-bf441b56b363")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TOperation.inputParameters'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("24764a9b-d157-400c-a99c-1cf9c9539e0c")
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
    @objid ("174c0868-f499-4c94-8a0a-54149875a3cf")
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
    @objid ("8010422f-7cc0-46b3-95ab-4dace9a73e14")
    public void setOutputParameters(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT, value));
    }

    @objid ("5c533117-ef43-4b3d-a7dd-8ebdba5e5c5f")
    protected  TOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("87473c17-8ac7-4a33-9108-e6c6f40a158a")
    public static final class MdaTypes {
        @objid ("01a49e39-2fdf-4467-bedb-b25d78f58197")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9ceacd86-1732-4ff0-953c-8d5cd672e377")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("70bd17fa-47c1-48ef-aff4-5edf349f3e9f")
        public static PropertyDefinition INPUTPARAMETERS_PROPERTY_ELT;

        @objid ("17794116-e340-4ce5-ae88-47d0b2783942")
        public static PropertyDefinition OUTPUTPARAMETERS_PROPERTY_ELT;

        @objid ("cf8456e3-ce5e-495c-b614-a808b273f509")
        private static Stereotype MDAASSOCDEP;

        @objid ("b96ac768-8ef4-4a5c-9e99-9536eff6ea99")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d120a441-9cc0-4ecb-a111-105cc1b0a3ba")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
    @objid ("8c2ca475-b8f1-4bf7-9177-8fee94b9d7a5")
    public static final String STEREOTYPE_NAME = "TOperation";

    @objid ("5d7b43d8-7da7-43a8-b3c4-68a0ffa79746")
    public static final String INPUTPARAMETERS_PROPERTY = "inputParameters";

    @objid ("a49a41d8-5288-42a7-824a-14880c619138")
    public static final String NAME_PROPERTY = "name";

    @objid ("d0a94584-65c2-49e1-a4f7-6b178179907f")
    public static final String OUTPUTPARAMETERS_PROPERTY = "outputParameters";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("c09832e8-563d-4ca9-9c73-f3d0f4a9a0bf")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("aff86062-582f-4ba4-822d-022ac9c4e578")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TOperation >> then instantiate a {@link TOperation} proxy.
     * 
     * @return a {@link TOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("8c8190cb-90b3-4194-b084-53a71bef0f22")
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
    @objid ("0fccb37b-c87d-44eb-a075-f9ee67105942")
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
    @objid ("c6a1aecc-eae8-4f34-bae4-09c987181d96")
    public static TOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TOperation.canInstantiate(obj))
        	return new TOperation(obj);
        else
        	throw new IllegalArgumentException("TOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fdbc19c0-8050-4492-b123-d4570853656f")
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
    @objid ("5bb550c8-c497-4c59-9095-a1f5516db17b")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TOperation.inputParameters'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5e2c14f1-681d-4011-b90d-126f4d559a75")
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
    @objid ("9e970881-ee05-41d2-b095-a28db7beb1e8")
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
    @objid ("8c3b3607-1c8d-431a-a3ae-87439db1a773")
    public String getOutputParameters() {
        String value = this.elt.getProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                                            TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("c5e8d779-61eb-4e1d-8828-58dbe6e2545d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TOperation.inputParameters'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("47765ddb-21eb-4c4d-add5-f6d83e9fd37b")
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
    @objid ("11c5141a-3355-4a96-9748-d798b587c682")
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
    @objid ("531ff6b6-d73a-48ef-96bd-e8642070a3b2")
    public void setOutputParameters(final String value) {
        this.elt.setProperty(TOperation.MdaTypes.STEREOTYPE_ELT,
                             TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TOperation.MdaTypes.OUTPUTPARAMETERS_PROPERTY_ELT, value));
    }

    @objid ("a157d198-8959-43a2-80e2-789b992dabdd")
    protected  TOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("44437658-3b7b-4810-9cac-e05ae1432689")
    public static final class MdaTypes {
        @objid ("f9bd53c2-98a3-4c64-a80b-7a510792bc76")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("90e40fb3-d800-49b7-b692-51a5aed87ed7")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("d9f65257-e963-47c8-aa6e-160e41d66a02")
        public static PropertyDefinition INPUTPARAMETERS_PROPERTY_ELT;

        @objid ("7928e74b-cf10-41a4-8a97-921481de6bd5")
        public static PropertyDefinition OUTPUTPARAMETERS_PROPERTY_ELT;

        @objid ("199af352-1464-4bf5-9c25-263011d79e56")
        private static Stereotype MDAASSOCDEP;

        @objid ("1eb189fd-0c4f-4d1b-8bff-635a512d28ae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("75d4032b-1257-48f1-ab86-e65748ed851a")
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

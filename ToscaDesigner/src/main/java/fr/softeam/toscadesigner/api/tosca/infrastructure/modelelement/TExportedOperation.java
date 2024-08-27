/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << TExportedOperation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f20b21fb-69bc-4ceb-8fb0-8c629ef447df")
public class TExportedOperation implements IMdaProxy {
    @objid ("faafd7fe-ee10-4df3-8fe1-553ff371d437")
    public static final String STEREOTYPE_NAME = "TExportedOperation";

    @objid ("e15d6ed1-68d1-4cae-8937-73286d2a3b39")
    public static final String NODEOPERATION_PROPERTY = "nodeOperation";

    @objid ("d069d9b4-dfaa-477a-9bb5-af9006af986c")
    public static final String PLAN_PROPERTY = "plan";

    @objid ("31d69b24-22c5-44c0-ae9e-5bb90132f1b2")
    public static final String RELATIONSHIPOPERATION_PROPERTY = "relationshipOperation";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("36673f95-688f-4bca-9d54-fbeedfe2c348")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExportedOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExportedOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2e4534dd-23a1-4e43-a9a4-6db37f6e0774")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExportedOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExportedOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExportedOperation >> then instantiate a {@link TExportedOperation} proxy.
     * @return a {@link TExportedOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("59246844-9fa5-4dfc-bff8-f22c49b6ae7d")
    public static TExportedOperation create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TExportedOperation.MdaTypes.STEREOTYPE_ELT);
        return TExportedOperation.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TExportedOperation} proxy from a {@link ModelElement} stereotyped << TExportedOperation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TExportedOperation} proxy or <i>null</i>.
     */
    @objid ("f2b924e7-926b-4d86-a6e4-c91189a535de")
    public static TExportedOperation instantiate(final ModelElement obj) {
        return TExportedOperation.canInstantiate(obj) ? new TExportedOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExportedOperation} proxy from a {@link ModelElement} stereotyped << TExportedOperation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TExportedOperation} proxy.
     */
    @objid ("e595dd29-4e3a-4ede-88a1-b64148c832b3")
    public static TExportedOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExportedOperation.canInstantiate(obj))
            return new TExportedOperation(obj);
        else
            throw new IllegalArgumentException("TExportedOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3dd15a15-7d4d-4ba6-8877-0fc9a3120ab3")
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
        TExportedOperation other = (TExportedOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("8ed7d033-b8fd-4f1f-9a91-f6ed2896cd72")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TExportedOperation.nodeOperation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("233d88c1-1011-41f1-83fc-4953a8a6b368")
    public String getNodeOperation() {
        String value = this.elt.getProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                                            TExportedOperation.MdaTypes.NODEOPERATION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExportedOperation.MdaTypes.NODEOPERATION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExportedOperation.MdaTypes.NODEOPERATION_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TExportedOperation.plan'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c9828de1-b806-4448-b799-4a71fb0f545a")
    public String getPlan() {
        String value = this.elt.getProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                                            TExportedOperation.MdaTypes.PLAN_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExportedOperation.MdaTypes.PLAN_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExportedOperation.MdaTypes.PLAN_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TExportedOperation.relationshipOperation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c42503d5-d570-470f-af4f-8690a3ef3393")
    public String getRelationshipOperation() {
        String value = this.elt.getProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                                            TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT, value, this.elt);
    }

    @objid ("2c2e9052-cc48-4d02-bc7d-7355bc9fa1ad")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TExportedOperation.nodeOperation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6364df09-8113-4c11-b3de-939c53dbdd4a")
    public void setNodeOperation(final String value) {
        this.elt.setProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                             TExportedOperation.MdaTypes.NODEOPERATION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExportedOperation.MdaTypes.NODEOPERATION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TExportedOperation.plan'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("53830c49-c6e4-4d22-9532-1fff8362f3bf")
    public void setPlan(final String value) {
        this.elt.setProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                             TExportedOperation.MdaTypes.PLAN_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExportedOperation.MdaTypes.PLAN_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TExportedOperation.relationshipOperation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5e97111e-bc1e-428f-ae44-5e1d2061372b")
    public void setRelationshipOperation(final String value) {
        this.elt.setProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                             TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT, value));
    }

    @objid ("0dddcb1f-3809-4577-8e6e-71790aec4457")
    protected  TExportedOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("375daa02-4c53-4bc5-8cd4-000c5050639c")
    public static final class MdaTypes {
        @objid ("e038bc9f-21b9-4604-b721-d822ea688802")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a848fce4-f7f3-4921-a5d6-938a1efd67e7")
        public static PropertyDefinition NODEOPERATION_PROPERTY_ELT;

        @objid ("102c1172-6cb5-4da7-9cdc-d83980f878ac")
        public static PropertyDefinition RELATIONSHIPOPERATION_PROPERTY_ELT;

        @objid ("1a717319-8a4a-4d26-b5e8-ede267eda999")
        public static PropertyDefinition PLAN_PROPERTY_ELT;

        @objid ("5662457a-c89c-475b-8911-50144de4f570")
        private static Stereotype MDAASSOCDEP;

        @objid ("47c614ef-2f1d-474c-8b26-f90bc854174c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6d743af1-51eb-48b6-be00-3eed4b3b87dd")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "f4cec7e8-d157-421e-a825-dcfb9d66f103", "TExportedOperation");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "f69dd6b2-5992-48d5-85d5-847d78354502", "nodeOperation");
            NODEOPERATION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NODEOPERATION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b61a4a84-a40c-4d0e-9589-cc94dfcd19b1", "relationshipOperation");
            RELATIONSHIPOPERATION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (RELATIONSHIPOPERATION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "df0f4b31-92bd-47c3-9687-cdd7a6492907", "plan");
            PLAN_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PLAN_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

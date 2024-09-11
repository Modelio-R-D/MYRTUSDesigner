/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 14:25 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TExportedOperation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9a02d852-8149-4e7a-9810-34f4fbb3ebd9")
public class TExportedOperation implements IMdaProxy {
    @objid ("139a995f-92a4-4850-aa76-06007150f4be")
    public static final String STEREOTYPE_NAME = "TExportedOperation";

    @objid ("c7eb66fa-9b64-4e79-af97-7eeac53b5f06")
    public static final String NODEOPERATION_PROPERTY = "nodeOperation";

    @objid ("6bb6f9ca-95c3-4471-95c0-077d1c55cb74")
    public static final String PLAN_PROPERTY = "plan";

    @objid ("05941b10-ad65-4044-a916-3206b36c8526")
    public static final String RELATIONSHIPOPERATION_PROPERTY = "relationshipOperation";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("8eba6242-3f4b-441a-99cf-1a60281125ab")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExportedOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExportedOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("22fec9d9-d2f5-4258-92d6-530127e4b45e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExportedOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExportedOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExportedOperation >> then instantiate a {@link TExportedOperation} proxy.
     * 
     * @return a {@link TExportedOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("cb07e614-6efa-4f9f-8215-959ab9d42ef6")
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
    @objid ("101a9d7c-9899-4802-bfde-877859ea897f")
    public static TExportedOperation instantiate(final ModelElement obj) {
        return TExportedOperation.canInstantiate(obj) ? new TExportedOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExportedOperation} proxy from a {@link ModelElement} stereotyped << TExportedOperation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TExportedOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b3a4994b-d7ac-4228-9d5a-8c40363e7245")
    public static TExportedOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExportedOperation.canInstantiate(obj))
        	return new TExportedOperation(obj);
        else
        	throw new IllegalArgumentException("TExportedOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("46df080c-78aa-44b9-8503-a71f8af61e2d")
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
    @objid ("d18b7c3b-87f6-46e2-8e07-ea7599553908")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TExportedOperation.nodeOperation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("275569fb-0d8e-4722-9d44-dad89521645f")
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
    @objid ("bee84cb6-d5da-4549-85e8-f5aa8cfcbaa7")
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
    @objid ("ff4de93c-5be1-4bad-ae3b-6bef77f66711")
    public String getRelationshipOperation() {
        String value = this.elt.getProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                                            TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("8683108f-00b9-429f-8381-9da9e7bfed10")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TExportedOperation.nodeOperation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("be46b59e-996c-4760-aabb-d16665e217f7")
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
    @objid ("0ad26f80-b9ad-4231-988c-3ca737223b50")
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
    @objid ("b49e05de-6af7-4896-89f2-e08c443e5db5")
    public void setRelationshipOperation(final String value) {
        this.elt.setProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                             TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT, value));
    }

    @objid ("86efa757-3d92-433d-8459-bf6415189061")
    protected  TExportedOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("98e1fbf7-15e4-441e-ac22-82a980c932b5")
    public static final class MdaTypes {
        @objid ("f30329cc-db0b-41b3-a9e3-677fe42a2811")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d900c715-058d-42c7-ab33-c55e597f5a26")
        public static PropertyDefinition NODEOPERATION_PROPERTY_ELT;

        @objid ("93c71441-a318-4788-a804-afac7a223979")
        public static PropertyDefinition RELATIONSHIPOPERATION_PROPERTY_ELT;

        @objid ("fcf5e9e1-201e-4c76-a935-59196b27d828")
        public static PropertyDefinition PLAN_PROPERTY_ELT;

        @objid ("70143858-0804-41f4-9949-8ed26c2f3795")
        private static Stereotype MDAASSOCDEP;

        @objid ("d9b0cbb9-ae46-4a9d-8101-2f530b9e7eac")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c77d7d68-8bc4-4bcc-b03e-b94372aa2507")
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

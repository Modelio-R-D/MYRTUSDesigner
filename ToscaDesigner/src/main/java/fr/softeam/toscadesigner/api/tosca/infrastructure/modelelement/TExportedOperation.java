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
 * Proxy class to handle a {@link ModelElement} with << TExportedOperation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("884f68e8-3e9f-4e12-85ce-6263a3d63abc")
public class TExportedOperation implements IMdaProxy {
    @objid ("a78fd718-1a4c-4a7c-a594-2d08cb7117ce")
    public static final String STEREOTYPE_NAME = "TExportedOperation";

    @objid ("8b7de04d-668d-4dfe-adb6-b7728ac4922b")
    public static final String NODEOPERATION_PROPERTY = "nodeOperation";

    @objid ("7dd03983-8d6a-4029-8ea2-d5971a64daac")
    public static final String PLAN_PROPERTY = "plan";

    @objid ("a9d01345-9d05-4b55-ad0e-841269865583")
    public static final String RELATIONSHIPOPERATION_PROPERTY = "relationshipOperation";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("de58d6e0-bb81-41c8-b0e0-a841287a88c4")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExportedOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExportedOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7a89392c-7060-4653-addd-2237e31915bd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExportedOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExportedOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExportedOperation >> then instantiate a {@link TExportedOperation} proxy.
     * 
     * @return a {@link TExportedOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("2b368f6a-ad1a-41b2-be57-485fd845269b")
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
    @objid ("28166be3-e9fb-44b5-8399-a168e85ca53a")
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
    @objid ("3dc5a72b-1b42-423d-9de2-699933a1b2ea")
    public static TExportedOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExportedOperation.canInstantiate(obj))
        	return new TExportedOperation(obj);
        else
        	throw new IllegalArgumentException("TExportedOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("827a3401-7b1c-46a6-8a4c-919a024a031a")
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
    @objid ("f8e49e3a-071a-401d-b54c-9ddb6834152d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TExportedOperation.nodeOperation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b2a514fd-19a5-42a6-a2c7-979c267117fc")
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
    @objid ("a8e404dd-e84a-45f9-9881-18aca6547cf8")
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
    @objid ("4240a6c7-cdcc-4bff-aeef-fb0b274a7b59")
    public String getRelationshipOperation() {
        String value = this.elt.getProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                                            TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("eb161fe8-9dae-445c-a104-4439b46033e0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TExportedOperation.nodeOperation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("25e2d286-7f16-40c8-831a-a8f026a21769")
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
    @objid ("926111d8-4752-49ea-8d40-356348e3f2ad")
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
    @objid ("6b522557-dc4b-41c4-ae72-a014881fa077")
    public void setRelationshipOperation(final String value) {
        this.elt.setProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                             TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT, value));
    }

    @objid ("216c9727-2a4d-4971-8fc3-a944157d0fec")
    protected  TExportedOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1df416b6-4875-493d-91d4-e22b134976c6")
    public static final class MdaTypes {
        @objid ("94fc2975-dd22-4669-b702-6458ebf4dd19")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("94217ce6-48d8-4d5f-b839-39c4e171f955")
        public static PropertyDefinition NODEOPERATION_PROPERTY_ELT;

        @objid ("16a67795-e1c9-429c-8f04-ab6e60e3b592")
        public static PropertyDefinition RELATIONSHIPOPERATION_PROPERTY_ELT;

        @objid ("b70a3a64-3dff-49c7-89ce-fccff68b7e1c")
        public static PropertyDefinition PLAN_PROPERTY_ELT;

        @objid ("db665627-fe23-4d70-9efa-f6ee75e7a97d")
        private static Stereotype MDAASSOCDEP;

        @objid ("b73fafd5-91de-4531-91cb-83fde4159ea4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("328e3e6f-6b38-4a4f-8591-d44b3b83bf80")
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

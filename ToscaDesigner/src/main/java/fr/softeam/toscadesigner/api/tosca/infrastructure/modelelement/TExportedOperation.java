/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 18:02 by Modelio Studio.
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
    @objid ("3b8590bc-ee64-44fd-8034-c5146aa4f6f2")
    public static final String STEREOTYPE_NAME = "TExportedOperation";

    @objid ("c13ca93f-67d7-4235-951b-479db61412e1")
    public static final String NODEOPERATION_PROPERTY = "nodeOperation";

    @objid ("d6f115c2-d587-4667-a0ae-dc764380d290")
    public static final String PLAN_PROPERTY = "plan";

    @objid ("e1347dcf-02f7-43c8-9dd7-b4148ebf974f")
    public static final String RELATIONSHIPOPERATION_PROPERTY = "relationshipOperation";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("b472b710-d0de-4beb-88d0-5a4c0415fa88")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExportedOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExportedOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("681d22a3-1524-4d2b-85e2-bb129e424c67")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExportedOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExportedOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExportedOperation >> then instantiate a {@link TExportedOperation} proxy.
     * 
     * @return a {@link TExportedOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("ada5df7b-98b0-4f43-a75c-11f8d23977c3")
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
    @objid ("5aaa853a-61a0-4ec1-85aa-57e2ee3cadb8")
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
    @objid ("abd40c74-cd9a-4e00-8691-0c43e868c707")
    public static TExportedOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExportedOperation.canInstantiate(obj))
        	return new TExportedOperation(obj);
        else
        	throw new IllegalArgumentException("TExportedOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5d413a58-d0b5-410c-b4b5-3e50988900ab")
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
    @objid ("f8d35e0a-38c1-416b-aa13-fec969c636ce")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TExportedOperation.nodeOperation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8a719880-bd14-4f3e-9c2f-675814663448")
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
    @objid ("dd8908be-96f9-4735-903b-e4b3140fb2b3")
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
    @objid ("43a1370f-717d-44c8-9e13-1867af9e9a30")
    public String getRelationshipOperation() {
        String value = this.elt.getProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                                            TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("3d52d9e0-a81d-4843-9a7d-217bdf445952")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TExportedOperation.nodeOperation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("73e695a3-e884-4795-b4ee-8f4394fb6652")
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
    @objid ("0b160b7f-ad8c-424f-a7bd-a89aff613ef2")
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
    @objid ("bf499f29-1547-4af7-b4d7-83704c8f5420")
    public void setRelationshipOperation(final String value) {
        this.elt.setProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                             TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT, value));
    }

    @objid ("f56c4b40-b781-4927-895f-adf28378b8df")
    protected  TExportedOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1df416b6-4875-493d-91d4-e22b134976c6")
    public static final class MdaTypes {
        @objid ("9e531522-9ad5-4f58-b4c5-edd9702408fc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("78c8765d-9cf3-4f9d-8d5c-b518f2bbc861")
        public static PropertyDefinition NODEOPERATION_PROPERTY_ELT;

        @objid ("91c46d78-17a3-4d1f-b06d-1e89066458f8")
        public static PropertyDefinition RELATIONSHIPOPERATION_PROPERTY_ELT;

        @objid ("61957ba9-b6f4-48b9-bf24-2c425f6ba46a")
        public static PropertyDefinition PLAN_PROPERTY_ELT;

        @objid ("5528f81a-1210-43da-9c9f-9044cdf42297")
        private static Stereotype MDAASSOCDEP;

        @objid ("be4a7d2e-114c-47b7-9808-8272ea0c75fb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7ac3ad9d-78a0-4d27-a43e-3ca3d5624b6c")
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

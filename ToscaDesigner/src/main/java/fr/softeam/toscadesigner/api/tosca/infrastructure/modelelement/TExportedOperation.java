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
 * Proxy class to handle a {@link ModelElement} with << TExportedOperation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9a02d852-8149-4e7a-9810-34f4fbb3ebd9")
public class TExportedOperation implements IMdaProxy {
    @objid ("7f82365d-1872-4a71-a601-0c44efe2f038")
    public static final String STEREOTYPE_NAME = "TExportedOperation";

    @objid ("05f00b91-37eb-425e-a91f-a2d30c6cd663")
    public static final String NODEOPERATION_PROPERTY = "nodeOperation";

    @objid ("6aa2c18a-6691-4531-9b66-630043c95353")
    public static final String PLAN_PROPERTY = "plan";

    @objid ("455a24b1-d982-43e1-ac53-0b2125d42ba7")
    public static final String RELATIONSHIPOPERATION_PROPERTY = "relationshipOperation";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6ff53ab6-a709-4666-9e5b-1ef31ccd8bbf")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExportedOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExportedOperation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("56e3f551-305d-4b05-ae02-349ff46e72d5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExportedOperation.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExportedOperation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExportedOperation >> then instantiate a {@link TExportedOperation} proxy.
     * 
     * @return a {@link TExportedOperation} proxy on the created {@link ModelElement}.
     */
    @objid ("60bd766f-b47b-4f0e-ac9f-204f94870cbb")
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
    @objid ("f68178af-8b30-4b32-87cf-7ace7bae880f")
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
    @objid ("ea7b6487-f6c6-4dd2-bbf4-b0d725ce25b7")
    public static TExportedOperation safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExportedOperation.canInstantiate(obj))
        	return new TExportedOperation(obj);
        else
        	throw new IllegalArgumentException("TExportedOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("88ed19ed-cc5a-4590-947c-6809a4ced8c0")
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
    @objid ("c21f3556-ef99-4234-8c9c-64320df7e1ae")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TExportedOperation.nodeOperation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("71d9aa9a-d653-4079-ad80-086eca6b1cc4")
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
    @objid ("f5f57169-2c1b-4a04-bb6f-65cbe6768f33")
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
    @objid ("0831be53-4fd4-4436-bc8e-22c9e67d92b1")
    public String getRelationshipOperation() {
        String value = this.elt.getProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                                            TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("b66c8c51-bdcf-41a8-b831-cb6ab654d3d5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TExportedOperation.nodeOperation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("85922ca5-a81c-41e2-a2f6-e497f72570ca")
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
    @objid ("ceb987f2-ee9b-4b1b-922b-3fcff31365b3")
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
    @objid ("85394d60-1e39-4998-9a68-90f223c8b68d")
    public void setRelationshipOperation(final String value) {
        this.elt.setProperty(TExportedOperation.MdaTypes.STEREOTYPE_ELT,
                             TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExportedOperation.MdaTypes.RELATIONSHIPOPERATION_PROPERTY_ELT, value));
    }

    @objid ("4e640b93-bc6b-430c-a400-2d089d44ffdf")
    protected  TExportedOperation(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("98e1fbf7-15e4-441e-ac22-82a980c932b5")
    public static final class MdaTypes {
        @objid ("6e4ccd8d-1aab-44d6-a316-41768e314442")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("764c2d57-fe7f-4fa6-b5a0-bf912af80d70")
        public static PropertyDefinition NODEOPERATION_PROPERTY_ELT;

        @objid ("45f3dea8-67ff-4bcb-ab26-c3be398bb59c")
        public static PropertyDefinition RELATIONSHIPOPERATION_PROPERTY_ELT;

        @objid ("43459673-fd75-4d26-8896-9e6167a7cf30")
        public static PropertyDefinition PLAN_PROPERTY_ELT;

        @objid ("87caf3c1-a56c-4d7b-a388-94c3b72194a4")
        private static Stereotype MDAASSOCDEP;

        @objid ("1317429c-a95c-4a70-b978-a0238433c3be")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("13900d5f-0f13-4095-bce5-e657b20b5c95")
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

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
 * Proxy class to handle a {@link ModelElement} with << RelationshipOperationType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d6d715d7-d31b-4116-b8b6-7c7ac60e5925")
public class RelationshipOperationType implements IMdaProxy {
    @objid ("f62a079a-f774-43dd-b920-5691e63149a1")
    public static final String STEREOTYPE_NAME = "RelationshipOperationType";

    @objid ("6b9ffe69-92fa-45ef-becb-743b5e4941e6")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("000c2b2f-cdcb-4001-b0d6-95ac75591514")
    public static final String OPERATIONNAME_PROPERTY = "operationName";

    @objid ("2b8284ed-a4db-4ddf-9637-65ad0ff2309b")
    public static final String RELATIONSHIPREF_PROPERTY = "relationshipRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6b2804c1-37d2-443d-855c-99a98fa4ba7e")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7c15a56c-909d-4a4b-9d92-7b349cb79756")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipOperationType >> then instantiate a {@link RelationshipOperationType} proxy.
     * 
     * @return a {@link RelationshipOperationType} proxy on the created {@link ModelElement}.
     */
    @objid ("c2624d39-2f59-40e4-9ef2-cd0bc1c3dabb")
    public static RelationshipOperationType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT);
        return RelationshipOperationType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link RelationshipOperationType} proxy from a {@link ModelElement} stereotyped << RelationshipOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link RelationshipOperationType} proxy or <i>null</i>.
     */
    @objid ("3fe1f3f4-1245-4ee2-bc12-df59a0af502f")
    public static RelationshipOperationType instantiate(final ModelElement obj) {
        return RelationshipOperationType.canInstantiate(obj) ? new RelationshipOperationType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RelationshipOperationType} proxy from a {@link ModelElement} stereotyped << RelationshipOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link RelationshipOperationType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6f768923-3dea-46f9-8f17-2a2716642204")
    public static RelationshipOperationType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RelationshipOperationType.canInstantiate(obj))
        	return new RelationshipOperationType(obj);
        else
        	throw new IllegalArgumentException("RelationshipOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a3078e1e-b004-47ae-8ea0-61644b5144d4")
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
        RelationshipOperationType other = (RelationshipOperationType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("2ead012d-dd2e-423b-a763-cfc7029a3b49")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'RelationshipOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9ec98646-6b75-4820-a0c8-8976de8933e7")
    public String getInterfaceName() {
        String value = this.elt.getProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                                            RelationshipOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = RelationshipOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(RelationshipOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'RelationshipOperationType.operationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("63dd8ff2-6d3d-4499-91dc-969ccfe3c973")
    public String getOperationName() {
        String value = this.elt.getProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                                            RelationshipOperationType.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = RelationshipOperationType.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(RelationshipOperationType.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'RelationshipOperationType.relationshipRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e7fdf79c-c581-42f6-8faf-ad06410cd883")
    public String getRelationshipRef() {
        String value = this.elt.getProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                                            RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("08cb100b-2335-4912-8a96-da4269b6247c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'RelationshipOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("89264364-1d2b-4429-b3a0-4ceaec1d4c2d")
    public void setInterfaceName(final String value) {
        this.elt.setProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipOperationType.MdaTypes.INTERFACENAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'RelationshipOperationType.operationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ec9f1e9c-0f1c-4e3d-9bfb-e36ddae742d1")
    public void setOperationName(final String value) {
        this.elt.setProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipOperationType.MdaTypes.OPERATIONNAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipOperationType.MdaTypes.OPERATIONNAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'RelationshipOperationType.relationshipRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2fe4c6af-e5c3-4b75-836f-ab577f1c4199")
    public void setRelationshipRef(final String value) {
        this.elt.setProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT, value));
    }

    @objid ("2695ab05-9253-4fbb-80e1-7c2eecfc7496")
    protected  RelationshipOperationType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d2653d70-7ca1-49a3-898a-0c17832b88c7")
    public static final class MdaTypes {
        @objid ("9efc426f-337e-4b7c-bb44-af6181be4770")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d1649867-f80d-47e6-9d95-2faebbe3cc47")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("a5498b6d-2b95-43bb-9595-cc9a74587081")
        public static PropertyDefinition OPERATIONNAME_PROPERTY_ELT;

        @objid ("f3647718-b4bb-4fe5-b60e-9d443b2466ab")
        public static PropertyDefinition RELATIONSHIPREF_PROPERTY_ELT;

        @objid ("f26a07b5-cd35-4e9c-a5c2-c94fb9055047")
        private static Stereotype MDAASSOCDEP;

        @objid ("252747fb-d8a0-4318-a832-841b829b33e9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c37a88ef-fa4a-4639-92d7-7e3c9495f953")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "3c72ea09-dd33-44fb-8b15-11129ae48daa", "RelationshipOperationType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "767ef417-6727-4c4b-8e92-adbfb451993a", "interfaceName");
            INTERFACENAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INTERFACENAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "67fdb777-1a5a-4bd9-841a-d3ec36dc32e8", "operationName");
            OPERATIONNAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (OPERATIONNAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "f8e7eab5-146d-42e5-aad3-8be5b2e07868", "relationshipRef");
            RELATIONSHIPREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (RELATIONSHIPREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

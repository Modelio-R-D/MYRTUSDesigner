/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 11:56 by Modelio Studio.
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
@objid ("775c7fc7-b3a5-4ad9-a6c6-17915885c932")
public class RelationshipOperationType implements IMdaProxy {
    @objid ("a8bd6111-a8c3-4a7c-ae1c-fb16eb73ecfb")
    public static final String STEREOTYPE_NAME = "RelationshipOperationType";

    @objid ("f274b2c4-e9ec-4c5d-9757-f299bb4f13fc")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("edc231a7-74f0-4801-a1e9-5e1550907d9d")
    public static final String OPERATIONNAME_PROPERTY = "operationName";

    @objid ("7298cadc-12d3-4b9b-9e1e-0bbc78200a1d")
    public static final String RELATIONSHIPREF_PROPERTY = "relationshipRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("ecab5267-cbaf-4415-9ac6-7166aad38759")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("48511e4e-b047-468c-a2d3-9dcaef00a9db")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipOperationType >> then instantiate a {@link RelationshipOperationType} proxy.
     * 
     * @return a {@link RelationshipOperationType} proxy on the created {@link ModelElement}.
     */
    @objid ("5739dc29-3e11-44ae-8f3e-2f2bb6e5dc98")
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
    @objid ("9c1fbec4-62ab-4d38-8a47-5886d820f9e0")
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
    @objid ("1edd6a64-fc42-4122-9a01-40b04508b756")
    public static RelationshipOperationType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RelationshipOperationType.canInstantiate(obj))
        	return new RelationshipOperationType(obj);
        else
        	throw new IllegalArgumentException("RelationshipOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d3fd06d8-bc50-4eb4-b729-4d7221b52046")
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
    @objid ("8e6c0eec-a6f9-40d2-b3af-1cfdb5bdeb4f")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'RelationshipOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f4b53019-05e7-4744-92ee-71fe265984f3")
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
    @objid ("84f9c31b-c30f-478f-83a5-ea941a0b18f2")
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
    @objid ("791dfe4b-3e17-4158-95b5-596939919932")
    public String getRelationshipRef() {
        String value = this.elt.getProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                                            RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("1f0cd9ba-109d-4d84-b434-a24604f2a8e4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'RelationshipOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f861eb2a-22e7-4774-9dc5-edbc84af3b84")
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
    @objid ("c68f4a91-d26a-40b0-babf-5bafe9ca8af3")
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
    @objid ("f80155b6-01f9-46c5-82ee-40089032fc5c")
    public void setRelationshipRef(final String value) {
        this.elt.setProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT, value));
    }

    @objid ("b4097564-ff64-4fd8-a399-1c952744723a")
    protected  RelationshipOperationType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("e41d38b7-be83-4767-ba9a-be3ecf59e0ec")
    public static final class MdaTypes {
        @objid ("bec0eea4-7817-4aed-8e6e-9ef588d78e9c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("099783d9-c0f6-4363-891d-c723ff1e971e")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("525f8bef-c9eb-4a81-ae92-8acd895e4c11")
        public static PropertyDefinition OPERATIONNAME_PROPERTY_ELT;

        @objid ("9560e4ad-950e-4507-ae3d-016f8202e5b9")
        public static PropertyDefinition RELATIONSHIPREF_PROPERTY_ELT;

        @objid ("5f652bbc-762b-45b9-92dc-005667394521")
        private static Stereotype MDAASSOCDEP;

        @objid ("a0aa217e-f38d-43c6-b8ef-d5382d93772b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a4aec79e-02e0-4f9f-9c7b-be1e07b7763c")
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

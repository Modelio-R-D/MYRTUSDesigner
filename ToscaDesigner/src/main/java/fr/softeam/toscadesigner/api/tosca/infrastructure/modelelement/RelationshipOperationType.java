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
 * Proxy class to handle a {@link ModelElement} with << RelationshipOperationType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d6d715d7-d31b-4116-b8b6-7c7ac60e5925")
public class RelationshipOperationType implements IMdaProxy {
    @objid ("44ef9d58-82ee-4084-93c6-03301b9693e6")
    public static final String STEREOTYPE_NAME = "RelationshipOperationType";

    @objid ("d200fc45-ae5d-402a-a07c-610b5f7f29de")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("9a72f804-a53a-4d6a-95d8-06371db2e2ff")
    public static final String OPERATIONNAME_PROPERTY = "operationName";

    @objid ("5f9a8f5c-46d8-46f1-b4b0-58cb149022e3")
    public static final String RELATIONSHIPREF_PROPERTY = "relationshipRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("4690fb88-e0d6-4ec7-be5f-a66bfebbda88")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("607bc752-4754-4aff-ae48-7236479d3900")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipOperationType >> then instantiate a {@link RelationshipOperationType} proxy.
     * 
     * @return a {@link RelationshipOperationType} proxy on the created {@link ModelElement}.
     */
    @objid ("8899832f-e541-41f6-9dc9-b13d6889df8d")
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
    @objid ("a3918085-b383-41f7-bb41-e5cac791569e")
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
    @objid ("30bc2111-4bf8-4fc7-bb52-e80883a578de")
    public static RelationshipOperationType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RelationshipOperationType.canInstantiate(obj))
        	return new RelationshipOperationType(obj);
        else
        	throw new IllegalArgumentException("RelationshipOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("155e66d5-6bdf-4785-bce8-5d2aa5e153e3")
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
    @objid ("e357dd5b-bc94-491a-9f8d-9ffe838d6628")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'RelationshipOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a21f557d-0a22-4b11-a554-0f54a262c01c")
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
    @objid ("fc69d011-df42-4810-8993-89abcec1a19d")
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
    @objid ("b9fa5268-4acb-4c90-95cb-8ffaea57bf14")
    public String getRelationshipRef() {
        String value = this.elt.getProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                                            RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("d45e570c-11b5-4988-ac70-3c5626a235e7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'RelationshipOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3bbc9d04-6916-423a-9558-687f2b92588e")
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
    @objid ("23a1a57a-820a-40fa-9612-0c3496256868")
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
    @objid ("a1e881d2-fb8e-470d-8d10-28c3e09c44c9")
    public void setRelationshipRef(final String value) {
        this.elt.setProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT, value));
    }

    @objid ("ce209072-4124-4eb6-9e1d-708f07c6fdf3")
    protected  RelationshipOperationType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d2653d70-7ca1-49a3-898a-0c17832b88c7")
    public static final class MdaTypes {
        @objid ("ce330a73-da09-47fb-9aed-f4d337cb7913")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("482d75ff-7a28-45ed-9c26-7e93006a7612")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("178baf18-4bd3-46a3-a0d9-8f301e9a351e")
        public static PropertyDefinition OPERATIONNAME_PROPERTY_ELT;

        @objid ("61af877c-fbe3-4d4a-a102-c96838ee02db")
        public static PropertyDefinition RELATIONSHIPREF_PROPERTY_ELT;

        @objid ("f9400699-86b5-496d-ac22-3ec64d9af683")
        private static Stereotype MDAASSOCDEP;

        @objid ("5ffaf169-c964-4de9-9c7a-a81955f9993c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9804f619-6ac4-4882-afc7-8ede4d429107")
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

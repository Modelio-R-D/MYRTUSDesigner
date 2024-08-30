/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 17:54 by Modelio Studio.
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
@objid ("a13e69de-c5c4-4f38-8c40-b7735519cd64")
public class RelationshipOperationType implements IMdaProxy {
    @objid ("463a115c-f019-4101-a4ee-35348640fb5e")
    public static final String STEREOTYPE_NAME = "RelationshipOperationType";

    @objid ("ddd55566-a278-48dc-88c9-c4079324aebe")
    public static final String INTERFACENAME_PROPERTY = "interfaceName";

    @objid ("113bb379-2b88-43c9-b816-1944fac7264b")
    public static final String OPERATIONNAME_PROPERTY = "operationName";

    @objid ("8e5833b4-a792-454c-ab54-bc5bb0254bd7")
    public static final String RELATIONSHIPREF_PROPERTY = "relationshipRef";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("f45d96aa-9f45-4d83-b617-44e0cc7542b9")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c1665a0f-2f1a-4af0-8e05-f76322d12438")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipOperationType >> then instantiate a {@link RelationshipOperationType} proxy.
     * 
     * @return a {@link RelationshipOperationType} proxy on the created {@link ModelElement}.
     */
    @objid ("a090d764-78ae-4c67-af25-bbc0041088eb")
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
    @objid ("8cc4a8a5-743f-44ab-8e3c-59fd3d166dd3")
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
    @objid ("be3546ad-9f12-460d-866b-7bfaeb700a3e")
    public static RelationshipOperationType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RelationshipOperationType.canInstantiate(obj))
        	return new RelationshipOperationType(obj);
        else
        	throw new IllegalArgumentException("RelationshipOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("925f4e44-3923-47d7-92a3-7dd334aeac36")
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
    @objid ("c6437a65-87cd-49b7-9955-f0a69fb357f3")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'RelationshipOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("324462ba-2881-4549-b34f-c97cf504146d")
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
    @objid ("64adfb51-2f4e-4fbd-973b-9e914e163ec1")
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
    @objid ("e852fc5b-2d94-4f1a-902a-e9d632f93c02")
    public String getRelationshipRef() {
        String value = this.elt.getProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                                            RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("54918002-162b-4450-92df-677ed6cb7fc4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'RelationshipOperationType.interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("de0fc54a-c682-4809-8b8e-4b239746b0c5")
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
    @objid ("d828dc3b-b2bd-4ce6-84fc-e06abb7cc29a")
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
    @objid ("ec866cb7-3326-499c-8f33-fd4123e301de")
    public void setRelationshipRef(final String value) {
        this.elt.setProperty(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT,
                             RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_PROPERTY_ELT, value));
    }

    @objid ("ce512292-f02a-4e09-ac97-f219beb315cc")
    protected  RelationshipOperationType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("47d7c01f-3254-4b6c-85b8-242564072abe")
    public static final class MdaTypes {
        @objid ("e41e8bfe-dcb8-467e-bf7c-c6b84e987d9c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d33c954a-cb8f-4750-a4b3-6ce2da42d114")
        public static PropertyDefinition INTERFACENAME_PROPERTY_ELT;

        @objid ("0ff4efd5-b34a-4438-a875-5d1fa7b382f9")
        public static PropertyDefinition OPERATIONNAME_PROPERTY_ELT;

        @objid ("4dbe8c71-3a97-46df-ba9a-cbca0cf039f7")
        public static PropertyDefinition RELATIONSHIPREF_PROPERTY_ELT;

        @objid ("79519eee-9666-4032-946d-a5c789ffac91")
        private static Stereotype MDAASSOCDEP;

        @objid ("1a30bed1-b72e-4dd5-8ddf-00fd32055e5b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a1df7218-14da-4ec0-9d87-e140ef2e41e6")
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

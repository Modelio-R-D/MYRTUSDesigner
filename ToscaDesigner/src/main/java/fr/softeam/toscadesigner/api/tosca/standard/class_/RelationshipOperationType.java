/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << RelationshipOperationType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("af0136c5-936b-49eb-83f6-fdd603379528")
public class RelationshipOperationType implements IMdaProxy {
    @objid ("c6e04631-2e45-49e3-8312-265cb4ad0699")
    public static final String STEREOTYPE_NAME = "RelationshipOperationType";

    @objid ("b44f3408-174c-40cd-b109-e2a85ecd48e3")
    public static final String INTERFACENAME_TAGTYPE = "interfaceName";

    @objid ("0fd8559c-5511-4cc3-894a-8f89bd020529")
    public static final String OPERATIONNAME_TAGTYPE = "operationName";

    @objid ("56dc3ac8-5210-4f6c-86ae-9d76bf76823f")
    public static final String RELATIONSHIPREF_TAGTYPE = "relationshipRef";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("6ddb94e0-7efe-4915-ac56-9c63bf487630")
    protected final Class elt;

    /**
     * Tells whether a {@link RelationshipOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RelationshipOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9dde3841-f300-4ae9-98f8-7cde769debae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RelationshipOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RelationshipOperationType >> then instantiate a {@link RelationshipOperationType} proxy.
     * 
     * @return a {@link RelationshipOperationType} proxy on the created {@link Class}.
     */
    @objid ("7f91f399-f067-42c9-93d8-20124aedd1ff")
    public static RelationshipOperationType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT);
        return RelationshipOperationType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RelationshipOperationType} proxy from a {@link Class} stereotyped << RelationshipOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RelationshipOperationType} proxy or <i>null</i>.
     */
    @objid ("87b62c5c-ff05-4970-a93b-1974a8f2e2da")
    public static RelationshipOperationType instantiate(final Class obj) {
        return RelationshipOperationType.canInstantiate(obj) ? new RelationshipOperationType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RelationshipOperationType} proxy from a {@link Class} stereotyped << RelationshipOperationType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RelationshipOperationType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b00180c9-385c-4709-849e-3606eac0a79d")
    public static RelationshipOperationType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RelationshipOperationType.canInstantiate(obj))
        	return new RelationshipOperationType(obj);
        else
        	throw new IllegalArgumentException("RelationshipOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a7825648-206a-49c2-bf17-ffe6e63db5f7")
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
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("696fe622-1abf-402f-9c95-f3011a07f73c")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4e2ef603-91ed-4fb4-8507-5eaa972bbdff")
    public String getInterfaceName() {
        return this.elt.getTagValue(RelationshipOperationType.MdaTypes.INTERFACENAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2c9f8703-eca0-4719-96aa-1eb4e6d4e53f")
    public String getOperationName() {
        return this.elt.getTagValue(RelationshipOperationType.MdaTypes.OPERATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'relationshipRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fa06cc4b-d847-4ce7-be3e-0c04ea1dd3b0")
    public String getRelationshipRef() {
        return this.elt.getTagValue(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_TAGTYPE_ELT);
    }

    @objid ("34758e39-a774-4d0e-b6d5-d4196a56c5a5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("15d8d969-0e08-4d19-a2cf-c7a444f67980")
    public void setInterfaceName(final String value) {
        this.elt.putTagValue(RelationshipOperationType.MdaTypes.INTERFACENAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("28df9336-80fb-4824-adb8-45b3c2f3e9a1")
    public void setOperationName(final String value) {
        this.elt.putTagValue(RelationshipOperationType.MdaTypes.OPERATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'relationshipRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e055102e-76f4-416e-bcc0-f9baaddb7ddf")
    public void setRelationshipRef(final String value) {
        this.elt.putTagValue(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_TAGTYPE_ELT, value);
    }

    @objid ("03b37372-bc65-45fc-b2ef-666697a372f0")
    protected  RelationshipOperationType(final Class elt) {
        this.elt = elt;
    }

    @objid ("e0604a06-4d25-47ba-a101-606550828bb8")
    public static final class MdaTypes {
        @objid ("69de6ac6-afce-4ac8-a467-f883e7f531ee")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cecc72d6-45f8-471f-b123-12d6f93bbe70")
        public static TagType INTERFACENAME_TAGTYPE_ELT;

        @objid ("a42d7145-e219-44b7-b7bd-12e102cfd1db")
        public static TagType OPERATIONNAME_TAGTYPE_ELT;

        @objid ("f1fd571a-9edc-4746-9faa-d1ad94c45e3e")
        public static TagType RELATIONSHIPREF_TAGTYPE_ELT;

        @objid ("0714efdd-0582-46ff-b3d4-be3acdfcc701")
        private static Stereotype MDAASSOCDEP;

        @objid ("1bf34b69-afdc-4cd5-819b-8cd81a745178")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bcd92594-7067-4d48-8fb2-299fee30a699")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "283533e7-c53c-4104-a644-9d71d040726f", "RelationshipOperationType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "8d6c1c4c-5e1a-4857-8946-843232eea8fc", "interfaceName");
            INTERFACENAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (INTERFACENAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "eaa46eea-ea48-4149-8061-face0d75977f", "operationName");
            OPERATIONNAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (OPERATIONNAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "1a414145-2df0-4161-9346-e7c8330aa304", "relationshipRef");
            RELATIONSHIPREF_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (RELATIONSHIPREF_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/06/2024 17:18 by Modelio Studio.
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
    @objid ("d4a2a379-ac07-4408-ad26-e3b2c6ec8a41")
    public static final String STEREOTYPE_NAME = "RelationshipOperationType";

    @objid ("19ab8fb6-0088-484d-a1f5-4f533c52ae6a")
    public static final String INTERFACENAME_TAGTYPE = "interfaceName";

    @objid ("64b9be4e-fe4f-4c24-81c4-aa09fbd06fe2")
    public static final String OPERATIONNAME_TAGTYPE = "operationName";

    @objid ("b31d7cc8-aeb0-4b9c-8bee-06b80759153f")
    public static final String RELATIONSHIPREF_TAGTYPE = "relationshipRef";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("77a3e280-9bc5-4110-bdbf-3da9c3bdcc32")
    protected final Class elt;

    /**
     * Tells whether a {@link RelationshipOperationType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RelationshipOperationType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4b5486f1-b896-4d00-9ae0-90d31fe850eb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RelationshipOperationType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RelationshipOperationType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RelationshipOperationType >> then instantiate a {@link RelationshipOperationType} proxy.
     * 
     * @return a {@link RelationshipOperationType} proxy on the created {@link Class}.
     */
    @objid ("de06dec4-e53f-4fe0-ad63-d4dc12c66c86")
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
    @objid ("5e003618-4ada-4d55-bc88-2c8ffd99b8bd")
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
    @objid ("2aaf88a6-3e14-4cc9-9705-68126b0d94ae")
    public static RelationshipOperationType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RelationshipOperationType.canInstantiate(obj))
        	return new RelationshipOperationType(obj);
        else
        	throw new IllegalArgumentException("RelationshipOperationType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("83bc718b-7ca7-44b7-b89b-4cce1dc4c880")
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
    @objid ("4086567f-b5bb-46d4-9bbd-af2649deb014")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("62013ec8-2816-47b4-ab65-bfc06c4b1a9b")
    public String getInterfaceName() {
        return this.elt.getTagValue(RelationshipOperationType.MdaTypes.INTERFACENAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'operationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("52dff1be-69e8-43f9-b7d9-916441f19575")
    public String getOperationName() {
        return this.elt.getTagValue(RelationshipOperationType.MdaTypes.OPERATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'relationshipRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5bda2a66-c5f8-457d-90ee-921ab1348d42")
    public String getRelationshipRef() {
        return this.elt.getTagValue(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_TAGTYPE_ELT);
    }

    @objid ("7acf2e80-653d-4da7-8117-d67b60dee826")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'interfaceName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("af8297eb-1dd1-4fc1-9035-a5b0c4b9e394")
    public void setInterfaceName(final String value) {
        this.elt.putTagValue(RelationshipOperationType.MdaTypes.INTERFACENAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'operationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b702c336-8427-40d5-97d7-a60f4636a81c")
    public void setOperationName(final String value) {
        this.elt.putTagValue(RelationshipOperationType.MdaTypes.OPERATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'relationshipRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("701faca8-eeaf-4054-84f4-c13c6d28357a")
    public void setRelationshipRef(final String value) {
        this.elt.putTagValue(RelationshipOperationType.MdaTypes.RELATIONSHIPREF_TAGTYPE_ELT, value);
    }

    @objid ("c1061c9f-a1b1-4483-98f2-d81f645b13f2")
    protected  RelationshipOperationType(final Class elt) {
        this.elt = elt;
    }

    @objid ("e0604a06-4d25-47ba-a101-606550828bb8")
    public static final class MdaTypes {
        @objid ("fabfee9b-9a13-4c5b-86e7-3b05ac2c928c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5803825a-8377-4e6c-b08b-38751e3e905f")
        public static TagType INTERFACENAME_TAGTYPE_ELT;

        @objid ("f312134e-e1ac-4cda-940e-461ee02004c7")
        public static TagType OPERATIONNAME_TAGTYPE_ELT;

        @objid ("dfc7fd90-2c7f-42ef-b55b-c4996ad23344")
        public static TagType RELATIONSHIPREF_TAGTYPE_ELT;

        @objid ("1e91ed00-9264-42f2-9ffd-7c6dee4105e4")
        private static Stereotype MDAASSOCDEP;

        @objid ("280856b8-2e46-4109-bfc0-80a94ba25e48")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e00ba231-a8f5-465c-b2eb-8b5fa502a141")
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

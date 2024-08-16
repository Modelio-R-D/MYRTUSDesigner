/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/08/2024 17:44 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRelationshipType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6b3faaaa-a779-463f-bd94-54bb8434422e")
public class TRelationshipType extends TEntityType implements IMdaProxy {
    @objid ("9cc2ff48-cf54-4625-8b17-fa8ae9432cc5")
    public static final String STEREOTYPE_NAME = "TRelationshipType";

    @objid ("6c299df7-81f1-4bcb-8be1-8a6ca53b6581")
    public static final String INSTANCESTATES_PROPERTY = "instanceStates";

    @objid ("e8ee9e44-18dd-481e-89df-b7d4778b3603")
    public static final String SOURCEINTERFACES_PROPERTY = "sourceInterfaces";

    @objid ("8e13909d-3b50-43b1-b4a3-6dff25b3b155")
    public static final String TARGETINTERFACES_PROPERTY = "targetInterfaces";

    @objid ("ac238a6e-e06a-4f1a-a031-cceefee41d9d")
    public static final String VALIDSOURCE_PROPERTY = "validSource";

    @objid ("093b3981-f807-4286-b262-47ad7d333b76")
    public static final String VALIDTARGET_PROPERTY = "validTarget";

    /**
     * Tells whether a {@link TRelationshipType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRelationshipType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8356cde4-bc7d-47b5-887f-66e5cf495efc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRelationshipType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRelationshipType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRelationshipType >> then instantiate a {@link TRelationshipType} proxy.
     * @return a {@link TRelationshipType} proxy on the created {@link Class}.
     */
    @objid ("6ebe43a5-d328-440f-baa6-de81ea52c4eb")
    public static TRelationshipType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRelationshipType.MdaTypes.STEREOTYPE_ELT);
        return TRelationshipType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRelationshipType} proxy from a {@link Class} stereotyped << TRelationshipType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRelationshipType} proxy or <i>null</i>.
     */
    @objid ("5df73806-50d3-40b2-a105-5d84c915c681")
    public static TRelationshipType instantiate(final Class obj) {
        return TRelationshipType.canInstantiate(obj) ? new TRelationshipType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipType} proxy from a {@link Class} stereotyped << TRelationshipType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRelationshipType} proxy.
     */
    @objid ("ffb6d252-046a-4dde-94aa-8cceec44e64b")
    public static TRelationshipType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRelationshipType.canInstantiate(obj))
            return new TRelationshipType(obj);
        else
            throw new IllegalArgumentException("TRelationshipType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("599b0c34-c464-4594-bc1c-1efdf76bbabc")
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
        TRelationshipType other = (TRelationshipType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("5472ef1b-929c-4556-a629-8590b06d3b83")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TRelationshipType.instanceStates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("10ed1540-0edc-415b-93de-b0d0d5ae47ed")
    public String getInstanceStates() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.INSTANCESTATES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.INSTANCESTATES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.INSTANCESTATES_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TRelationshipType.sourceInterfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dff6d474-70d3-444b-ad3e-29960dfa8c7c")
    public String getSourceInterfaces() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.SOURCEINTERFACES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.SOURCEINTERFACES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.SOURCEINTERFACES_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TRelationshipType.targetInterfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7b27af9e-6762-45e3-bbb5-84f469262cc2")
    public String getTargetInterfaces() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.TARGETINTERFACES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.TARGETINTERFACES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.TARGETINTERFACES_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TRelationshipType.validSource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("755a42b2-0165-4a54-8574-37b2847a909a")
    public String getValidSource() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TRelationshipType.validTarget'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1e5dd070-2559-49cb-9717-45d896e707f7")
    public String getValidTarget() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value, this.elt);
    }

    @objid ("4240d3d1-ae6d-48b8-804c-bf6972ab8a0e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TRelationshipType.instanceStates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fd6e0694-a58b-44ea-9dcf-e989cd07f77f")
    public void setInstanceStates(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.INSTANCESTATES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.INSTANCESTATES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRelationshipType.sourceInterfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("01ae3164-1293-4780-b27d-b92a649d4692")
    public void setSourceInterfaces(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.SOURCEINTERFACES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.SOURCEINTERFACES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRelationshipType.targetInterfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("85e77e91-fe10-4975-9c5e-3fd014602180")
    public void setTargetInterfaces(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.TARGETINTERFACES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.TARGETINTERFACES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRelationshipType.validSource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f9503984-6b42-4357-a559-2c3d2ba60ac0")
    public void setValidSource(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRelationshipType.validTarget'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2a5ee7c6-8c6f-4b50-8c03-ef8dcebc0dbb")
    public void setValidTarget(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value));
    }

    @objid ("919a4b6d-8e4e-4c64-b3a2-ca3e8608d03a")
    protected  TRelationshipType(final Class elt) {
        super(elt);
    }

    @objid ("5648dcec-5f2c-4314-8a99-354a7d2f6135")
    public static final class MdaTypes {
        @objid ("1ff231a5-d866-443f-a70e-114841c60a43")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b805e7a6-204c-4449-9967-5a4a4f66bab6")
        public static PropertyDefinition INSTANCESTATES_PROPERTY_ELT;

        @objid ("995f9c78-155c-4410-bc4b-52555a3f7116")
        public static PropertyDefinition SOURCEINTERFACES_PROPERTY_ELT;

        @objid ("0fb500e4-d08e-4c75-9786-34bfaf5fbc06")
        public static PropertyDefinition TARGETINTERFACES_PROPERTY_ELT;

        @objid ("76988af2-cfe3-4b68-b65d-98c2e822fe53")
        public static PropertyDefinition VALIDSOURCE_PROPERTY_ELT;

        @objid ("ea0e917a-22f7-4300-8efd-91f3ad7bb43e")
        public static PropertyDefinition VALIDTARGET_PROPERTY_ELT;

        @objid ("49d034b9-daf7-495d-bdbf-457aab5cc10e")
        private static Stereotype MDAASSOCDEP;

        @objid ("67aadbe7-8e27-4314-93ac-3affd5d0802e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d3554c4-e170-44df-84aa-43237093e392")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1b11c098-c9e5-4e5d-beca-3351909bc6ce", "TRelationshipType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "f5bc71d2-5d77-4cfc-95ed-80e669e045f8", "instanceStates");
            INSTANCESTATES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INSTANCESTATES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "2c743775-6130-4f0c-9772-c3381999bee6", "sourceInterfaces");
            SOURCEINTERFACES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (SOURCEINTERFACES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "8a73aa8f-3fde-4179-ab99-10bd09c7d073", "targetInterfaces");
            TARGETINTERFACES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TARGETINTERFACES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "45379b77-5fd9-43cb-b609-d61f124d9ff5", "validSource");
            VALIDSOURCE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALIDSOURCE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "2d6ef097-9a0f-47f3-87aa-5c168780ff23", "validTarget");
            VALIDTARGET_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALIDTARGET_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

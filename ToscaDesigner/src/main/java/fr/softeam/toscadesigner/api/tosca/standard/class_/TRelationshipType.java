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
 * Proxy class to handle a {@link Class} with << TRelationshipType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("68169ae9-570b-4bd2-9cd8-e946110381b2")
public class TRelationshipType extends TEntityType implements IMdaProxy {
    @objid ("45016424-4141-4edd-96e0-4f8683366064")
    public static final String STEREOTYPE_NAME = "TRelationshipType";

    @objid ("603005bd-0ef8-4806-87e9-608a563bac11")
    public static final String INSTANCESTATES_PROPERTY = "instanceStates";

    @objid ("2a032ee8-5ae7-4912-8a1b-06c10146accd")
    public static final String SOURCEINTERFACES_PROPERTY = "sourceInterfaces";

    @objid ("29db5da3-cf04-407d-a3b9-f6ae518b3757")
    public static final String TARGETINTERFACES_PROPERTY = "targetInterfaces";

    @objid ("730b0c93-7611-4453-908f-75ee82334c12")
    public static final String VALIDSOURCE_PROPERTY = "validSource";

    @objid ("49b91b62-c589-46c2-8fc2-a5f7f43f7900")
    public static final String VALIDTARGET_PROPERTY = "validTarget";

    /**
     * Tells whether a {@link TRelationshipType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRelationshipType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e2d495b5-0402-450a-8795-4c49a3923e5c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRelationshipType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRelationshipType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRelationshipType >> then instantiate a {@link TRelationshipType} proxy.
     * 
     * @return a {@link TRelationshipType} proxy on the created {@link Class}.
     */
    @objid ("9dd561b8-86f6-4005-9adf-1ff4ceabf965")
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
    @objid ("44442548-78bf-4e6b-9a2a-e45f9b3f641f")
    public static TRelationshipType instantiate(final Class obj) {
        return TRelationshipType.canInstantiate(obj) ? new TRelationshipType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipType} proxy from a {@link Class} stereotyped << TRelationshipType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRelationshipType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("239e4d84-b82d-427a-a5ff-bd432b22182e")
    public static TRelationshipType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRelationshipType.canInstantiate(obj))
        	return new TRelationshipType(obj);
        else
        	throw new IllegalArgumentException("TRelationshipType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2de0ec68-dff6-4cf9-9884-bfbdd34e43b6")
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
    @objid ("417ae9e4-671c-4694-aa87-bc0dcaf2676d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TRelationshipType.instanceStates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4bd159c8-d03f-4911-aed3-096261594112")
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
    @objid ("c4efe7cc-e8f8-4dba-b206-656d8ced8b6a")
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
    @objid ("d402c24e-c8a3-48d9-8eff-49d2201644f7")
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
    @objid ("3cd9a9ee-f08d-4ee7-be6c-6ebe8ac0a83f")
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
    @objid ("0e26add2-c34e-451e-a7a6-6a8f948cbcd3")
    public String getValidTarget() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("ccb106d0-46b2-49c0-981d-6f0aef81051d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRelationshipType.instanceStates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("672d5d84-fcd0-4bac-90ec-03561bae2355")
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
    @objid ("8f08a72b-6f75-42c9-ab99-7df13d44abb1")
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
    @objid ("dca99289-c03e-4302-a07e-4de03b206252")
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
    @objid ("3281cba3-dfd0-428e-8c70-e77c329ccc37")
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
    @objid ("2185b669-5be5-4a27-9a54-9b47c9dbd5a0")
    public void setValidTarget(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value));
    }

    @objid ("b64bab2f-0325-4b02-ad28-b037a344bf3b")
    protected  TRelationshipType(final Class elt) {
        super(elt);
    }

    @objid ("09d12a81-ee70-43ac-b0e2-976fa052dc8a")
    public static final class MdaTypes {
        @objid ("4a0a6737-17d2-44fe-9d10-c42ffc4b9e5c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("97536693-ce31-46ea-8286-d178903dd5fb")
        public static PropertyDefinition INSTANCESTATES_PROPERTY_ELT;

        @objid ("3e22ef58-f94a-4603-acb2-6bfbbd5f9633")
        public static PropertyDefinition SOURCEINTERFACES_PROPERTY_ELT;

        @objid ("554eb792-897a-4a69-b00d-d94938bff2d1")
        public static PropertyDefinition TARGETINTERFACES_PROPERTY_ELT;

        @objid ("4138b162-c9c5-4fe0-a40b-fe7d8f49e346")
        public static PropertyDefinition VALIDSOURCE_PROPERTY_ELT;

        @objid ("2674abd8-aca3-4d59-be21-78908c36d431")
        public static PropertyDefinition VALIDTARGET_PROPERTY_ELT;

        @objid ("5aac0d5e-9360-4c0b-9e62-38145d014382")
        private static Stereotype MDAASSOCDEP;

        @objid ("c75c20fe-675b-4dc8-ac6f-2c70417b510f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8f8cb851-f412-4156-809c-f967cd6fdf6b")
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

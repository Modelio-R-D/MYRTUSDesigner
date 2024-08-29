/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 28/08/2024 17:14 by Modelio Studio.
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
@objid ("958fadb2-534c-4612-b8bd-126e26ed98ae")
public class TRelationshipType extends TEntityType implements IMdaProxy {
    @objid ("4e214def-61c9-4ba7-977b-4b223e4977b8")
    public static final String STEREOTYPE_NAME = "TRelationshipType";

    @objid ("88257390-853d-4e3a-8251-67d804768abc")
    public static final String INSTANCESTATES_PROPERTY = "instanceStates";

    @objid ("ef874bf2-a3c1-4ddc-85aa-33c761b85ca6")
    public static final String SOURCEINTERFACES_PROPERTY = "sourceInterfaces";

    @objid ("920416a2-063b-45b2-85a4-a3f5d31246b5")
    public static final String TARGETINTERFACES_PROPERTY = "targetInterfaces";

    @objid ("d5b94794-0753-4c0d-a59a-712c384a2d6f")
    public static final String VALIDSOURCE_PROPERTY = "validSource";

    @objid ("f40b9441-f57c-47b4-a43a-fc12886826ab")
    public static final String VALIDTARGET_PROPERTY = "validTarget";

    /**
     * Tells whether a {@link TRelationshipType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRelationshipType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7c838184-3333-4cc3-96ec-5e825c883f29")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRelationshipType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRelationshipType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRelationshipType >> then instantiate a {@link TRelationshipType} proxy.
     * 
     * @return a {@link TRelationshipType} proxy on the created {@link Class}.
     */
    @objid ("a7b7ccf1-75bc-4d88-a2c9-1346b8c7d34b")
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
    @objid ("aba5fcf9-e1eb-495b-bfe6-46d3ed344531")
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
    @objid ("a6462039-ac62-4473-8649-00149de1ba40")
    public static TRelationshipType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRelationshipType.canInstantiate(obj))
        	return new TRelationshipType(obj);
        else
        	throw new IllegalArgumentException("TRelationshipType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8c5a776a-6b9d-41bd-8414-f8357c064632")
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
    @objid ("fad1ef99-a208-46f9-a2e9-1547941481b4")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TRelationshipType.instanceStates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8d33ebcd-7a2a-418c-b97a-decf17eb3fdf")
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
    @objid ("f1aa965b-fc1b-4ce2-82cd-adf545674712")
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
    @objid ("387fde45-7b5b-4058-98e6-4f75333324df")
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
    @objid ("42bd37af-7a75-4d1d-bb8b-ebebb181f1ee")
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
    @objid ("36113a74-0231-4636-b8eb-ce3943ac03a9")
    public String getValidTarget() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("f55c8100-db53-43d2-b62a-b65af2d5e02e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRelationshipType.instanceStates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ac58caec-dda2-4825-8fb3-164e636b8f50")
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
    @objid ("0c4863b2-67f5-4034-abd4-72b47abc9984")
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
    @objid ("75ecb6df-9c08-4773-bf5b-1e7c7fff4848")
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
    @objid ("caf48fa5-50ed-4910-875d-6e5a5c877b98")
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
    @objid ("dcb120f2-e2d5-4a4d-908b-41525a2904d5")
    public void setValidTarget(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value));
    }

    @objid ("25d5d9e0-1791-48ad-a86f-399b1e4590fe")
    protected  TRelationshipType(final Class elt) {
        super(elt);
    }

    @objid ("3bd93b11-3ef2-4171-8d51-f2f7c602caa3")
    public static final class MdaTypes {
        @objid ("2e2293b2-04a9-4eb1-a8e7-a27a7091a8a7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9b7c7315-10ff-4ff2-a73f-5994bbe8949e")
        public static PropertyDefinition INSTANCESTATES_PROPERTY_ELT;

        @objid ("cb2da4fb-0eb7-445a-97e0-5edfa56a3096")
        public static PropertyDefinition SOURCEINTERFACES_PROPERTY_ELT;

        @objid ("0fb7d1ec-a8cb-410d-a784-3acf5fa63cef")
        public static PropertyDefinition TARGETINTERFACES_PROPERTY_ELT;

        @objid ("97fa169a-7599-4f81-908f-818226d2a86f")
        public static PropertyDefinition VALIDSOURCE_PROPERTY_ELT;

        @objid ("839b703b-565b-43a0-846b-3732a91173ec")
        public static PropertyDefinition VALIDTARGET_PROPERTY_ELT;

        @objid ("2f9969e0-f882-4e5d-baa7-e63a7a8c2e14")
        private static Stereotype MDAASSOCDEP;

        @objid ("929ba076-07b9-4a0d-8563-b4f97f7cfed6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9ecce705-9db2-4173-ab15-7676aecd537f")
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

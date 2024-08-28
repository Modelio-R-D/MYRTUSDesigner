/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
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
    @objid ("163e51e8-6236-4926-988e-4773852f7d4d")
    public static final String STEREOTYPE_NAME = "TRelationshipType";

    @objid ("a6a4dc43-c092-4b69-a366-0aa1dbcca851")
    public static final String INSTANCESTATES_PROPERTY = "instanceStates";

    @objid ("497a57e7-46cb-4fbc-866d-2ad805c08f82")
    public static final String SOURCEINTERFACES_PROPERTY = "sourceInterfaces";

    @objid ("8f623e12-66ee-4695-87b5-45e5494ce729")
    public static final String TARGETINTERFACES_PROPERTY = "targetInterfaces";

    @objid ("777ed93e-d634-4b6e-a2d1-0fee61dcfcf4")
    public static final String VALIDSOURCE_PROPERTY = "validSource";

    @objid ("71436c4d-6427-4817-b1e5-737882f56d5a")
    public static final String VALIDTARGET_PROPERTY = "validTarget";

    /**
     * Tells whether a {@link TRelationshipType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRelationshipType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("925f394e-8960-49a1-892c-8a88556624a1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRelationshipType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRelationshipType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRelationshipType >> then instantiate a {@link TRelationshipType} proxy.
     * @return a {@link TRelationshipType} proxy on the created {@link Class}.
     */
    @objid ("12c83380-35c6-4fa0-95be-657622556c1d")
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
    @objid ("30a00cc2-5782-43b3-827c-5f7657485277")
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
    @objid ("a8a85470-abaf-4fc1-9156-7bab9bd771f7")
    public static TRelationshipType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRelationshipType.canInstantiate(obj))
            return new TRelationshipType(obj);
        else
            throw new IllegalArgumentException("TRelationshipType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dc4d5c6d-fb07-4a4c-aebf-f496cb926487")
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
    @objid ("bea8df5a-9d6b-4bf4-8bd6-b8310cb9b54f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TRelationshipType.instanceStates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("64e671c9-840e-4579-ac52-577141108032")
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
    @objid ("5a6a6a81-929e-4820-b1e7-7678b90a6f81")
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
    @objid ("11f33347-92b5-4727-8c64-1f4440ca2364")
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
    @objid ("73fd3dd7-a2f9-4908-ac05-60d93ffcf62a")
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
    @objid ("67354563-d1f6-4f55-90e7-a69f2dc5585d")
    public String getValidTarget() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value, this.elt);
    }

    @objid ("1d922721-466b-49bb-8b97-9ee0354aaaab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TRelationshipType.instanceStates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6b565f18-0d1e-44c5-b3b7-f9c0b0843c9a")
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
    @objid ("0f6b23c2-d1fb-490e-b0b9-0f043a97dd98")
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
    @objid ("50aac3fa-9d84-4e31-b8b3-5b80573ab605")
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
    @objid ("388c55dc-dc74-4c58-86af-c178210fed70")
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
    @objid ("f88c67dd-5dbf-4872-9223-91e5e4d9d974")
    public void setValidTarget(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value));
    }

    @objid ("bdd5f45a-3496-4149-96bb-f039483ccfb3")
    protected  TRelationshipType(final Class elt) {
        super(elt);
    }

    @objid ("3bd93b11-3ef2-4171-8d51-f2f7c602caa3")
    public static final class MdaTypes {
        @objid ("6778c671-d766-4e2e-93a7-ebf5beb3c56d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("319c89a2-86f1-459d-b2ad-dbb3842e6544")
        public static PropertyDefinition INSTANCESTATES_PROPERTY_ELT;

        @objid ("ff1b1f17-f82c-424a-9633-7305d343bc17")
        public static PropertyDefinition SOURCEINTERFACES_PROPERTY_ELT;

        @objid ("acc3e854-309d-42e3-ad1f-14c7060f193c")
        public static PropertyDefinition TARGETINTERFACES_PROPERTY_ELT;

        @objid ("040def65-d4c6-40ed-a108-90585b8fb0f2")
        public static PropertyDefinition VALIDSOURCE_PROPERTY_ELT;

        @objid ("11bb6cf1-e150-4769-83d4-68f4fc99aa13")
        public static PropertyDefinition VALIDTARGET_PROPERTY_ELT;

        @objid ("11b27037-bc07-4712-92ba-357556b1c5bd")
        private static Stereotype MDAASSOCDEP;

        @objid ("735402f8-9713-4ab7-b262-a6f01be4033e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("275461e5-e52a-4cab-bfb0-297c170cff20")
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

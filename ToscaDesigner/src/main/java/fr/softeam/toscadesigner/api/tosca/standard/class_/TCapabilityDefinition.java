/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 20/08/2024 17:06 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TCapabilityDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("41a95e52-46f8-4246-827b-e57d6ca4d930")
public class TCapabilityDefinition implements IMdaProxy {
    @objid ("de6e8324-a5eb-4d20-8d93-6ee9117ef1ff")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinition";

    @objid ("917fe987-6ac8-4a92-89af-d1a8238a9ac1")
    public static final String CAPABILITYTYPE_PROPERTY = "capabilityType";

    @objid ("3c5b5400-99de-4a8d-94c1-d805b3b8b4d5")
    public static final String CONSTRAINTS_PROPERTY = "constraints";

    @objid ("d3f1d865-bf1a-4933-b0c7-fe2bca90c4ac")
    public static final String LOWERBOUND_PROPERTY = "lowerBound";

    @objid ("52b4d8e0-ee40-4068-bc9b-e9b45a82a332")
    public static final String UPPERBOUND_PROPERTY = "upperBound";

    @objid ("1346a99f-03cd-4cd2-a52a-b9228c11e8c0")
    public static final String VALID_SOURCE_TYOES_PROPERTY = "valid_source_tyoes";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("2264d4c9-9a76-40fb-a138-c50141f2ce19")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapabilityDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("25338615-9a36-4661-8d01-811da29a2920")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinition >> then instantiate a {@link TCapabilityDefinition} proxy.
     * 
     * @return a {@link TCapabilityDefinition} proxy on the created {@link Class}.
     */
    @objid ("ad697806-bd7e-496a-ba54-91db7b544344")
    public static TCapabilityDefinition create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityDefinition.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinition} proxy from a {@link Class} stereotyped << TCapabilityDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TCapabilityDefinition} proxy or <i>null</i>.
     */
    @objid ("7630f617-044a-4d6b-9a9e-02d4d358b521")
    public static TCapabilityDefinition instantiate(final Class obj) {
        return TCapabilityDefinition.canInstantiate(obj) ? new TCapabilityDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinition} proxy from a {@link Class} stereotyped << TCapabilityDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapabilityDefinition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("17cd1e10-8a59-407e-b4aa-2b84149e6cdd")
    public static TCapabilityDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityDefinition.canInstantiate(obj))
        	return new TCapabilityDefinition(obj);
        else
        	throw new IllegalArgumentException("TCapabilityDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3764eec4-bfd2-45b7-ba21-00ecafc89631")
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
        TCapabilityDefinition other = (TCapabilityDefinition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TCapabilityDefinition.capabilityType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("81c2f358-19fd-4770-a527-302b0a788399")
    public String getCapabilityType() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TCapabilityDefinition.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cdc059ff-b8b7-4aa2-8896-080b3fec7b7d")
    public String getConstraints() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("be4f3d70-6365-4320-a709-95a98ef0a3b3")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TCapabilityDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("031a8f6f-d435-46df-b66f-dddc9cf2bb13")
    public Integer getLowerBound() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (Integer) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TCapabilityDefinition.upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c3c02c21-cb1e-411c-86f2-107d5a996888")
    public Integer getUpperBound() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (Integer) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TCapabilityDefinition.valid_source_tyoes'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d2c4e7da-7c22-4d3d-ae78-24c360d73c32")
    public String getValid_source_tyoes() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("253c280b-af4b-4b48-a840-42df92a9c932")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TCapabilityDefinition.capabilityType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("60bf4a95-0e26-47ba-b238-095c185abe0c")
    public void setCapabilityType(final String value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a5fee562-f85a-4349-891c-7e39b91a88e5")
    public void setConstraints(final String value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("40771bfa-d340-4190-8554-8acb7fcaf9ff")
    public void setLowerBound(final Integer value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1142c1aa-7afb-4a80-acc4-3332a3feda56")
    public void setUpperBound(final Integer value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.valid_source_tyoes'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5025d20e-1ed2-4041-ab9d-fa2cd78f9ddd")
    public void setValid_source_tyoes(final String value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.VALID_SOURCE_TYOES_PROPERTY_ELT, value));
    }

    @objid ("56557011-a918-4c07-90ba-f57cbc5f03cf")
    protected  TCapabilityDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("6284fbac-8b8f-4c64-8599-1cbd0058d637")
    public static final class MdaTypes {
        @objid ("1b4e4788-31b7-4d6c-8d84-ca6cffe84549")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4efd4d09-e557-4489-a6d5-7946844ca5d8")
        public static PropertyDefinition CONSTRAINTS_PROPERTY_ELT;

        @objid ("e6e6da49-26bc-4c0f-b1ac-f6468b93c6ae")
        public static PropertyDefinition CAPABILITYTYPE_PROPERTY_ELT;

        @objid ("07a768f4-3dc0-47b5-af69-118e180f3552")
        public static PropertyDefinition LOWERBOUND_PROPERTY_ELT;

        @objid ("724db4d3-6597-4839-bbb8-710607f2d4fc")
        public static PropertyDefinition UPPERBOUND_PROPERTY_ELT;

        @objid ("8092868b-6322-4234-9da6-996193b27477")
        public static PropertyDefinition VALID_SOURCE_TYOES_PROPERTY_ELT;

        @objid ("c0c44131-0943-40c5-a62b-1dd5f9500303")
        private static Stereotype MDAASSOCDEP;

        @objid ("2377185d-3dd9-456c-960f-5f60bd5975d3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ea3cef1-e53f-4eb4-896c-be906c4f4e78")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "92f8cb40-9498-4759-9c75-6b4df72de355", "TCapabilityDefinition");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "21aae7e2-a2bd-418d-8df8-70c4fa8d4d13", "constraints");
            CONSTRAINTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CONSTRAINTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d92d0b5f-92dc-4ece-8007-afd0ea307098", "capabilityType");
            CAPABILITYTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CAPABILITYTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "2a352928-d0d5-4e77-bbb4-9f69dc69b952", "lowerBound");
            LOWERBOUND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (LOWERBOUND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d94c64cf-02f1-4a6b-a229-35c8b8b6303b", "upperBound");
            UPPERBOUND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (UPPERBOUND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "e012d64d-3433-419e-a7b1-62e1cd38891a", "valid_source_tyoes");
            VALID_SOURCE_TYOES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALID_SOURCE_TYOES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

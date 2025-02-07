/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 06/02/2025 17:32 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TBoundaryDefinitions >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("dad2e1d5-29c0-4099-96c8-1256209e2fa2")
public class TBoundaryDefinitions implements IMdaProxy {
    @objid ("e0c60633-1dc0-465c-b53e-3c0e304aebe0")
    public static final String STEREOTYPE_NAME = "TBoundaryDefinitions";

    @objid ("39570295-e067-4513-8548-222b50f5422d")
    public static final String CAPABILITIES_PROPERTY = "capabilities";

    @objid ("f3b7c753-4952-4f56-9552-79b302aeb640")
    public static final String INTERFACES_PROPERTY = "interfaces";

    @objid ("65098837-9e44-4d67-a45d-8845cf186e74")
    public static final String POLICIES_PROPERTY = "policies";

    @objid ("51468668-677b-468b-985c-88a950e5873a")
    public static final String PROPERTIES_PROPERTY = "properties";

    @objid ("96d2c820-ed84-47a3-bc10-270d5a5842d4")
    public static final String PROPERTYCONSTRAINTS_PROPERTY = "propertyConstraints";

    @objid ("ab1450a2-054a-494e-b827-4f487c2e2b34")
    public static final String REQUIREMENTS_PROPERTY = "requirements";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("58a6d1aa-e0f4-4e25-b51d-4414a93cb109")
    protected final Class elt;

    /**
     * Tells whether a {@link TBoundaryDefinitions proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TBoundaryDefinitions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("068af122-3f97-4c7f-a703-95f3347b49bb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TBoundaryDefinitions >> then instantiate a {@link TBoundaryDefinitions} proxy.
     * 
     * @return a {@link TBoundaryDefinitions} proxy on the created {@link Class}.
     */
    @objid ("121d2d75-aa14-47ae-90bd-6ef239367e2f")
    public static TBoundaryDefinitions create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT);
        return TBoundaryDefinitions.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TBoundaryDefinitions} proxy from a {@link Class} stereotyped << TBoundaryDefinitions >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TBoundaryDefinitions} proxy or <i>null</i>.
     */
    @objid ("cd0a53d6-da4a-4ecf-a4e9-15bf5ba31f1a")
    public static TBoundaryDefinitions instantiate(final Class obj) {
        return TBoundaryDefinitions.canInstantiate(obj) ? new TBoundaryDefinitions(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TBoundaryDefinitions} proxy from a {@link Class} stereotyped << TBoundaryDefinitions >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TBoundaryDefinitions} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cc0abed6-1113-4a38-a189-5140186aabaa")
    public static TBoundaryDefinitions safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TBoundaryDefinitions.canInstantiate(obj))
        	return new TBoundaryDefinitions(obj);
        else
        	throw new IllegalArgumentException("TBoundaryDefinitions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("df2a4bc7-6529-4b98-8c05-620109ab7603")
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
        TBoundaryDefinitions other = (TBoundaryDefinitions) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TBoundaryDefinitions.capabilities'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cdaa5ac9-89fc-4bbd-98e2-4d106df9867a")
    public String getCapabilities() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.CAPABILITIES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.CAPABILITIES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.CAPABILITIES_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d51be3e5-cdde-46b3-96f0-d9ab1e83a208")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TBoundaryDefinitions.interfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fde5961d-8769-4fe8-8f74-2eeb57c88a71")
    public String getInterfaces() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.INTERFACES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.INTERFACES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.INTERFACES_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TBoundaryDefinitions.policies'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f63cd498-7235-4bf2-8491-140f993848b2")
    public String getPolicies() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.POLICIES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.POLICIES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.POLICIES_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TBoundaryDefinitions.properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b12c5906-6e13-4858-93c7-a4821b76f6a8")
    public String getProperties() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.PROPERTIES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.PROPERTIES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.PROPERTIES_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TBoundaryDefinitions.propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4361da5c-0496-4c66-94c4-6ed9be7df3e6")
    public String getPropertyConstraints() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TBoundaryDefinitions.requirements'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("061c07c0-cbe9-415f-959a-126a4317f2bd")
    public String getRequirements() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("44f682fd-9285-4f95-90c7-b8ff9513a911")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TBoundaryDefinitions.capabilities'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bcd643b3-c385-4e5d-9988-ccf66b65ebb8")
    public void setCapabilities(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.CAPABILITIES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.CAPABILITIES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TBoundaryDefinitions.interfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("da03dd7f-2b53-464e-bd1c-a3e96bb72173")
    public void setInterfaces(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.INTERFACES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.INTERFACES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TBoundaryDefinitions.policies'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f2265c4d-007c-4359-99ef-96d5947de8b4")
    public void setPolicies(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.POLICIES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.POLICIES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TBoundaryDefinitions.properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("341f5ac4-3612-46a7-a123-f6b9dddb5676")
    public void setProperties(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.PROPERTIES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.PROPERTIES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TBoundaryDefinitions.propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("38d781ef-25fd-4f7f-a115-04e68b06dcf7")
    public void setPropertyConstraints(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TBoundaryDefinitions.requirements'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("226a61d7-a7e9-45cc-8753-5eb6b2af1a3c")
    public void setRequirements(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT, value));
    }

    @objid ("74267914-a36f-48dd-a0f9-536a6dbb8097")
    protected  TBoundaryDefinitions(final Class elt) {
        this.elt = elt;
    }

    @objid ("da28f554-fec4-4de4-afc4-07eaaa4de67d")
    public static final class MdaTypes {
        @objid ("db34afe2-3397-4fd3-a74c-b29e499b2d0b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d5fd0e16-8440-4be5-8a6d-7bcb1d0e0f06")
        public static PropertyDefinition CAPABILITIES_PROPERTY_ELT;

        @objid ("65171139-7b4f-4bc0-a1dc-bc503e8544dd")
        public static PropertyDefinition POLICIES_PROPERTY_ELT;

        @objid ("5c2bbb02-c6f3-4c73-8140-95b5acccdf3c")
        public static PropertyDefinition INTERFACES_PROPERTY_ELT;

        @objid ("f0c15e9a-1674-4f21-b2b3-6d0eed536361")
        public static PropertyDefinition PROPERTIES_PROPERTY_ELT;

        @objid ("9e721926-fd75-4c7b-b2d3-6a8db69b9f37")
        public static PropertyDefinition PROPERTYCONSTRAINTS_PROPERTY_ELT;

        @objid ("1c16a6d6-bbe8-468e-916d-6d8343edf406")
        public static PropertyDefinition REQUIREMENTS_PROPERTY_ELT;

        @objid ("706cb483-87c3-4d1c-b48f-56459dc8b1b2")
        private static Stereotype MDAASSOCDEP;

        @objid ("b77708b9-cbb6-4dd5-8de1-655c3460d41b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("703f49e1-acdb-4162-8052-7a8c3c6b2115")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "58396175-2147-4077-9121-3076b97cc177", "TBoundaryDefinitions");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "48885793-d0bf-4944-b444-1d80c670a25e", "capabilities");
            CAPABILITIES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CAPABILITIES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "ad6f4ac3-89ca-497c-b59d-9e8554ca12a1", "policies");
            POLICIES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICIES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "c613d901-91a0-4996-96f5-24114a248220", "interfaces");
            INTERFACES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INTERFACES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "f0f2c9dc-4e96-45c4-834d-c67879943170", "properties");
            PROPERTIES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTIES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "faf5f6a2-8d85-4c7c-81c3-0362464a21e6", "propertyConstraints");
            PROPERTYCONSTRAINTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTYCONSTRAINTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "ae3e6fc3-33b6-483c-9ff4-4eb88ac459fc", "requirements");
            REQUIREMENTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIREMENTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

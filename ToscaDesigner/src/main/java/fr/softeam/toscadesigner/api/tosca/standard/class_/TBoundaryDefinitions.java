/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 15:23 by Modelio Studio.
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
    @objid ("93187b60-3a75-4d80-bf18-5dfb42659683")
    public static final String STEREOTYPE_NAME = "TBoundaryDefinitions";

    @objid ("5e9c266f-f72a-4e8a-bf47-8d4922daf63e")
    public static final String CAPABILITIES_PROPERTY = "capabilities";

    @objid ("9986ed20-04b5-43b1-a1d2-0b624fbd607e")
    public static final String INTERFACES_PROPERTY = "interfaces";

    @objid ("6ee0a27f-2845-48c5-8a7b-7088b945c23c")
    public static final String POLICIES_PROPERTY = "policies";

    @objid ("7b2d3e3d-354b-446e-ba49-773605a17b2b")
    public static final String PROPERTIES_PROPERTY = "properties";

    @objid ("bac91f0b-6090-40b1-95b0-53c3f288bdbf")
    public static final String PROPERTYCONSTRAINTS_PROPERTY = "propertyConstraints";

    @objid ("5a652d41-245e-4074-9090-f00aacf514b2")
    public static final String REQUIREMENTS_PROPERTY = "requirements";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("47b738cc-6312-480e-8e46-40081a0cdd04")
    protected final Class elt;

    /**
     * Tells whether a {@link TBoundaryDefinitions proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TBoundaryDefinitions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9cedd5d3-a637-4dc6-89db-3b50705e364f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TBoundaryDefinitions >> then instantiate a {@link TBoundaryDefinitions} proxy.
     * 
     * @return a {@link TBoundaryDefinitions} proxy on the created {@link Class}.
     */
    @objid ("334a0128-efe8-479e-99ff-3ba5ea7d2dab")
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
    @objid ("8fc02a1e-047f-415c-825d-b0e8910afe9d")
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
    @objid ("3eb11ee4-35aa-4d59-bc1f-58864666d36f")
    public static TBoundaryDefinitions safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TBoundaryDefinitions.canInstantiate(obj))
        	return new TBoundaryDefinitions(obj);
        else
        	throw new IllegalArgumentException("TBoundaryDefinitions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7099c0b9-3309-46c0-a32e-e751b4ee43ca")
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
    @objid ("c2f9d461-225e-4c76-97ad-e464f919cea8")
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
    @objid ("a76f74ff-bf58-4c07-9b5f-14a840922569")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TBoundaryDefinitions.interfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7cbf0bf0-5000-48c7-bb33-d7a73013d632")
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
    @objid ("c4fe545c-8a30-4984-bca4-92f462601242")
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
    @objid ("155bfbec-e044-4487-bfcc-f89e8df3038f")
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
    @objid ("151e7193-e8e0-48d6-a917-086ca8fd1344")
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
    @objid ("029554a5-0f7e-441e-980f-982e6105e2c5")
    public String getRequirements() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("d5837212-1d1c-4df0-89bd-c8d1e505331a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TBoundaryDefinitions.capabilities'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6920c948-4607-4ce5-a0cb-83755364e8b0")
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
    @objid ("ca3e532e-9423-4931-9ea8-6f4c3ddca00d")
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
    @objid ("d19d68dd-9d6c-4d57-97dd-2a39fc82c132")
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
    @objid ("85106d59-2eff-458b-b56b-03d74ce64fe0")
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
    @objid ("51528a23-d5ce-4bd7-907e-e24d06616c49")
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
    @objid ("1c2e3e11-4472-4466-9cfa-980085ce9845")
    public void setRequirements(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT, value));
    }

    @objid ("c95758ad-7fa1-463a-b483-f0e55be89725")
    protected  TBoundaryDefinitions(final Class elt) {
        this.elt = elt;
    }

    @objid ("da28f554-fec4-4de4-afc4-07eaaa4de67d")
    public static final class MdaTypes {
        @objid ("c80560d3-a402-498e-8a5a-8ee871e7c96e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b7bcc193-0eba-4c39-a4fc-3e6d0034f9c9")
        public static PropertyDefinition CAPABILITIES_PROPERTY_ELT;

        @objid ("99719c27-5476-4dd0-be0a-48120beb3322")
        public static PropertyDefinition POLICIES_PROPERTY_ELT;

        @objid ("201d424a-9e89-4ee3-a216-07070ee37d00")
        public static PropertyDefinition INTERFACES_PROPERTY_ELT;

        @objid ("62b86774-23d7-4e7b-b9e2-9ec9fa0b0fa6")
        public static PropertyDefinition PROPERTIES_PROPERTY_ELT;

        @objid ("a20c5d73-53e1-4428-940b-d228da35c365")
        public static PropertyDefinition PROPERTYCONSTRAINTS_PROPERTY_ELT;

        @objid ("9d254b11-5c5e-497c-9af3-d0f19ccd576e")
        public static PropertyDefinition REQUIREMENTS_PROPERTY_ELT;

        @objid ("4413aad1-f338-46db-9636-a0cc3205b9f2")
        private static Stereotype MDAASSOCDEP;

        @objid ("ca2c4184-909b-44f3-8e6f-d770d1997188")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("22cb2248-4882-46d2-a4b7-0a00bd8067e6")
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

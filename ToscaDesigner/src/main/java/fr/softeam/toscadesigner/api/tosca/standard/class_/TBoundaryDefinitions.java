/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/09/2024 12:00 by Modelio Studio.
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
@objid ("fe9b903f-681b-4440-8e2d-25254a8d8f18")
public class TBoundaryDefinitions implements IMdaProxy {
    @objid ("b867b583-994d-4a58-ae6b-686360788cb7")
    public static final String STEREOTYPE_NAME = "TBoundaryDefinitions";

    @objid ("5abb6574-1e7e-4671-b1c7-5b1d7843be30")
    public static final String CAPABILITIES_PROPERTY = "capabilities";

    @objid ("5f58e0f7-5c14-4c54-b16d-dc4d99b18038")
    public static final String INTERFACES_PROPERTY = "interfaces";

    @objid ("670fa77c-0483-4d78-9845-b5b4d0e7c0c1")
    public static final String POLICIES_PROPERTY = "policies";

    @objid ("b21b8b4c-193b-4a63-bf9c-ea8b3453079b")
    public static final String PROPERTIES_PROPERTY = "properties";

    @objid ("fc8c6a42-45bd-4334-a1aa-9d2d4ef014e0")
    public static final String PROPERTYCONSTRAINTS_PROPERTY = "propertyConstraints";

    @objid ("c578164e-a864-4a0f-a2e3-8607ed7d107f")
    public static final String REQUIREMENTS_PROPERTY = "requirements";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("506ba194-f2ce-4cb2-ba83-f1941c2661c5")
    protected final Class elt;

    /**
     * Tells whether a {@link TBoundaryDefinitions proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TBoundaryDefinitions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("325d3067-0415-46e6-8f0e-de503bfa2ce9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TBoundaryDefinitions >> then instantiate a {@link TBoundaryDefinitions} proxy.
     * 
     * @return a {@link TBoundaryDefinitions} proxy on the created {@link Class}.
     */
    @objid ("bd16aa6f-0328-43bf-b620-a39ef034999e")
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
    @objid ("773e8ba2-9570-4b98-90b3-190b1951df70")
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
    @objid ("2759e3c5-0248-46f3-a70e-47871bb9598f")
    public static TBoundaryDefinitions safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TBoundaryDefinitions.canInstantiate(obj))
        	return new TBoundaryDefinitions(obj);
        else
        	throw new IllegalArgumentException("TBoundaryDefinitions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("96b314d9-ffd2-4b09-b08a-c0e40173fe94")
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
    @objid ("6b53d1a3-30ee-4f09-94f0-4f65119ad5fa")
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
    @objid ("cf30b409-d6e8-4fcf-8cde-594ad78caf7b")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TBoundaryDefinitions.interfaces'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("90893da2-0ea2-4dac-a3d4-f64f26f309ca")
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
    @objid ("b20cbade-1375-46c0-8084-09c773435d8f")
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
    @objid ("2a26744d-8957-42e0-8fd6-8ccb5ffae884")
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
    @objid ("fdb6ec3d-6fe4-4d84-9b4b-d2728a9ffbbc")
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
    @objid ("7b85135d-fac9-448a-b7f6-dd406d73cfaf")
    public String getRequirements() {
        String value = this.elt.getProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                                            TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("d4c5cd0f-bacd-49aa-a56d-8da3809be13c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TBoundaryDefinitions.capabilities'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e36c3350-1a0b-4b77-834f-aff46d77f17a")
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
    @objid ("0ea1501a-73b1-4af8-b85f-0b4ce171b297")
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
    @objid ("516e6eb4-07a4-4693-bc30-cf0422babdc8")
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
    @objid ("106f9d98-d2e1-408a-8b63-1d572e8ac727")
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
    @objid ("2811cc9a-dd6b-410d-9650-a38e14cd6adc")
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
    @objid ("e68d47ca-7724-4de3-bba7-b1819b15726d")
    public void setRequirements(final String value) {
        this.elt.setProperty(TBoundaryDefinitions.MdaTypes.STEREOTYPE_ELT,
                             TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TBoundaryDefinitions.MdaTypes.REQUIREMENTS_PROPERTY_ELT, value));
    }

    @objid ("8f50b598-6d6f-482a-94db-b44bc69e2399")
    protected  TBoundaryDefinitions(final Class elt) {
        this.elt = elt;
    }

    @objid ("07160264-dfcb-425f-8bc5-007612f4d074")
    public static final class MdaTypes {
        @objid ("364f294d-3a11-4824-9258-f9f5acfbb4db")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("de65abc5-aca0-44fa-ae0b-ae53ea1b826e")
        public static PropertyDefinition CAPABILITIES_PROPERTY_ELT;

        @objid ("99869815-05cc-4a96-b570-6e0a277694a9")
        public static PropertyDefinition POLICIES_PROPERTY_ELT;

        @objid ("599da4d2-e1e6-4fde-a295-e4c16be0ec12")
        public static PropertyDefinition INTERFACES_PROPERTY_ELT;

        @objid ("fe9eafe9-2124-4d2c-ac57-95e2ec2f29ea")
        public static PropertyDefinition PROPERTIES_PROPERTY_ELT;

        @objid ("b66dd0c0-832e-457c-a9c9-b9c6b691ee37")
        public static PropertyDefinition PROPERTYCONSTRAINTS_PROPERTY_ELT;

        @objid ("970b7ead-0017-4549-9080-1b08f4b8eef2")
        public static PropertyDefinition REQUIREMENTS_PROPERTY_ELT;

        @objid ("3ef1fcc2-497a-4696-9200-bec7c15d9fce")
        private static Stereotype MDAASSOCDEP;

        @objid ("74c50883-d6e4-4360-9ab4-7bab655144db")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1330f6d9-31b9-4d43-a2cb-2ca5d9b51331")
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

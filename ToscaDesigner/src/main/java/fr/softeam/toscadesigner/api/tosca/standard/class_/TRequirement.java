/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7441d43a-6384-456d-a82a-7133317114d4")
public class TRequirement implements IMdaProxy {
    @objid ("629e67b5-7911-4708-ac7b-d2c5169b3454")
    public static final String STEREOTYPE_NAME = "TRequirement";

    @objid ("f8f9ab3a-c3f5-4b54-89be-86366d4ab945")
    public static final String CAPABILITY_PROPERTY = "capability";

    @objid ("ef08b0b9-be32-4f07-a7f5-195773596f69")
    public static final String NODE_PROPERTY = "node";

    @objid ("d8fef10c-a956-4b1f-b0fa-246d691fbe16")
    public static final String REQUIREMENTDEF_PROPERTY = "requirementDef";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("e4f59913-68ef-4794-b97a-69093c9b1c9f")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9354e70c-9eaa-45bf-8e3d-50eb5d32f7b9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirement.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirement >> then instantiate a {@link TRequirement} proxy.
     * 
     * @return a {@link TRequirement} proxy on the created {@link Class}.
     */
    @objid ("2e7d3a65-7ccc-4067-8ee8-c41bb7264a10")
    public static TRequirement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRequirement.MdaTypes.STEREOTYPE_ELT);
        return TRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRequirement} proxy from a {@link Class} stereotyped << TRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRequirement} proxy or <i>null</i>.
     */
    @objid ("19dc966c-9d5b-4017-88ae-0e07617bb79b")
    public static TRequirement instantiate(final Class obj) {
        return TRequirement.canInstantiate(obj) ? new TRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirement} proxy from a {@link Class} stereotyped << TRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e049571c-7c25-4971-959c-fd1217f96f33")
    public static TRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirement.canInstantiate(obj))
        	return new TRequirement(obj);
        else
        	throw new IllegalArgumentException("TRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("24164c7c-ad80-447b-9c8d-d79b1523e603")
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
        TRequirement other = (TRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TRequirement.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f768b3a7-7079-4898-b941-e8c8bbcf62cc")
    public String getCapability() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("746b1444-96a8-4c6f-8df2-48d4504c9d6a")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirement.node'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6cf01e30-5d83-4808-9652-2acb9b7d91eb")
    public String getNode() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.NODE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.NODE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.NODE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRequirement.requirementDef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a505fd4e-86de-4df4-8712-257ba1bb7b59")
    public String getRequirementDef() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("fd323416-3e89-4aab-9242-3a1830c6585b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirement.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c80d1862-befe-43a3-b7bd-ea4e14cbb1e7")
    public void setCapability(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirement.node'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5187e4fd-81a3-474f-bdfa-5ebb7e54b433")
    public void setNode(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.NODE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.NODE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirement.requirementDef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2af3a1ae-1d59-481b-b451-2750c82c7606")
    public void setRequirementDef(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT, value));
    }

    @objid ("224a242c-0752-4981-baea-75e49af55968")
    protected  TRequirement(final Class elt) {
        this.elt = elt;
    }

    @objid ("31efaf6b-695c-472a-9430-e6d8d4f1c34a")
    public static final class MdaTypes {
        @objid ("2a624ea6-eb1e-4a37-a478-26edd33d40a8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("77d6279d-3c5c-41ff-995b-1a71f3dd69bf")
        public static PropertyDefinition REQUIREMENTDEF_PROPERTY_ELT;

        @objid ("5c88d427-dec4-4e3b-b488-783c7ab92679")
        public static PropertyDefinition NODE_PROPERTY_ELT;

        @objid ("eca2e316-844b-474a-ab66-ecf24906a2de")
        public static PropertyDefinition CAPABILITY_PROPERTY_ELT;

        @objid ("8701c00f-129f-4292-a865-a4f4f88bd6f4")
        private static Stereotype MDAASSOCDEP;

        @objid ("733e1e31-48bf-4878-b313-617daf07a441")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("299ca799-367e-432d-b833-2b74e1dcb3e2")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2a38f650-7f59-41a7-a928-ac9cbe326f84", "TRequirement");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "95a52b2f-43dd-469a-b6da-a187ef6573a1", "requirementDef");
            REQUIREMENTDEF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIREMENTDEF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "9b71e3fd-b9be-40ac-8927-65d4c036620d", "node");
            NODE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NODE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a2fbc97c-1332-41c8-be52-510fbfcb4bf2", "capability");
            CAPABILITY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CAPABILITY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

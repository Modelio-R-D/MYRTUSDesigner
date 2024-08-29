/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 17:58 by Modelio Studio.
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
@objid ("4227ef12-f706-4f1e-bf28-70cf6fdeb36f")
public class TRequirement implements IMdaProxy {
    @objid ("785b37d7-4ee9-4661-82ce-4d3b918b03f4")
    public static final String STEREOTYPE_NAME = "TRequirement";

    @objid ("33ac6ab5-d8f6-4b8f-bc9a-d1d3cd3e8d15")
    public static final String CAPABILITY_PROPERTY = "capability";

    @objid ("a171353e-b662-455a-af84-b9bef2757726")
    public static final String NODE_PROPERTY = "node";

    @objid ("1e1ab4ac-53ef-4512-85a0-8c433d0fdc79")
    public static final String REQUIREMENTDEF_PROPERTY = "requirementDef";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("fe2dbbbf-94e1-44ad-aa2b-cca78ee6e95b")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ce6234f6-19f5-4400-a4cf-e3e0fdeb3c5c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirement.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirement >> then instantiate a {@link TRequirement} proxy.
     * 
     * @return a {@link TRequirement} proxy on the created {@link Class}.
     */
    @objid ("bc217d2a-e137-4794-b2cf-99a5b4901751")
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
    @objid ("6e1a7718-3b61-43e2-a955-513e9372aefb")
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
    @objid ("20a85e34-5522-4da4-9877-77feae7783e7")
    public static TRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirement.canInstantiate(obj))
        	return new TRequirement(obj);
        else
        	throw new IllegalArgumentException("TRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a6a7b11d-2728-4c1e-9dc6-725b4e14b989")
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
    @objid ("45c7d14a-fc24-4636-a70a-f58cd2e488d2")
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
    @objid ("739be4b3-b76e-4356-8fdc-532c6145a2f4")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirement.node'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cde81bc1-51aa-41be-aba5-bd6fe21b7e29")
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
    @objid ("e516bd54-1f2d-4a19-b77d-9501961246ee")
    public String getRequirementDef() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("81007e0b-dac6-4f85-989c-13b18641ea91")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirement.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d9c6b766-7025-421d-8d2c-9fdbfc96689b")
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
    @objid ("108cb91a-4730-465c-b125-5748caf358c2")
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
    @objid ("ac801d3b-bdc1-448c-b67d-03c6ed2c4ac7")
    public void setRequirementDef(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT, value));
    }

    @objid ("6e020258-ff8d-4d9b-9b5d-68d2d6ef4b81")
    protected  TRequirement(final Class elt) {
        this.elt = elt;
    }

    @objid ("330e4713-4f21-4a54-9a2a-3083028517ba")
    public static final class MdaTypes {
        @objid ("c91c7f94-fa0b-47aa-b9e1-1fee27ea8335")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0998e00f-852c-4345-abd6-1f0338a04158")
        public static PropertyDefinition REQUIREMENTDEF_PROPERTY_ELT;

        @objid ("c6b53edf-3821-4fbe-a13a-75f8028a13be")
        public static PropertyDefinition NODE_PROPERTY_ELT;

        @objid ("d82121f9-21e7-49e5-9abc-171310de8215")
        public static PropertyDefinition CAPABILITY_PROPERTY_ELT;

        @objid ("8edd2555-e4f4-41c2-8991-3070e4d73780")
        private static Stereotype MDAASSOCDEP;

        @objid ("e290b2a5-b373-4dd5-becc-33c73aeeb029")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2aed83a1-752b-4312-b581-d590736a0543")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 15:34 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Attribute} with << TRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4227ef12-f706-4f1e-bf28-70cf6fdeb36f")
public class TRequirement implements IMdaProxy {
    @objid ("86702e08-e484-43c2-9455-67197e234b18")
    public static final String STEREOTYPE_NAME = "TRequirement";

    @objid ("f4b975d8-b39e-44cf-a297-e332906eca21")
    public static final String CAPABILITY_PROPERTY = "capability";

    @objid ("6cdef1c9-9a26-4326-93f6-8d03c44c6e13")
    public static final String NODE_PROPERTY = "node";

    @objid ("785b8b17-32e3-42b1-a294-f3769dacb7a7")
    public static final String REQUIREMENTDEF_PROPERTY = "requirementDef";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("eedf9a2c-ab06-47dd-b42c-ad0c2ebb098e")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8226fe2f-4e89-4962-b41a-1e4f90c4550a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TRequirement.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TRequirement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TRequirement >> then instantiate a {@link TRequirement} proxy.
     * 
     * @return a {@link TRequirement} proxy on the created {@link Attribute}.
     */
    @objid ("4d3c069a-b783-428f-87d8-825eef96d399")
    public static TRequirement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(TRequirement.MdaTypes.STEREOTYPE_ELT);
        return TRequirement.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link TRequirement} proxy from a {@link Attribute} stereotyped << TRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link TRequirement} proxy or <i>null</i>.
     */
    @objid ("1014c979-b19e-404f-b0b9-8e6f44b291a9")
    public static TRequirement instantiate(final Attribute obj) {
        return TRequirement.canInstantiate(obj) ? new TRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirement} proxy from a {@link Attribute} stereotyped << TRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c93e4914-657e-4269-8bbc-3d111f17dee3")
    public static TRequirement safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TRequirement.canInstantiate(obj))
        	return new TRequirement(obj);
        else
        	throw new IllegalArgumentException("TRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("14a4c536-7e5c-4c3c-a6d8-7ff2bff8b0be")
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
    @objid ("eebe7db8-c470-4824-9e47-c1d74722694d")
    public String getCapability() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.CAPABILITY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("9626f342-aee4-4bc0-9c45-0b73df985d6f")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirement.node'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("485b18f1-b185-41cd-9899-ce90d2dced9e")
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
    @objid ("bca7983f-4acc-4474-a8dd-dba61eee610c")
    public String getRequirementDef() {
        String value = this.elt.getProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                                            TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("2e2b7928-4db1-41c1-ac17-cf52aca87610")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirement.capability'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f2898e08-158c-4b5c-82a2-8a520be8d4d6")
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
    @objid ("a55cd778-4343-4836-89eb-1e87aba449a3")
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
    @objid ("d4a81514-8373-4bfd-ae22-ba3a0762d7f4")
    public void setRequirementDef(final String value) {
        this.elt.setProperty(TRequirement.MdaTypes.STEREOTYPE_ELT,
                             TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirement.MdaTypes.REQUIREMENTDEF_PROPERTY_ELT, value));
    }

    @objid ("f950d66f-b340-4892-9d35-bb9664cc5d60")
    protected  TRequirement(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("330e4713-4f21-4a54-9a2a-3083028517ba")
    public static final class MdaTypes {
        @objid ("d2251553-e8ef-4cc2-9ac2-36b34e2df774")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3b78b358-1a18-453d-85b4-34c5e861f408")
        public static PropertyDefinition REQUIREMENTDEF_PROPERTY_ELT;

        @objid ("5af7bfbb-1a6a-4f5f-a1df-afca9410f29a")
        public static PropertyDefinition NODE_PROPERTY_ELT;

        @objid ("d26ad9da-3b30-4267-b418-d6c9f925db8e")
        public static PropertyDefinition CAPABILITY_PROPERTY_ELT;

        @objid ("56d5b437-4a0e-4ce3-a568-e5e77b90ae1d")
        private static Stereotype MDAASSOCDEP;

        @objid ("7048e451-c4e2-4129-aa5f-5acdf44f490e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("77216ab7-072c-44d3-bec2-5b5004f59359")
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

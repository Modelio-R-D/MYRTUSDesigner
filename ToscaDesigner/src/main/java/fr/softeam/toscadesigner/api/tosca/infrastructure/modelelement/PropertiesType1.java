/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 17:54 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << PropertiesType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a97b0054-577b-42a2-981d-a4d91daa3e06")
public class PropertiesType1 implements IMdaProxy {
    @objid ("021bc078-3481-4f94-9b08-42a13dcb1d96")
    public static final String STEREOTYPE_NAME = "PropertiesType1";

    @objid ("0d1cd5cb-05ac-4bdd-abdc-d0603615c385")
    public static final String ANY_PROPERTY = "any";

    @objid ("b075111b-a0a8-4217-b036-2d0ecf155d8a")
    public static final String PROPERTYMAPPINGS_PROPERTY = "propertyMappings";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("96b6c64d-391f-4af3-b94d-7cb9e1ff1427")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertiesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertiesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9761518b-582d-4ce9-8621-4d30c130aff9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertiesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertiesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertiesType1 >> then instantiate a {@link PropertiesType1} proxy.
     * 
     * @return a {@link PropertiesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("9e9d829f-854f-456e-8bfe-69c36f5993b0")
    public static PropertiesType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(PropertiesType1.MdaTypes.STEREOTYPE_ELT);
        return PropertiesType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PropertiesType1} proxy from a {@link ModelElement} stereotyped << PropertiesType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PropertiesType1} proxy or <i>null</i>.
     */
    @objid ("9495f5bc-5cea-4c4e-a7ae-ad063f2d1dd1")
    public static PropertiesType1 instantiate(final ModelElement obj) {
        return PropertiesType1.canInstantiate(obj) ? new PropertiesType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertiesType1} proxy from a {@link ModelElement} stereotyped << PropertiesType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PropertiesType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9a269b79-3b98-45c1-bf2f-21d86e013e56")
    public static PropertiesType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertiesType1.canInstantiate(obj))
        	return new PropertiesType1(obj);
        else
        	throw new IllegalArgumentException("PropertiesType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0f47dc60-679e-462e-8a71-5cef2754e5e7")
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
        PropertiesType1 other = (PropertiesType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'PropertiesType1.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9931ef00-8b80-4160-91d7-a06816510f9f")
    public String getAny() {
        String value = this.elt.getProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesType1.MdaTypes.ANY_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesType1.MdaTypes.ANY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesType1.MdaTypes.ANY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("fb0821f3-38a7-4f9d-a087-dcb9a4eb4edd")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertiesType1.propertyMappings'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a84763de-ac23-4ffc-b60a-041089fc304d")
    public String getPropertyMappings() {
        String value = this.elt.getProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("8a0418c7-ae70-4996-b3e1-1164aba53c6e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'PropertiesType1.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("df6c4794-42a5-4f62-9af7-d9f715354d76")
    public void setAny(final String value) {
        this.elt.setProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                             PropertiesType1.MdaTypes.ANY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesType1.MdaTypes.ANY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'PropertiesType1.propertyMappings'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1d20c67b-3ab4-460d-9e8e-e38f6e53e643")
    public void setPropertyMappings(final String value) {
        this.elt.setProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                             PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT, value));
    }

    @objid ("3665160e-c838-4271-a0de-d3f2b8d2ec52")
    protected  PropertiesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("84a373e0-efba-402d-a5e4-32c5aba55759")
    public static final class MdaTypes {
        @objid ("eff60e18-fe47-4068-9d3b-ab63202ce452")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4bf1f8fb-f29f-4499-80dd-b1ec7797af09")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("1b42ff90-12e5-4cff-9bf4-73b1a5f04a7f")
        public static PropertyDefinition PROPERTYMAPPINGS_PROPERTY_ELT;

        @objid ("698ba91e-f1ab-4164-8383-6d36dda2c8e6")
        private static Stereotype MDAASSOCDEP;

        @objid ("1f9d0186-470d-4897-87a7-a425d5d9febd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ea366a19-e29d-46cd-a52a-6a220cb11ddb")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "97773619-3e40-4898-b40d-522ae97cb4a1", "PropertiesType1");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "3638b880-c86d-4f45-97fb-a6406278a98f", "any");
            ANY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ANY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "6877b063-d9da-4d8c-aec0-fa07990b2ba6", "propertyMappings");
            PROPERTYMAPPINGS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTYMAPPINGS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/10/2024 11:39 by Modelio Studio.
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
@objid ("fac649dd-73e5-420f-9e74-418f18d504be")
public class PropertiesType1 implements IMdaProxy {
    @objid ("cbdd56f1-d7b2-4fd2-940f-3ed5be933d39")
    public static final String STEREOTYPE_NAME = "PropertiesType1";

    @objid ("5904e71a-9ab6-4763-8fa3-61953430f15f")
    public static final String ANY_PROPERTY = "any";

    @objid ("4e8bb120-5edb-4dc0-944c-2e91e92aeadc")
    public static final String PROPERTYMAPPINGS_PROPERTY = "propertyMappings";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("f49e7f19-5a27-462b-a892-95f24bacacd5")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertiesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertiesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3c6eb793-7f79-4797-99b0-0d320fd56182")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertiesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertiesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertiesType1 >> then instantiate a {@link PropertiesType1} proxy.
     * 
     * @return a {@link PropertiesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("eae77d62-5d57-41d6-b8b1-b2b094fc25c5")
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
    @objid ("42173040-f926-4c84-9f02-04c775b26242")
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
    @objid ("e124e788-463b-4754-9ebf-e3022b20e5cd")
    public static PropertiesType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertiesType1.canInstantiate(obj))
        	return new PropertiesType1(obj);
        else
        	throw new IllegalArgumentException("PropertiesType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2bad2a97-8af4-457d-b9d8-1905c65b4695")
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
    @objid ("ee84775b-a4b4-4a5d-9450-76c6cdc3e0ce")
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
    @objid ("92518398-856f-49b9-bc95-b98a1fbce74d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertiesType1.propertyMappings'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e7b279bf-4ce2-46d3-8035-f14ce468f6f8")
    public String getPropertyMappings() {
        String value = this.elt.getProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("d9dc7a66-93aa-4a7f-8737-76b502c42aac")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'PropertiesType1.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ce9ae7aa-cf01-43a2-a41e-0adc50e9e197")
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
    @objid ("b54854ba-ddde-426a-a91d-c460d84c75f4")
    public void setPropertyMappings(final String value) {
        this.elt.setProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                             PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT, value));
    }

    @objid ("106f8a8b-17a8-4994-948e-356e66271e70")
    protected  PropertiesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("96cd2aa9-7831-4399-a3c4-6034cc59f844")
    public static final class MdaTypes {
        @objid ("5d286059-7cda-420b-907e-887f7c006672")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("507e2cdc-c5b8-4eca-8eaa-d841575b58d8")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("2c473715-9c30-46c8-a9f1-ccd9a81b61ac")
        public static PropertyDefinition PROPERTYMAPPINGS_PROPERTY_ELT;

        @objid ("8051233c-e8ac-4359-8ab5-597a037a65f7")
        private static Stereotype MDAASSOCDEP;

        @objid ("163cdbfa-2ca4-460e-ad49-60f39bddce80")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("60242c04-9aa6-490a-98ba-bcd1960ed24a")
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

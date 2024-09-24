/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 24/09/2024 16:22 by Modelio Studio.
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
    @objid ("20bc0897-9533-47f6-a32f-823331ed62a5")
    public static final String STEREOTYPE_NAME = "PropertiesType1";

    @objid ("b4b33647-c4d1-4426-831a-d616623c31af")
    public static final String ANY_PROPERTY = "any";

    @objid ("d4113efe-470c-4cef-b440-1dcd76f3fdf4")
    public static final String PROPERTYMAPPINGS_PROPERTY = "propertyMappings";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("cd23191b-d808-4f29-8340-8d05bdd6fe05")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertiesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertiesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fde59b73-4354-432d-a45a-e0f74731d3d9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertiesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertiesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertiesType1 >> then instantiate a {@link PropertiesType1} proxy.
     * 
     * @return a {@link PropertiesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("624e4859-160a-4158-a461-7dde33f4b84a")
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
    @objid ("b3c9c157-de64-48a7-8063-da5e75333689")
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
    @objid ("76e9d768-4fa4-4bbd-8ee1-d77ac9583918")
    public static PropertiesType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertiesType1.canInstantiate(obj))
        	return new PropertiesType1(obj);
        else
        	throw new IllegalArgumentException("PropertiesType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4bd29abb-3999-4ba3-8761-7b21f0a55c12")
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
    @objid ("833c851f-fed2-4766-88ea-fd4bc3cc2d8a")
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
    @objid ("a9dfa6a9-98cc-4982-969e-7c2ae3b74494")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertiesType1.propertyMappings'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f4e82bec-05fd-494c-8023-a2a712ccebeb")
    public String getPropertyMappings() {
        String value = this.elt.getProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("1816c531-15cf-4900-9c3b-febe0373092f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'PropertiesType1.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("547713b2-bd3f-4763-b238-6d3bf8001543")
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
    @objid ("55e4e8a1-ba3f-404a-8961-6423714391fc")
    public void setPropertyMappings(final String value) {
        this.elt.setProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                             PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT, value));
    }

    @objid ("d9314a5e-764a-4a78-ab64-aa4beea30c0b")
    protected  PropertiesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("96cd2aa9-7831-4399-a3c4-6034cc59f844")
    public static final class MdaTypes {
        @objid ("b4d810d6-c0ef-4050-8028-d27d8c9d69bc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9e01e1f6-86ea-4f6f-9dbb-58e118e01270")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("18e74583-b2ef-4ee4-b83a-425b35a77bf9")
        public static PropertyDefinition PROPERTYMAPPINGS_PROPERTY_ELT;

        @objid ("be34a31e-7376-42b7-a768-ed04cbc7db1a")
        private static Stereotype MDAASSOCDEP;

        @objid ("e9f1d2b0-907a-46b8-9003-b57ec38a45f7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bdb4b5d8-087e-4775-9ef9-837a180faaca")
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

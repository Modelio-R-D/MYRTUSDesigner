/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:52 by Modelio Studio.
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
@objid ("7e31de1b-99b5-4348-bf09-f8559af751f2")
public class PropertiesType1 implements IMdaProxy {
    @objid ("8994dd62-7ec8-4686-9577-c86e9107bdb5")
    public static final String STEREOTYPE_NAME = "PropertiesType1";

    @objid ("4d03a2a1-4fdb-4624-b5f1-0ebcc86b57d6")
    public static final String ANY_PROPERTY = "any";

    @objid ("4e25acc7-760d-4619-bd1c-0172a77f97ba")
    public static final String PROPERTYMAPPINGS_PROPERTY = "propertyMappings";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("53ec3648-6e2b-4b75-b4e7-af1cb31323a2")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertiesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertiesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("678297ee-b5b5-41ad-aa09-585b38a69b2b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertiesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertiesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertiesType1 >> then instantiate a {@link PropertiesType1} proxy.
     * 
     * @return a {@link PropertiesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("59f60385-f022-4b73-b4f3-980f15e57de7")
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
    @objid ("f307f583-5c49-444a-94da-d991c44cfcf3")
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
    @objid ("67454825-bfbb-4be8-b638-91755710df3a")
    public static PropertiesType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertiesType1.canInstantiate(obj))
        	return new PropertiesType1(obj);
        else
        	throw new IllegalArgumentException("PropertiesType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1ffd57c8-19d9-44b3-800a-8a5fbe6e13b0")
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
    @objid ("1b8c9b21-9fef-4bf5-9adf-581694674c82")
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
    @objid ("9cd3f696-71b7-4d0c-ab07-bd1b7ae1582a")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertiesType1.propertyMappings'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7ae1d4a3-2222-4792-a5ee-4d87e819b880")
    public String getPropertyMappings() {
        String value = this.elt.getProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                                            PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("a7707036-205f-429c-bf76-adf69bdd6600")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'PropertiesType1.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e32830d2-1eb1-4172-a90e-3779a84c3b00")
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
    @objid ("2a4691cc-b8b7-48bb-97ec-09b1e6b7dc64")
    public void setPropertyMappings(final String value) {
        this.elt.setProperty(PropertiesType1.MdaTypes.STEREOTYPE_ELT,
                             PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertiesType1.MdaTypes.PROPERTYMAPPINGS_PROPERTY_ELT, value));
    }

    @objid ("b26041f7-311b-470a-ac26-2584d2fedfe1")
    protected  PropertiesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("44446820-ad67-4d1a-9ef7-fc517b7487a1")
    public static final class MdaTypes {
        @objid ("fd8e4bb6-e6d3-4bd7-bb68-347d5e65688b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f5101a6c-7eb2-4ade-81cd-ade78cb7eaed")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("97ad78fa-d294-487b-9e57-270d70f80877")
        public static PropertyDefinition PROPERTYMAPPINGS_PROPERTY_ELT;

        @objid ("fa88af1a-7dfa-4ac7-96b3-7fe7a31fabbe")
        private static Stereotype MDAASSOCDEP;

        @objid ("35ae8ce9-27a7-4186-b3b8-b9f29db8b878")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("48e6cb92-d325-40d4-a5f4-cb6c34095a1c")
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

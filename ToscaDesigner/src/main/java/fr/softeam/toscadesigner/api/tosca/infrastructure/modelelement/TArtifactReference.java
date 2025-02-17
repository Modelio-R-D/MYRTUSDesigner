/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 15:39 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TArtifactReference >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2ed29c57-b1fb-4da3-b3f1-7de72d51bd81")
public class TArtifactReference implements IMdaProxy {
    @objid ("f18cd662-d647-4414-b4da-335bcb1bbac6")
    public static final String STEREOTYPE_NAME = "TArtifactReference";

    @objid ("f40f8ead-274e-452e-b3aa-7aaeef558c29")
    public static final String EXCLUDE_PROPERTY = "exclude";

    @objid ("300aa13f-bd0a-44b2-bdd6-687029ac2106")
    public static final String GROUP_PROPERTY = "group";

    @objid ("8c30f213-4da8-48f7-87f3-aee63e05e580")
    public static final String INCLUDE_PROPERTY = "include";

    @objid ("fb7569f9-2c00-4f28-a023-06b5cc93e8e4")
    public static final String REFERENCE_PROPERTY = "reference";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("42a185a7-5b21-4261-b7bb-69ef7ff4c845")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TArtifactReference proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TArtifactReference >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f2e37ec9-6279-49aa-8203-f64bb94b44a7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TArtifactReference.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TArtifactReference.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TArtifactReference >> then instantiate a {@link TArtifactReference} proxy.
     * 
     * @return a {@link TArtifactReference} proxy on the created {@link ModelElement}.
     */
    @objid ("9d94cde0-1d91-43a8-979f-e250c37b2aed")
    public static TArtifactReference create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TArtifactReference.MdaTypes.STEREOTYPE_ELT);
        return TArtifactReference.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TArtifactReference} proxy from a {@link ModelElement} stereotyped << TArtifactReference >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TArtifactReference} proxy or <i>null</i>.
     */
    @objid ("24e22a54-cd2d-45d0-9fe9-1c34ba4958ae")
    public static TArtifactReference instantiate(final ModelElement obj) {
        return TArtifactReference.canInstantiate(obj) ? new TArtifactReference(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TArtifactReference} proxy from a {@link ModelElement} stereotyped << TArtifactReference >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TArtifactReference} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("698e8607-37f8-4f4c-9489-051a68f15902")
    public static TArtifactReference safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TArtifactReference.canInstantiate(obj))
        	return new TArtifactReference(obj);
        else
        	throw new IllegalArgumentException("TArtifactReference: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("232f660a-b668-4131-b3ad-a0506d6d8ecd")
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
        TArtifactReference other = (TArtifactReference) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("8712b09a-68d5-4639-a405-0070e6e4126b")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TArtifactReference.exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f505ec2a-c50b-4957-ab3c-f39f55bac2b2")
    public String getExclude() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TArtifactReference.group'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e5c4b51c-c974-4dfd-9171-7ea29d0d34cf")
    public String getGroup() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TArtifactReference.include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c8ba5aa3-403e-4c48-83dc-40bdbe11d342")
    public String getInclude() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TArtifactReference.reference'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1d6af224-61b1-4553-868d-e5523927b794")
    public String getReference() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("cbe69d6e-5968-4da5-b0dc-b155f63d980b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TArtifactReference.exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a63d1fde-3231-4183-92ca-16991fd23596")
    public void setExclude(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TArtifactReference.group'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5b20eb8d-3d7a-446d-80a5-bd03d9c94d7c")
    public void setGroup(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TArtifactReference.include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f57da620-ce4d-42a7-9af5-26eaa28f6276")
    public void setInclude(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TArtifactReference.reference'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ed95df2f-cf32-4dc4-83c5-8cf857125e0f")
    public void setReference(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT, value));
    }

    @objid ("04eb3426-d8c6-4535-aa23-e88e40b2edcd")
    protected  TArtifactReference(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("7abca64f-9353-44e7-a479-9186cd800b69")
    public static final class MdaTypes {
        @objid ("da6a429c-794d-4956-8067-f7ea84859841")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6c347531-25c6-4d32-851a-183c5d29eeea")
        public static PropertyDefinition REFERENCE_PROPERTY_ELT;

        @objid ("8cb313a8-3e4c-4289-a80f-7a73363b3365")
        public static PropertyDefinition GROUP_PROPERTY_ELT;

        @objid ("38d3819c-a6c4-4a15-8422-b9f0e8aa8c7e")
        public static PropertyDefinition INCLUDE_PROPERTY_ELT;

        @objid ("c4a05685-d2e8-4615-9f4c-2960e7c64de4")
        public static PropertyDefinition EXCLUDE_PROPERTY_ELT;

        @objid ("8026913d-2738-457e-80f5-780a955bd879")
        private static Stereotype MDAASSOCDEP;

        @objid ("8e5febe8-b62f-47f2-a3cc-6a4a736c9ed6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c8ce524f-1a37-40ba-bf67-2ec49973304d")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "53c24e9e-c0ae-4a12-85d4-2841ed84c97f", "TArtifactReference");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b26c714b-31ed-4e47-8998-393302759e77", "reference");
            REFERENCE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REFERENCE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "1aabb42c-63ec-4139-8d3b-3e1ac92bdb57", "group");
            GROUP_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (GROUP_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "50ace3e1-cad2-4eca-87b1-f8158e5f4b61", "include");
            INCLUDE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INCLUDE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a558d040-6e3b-46c9-8fce-7cfd072c9c49", "exclude");
            EXCLUDE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (EXCLUDE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

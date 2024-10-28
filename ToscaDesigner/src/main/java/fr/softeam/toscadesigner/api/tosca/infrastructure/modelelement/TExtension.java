/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 28/10/2024 10:11 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TExtension >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("82da0f2a-c3e3-4215-98f5-63497f7d26c3")
public class TExtension extends TExtensibleElements implements IMdaProxy {
    @objid ("e959b8be-339c-4083-b140-75f697a85db6")
    public static final String STEREOTYPE_NAME = "TExtension";

    @objid ("30eb3d3a-5c5f-4123-86cc-86c29f31adb7")
    public static final String MUSTUNDERSTAND_PROPERTY = "mustUnderstand";

    @objid ("ac4697e1-28ce-431f-8345-af2b5659c505")
    public static final String NAMESPACE_PROPERTY = "namespace";

    /**
     * Tells whether a {@link TExtension proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtension >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("653ba7c8-b902-40a7-b49d-d764931f3a40")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtension.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtension.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtension >> then instantiate a {@link TExtension} proxy.
     * 
     * @return a {@link TExtension} proxy on the created {@link ModelElement}.
     */
    @objid ("79c4aa3f-a9af-42ad-8d30-140eca1796a4")
    public static TExtension create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TExtension.MdaTypes.STEREOTYPE_ELT);
        return TExtension.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TExtension} proxy from a {@link ModelElement} stereotyped << TExtension >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TExtension} proxy or <i>null</i>.
     */
    @objid ("1bac080d-13da-4044-8a13-b012bb605ae7")
    public static TExtension instantiate(final ModelElement obj) {
        return TExtension.canInstantiate(obj) ? new TExtension(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExtension} proxy from a {@link ModelElement} stereotyped << TExtension >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TExtension} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("79108003-6838-4290-88f1-f677a3587b58")
    public static TExtension safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExtension.canInstantiate(obj))
        	return new TExtension(obj);
        else
        	throw new IllegalArgumentException("TExtension: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f8f8336b-51cc-48d2-b0a2-3df4c5e7a769")
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
        TExtension other = (TExtension) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("d4add9a7-d59b-4958-9e33-a0a80f7c4811")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TExtension.mustUnderstand'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b9e464e6-ad77-44b2-a732-7dbcb2282d4c")
    public Boolean getMustUnderstand() {
        String value = this.elt.getProperty(TExtension.MdaTypes.STEREOTYPE_ELT,
                                            TExtension.MdaTypes.MUSTUNDERSTAND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExtension.MdaTypes.MUSTUNDERSTAND_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(TExtension.MdaTypes.MUSTUNDERSTAND_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TExtension.namespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a83057ef-502f-4fda-8b77-46417615c6d5")
    public String getNamespace() {
        String value = this.elt.getProperty(TExtension.MdaTypes.STEREOTYPE_ELT,
                                            TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("c3ff66a1-c295-42f3-91fa-cd60617a72c0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TExtension.mustUnderstand'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2fea7be8-0de8-4848-b02c-af23333b5a5e")
    public void setMustUnderstand(final Boolean value) {
        this.elt.setProperty(TExtension.MdaTypes.STEREOTYPE_ELT,
                             TExtension.MdaTypes.MUSTUNDERSTAND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExtension.MdaTypes.MUSTUNDERSTAND_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TExtension.namespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("44d5587f-81ed-4469-84e8-9b9c818f407d")
    public void setNamespace(final String value) {
        this.elt.setProperty(TExtension.MdaTypes.STEREOTYPE_ELT,
                             TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("96d4298d-3c55-4647-8bcc-b1fdc6d3e6e3")
    protected  TExtension(final ModelElement elt) {
        super(elt);
    }

    @objid ("dc6314de-3141-41ac-9d01-c85250c4d2f6")
    public static final class MdaTypes {
        @objid ("c7118835-d354-4212-ace6-7fd1fe4b8a86")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6ff5ec64-53e5-4194-b0cb-3e630a4d0bf0")
        public static PropertyDefinition MUSTUNDERSTAND_PROPERTY_ELT;

        @objid ("918ee2dc-8311-4190-8235-347a401cd55a")
        public static PropertyDefinition NAMESPACE_PROPERTY_ELT;

        @objid ("562ab9e4-e7e1-49c5-b5f8-15d5b31cef43")
        private static Stereotype MDAASSOCDEP;

        @objid ("659cd061-b008-4e2f-a8f4-d0a6b87d1363")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5c87bb42-4d44-4b50-82df-bfc603c6f6a0")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "262b77fc-703f-47a3-bcb4-450a69892b6b", "TExtension");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b0014ad8-52d8-4261-b2f6-e54df8b5cf6d", "mustUnderstand");
            MUSTUNDERSTAND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (MUSTUNDERSTAND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "c1b05a77-7d8a-4531-a2da-066ff091a6a0", "namespace");
            NAMESPACE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAMESPACE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

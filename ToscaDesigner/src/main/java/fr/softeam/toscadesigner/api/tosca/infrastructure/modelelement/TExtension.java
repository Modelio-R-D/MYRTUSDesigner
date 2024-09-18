/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 13:03 by Modelio Studio.
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
    @objid ("4f5479fc-5520-4c59-8a05-97beac56c406")
    public static final String STEREOTYPE_NAME = "TExtension";

    @objid ("f5b35c8a-0de3-4007-8f40-95b3cb40f820")
    public static final String MUSTUNDERSTAND_PROPERTY = "mustUnderstand";

    @objid ("82caffb6-e716-43bb-b192-6db66e89b7f9")
    public static final String NAMESPACE_PROPERTY = "namespace";

    /**
     * Tells whether a {@link TExtension proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtension >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bbb86f96-3ddf-498d-aa50-5c530bfedb15")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtension.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtension.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtension >> then instantiate a {@link TExtension} proxy.
     * @return a {@link TExtension} proxy on the created {@link ModelElement}.
     */
    @objid ("3ae77276-60ac-404a-b540-00a44aa79d0a")
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
    @objid ("817ba046-fa85-4c40-890a-1a7e70e13f2f")
    public static TExtension instantiate(final ModelElement obj) {
        return TExtension.canInstantiate(obj) ? new TExtension(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExtension} proxy from a {@link ModelElement} stereotyped << TExtension >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TExtension} proxy.
     */
    @objid ("713da550-fe29-4ade-9b90-b3891a67a5d2")
    public static TExtension safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExtension.canInstantiate(obj))
            return new TExtension(obj);
        else
            throw new IllegalArgumentException("TExtension: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("22c5004e-c9ca-4861-89f3-1ca4e5f86fe5")
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
    @objid ("a70ec382-aacb-4994-90f0-14a55e26ef60")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TExtension.mustUnderstand'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b59dff7e-af8d-40f5-8776-91ced33a4ee1")
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
    @objid ("101df2c3-efea-4abe-93cd-17664629c5c6")
    public String getNamespace() {
        String value = this.elt.getProperty(TExtension.MdaTypes.STEREOTYPE_ELT,
                                            TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("5e95841d-bb4e-44ce-be38-6171f6f5a022")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TExtension.mustUnderstand'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2155e021-7ff0-4ce3-8bf7-d505411416c4")
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
    @objid ("26d96190-9f2c-4a24-84c2-a1b43ddf8166")
    public void setNamespace(final String value) {
        this.elt.setProperty(TExtension.MdaTypes.STEREOTYPE_ELT,
                             TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("ee755a93-ea41-4228-9ff8-05df08ec565d")
    protected  TExtension(final ModelElement elt) {
        super(elt);
    }

    @objid ("dc6314de-3141-41ac-9d01-c85250c4d2f6")
    public static final class MdaTypes {
        @objid ("67693df1-5fc2-4c7a-b761-e14af7ce2069")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1f7bf416-df61-4eb3-9e35-f0e8717a1cdb")
        public static PropertyDefinition MUSTUNDERSTAND_PROPERTY_ELT;

        @objid ("0a1190ac-9030-4c3f-9a57-04e0ca86a73d")
        public static PropertyDefinition NAMESPACE_PROPERTY_ELT;

        @objid ("a021220f-ce13-47f7-bca9-d5f434e8cc79")
        private static Stereotype MDAASSOCDEP;

        @objid ("39fc43f1-4cfa-4ad2-81d1-7d1b773a8b3d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("81521e8f-f213-46ef-bcef-13dc72db007c")
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

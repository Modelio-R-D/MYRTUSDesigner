/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 19/09/2024 15:04 by Modelio Studio.
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
    @objid ("9947619d-1c2b-43e4-97f5-5d2223d02622")
    public static final String STEREOTYPE_NAME = "TExtension";

    @objid ("588ce4d6-d783-4e31-9ccd-aa2bc5657cfd")
    public static final String MUSTUNDERSTAND_PROPERTY = "mustUnderstand";

    @objid ("a8db4822-4e4c-4b31-9d9c-d038450f3227")
    public static final String NAMESPACE_PROPERTY = "namespace";

    /**
     * Tells whether a {@link TExtension proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtension >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("de30e11a-6890-46a1-b8a9-e3a49e4935e0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtension.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtension.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtension >> then instantiate a {@link TExtension} proxy.
     * 
     * @return a {@link TExtension} proxy on the created {@link ModelElement}.
     */
    @objid ("fce4ce22-e0b7-4900-9c7b-e14645edae22")
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
    @objid ("bb98a059-63fe-4a5c-8b00-b5f8cf15f3c7")
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
    @objid ("33bad9be-f0c8-4e38-b545-0de302b7a32c")
    public static TExtension safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExtension.canInstantiate(obj))
        	return new TExtension(obj);
        else
        	throw new IllegalArgumentException("TExtension: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("073ef3a2-19f7-40bf-b470-134d46da27f5")
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
    @objid ("0a0dfcc7-5d05-46d1-8a00-55e0970a88f3")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TExtension.mustUnderstand'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d1faefe6-a09f-4670-8235-8b463a28fe91")
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
    @objid ("48c63523-1c71-4d38-bfaf-46dedb0964ce")
    public String getNamespace() {
        String value = this.elt.getProperty(TExtension.MdaTypes.STEREOTYPE_ELT,
                                            TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("f27ad1e8-4cef-4603-8f7e-254c3387325d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TExtension.mustUnderstand'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("58e922ef-02bf-4abf-b052-37f6d44066ed")
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
    @objid ("2c7fc926-07f3-404f-86be-3d10a422f4e9")
    public void setNamespace(final String value) {
        this.elt.setProperty(TExtension.MdaTypes.STEREOTYPE_ELT,
                             TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("75dc7b4b-cfdc-44b2-9982-e9794bd0d0ec")
    protected  TExtension(final ModelElement elt) {
        super(elt);
    }

    @objid ("dc6314de-3141-41ac-9d01-c85250c4d2f6")
    public static final class MdaTypes {
        @objid ("0e62b74e-856c-4d7e-9459-e11debd2d9a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("948b7d7f-6fc5-4e8c-9259-20ae1b4e62fc")
        public static PropertyDefinition MUSTUNDERSTAND_PROPERTY_ELT;

        @objid ("5defe5ef-41eb-4920-9087-8d5abd433984")
        public static PropertyDefinition NAMESPACE_PROPERTY_ELT;

        @objid ("72fcc34c-a348-4d60-83ae-a7684ae85690")
        private static Stereotype MDAASSOCDEP;

        @objid ("0762a822-dbdd-4aab-92ce-a1a6daf8cf3b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5e0d0e5e-70dd-43e9-991c-e98371fb1e18")
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

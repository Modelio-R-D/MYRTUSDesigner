/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 14:25 by Modelio Studio.
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
    @objid ("151ad1bc-930e-42b1-8fdb-c55cee610c85")
    public static final String STEREOTYPE_NAME = "TExtension";

    @objid ("321e644d-f305-4945-9530-476276692e89")
    public static final String MUSTUNDERSTAND_PROPERTY = "mustUnderstand";

    @objid ("243d4114-8c53-4d31-acf3-2c1f840aa807")
    public static final String NAMESPACE_PROPERTY = "namespace";

    /**
     * Tells whether a {@link TExtension proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtension >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("74f735a9-d5d7-43e7-a0ac-a2486d735267")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtension.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtension.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtension >> then instantiate a {@link TExtension} proxy.
     * 
     * @return a {@link TExtension} proxy on the created {@link ModelElement}.
     */
    @objid ("f2f0fccb-a952-4c81-92ab-9289e964b82f")
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
    @objid ("693fabd9-c3e3-4f6b-b8dd-618da26d1c41")
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
    @objid ("656b5ead-d04e-4000-b9fe-1a748e283d4d")
    public static TExtension safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExtension.canInstantiate(obj))
        	return new TExtension(obj);
        else
        	throw new IllegalArgumentException("TExtension: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0501badc-fcdf-4b36-a26b-05796ecc430b")
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
    @objid ("ce95a252-e696-4a1c-bf74-6826c12982ec")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TExtension.mustUnderstand'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9381b4a1-da0e-4bd5-9a52-72832ff5abc6")
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
    @objid ("212b7c7f-63c9-4850-ad5b-68223ce37100")
    public String getNamespace() {
        String value = this.elt.getProperty(TExtension.MdaTypes.STEREOTYPE_ELT,
                                            TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("19b97812-61c2-4dd5-8ab6-d775e6fd83d0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TExtension.mustUnderstand'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ed2ed7e5-87d0-408f-a620-934283d590b0")
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
    @objid ("cf458c6b-6291-4774-a060-1d68aee78561")
    public void setNamespace(final String value) {
        this.elt.setProperty(TExtension.MdaTypes.STEREOTYPE_ELT,
                             TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("55d54a55-6fdf-442e-8f25-7433e4fdf012")
    protected  TExtension(final ModelElement elt) {
        super(elt);
    }

    @objid ("dc6314de-3141-41ac-9d01-c85250c4d2f6")
    public static final class MdaTypes {
        @objid ("741c607e-deba-41eb-9443-ee6aab61ad73")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("82b1fa1a-5f6f-49da-b565-41c92888d68d")
        public static PropertyDefinition MUSTUNDERSTAND_PROPERTY_ELT;

        @objid ("fc75e67c-b62f-4bcb-9c84-fe40cf037a03")
        public static PropertyDefinition NAMESPACE_PROPERTY_ELT;

        @objid ("f5869f05-3a13-45cb-a027-86e025555573")
        private static Stereotype MDAASSOCDEP;

        @objid ("d85053d8-0051-4b26-9b4b-cb918b8b7ada")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("065199a7-deac-4e06-a02c-868e73afb4c2")
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

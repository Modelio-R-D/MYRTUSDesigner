/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/08/2024 17:44 by Modelio Studio.
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
@objid ("d61cce88-7356-49f3-ba75-38bc6ee9b65a")
public class TExtension extends TExtensibleElements implements IMdaProxy {
    @objid ("13e62076-8120-4ea1-8471-9d9119bf6d46")
    public static final String STEREOTYPE_NAME = "TExtension";

    @objid ("ba244be3-f6c0-42a2-a451-4d4a0eaffdeb")
    public static final String MUSTUNDERSTAND_PROPERTY = "mustUnderstand";

    @objid ("5ace6f3f-c795-4ad6-aaab-8dfaaf51e06f")
    public static final String NAMESPACE_PROPERTY = "namespace";

    /**
     * Tells whether a {@link TExtension proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtension >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9d335d4d-8266-48ec-abdd-deae3c0a3672")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtension.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtension.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtension >> then instantiate a {@link TExtension} proxy.
     * @return a {@link TExtension} proxy on the created {@link ModelElement}.
     */
    @objid ("baaa7453-00e6-4dea-9111-9bc4fa015a30")
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
    @objid ("580d30ee-2d6e-4e4b-8192-e8d5e64f6ef4")
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
    @objid ("7061b308-90e0-4baa-9a72-bbbe350e3e4f")
    public static TExtension safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExtension.canInstantiate(obj))
            return new TExtension(obj);
        else
            throw new IllegalArgumentException("TExtension: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e1c62398-499e-4f4c-9efe-b1b464fd76d5")
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
    @objid ("466bf25a-d0d7-44ae-8ae8-92c985439280")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TExtension.mustUnderstand'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("02b3ca3b-4094-44a6-ba0c-1110cfb814b8")
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
    @objid ("a2d4bf5f-a8e0-4e55-baba-fa66fd172b3f")
    public String getNamespace() {
        String value = this.elt.getProperty(TExtension.MdaTypes.STEREOTYPE_ELT,
                                            TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("32636400-a9b1-4637-a734-dea6e7ae806b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TExtension.mustUnderstand'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5d9eb564-7fff-485a-aeeb-3864c911d5bc")
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
    @objid ("3319a28f-a3d0-4e23-9d75-6a4f7508f1fe")
    public void setNamespace(final String value) {
        this.elt.setProperty(TExtension.MdaTypes.STEREOTYPE_ELT,
                             TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExtension.MdaTypes.NAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("874536bd-d98e-4274-8025-279ebb6f3617")
    protected  TExtension(final ModelElement elt) {
        super(elt);
    }

    @objid ("6681263c-a423-492a-833f-8e3fb88be9f4")
    public static final class MdaTypes {
        @objid ("e68111e7-5d79-4ebd-a5c7-e0d0c2fc4bb7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3422d0ec-061d-448a-9a10-41b6e9d2874c")
        public static PropertyDefinition MUSTUNDERSTAND_PROPERTY_ELT;

        @objid ("83a89951-8859-492a-9a4f-7cc6cf3bda61")
        public static PropertyDefinition NAMESPACE_PROPERTY_ELT;

        @objid ("e7857f35-3d83-4f83-8fff-1ac9b735d114")
        private static Stereotype MDAASSOCDEP;

        @objid ("553cf790-6eea-4dc2-b237-778d1d4056e5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1b0697c5-6e92-42fe-b3ab-2206767ac59a")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 16:27 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TRequirementRef >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c1efd997-4ec3-4dfa-b6ad-e10b8fc4a65a")
public class TRequirementRef implements IMdaProxy {
    @objid ("3d11e9d4-cb89-407b-ae80-f92b7c74d6b4")
    public static final String STEREOTYPE_NAME = "TRequirementRef";

    @objid ("34a852f8-c4d5-4960-a4dd-b4d2c9dbde1e")
    public static final String NAME_PROPERTY = "name";

    @objid ("15e000ca-3a96-4f6c-8d2e-195b2fe5855c")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("f3f0822c-73ed-4968-b780-b6e6c8d57de9")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TRequirementRef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TRequirementRef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5c26acf6-6b89-4af1-b683-d5949a3986d6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TRequirementRef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TRequirementRef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TRequirementRef >> then instantiate a {@link TRequirementRef} proxy.
     * @return a {@link TRequirementRef} proxy on the created {@link ModelElement}.
     */
    @objid ("40f67a9f-ff3e-407c-891b-2d88a762f571")
    public static TRequirementRef create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TRequirementRef.MdaTypes.STEREOTYPE_ELT);
        return TRequirementRef.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TRequirementRef} proxy from a {@link ModelElement} stereotyped << TRequirementRef >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TRequirementRef} proxy or <i>null</i>.
     */
    @objid ("a7800e32-d9f2-4a96-bb3a-81e6929bebb8")
    public static TRequirementRef instantiate(final ModelElement obj) {
        return TRequirementRef.canInstantiate(obj) ? new TRequirementRef(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirementRef} proxy from a {@link ModelElement} stereotyped << TRequirementRef >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TRequirementRef} proxy.
     */
    @objid ("e122848c-ce1f-4107-8329-24250e5648e8")
    public static TRequirementRef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TRequirementRef.canInstantiate(obj))
            return new TRequirementRef(obj);
        else
            throw new IllegalArgumentException("TRequirementRef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1b51b02b-dec3-4d94-ab0a-92bff2dfea3c")
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
        TRequirementRef other = (TRequirementRef) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("56f4c6bf-3e22-458d-8c21-ea6caa3b5203")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirementRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e264fb61-8e48-448f-93c3-bed029090d37")
    public String getName() {
        String value = this.elt.getProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementRef.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementRef.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementRef.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TRequirementRef.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b66eacca-a93d-4785-ad4c-706337550842")
    public String getRef() {
        String value = this.elt.getProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementRef.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementRef.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementRef.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
    }

    @objid ("f95756dd-7540-45fa-a4b3-f00a6686ea0f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TRequirementRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e9d48010-76e2-4f02-b8c1-c36d08de6ea7")
    public void setName(final String value) {
        this.elt.setProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                             TRequirementRef.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementRef.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirementRef.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2ffcf097-0302-478e-b917-226c4327e5b1")
    public void setRef(final String value) {
        this.elt.setProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                             TRequirementRef.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementRef.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("1605974f-8e07-43d6-ae0c-8d548f123095")
    protected  TRequirementRef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("ddbc59a7-04ff-40a3-a76f-15ed8a61c9ef")
    public static final class MdaTypes {
        @objid ("4023849c-3327-4654-a319-569fc042b549")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cb8ba757-6c3d-46f0-a097-d3ccc0ceded0")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("7b4c12f4-831b-49f6-b541-f30e2ce41730")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("1455976f-ebbd-4377-85ec-90242482c3f8")
        private static Stereotype MDAASSOCDEP;

        @objid ("9aa113a9-2638-49bb-8913-cf50439e3b94")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("887b1116-ffc5-466c-9d37-9c88b8766160")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "179fadf7-b82d-47bc-ae58-40df62e045ed", "TRequirementRef");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "100afbca-9f3b-49e3-ac91-f1465edc6002", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d9c4cff9-b58a-410a-9b68-f76a8879a37f", "ref");
            REF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

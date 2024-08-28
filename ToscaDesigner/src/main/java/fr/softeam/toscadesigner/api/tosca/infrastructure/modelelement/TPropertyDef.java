/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << TPropertyDef >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1b95daeb-b55d-4851-b75a-01f1d65245cd")
public class TPropertyDef implements IMdaProxy {
    @objid ("9d9da8ce-875b-4573-8d67-736a26ce0f84")
    public static final String STEREOTYPE_NAME = "TPropertyDef";

    @objid ("7f0b07bf-75e0-41da-932e-7f56085d8c12")
    public static final String PROPERTY_PROPERTY = "property";

    @objid ("06415c23-6283-4f51-89d7-b5d5f4768f4f")
    public static final String VALUE_PROPERTY = "value";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("d748fcb1-9752-46ec-9ee1-aba6a1b82cd4")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPropertyDef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyDef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1f3c3ba6-d8a4-43ed-96a2-a11916a59f16")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyDef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyDef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyDef >> then instantiate a {@link TPropertyDef} proxy.
     * @return a {@link TPropertyDef} proxy on the created {@link ModelElement}.
     */
    @objid ("59239441-9885-44d9-8f78-fc8b83ea95d9")
    public static TPropertyDef create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TPropertyDef.MdaTypes.STEREOTYPE_ELT);
        return TPropertyDef.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TPropertyDef} proxy from a {@link ModelElement} stereotyped << TPropertyDef >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TPropertyDef} proxy or <i>null</i>.
     */
    @objid ("80989123-6f6e-4efe-a9af-c47240000382")
    public static TPropertyDef instantiate(final ModelElement obj) {
        return TPropertyDef.canInstantiate(obj) ? new TPropertyDef(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPropertyDef} proxy from a {@link ModelElement} stereotyped << TPropertyDef >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TPropertyDef} proxy.
     */
    @objid ("4364a97a-907d-414e-9319-9e5b3a100761")
    public static TPropertyDef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyDef.canInstantiate(obj))
            return new TPropertyDef(obj);
        else
            throw new IllegalArgumentException("TPropertyDef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3a464918-8da3-4e2c-a7a6-1c977b5a969d")
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
        TPropertyDef other = (TPropertyDef) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("ead6c173-1eec-4d55-a652-c7ca819b2f8d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPropertyDef.property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e2ace1c8-b412-4119-bd3f-844fa604e4e4")
    public String getProperty() {
        String value = this.elt.getProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyDef.MdaTypes.PROPERTY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyDef.MdaTypes.PROPERTY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyDef.MdaTypes.PROPERTY_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TPropertyDef.value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9c6d8a2d-8d66-4829-81dd-f0e434d284e5")
    public String getValue() {
        String value = this.elt.getProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("3be6ef04-fe56-49e7-9497-2a8e43106832")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TPropertyDef.property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dd67305d-2538-4423-b80e-60dd1de2dfa4")
    public void setProperty(final String value) {
        this.elt.setProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                             TPropertyDef.MdaTypes.PROPERTY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyDef.MdaTypes.PROPERTY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TPropertyDef.value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0baa01af-81db-43e3-9e92-d2d1c97a637b")
    public void setValue(final String value) {
        this.elt.setProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                             TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT, value));
    }

    @objid ("33ae4deb-a0fb-4403-b686-322b964ae640")
    protected  TPropertyDef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("077fe0d5-3c38-4eda-803f-3530078a5da2")
    public static final class MdaTypes {
        @objid ("1fd4a180-9539-4eb4-bab9-cf040bfa50a7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5bddda39-70ee-4409-91fd-166c8e755931")
        public static PropertyDefinition PROPERTY_PROPERTY_ELT;

        @objid ("758a215e-f5f0-4bb3-b10e-4ccba013bfc6")
        public static PropertyDefinition VALUE_PROPERTY_ELT;

        @objid ("b9737d24-50ab-4dea-9d57-42a45a1f195a")
        private static Stereotype MDAASSOCDEP;

        @objid ("51a69b41-b247-4544-acbc-e6f727e0fc80")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("40628f8e-0bdb-47f6-abf1-9e63e9e05dbe")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "e6fb3511-fe1d-4f8d-b0d0-ef92595660a5", "TPropertyDef");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b3526409-254e-4ae3-8d08-1cb28df5cec8", "property");
            PROPERTY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d2597f19-ad2e-4972-8fa0-94aa8d0230a6", "value");
            VALUE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALUE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

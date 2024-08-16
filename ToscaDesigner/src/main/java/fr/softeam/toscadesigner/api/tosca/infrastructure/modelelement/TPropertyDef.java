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
 * Proxy class to handle a {@link ModelElement} with << TPropertyDef >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5e8e7b48-7c61-43f1-ae33-d873664382f1")
public class TPropertyDef implements IMdaProxy {
    @objid ("0ccb6582-289e-4e70-b547-695b2d5aa83a")
    public static final String STEREOTYPE_NAME = "TPropertyDef";

    @objid ("fc2b7bb5-21f0-4f9b-9276-b3cb04470308")
    public static final String PROPERTY_PROPERTY = "property";

    @objid ("fea83fa4-f8df-40cc-be20-8ab87b1c270a")
    public static final String VALUE_PROPERTY = "value";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("35a2d476-6960-4a58-b197-31d6584bd493")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPropertyDef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyDef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b4b12784-376a-49bb-99db-a4ed315e8702")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyDef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyDef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyDef >> then instantiate a {@link TPropertyDef} proxy.
     * @return a {@link TPropertyDef} proxy on the created {@link ModelElement}.
     */
    @objid ("f94077cb-1817-49fd-99a2-33885b4bf990")
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
    @objid ("8f3f36e1-fd18-4002-9e35-e47bf1600ec0")
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
    @objid ("59bf4e3c-a3d1-49d3-a2d1-35e9649d70e8")
    public static TPropertyDef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyDef.canInstantiate(obj))
            return new TPropertyDef(obj);
        else
            throw new IllegalArgumentException("TPropertyDef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5c380c06-8d98-4fb6-a81e-2df668b44135")
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
    @objid ("7bdf3dd4-9ac1-42e6-9d4b-4fbc4e9d3fa8")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPropertyDef.property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("77eab43e-5149-4123-9221-bf59585e4afe")
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
    @objid ("81e3bc2b-7e7b-4a3c-8277-167c1d08c688")
    public String getValue() {
        String value = this.elt.getProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("ecb3a138-4819-4450-bb64-881bba73cd84")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TPropertyDef.property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8aa362ce-bea8-486c-a179-02c29e349989")
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
    @objid ("11d51200-4583-4f93-8eb4-6bb0624c9f90")
    public void setValue(final String value) {
        this.elt.setProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                             TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT, value));
    }

    @objid ("1b78d8a5-9f3b-434e-b0a3-19a4f3534581")
    protected  TPropertyDef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("2e19a429-db3a-4a93-9abc-e5b9a6309a15")
    public static final class MdaTypes {
        @objid ("0924f703-e6fa-43af-b21d-1c19096a2983")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7ac31842-df89-4a45-aabe-b4551ad28b8c")
        public static PropertyDefinition PROPERTY_PROPERTY_ELT;

        @objid ("581f3b47-f862-4b73-8835-8e491909cd49")
        public static PropertyDefinition VALUE_PROPERTY_ELT;

        @objid ("2bf9a593-ff37-41b4-949b-c1ebacb9e61b")
        private static Stereotype MDAASSOCDEP;

        @objid ("a23a4409-3f05-4bbc-8e9b-7419bbf808fc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4a4e5269-7d28-4756-b985-4191df9354c5")
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

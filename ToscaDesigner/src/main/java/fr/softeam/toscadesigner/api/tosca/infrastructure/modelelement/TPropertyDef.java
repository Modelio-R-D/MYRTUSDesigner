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
 * Proxy class to handle a {@link ModelElement} with << TPropertyDef >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5e8e7b48-7c61-43f1-ae33-d873664382f1")
public class TPropertyDef implements IMdaProxy {
    @objid ("9d7c70de-649b-4dc0-9581-ad58eefae51b")
    public static final String STEREOTYPE_NAME = "TPropertyDef";

    @objid ("9ad01462-94ea-4089-a880-5c1851239e09")
    public static final String PROPERTY_PROPERTY = "property";

    @objid ("d6900159-72bf-4055-ac73-58ba0a20f6a8")
    public static final String VALUE_PROPERTY = "value";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("946c13e2-69d4-4ec7-b2bf-bcacdb1151c5")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPropertyDef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyDef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9382dac9-69f5-45ec-b57d-882eac7f4bba")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyDef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyDef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyDef >> then instantiate a {@link TPropertyDef} proxy.
     * 
     * @return a {@link TPropertyDef} proxy on the created {@link ModelElement}.
     */
    @objid ("a0a0248d-d482-4777-a449-186ce3268c5f")
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
    @objid ("69130cf1-e545-40ad-a23a-7b17a976a4fb")
    public static TPropertyDef instantiate(final ModelElement obj) {
        return TPropertyDef.canInstantiate(obj) ? new TPropertyDef(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPropertyDef} proxy from a {@link ModelElement} stereotyped << TPropertyDef >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TPropertyDef} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("29406e63-bc9a-4acb-892c-39889116f515")
    public static TPropertyDef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyDef.canInstantiate(obj))
        	return new TPropertyDef(obj);
        else
        	throw new IllegalArgumentException("TPropertyDef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("661c3b92-9415-4b36-8f20-2c8ce83dff05")
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
    @objid ("abff8171-50b2-4d51-a7b4-0fca67f05226")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPropertyDef.property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1496810f-5364-4164-814c-3ec898c2b5f1")
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
    @objid ("ccbb9357-588e-4837-98f3-af308ea38dad")
    public String getValue() {
        String value = this.elt.getProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("8936c525-66a0-422f-bd19-767ee9a17181")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TPropertyDef.property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0eedd71d-d0ce-424d-8d36-c15ce4045049")
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
    @objid ("d414f438-a887-472c-ba88-1f7e2636f569")
    public void setValue(final String value) {
        this.elt.setProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                             TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT, value));
    }

    @objid ("bda5d828-86ea-4643-b7c6-1838aaca5def")
    protected  TPropertyDef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("2e19a429-db3a-4a93-9abc-e5b9a6309a15")
    public static final class MdaTypes {
        @objid ("9e2f2eb3-8b2f-47af-8790-6a30d8e91e6e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e80d4364-ac01-4d43-b6e4-c33b5d0c526d")
        public static PropertyDefinition PROPERTY_PROPERTY_ELT;

        @objid ("d20fdd74-65f5-4dc9-9370-2887a7be353c")
        public static PropertyDefinition VALUE_PROPERTY_ELT;

        @objid ("a9a4ac61-f28b-459b-ab16-7593f475a54f")
        private static Stereotype MDAASSOCDEP;

        @objid ("510c88a2-83fc-4fda-b952-174b09cb2d77")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e9e5808c-c34a-45a5-921d-e56d2b2dabcc")
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

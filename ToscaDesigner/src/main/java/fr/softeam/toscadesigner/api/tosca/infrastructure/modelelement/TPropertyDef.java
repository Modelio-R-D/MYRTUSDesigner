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
    @objid ("05913809-d547-442c-a04f-dbfa2467191f")
    public static final String STEREOTYPE_NAME = "TPropertyDef";

    @objid ("f59c2ce2-aa32-42da-8eef-ff76bab0f371")
    public static final String PROPERTY_PROPERTY = "property";

    @objid ("a76c0109-889a-40d1-a460-745d6dea91e2")
    public static final String VALUE_PROPERTY = "value";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("815a0d0c-e94a-4e62-9691-54a8db456472")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPropertyDef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyDef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2af11cba-255d-43a8-b831-5737264645e7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyDef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyDef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyDef >> then instantiate a {@link TPropertyDef} proxy.
     * @return a {@link TPropertyDef} proxy on the created {@link ModelElement}.
     */
    @objid ("62944947-54ed-4d35-8246-ab45071b22aa")
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
    @objid ("afcd1311-594f-411b-b201-cd7a3365bb30")
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
    @objid ("21f1a7c2-54a9-4e87-a71d-b73ede548087")
    public static TPropertyDef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyDef.canInstantiate(obj))
            return new TPropertyDef(obj);
        else
            throw new IllegalArgumentException("TPropertyDef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f40c6ec7-76e3-43a3-af97-3df5af7e311d")
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
    @objid ("dfc3a7b7-7996-4b40-b4c0-127d29b7cd26")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPropertyDef.property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a9f5e65e-d995-42b8-bfad-be2958917b2b")
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
    @objid ("977c1775-cfa9-4d5e-bf2e-8d4c6e69b374")
    public String getValue() {
        String value = this.elt.getProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                                            TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("5d68298d-2f50-4922-8009-1b803d888605")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TPropertyDef.property'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("be17fdf3-63c8-40e7-93e1-2b7f3c39aa5a")
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
    @objid ("6ff7de46-9fd3-4b62-980b-ab2fd247c779")
    public void setValue(final String value) {
        this.elt.setProperty(TPropertyDef.MdaTypes.STEREOTYPE_ELT,
                             TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPropertyDef.MdaTypes.VALUE_PROPERTY_ELT, value));
    }

    @objid ("ed20a767-dd34-4343-b404-89d5668fb886")
    protected  TPropertyDef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("2e19a429-db3a-4a93-9abc-e5b9a6309a15")
    public static final class MdaTypes {
        @objid ("9c5bdc4a-d2a8-439f-b3ba-15e5f1a07363")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("42411e27-36ce-4916-9e1d-88b5b35ddf6d")
        public static PropertyDefinition PROPERTY_PROPERTY_ELT;

        @objid ("d8eeb8c1-269b-4808-bb98-8bf710ff0d01")
        public static PropertyDefinition VALUE_PROPERTY_ELT;

        @objid ("a665899e-c36b-4de9-8041-449aeb60ddd6")
        private static Stereotype MDAASSOCDEP;

        @objid ("93b7b371-6e61-4893-ab14-2ecf1599e5c6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a522a3b6-a24f-4178-a88f-c656e3cc9c63")
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

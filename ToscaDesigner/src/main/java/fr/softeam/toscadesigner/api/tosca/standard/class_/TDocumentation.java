/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TDocumentation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("62363ede-e114-4953-a88e-ed16e596decc")
public class TDocumentation implements IMdaProxy {
    @objid ("eff23106-7a74-40ea-bcb6-8a92425e8542")
    public static final String STEREOTYPE_NAME = "TDocumentation";

    @objid ("f8f853cc-84b8-4753-a3e5-16e87455e93a")
    public static final String ANY_PROPERTY = "any";

    @objid ("1546c097-612f-4d55-a8ba-cda2044c11f4")
    public static final String LANG_PROPERTY = "lang";

    @objid ("10d2ab30-c2ae-4e8d-ba6a-83820326c801")
    public static final String MIXED_PROPERTY = "mixed";

    @objid ("b63b416c-b660-4b89-8fee-28dc100c5e4b")
    public static final String SOURCE_PROPERTY = "source";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("eee0d83f-fbd8-4ccc-a717-e9197382d066")
    protected final Class elt;

    /**
     * Tells whether a {@link TDocumentation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDocumentation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("24a5c0c1-78d6-4fcf-878e-2edf301dfc30")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDocumentation.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDocumentation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDocumentation >> then instantiate a {@link TDocumentation} proxy.
     * @return a {@link TDocumentation} proxy on the created {@link Class}.
     */
    @objid ("c9e76f09-fda1-40af-a292-3088a950ac9b")
    public static TDocumentation create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TDocumentation.MdaTypes.STEREOTYPE_ELT);
        return TDocumentation.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TDocumentation} proxy from a {@link Class} stereotyped << TDocumentation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TDocumentation} proxy or <i>null</i>.
     */
    @objid ("ea4252cf-89d6-4bf1-85ec-d41e82d2b832")
    public static TDocumentation instantiate(final Class obj) {
        return TDocumentation.canInstantiate(obj) ? new TDocumentation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDocumentation} proxy from a {@link Class} stereotyped << TDocumentation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TDocumentation} proxy.
     */
    @objid ("d1a5df7c-e623-465b-82e5-ca8286b0a388")
    public static TDocumentation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDocumentation.canInstantiate(obj))
            return new TDocumentation(obj);
        else
            throw new IllegalArgumentException("TDocumentation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d8e97964-a76f-44f4-8712-9c082847bb80")
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
        TDocumentation other = (TDocumentation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TDocumentation.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("939a338d-135d-42e0-abc3-cde9f402c91c")
    public String getAny() {
        String value = this.elt.getProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                                            TDocumentation.MdaTypes.ANY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDocumentation.MdaTypes.ANY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDocumentation.MdaTypes.ANY_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("59a40c7f-9cc9-4b44-9696-6372e1cb05f2")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TDocumentation.lang'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("63fb4b63-9917-420d-b8d0-d88502ec1b65")
    public String getLang() {
        String value = this.elt.getProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                                            TDocumentation.MdaTypes.LANG_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDocumentation.MdaTypes.LANG_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDocumentation.MdaTypes.LANG_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TDocumentation.mixed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0877324c-17b0-4559-93b3-2f18a5ed20bf")
    public String getMixed() {
        String value = this.elt.getProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                                            TDocumentation.MdaTypes.MIXED_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDocumentation.MdaTypes.MIXED_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDocumentation.MdaTypes.MIXED_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TDocumentation.source'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5fe200f0-c400-4fae-b258-3d5834fe3928")
    public String getSource() {
        String value = this.elt.getProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                                            TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("499d2493-8c09-4fce-aa59-02778b32f9b4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TDocumentation.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3a365b99-8ccc-422d-9dac-b323545c643e")
    public void setAny(final String value) {
        this.elt.setProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                             TDocumentation.MdaTypes.ANY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDocumentation.MdaTypes.ANY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDocumentation.lang'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a8774cec-78da-442b-908f-335cb43a80d8")
    public void setLang(final String value) {
        this.elt.setProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                             TDocumentation.MdaTypes.LANG_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDocumentation.MdaTypes.LANG_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDocumentation.mixed'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f3460352-e87f-4029-9ea5-b8e13aaf5679")
    public void setMixed(final String value) {
        this.elt.setProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                             TDocumentation.MdaTypes.MIXED_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDocumentation.MdaTypes.MIXED_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TDocumentation.source'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("43cd3634-8c84-4635-a5dc-4cdc392f2b89")
    public void setSource(final String value) {
        this.elt.setProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                             TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT, value));
    }

    @objid ("ebb6f3c2-356b-4607-9e96-69971e4f0fa9")
    protected  TDocumentation(final Class elt) {
        this.elt = elt;
    }

    @objid ("d5c26cb0-86b5-4551-876c-4a58469a4158")
    public static final class MdaTypes {
        @objid ("6840cfc0-9b61-46be-8a58-5f92cf44bdaf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8cac489d-31ba-4ef6-ac54-f93f5235fd65")
        public static PropertyDefinition MIXED_PROPERTY_ELT;

        @objid ("0483a5e4-3d5c-45b1-8060-ec3d96726366")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("629585ac-52d8-428a-bcc2-17107367e803")
        public static PropertyDefinition LANG_PROPERTY_ELT;

        @objid ("fba00f05-3e08-4821-abaf-c42ca18bd587")
        public static PropertyDefinition SOURCE_PROPERTY_ELT;

        @objid ("b2ef9839-1e5d-4c75-8cb9-96a589d6342c")
        private static Stereotype MDAASSOCDEP;

        @objid ("d9e440bf-13d7-4046-834e-67b37f6e7490")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c3c9d4cd-8fea-4112-8e18-b18b257dd9a2")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1bcf2312-727a-4971-aac1-87f1c896f928", "TDocumentation");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "01c22fe4-d838-40f7-95f9-9ebef1786ab9", "mixed");
            MIXED_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (MIXED_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "385dfdde-2f14-4bc9-a967-5bf59cc4baf9", "any");
            ANY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ANY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "33cf94b7-7204-43b3-8ca1-9f34283538a9", "lang");
            LANG_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (LANG_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "eaf959e1-1cf5-4002-a3eb-079f9592e91a", "source");
            SOURCE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (SOURCE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

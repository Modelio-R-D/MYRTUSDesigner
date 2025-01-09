/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 11:56 by Modelio Studio.
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
    @objid ("9966809b-a8b7-471e-9fbd-f1a3866f404e")
    public static final String STEREOTYPE_NAME = "TDocumentation";

    @objid ("93c5c38f-e3a1-4011-baf9-a35f53b33ec7")
    public static final String ANY_PROPERTY = "any";

    @objid ("dd777dfa-b992-42f6-9501-f77eefa817da")
    public static final String LANG_PROPERTY = "lang";

    @objid ("934ac988-e698-499c-87ec-286e4ed9a9ae")
    public static final String MIXED_PROPERTY = "mixed";

    @objid ("e2963530-a0f8-456c-8b3d-1baa8db8f5dd")
    public static final String SOURCE_PROPERTY = "source";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("2d8bb534-5fdc-435f-8f9e-1b3729c114b7")
    protected final Class elt;

    /**
     * Tells whether a {@link TDocumentation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDocumentation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b9a0e473-1c11-4d8a-b6a2-707379d2af12")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDocumentation.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDocumentation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDocumentation >> then instantiate a {@link TDocumentation} proxy.
     * 
     * @return a {@link TDocumentation} proxy on the created {@link Class}.
     */
    @objid ("7a331e53-8620-4f96-ab49-b7aa763fb40a")
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
    @objid ("7c4e49ab-1663-4574-b8cc-793a7bcd3904")
    public static TDocumentation instantiate(final Class obj) {
        return TDocumentation.canInstantiate(obj) ? new TDocumentation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDocumentation} proxy from a {@link Class} stereotyped << TDocumentation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TDocumentation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ece9f64b-32aa-4db2-a63e-d44c198f822f")
    public static TDocumentation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDocumentation.canInstantiate(obj))
        	return new TDocumentation(obj);
        else
        	throw new IllegalArgumentException("TDocumentation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4dd843ae-f2f4-4f62-8558-1cb5412a6d21")
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
    @objid ("5153e873-c7dc-4978-865e-94c95eb3867c")
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
    @objid ("1fd48b0b-5ff2-4311-abdc-6a344c9d7c4f")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TDocumentation.lang'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bca56360-96e5-4464-95de-fe701bcbf706")
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
    @objid ("eed0e991-8d61-402d-bdce-4777076dafff")
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
    @objid ("a0b94d08-73be-4afc-a81c-1982457d0d09")
    public String getSource() {
        String value = this.elt.getProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                                            TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("7662192a-fccb-45ed-861a-73530e6bf284")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDocumentation.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("08874445-4075-4bd0-9f5d-1cfccbd7392f")
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
    @objid ("36ecb556-a6a5-4b06-8b7f-05edff610cd3")
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
    @objid ("df9e3b4b-43b1-41ba-9bb6-6754d829f994")
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
    @objid ("69c87d2a-20ff-4409-bf8d-e0e589f07b91")
    public void setSource(final String value) {
        this.elt.setProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                             TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT, value));
    }

    @objid ("e2b31691-c6aa-480b-9de9-e2fed5dfc819")
    protected  TDocumentation(final Class elt) {
        this.elt = elt;
    }

    @objid ("d5c26cb0-86b5-4551-876c-4a58469a4158")
    public static final class MdaTypes {
        @objid ("3faee2ce-cd07-4b6a-ae19-2db22ca50156")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2fd14ea1-e687-4f22-a848-0e6040369df0")
        public static PropertyDefinition MIXED_PROPERTY_ELT;

        @objid ("f2817a0b-4855-46ce-9a14-a1133b42af0b")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("98ab3cf9-ddad-4431-a997-7346e42f5036")
        public static PropertyDefinition LANG_PROPERTY_ELT;

        @objid ("3d2a7e25-1cf8-458b-ac29-12e88a9b94c1")
        public static PropertyDefinition SOURCE_PROPERTY_ELT;

        @objid ("25c6c831-d745-41e6-8fb1-2bc0b9be0b64")
        private static Stereotype MDAASSOCDEP;

        @objid ("cc157196-cdd4-4386-9fe1-6bb310a83a66")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("97da6be1-f3bd-428d-825c-529dc8599f46")
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

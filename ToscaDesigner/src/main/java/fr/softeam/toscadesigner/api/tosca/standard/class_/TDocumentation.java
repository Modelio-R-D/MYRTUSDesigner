/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 15:23 by Modelio Studio.
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
    @objid ("3a559eec-b019-4f11-9192-c26ae5bf1c05")
    public static final String STEREOTYPE_NAME = "TDocumentation";

    @objid ("90cecea5-7ef7-4421-804f-a40ed3394bc1")
    public static final String ANY_PROPERTY = "any";

    @objid ("5fe4623c-8a1e-49a1-930f-f742d2e83980")
    public static final String LANG_PROPERTY = "lang";

    @objid ("9f0af469-da7a-4536-8470-97119f35e134")
    public static final String MIXED_PROPERTY = "mixed";

    @objid ("dc4c245f-e4c5-4d6c-89c9-3c62c1a6e7af")
    public static final String SOURCE_PROPERTY = "source";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("eb7d1657-1dfe-4a60-a8d3-5e7fe23999c4")
    protected final Class elt;

    /**
     * Tells whether a {@link TDocumentation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDocumentation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2067942c-816a-4afe-9ee0-99f8e8ac2a40")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDocumentation.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDocumentation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDocumentation >> then instantiate a {@link TDocumentation} proxy.
     * 
     * @return a {@link TDocumentation} proxy on the created {@link Class}.
     */
    @objid ("d49850a5-fe36-40dd-845f-b7f7fac5c6b8")
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
    @objid ("b55d21b8-1dd2-412d-835e-a8362fb295e9")
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
    @objid ("12003128-e156-4f6f-a5ea-b4cbca427bb4")
    public static TDocumentation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDocumentation.canInstantiate(obj))
        	return new TDocumentation(obj);
        else
        	throw new IllegalArgumentException("TDocumentation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7dc98957-fadc-42fd-9fee-b02f8a3d2416")
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
    @objid ("e3535f98-a96d-48bf-8634-273146f2166f")
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
    @objid ("b8bd5868-43c7-4fff-8cf7-69de66f4448b")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TDocumentation.lang'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e38fe50f-7ba1-441c-a72d-f251e24146fa")
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
    @objid ("a5f39107-9bda-4b7a-a539-0f70f3b7da80")
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
    @objid ("8bbea692-49b9-454a-83fa-945854b10a63")
    public String getSource() {
        String value = this.elt.getProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                                            TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("9c96e900-d4b1-4737-a6e8-7b3cf14de08d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDocumentation.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bfed176e-ae65-40c2-a253-a8547188cfc6")
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
    @objid ("93ae6869-26d3-4112-bd55-9d3f462588f3")
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
    @objid ("a8fe5422-e5cc-4ea1-afd2-096d07628903")
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
    @objid ("9a313474-c7d5-40ca-8677-c13885d55a7d")
    public void setSource(final String value) {
        this.elt.setProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                             TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT, value));
    }

    @objid ("526165a2-fcd3-446a-9cf4-344fd8139c1e")
    protected  TDocumentation(final Class elt) {
        this.elt = elt;
    }

    @objid ("d5c26cb0-86b5-4551-876c-4a58469a4158")
    public static final class MdaTypes {
        @objid ("a22552c0-8592-4d70-9d63-0a9038798d24")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1547e7c4-20d9-4a24-b4e9-c4bde0bdf65a")
        public static PropertyDefinition MIXED_PROPERTY_ELT;

        @objid ("a59db6a5-7d0a-414f-b851-dfaed6792bdf")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("1d5a1302-b189-457c-acad-6475bc4214cd")
        public static PropertyDefinition LANG_PROPERTY_ELT;

        @objid ("3b3d7f31-01b4-4dc8-9c19-bf0c154b5be8")
        public static PropertyDefinition SOURCE_PROPERTY_ELT;

        @objid ("bfedce12-a008-4317-ab96-c6149389b6c6")
        private static Stereotype MDAASSOCDEP;

        @objid ("50592c6c-72c2-44ad-b4fa-c8d2b07d1929")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5e127751-6470-4ddc-9ab9-2aa179c97d46")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 13/08/2024 17:47 by Modelio Studio.
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
@objid ("7d4753b8-7225-4bff-a2ad-89bcc9288de1")
public class TDocumentation implements IMdaProxy {
    @objid ("baf9e8d5-6363-4c7c-b6c1-c772499c12f2")
    public static final String STEREOTYPE_NAME = "TDocumentation";

    @objid ("a9142bdb-b0bf-4d08-854a-e4ef6dc70e20")
    public static final String ANY_PROPERTY = "any";

    @objid ("46067695-778d-4bf9-894e-8636f78e5c0d")
    public static final String LANG_PROPERTY = "lang";

    @objid ("1686695e-701a-44a1-9913-bbbe6fb06cbf")
    public static final String MIXED_PROPERTY = "mixed";

    @objid ("9956d17b-e400-42d8-815c-f7344322749e")
    public static final String SOURCE_PROPERTY = "source";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("4cc4a1f2-8538-4750-b8ee-04becc0e6abd")
    protected final Class elt;

    /**
     * Tells whether a {@link TDocumentation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDocumentation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fe8da459-b9fd-4809-880e-9fde556d1390")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDocumentation.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDocumentation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDocumentation >> then instantiate a {@link TDocumentation} proxy.
     * 
     * @return a {@link TDocumentation} proxy on the created {@link Class}.
     */
    @objid ("26a395be-e938-42ca-b800-aa165e009bcd")
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
    @objid ("e66352f8-715d-49c7-b249-7d320c0c2838")
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
    @objid ("18db9c81-335c-4916-984a-f3f1d296c07b")
    public static TDocumentation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDocumentation.canInstantiate(obj))
        	return new TDocumentation(obj);
        else
        	throw new IllegalArgumentException("TDocumentation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6cf7eba6-5926-4478-8e79-5220c1d5cf84")
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
    @objid ("6a5f00ab-efe6-4a30-9ac3-4ad28ef996e6")
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
    @objid ("ae9cafca-f38d-41d4-86cb-567f5e71d740")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TDocumentation.lang'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7ece521f-bf02-4601-9a12-b966ef9c25d2")
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
    @objid ("83ee8ad4-b442-4fbc-a1de-e2be1795f728")
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
    @objid ("bdec3d09-dfc1-43d1-8439-42f2e47dd07f")
    public String getSource() {
        String value = this.elt.getProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                                            TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("a6cfef24-b31d-466a-bf7f-0948a560d9af")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDocumentation.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("df58445a-d5e4-4db0-87cb-c0760e0b09c5")
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
    @objid ("f2946c22-74d3-4f4f-a232-8e016024a507")
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
    @objid ("e33983f3-bda7-45c9-aa38-9cd9820d9e17")
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
    @objid ("19b49130-0a2a-4859-a3e7-4dacd87e34af")
    public void setSource(final String value) {
        this.elt.setProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                             TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT, value));
    }

    @objid ("4ac30954-0967-4005-ae32-5fbc26784987")
    protected  TDocumentation(final Class elt) {
        this.elt = elt;
    }

    @objid ("847d75a9-e6d6-49ba-8ddd-53ba1def82a6")
    public static final class MdaTypes {
        @objid ("ad7267e4-6dc4-4e89-899b-967552ccdc67")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9a986edd-b958-46cd-b804-32974da8fd5e")
        public static PropertyDefinition MIXED_PROPERTY_ELT;

        @objid ("42184643-78b1-4f06-9b0f-7a2167c0f292")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("cb2a0010-82bb-410c-8623-691acfaac6e3")
        public static PropertyDefinition LANG_PROPERTY_ELT;

        @objid ("63d0cc95-37b2-4d88-ba7a-0daba8862ca6")
        public static PropertyDefinition SOURCE_PROPERTY_ELT;

        @objid ("4eb2f25d-7c22-4c17-b2a0-118167256e0d")
        private static Stereotype MDAASSOCDEP;

        @objid ("0d5f34dd-2a62-4b10-977f-df922298b821")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0608846b-fb43-4375-8eed-70b0961f6278")
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

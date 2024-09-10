/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/09/2024 16:32 by Modelio Studio.
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
    @objid ("fe48a86d-92a3-4f2b-af86-c2219cc3222c")
    public static final String STEREOTYPE_NAME = "TDocumentation";

    @objid ("d69e1c9e-aada-4a4a-8f99-068bda8a118e")
    public static final String ANY_PROPERTY = "any";

    @objid ("90e61877-fd4d-4492-8116-a578d6570a38")
    public static final String LANG_PROPERTY = "lang";

    @objid ("69021138-132b-4c18-a9f6-c4a96dd4ee97")
    public static final String MIXED_PROPERTY = "mixed";

    @objid ("38398791-6dca-49cf-b039-61ac13793b3b")
    public static final String SOURCE_PROPERTY = "source";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("fe1739b9-f423-4204-ab40-3760f6bb3d0e")
    protected final Class elt;

    /**
     * Tells whether a {@link TDocumentation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDocumentation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2b35febc-d20e-405d-9a80-b1b6fb1da77c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDocumentation.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDocumentation.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDocumentation >> then instantiate a {@link TDocumentation} proxy.
     * 
     * @return a {@link TDocumentation} proxy on the created {@link Class}.
     */
    @objid ("5342875a-e7e7-4d75-942d-85538eeb3290")
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
    @objid ("cd051b14-e376-49cd-b930-4a0c8e064c1f")
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
    @objid ("136b7787-6aa5-4335-8dd9-1af9334550f2")
    public static TDocumentation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDocumentation.canInstantiate(obj))
        	return new TDocumentation(obj);
        else
        	throw new IllegalArgumentException("TDocumentation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("be55633d-35b7-4fe2-b995-0ebdbe7f5086")
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
    @objid ("2f5efd70-47e8-48f1-b12d-524b1918de32")
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
    @objid ("deefdb65-171f-49b1-9bb8-72e3c8e889b1")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TDocumentation.lang'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3c848979-f00b-47a4-8d56-b60c872bed36")
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
    @objid ("fcefd232-1668-49a1-95ac-d05ff30e45ab")
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
    @objid ("c280bc89-6bc7-486a-b9f1-bd44a4b2f534")
    public String getSource() {
        String value = this.elt.getProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                                            TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("11c0b35f-603b-4251-9f4d-9d5584a67367")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TDocumentation.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8d526502-b4e3-4b53-94ff-5f6593bb5ab3")
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
    @objid ("645f78a1-d467-4d2f-a060-d787f07f474f")
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
    @objid ("daa3d49a-09e0-497a-88c7-0b68379a3e33")
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
    @objid ("d340af4c-4b5c-43d6-bc3d-0d686891019e")
    public void setSource(final String value) {
        this.elt.setProperty(TDocumentation.MdaTypes.STEREOTYPE_ELT,
                             TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TDocumentation.MdaTypes.SOURCE_PROPERTY_ELT, value));
    }

    @objid ("6fd10b02-0932-4b39-b805-ab40ee1c5e26")
    protected  TDocumentation(final Class elt) {
        this.elt = elt;
    }

    @objid ("d5c26cb0-86b5-4551-876c-4a58469a4158")
    public static final class MdaTypes {
        @objid ("4b2b2ad9-5498-4d90-8efe-d3d007d1d2cb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("32fbc8bd-2612-461a-b8b1-a1f836754605")
        public static PropertyDefinition MIXED_PROPERTY_ELT;

        @objid ("e3db9ab0-5823-4680-8a93-1f0e45de5605")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("43113b08-cfb3-40f5-aa95-55337387bcd8")
        public static PropertyDefinition LANG_PROPERTY_ELT;

        @objid ("6db7afa4-3101-4b84-bbb4-439f347902a5")
        public static PropertyDefinition SOURCE_PROPERTY_ELT;

        @objid ("8659bd9e-5d06-41ea-9e96-1c586a900e99")
        private static Stereotype MDAASSOCDEP;

        @objid ("76ba4d53-8259-4671-9b02-8c698aeb928c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("82ed3b78-2ab6-4dfc-b85a-5d930d1cd655")
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

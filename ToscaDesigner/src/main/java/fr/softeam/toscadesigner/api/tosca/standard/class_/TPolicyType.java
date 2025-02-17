/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 18:02 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TPolicyType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9d7c8508-467d-4168-bbcf-2086f92cc75d")
public class TPolicyType extends TEntityType implements IMdaProxy {
    @objid ("11a70b6e-bebe-470d-ae00-d681af6d990d")
    public static final String STEREOTYPE_NAME = "TPolicyType";

    @objid ("bf39bfb6-b38b-409d-ab9e-f436c958dfa3")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("7cdd15d0-0116-4eca-8d4f-e52af7f2ebcb")
    public static final String POLICYLANGUAGE_PROPERTY = "policyLanguage";

    /**
     * Tells whether a {@link TPolicyType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPolicyType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("21881529-f5e0-46bd-9b7b-caa9abf42668")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPolicyType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPolicyType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPolicyType >> then instantiate a {@link TPolicyType} proxy.
     * 
     * @return a {@link TPolicyType} proxy on the created {@link Class}.
     */
    @objid ("2be3edc3-9b1b-4e0b-9334-a9e6f873e378")
    public static TPolicyType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TPolicyType.MdaTypes.STEREOTYPE_ELT);
        return TPolicyType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TPolicyType} proxy from a {@link Class} stereotyped << TPolicyType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TPolicyType} proxy or <i>null</i>.
     */
    @objid ("a171c7fb-41ef-4abb-8a77-fb1df89dd80d")
    public static TPolicyType instantiate(final Class obj) {
        return TPolicyType.canInstantiate(obj) ? new TPolicyType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPolicyType} proxy from a {@link Class} stereotyped << TPolicyType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TPolicyType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("fcce3b99-7880-45e6-beba-8ee60e7075c1")
    public static TPolicyType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPolicyType.canInstantiate(obj))
        	return new TPolicyType(obj);
        else
        	throw new IllegalArgumentException("TPolicyType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c0144865-d9b3-4aa6-a39e-6467a309cbf8")
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
        TPolicyType other = (TPolicyType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'derivedFrom' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("073911f2-4de7-487a-85be-4ee126a761f3")
    public TPolicyType getDerivedFrom() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(TPolicyType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TPolicyType.MdaTypes.MDAASSOCDEP_ROLE), "")
              && TPolicyType.canInstantiate(d.getImpacted())) {
                  return (TPolicyType)ToscaDesignerProxyFactory.instantiate(d.getImpacted(), TPolicyType.MdaTypes.STEREOTYPE_ELT.getName());
          }
        }
        return null;
    }

    /**
     * Getter for property 'TPolicyType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1736134e-c3dd-4d14-acfa-10100552a3d3")
    public String getDescription() {
        String value = this.elt.getProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                                            TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("5e8c7374-1958-4cdc-b70d-abe0cf03782f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TPolicyType.policyLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("17ab734e-4d0c-41e8-800d-9f404abaec48")
    public String getPolicyLanguage() {
        String value = this.elt.getProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                                            TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("3387b4c3-a56f-4d1a-976a-851112228d5f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Set the value of the 'derivedFrom' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b6f2df73-9bc5-49a1-aa4e-82a40ca70787")
    public void setDerivedFrom(final TPolicyType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(TPolicyType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TPolicyType.MdaTypes.MDAASSOCDEP_ROLE), "")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(obj.getElement(), this.elt, TPolicyType.MdaTypes.MDAASSOCDEP);
              dep.setName("");
              dep.putTagValue(TPolicyType.MdaTypes.MDAASSOCDEP_ROLE, "");
          }
          dep.setImpacted(obj.getElement());
        }
        
    }

    /**
     * Setter for property 'TPolicyType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a47b64df-bab7-47f6-928b-449f7e64c60f")
    public void setDescription(final String value) {
        this.elt.setProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                             TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TPolicyType.policyLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1e3a3e75-74a6-4e49-b3e3-4470bc110533")
    public void setPolicyLanguage(final String value) {
        this.elt.setProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                             TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT, value));
    }

    @objid ("ec94fdcc-e376-4be7-bda3-8e6bc81f6017")
    protected  TPolicyType(final Class elt) {
        super(elt);
    }

    @objid ("638aef6f-3603-4ccc-ab50-3fbde1dd9cf5")
    public static final class MdaTypes {
        @objid ("959d9dcb-597d-426d-939f-ffc13cf37806")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d9b524a7-d747-45a8-b846-1b40fa0731f3")
        public static PropertyDefinition POLICYLANGUAGE_PROPERTY_ELT;

        @objid ("ab023ff9-380d-4cf5-aa25-274fcd8d9a48")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("fd9df067-45c7-4e2b-9622-e7620c7f743e")
        private static Stereotype MDAASSOCDEP;

        @objid ("055c0805-277a-47d9-a245-5902a71a16a0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6c6fc652-7af9-4a98-b693-6f9272c8d30f")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "b76dbc7d-8b6f-46f8-89d4-f0ea8eea40d2", "TPolicyType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "97ff5a65-420b-4f0b-bc9e-dcb36130f88e", "policyLanguage");
            POLICYLANGUAGE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICYLANGUAGE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "cb984791-bc72-4469-91fa-ff5a2259f1a2", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:09 by Modelio Studio.
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
    @objid ("b278832b-3379-4c25-b835-8199d017bf00")
    public static final String STEREOTYPE_NAME = "TPolicyType";

    @objid ("6a2da178-7786-4eb4-b202-0ae285dc1923")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("2c1c1693-1a0a-48bd-bc73-508628b6f893")
    public static final String POLICYLANGUAGE_PROPERTY = "policyLanguage";

    /**
     * Tells whether a {@link TPolicyType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPolicyType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9b9771fe-779f-4d05-b105-c3222e5b7522")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPolicyType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPolicyType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPolicyType >> then instantiate a {@link TPolicyType} proxy.
     * 
     * @return a {@link TPolicyType} proxy on the created {@link Class}.
     */
    @objid ("0c4a46aa-6150-4e06-9eb3-903177e518bf")
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
    @objid ("d45ca981-0060-498b-8961-e44289ab874d")
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
    @objid ("3348380e-fb4f-4c0a-ad5d-fff5e100f598")
    public static TPolicyType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPolicyType.canInstantiate(obj))
        	return new TPolicyType(obj);
        else
        	throw new IllegalArgumentException("TPolicyType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f0c58dad-88e0-4c9c-926b-dd91e5bb9b85")
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
    @objid ("85f49555-6315-4b63-9a83-af74489c6dd1")
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
    @objid ("f3b6ea8e-627d-487f-a6d5-204eaee14c6f")
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
    @objid ("d88a9f11-00fc-4d49-ad20-c47774d8a2ee")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TPolicyType.policyLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("20111e87-fec9-4eaf-9ba0-41d4c101a96c")
    public String getPolicyLanguage() {
        String value = this.elt.getProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                                            TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("4470c22f-adc0-4838-872b-e1ae9bb86d87")
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
    @objid ("b8798db5-c2a4-4fc5-afd5-42e773130956")
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
    @objid ("5bbbb262-5889-4969-bc54-8c908947aa0a")
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
    @objid ("1af5334a-8a07-47ef-8b54-2385f43ee3e2")
    public void setPolicyLanguage(final String value) {
        this.elt.setProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                             TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT, value));
    }

    @objid ("2e563475-163e-4580-a8c8-f208be17330a")
    protected  TPolicyType(final Class elt) {
        super(elt);
    }

    @objid ("638aef6f-3603-4ccc-ab50-3fbde1dd9cf5")
    public static final class MdaTypes {
        @objid ("dd6835ba-a346-473a-8344-e4880e4278a9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("482fef57-2427-4841-9a12-28bfb5e5fc5b")
        public static PropertyDefinition POLICYLANGUAGE_PROPERTY_ELT;

        @objid ("5caea9fe-c1d8-40c4-aa53-bca6160a8071")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("fa090bb9-13d1-4bd4-9ade-db205eff0ecb")
        private static Stereotype MDAASSOCDEP;

        @objid ("a626124b-e5fe-426a-b319-3b10224dc9b3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d446d8a9-6f07-4daf-88f9-7c390004b7e9")
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

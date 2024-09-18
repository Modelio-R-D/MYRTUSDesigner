/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 13:03 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TPolicyType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d8f6bcbc-5d73-47fd-bdcb-e62323e3b646")
public class TPolicyType implements IMdaProxy {
    @objid ("26e7dd17-ec04-48f0-b278-b5feca1dd45d")
    public static final String STEREOTYPE_NAME = "TPolicyType";

    @objid ("88181353-8bbd-48e6-b0c7-7c514f05936c")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("4125f963-3ceb-40e7-a849-0611f60dd23b")
    public static final String POLICYLANGUAGE_PROPERTY = "policyLanguage";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("d4b12bec-ce1c-4d5b-8248-d8589dd15d39")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPolicyType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPolicyType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f21958c7-4e58-4c8d-ab40-f7e3c8e92cc0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPolicyType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPolicyType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPolicyType >> then instantiate a {@link TPolicyType} proxy.
     * 
     * @return a {@link TPolicyType} proxy on the created {@link ModelElement}.
     */
    @objid ("a4269ac1-64f1-4b87-a85a-8d190111531b")
    public static TPolicyType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TPolicyType.MdaTypes.STEREOTYPE_ELT);
        return TPolicyType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TPolicyType} proxy from a {@link ModelElement} stereotyped << TPolicyType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TPolicyType} proxy or <i>null</i>.
     */
    @objid ("70409fd9-ec10-4ace-95a3-c303a997dcfe")
    public static TPolicyType instantiate(final ModelElement obj) {
        return TPolicyType.canInstantiate(obj) ? new TPolicyType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPolicyType} proxy from a {@link ModelElement} stereotyped << TPolicyType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TPolicyType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0532c149-4694-4fd1-b5fa-0180da128a9c")
    public static TPolicyType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPolicyType.canInstantiate(obj))
        	return new TPolicyType(obj);
        else
        	throw new IllegalArgumentException("TPolicyType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("28438bb3-65ef-44f2-bf09-3a0bde9613f4")
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
     * Get the value of the 'Association' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7ca4669a-4147-4a54-be94-55c165e1b065")
    public TPolicyType getAssociation() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(TPolicyType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TPolicyType.MdaTypes.MDAASSOCDEP_ROLE), "derivedFrom")
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
    @objid ("912dcfb7-1ef1-4afd-9763-9d8f1cd51e48")
    public String getDescription() {
        String value = this.elt.getProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                                            TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("3986c3d2-20c0-44de-a723-89d30a2aabbd")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPolicyType.policyLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cfa27019-e155-45f1-9a76-afb824250252")
    public String getPolicyLanguage() {
        String value = this.elt.getProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                                            TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("a8dd34f0-8e53-4fbd-ba92-797f3d9189f6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Set the value of the 'Association' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fb68ce8e-2151-43df-9a6e-5e46561f4212")
    public void setAssociation(final TPolicyType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(TPolicyType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TPolicyType.MdaTypes.MDAASSOCDEP_ROLE), "derivedFrom")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(obj.getElement(), this.elt, TPolicyType.MdaTypes.MDAASSOCDEP);
              dep.setName("derivedFrom");
              dep.putTagValue(TPolicyType.MdaTypes.MDAASSOCDEP_ROLE, "derivedFrom");
          }
          dep.setImpacted(obj.getElement());
        }
        
    }

    /**
     * Setter for property 'TPolicyType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2bc8aa79-58e3-48a9-8db4-1c109d1bd526")
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
    @objid ("ba7b3c6f-ab9f-4f12-ba6c-c2156685a83a")
    public void setPolicyLanguage(final String value) {
        this.elt.setProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                             TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT, value));
    }

    @objid ("7e4ba097-2de0-4862-988f-9ff9fb6f777a")
    protected  TPolicyType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1f01f3f5-4dca-4580-8f96-331b8fbcf9b7")
    public static final class MdaTypes {
        @objid ("2ad13f85-b3e1-4ba3-9765-e035c337e258")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("21a422d3-e4a3-4fb6-a3dc-fb1495c64e23")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("4a5eadea-bdf3-45e3-996f-6e3bedd46339")
        public static PropertyDefinition POLICYLANGUAGE_PROPERTY_ELT;

        @objid ("248940bb-5a60-4844-94c0-de01f6d16c51")
        private static Stereotype MDAASSOCDEP;

        @objid ("862c53cf-6b5b-42f5-9983-989e5a04024b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2d188d3e-2a24-4c05-bd00-0c53ace9695d")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "b76dbc7d-8b6f-46f8-89d4-f0ea8eea40d2", "TPolicyType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "eb0df9aa-0b7c-4235-a8a1-f7498491e32d", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d2f2bc40-5d08-4ac9-a826-094f3fe2974a", "policyLanguage");
            POLICYLANGUAGE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICYLANGUAGE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

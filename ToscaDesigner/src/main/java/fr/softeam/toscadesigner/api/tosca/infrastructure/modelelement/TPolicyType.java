/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 24/09/2024 16:22 by Modelio Studio.
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
    @objid ("c8d540f2-ab02-4520-aba8-1a64c302abc0")
    public static final String STEREOTYPE_NAME = "TPolicyType";

    @objid ("23ca9cf1-5deb-47c1-9ffc-d60bb36f455f")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("9c4102b6-19c8-4e5f-a864-bb04e069d275")
    public static final String POLICYLANGUAGE_PROPERTY = "policyLanguage";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("1b5285f1-652c-4269-b94a-3e1925497b77")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPolicyType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPolicyType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("26bab8f1-a651-4aa6-a824-3bc94fa48a60")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPolicyType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPolicyType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPolicyType >> then instantiate a {@link TPolicyType} proxy.
     * 
     * @return a {@link TPolicyType} proxy on the created {@link ModelElement}.
     */
    @objid ("4786972a-2504-435a-95dc-2133186008b8")
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
    @objid ("e3d39b86-9eae-47b0-8452-1c4bcd21b07d")
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
    @objid ("bb6ca0a7-e258-46a6-8545-7fb036796eb2")
    public static TPolicyType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPolicyType.canInstantiate(obj))
        	return new TPolicyType(obj);
        else
        	throw new IllegalArgumentException("TPolicyType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3578c796-8a57-4bce-8d4c-f83732e1ac8e")
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
    @objid ("a89394de-ba94-4137-a2aa-a231954d21a3")
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
    @objid ("9a0088a5-6d72-42f8-9e5d-2df76e0a808a")
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
    @objid ("698db4db-2d5c-40f1-bd87-ee0608bc1c74")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPolicyType.policyLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a76638ed-9c4a-454b-8d72-2264ca8da9f5")
    public String getPolicyLanguage() {
        String value = this.elt.getProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                                            TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("c7bdebf5-f304-4829-8aa9-609db34d97e2")
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
    @objid ("475f0bb3-2699-49f7-992d-c59f02714d53")
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
    @objid ("2f979b4a-7d82-462a-8fd4-684870d62b0d")
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
    @objid ("47b05890-cd8f-4528-adbe-1f3e4baf398c")
    public void setPolicyLanguage(final String value) {
        this.elt.setProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                             TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT, value));
    }

    @objid ("a2e9ea3c-b430-4481-afde-2461ed8e71df")
    protected  TPolicyType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1f01f3f5-4dca-4580-8f96-331b8fbcf9b7")
    public static final class MdaTypes {
        @objid ("50dcd2b2-9d3d-41c2-ad72-65618baa98e6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e9bb7311-5ead-4f5c-bda7-97c5a1909611")
        public static PropertyDefinition POLICYLANGUAGE_PROPERTY_ELT;

        @objid ("6d319d02-ffa2-4431-9196-0381cd8756f7")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("3cf8e2a0-baee-47f8-8956-6e65fbfd9d66")
        private static Stereotype MDAASSOCDEP;

        @objid ("b9d3043d-4c2f-4a7f-965c-4967452c931a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c6b3f59b-cd43-4844-aea8-f2261418176c")
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

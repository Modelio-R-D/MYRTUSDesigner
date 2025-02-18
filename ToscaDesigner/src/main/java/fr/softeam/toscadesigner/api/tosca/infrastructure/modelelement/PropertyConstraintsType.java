/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 18/02/2025 10:30 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << PropertyConstraintsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b006ad78-e0e3-48bc-aaa4-89b8a548757c")
public class PropertyConstraintsType implements IMdaProxy {
    @objid ("07894c10-920e-4c61-95da-a38b1475e91b")
    public static final String STEREOTYPE_NAME = "PropertyConstraintsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("1f1e0339-a3cb-4af6-abe3-8fc5e81af43f")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertyConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertyConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ca2e80ab-19d2-40ef-930d-a4d5ebff0e01")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertyConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertyConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertyConstraintsType >> then instantiate a {@link PropertyConstraintsType} proxy.
     * 
     * @return a {@link PropertyConstraintsType} proxy on the created {@link ModelElement}.
     */
    @objid ("abe5184a-9b1e-41b9-83a5-05582465436d")
    public static PropertyConstraintsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(PropertyConstraintsType.MdaTypes.STEREOTYPE_ELT);
        return PropertyConstraintsType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PropertyConstraintsType} proxy from a {@link ModelElement} stereotyped << PropertyConstraintsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PropertyConstraintsType} proxy or <i>null</i>.
     */
    @objid ("ec1be72f-28db-49c4-aac6-5e75843d47ed")
    public static PropertyConstraintsType instantiate(final ModelElement obj) {
        return PropertyConstraintsType.canInstantiate(obj) ? new PropertyConstraintsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertyConstraintsType} proxy from a {@link ModelElement} stereotyped << PropertyConstraintsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PropertyConstraintsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e75df9cd-eb0c-417d-96a2-2e52414f1bbb")
    public static PropertyConstraintsType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertyConstraintsType.canInstantiate(obj))
        	return new PropertyConstraintsType(obj);
        else
        	throw new IllegalArgumentException("PropertyConstraintsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'propertyConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1a5fa1c6-2d18-4743-8bef-2d0d068ca979")
    public void addPropertyConstraint(final TPropertyConstraint obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PropertyConstraintsType.MdaTypes.MDAASSOCDEP);
            d.setName("propertyConstraint");
            d.putTagValue(PropertyConstraintsType.MdaTypes.MDAASSOCDEP_ROLE, "propertyConstraint");
        }
    }

    @objid ("10bae85c-031d-4607-aa38-7e04e42edfe3")
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
        PropertyConstraintsType other = (PropertyConstraintsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("6fccce02-11d5-4ffc-a3b3-0490d1c5c523")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'propertyConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3b29c115-790e-48df-937f-5ab1eb55eab5")
    public List<TPropertyConstraint> getPropertyConstraint() {
        List<TPropertyConstraint> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(PropertyConstraintsType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(PropertyConstraintsType.MdaTypes.MDAASSOCDEP_ROLE), "propertyConstraint")
              && TPropertyConstraint.canInstantiate(d.getDependsOn()))
                results.add((TPropertyConstraint)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPropertyConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ff4b4187-2e3b-42cc-bdfb-2b9e8a1b8a9b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'propertyConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("61ee6e8e-2ca7-416c-983b-ac2e808b54e3")
    public boolean removePropertyConstraint(final TPropertyConstraint obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(PropertyConstraintsType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(PropertyConstraintsType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("fb50c2fd-3f0d-4df3-a4bb-92fd3b3f8550")
    protected  PropertyConstraintsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("fdd62aca-095a-4beb-a8b8-aefa4b716a7b")
    public static final class MdaTypes {
        @objid ("e5aff48c-f4a2-47ac-9620-4b4d063b8d73")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2f3d9195-f663-4b3c-bc7e-544d8b37ab15")
        private static Stereotype MDAASSOCDEP;

        @objid ("aaa0a035-df1c-4d9a-96b5-17be0d2f4fae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b77963fc-0517-418c-ae1f-99c7b0aefc3b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "5ac0df25-6ae2-4120-b42a-a2299c2fb48e", "PropertyConstraintsType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
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

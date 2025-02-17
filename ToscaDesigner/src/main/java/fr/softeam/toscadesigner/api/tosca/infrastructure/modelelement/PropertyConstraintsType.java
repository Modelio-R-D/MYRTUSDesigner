/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 18:02 by Modelio Studio.
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
    @objid ("77a6d47a-e727-49c2-ab5a-b7c3d64d5d09")
    public static final String STEREOTYPE_NAME = "PropertyConstraintsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("40ce7977-4960-4978-9b7e-9f5d120dc517")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertyConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertyConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3241c93d-274a-4d15-ac74-c7ff5220362c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertyConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertyConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertyConstraintsType >> then instantiate a {@link PropertyConstraintsType} proxy.
     * 
     * @return a {@link PropertyConstraintsType} proxy on the created {@link ModelElement}.
     */
    @objid ("6983af45-07ca-499c-979b-06dfa84c7d82")
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
    @objid ("0e171d27-b5e3-4a31-97bb-a12c70fc53a1")
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
    @objid ("79ec82f8-ffc9-482a-8d2a-bc088bf8259d")
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
    @objid ("b97358b7-0c3c-4176-aa0a-7f74f35a9897")
    public void addPropertyConstraint(final TPropertyConstraint obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PropertyConstraintsType.MdaTypes.MDAASSOCDEP);
            d.setName("propertyConstraint");
            d.putTagValue(PropertyConstraintsType.MdaTypes.MDAASSOCDEP_ROLE, "propertyConstraint");
        }
    }

    @objid ("15269060-db7a-43df-81ba-fa7f651da4f2")
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
    @objid ("3ded9cd9-b8f4-434c-8fb0-85d5e053faf7")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'propertyConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("01b6c6aa-389a-434b-ac67-25896133a55c")
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

    @objid ("c3118988-d293-4191-b35a-61a13dd7b040")
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
    @objid ("52be861b-3514-42cc-8f77-bde0f67d629a")
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

    @objid ("5a9ad66a-faee-4d70-a2fe-09c8c8d1b029")
    protected  PropertyConstraintsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("fdd62aca-095a-4beb-a8b8-aefa4b716a7b")
    public static final class MdaTypes {
        @objid ("d7628ae6-af2a-4262-bfe9-6cbeffda1555")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0eee1db5-4153-4491-b774-2d7e3511fbb3")
        private static Stereotype MDAASSOCDEP;

        @objid ("eecb5b2f-ebc2-4387-8166-3a904a816d86")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("551927a7-e706-4636-8959-08973d0d7852")
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

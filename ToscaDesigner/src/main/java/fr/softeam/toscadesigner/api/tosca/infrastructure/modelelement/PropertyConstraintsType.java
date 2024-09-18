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
 * Proxy class to handle a {@link ModelElement} with << PropertyConstraintsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b2e123a2-fea1-4385-8f04-93d039881666")
public class PropertyConstraintsType implements IMdaProxy {
    @objid ("f9420d1f-c25a-40dc-82d2-ff1ee39931bc")
    public static final String STEREOTYPE_NAME = "PropertyConstraintsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("65453532-c6c5-403b-93b8-b3ae64ebd662")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertyConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertyConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3451eb43-faf2-4eb2-afa0-d495134aa36d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertyConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertyConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertyConstraintsType >> then instantiate a {@link PropertyConstraintsType} proxy.
     * 
     * @return a {@link PropertyConstraintsType} proxy on the created {@link ModelElement}.
     */
    @objid ("64bf9d24-a32d-4fae-822f-8393227ce9f8")
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
    @objid ("5f1eaadc-81b1-4b4b-b045-e9b9a39d23d2")
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
    @objid ("a81f3b6d-4789-4923-aeae-159f40b28399")
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
    @objid ("53bc0cbf-2dc0-41d2-b5c0-d7621f383f39")
    public void addPropertyConstraint(final TPropertyConstraint obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PropertyConstraintsType.MdaTypes.MDAASSOCDEP);
            d.setName("propertyConstraint");
            d.putTagValue(PropertyConstraintsType.MdaTypes.MDAASSOCDEP_ROLE, "propertyConstraint");
        }
    }

    @objid ("bfe3afd0-8e50-4f9a-91f6-c7a60b4dedac")
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
    @objid ("2ebcdbba-5077-40f4-b385-5a22c5b7904d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'propertyConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b53f5c0b-e24d-4813-a387-50890af354f0")
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

    @objid ("b616a73b-0e34-4b6c-a610-3221761ce1d6")
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
    @objid ("f633be0b-bc5f-4003-8df7-8cded339d530")
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

    @objid ("ded09e57-0552-442e-aaa5-0e2fb2ddf5f9")
    protected  PropertyConstraintsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("4d1319e4-c890-482a-bff7-80bebd8556be")
    public static final class MdaTypes {
        @objid ("42286120-f1e8-4484-bb67-8d2b3b206cb1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("191fae0f-3272-4f6e-bc89-6a8651d696c9")
        private static Stereotype MDAASSOCDEP;

        @objid ("1c072969-7fb1-4162-b59f-5460f3685812")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0f58ecae-d59b-44ab-85de-ea892e87731c")
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

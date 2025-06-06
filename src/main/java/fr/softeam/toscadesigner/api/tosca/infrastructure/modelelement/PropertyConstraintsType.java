/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 04/06/2025 20:07 by Modelio Studio.
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
@objid ("d7bd0447-8359-422f-8a7a-abc35a379fb6")
public class PropertyConstraintsType implements IMdaProxy {
    @objid ("eeedc600-4a29-4155-8908-20c9d85e83c2")
    public static final String STEREOTYPE_NAME = "PropertyConstraintsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("c49bc80c-8dbd-44db-9bf9-d5269936c524")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertyConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertyConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("767827d9-5d5e-477f-858e-2e1612219a78")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertyConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertyConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertyConstraintsType >> then instantiate a {@link PropertyConstraintsType} proxy.
     * 
     * @return a {@link PropertyConstraintsType} proxy on the created {@link ModelElement}.
     */
    @objid ("3b8b898b-ca1f-4dc5-8f19-3ca21fb916e7")
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
    @objid ("9730c6df-6330-4042-b750-53e8945f8eea")
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
    @objid ("f72df240-0fa3-48c3-af66-34e42a616498")
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
    @objid ("0a13ac98-5eaa-427f-93e2-dd8b9a3c227b")
    public void addPropertyConstraint(final TPropertyConstraint obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PropertyConstraintsType.MdaTypes.MDAASSOCDEP);
            d.setName("propertyConstraint");
            d.putTagValue(PropertyConstraintsType.MdaTypes.MDAASSOCDEP_ROLE, "propertyConstraint");
        }
    }

    @objid ("42a52d7f-2fa2-42d8-a254-0345e4c2c877")
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
    @objid ("3f2bd2bf-b81a-4aa0-95c7-890db1c6a60d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'propertyConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fa797f4b-7d30-492f-be74-a5f69d566f5a")
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

    @objid ("6d6ec6e8-5a08-4722-b29e-4d7f4f765f60")
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
    @objid ("ae41e075-bddf-4156-83b2-38389503eb57")
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

    @objid ("0249553e-8d04-44d1-b842-430be62798ee")
    protected  PropertyConstraintsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("b5991086-4084-4582-96c2-121d66f390b1")
    public static final class MdaTypes {
        @objid ("1ad68681-9d6f-4744-a9c9-dc45b9a124c2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("20a5ab5b-2551-4bf4-bec1-8fcee3d95ac4")
        private static Stereotype MDAASSOCDEP;

        @objid ("4c321ac7-f1a2-480d-9bc0-b4bc2ef07757")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4d3fc53b-e82c-4ab9-a64d-cfd107111dbd")
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

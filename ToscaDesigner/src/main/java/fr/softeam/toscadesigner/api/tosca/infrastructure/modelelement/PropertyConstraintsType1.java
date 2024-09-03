/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 15:34 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << PropertyConstraintsType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6ad7e1cf-45a6-4e7f-b37c-c15bbcd51f66")
public class PropertyConstraintsType1 implements IMdaProxy {
    @objid ("eb9da016-1f76-409e-a8c9-5a1269455b8a")
    public static final String STEREOTYPE_NAME = "PropertyConstraintsType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("2d7653bc-7a83-4d45-bd1b-670d9a35cf8a")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertyConstraintsType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertyConstraintsType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d70facac-59af-478b-a4d9-94b2a5925710")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertyConstraintsType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertyConstraintsType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertyConstraintsType1 >> then instantiate a {@link PropertyConstraintsType1} proxy.
     * 
     * @return a {@link PropertyConstraintsType1} proxy on the created {@link ModelElement}.
     */
    @objid ("bf503c7c-72d6-462c-95a5-3f1e6b41286e")
    public static PropertyConstraintsType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(PropertyConstraintsType1.MdaTypes.STEREOTYPE_ELT);
        return PropertyConstraintsType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PropertyConstraintsType1} proxy from a {@link ModelElement} stereotyped << PropertyConstraintsType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PropertyConstraintsType1} proxy or <i>null</i>.
     */
    @objid ("adef2b43-6ec5-422d-b4dc-4e3b1efabc86")
    public static PropertyConstraintsType1 instantiate(final ModelElement obj) {
        return PropertyConstraintsType1.canInstantiate(obj) ? new PropertyConstraintsType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertyConstraintsType1} proxy from a {@link ModelElement} stereotyped << PropertyConstraintsType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PropertyConstraintsType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("706d4c6c-6e68-4cd3-86a5-888bc6d2aeaa")
    public static PropertyConstraintsType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertyConstraintsType1.canInstantiate(obj))
        	return new PropertyConstraintsType1(obj);
        else
        	throw new IllegalArgumentException("PropertyConstraintsType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'propertyConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5c67c12d-025a-4cb7-a37f-99eae7d4ddd4")
    public void addPropertyConstraint(final TPropertyConstraint obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PropertyConstraintsType1.MdaTypes.MDAASSOCDEP);
            d.setName("propertyConstraint");
            d.putTagValue(PropertyConstraintsType1.MdaTypes.MDAASSOCDEP_ROLE, "propertyConstraint");
        }
    }

    @objid ("52da7a5c-d9ef-4adc-aa68-638a68e05595")
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
        PropertyConstraintsType1 other = (PropertyConstraintsType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("a76a7fb2-1d92-48b2-a3a8-3cf118e3257b")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'propertyConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("070dc6b3-f713-4cfe-825d-cff4c18e9e9b")
    public List<TPropertyConstraint> getPropertyConstraint() {
        List<TPropertyConstraint> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(PropertyConstraintsType1.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(PropertyConstraintsType1.MdaTypes.MDAASSOCDEP_ROLE), "propertyConstraint")
              && TPropertyConstraint.canInstantiate(d.getDependsOn()))
                results.add((TPropertyConstraint)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPropertyConstraint.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3a3d128b-7e73-4aed-8325-892673f3ee0e")
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
    @objid ("a3864902-d956-4302-8a6b-1b36f0d1916b")
    public boolean removePropertyConstraint(final TPropertyConstraint obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(PropertyConstraintsType1.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(PropertyConstraintsType1.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("5acec099-7b26-4139-afe4-6e1215ca9f0c")
    protected  PropertyConstraintsType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d87b2e53-9cea-4cf4-9be3-cecb964c78ef")
    public static final class MdaTypes {
        @objid ("bd2d8725-b7d6-4acb-ac36-211dc3350383")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("712bff43-1d89-412a-bd2f-2c70dbfcb5cf")
        private static Stereotype MDAASSOCDEP;

        @objid ("250272e1-c1f3-4ee1-aa26-0366cee7b1e2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("02a3fb8f-321d-4248-8e2b-d113ae3cf8d5")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "8b78e373-d3e6-4df8-b603-008c8201bcb2", "PropertyConstraintsType1");
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

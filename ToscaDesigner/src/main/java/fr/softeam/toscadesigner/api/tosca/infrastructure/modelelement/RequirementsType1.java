/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 12:14 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << RequirementsType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("961deec9-eec3-4ffb-9e27-f0c2cc3708f4")
public class RequirementsType1 implements IMdaProxy {
    @objid ("4a468a0b-62f7-4d38-a273-cee5f23f375c")
    public static final String STEREOTYPE_NAME = "RequirementsType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("3dc9b5d6-58c2-4328-9c43-405ce2d6566d")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RequirementsType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RequirementsType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b4fe1687-d7fe-4406-bf83-f3b117655423")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RequirementsType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RequirementsType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RequirementsType1 >> then instantiate a {@link RequirementsType1} proxy.
     * 
     * @return a {@link RequirementsType1} proxy on the created {@link ModelElement}.
     */
    @objid ("4b52ab19-1fde-4c6a-90fe-f03a021cc3d1")
    public static RequirementsType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(RequirementsType1.MdaTypes.STEREOTYPE_ELT);
        return RequirementsType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link RequirementsType1} proxy from a {@link ModelElement} stereotyped << RequirementsType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link RequirementsType1} proxy or <i>null</i>.
     */
    @objid ("7d711667-5d62-4750-b946-f11155b4494a")
    public static RequirementsType1 instantiate(final ModelElement obj) {
        return RequirementsType1.canInstantiate(obj) ? new RequirementsType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementsType1} proxy from a {@link ModelElement} stereotyped << RequirementsType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link RequirementsType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("096ba882-7726-4962-b74e-4ac745949f5b")
    public static RequirementsType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RequirementsType1.canInstantiate(obj))
        	return new RequirementsType1(obj);
        else
        	throw new IllegalArgumentException("RequirementsType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1b74d43d-094d-4c6d-b2ca-0347fee7ef1f")
    public void addRequirement(final TRequirementRef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RequirementsType1.MdaTypes.MDAASSOCDEP);
            d.setName("requirement");
            d.putTagValue(RequirementsType1.MdaTypes.MDAASSOCDEP_ROLE, "requirement");
        }
    }

    @objid ("bd8debc8-6230-454f-9daa-c9c74f8e50d8")
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
        RequirementsType1 other = (RequirementsType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("83c6cc33-1405-4c76-9a5e-8f96ea72137e")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("42651d0a-f15c-4173-9732-65e9965a5786")
    public List<TRequirementRef> getRequirement() {
        List<TRequirementRef> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(RequirementsType1.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(RequirementsType1.MdaTypes.MDAASSOCDEP_ROLE), "requirement")
              && TRequirementRef.canInstantiate(d.getDependsOn()))
                results.add((TRequirementRef)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRequirementRef.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("765df556-7cba-454c-8f30-c4554b3a0171")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3b9b37be-ab45-489a-9473-956e0802a6e0")
    public boolean removeRequirement(final TRequirementRef obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(RequirementsType1.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementsType1.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("d1adfa7f-42b9-441c-a753-9a28444cfc85")
    protected  RequirementsType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("f04ed0fc-bb14-4375-8491-fbfa12489297")
    public static final class MdaTypes {
        @objid ("34b731a1-0d78-47f2-b076-559cf675cb63")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("45d9efc6-4310-4c58-ace0-3b57d79d682d")
        private static Stereotype MDAASSOCDEP;

        @objid ("f9e8f853-1fff-4d07-b33d-3eaa329f3b4f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("253ad2cb-1e9f-4b6b-979c-aae4df95017e")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1619c049-eb99-43e3-ba5c-759073903d43", "RequirementsType1");
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

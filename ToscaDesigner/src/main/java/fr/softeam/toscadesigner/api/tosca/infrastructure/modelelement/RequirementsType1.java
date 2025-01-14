/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 17:57 by Modelio Studio.
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
    @objid ("15e63693-bf3f-4ef9-a52e-6162952378ea")
    public static final String STEREOTYPE_NAME = "RequirementsType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("30661584-bb85-4d59-916a-2384649429af")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RequirementsType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RequirementsType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1e6a8b87-1d01-47c1-940b-802a0d054d78")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RequirementsType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RequirementsType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RequirementsType1 >> then instantiate a {@link RequirementsType1} proxy.
     * 
     * @return a {@link RequirementsType1} proxy on the created {@link ModelElement}.
     */
    @objid ("0661929f-97db-4989-b552-48bc75f7b3fe")
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
    @objid ("8c45b4a9-13f7-462f-9bee-8c94b64811d0")
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
    @objid ("6a4f5c06-fc1a-466b-b729-302d95fb46ae")
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
    @objid ("d6208b0e-0191-4648-bb5c-1084d26d6c59")
    public void addRequirement(final TRequirementRef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RequirementsType1.MdaTypes.MDAASSOCDEP);
            d.setName("requirement");
            d.putTagValue(RequirementsType1.MdaTypes.MDAASSOCDEP_ROLE, "requirement");
        }
    }

    @objid ("ab45a3e8-cab4-4cc8-84fd-86e0787c1671")
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
    @objid ("13a7a4d6-61a1-440f-8f83-3b70321ea5d3")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ae60f806-b6fb-4f93-afc0-80446eb36895")
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

    @objid ("8b5130d7-5ad9-4dc8-b29f-9970ab505ca3")
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
    @objid ("78fb294e-7080-4ec7-a010-ed4bd29e1944")
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

    @objid ("e3df14fd-eae7-4fd2-b1c2-9d83675934d9")
    protected  RequirementsType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("f04ed0fc-bb14-4375-8491-fbfa12489297")
    public static final class MdaTypes {
        @objid ("5f85b683-6379-4182-b1ae-f1b6e065fc4b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("480dbb55-45d1-4915-8275-511a11d0cc36")
        private static Stereotype MDAASSOCDEP;

        @objid ("8dc083fd-77ec-4982-8ddd-e99992a957af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5489d173-e266-40b4-8397-2445a0a4934b")
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

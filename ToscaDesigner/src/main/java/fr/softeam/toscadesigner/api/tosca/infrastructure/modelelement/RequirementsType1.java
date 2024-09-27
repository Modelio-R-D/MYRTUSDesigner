/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/09/2024 11:42 by Modelio Studio.
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
    @objid ("e8d331ff-f740-4dfa-be14-853ab1b5ddac")
    public static final String STEREOTYPE_NAME = "RequirementsType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("66ff8c56-b955-4e9a-85b7-9b92a20224bb")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RequirementsType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RequirementsType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a996f581-0da0-437d-ba8e-44496866f69f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RequirementsType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RequirementsType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RequirementsType1 >> then instantiate a {@link RequirementsType1} proxy.
     * 
     * @return a {@link RequirementsType1} proxy on the created {@link ModelElement}.
     */
    @objid ("e49cd9ea-9c5c-4cd2-b66c-6e7ed43fa76c")
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
    @objid ("f8ef9185-991b-46de-977a-cc3dfa6d97d2")
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
    @objid ("f36386a0-4e4d-4bdd-b6cd-8361f741820e")
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
    @objid ("00415957-dddf-412d-899f-9144f175a402")
    public void addRequirement(final TRequirementRef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RequirementsType1.MdaTypes.MDAASSOCDEP);
            d.setName("requirement");
            d.putTagValue(RequirementsType1.MdaTypes.MDAASSOCDEP_ROLE, "requirement");
        }
    }

    @objid ("fea39395-bd08-4353-8b2f-a1be46165b13")
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
    @objid ("beb8034d-7476-4fde-b1ab-0098f329729c")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4e059a2d-8bf8-4a38-b38d-80387d388a2b")
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

    @objid ("b862c8e6-09cd-4f45-ba82-69bacc59975a")
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
    @objid ("79ca90d3-f61d-4687-b690-4b938729dd7e")
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

    @objid ("1c651c4f-a762-4382-9a61-51f6f1872401")
    protected  RequirementsType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("f04ed0fc-bb14-4375-8491-fbfa12489297")
    public static final class MdaTypes {
        @objid ("78e50824-d8b2-4838-ae8d-d7e6a0deb318")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5942f5dc-0dbf-47fd-8273-d3459ff00a8f")
        private static Stereotype MDAASSOCDEP;

        @objid ("208517a2-52c2-444e-9aeb-65980f31f8cc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2dad7b85-c65f-40ee-a9aa-3825e6f13f88")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 15:42 by Modelio Studio.
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
    @objid ("d290f3cc-0d64-48ce-a867-e8588653b91b")
    public static final String STEREOTYPE_NAME = "RequirementsType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("84c96267-8856-4d5b-a845-5c1031a987a2")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RequirementsType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RequirementsType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e577f40e-bef6-44f9-b9db-eed3c8b06c38")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RequirementsType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RequirementsType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RequirementsType1 >> then instantiate a {@link RequirementsType1} proxy.
     * 
     * @return a {@link RequirementsType1} proxy on the created {@link ModelElement}.
     */
    @objid ("4a83a514-c273-4714-bd9f-02eacadafdcc")
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
    @objid ("ed153fed-c5ea-4a14-9dd5-336f999b86b1")
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
    @objid ("9e15d910-3473-4561-ba6a-2128fb4a1ac0")
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
    @objid ("06fd0c6a-ffb2-4d9d-a980-ee59e93baddc")
    public void addRequirement(final TRequirementRef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RequirementsType1.MdaTypes.MDAASSOCDEP);
            d.setName("requirement");
            d.putTagValue(RequirementsType1.MdaTypes.MDAASSOCDEP_ROLE, "requirement");
        }
    }

    @objid ("7da13b58-93a0-4c43-b556-8ce5c1a48ff2")
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
    @objid ("7a06f0cf-7b57-40c0-8c54-616eba14849e")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ab7c805d-f568-447e-99c5-6f163d98c486")
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

    @objid ("8744a50b-855b-4924-a62f-d967b85b73a9")
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
    @objid ("80ee55c2-ef6a-4c1c-bac0-aa4fb4a48b67")
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

    @objid ("c19cff12-51a4-475a-8226-ccbadb1178f8")
    protected  RequirementsType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("f04ed0fc-bb14-4375-8491-fbfa12489297")
    public static final class MdaTypes {
        @objid ("1e7975a7-b36f-4ed4-b4e9-884f2f82474b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c84e40b6-0768-431d-9e8b-a412921a0c2e")
        private static Stereotype MDAASSOCDEP;

        @objid ("ee8dc4d1-b513-4448-ad13-21dc63abe3c7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1a8eab2e-7cbc-42c2-a1d3-af7841aa0d4d")
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

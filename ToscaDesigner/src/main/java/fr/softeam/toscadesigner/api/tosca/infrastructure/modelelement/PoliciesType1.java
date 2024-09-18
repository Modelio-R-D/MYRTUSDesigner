/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 12:01 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TPolicy;
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
 * Proxy class to handle a {@link ModelElement} with << PoliciesType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("29535275-7586-4223-8df5-7d93af6b7bd0")
public class PoliciesType1 implements IMdaProxy {
    @objid ("df1b91f9-a3b8-4920-a50d-a42c9060331c")
    public static final String STEREOTYPE_NAME = "PoliciesType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("7873ece9-be0f-4bf9-b610-0fe8f5324dd1")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PoliciesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PoliciesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0fea3ad6-8fed-4c1b-a163-045f6fb09f4a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PoliciesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PoliciesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PoliciesType1 >> then instantiate a {@link PoliciesType1} proxy.
     * 
     * @return a {@link PoliciesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("7b8f66fb-42d1-407f-a1d0-4ebdb9fc3af8")
    public static PoliciesType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(PoliciesType1.MdaTypes.STEREOTYPE_ELT);
        return PoliciesType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PoliciesType1} proxy from a {@link ModelElement} stereotyped << PoliciesType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PoliciesType1} proxy or <i>null</i>.
     */
    @objid ("2e791e16-4c43-48ad-b1a3-747cac6e6638")
    public static PoliciesType1 instantiate(final ModelElement obj) {
        return PoliciesType1.canInstantiate(obj) ? new PoliciesType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PoliciesType1} proxy from a {@link ModelElement} stereotyped << PoliciesType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PoliciesType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e3f70b33-b60a-42ff-b981-22c225c3f756")
    public static PoliciesType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PoliciesType1.canInstantiate(obj))
        	return new PoliciesType1(obj);
        else
        	throw new IllegalArgumentException("PoliciesType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'policy' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2feb4c15-c3c5-439a-932c-c6c255ee4b14")
    public void addPolicy(final TPolicy obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PoliciesType1.MdaTypes.MDAASSOCDEP);
            d.setName("policy");
            d.putTagValue(PoliciesType1.MdaTypes.MDAASSOCDEP_ROLE, "policy");
        }
    }

    @objid ("eb43c1e7-f08d-46c2-a0b9-c2ccd448c911")
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
        PoliciesType1 other = (PoliciesType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("5eeeb91f-7e28-4421-aa76-9c2e41934aae")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'policy' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("57fe645d-f692-4536-a433-5b6c119b21df")
    public List<TPolicy> getPolicy() {
        List<TPolicy> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(PoliciesType1.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(PoliciesType1.MdaTypes.MDAASSOCDEP_ROLE), "policy")
              && TPolicy.canInstantiate(d.getDependsOn()))
                results.add((TPolicy)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPolicy.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3a578668-da0c-4c5c-803a-7325ed63b269")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'policy' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("91145705-7ee7-444d-b868-5f2d9eb6926b")
    public boolean removePolicy(final TPolicy obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(PoliciesType1.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(PoliciesType1.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("5c27d0e5-87df-42b0-901d-9232c7bce570")
    protected  PoliciesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("c98f87c2-726a-40cb-91f8-6f0f73f24182")
    public static final class MdaTypes {
        @objid ("2c503e47-c2b9-4883-a43a-e751f167472e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d31a8d0d-a9f1-44ee-8139-ec51ef7ed328")
        private static Stereotype MDAASSOCDEP;

        @objid ("35475d45-7677-4af0-9222-e2902cbefd72")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fccc161d-71f0-4c66-beff-8351d0232836")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "941ef924-e37d-4b4b-ba3d-ded20d4c3ccd", "PoliciesType1");
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

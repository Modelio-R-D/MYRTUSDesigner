/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 13/02/2025 17:54 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicy;
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
@objid ("7f34e1ea-0e8a-4654-ab1c-eba9c35ff4b8")
public class PoliciesType1 implements IMdaProxy {
    @objid ("f6a272be-3238-4230-85e3-c0ec42c3e6c3")
    public static final String STEREOTYPE_NAME = "PoliciesType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("5927453e-870c-4d6a-a2de-26a3ffd5cc03")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PoliciesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PoliciesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1934df9f-540d-4c99-845f-63986d7501c0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PoliciesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PoliciesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PoliciesType1 >> then instantiate a {@link PoliciesType1} proxy.
     * 
     * @return a {@link PoliciesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("09d7a074-cd99-489d-b48a-79d6ff72be24")
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
    @objid ("46b051e3-999e-4a3c-8291-7fb317de0ad0")
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
    @objid ("0951ba3f-b571-4c12-bbc5-fe25eb5284de")
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
    @objid ("5f55b688-ee83-4872-bddd-7d4c69f242e7")
    public void addPolicy(final TPolicy obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PoliciesType1.MdaTypes.MDAASSOCDEP);
            d.setName("policy");
            d.putTagValue(PoliciesType1.MdaTypes.MDAASSOCDEP_ROLE, "policy");
        }
    }

    @objid ("06670a43-1057-4209-a9a7-9b007c5bedc3")
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
    @objid ("e541773b-df35-4be0-935e-61b760623da0")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'policy' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("237c16d1-f520-4bf6-aebe-8b5499b0bf37")
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

    @objid ("9bd5f3a3-c098-4ae6-9367-89bde095f82f")
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
    @objid ("f3e9faf1-23b9-44f2-9fb1-369f4782bc27")
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

    @objid ("4104a7ff-0918-4141-8f4e-8fa1453b31de")
    protected  PoliciesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("a9a07197-29fa-476a-ac12-00d9d198f271")
    public static final class MdaTypes {
        @objid ("b01d85a2-b95c-42ab-a14a-151b5091335a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("55e935ec-10bd-492c-9004-17c0281ec4d5")
        private static Stereotype MDAASSOCDEP;

        @objid ("4bd3dd38-f607-4355-8291-4a7da447225c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aeb01bbf-55eb-4cb1-99c7-feadf23b29df")
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

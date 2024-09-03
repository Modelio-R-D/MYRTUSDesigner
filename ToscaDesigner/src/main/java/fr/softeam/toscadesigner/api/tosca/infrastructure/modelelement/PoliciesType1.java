/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 18:12 by Modelio Studio.
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
@objid ("870545aa-7011-43c5-ac2f-08d740738990")
public class PoliciesType1 implements IMdaProxy {
    @objid ("528ad2eb-c97c-406c-8f3e-7074d95889ee")
    public static final String STEREOTYPE_NAME = "PoliciesType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("823772e3-f4b0-493f-b2f4-dbbe925296c5")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PoliciesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PoliciesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a1826a7a-8cd4-448a-a35a-da44ddc2d0a1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PoliciesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PoliciesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PoliciesType1 >> then instantiate a {@link PoliciesType1} proxy.
     * 
     * @return a {@link PoliciesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("0cf2ac8e-4ead-4dd9-9ca0-045290750251")
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
    @objid ("fa06d93f-67ec-4bf6-8a40-4cdc174e7adc")
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
    @objid ("cd29177f-ba4a-4eb3-99b8-d50e90d53290")
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
    @objid ("38104140-7a9b-489d-888b-56812e24dd9c")
    public void addPolicy(final TPolicy obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PoliciesType1.MdaTypes.MDAASSOCDEP);
            d.setName("policy");
            d.putTagValue(PoliciesType1.MdaTypes.MDAASSOCDEP_ROLE, "policy");
        }
    }

    @objid ("336afe13-c542-4d83-925c-d6edd5e23e4b")
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
    @objid ("50dc7bfb-a728-451c-a4f6-c95d02fe22c4")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'policy' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fd2b78f6-74ea-4bec-95a9-36930297785c")
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

    @objid ("48a802d9-8ba8-4c9e-8df4-54e46938db1c")
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
    @objid ("c5ee2040-86ed-4f5f-804c-ec2fbc13af04")
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

    @objid ("8b20391f-f0a5-4854-9a13-4e7ab58ab8c1")
    protected  PoliciesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("4a2fad26-b581-47a4-b958-cfd6872bfab9")
    public static final class MdaTypes {
        @objid ("e676e1dc-6b4b-4d92-95ec-6d6406527d1a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0f04d73d-9c34-4ef2-89c9-63493434b5c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("3803b365-99d9-49f6-ab40-26ae76cc84af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("86642d54-3b0e-4b00-ba0c-771c023a21ab")
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

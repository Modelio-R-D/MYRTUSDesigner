/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 17:26 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << PoliciesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e378fe6d-96a6-4dd7-b45b-06a63852cedd")
public class PoliciesType implements IMdaProxy {
    @objid ("1e685ac0-16a8-461e-abbd-0fb967fdba9c")
    public static final String STEREOTYPE_NAME = "PoliciesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("47164793-86df-4b51-92ed-4bfe6fb266f0")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PoliciesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PoliciesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c6c259ff-2dd9-4490-b576-8e07b31f18fc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PoliciesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PoliciesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PoliciesType >> then instantiate a {@link PoliciesType} proxy.
     * 
     * @return a {@link PoliciesType} proxy on the created {@link ModelElement}.
     */
    @objid ("5bbc611e-dab8-4cf1-acc1-a8ca136f467f")
    public static PoliciesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(PoliciesType.MdaTypes.STEREOTYPE_ELT);
        return PoliciesType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PoliciesType} proxy from a {@link ModelElement} stereotyped << PoliciesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PoliciesType} proxy or <i>null</i>.
     */
    @objid ("90d98e57-e18f-48a8-bfca-b7576a21ea8a")
    public static PoliciesType instantiate(final ModelElement obj) {
        return PoliciesType.canInstantiate(obj) ? new PoliciesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PoliciesType} proxy from a {@link ModelElement} stereotyped << PoliciesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PoliciesType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f1415ab8-3c08-4146-a326-8b12affee14f")
    public static PoliciesType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PoliciesType.canInstantiate(obj))
        	return new PoliciesType(obj);
        else
        	throw new IllegalArgumentException("PoliciesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'policy' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("37aebc7a-5d91-4f32-b9f3-fc87d22db0c3")
    public void addPolicy(final TPolicy obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PoliciesType.MdaTypes.MDAASSOCDEP);
            d.setName("policy");
            d.putTagValue(PoliciesType.MdaTypes.MDAASSOCDEP_ROLE, "policy");
        }
    }

    @objid ("2e3900c8-3e22-46f5-85e5-514e2e91c974")
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
        PoliciesType other = (PoliciesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("668e3340-c424-46b9-b9c0-bb40b917996b")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'policy' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8b7ab080-ce7f-415b-9e3c-52d773fdd59f")
    public List<TPolicy> getPolicy() {
        List<TPolicy> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(PoliciesType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(PoliciesType.MdaTypes.MDAASSOCDEP_ROLE), "policy")
              && TPolicy.canInstantiate(d.getDependsOn()))
                results.add((TPolicy)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPolicy.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e1f1c0a2-089a-4335-ad3d-42bad7b4d9b0")
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
    @objid ("ebfb4725-0321-4a28-bedd-8c3807799047")
    public boolean removePolicy(final TPolicy obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(PoliciesType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(PoliciesType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("8f197a7d-a86c-4a39-9262-1ffc927d8e81")
    protected  PoliciesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("65c722b0-b2d8-4cd3-955d-d870fa290a03")
    public static final class MdaTypes {
        @objid ("0821be40-f349-4c06-92af-a11c0a48f0b1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("038f97c4-9914-4745-838f-2869f7a1cc3a")
        private static Stereotype MDAASSOCDEP;

        @objid ("00f09f75-1319-4f9d-abaa-c2490e4139af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("68a94352-abb1-4640-bcce-6fd0ceb780e7")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "205759e2-44bb-4cb3-b19e-8cfbed4f9435", "PoliciesType");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
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
@objid ("29535275-7586-4223-8df5-7d93af6b7bd0")
public class PoliciesType1 implements IMdaProxy {
    @objid ("3aa95ad2-1b3a-47c1-bd14-181089309837")
    public static final String STEREOTYPE_NAME = "PoliciesType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("ce8916dd-d89a-4621-a3c9-fb45002016b5")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PoliciesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PoliciesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("719d8c7f-65b8-4c66-a936-b8642abcce77")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PoliciesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PoliciesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PoliciesType1 >> then instantiate a {@link PoliciesType1} proxy.
     * @return a {@link PoliciesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("7e5d175e-b659-4f96-b826-7a7f58a4235e")
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
    @objid ("f5f4b6c7-40d6-451b-9979-174616f12820")
    public static PoliciesType1 instantiate(final ModelElement obj) {
        return PoliciesType1.canInstantiate(obj) ? new PoliciesType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PoliciesType1} proxy from a {@link ModelElement} stereotyped << PoliciesType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PoliciesType1} proxy.
     */
    @objid ("fc2297cd-d0d2-496d-b87e-6843d0eda254")
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
     */
    @objid ("4b125755-8f0d-456e-87e0-ace5c5613514")
    public void addPolicy(final TPolicy obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PoliciesType1.MdaTypes.MDAASSOCDEP);
            d.setName("policy");
            d.putTagValue(PoliciesType1.MdaTypes.MDAASSOCDEP_ROLE, "policy");
        }
    }

    @objid ("d694e619-3546-4fed-bd6d-825b19b1bd4d")
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
    @objid ("36b17d06-5aa5-4914-8218-f7d1cfc0efad")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'policy' role.<p>
     * Role description:
     * null
     */
    @objid ("3bf9e439-68ba-441e-affe-53bd8f717511")
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

    @objid ("ca0ea236-629b-4c27-88a0-070de4c4e5f7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'policy' role.<p>
     * Role description:
     * null
     */
    @objid ("4f53a933-628e-400f-a38d-7cd8ae927671")
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

    @objid ("3f6ad92e-908d-4c87-a709-0ee4ebbe9494")
    protected  PoliciesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("c98f87c2-726a-40cb-91f8-6f0f73f24182")
    public static final class MdaTypes {
        @objid ("10b4960b-c8f3-47ec-bbc7-65fa1afd3e64")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d79e5486-212c-4f97-8eb1-d2a74b9bfa57")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c4a3763-ee64-4c81-bec3-ded406767045")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8cb07648-5c26-4c81-a2e4-60e4172c2b4b")
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

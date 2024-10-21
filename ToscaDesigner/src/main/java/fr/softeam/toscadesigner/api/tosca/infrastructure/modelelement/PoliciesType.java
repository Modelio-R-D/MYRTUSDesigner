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
 * Proxy class to handle a {@link ModelElement} with << PoliciesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("12ea8b13-8b7c-448c-96f2-279921d88616")
public class PoliciesType implements IMdaProxy {
    @objid ("bdeb4f67-2b4c-4d48-9ffd-25dbb5d356f9")
    public static final String STEREOTYPE_NAME = "PoliciesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("c18f05e1-eb70-4bd1-9bc5-5f9f9e011a32")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PoliciesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PoliciesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c21f5df2-d2fd-4680-9917-eb6ef246daf5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PoliciesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PoliciesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PoliciesType >> then instantiate a {@link PoliciesType} proxy.
     * @return a {@link PoliciesType} proxy on the created {@link ModelElement}.
     */
    @objid ("b36691d0-af50-45f3-811d-4ce4ff1375f0")
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
    @objid ("679f6d8c-d829-4efa-badc-e74e013cea40")
    public static PoliciesType instantiate(final ModelElement obj) {
        return PoliciesType.canInstantiate(obj) ? new PoliciesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PoliciesType} proxy from a {@link ModelElement} stereotyped << PoliciesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PoliciesType} proxy.
     */
    @objid ("b2f4ac35-9b5e-4a56-822a-d087138ad640")
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
     */
    @objid ("4b73c1a0-0d9a-4bd1-9f8a-4e2fa219abef")
    public void addPolicy(final TPolicy obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PoliciesType.MdaTypes.MDAASSOCDEP);
            d.setName("policy");
            d.putTagValue(PoliciesType.MdaTypes.MDAASSOCDEP_ROLE, "policy");
        }
    }

    @objid ("f85a9e1d-49b9-4694-9129-4c3ff15047a3")
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
    @objid ("dab73e26-8235-4a65-8a36-4550e69fd58d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'policy' role.<p>
     * Role description:
     * null
     */
    @objid ("e3e112fb-a59c-4cb0-86ca-2259e4f91bfe")
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

    @objid ("4022fac5-9527-4789-bb22-07dbc84d29ae")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'policy' role.<p>
     * Role description:
     * null
     */
    @objid ("8a154853-1273-4a2e-aa3d-a57a97d7b3bd")
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

    @objid ("8be0f4f5-bc20-4157-9011-35cf4dc0eaee")
    protected  PoliciesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d2fac9bc-26f1-402f-a56e-2be60a56dd12")
    public static final class MdaTypes {
        @objid ("6519e3c5-fc96-4dd2-ac7f-1f7b5103d953")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f022649f-ad5d-447d-8523-53dcf7f913f7")
        private static Stereotype MDAASSOCDEP;

        @objid ("9d717da4-bcba-40dd-8971-cc234d939311")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2e67539b-09fd-4cf1-bc87-cddcdc5f2e84")
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

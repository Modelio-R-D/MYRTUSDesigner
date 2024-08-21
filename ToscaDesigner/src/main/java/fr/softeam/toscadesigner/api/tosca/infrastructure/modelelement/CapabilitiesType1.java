/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 11:15 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << CapabilitiesType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f641fecd-b1e5-497a-8fb1-f0438a6b7b4b")
public class CapabilitiesType1 implements IMdaProxy {
    @objid ("aee4e389-6636-4e2a-9760-5e4a706c6fdb")
    public static final String STEREOTYPE_NAME = "CapabilitiesType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("1a601546-c8b2-4719-bd0c-9c7effb1619d")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CapabilitiesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CapabilitiesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("69fb4de0-880e-46b6-989e-ba91dd9186fb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (CapabilitiesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(CapabilitiesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << CapabilitiesType1 >> then instantiate a {@link CapabilitiesType1} proxy.
     * 
     * @return a {@link CapabilitiesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("74390068-1a67-40f8-8f75-421e4d586eb2")
    public static CapabilitiesType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(CapabilitiesType1.MdaTypes.STEREOTYPE_ELT);
        return CapabilitiesType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link CapabilitiesType1} proxy from a {@link ModelElement} stereotyped << CapabilitiesType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link CapabilitiesType1} proxy or <i>null</i>.
     */
    @objid ("c4abe66b-177a-4718-a0ed-1e8968410776")
    public static CapabilitiesType1 instantiate(final ModelElement obj) {
        return CapabilitiesType1.canInstantiate(obj) ? new CapabilitiesType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CapabilitiesType1} proxy from a {@link ModelElement} stereotyped << CapabilitiesType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link CapabilitiesType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("69209ee5-ec78-40b6-85d6-fb2576fdc225")
    public static CapabilitiesType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (CapabilitiesType1.canInstantiate(obj))
        	return new CapabilitiesType1(obj);
        else
        	throw new IllegalArgumentException("CapabilitiesType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'capability' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6ec7907d-ede4-44d2-9eef-daa3523ad0e2")
    public void addCapability(final TCapabilityRef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, CapabilitiesType1.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(CapabilitiesType1.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("59fc5a07-ac1a-454f-b6d2-ffd5bc653d5f")
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
        CapabilitiesType1 other = (CapabilitiesType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'capability' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f33736ca-03a5-4a3a-ad12-26b6abf4d5a9")
    public List<TCapabilityRef> getCapability() {
        List<TCapabilityRef> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(CapabilitiesType1.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CapabilitiesType1.MdaTypes.MDAASSOCDEP_ROLE), "")
              && TCapabilityRef.canInstantiate(d.getImpacted())) {
                 results.add((TCapabilityRef)ToscaDesignerProxyFactory.instantiate(d.getImpacted(), TCapabilityRef.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("1f5b7eaf-36e9-402f-bc50-4ba5fad7e464")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("4d57a6a4-c8fd-4694-b873-a800033fbb88")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from 'capability' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5aa273b8-f6f9-4bef-b126-d9c909829eb5")
    public boolean removeCapability(final TCapabilityRef obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(CapabilitiesType1.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CapabilitiesType1.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("9ddedfe7-5818-425d-b0e7-0a2518626487")
    protected  CapabilitiesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("934a7005-7db7-4213-8c28-c3ceb9d41108")
    public static final class MdaTypes {
        @objid ("368721d9-7651-426a-bcf3-aca047c1efe9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1e2c8721-ae88-46a9-9710-536566608419")
        private static Stereotype MDAASSOCDEP;

        @objid ("1b368508-82c1-4e77-a117-ec4b5c9080fc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("70574ca8-f22f-417a-a8e4-293cb760e7a4")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1e88dd5b-b484-4f79-a6c6-4e4180c79c4a", "CapabilitiesType1");
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

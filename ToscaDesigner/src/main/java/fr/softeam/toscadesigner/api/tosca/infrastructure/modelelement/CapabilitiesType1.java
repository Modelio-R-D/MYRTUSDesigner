/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:52 by Modelio Studio.
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
@objid ("87496b4f-0416-4fc8-b0af-548ffd0eac57")
public class CapabilitiesType1 implements IMdaProxy {
    @objid ("19a42845-5f29-4288-9024-3234f4356f7d")
    public static final String STEREOTYPE_NAME = "CapabilitiesType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("d09939e6-0acd-4f73-a65d-7eb2a793b386")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CapabilitiesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CapabilitiesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6c1501c0-fc34-4631-a4fd-a713120db647")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (CapabilitiesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(CapabilitiesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << CapabilitiesType1 >> then instantiate a {@link CapabilitiesType1} proxy.
     * 
     * @return a {@link CapabilitiesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("3c0e43c0-0529-476a-8e6a-692d78588013")
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
    @objid ("c885f6b5-0c5e-4cb9-bb3d-af4e3e75b69e")
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
    @objid ("6ab5a97f-d7fa-4d04-b4e6-df42d4d10c2f")
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
    @objid ("e8d0285c-0a71-4b71-adda-57946e2021e3")
    public void addCapability(final TCapabilityRef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, CapabilitiesType1.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(CapabilitiesType1.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("1b9e84ae-b3d8-413c-83c5-353ab4260be5")
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
    @objid ("01e47578-c581-4999-8be0-fe7f9e1e8d06")
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
    @objid ("101c9497-c1e7-430b-ad9a-e1910b9e744d")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("828aab77-7407-4f44-a4e2-37679907c3e9")
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
    @objid ("bae4d469-d92c-4952-a579-bf2218dffa3c")
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

    @objid ("80a7b01e-5861-4f65-aa30-b79df0756d99")
    protected  CapabilitiesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d75991c4-f58c-492a-92d1-c543223776b0")
    public static final class MdaTypes {
        @objid ("3fab89cd-cad0-4167-85d0-a6aacf36b909")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9fc8acef-af91-4455-a4ca-aee72c4500a1")
        private static Stereotype MDAASSOCDEP;

        @objid ("a7ef878e-a83e-40a6-945b-9b912c8eb6aa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b6ebf0a9-c74d-48f7-a5e0-706161d5aa66")
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

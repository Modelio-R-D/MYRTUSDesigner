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
@objid ("bb53038f-1ec4-46cd-9c9d-5b801f8bafc1")
public class CapabilitiesType1 implements IMdaProxy {
    @objid ("caf11eda-e1eb-4099-90ec-9ea4ce67c438")
    public static final String STEREOTYPE_NAME = "CapabilitiesType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("e5952009-d7b6-46df-a006-bc108b3610ee")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CapabilitiesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CapabilitiesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("34bc618a-6b17-45a2-84b7-f995160bbccf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (CapabilitiesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(CapabilitiesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << CapabilitiesType1 >> then instantiate a {@link CapabilitiesType1} proxy.
     * 
     * @return a {@link CapabilitiesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("235a52b5-7f8f-4ce9-93c2-066e23efd525")
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
    @objid ("b617d21b-b866-45ed-ac4d-b4cfc8204c61")
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
    @objid ("8e526dfb-dcb3-4785-a523-87053c3bebb8")
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
    @objid ("7e6e88ba-2186-4229-82dc-e519218acdf4")
    public void addCapability(final TCapabilityRef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, CapabilitiesType1.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(CapabilitiesType1.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("99e2bd70-61bb-49d2-9547-77848a6f8a10")
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
    @objid ("48e2b586-29d8-4b61-b140-2e2478306a4f")
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
    @objid ("ded835d5-0d87-4140-9531-5c3b40d4698e")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("f8860a94-17c2-4f68-93a2-e45526c13eb0")
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
    @objid ("58cbe42a-22cd-4295-a8b0-3cf77a1cc610")
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

    @objid ("9547810e-84d5-4a5c-9dc0-2e6648692079")
    protected  CapabilitiesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("0c84084a-a238-4005-8845-b2392147ab10")
    public static final class MdaTypes {
        @objid ("391d0fe2-4161-4506-9276-e4ac305562a8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("19134ef3-89dd-4c50-85df-a7fac288613d")
        private static Stereotype MDAASSOCDEP;

        @objid ("6d4cd6ab-5537-4051-b266-ca78f47d96a0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("62f583cc-4a89-4187-8fa4-29293697b3e2")
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

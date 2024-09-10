/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/09/2024 12:00 by Modelio Studio.
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
    @objid ("fdb30c87-8def-4428-8a78-3967f159b0df")
    public static final String STEREOTYPE_NAME = "CapabilitiesType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("83f5811f-fda6-4313-a8dd-72eb0161f828")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CapabilitiesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CapabilitiesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bfa827c6-3912-45af-aecd-5163bbed0de6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (CapabilitiesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(CapabilitiesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << CapabilitiesType1 >> then instantiate a {@link CapabilitiesType1} proxy.
     * 
     * @return a {@link CapabilitiesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("d1b957ce-295a-41ed-80ce-891a7a966c96")
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
    @objid ("53614be9-006e-4319-a093-61dd6451ecd9")
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
    @objid ("54f78f30-a5a0-4dc8-afb0-67b6f4de307a")
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
    @objid ("bd587b20-99d9-4196-b55d-2529f873e6e1")
    public void addCapability(final TCapabilityRef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, CapabilitiesType1.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(CapabilitiesType1.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("ea038992-6545-4553-8d3d-b67aef6dde7a")
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
    @objid ("6ccf98d4-adb9-42c1-89fb-22c551c13c7a")
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
    @objid ("3ddd3023-bda4-42c5-8747-ebd34f229746")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("182d4812-fb6a-4d78-9c03-9ce0622999ba")
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
    @objid ("291f5d09-0265-4286-8913-93e38ca16de2")
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

    @objid ("374cf91a-7b18-4119-8c33-49d5522c4db8")
    protected  CapabilitiesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("0c84084a-a238-4005-8845-b2392147ab10")
    public static final class MdaTypes {
        @objid ("c99ecc11-5de3-40d6-9b1c-dfc12926c9b4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8fdfcd97-d662-4373-b052-6eb19ac8864b")
        private static Stereotype MDAASSOCDEP;

        @objid ("46a2b0e5-a456-40cf-b5dd-bf74fb1382d0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d0e6bfe2-7a35-439e-b90e-e121d7bf2570")
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

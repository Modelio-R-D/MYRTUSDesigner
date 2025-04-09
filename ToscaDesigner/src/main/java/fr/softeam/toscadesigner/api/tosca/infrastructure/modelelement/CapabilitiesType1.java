/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 09/04/2025 17:17 by Modelio Studio.
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
    @objid ("ce0edca2-e87c-4682-9913-5c53c4677091")
    public static final String STEREOTYPE_NAME = "CapabilitiesType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("b666b70a-9043-4e11-b73b-edb0acde8b88")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CapabilitiesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CapabilitiesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8680fbb3-9071-4f05-b69f-ec94f8c09ada")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (CapabilitiesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(CapabilitiesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << CapabilitiesType1 >> then instantiate a {@link CapabilitiesType1} proxy.
     * 
     * @return a {@link CapabilitiesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("de4e934a-f70e-44c6-a157-ac52b8247e8f")
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
    @objid ("39facf03-d023-4fa6-9250-99941fd3649d")
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
    @objid ("29fb70a0-10df-486e-9484-83d522fcf580")
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
    @objid ("8e815cc3-a7c4-4e9d-8a66-829681a85ffa")
    public void addCapability(final TCapabilityRef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, CapabilitiesType1.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(CapabilitiesType1.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("00c2c3bb-9139-4ab2-8ce7-ca51b50d1528")
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
    @objid ("5711a99f-6a41-412e-8c32-f9dfd5a6e495")
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
    @objid ("a1049393-7267-4089-a2a3-efd3ba696c31")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("50596ee7-9a2d-44a9-a4c4-6371610d6895")
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
    @objid ("56bb1537-457f-4c7a-b40e-6088eb36f48c")
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

    @objid ("f7c1080a-0ddc-4159-b7b8-e12c5441f359")
    protected  CapabilitiesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d75991c4-f58c-492a-92d1-c543223776b0")
    public static final class MdaTypes {
        @objid ("212a3087-3060-4ae3-85ec-111358756acf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7410ae76-90f4-4b1d-851d-5ded9c4fb655")
        private static Stereotype MDAASSOCDEP;

        @objid ("e89d5680-8571-4edc-8e38-2bf71c19dc41")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3cf209a7-30c7-4dc0-b766-60b7a89646a2")
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

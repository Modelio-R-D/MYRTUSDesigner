/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 22/05/2025 15:07 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ModelingSessionRegistry;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability;
import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link ModelElement} with << CapabilitiesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c3454d71-9723-4617-9e29-b351e6a60f55")
public class CapabilitiesType implements IMdaProxy {
    @objid ("5ab58bf6-c3a5-4988-883a-a2faa1cc4a32")
    public static final String STEREOTYPE_NAME = "CapabilitiesType";

    @objid ("ad39fddb-823b-4f49-a065-96f57ade59b8")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("27b3379a-1150-44b1-a132-54ca90035373")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CapabilitiesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CapabilitiesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6d96bd2d-a01a-4d98-9401-a8df80ca2647")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (CapabilitiesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(CapabilitiesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << CapabilitiesType >> then instantiate a {@link CapabilitiesType} proxy.
     * 
     * @return a {@link CapabilitiesType} proxy on the created {@link ModelElement}.
     */
    @objid ("6d9b5d7f-8b85-4556-919d-d05ab1d16402")
    public static CapabilitiesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(CapabilitiesType.MdaTypes.STEREOTYPE_ELT);
        return CapabilitiesType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link CapabilitiesType} proxy from a {@link ModelElement} stereotyped << CapabilitiesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link CapabilitiesType} proxy or <i>null</i>.
     */
    @objid ("803d18f0-1868-4a78-9860-8085f261f141")
    public static CapabilitiesType instantiate(final ModelElement obj) {
        return CapabilitiesType.canInstantiate(obj) ? new CapabilitiesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CapabilitiesType} proxy from a {@link ModelElement} stereotyped << CapabilitiesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link CapabilitiesType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8464dca0-8b77-4045-8437-42a937de1bb8")
    public static CapabilitiesType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (CapabilitiesType.canInstantiate(obj))
        	return new CapabilitiesType(obj);
        else
        	throw new IllegalArgumentException("CapabilitiesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'capability' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4eed9a4f-719d-4038-ad17-587d3afa7ded")
    public void addCapability(final TCapability obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, CapabilitiesType.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(CapabilitiesType.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("5fdaecc9-12be-46ef-8a91-ec8b3dc322cf")
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
        CapabilitiesType other = (CapabilitiesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'capability' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4912e62b-85ce-40c7-8666-f7409395838e")
    public List<TCapability> getCapability() {
        List<TCapability> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(CapabilitiesType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CapabilitiesType.MdaTypes.MDAASSOCDEP_ROLE), "")
              && TCapability.canInstantiate(d.getImpacted())) {
                 results.add((TCapability)ToscaDesignerProxyFactory.instantiate(d.getImpacted(), TCapability.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("b9c532a6-c929-4caa-9f7b-6284a1858093")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'CapabilitiesType.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c5fa0c9f-23eb-45f7-9907-ddac986f5e87")
    public String getName() {
        String value = this.elt.getProperty(CapabilitiesType.MdaTypes.STEREOTYPE_ELT,
                                            CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("93b1dec5-0257-4313-b0f3-7cb11143c47b")
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
    @objid ("dfe649c8-6d91-4894-8c91-cc5d79e10820")
    public boolean removeCapability(final TCapability obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(CapabilitiesType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CapabilitiesType.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Setter for property 'CapabilitiesType.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d98db856-badf-4dae-b054-e9cc653ed945")
    public void setName(final String value) {
        this.elt.setProperty(CapabilitiesType.MdaTypes.STEREOTYPE_ELT,
                             CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    @objid ("00912562-d21f-465d-93d7-7427b0f6acc9")
    protected  CapabilitiesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("24ac4c3b-7621-4e8b-921f-3e1352cb90e4")
    public static final class MdaTypes {
        @objid ("877ee6f0-4d5a-4ed4-9eb5-0ab4a2004036")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2a801c99-cd42-4c6c-aef1-fce752c28607")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("f9d26d31-2efe-4c75-8faa-4544d1cfe9fa")
        private static Stereotype MDAASSOCDEP;

        @objid ("7d8bdf3d-2743-48a1-abfb-84b73b92db65")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("29b7705a-5023-47ce-8b0d-90574628b45f")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "37787f67-5e3f-4ce9-93fc-cc3101d5cb6f", "CapabilitiesType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "e4e6c35d-6cf7-42a3-a06c-d2932cba1eda", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

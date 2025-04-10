/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 14:48 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.class_.TCapability;
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
 * Proxy class to handle a {@link ModelElement} with << CapabilitiesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c3454d71-9723-4617-9e29-b351e6a60f55")
public class CapabilitiesType implements IMdaProxy {
    @objid ("4b90648b-4263-4648-a550-093b4800f9e8")
    public static final String STEREOTYPE_NAME = "CapabilitiesType";

    @objid ("a0b11bfb-bf9a-4467-976b-3d7e8cf5bc6e")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6cdd0cb8-7eb6-4522-a713-f33ac44fe6ba")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CapabilitiesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CapabilitiesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9ab531cc-9e01-46ba-b3bc-d5c8eab18cf7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (CapabilitiesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(CapabilitiesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << CapabilitiesType >> then instantiate a {@link CapabilitiesType} proxy.
     * 
     * @return a {@link CapabilitiesType} proxy on the created {@link ModelElement}.
     */
    @objid ("3b8080ed-0aeb-4e98-9e3a-c68ad220a447")
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
    @objid ("8171e9d3-3cd4-4eec-bcc4-84dd137a7388")
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
    @objid ("88f8a277-88d7-46bf-90ed-82a2318ce88f")
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
    @objid ("a425d476-465b-4151-b49c-fcdc9ad22513")
    public void addCapability(final TCapability obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, CapabilitiesType.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(CapabilitiesType.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("f8749b32-3271-4a80-b1bd-a9f77e5ac849")
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
    @objid ("b98df8db-a177-463c-844f-dd6a266931a8")
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
    @objid ("6c0f7c6f-ad94-4c0f-9cc2-980ebc11bad9")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'CapabilitiesType.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bca0cfa1-aa33-4e93-a920-91b2f16bc1b3")
    public String getName() {
        String value = this.elt.getProperty(CapabilitiesType.MdaTypes.STEREOTYPE_ELT,
                                            CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("281dae95-ae3c-409b-b737-9d586c64ac5c")
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
    @objid ("916af040-df1b-4c41-a84d-48a7161025fd")
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
    @objid ("b789b54e-264d-43e9-a13f-65f31849730a")
    public void setName(final String value) {
        this.elt.setProperty(CapabilitiesType.MdaTypes.STEREOTYPE_ELT,
                             CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    @objid ("f9b8211b-e4af-4d27-9f7b-dc491f4de914")
    protected  CapabilitiesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("24ac4c3b-7621-4e8b-921f-3e1352cb90e4")
    public static final class MdaTypes {
        @objid ("1794e860-1822-4125-9e2c-295d343828b1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dba8ae34-997b-4415-ac79-37b569626ca2")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("715b8350-faf3-4d06-aba0-11f5ee0f08db")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ffc8ced-5f44-4c51-96c2-fb87f49a904c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f1536f7-bbde-49a6-a001-9236a161036d")
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

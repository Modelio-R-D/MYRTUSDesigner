/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
    @objid ("a25a5477-b9e8-48ea-a732-66da26e07ed0")
    public static final String STEREOTYPE_NAME = "CapabilitiesType";

    @objid ("22bb6b1e-e91d-4a60-a6e2-376e50ff7ce5")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("a54b2a8b-49ac-4003-9281-85041d7588b2")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CapabilitiesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CapabilitiesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c1505a9a-d2ca-408d-a69f-dc2f62e4930f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (CapabilitiesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(CapabilitiesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << CapabilitiesType >> then instantiate a {@link CapabilitiesType} proxy.
     * 
     * @return a {@link CapabilitiesType} proxy on the created {@link ModelElement}.
     */
    @objid ("6f0370c6-2bbd-4ae4-9504-d7a2aad54d85")
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
    @objid ("e45ddccd-36ba-4610-8cd3-835063d9232f")
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
    @objid ("deee092f-0369-4152-ab4e-eebf7adba4a3")
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
    @objid ("bf5fa923-f63b-476d-b781-372961fe2c12")
    public void addCapability(final TCapability obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, CapabilitiesType.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(CapabilitiesType.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("1568a528-057a-4b3a-aa01-2d6d11556f01")
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
    @objid ("248b3b4f-9cff-4f1e-854a-71ae15fc9157")
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
    @objid ("ecfe8688-e4c1-4bf8-bb49-bf2f329023ea")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'CapabilitiesType.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("94c60ca4-54fe-4e53-b90c-c4b0f826285c")
    public String getName() {
        String value = this.elt.getProperty(CapabilitiesType.MdaTypes.STEREOTYPE_ELT,
                                            CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("8cce0c14-9482-4d65-84cd-acbd82a7125a")
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
    @objid ("0a6f7cfd-38a1-4f9a-b349-67148eed4e4c")
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
    @objid ("a61ab405-d61b-4d6b-a1f0-1e65bac3b939")
    public void setName(final String value) {
        this.elt.setProperty(CapabilitiesType.MdaTypes.STEREOTYPE_ELT,
                             CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(CapabilitiesType.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    @objid ("a70e4f34-038c-4ddc-aef4-cf5749a437d5")
    protected  CapabilitiesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("24ac4c3b-7621-4e8b-921f-3e1352cb90e4")
    public static final class MdaTypes {
        @objid ("d31432dc-4232-4767-8336-ff9af10c864d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ac35235c-0207-45de-a8e3-8c6794799c58")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("68d1b655-3dab-4587-ba41-22e4bd8bb4d4")
        private static Stereotype MDAASSOCDEP;

        @objid ("96ddd784-ec61-42a5-958d-1e564ac09818")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3190ba85-2dd7-40ca-9d6d-bb708ce3dccc")
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

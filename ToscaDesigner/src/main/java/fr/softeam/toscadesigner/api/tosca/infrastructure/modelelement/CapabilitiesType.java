/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 12:01 by Modelio Studio.
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
@objid ("c2d1e9ff-ba3b-4a89-bcbd-43f1cef7424c")
public class CapabilitiesType implements IMdaProxy {
    @objid ("5c518471-975a-49b8-8e5d-ac368a81b02d")
    public static final String STEREOTYPE_NAME = "CapabilitiesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("0f087991-fa40-4d34-883b-e301ed5a2023")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link CapabilitiesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << CapabilitiesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d744c561-98b3-4842-9fe6-9ca39ee2fd80")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (CapabilitiesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(CapabilitiesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << CapabilitiesType >> then instantiate a {@link CapabilitiesType} proxy.
     * 
     * @return a {@link CapabilitiesType} proxy on the created {@link ModelElement}.
     */
    @objid ("a03bbdb0-82cb-4cb1-8e50-10f66e3af659")
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
    @objid ("b92a38e0-c08a-499c-84c4-2703b9718a09")
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
    @objid ("a183aa6f-7622-4ed6-a7b5-f340c2252579")
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
    @objid ("546eeb07-75c8-47fa-88ba-b60e0d75d8a6")
    public void addCapability(final TCapability obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, CapabilitiesType.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(CapabilitiesType.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("36cfedfb-e58a-4c16-b353-143018af0fae")
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
    @objid ("a0ca1d88-2721-4bb3-9ebb-f2520db532aa")
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
    @objid ("5b8f0a7b-778f-4849-abe9-1c9ec0f22466")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("39c120f6-fbf2-4594-b10e-594e530d37f3")
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
    @objid ("374afd71-be2c-4c80-88e9-4d0392d315e3")
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

    @objid ("ac1786b3-c000-4493-90e7-98ab6239b555")
    protected  CapabilitiesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("9741e5ac-0bac-4a50-b0bb-8202f006753f")
    public static final class MdaTypes {
        @objid ("c165b7fb-7938-455a-9d32-d520a5e780cf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f2a3c795-9bf4-4c63-9881-2aaeab8a5e13")
        private static Stereotype MDAASSOCDEP;

        @objid ("2d37b89b-c0d9-4017-b381-ff597ffb49b7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d46bf18b-3bc9-48dd-817c-4139dbdcd8a6")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "37787f67-5e3f-4ce9-93fc-cc3101d5cb6f", "CapabilitiesType");
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

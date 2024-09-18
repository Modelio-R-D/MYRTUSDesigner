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
 * Proxy class to handle a {@link ModelElement} with << InterfacesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("84284c2c-953a-4c2b-b886-6d4380448430")
public class InterfacesType implements IMdaProxy {
    @objid ("8666c4d8-e373-4890-8281-2634b5d7ab81")
    public static final String STEREOTYPE_NAME = "InterfacesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("760e087d-4221-42ad-8a87-5e828860c623")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("be4d5742-f158-447b-b365-49da1276e3e8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InterfacesType >> then instantiate a {@link InterfacesType} proxy.
     * 
     * @return a {@link InterfacesType} proxy on the created {@link ModelElement}.
     */
    @objid ("1a7453c0-cc3a-4b45-848d-7c3178196159")
    public static InterfacesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(InterfacesType.MdaTypes.STEREOTYPE_ELT);
        return InterfacesType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link InterfacesType} proxy from a {@link ModelElement} stereotyped << InterfacesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link InterfacesType} proxy or <i>null</i>.
     */
    @objid ("71fb2c7e-604c-464a-a8bd-5aae6cd8f732")
    public static InterfacesType instantiate(final ModelElement obj) {
        return InterfacesType.canInstantiate(obj) ? new InterfacesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterfacesType} proxy from a {@link ModelElement} stereotyped << InterfacesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link InterfacesType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2f5199f3-f416-4432-a2b5-58acace5c1f8")
    public static InterfacesType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (InterfacesType.canInstantiate(obj))
        	return new InterfacesType(obj);
        else
        	throw new IllegalArgumentException("InterfacesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a4e0abd3-1ddd-48b3-9206-feb57c21e067")
    public void addInterface(final TInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InterfacesType.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(InterfacesType.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("06fa0e13-d996-4355-b73b-9ae00fd5ea93")
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
        InterfacesType other = (InterfacesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("7ef26f15-709d-4da4-8180-75418e031ab6")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("acb51861-d55b-4bff-b9f7-8fdae4b2230c")
    public List<TInterface> getInterface() {
        List<TInterface> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(InterfacesType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(InterfacesType.MdaTypes.MDAASSOCDEP_ROLE), "interface")
              && TInterface.canInstantiate(d.getDependsOn()))
                results.add((TInterface)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TInterface.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("014dbc7b-b310-4032-a79b-77e6baf41154")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b84a77f3-2a9c-4f0e-b4c4-342594aba150")
    public boolean removeInterface(final TInterface obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(InterfacesType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(InterfacesType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("1a47ca15-7470-4fba-b333-cf294b8c5511")
    protected  InterfacesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("3e38512a-4723-467f-9b43-6a1c67b00d30")
    public static final class MdaTypes {
        @objid ("51d3608c-1b7c-47c2-8493-f5e00b236130")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("579e046e-0bda-48fd-812e-2b0f26ef0b4a")
        private static Stereotype MDAASSOCDEP;

        @objid ("80dc877d-0ca1-4460-b9ab-40468c6906c9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9df8ee0f-0127-4c0e-a740-52c48fe0951b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "d86ae9b4-3868-4e10-89e2-c4c8eb92f7e4", "InterfacesType");
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

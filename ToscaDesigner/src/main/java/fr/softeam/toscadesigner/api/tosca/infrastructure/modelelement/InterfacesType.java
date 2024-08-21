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
 * Proxy class to handle a {@link ModelElement} with << InterfacesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("29441fc9-829b-48a2-93b1-2364dc256563")
public class InterfacesType implements IMdaProxy {
    @objid ("847ef16a-e0d0-497d-b3de-df006f648c0e")
    public static final String STEREOTYPE_NAME = "InterfacesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6fe83cc5-7245-4102-bdcf-17854c2bfaaa")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fb2568b5-83e0-45d3-b23d-ca05693d5872")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InterfacesType >> then instantiate a {@link InterfacesType} proxy.
     * 
     * @return a {@link InterfacesType} proxy on the created {@link ModelElement}.
     */
    @objid ("90881af4-8cb6-4760-aeaa-80b73ee42e5d")
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
    @objid ("208f8aef-8ad9-4d8f-8f2b-4d3f021e609f")
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
    @objid ("b38a891a-d85b-4f2c-af19-45470fe1cc12")
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
    @objid ("28061127-34e9-4ff7-95eb-50eee946d185")
    public void addInterface(final TInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InterfacesType.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(InterfacesType.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("efa352e9-1e8b-4609-9e9a-90785a07ac9c")
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
    @objid ("0bf77f03-2c38-4883-b5dc-5578868dfe5d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("52ee506d-8f3a-412d-9851-ec645eec2c28")
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

    @objid ("67c712bd-01c0-4df0-a7ad-588839ad6b9f")
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
    @objid ("ac148adf-f116-4f62-9be6-027c1f53a47f")
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

    @objid ("fe726e1a-825a-43b9-a93e-69b1ce385fe8")
    protected  InterfacesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("4a6b3d53-842c-4c65-a1fd-3d8bac9cd794")
    public static final class MdaTypes {
        @objid ("27729157-4118-4dcd-a76b-ece1bac5170d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("56b4f695-177a-4333-8e76-52b3352bcf4a")
        private static Stereotype MDAASSOCDEP;

        @objid ("65a0a6ac-6819-4c78-85d3-cce575c64ab6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("984bd976-ae5d-4590-996f-8ef5fe435cec")
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

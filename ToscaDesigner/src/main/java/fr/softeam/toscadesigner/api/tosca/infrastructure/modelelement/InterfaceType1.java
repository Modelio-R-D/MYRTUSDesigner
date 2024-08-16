/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 02/08/2024 16:15 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << InterfaceType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1dd8cf5e-c3e7-4260-8eb5-abdff627870d")
public class InterfaceType1 implements IMdaProxy {
    @objid ("b001cefb-07fa-45ef-bf4e-f456a105d842")
    public static final String STEREOTYPE_NAME = "InterfaceType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("c1f81b84-935f-47fc-9fc3-6f08ddcc2454")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InterfaceType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InterfaceType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cbf12185-81a4-4d03-ae08-f1c23eb16ba2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InterfaceType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InterfaceType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InterfaceType1 >> then instantiate a {@link InterfaceType1} proxy.
     * 
     * @return a {@link InterfaceType1} proxy on the created {@link ModelElement}.
     */
    @objid ("21828389-0ab1-4438-8233-5c1b5cbe2b6a")
    public static InterfaceType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(InterfaceType1.MdaTypes.STEREOTYPE_ELT);
        return InterfaceType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link InterfaceType1} proxy from a {@link ModelElement} stereotyped << InterfaceType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link InterfaceType1} proxy or <i>null</i>.
     */
    @objid ("7eacf14e-08ec-4473-9caa-389e26e372a3")
    public static InterfaceType1 instantiate(final ModelElement obj) {
        return InterfaceType1.canInstantiate(obj) ? new InterfaceType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterfaceType1} proxy from a {@link ModelElement} stereotyped << InterfaceType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link InterfaceType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f0a7ad82-6e18-4f95-b9eb-e0f022c58ab3")
    public static InterfaceType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (InterfaceType1.canInstantiate(obj))
        	return new InterfaceType1(obj);
        else
        	throw new IllegalArgumentException("InterfaceType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("430b5f9a-02ac-4c4b-b4c1-75cc0ab89f87")
    public void addInterface(final TExportedInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InterfaceType1.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(InterfaceType1.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("85793229-1c1b-44a6-bdf0-83ee1905d646")
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
        InterfaceType1 other = (InterfaceType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("5b6b1876-c98d-4ab1-a3e3-928254b71b04")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("26166dcf-7fdc-4dd7-8fcb-40efe696fcd5")
    public List<TExportedInterface> getInterface() {
        List<TExportedInterface> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(InterfaceType1.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(InterfaceType1.MdaTypes.MDAASSOCDEP_ROLE), "interface")
              && TExportedInterface.canInstantiate(d.getDependsOn()))
                results.add((TExportedInterface)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TExportedInterface.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3c4a1fee-ae0a-4359-8283-6a7b3852c2a1")
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
    @objid ("3a887b8e-7860-493c-ae83-74228294b5db")
    public boolean removeInterface(final TExportedInterface obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(InterfaceType1.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(InterfaceType1.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("f2c9f8db-dccd-4fcc-9a95-48280db767dd")
    protected  InterfaceType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("b18dcc20-f397-48bc-9bf3-ff6b27ac54e8")
    public static final class MdaTypes {
        @objid ("b45580c3-5b77-423c-b738-f4c33bc89731")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4fd05984-b57c-4fb2-a1d4-bc22f9be8eb9")
        private static Stereotype MDAASSOCDEP;

        @objid ("c54e7e18-c2b6-47e8-ac09-99156e232e2a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0f9a0913-12f4-4a5e-b7c0-ea5d49259a69")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "0ae06072-fb38-48b3-94eb-9bf7b7cade50", "InterfaceType1");
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

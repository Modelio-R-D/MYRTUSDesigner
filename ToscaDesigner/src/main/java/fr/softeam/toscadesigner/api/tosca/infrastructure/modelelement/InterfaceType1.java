/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 11:20 by Modelio Studio.
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
@objid ("3ea8c06a-7642-4e14-a82d-f79c8cd0ce75")
public class InterfaceType1 implements IMdaProxy {
    @objid ("70bee590-1108-4071-adeb-925d57bd5f94")
    public static final String STEREOTYPE_NAME = "InterfaceType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("9dd08d36-aac9-4545-a99d-00bec774fdea")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InterfaceType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InterfaceType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("08052f06-2e3b-4083-baa0-c9be4022aafb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InterfaceType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InterfaceType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InterfaceType1 >> then instantiate a {@link InterfaceType1} proxy.
     * 
     * @return a {@link InterfaceType1} proxy on the created {@link ModelElement}.
     */
    @objid ("dd5882a9-a56b-4b8a-a34d-1cb73db97ccb")
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
    @objid ("d2e6e6ca-1a9a-44d5-a60e-75ddc0d66237")
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
    @objid ("476433bd-22bf-4560-b11b-6c50abae99a0")
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
    @objid ("b988695f-ea54-4e96-95cb-4febbe5338eb")
    public void addInterface(final TExportedInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InterfaceType1.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(InterfaceType1.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("d40e149a-610c-4371-9d7f-ef7458450c40")
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
    @objid ("f9ad6cae-0ee1-4d74-a082-e3478ab22d8d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("50751e53-d98b-4558-8097-11365f98db9b")
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

    @objid ("82743aa7-5b07-40df-8b4b-3733ba6a1f2e")
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
    @objid ("dd9b9f87-5093-4398-a71a-9435019825c0")
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

    @objid ("fcdd2484-738a-40d4-8ea0-ccb6f3c4f9c5")
    protected  InterfaceType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("5d629e80-7628-4a93-aa6e-2f81a595df71")
    public static final class MdaTypes {
        @objid ("0e345512-ad94-46a8-bac4-0492e1f7fd89")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3dc8ae14-7d1a-4592-80ef-1ab2afbbcff8")
        private static Stereotype MDAASSOCDEP;

        @objid ("ba4179eb-aed8-4972-81c4-92e0ece54843")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("35f21cfa-b54f-4312-acd6-7cf8b24b5f0f")
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

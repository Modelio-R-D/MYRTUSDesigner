/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:09 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TExportedInterface >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a8b89d93-ad92-49b7-9861-2a63203bdc6b")
public class TExportedInterface implements IMdaProxy {
    @objid ("a0f880db-3401-42fc-a8e8-c505506f6b0b")
    public static final String STEREOTYPE_NAME = "TExportedInterface";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("ea3c50bd-949f-475c-a8f3-bdd25cba5325")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExportedInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExportedInterface >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("676f3a7b-22ff-482c-9877-29888403b55d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExportedInterface.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExportedInterface.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExportedInterface >> then instantiate a {@link TExportedInterface} proxy.
     * 
     * @return a {@link TExportedInterface} proxy on the created {@link ModelElement}.
     */
    @objid ("08a7e50f-20cf-4def-9199-d0aabf63ea9d")
    public static TExportedInterface create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TExportedInterface.MdaTypes.STEREOTYPE_ELT);
        return TExportedInterface.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TExportedInterface} proxy from a {@link ModelElement} stereotyped << TExportedInterface >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TExportedInterface} proxy or <i>null</i>.
     */
    @objid ("fefb9d03-749f-4070-9881-7e22cb9424c8")
    public static TExportedInterface instantiate(final ModelElement obj) {
        return TExportedInterface.canInstantiate(obj) ? new TExportedInterface(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExportedInterface} proxy from a {@link ModelElement} stereotyped << TExportedInterface >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TExportedInterface} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("63b0dc0e-6cde-4f36-b4c6-221b5297a663")
    public static TExportedInterface safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExportedInterface.canInstantiate(obj))
        	return new TExportedInterface(obj);
        else
        	throw new IllegalArgumentException("TExportedInterface: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("014e567c-08f1-4d9a-8a0e-5a88152d7695")
    public void addOperation(final TExportedOperation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TExportedInterface.MdaTypes.MDAASSOCDEP);
            d.setName("operation");
            d.putTagValue(TExportedInterface.MdaTypes.MDAASSOCDEP_ROLE, "operation");
        }
    }

    @objid ("ffe81442-6485-437b-8381-80654ec25663")
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
        TExportedInterface other = (TExportedInterface) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("f011d0d4-990f-411c-a047-dac44380459a")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cc85ae03-a5e4-49ba-ad0c-287460165a11")
    public List<TExportedOperation> getOperation() {
        List<TExportedOperation> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TExportedInterface.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TExportedInterface.MdaTypes.MDAASSOCDEP_ROLE), "operation")
              && TExportedOperation.canInstantiate(d.getDependsOn()))
                results.add((TExportedOperation)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TExportedOperation.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f10d9521-0742-4b32-81ca-35bdc7ffa49e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7c9bc507-add1-402c-bf85-9910f40d4dff")
    public boolean removeOperation(final TExportedOperation obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TExportedInterface.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TExportedInterface.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("4001bd87-b89b-4d39-8915-121dda1c789b")
    protected  TExportedInterface(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("f18e7e43-a97f-4028-a6da-9e5860b3a3ba")
    public static final class MdaTypes {
        @objid ("28f7c6ce-75ba-456e-9ca1-73bcfd1c3204")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b27c3581-b3d1-4804-a7b2-26302d22c4c4")
        private static Stereotype MDAASSOCDEP;

        @objid ("b38ab7a7-baec-4dc8-bfbb-490094ab9daa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a9d64a9d-1f53-47c8-bb67-04b2b7cce968")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "b71c026a-4df3-4c68-8c0e-728486b4744b", "TExportedInterface");
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

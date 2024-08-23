/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
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
import fr.softeam.toscadesigner.impl.MdaProxyException;
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
@objid ("464aa09b-4a3d-44cd-97c6-a59ae64b592e")
public class TExportedInterface implements IMdaProxy {
    @objid ("e18489ab-d5fc-4ec8-bc02-8e9fc388a948")
    public static final String STEREOTYPE_NAME = "TExportedInterface";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("4ced0b33-dc58-4b90-8fc1-8d859835eff4")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExportedInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExportedInterface >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e7e925c4-b333-454a-a4d8-63220b1d1bdd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExportedInterface.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExportedInterface.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExportedInterface >> then instantiate a {@link TExportedInterface} proxy.
     * 
     * @return a {@link TExportedInterface} proxy on the created {@link ModelElement}.
     */
    @objid ("5720fcdd-829a-44a4-a973-55f572ba0fc9")
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
    @objid ("09dfdfb9-ccaf-4c42-bfe6-d4fd1c36904a")
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
    @objid ("27cf7e61-69f2-4bab-94e1-0f37679b4901")
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
    @objid ("f3fd0de6-fcf4-4b45-b0bb-4f143d00ad54")
    public void addOperation(final TExportedOperation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TExportedInterface.MdaTypes.MDAASSOCDEP);
            d.setName("operation");
            d.putTagValue(TExportedInterface.MdaTypes.MDAASSOCDEP_ROLE, "operation");
        }
    }

    @objid ("7bb5d52a-aad2-4701-8c15-20a7715be281")
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
    @objid ("7afba3f8-3147-497b-b5e3-a1c78c15501c")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7cba14f6-37cf-4b0f-b8a9-f5358552e001")
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

    @objid ("8f454678-c4c3-4e17-9fe5-80a841c37245")
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
    @objid ("1cc922d6-5dfa-4085-8815-06ab25ca94e1")
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

    @objid ("39c104d5-2d49-4189-8cb2-c96a6a71ce63")
    protected  TExportedInterface(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("47a45a48-de8d-4976-9b5d-cdba055f27cd")
    public static final class MdaTypes {
        @objid ("0dbbd39c-087a-4ec3-ad58-503b42fdd3a6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d3cc196f-2f6f-40ed-97da-821cf70a71f4")
        private static Stereotype MDAASSOCDEP;

        @objid ("93931be3-8585-43eb-8f54-64bf702bc1c2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("144f1813-7f68-45b4-9367-2684f596ade5")
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

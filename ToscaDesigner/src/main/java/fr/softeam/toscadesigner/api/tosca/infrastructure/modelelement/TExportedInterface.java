/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
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
@objid ("facb6f5c-2fa2-4f33-9cef-2f82da0466c4")
public class TExportedInterface implements IMdaProxy {
    @objid ("33aff803-56d5-437f-a00e-ee6b55109126")
    public static final String STEREOTYPE_NAME = "TExportedInterface";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("bad7ee5e-41d9-4f16-af70-ef996f8eb472")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExportedInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExportedInterface >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7f38b2e0-4e6d-4e44-b70c-b3f76a19bda5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExportedInterface.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExportedInterface.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExportedInterface >> then instantiate a {@link TExportedInterface} proxy.
     * @return a {@link TExportedInterface} proxy on the created {@link ModelElement}.
     */
    @objid ("46c39396-f70a-4378-8699-1bf709bad430")
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
    @objid ("1b68d888-9123-4b85-bace-6247880a4802")
    public static TExportedInterface instantiate(final ModelElement obj) {
        return TExportedInterface.canInstantiate(obj) ? new TExportedInterface(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExportedInterface} proxy from a {@link ModelElement} stereotyped << TExportedInterface >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TExportedInterface} proxy.
     */
    @objid ("cd7973aa-788b-48b4-976a-7d7b20b6fe6a")
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
     */
    @objid ("19102e73-d6e2-4708-8669-487d6ea3465a")
    public void addOperation(final TExportedOperation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TExportedInterface.MdaTypes.MDAASSOCDEP);
            d.setName("operation");
            d.putTagValue(TExportedInterface.MdaTypes.MDAASSOCDEP_ROLE, "operation");
        }
    }

    @objid ("d585b405-22bf-44d6-82e4-6873dcf86a97")
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
    @objid ("5f61f8f1-683a-4e8d-8c46-fe58f269e3f5")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'operation' role.<p>
     * Role description:
     * null
     */
    @objid ("b61365bd-4933-4558-ba4c-7462f0c7203b")
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

    @objid ("b2a7d246-dde1-4df1-8fea-f255eabc135b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'operation' role.<p>
     * Role description:
     * null
     */
    @objid ("d25eac66-39ef-4e0f-9665-86d6da2dc137")
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

    @objid ("2e691f8f-512f-4623-a795-eb1828cd9381")
    protected  TExportedInterface(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("58113bbd-f7dd-41a1-82b9-810e4559616d")
    public static final class MdaTypes {
        @objid ("be177fde-5c27-4ae9-9760-8cbec2565e2b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e94d9a5b-8ccd-41f4-951c-96f12e1378b2")
        private static Stereotype MDAASSOCDEP;

        @objid ("b70a25e3-c61c-471f-b09b-4b8394ba0a8a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7f47daa3-cdfb-4ff0-8bd8-4fd06db0b0ee")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 04/06/2025 20:07 by Modelio Studio.
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
@objid ("d8ad5391-a427-4f93-acc9-a612ed04030c")
public class TExportedInterface implements IMdaProxy {
    @objid ("88875ad8-9c97-41d1-adfc-21de95c9ecf6")
    public static final String STEREOTYPE_NAME = "TExportedInterface";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("09447899-0741-4093-a495-7f02dd32e6a7")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExportedInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExportedInterface >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("94f48d0c-b8cb-48db-aaed-9653e64a2668")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExportedInterface.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExportedInterface.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExportedInterface >> then instantiate a {@link TExportedInterface} proxy.
     * 
     * @return a {@link TExportedInterface} proxy on the created {@link ModelElement}.
     */
    @objid ("5617f8eb-4653-4340-8efa-6985868c35e5")
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
    @objid ("9beacedb-4870-484d-9f4a-563238b22210")
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
    @objid ("b2f716d0-a3e4-497f-8d5d-db69fcf3d98a")
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
    @objid ("a8f39083-18c9-4143-ba56-6c3408768ed8")
    public void addOperation(final TExportedOperation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TExportedInterface.MdaTypes.MDAASSOCDEP);
            d.setName("operation");
            d.putTagValue(TExportedInterface.MdaTypes.MDAASSOCDEP_ROLE, "operation");
        }
    }

    @objid ("66b0649e-c163-47f8-bd86-b3b4306f3075")
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
    @objid ("fa17912c-e9cf-416a-908c-1cafe4b981b0")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a894ad06-e180-4934-9110-8c8f53ce4a08")
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

    @objid ("ac1e921f-4516-47ba-94b3-580b8773d433")
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
    @objid ("a6a63b52-657b-4662-bf27-6e89398eddbb")
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

    @objid ("9f6896fd-a4d7-4ad9-92b9-1f0c3712cfa9")
    protected  TExportedInterface(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("8cf5f7ad-3847-4b56-9b96-a2fcd4040f29")
    public static final class MdaTypes {
        @objid ("9551d29d-c51f-4418-9f3d-a360b142fa02")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cc51c7d3-f8f7-471e-b42e-f63ce0339f28")
        private static Stereotype MDAASSOCDEP;

        @objid ("e9489636-f2bc-4302-8db7-204b1b1bdec2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3ab63fee-d70c-4200-85eb-25dbe2ce5aa8")
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

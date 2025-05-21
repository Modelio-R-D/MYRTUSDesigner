/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
@objid ("3b306959-d715-4d74-8b25-0f43e54cbb1d")
public class InterfaceType1 implements IMdaProxy {
    @objid ("de09b26f-7dbc-4034-8a4f-bd45c4dcb63e")
    public static final String STEREOTYPE_NAME = "InterfaceType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("f45363ea-2863-46fd-8016-8062ce062539")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InterfaceType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InterfaceType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("596bcf8b-ff86-4f88-82be-c2efdd642b7d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InterfaceType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InterfaceType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InterfaceType1 >> then instantiate a {@link InterfaceType1} proxy.
     * 
     * @return a {@link InterfaceType1} proxy on the created {@link ModelElement}.
     */
    @objid ("b266e815-323b-4d68-9d1c-c7b6d5ac5bd5")
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
    @objid ("3c7e3d40-a9c3-46f4-9dc1-c335225015bb")
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
    @objid ("b95c0669-7e6e-4a34-b4d1-75c6215d2bad")
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
    @objid ("29a57e37-0b77-4f13-9ed6-2d912f226f86")
    public void addInterface(final TExportedInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InterfaceType1.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(InterfaceType1.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("6475644b-4523-4c85-b1a2-7d4a8d89b76c")
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
    @objid ("8df24eca-5291-4c3b-a3ab-1b56812f826a")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e455fb26-706a-4b05-872b-d5722796b72a")
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

    @objid ("485ba25d-1c58-47e0-905f-313428ff9519")
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
    @objid ("408e7362-895d-4f24-a5b6-0431367a5bfb")
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

    @objid ("b7c6b12c-bd6b-4c14-8a93-7ba566aca1b2")
    protected  InterfaceType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("071192d0-b1b0-44e9-b3b1-86f405c2d0af")
    public static final class MdaTypes {
        @objid ("c84a5e5d-2278-4a79-8f6e-772821d4a952")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e343aef3-5f99-42f1-801a-b969d45807d7")
        private static Stereotype MDAASSOCDEP;

        @objid ("4375a5ff-9734-4337-b287-7bba62c3b4bf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("19a32865-2f18-423a-8c30-69d028a7981c")
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

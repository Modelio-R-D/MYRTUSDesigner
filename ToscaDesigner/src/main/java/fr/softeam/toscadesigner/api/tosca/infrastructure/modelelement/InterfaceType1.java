/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/09/2024 11:42 by Modelio Studio.
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
    @objid ("cc28b549-1021-4984-a508-24835b2feb7d")
    public static final String STEREOTYPE_NAME = "InterfaceType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("8f8cfe24-21d1-4e43-8dd8-5acccf55af28")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InterfaceType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InterfaceType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dc6d21fc-69ce-4433-b03a-77bb09358fc9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InterfaceType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InterfaceType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InterfaceType1 >> then instantiate a {@link InterfaceType1} proxy.
     * 
     * @return a {@link InterfaceType1} proxy on the created {@link ModelElement}.
     */
    @objid ("e1659976-ae31-4ab7-91d3-8ee9b3882c20")
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
    @objid ("eb565ee6-c85b-4996-9df8-8462e3f0a1ee")
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
    @objid ("f9ea5d96-fd1c-4d23-bb30-e67828420008")
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
    @objid ("c9d983b7-8b14-4428-8e01-0a60fd9514fe")
    public void addInterface(final TExportedInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InterfaceType1.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(InterfaceType1.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("a1af311a-ac14-4a2c-ab31-e98de803cf43")
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
    @objid ("178e7c63-8603-4793-942e-2e21010e3cb0")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b48120c5-ca00-420c-a7ff-c5227bbb2961")
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

    @objid ("ac762a5e-5fdd-45be-9f79-a132bb73edfb")
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
    @objid ("8ae7908d-3e5f-4eb2-9e00-95fc6c7125db")
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

    @objid ("f1a14d08-80f1-4682-85a3-4dfc7a2a562a")
    protected  InterfaceType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("5d629e80-7628-4a93-aa6e-2f81a595df71")
    public static final class MdaTypes {
        @objid ("9695fe54-fd7c-4405-8747-b5b995df7ce9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6d8d239b-a94e-4297-8eb2-9bece06bd0bc")
        private static Stereotype MDAASSOCDEP;

        @objid ("966a990c-dcbf-4f43-80e3-803267214ef0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1e467cb3-27a6-4b9a-995e-04c62684548b")
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

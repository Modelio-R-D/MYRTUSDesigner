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
import fr.softeam.toscadesigner.api.tosca.standard.class_.TInterface;
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
 * Proxy class to handle a {@link ModelElement} with << TargetInterfacesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5f486aa7-14d1-4e93-a780-bfc71aa3e99e")
public class TargetInterfacesType implements IMdaProxy {
    @objid ("6d07eb3d-3fb3-42b5-8377-1aa066ab3df6")
    public static final String STEREOTYPE_NAME = "TargetInterfacesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("df62d2d4-a48d-4a42-b08b-b54210330789")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TargetInterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TargetInterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4bb799f4-cbf6-4ae7-a782-c69b40d1d1df")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TargetInterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TargetInterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TargetInterfacesType >> then instantiate a {@link TargetInterfacesType} proxy.
     * 
     * @return a {@link TargetInterfacesType} proxy on the created {@link ModelElement}.
     */
    @objid ("2aabfef6-0cbb-4883-96b8-95acb45755ef")
    public static TargetInterfacesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TargetInterfacesType.MdaTypes.STEREOTYPE_ELT);
        return TargetInterfacesType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TargetInterfacesType} proxy from a {@link ModelElement} stereotyped << TargetInterfacesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TargetInterfacesType} proxy or <i>null</i>.
     */
    @objid ("a79cd0ff-ac02-4329-96c6-7dc3fc4c74cd")
    public static TargetInterfacesType instantiate(final ModelElement obj) {
        return TargetInterfacesType.canInstantiate(obj) ? new TargetInterfacesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TargetInterfacesType} proxy from a {@link ModelElement} stereotyped << TargetInterfacesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TargetInterfacesType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("aab201bd-52c5-4859-bd92-9c1cb394e35a")
    public static TargetInterfacesType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TargetInterfacesType.canInstantiate(obj))
        	return new TargetInterfacesType(obj);
        else
        	throw new IllegalArgumentException("TargetInterfacesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("614f1b6b-7674-4310-a980-894dc63f98f1")
    public void addInterface(final TInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TargetInterfacesType.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(TargetInterfacesType.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("47488221-f8d9-4b13-9e70-9d0730522fe4")
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
        TargetInterfacesType other = (TargetInterfacesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("26dfdab5-eefe-461f-830d-2e4c04607543")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("74a30b5a-9201-4a69-b6db-77df467edba9")
    public List<TInterface> getInterface() {
        List<TInterface> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TargetInterfacesType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TargetInterfacesType.MdaTypes.MDAASSOCDEP_ROLE), "interface")
              && TInterface.canInstantiate(d.getDependsOn()))
                results.add((TInterface)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TInterface.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d78909eb-473d-4372-9751-ccff48d9f416")
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
    @objid ("1ab6f7e0-0097-42f7-ba0c-98415f2faa7f")
    public boolean removeInterface(final TInterface obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TargetInterfacesType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TargetInterfacesType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("ee11614f-7901-4635-a805-a77bb080d0a3")
    protected  TargetInterfacesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("9d41a718-bd43-4588-99b0-3fef3730d845")
    public static final class MdaTypes {
        @objid ("6c2bb801-96e5-49ad-b850-f575b20f21ff")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f2fcec11-0627-4e66-8af6-a50ad50dbfe2")
        private static Stereotype MDAASSOCDEP;

        @objid ("53cd6a9a-a35b-45da-af39-43690429c286")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7b54f6f5-a0a1-47bf-8fca-8ffb30559eef")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "0b8a60bc-b7c2-43a8-8c93-f8be7f724b60", "TargetInterfacesType");
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

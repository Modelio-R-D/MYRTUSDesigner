/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 12:14 by Modelio Studio.
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
@objid ("291fadd2-5ae1-4fe1-92aa-eff52c5e8aec")
public class TargetInterfacesType implements IMdaProxy {
    @objid ("52e32255-767f-4e3c-8c39-0abcf2179e0d")
    public static final String STEREOTYPE_NAME = "TargetInterfacesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("2b3a76e3-cce3-4b54-b60e-5c64b3a8dc90")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TargetInterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TargetInterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("267e4bb1-0c25-4f0b-b854-e2d7e6707596")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TargetInterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TargetInterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TargetInterfacesType >> then instantiate a {@link TargetInterfacesType} proxy.
     * 
     * @return a {@link TargetInterfacesType} proxy on the created {@link ModelElement}.
     */
    @objid ("a545a34b-60a7-4596-bd62-556cecf626d8")
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
    @objid ("3ec8d315-143a-4d2c-90cb-e559e5e80878")
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
    @objid ("178f7b14-b81b-4a30-9e68-389d01ed7c39")
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
    @objid ("1ce319cb-c13e-4cb7-b602-d3667e74c167")
    public void addInterface(final TInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TargetInterfacesType.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(TargetInterfacesType.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("2f5df9b2-f296-45b1-a36f-58d3447901c2")
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
    @objid ("5c1d8d7f-bcac-488c-8596-c3779ebc2704")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c0da6896-4d3d-48ea-9c31-ee6a02af1ebf")
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

    @objid ("ca7fd808-0749-4a60-8fd2-cac4bd98e135")
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
    @objid ("2e82c92f-23a7-4e51-98c9-a327ae17ab41")
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

    @objid ("eb8ad72a-080f-4df0-9161-1867ed25bc4d")
    protected  TargetInterfacesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("22fea610-eb65-4706-a736-f2fc2df391ce")
    public static final class MdaTypes {
        @objid ("09d6e7d6-6d0a-4df5-b2b5-7e6dca69a5de")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ffaa87e3-d951-41ba-a3a0-28130764c9db")
        private static Stereotype MDAASSOCDEP;

        @objid ("1770941b-f38c-49ee-ab42-8216c46e471d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a52c57e1-ae41-4ba6-bfb8-39c384c7a6c9")
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

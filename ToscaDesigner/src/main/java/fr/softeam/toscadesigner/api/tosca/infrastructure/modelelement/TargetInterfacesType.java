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
    @objid ("284d5cb8-57b2-4982-b744-fae6d18142fa")
    public static final String STEREOTYPE_NAME = "TargetInterfacesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("7aa4f886-5bbe-4264-9d9e-5aa2ebe90704")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TargetInterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TargetInterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d004c116-c738-4b11-9968-f606a9b377ae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TargetInterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TargetInterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TargetInterfacesType >> then instantiate a {@link TargetInterfacesType} proxy.
     * 
     * @return a {@link TargetInterfacesType} proxy on the created {@link ModelElement}.
     */
    @objid ("11290d70-d2aa-4210-87b7-797e174e1b28")
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
    @objid ("0acfb6ab-6e68-4dfb-b5ec-c6fa13a4fea9")
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
    @objid ("8eaa0283-4f6f-4fa5-bf0e-11cd3db7b51a")
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
    @objid ("860fc45c-6aec-4b8c-b22f-66ea1eec618d")
    public void addInterface(final TInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TargetInterfacesType.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(TargetInterfacesType.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("65962a6c-43f1-4115-b8b6-f92ce9f19b24")
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
    @objid ("3e9df533-fc73-4952-a8aa-df00c7693e5d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1201b1c6-e914-47e4-be4b-14d540677830")
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

    @objid ("7b1e2b12-75f8-4a9e-b338-44ecc911ef7f")
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
    @objid ("32453827-fe66-4f90-a5b3-68b973ad5c2f")
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

    @objid ("bc97d007-eea0-4eb5-8a15-69bfcb788ebe")
    protected  TargetInterfacesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("9d41a718-bd43-4588-99b0-3fef3730d845")
    public static final class MdaTypes {
        @objid ("35e96749-f258-4d99-83fe-a6370f691390")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8e17fe0f-83ec-454d-bbec-c76fc5928313")
        private static Stereotype MDAASSOCDEP;

        @objid ("6f62bf4b-726e-4881-b533-b4900a674925")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("24067631-7400-4700-a0c6-e2a00c6d4019")
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

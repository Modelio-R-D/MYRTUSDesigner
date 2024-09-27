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
    @objid ("d6adb2dc-ded1-47af-a17a-3bd88d7d68fa")
    public static final String STEREOTYPE_NAME = "TargetInterfacesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6cbceed4-7ac2-428a-accf-86b7480c4a03")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TargetInterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TargetInterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5810b99b-ed3f-4bf3-90bc-8d76c7b4c07f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TargetInterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TargetInterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TargetInterfacesType >> then instantiate a {@link TargetInterfacesType} proxy.
     * 
     * @return a {@link TargetInterfacesType} proxy on the created {@link ModelElement}.
     */
    @objid ("3470cffe-ab40-4ab5-8d5b-11ab1d4cff55")
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
    @objid ("2b409142-89a2-47f7-94c9-ef8c432ee8a6")
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
    @objid ("8b676e92-7943-4d2c-8bd2-61c644d577a1")
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
    @objid ("e267b50c-c504-4b5f-835a-e1093e65ab19")
    public void addInterface(final TInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TargetInterfacesType.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(TargetInterfacesType.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("78636cb8-279b-4919-aba0-872980c2e266")
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
    @objid ("0108648b-9fe2-4314-ac22-2e170c08fb49")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fd520498-1fb9-4559-8bfc-b2b9a6b4aeb1")
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

    @objid ("aee1d213-c9e8-415a-897a-f551df7a7df6")
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
    @objid ("b843c42a-2d6d-4ac0-a476-ebc5f251da3d")
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

    @objid ("782e45aa-050b-47e7-86db-70ecf15a91e0")
    protected  TargetInterfacesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("22fea610-eb65-4706-a736-f2fc2df391ce")
    public static final class MdaTypes {
        @objid ("8f03a104-986e-4c84-a91d-f6348ee87380")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("034f53aa-7650-4df2-bd59-495eddd1ab5b")
        private static Stereotype MDAASSOCDEP;

        @objid ("b554e0c5-2a97-48e8-b96f-e56360e8378f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3476ec74-e294-4d99-95ba-d336ee030e33")
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

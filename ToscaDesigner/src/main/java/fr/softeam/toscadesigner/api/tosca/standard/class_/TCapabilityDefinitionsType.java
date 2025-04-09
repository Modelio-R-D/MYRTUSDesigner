/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TCapabilityDefinitionsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("34df36f3-ab10-40ee-875b-fa86a650ae97")
public class TCapabilityDefinitionsType extends TEntityType implements IMdaProxy {
    @objid ("745f0cff-929c-4e53-aaf7-d270a24bfc5a")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinitionsType";

    /**
     * Tells whether a {@link TCapabilityDefinitionsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinitionsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("08f9193b-3ccf-4c5d-96ca-e12df63d6d3d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinitionsType >> then instantiate a {@link TCapabilityDefinitionsType} proxy.
     * 
     * @return a {@link TCapabilityDefinitionsType} proxy on the created {@link Class}.
     */
    @objid ("24c7bf6b-df72-446f-8176-f507f35334ab")
    public static TCapabilityDefinitionsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TCapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityDefinitionsType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinitionsType} proxy from a {@link Class} stereotyped << TCapabilityDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TCapabilityDefinitionsType} proxy or <i>null</i>.
     */
    @objid ("c0a52d65-d139-44da-9b4d-9b6d276c6f12")
    public static TCapabilityDefinitionsType instantiate(final Class obj) {
        return TCapabilityDefinitionsType.canInstantiate(obj) ? new TCapabilityDefinitionsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinitionsType} proxy from a {@link Class} stereotyped << TCapabilityDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapabilityDefinitionsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9240ddbc-e33c-4475-92a1-66a95ff6cfe8")
    public static TCapabilityDefinitionsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityDefinitionsType.canInstantiate(obj))
        	return new TCapabilityDefinitionsType(obj);
        else
        	throw new IllegalArgumentException("TCapabilityDefinitionsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'capabilityDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6f49a5e6-6784-4311-a78b-c2a62bf13231")
    public void addCapabilityDefinition(final TCapabilityDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP);
            d.setName("capabilityDefinition");
            d.putTagValue(TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE, "capabilityDefinition");
        }
    }

    @objid ("05dbe114-857a-494f-b9a7-dbef8920d5bd")
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
        TCapabilityDefinitionsType other = (TCapabilityDefinitionsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'capabilityDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("13ff1f9e-a896-409d-b51e-c90da45e2e18")
    public List<TCapabilityDefinition> getCapabilityDefinition() {
        List<TCapabilityDefinition> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE), "capabilityDefinition")
              && TCapabilityDefinition.canInstantiate(d.getDependsOn()))
                results.add((TCapabilityDefinition)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e4b3db03-71d6-41e0-90a2-fc3838734193")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("7f27d7b5-de52-49b0-8db6-6752ec6c232f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'capabilityDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("327db278-89a7-48b0-ba4c-e6f4f833563e")
    public boolean removeCapabilityDefinition(final TCapabilityDefinition obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("f6cecbb2-e7c1-461a-9a82-34c987d2dd55")
    protected  TCapabilityDefinitionsType(final Class elt) {
        super(elt);
    }

    @objid ("95332bfd-048c-4739-9e5f-d06396b465d2")
    public static final class MdaTypes {
        @objid ("6e411cd4-4105-4ced-8b2c-60ca8507ca22")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("18ec053c-00b8-4a60-8eb8-b7a1fa8acaa6")
        private static Stereotype MDAASSOCDEP;

        @objid ("449ab47e-982a-46c4-a228-eff4c138dbce")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3e085336-b557-4fab-bc95-fa411c759b84")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "ac0418b1-a726-46e6-ac59-310f0055050f", "TCapabilityDefinitionsType");
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

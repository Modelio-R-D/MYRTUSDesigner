/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 12:14 by Modelio Studio.
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
@objid ("63396815-67ef-4b23-aa0a-6367d5b9567c")
public class TCapabilityDefinitionsType extends TEntityType implements IMdaProxy {
    @objid ("a9e758be-c3c1-4be8-bc42-f9f96fa39e4f")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinitionsType";

    /**
     * Tells whether a {@link TCapabilityDefinitionsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinitionsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("48215778-b232-4948-aa51-e077f367cf95")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinitionsType >> then instantiate a {@link TCapabilityDefinitionsType} proxy.
     * 
     * @return a {@link TCapabilityDefinitionsType} proxy on the created {@link Class}.
     */
    @objid ("d878e5f8-13bc-4c75-a243-d4f6d399951b")
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
    @objid ("f6e1db4d-f185-4dbe-8f6b-da9b591f8921")
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
    @objid ("11bc790d-619a-42ed-9eb0-c7b7eb56239d")
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
    @objid ("7dd05457-a3c8-482b-9bd1-4e7541be91a1")
    public void addCapabilityDefinition(final TCapabilityDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP);
            d.setName("capabilityDefinition");
            d.putTagValue(TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE, "capabilityDefinition");
        }
    }

    @objid ("d8387e65-390c-4241-9ed3-adc8c80f5ad6")
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
    @objid ("7366f8eb-eff8-41da-8ba5-d4ec8b64937a")
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
    @objid ("9c4d42db-1ec0-421e-86b9-a2780cabaad6")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("d6051659-05e8-43d8-8ecf-7161ac6c7082")
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
    @objid ("e970aebe-9ac3-4f37-8374-78b597b070c3")
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

    @objid ("7f5f1ec5-0ef4-42fb-9835-2b0993b5394f")
    protected  TCapabilityDefinitionsType(final Class elt) {
        super(elt);
    }

    @objid ("039dd1d6-0c13-43af-a95b-aba4b7fffbf4")
    public static final class MdaTypes {
        @objid ("33aa0ae1-839c-435b-b096-3fdd176a8662")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5558c684-c5e1-430a-b84d-ac234f2214a5")
        private static Stereotype MDAASSOCDEP;

        @objid ("317671d2-107f-4faf-ac62-928fe66d3092")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("29158e9c-fc61-4949-a7aa-df624b8faeff")
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

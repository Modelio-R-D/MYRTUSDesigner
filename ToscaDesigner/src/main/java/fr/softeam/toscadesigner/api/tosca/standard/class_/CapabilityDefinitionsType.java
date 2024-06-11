/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/06/2024 17:18 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << CapabilityDefinitionsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("341e1bf4-5a1b-41dc-9241-b7768e4d9841")
public class CapabilityDefinitionsType implements IMdaProxy {
    @objid ("abc13ec5-74e6-4939-9442-7a3d7fa34c0d")
    public static final String STEREOTYPE_NAME = "CapabilityDefinitionsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("f0c133e4-3eb1-4848-ae10-4f5f252f2dc9")
    protected final Class elt;

    /**
     * Tells whether a {@link CapabilityDefinitionsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CapabilityDefinitionsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0c118ce5-f116-4251-920d-aa45c8c94402")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (CapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(CapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << CapabilityDefinitionsType >> then instantiate a {@link CapabilityDefinitionsType} proxy.
     * 
     * @return a {@link CapabilityDefinitionsType} proxy on the created {@link Class}.
     */
    @objid ("c1bbe8f1-0829-47f5-b91a-a66bc91bc971")
    public static CapabilityDefinitionsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(CapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT);
        return CapabilityDefinitionsType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CapabilityDefinitionsType} proxy from a {@link Class} stereotyped << CapabilityDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CapabilityDefinitionsType} proxy or <i>null</i>.
     */
    @objid ("2585b603-db79-4d4f-934e-2eb34c31b548")
    public static CapabilityDefinitionsType instantiate(final Class obj) {
        return CapabilityDefinitionsType.canInstantiate(obj) ? new CapabilityDefinitionsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CapabilityDefinitionsType} proxy from a {@link Class} stereotyped << CapabilityDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CapabilityDefinitionsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c672fd03-909d-4909-98c2-fe82536dc23d")
    public static CapabilityDefinitionsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CapabilityDefinitionsType.canInstantiate(obj))
        	return new CapabilityDefinitionsType(obj);
        else
        	throw new IllegalArgumentException("CapabilityDefinitionsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'capabilityDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("75a7bc97-1ff3-45dd-9bb9-b42c809bb243")
    public void addCapabilityDefinition(final TCapabilityDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CapabilityDefinitionsType.MdaTypes.MDAASSOCDEP);
            d.setName("capabilityDefinition");
            d.putTagValue(CapabilityDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE, "capabilityDefinition");
        }
    }

    @objid ("18d8ca9a-1495-4af5-8fdb-7a6ac2b9b896")
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
        CapabilityDefinitionsType other = (CapabilityDefinitionsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'capabilityDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("05013b7b-8666-412d-b916-23c3f9ee077e")
    public List<TCapabilityDefinition> getCapabilityDefinition() {
        List<TCapabilityDefinition> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CapabilityDefinitionsType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CapabilityDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE), "capabilityDefinition")
              && TCapabilityDefinition.canInstantiate(d.getDependsOn()))
                results.add((TCapabilityDefinition)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("5d2c5f83-45dd-480c-a5cf-2a8c402d13a9")
    public Class getElement() {
        return this.elt;
    }

    @objid ("63779847-0fc2-4028-be01-85d5e8f6b3f0")
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
    @objid ("b344c450-847c-4dd8-b185-fe782238dae1")
    public boolean removeCapabilityDefinition(final TCapabilityDefinition obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CapabilityDefinitionsType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CapabilityDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("14a9e1ee-8330-4423-af3a-ae493315e92f")
    protected  CapabilityDefinitionsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("b75d1473-eb27-4f9e-8d6e-6f2a337062c4")
    public static final class MdaTypes {
        @objid ("094966d1-48b6-4e69-ab38-caeeec377768")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("844b67dd-1c61-438c-b133-6d428e2ba9aa")
        private static Stereotype MDAASSOCDEP;

        @objid ("7cb4c344-20a3-4fd1-a89c-ee79499d2626")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4b6ae4c5-61fe-44cd-acf6-f706c56fd375")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "ac0418b1-a726-46e6-ac59-310f0055050f", "CapabilityDefinitionsType");
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

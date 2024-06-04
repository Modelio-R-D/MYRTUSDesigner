/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 15:45 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TTopologyElementInstanceStates >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9cbbf7a6-d302-423c-9f6b-d77bb4f505da")
public class TTopologyElementInstanceStates implements IMdaProxy {
    @objid ("7a3f2184-5756-4b85-8c87-d36171eb197a")
    public static final String STEREOTYPE_NAME = "TTopologyElementInstanceStates";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("f9c65bf4-85ad-4015-a984-c3182454a179")
    protected final Class elt;

    /**
     * Tells whether a {@link TTopologyElementInstanceStates proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TTopologyElementInstanceStates >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("723fe20c-4bbb-4c14-8106-dd30ae34013e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TTopologyElementInstanceStates >> then instantiate a {@link TTopologyElementInstanceStates} proxy.
     * 
     * @return a {@link TTopologyElementInstanceStates} proxy on the created {@link Class}.
     */
    @objid ("de6db7dc-d35d-47b0-875f-dc450fe9805b")
    public static TTopologyElementInstanceStates create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT);
        return TTopologyElementInstanceStates.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TTopologyElementInstanceStates} proxy from a {@link Class} stereotyped << TTopologyElementInstanceStates >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TTopologyElementInstanceStates} proxy or <i>null</i>.
     */
    @objid ("13569246-b856-4c86-bf96-84a6a39b9ffc")
    public static TTopologyElementInstanceStates instantiate(final Class obj) {
        return TTopologyElementInstanceStates.canInstantiate(obj) ? new TTopologyElementInstanceStates(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TTopologyElementInstanceStates} proxy from a {@link Class} stereotyped << TTopologyElementInstanceStates >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TTopologyElementInstanceStates} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3e99a1f3-7313-4ce9-95a2-e11d3aa92219")
    public static TTopologyElementInstanceStates safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TTopologyElementInstanceStates.canInstantiate(obj))
        	return new TTopologyElementInstanceStates(obj);
        else
        	throw new IllegalArgumentException("TTopologyElementInstanceStates: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'instanceState' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9c51f3b3-4807-4a4d-85dd-c58da4877988")
    public void addInstanceState(final InstanceStateType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP);
            d.setName("instanceState");
            d.putTagValue(TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP_ROLE, "instanceState");
        }
    }

    @objid ("7546a74e-e5bf-4453-98a2-c4aae7c2bb79")
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
        TTopologyElementInstanceStates other = (TTopologyElementInstanceStates) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("5d22b8a4-d10f-4d2a-a17d-380cf9002d8b")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'instanceState' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("69a34a80-c8e5-4ffa-b8bc-95f7a2d8a92b")
    public List<InstanceStateType> getInstanceState() {
        List<InstanceStateType> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP_ROLE), "instanceState")
              && InstanceStateType.canInstantiate(d.getDependsOn()))
                results.add((InstanceStateType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), InstanceStateType.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("dd0f473f-c78c-47b9-bde1-364f27e53c85")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'instanceState' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b4ef1c62-14c7-4a76-8cba-96a684b608f4")
    public boolean removeInstanceState(final InstanceStateType obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("693c912a-c298-4d04-ade0-0f6e66394d55")
    protected  TTopologyElementInstanceStates(final Class elt) {
        this.elt = elt;
    }

    @objid ("aab31484-9184-4f34-abdd-53bf9fa19f55")
    public static final class MdaTypes {
        @objid ("8a8edf9b-e5aa-4586-8aff-19e67e138b0c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a9345758-e666-41bc-a412-58f2e21d5cbc")
        private static Stereotype MDAASSOCDEP;

        @objid ("63449efa-66dd-4894-9437-0692ff1a80f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("120400ca-a658-4bd9-839c-4bcb288e1021")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "6bc1b842-da9c-42d9-8c4b-21f98dfdd988", "TTopologyElementInstanceStates");
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

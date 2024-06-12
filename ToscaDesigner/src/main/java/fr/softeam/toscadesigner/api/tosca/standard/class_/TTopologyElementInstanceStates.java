/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 12/06/2024 14:58 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ModelingSessionRegistry;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link Class} with << TTopologyElementInstanceStates >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4699c9b5-9e35-4e3d-bf7e-bc7700694767")
public class TTopologyElementInstanceStates implements IMdaProxy {
    @objid ("786995ab-0bf9-44a8-b4a2-f7b17063affc")
    public static final String STEREOTYPE_NAME = "TTopologyElementInstanceStates";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("6d0eff33-07cd-4b2a-9687-5434422cf544")
    protected final Class elt;

    /**
     * Tells whether a {@link TTopologyElementInstanceStates proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TTopologyElementInstanceStates >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fa360f50-6c18-47b0-8caa-56f46a2b1233")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TTopologyElementInstanceStates >> then instantiate a {@link TTopologyElementInstanceStates} proxy.
     * 
     * @return a {@link TTopologyElementInstanceStates} proxy on the created {@link Class}.
     */
    @objid ("0ca0a637-7855-4de2-a33b-6d8097fa1b51")
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
    @objid ("811419c8-5d88-456e-aea5-ec4386149137")
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
    @objid ("94e62cb6-aec3-4991-b0dd-027668044b73")
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
    @objid ("0c7aa390-9012-44e3-90f2-5077a9814957")
    public void addInstanceState(final InstanceStateType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP);
            d.setName("instanceState");
            d.putTagValue(TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP_ROLE, "instanceState");
        }
    }

    @objid ("c402c9dd-8f93-4839-bdda-3e2f7d42634d")
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
    @objid ("e6a04932-06f1-43a8-89bc-bbd19535a575")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'instanceState' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("096d5f77-e2d6-4e68-9eb8-0676b67f91b2")
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

    @objid ("ea168a88-2d57-4df8-b280-c685694eaec1")
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
    @objid ("adfecb8f-fe8d-4e20-b608-ef8167b026e5")
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

    @objid ("428bfa5c-24f9-4375-af14-12999cac5a12")
    protected  TTopologyElementInstanceStates(final Class elt) {
        this.elt = elt;
    }

    @objid ("94012e2c-eaaf-4ffe-8f83-ea60bc752de8")
    public static final class MdaTypes {
        @objid ("f3709095-b20a-4808-9378-8a211a50ae79")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7bb1f481-3fe8-4a44-bccd-36dfe965eba4")
        private static Stereotype MDAASSOCDEP;

        @objid ("db90cf8f-6741-469e-a74b-95fdbd5ce8f0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f0b38bb-b071-4c22-9084-27d7c7866668")
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

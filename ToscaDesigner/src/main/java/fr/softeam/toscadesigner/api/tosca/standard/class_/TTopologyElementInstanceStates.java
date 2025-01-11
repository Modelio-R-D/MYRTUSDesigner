/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 16:04 by Modelio Studio.
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
@objid ("0abf2199-9ca1-42ce-a03d-8b446f2bf210")
public class TTopologyElementInstanceStates implements IMdaProxy {
    @objid ("a5d30c74-85d9-404d-af28-b29920423ea2")
    public static final String STEREOTYPE_NAME = "TTopologyElementInstanceStates";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("bcfafc2f-0f4e-40ab-9ddd-fbbeca321f25")
    protected final Class elt;

    /**
     * Tells whether a {@link TTopologyElementInstanceStates proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TTopologyElementInstanceStates >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6d27e116-ff9d-46aa-85fa-6ffc4a67ccd2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TTopologyElementInstanceStates >> then instantiate a {@link TTopologyElementInstanceStates} proxy.
     * 
     * @return a {@link TTopologyElementInstanceStates} proxy on the created {@link Class}.
     */
    @objid ("914c80b2-ad5a-4b68-bcbf-11d4821430f7")
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
    @objid ("1797e12f-76bb-4e25-8a33-b23140aa10f5")
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
    @objid ("f8bb7408-5579-4e5f-8af2-756a323351a8")
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
    @objid ("a63390f4-87b9-4033-b100-a3b2f3f1ff54")
    public void addInstanceState(final InstanceStateType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP);
            d.setName("instanceState");
            d.putTagValue(TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP_ROLE, "instanceState");
        }
    }

    @objid ("49543e1c-2f55-4da7-a75f-b380b2f4bef6")
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
    @objid ("6113726e-27c6-4cda-93ce-d1f62dd50879")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'instanceState' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("46fd1de1-36cc-4416-acc3-0653eedc3cea")
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

    @objid ("66db910c-3f78-49bb-8f61-ac42cbd008f9")
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
    @objid ("f120052f-4ca6-40e2-8207-1b21e65a9441")
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

    @objid ("b9af09e3-1fa0-4a49-9177-18c7e9c9482e")
    protected  TTopologyElementInstanceStates(final Class elt) {
        this.elt = elt;
    }

    @objid ("94bbab26-a96c-4ffd-8f3a-de610940d39e")
    public static final class MdaTypes {
        @objid ("1af57e00-cdbf-4c15-820b-68211bc552de")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e7f0eeb5-bb95-45cd-b297-340840b5f0b5")
        private static Stereotype MDAASSOCDEP;

        @objid ("f0317052-e5b8-49ce-808f-096a07e27d31")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d02b8d3a-d3b2-445a-ae2f-c24509a60241")
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

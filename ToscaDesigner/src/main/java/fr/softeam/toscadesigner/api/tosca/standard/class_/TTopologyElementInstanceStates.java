/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
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
@objid ("4699c9b5-9e35-4e3d-bf7e-bc7700694767")
public class TTopologyElementInstanceStates implements IMdaProxy {
    @objid ("7921f223-7269-45be-99fe-c3fb5bec9d9c")
    public static final String STEREOTYPE_NAME = "TTopologyElementInstanceStates";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("c46b0b22-a93e-4c65-802b-5b15f3b0614d")
    protected final Class elt;

    /**
     * Tells whether a {@link TTopologyElementInstanceStates proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TTopologyElementInstanceStates >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5bd4793c-864c-4c34-bfdf-acbef374b5e9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TTopologyElementInstanceStates >> then instantiate a {@link TTopologyElementInstanceStates} proxy.
     * 
     * @return a {@link TTopologyElementInstanceStates} proxy on the created {@link Class}.
     */
    @objid ("63ea98ba-75dd-4d60-b55e-f651f66e6556")
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
    @objid ("9cbc3d36-cd59-47a2-8d68-84537b506c5b")
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
    @objid ("99d91d67-ed4a-49b6-ba4e-2be58b0f965e")
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
    @objid ("86f34759-9974-407a-a696-0db7992dc627")
    public void addInstanceState(final InstanceStateType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP);
            d.setName("instanceState");
            d.putTagValue(TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP_ROLE, "instanceState");
        }
    }

    @objid ("67de9289-551e-4635-bb3b-5e12b5113d64")
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
    @objid ("91bbb726-e36e-4028-b39a-57d3d9daedbf")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'instanceState' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("26f29519-a7af-48fc-afc4-97df42ff8fa4")
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

    @objid ("1d527eae-1671-49ec-be7c-4594d630da6c")
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
    @objid ("73466fdf-2fcf-444d-86b9-b68e75b7a3fe")
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

    @objid ("a836a0bf-961f-4aef-90e2-7ae14db69991")
    protected  TTopologyElementInstanceStates(final Class elt) {
        this.elt = elt;
    }

    @objid ("94012e2c-eaaf-4ffe-8f83-ea60bc752de8")
    public static final class MdaTypes {
        @objid ("504ae381-d478-4c65-a23a-cc7d99c53223")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("72c1321b-abe6-4141-b3d5-d557b2a17ef2")
        private static Stereotype MDAASSOCDEP;

        @objid ("aadbc7ef-d379-486f-bb7e-40c1ab885dbe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c487e4c8-dc78-4a1a-a3c2-1a9ebcdd3a0d")
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

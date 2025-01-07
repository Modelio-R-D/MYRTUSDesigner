/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 15:23 by Modelio Studio.
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
    @objid ("76231726-d962-407a-9304-db2f19fd7f2b")
    public static final String STEREOTYPE_NAME = "TTopologyElementInstanceStates";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("27bb4815-5ccf-400c-b951-56cf6a2068e1")
    protected final Class elt;

    /**
     * Tells whether a {@link TTopologyElementInstanceStates proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TTopologyElementInstanceStates >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9f4cacda-324b-4009-9273-2d0ecef2d5d3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TTopologyElementInstanceStates.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TTopologyElementInstanceStates >> then instantiate a {@link TTopologyElementInstanceStates} proxy.
     * 
     * @return a {@link TTopologyElementInstanceStates} proxy on the created {@link Class}.
     */
    @objid ("71c72b35-cfc6-46d1-82d9-b3942278bee3")
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
    @objid ("b636d7cf-cad5-4042-9127-2a1169521b63")
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
    @objid ("1df3c3f5-0288-417f-980d-4bc48e5fd55b")
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
    @objid ("0984fdb3-0527-4d85-8975-77945e2ea20b")
    public void addInstanceState(final InstanceStateType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP);
            d.setName("instanceState");
            d.putTagValue(TTopologyElementInstanceStates.MdaTypes.MDAASSOCDEP_ROLE, "instanceState");
        }
    }

    @objid ("d2fd6ae5-f937-4ec8-a598-c54dae05c053")
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
    @objid ("bbc6c74b-6cf5-4296-b0b1-cd1299796399")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'instanceState' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c8c6f253-5448-4f36-a827-1986201d2361")
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

    @objid ("8cbf8ec6-bc58-490e-940c-f3773dd94985")
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
    @objid ("124b7e0b-9766-452b-a693-cffab2877c15")
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

    @objid ("a2236d69-3a78-4dd4-84df-f128d48863b2")
    protected  TTopologyElementInstanceStates(final Class elt) {
        this.elt = elt;
    }

    @objid ("94bbab26-a96c-4ffd-8f3a-de610940d39e")
    public static final class MdaTypes {
        @objid ("2f5455b4-d754-4632-87ea-38004abb8203")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8ceb4690-7e3a-4309-b840-2d93a0d1eb2a")
        private static Stereotype MDAASSOCDEP;

        @objid ("bc96a569-7c6d-4f53-92e9-85ea52724f5a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("89f87959-2161-4fe0-ae23-99cf982831e2")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 15:34 by Modelio Studio.
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
@objid ("45169949-4fc8-4917-939d-667253875ede")
public class TCapabilityDefinitionsType implements IMdaProxy {
    @objid ("47c84776-4b00-414a-987b-b7c960b58860")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinitionsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("71289aa0-dafd-4f74-9187-795214819698")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapabilityDefinitionsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinitionsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("08c8aed4-a384-4b8d-a6f7-ffd7232afb12")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinitionsType >> then instantiate a {@link TCapabilityDefinitionsType} proxy.
     * 
     * @return a {@link TCapabilityDefinitionsType} proxy on the created {@link Class}.
     */
    @objid ("06fea55c-7e0c-4cd1-a0dc-e6128f8d2eab")
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
    @objid ("1490f13d-a2c9-49ed-9ff5-836a89695487")
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
    @objid ("91f35689-1ec5-4d5d-a808-90b34981a214")
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
    @objid ("852c81f9-b24f-4d17-be10-226d884243a7")
    public void addCapabilityDefinition(final TCapabilityDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP);
            d.setName("capabilityDefinition");
            d.putTagValue(TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE, "capabilityDefinition");
        }
    }

    @objid ("b08d860f-c80f-49c0-a282-f08b1b3f1d18")
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
    @objid ("09ddf130-8779-4e12-a34d-bad5f0fe7268")
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
    @objid ("22dbc68c-218f-4495-bb37-63f766bc9c1e")
    public Class getElement() {
        return this.elt;
    }

    @objid ("879cee02-1e50-47bf-a2fa-83d9386d8110")
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
    @objid ("317adb33-6721-4f47-83c6-1c8296b05851")
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

    @objid ("6723ba98-d3cb-45e1-bcf3-8e3fd0b3ae20")
    protected  TCapabilityDefinitionsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("8d8b8ad8-51b2-427a-9ec7-1fad2c07d723")
    public static final class MdaTypes {
        @objid ("0fee8cba-c015-46da-b902-9e75b3517748")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2a21666a-81b3-412c-a4e7-c5e2a332789d")
        private static Stereotype MDAASSOCDEP;

        @objid ("a9db17bd-aa84-4569-b3fa-b24505940b28")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6bcec1bc-003d-404e-a6b2-952818f96186")
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

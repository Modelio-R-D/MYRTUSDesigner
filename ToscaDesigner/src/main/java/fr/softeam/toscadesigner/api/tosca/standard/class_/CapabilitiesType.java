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
 * Proxy class to handle a {@link Class} with << CapabilitiesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a72ca4d5-546d-4b8d-8cc6-1ff47a4433f0")
public class CapabilitiesType implements IMdaProxy {
    @objid ("07b8b649-a916-4232-b4da-c837ef4bd67d")
    public static final String STEREOTYPE_NAME = "CapabilitiesType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("d197c7b4-4114-46ca-895e-dd706b5a00fa")
    protected final Class elt;

    /**
     * Tells whether a {@link CapabilitiesType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CapabilitiesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("326fefc9-ce19-40fa-8a03-540c915e562b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (CapabilitiesType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(CapabilitiesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << CapabilitiesType >> then instantiate a {@link CapabilitiesType} proxy.
     * 
     * @return a {@link CapabilitiesType} proxy on the created {@link Class}.
     */
    @objid ("6b55e2dc-07e7-430d-86f1-251ae4eff3da")
    public static CapabilitiesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(CapabilitiesType.MdaTypes.STEREOTYPE_ELT);
        return CapabilitiesType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CapabilitiesType} proxy from a {@link Class} stereotyped << CapabilitiesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CapabilitiesType} proxy or <i>null</i>.
     */
    @objid ("625839f5-a351-4670-bb12-c9b0410f2b88")
    public static CapabilitiesType instantiate(final Class obj) {
        return CapabilitiesType.canInstantiate(obj) ? new CapabilitiesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CapabilitiesType} proxy from a {@link Class} stereotyped << CapabilitiesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CapabilitiesType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("726375fe-8de0-4d0f-90fe-8cea91f4d50a")
    public static CapabilitiesType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CapabilitiesType.canInstantiate(obj))
        	return new CapabilitiesType(obj);
        else
        	throw new IllegalArgumentException("CapabilitiesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'capability' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("19605918-6cde-4382-9734-ea3fdb4e0aa9")
    public void addCapability(final TCapability obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CapabilitiesType.MdaTypes.MDAASSOCDEP);
            d.setName("capability");
            d.putTagValue(CapabilitiesType.MdaTypes.MDAASSOCDEP_ROLE, "capability");
        }
    }

    @objid ("07535163-0e89-47b9-9bc7-72c63b5ea286")
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
        CapabilitiesType other = (CapabilitiesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'capability' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("85cc9539-3185-4ec2-b537-44a12a191498")
    public List<TCapability> getCapability() {
        List<TCapability> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(CapabilitiesType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(CapabilitiesType.MdaTypes.MDAASSOCDEP_ROLE), "capability")
              && TCapability.canInstantiate(d.getDependsOn()))
                results.add((TCapability)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TCapability.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("2425103d-ae65-4f87-8dab-72737224b4a3")
    public Class getElement() {
        return this.elt;
    }

    @objid ("6db73941-8a72-4182-aa35-708cf1701768")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'capability' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6f4d2ad2-9667-48c2-92e8-97d84ac7acd2")
    public boolean removeCapability(final TCapability obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(CapabilitiesType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(CapabilitiesType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("4b72363e-0758-4b99-9758-0ec57caf4e86")
    protected  CapabilitiesType(final Class elt) {
        this.elt = elt;
    }

    @objid ("3325ec9f-563a-4146-9124-f6464f3a58c7")
    public static final class MdaTypes {
        @objid ("aecc9f70-c488-41cf-870c-f61fe19f22dd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fec2e3b1-d5e2-42ea-bc0d-79c72d138d7f")
        private static Stereotype MDAASSOCDEP;

        @objid ("84109ee1-0390-4b4e-964a-f3eb648e9874")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("653104d4-e6ff-44a1-8cd0-24dbe80e234b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "03d159c3-b62b-497f-9176-c5137b4cb33d", "CapabilitiesType");
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

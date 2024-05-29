/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
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
@objid ("3cf705d1-1bbf-4ccf-b3fa-9b88b0e7e81d")
public class CapabilitiesType implements IMdaProxy {
    @objid ("56e12bc6-a699-4cbf-8be0-6dea07f4b924")
    public static final String STEREOTYPE_NAME = "CapabilitiesType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("7037832c-94ed-464e-9a9c-ef0229177759")
    protected final Class elt;

    /**
     * Tells whether a {@link CapabilitiesType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CapabilitiesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8add8736-d8fb-4b9f-a5ff-62554f58c563")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (CapabilitiesType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(CapabilitiesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << CapabilitiesType >> then instantiate a {@link CapabilitiesType} proxy.
     * @return a {@link CapabilitiesType} proxy on the created {@link Class}.
     */
    @objid ("a166a6ae-00dd-4321-87cc-df3ffb3f2c98")
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
    @objid ("c02a043f-3d50-46b5-8a9d-0f4c7d057241")
    public static CapabilitiesType instantiate(final Class obj) {
        return CapabilitiesType.canInstantiate(obj) ? new CapabilitiesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CapabilitiesType} proxy from a {@link Class} stereotyped << CapabilitiesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CapabilitiesType} proxy.
     */
    @objid ("feba7892-90a2-4989-9a7c-596c4c0e19b1")
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
     */
    @objid ("273f573c-c24e-49db-8981-8f76972d7ee7")
    public void addCapability(final TCapability obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CapabilitiesType.MdaTypes.MDAASSOCDEP);
            d.setName("capability");
            d.putTagValue(CapabilitiesType.MdaTypes.MDAASSOCDEP_ROLE, "capability");
        }
    }

    @objid ("07a784e3-7ba1-4524-92fc-de9b6c34c81f")
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
     */
    @objid ("c28e3f5c-7e56-49ca-94f3-cb2b043781f3")
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
    @objid ("e953d374-17c3-48fb-a965-3f17046eb3bd")
    public Class getElement() {
        return this.elt;
    }

    @objid ("cc7cff3d-b8cc-4c5d-93fb-68abda1c45df")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'capability' role.<p>
     * Role description:
     * null
     */
    @objid ("7c39fccb-be7c-4ce2-a9e8-13b0d050aaf7")
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

    @objid ("f2fbdac0-19d2-4644-a00a-c45e00881802")
    protected  CapabilitiesType(final Class elt) {
        this.elt = elt;
    }

    @objid ("9756a2f6-09dd-429f-aeb3-67be875fed03")
    public static final class MdaTypes {
        @objid ("b64a5fe6-7545-4670-8ec5-720574d37ac0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0777a095-0937-47bd-b04b-6aec0743556a")
        private static Stereotype MDAASSOCDEP;

        @objid ("9069e6f1-0157-41a4-b173-7c1362e82882")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ecbbb2fa-aba0-44b0-9f13-6918958a3dab")
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

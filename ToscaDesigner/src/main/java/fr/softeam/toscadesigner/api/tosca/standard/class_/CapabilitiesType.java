/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:38 by Modelio Studio.
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
    @objid ("eb67e7b6-0225-4b2f-a66a-2e99766b4cf5")
    public static final String STEREOTYPE_NAME = "CapabilitiesType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("aa0763aa-f5c5-40b3-b475-6e5fc0a8bf63")
    protected final Class elt;

    /**
     * Tells whether a {@link CapabilitiesType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CapabilitiesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9a05615a-dcfc-4f02-b4af-7d70c841e193")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (CapabilitiesType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(CapabilitiesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << CapabilitiesType >> then instantiate a {@link CapabilitiesType} proxy.
     * 
     * @return a {@link CapabilitiesType} proxy on the created {@link Class}.
     */
    @objid ("a8940922-a761-4b97-9796-8b57a2f0a063")
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
    @objid ("057cb5ac-d6df-46cf-8175-6c2d082c663b")
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
    @objid ("bbbd7740-ff46-4ee4-b813-766bcf4f3e82")
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
    @objid ("88f0982a-3fcb-4506-b1a1-dd4f8bd63f5d")
    public void addCapability(final TCapability obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), CapabilitiesType.MdaTypes.MDAASSOCDEP);
            d.setName("capability");
            d.putTagValue(CapabilitiesType.MdaTypes.MDAASSOCDEP_ROLE, "capability");
        }
    }

    @objid ("3f5215cf-811c-4107-af76-c078bd5ca79e")
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
    @objid ("68883ba2-5ac9-4fba-879f-d9b4ff2a9a35")
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
    @objid ("7480750b-ef5e-47e2-b04d-f11e394faa01")
    public Class getElement() {
        return this.elt;
    }

    @objid ("f9c73b1b-d1b3-4fa2-afff-5232613737b4")
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
    @objid ("3b598b0e-df40-4b64-b4c7-8e4e417c113f")
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

    @objid ("8a5576a6-ec17-4e93-91f6-c624e0e4f4cf")
    protected  CapabilitiesType(final Class elt) {
        this.elt = elt;
    }

    @objid ("9756a2f6-09dd-429f-aeb3-67be875fed03")
    public static final class MdaTypes {
        @objid ("aae5438e-75da-4c4b-8954-ccbd0a008d95")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("023bbb71-3cd5-4681-9d21-95a8500ef668")
        private static Stereotype MDAASSOCDEP;

        @objid ("bf097812-f3f9-4f52-ab44-4ffad2addf6f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("24d7ebd1-a580-4a9e-8f07-bd674cff363e")
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

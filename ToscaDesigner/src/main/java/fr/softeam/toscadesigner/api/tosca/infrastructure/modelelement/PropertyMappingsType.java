/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 14:48 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << PropertyMappingsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("dc6d76d3-7842-447d-943f-98ad77b8eb33")
public class PropertyMappingsType implements IMdaProxy {
    @objid ("16c53a30-7549-47e2-a071-8e1f5b80a5ae")
    public static final String STEREOTYPE_NAME = "PropertyMappingsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("8f042323-8fa8-47d6-a2e3-7e6359323197")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertyMappingsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertyMappingsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9d77d81e-37b0-49fb-a2cb-d76edcd998b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertyMappingsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertyMappingsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertyMappingsType >> then instantiate a {@link PropertyMappingsType} proxy.
     * 
     * @return a {@link PropertyMappingsType} proxy on the created {@link ModelElement}.
     */
    @objid ("d0c88e3f-6722-4f9e-9f69-136ea7a4c344")
    public static PropertyMappingsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(PropertyMappingsType.MdaTypes.STEREOTYPE_ELT);
        return PropertyMappingsType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PropertyMappingsType} proxy from a {@link ModelElement} stereotyped << PropertyMappingsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PropertyMappingsType} proxy or <i>null</i>.
     */
    @objid ("7361f202-a8f9-4740-a2df-1d34dce30932")
    public static PropertyMappingsType instantiate(final ModelElement obj) {
        return PropertyMappingsType.canInstantiate(obj) ? new PropertyMappingsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertyMappingsType} proxy from a {@link ModelElement} stereotyped << PropertyMappingsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PropertyMappingsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c0f8f412-6fd5-46fc-824e-8efd7e4fb890")
    public static PropertyMappingsType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertyMappingsType.canInstantiate(obj))
        	return new PropertyMappingsType(obj);
        else
        	throw new IllegalArgumentException("PropertyMappingsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'propertyMapping' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("28a48df2-a921-4de4-98a8-93efd49e06c2")
    public void addPropertyMapping(final TPropertyMapping obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PropertyMappingsType.MdaTypes.MDAASSOCDEP);
            d.setName("propertyMapping");
            d.putTagValue(PropertyMappingsType.MdaTypes.MDAASSOCDEP_ROLE, "propertyMapping");
        }
    }

    @objid ("043e65ed-ee06-4145-a983-cae66de3f017")
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
        PropertyMappingsType other = (PropertyMappingsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("b35d2007-5bbb-47e4-9746-361ee8920027")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'propertyMapping' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e0518fe3-23e7-4a09-b825-2890f331dcb5")
    public List<TPropertyMapping> getPropertyMapping() {
        List<TPropertyMapping> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(PropertyMappingsType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(PropertyMappingsType.MdaTypes.MDAASSOCDEP_ROLE), "propertyMapping")
              && TPropertyMapping.canInstantiate(d.getDependsOn()))
                results.add((TPropertyMapping)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPropertyMapping.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a5a23df9-71cc-45fb-b854-ed18d5e44788")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'propertyMapping' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fb9aeb0a-242b-46c4-bae1-d6f2d583f7c5")
    public boolean removePropertyMapping(final TPropertyMapping obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(PropertyMappingsType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(PropertyMappingsType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("68b5241e-42f7-45c9-9426-2a0be31c13c5")
    protected  PropertyMappingsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("00e982af-6a4e-4b9d-bdf7-3b8a83f211fd")
    public static final class MdaTypes {
        @objid ("cf71a111-16d2-4ccc-8a43-b8466860f4ad")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2cca89da-48fe-415a-aada-ea36afaa991f")
        private static Stereotype MDAASSOCDEP;

        @objid ("61ba1dfd-ddd0-427f-9e2d-41ef99fa2c30")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2efdc079-2343-4fcf-bdd3-2b23a6220642")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "3d7421b3-1723-4400-8e4f-48176ac40c34", "PropertyMappingsType");
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

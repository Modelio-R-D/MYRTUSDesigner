/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:09 by Modelio Studio.
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
    @objid ("c27fe5a9-7775-44f6-a5d2-be4a9f679816")
    public static final String STEREOTYPE_NAME = "PropertyMappingsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("5bbc80e2-d895-4624-9deb-358d10c72c56")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertyMappingsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertyMappingsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3fea766a-d591-49ea-8c3d-a44f6bca498b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertyMappingsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertyMappingsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertyMappingsType >> then instantiate a {@link PropertyMappingsType} proxy.
     * 
     * @return a {@link PropertyMappingsType} proxy on the created {@link ModelElement}.
     */
    @objid ("a696aa76-c372-4a0b-8dee-4e5cc58d924a")
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
    @objid ("7b6948e4-1fb9-4d8b-b04b-036d95092d1b")
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
    @objid ("730c9e51-a682-421a-987e-9dd2370f0d96")
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
    @objid ("04e64f3d-778c-481e-afe9-eee752299d72")
    public void addPropertyMapping(final TPropertyMapping obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PropertyMappingsType.MdaTypes.MDAASSOCDEP);
            d.setName("propertyMapping");
            d.putTagValue(PropertyMappingsType.MdaTypes.MDAASSOCDEP_ROLE, "propertyMapping");
        }
    }

    @objid ("77d9242a-a4eb-4941-b8cb-96c21085d25f")
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
    @objid ("d8734242-e141-4ab9-acea-faf22714b1fa")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'propertyMapping' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("02ca2f75-91a0-4c8d-8e90-e6265adb609f")
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

    @objid ("cca14a97-08a7-4cb8-8c1d-a757470dd1a9")
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
    @objid ("de1e1af0-d9b8-463f-af96-91f0211cb283")
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

    @objid ("6a3c8290-b7d2-4fc7-aff6-b515b267a06e")
    protected  PropertyMappingsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("00e982af-6a4e-4b9d-bdf7-3b8a83f211fd")
    public static final class MdaTypes {
        @objid ("827e9d4b-1be1-4a83-a9c1-dbfca1d44d74")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a76451db-1f38-4b15-9631-584427512e98")
        private static Stereotype MDAASSOCDEP;

        @objid ("4a0195c0-ecbd-48bb-9cdd-73001c11a51d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1a6e71c4-49f5-4793-ba9e-f554fc9437f0")
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

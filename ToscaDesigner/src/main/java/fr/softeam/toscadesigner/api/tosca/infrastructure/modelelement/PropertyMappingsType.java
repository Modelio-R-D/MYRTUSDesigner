/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 13/02/2025 17:54 by Modelio Studio.
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
    @objid ("414db804-7138-4d1b-822b-8aaf3eac3c7b")
    public static final String STEREOTYPE_NAME = "PropertyMappingsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("a7409137-32bd-4675-bb0e-6df1cd0e4828")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertyMappingsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertyMappingsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b0787c62-3ec8-4bf0-9155-1c016631abb1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertyMappingsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertyMappingsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertyMappingsType >> then instantiate a {@link PropertyMappingsType} proxy.
     * 
     * @return a {@link PropertyMappingsType} proxy on the created {@link ModelElement}.
     */
    @objid ("207cc926-837a-42b8-a92f-39e4aebbf5b6")
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
    @objid ("703ab570-69f5-4947-a6cb-af2f071daed7")
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
    @objid ("9afe2b51-2a3d-452c-b27e-12e977cc9233")
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
    @objid ("1f23251d-b87c-40be-95ce-ccba6141c32e")
    public void addPropertyMapping(final TPropertyMapping obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PropertyMappingsType.MdaTypes.MDAASSOCDEP);
            d.setName("propertyMapping");
            d.putTagValue(PropertyMappingsType.MdaTypes.MDAASSOCDEP_ROLE, "propertyMapping");
        }
    }

    @objid ("baeede28-c8ab-4574-add6-d11e7a2b1885")
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
    @objid ("94f29154-0b52-489e-a197-4f0b343b1a43")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'propertyMapping' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c97dee2c-4702-4cd3-92d3-37e17eeb9b3d")
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

    @objid ("6612169f-7d63-4946-a56e-d95dcab01dbf")
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
    @objid ("adb5895c-595d-4d1c-b4f5-cec21f80658b")
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

    @objid ("290da85b-3fbc-452b-9895-6a0fd4c31314")
    protected  PropertyMappingsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("00e982af-6a4e-4b9d-bdf7-3b8a83f211fd")
    public static final class MdaTypes {
        @objid ("51f8deeb-0456-4b76-a70b-ddf65f942d55")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dda4bc0a-b9ad-48b9-be09-d62c0b9a6c2b")
        private static Stereotype MDAASSOCDEP;

        @objid ("91bcd7dd-2682-4d31-a71c-09691207d304")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("61737b11-2210-4acf-b74f-5c64bc3cb9d2")
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

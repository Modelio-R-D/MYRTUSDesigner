/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 20/08/2024 17:06 by Modelio Studio.
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
@objid ("497418f1-1946-4274-9c44-a2f79c01869e")
public class PropertyMappingsType implements IMdaProxy {
    @objid ("663c1c78-b346-4dad-91ef-97851a4e951c")
    public static final String STEREOTYPE_NAME = "PropertyMappingsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("a8ffd8b1-f276-4449-af45-cf2a3888138b")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertyMappingsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertyMappingsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("342c00bb-3d75-418f-b2ed-b2f2ec3032d8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertyMappingsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertyMappingsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertyMappingsType >> then instantiate a {@link PropertyMappingsType} proxy.
     * 
     * @return a {@link PropertyMappingsType} proxy on the created {@link ModelElement}.
     */
    @objid ("c129e9f7-af75-4c49-b24d-0b4fe24e706a")
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
    @objid ("961dcc36-e150-480c-933d-74c433819810")
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
    @objid ("bb60b0a2-15b9-4b0f-9f8c-ab859b5ccb23")
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
    @objid ("d038ebe0-f12d-4013-a050-7e315cd22f07")
    public void addPropertyMapping(final TPropertyMapping obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PropertyMappingsType.MdaTypes.MDAASSOCDEP);
            d.setName("propertyMapping");
            d.putTagValue(PropertyMappingsType.MdaTypes.MDAASSOCDEP_ROLE, "propertyMapping");
        }
    }

    @objid ("cfe2f98c-8304-4018-9b2a-72710a5e4241")
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
    @objid ("510797c0-4efd-4b51-a37c-9e6309d992a8")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'propertyMapping' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("54c3853b-9ee2-4d56-9bbc-40239f6d7093")
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

    @objid ("c1d80bf7-0484-431b-b487-64d1516066f3")
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
    @objid ("6b4fa8e8-4503-45fd-9756-2210be58b5b2")
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

    @objid ("a19cae89-1883-4800-9b78-943b7798be35")
    protected  PropertyMappingsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("3f98ccab-5dc8-44dd-9b4c-64a586278ae1")
    public static final class MdaTypes {
        @objid ("692b5cf0-8db4-4880-b79c-9e2194893052")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("33575362-93f8-42ee-8bbf-ceb0f5187806")
        private static Stereotype MDAASSOCDEP;

        @objid ("679c34b2-44c1-40d7-be52-51d0dc874019")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e268eabe-5903-4a9a-8787-ddb7df6af65f")
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

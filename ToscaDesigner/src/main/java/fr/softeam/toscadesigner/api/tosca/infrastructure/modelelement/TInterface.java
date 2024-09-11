/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 14:25 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TInterface >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e775c97f-3522-4560-8548-f46367ef065f")
public class TInterface implements IMdaProxy {
    @objid ("d3fac260-414a-4335-bcba-1193ce0847b5")
    public static final String STEREOTYPE_NAME = "TInterface";

    @objid ("6c2cf538-82cf-47e5-b3ca-e5afe122c844")
    public static final String PROPERTYTYPEDEFINITION2_PROPERTY = "PropertyTypeDefinition2";

    @objid ("e2aede4b-48e1-4ba5-8b95-b20241be1c61")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("38c2d0b1-7e44-4c2d-b535-98a2de264563")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TInterface >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("087806d2-b312-4fec-beee-b9ade2d8b873")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TInterface.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TInterface.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TInterface >> then instantiate a {@link TInterface} proxy.
     * 
     * @return a {@link TInterface} proxy on the created {@link ModelElement}.
     */
    @objid ("658e67d3-2982-408a-bb64-8b50b90219ca")
    public static TInterface create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TInterface.MdaTypes.STEREOTYPE_ELT);
        return TInterface.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TInterface} proxy from a {@link ModelElement} stereotyped << TInterface >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TInterface} proxy or <i>null</i>.
     */
    @objid ("e8eaec89-cf13-49d1-821b-0c198f408cc2")
    public static TInterface instantiate(final ModelElement obj) {
        return TInterface.canInstantiate(obj) ? new TInterface(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TInterface} proxy from a {@link ModelElement} stereotyped << TInterface >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TInterface} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d9d25c28-cd1d-4df2-abb4-b445c6373edf")
    public static TInterface safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TInterface.canInstantiate(obj))
        	return new TInterface(obj);
        else
        	throw new IllegalArgumentException("TInterface: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7ce9fd73-c261-4b97-b2c1-f1e80feffb9c")
    public void addOperation(final TOperation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TInterface.MdaTypes.MDAASSOCDEP);
            d.setName("operation");
            d.putTagValue(TInterface.MdaTypes.MDAASSOCDEP_ROLE, "operation");
        }
    }

    @objid ("956aeb19-63a8-4d94-88d9-d0a9a5e67aca")
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
        TInterface other = (TInterface) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("153cc003-ea33-4303-8509-a5040c74f0b0")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TInterface.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e1e234bc-7c27-4536-bd83-fef370a3c4b9")
    public String getName() {
        String value = this.elt.getProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                                            TInterface.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TInterface.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TInterface.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the values of the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8b23c5ab-4ca0-4fac-af25-2dbf6eb57c7b")
    public List<TOperation> getOperation() {
        List<TOperation> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TInterface.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TInterface.MdaTypes.MDAASSOCDEP_ROLE), "operation")
              && TOperation.canInstantiate(d.getDependsOn()))
                results.add((TOperation)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TOperation.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for property 'TInterface.PropertyTypeDefinition2'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eb9b51ef-e6f4-4494-af31-d2a185af6113")
    public String getPropertyTypeDefinition2() {
        String value = this.elt.getProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                                            TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getName());
        if (value == null) {
          value = TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("497882d8-623a-4c42-8cbb-b17cb8198ed0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("518f747f-eb03-4918-97de-e67f9db82fdd")
    public boolean removeOperation(final TOperation obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TInterface.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TInterface.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Setter for property 'TInterface.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("afcfd590-8d7f-4f53-9a3d-b058293f85d2")
    public void setName(final String value) {
        this.elt.setProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                             TInterface.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TInterface.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TInterface.PropertyTypeDefinition2'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("76bb62f7-dcd9-46fc-9b4a-f66dcf30e992")
    public void setPropertyTypeDefinition2(final String value) {
        this.elt.setProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                             TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT, value));
    }

    @objid ("77322112-6cbe-4ae2-aa24-5be39343ddad")
    protected  TInterface(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("cd2be280-cf56-491a-9c2f-c8d7562f9181")
    public static final class MdaTypes {
        @objid ("bff40b7d-9944-40c0-b568-b8d43d6726cb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("176d3ada-f277-4c7d-af90-b771c129de5a")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("c7473929-73b6-4dd3-8ecf-4071a7f03e26")
        public static PropertyDefinition PROPERTYTYPEDEFINITION2_PROPERTY_ELT;

        @objid ("8c1e4b5d-a7a8-4fae-9d94-acad1e1e6d71")
        private static Stereotype MDAASSOCDEP;

        @objid ("038f2e3f-0f57-4ad2-92f3-a81df8927f7a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("79418de7-0b63-47aa-8ab0-63d20daf7272")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7a56a78f-21b0-463d-b927-b9a3a461b565", "TInterface");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "abc12b37-e245-4073-9a9f-ebeeb2f4426d", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d060b91b-e90c-48fb-8017-56a04caf352b", "PropertyTypeDefinition2");
            PROPERTYTYPEDEFINITION2_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTYTYPEDEFINITION2_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

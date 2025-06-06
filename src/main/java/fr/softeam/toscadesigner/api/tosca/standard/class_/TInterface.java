/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 04/06/2025 20:07 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TOperation;
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
 * Proxy class to handle a {@link Class} with << TInterface >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7b02853f-bc57-4859-97a1-76fd8cf42f40")
public class TInterface extends TEntityType implements IMdaProxy {
    @objid ("4e546a22-49a6-42a9-b6e9-570bf7bcf143")
    public static final String STEREOTYPE_NAME = "TInterface";

    @objid ("f15bcd60-8989-4010-a36f-198f139cdf08")
    public static final String PROPERTYTYPEDEFINITION2_PROPERTY = "PropertyTypeDefinition2";

    @objid ("1c5bb743-6dbf-46d5-b274-f34140764229")
    public static final String NAME_PROPERTY = "name";

    /**
     * Tells whether a {@link TInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TInterface >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("796cd8db-2e5f-41b7-92dc-9fd10bfbc001")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TInterface.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TInterface.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TInterface >> then instantiate a {@link TInterface} proxy.
     * 
     * @return a {@link TInterface} proxy on the created {@link Class}.
     */
    @objid ("661afd2b-e857-4df6-83f4-bea57d44d75e")
    public static TInterface create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TInterface.MdaTypes.STEREOTYPE_ELT);
        return TInterface.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TInterface} proxy from a {@link Class} stereotyped << TInterface >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TInterface} proxy or <i>null</i>.
     */
    @objid ("12c1a377-83f8-4809-9259-2aa8d0ee689f")
    public static TInterface instantiate(final Class obj) {
        return TInterface.canInstantiate(obj) ? new TInterface(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TInterface} proxy from a {@link Class} stereotyped << TInterface >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TInterface} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c9e42489-816c-4051-8852-9a7a8054987a")
    public static TInterface safeInstantiate(final Class obj) throws IllegalArgumentException {
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
    @objid ("9adaa0a4-1e89-4dca-b2f8-d1bdbc9c946d")
    public void addOperation(final TOperation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TInterface.MdaTypes.MDAASSOCDEP);
            d.setName("operation");
            d.putTagValue(TInterface.MdaTypes.MDAASSOCDEP_ROLE, "operation");
        }
    }

    @objid ("38decd7e-943e-4cc2-a844-8a54e9d46a3c")
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
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("604e661c-9d9c-45bb-b85f-18b11af6b57f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TInterface.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6dd5e040-c2c5-4b28-85d8-fbc5b39e8ed9")
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
    @objid ("d1917367-56d4-4d15-b6b9-903e1dda0877")
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
    @objid ("03a759b7-42d0-4912-a4c8-6278157b7955")
    public String getPropertyTypeDefinition2() {
        String value = this.elt.getProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                                            TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getName());
        if (value == null) {
          value = TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("4718b8a9-bc4a-44f3-80b4-b24cfbc030ee")
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
    @objid ("e5ab8894-c87d-40f0-bd2d-b7fd17b98031")
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
    @objid ("465b3fde-6930-4b54-924b-60c0e3884a60")
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
    @objid ("e56fe9f5-4f8d-4191-ab4b-10b161961fdb")
    public void setPropertyTypeDefinition2(final String value) {
        this.elt.setProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                             TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT, value));
    }

    @objid ("5050394b-d0f9-4a69-9590-5a04cbfd6bbb")
    protected  TInterface(final Class elt) {
        super(elt);
    }

    @objid ("91769d7a-8861-4d4e-826d-bc1897b367f0")
    public static final class MdaTypes {
        @objid ("a718efa2-57fc-4616-8ee0-fe6153b054bd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("00fdf66e-0141-4030-9758-06f558dd6053")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("513ecd33-bdbe-4da7-a723-6da21ca2e04a")
        public static PropertyDefinition PROPERTYTYPEDEFINITION2_PROPERTY_ELT;

        @objid ("7576ce2e-0b3e-438a-ae10-35bc06012a74")
        private static Stereotype MDAASSOCDEP;

        @objid ("03d5d29e-c204-4373-bc03-8e7f93e9137c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("87879308-3be9-4b4f-9f92-a69a3f54b392")
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

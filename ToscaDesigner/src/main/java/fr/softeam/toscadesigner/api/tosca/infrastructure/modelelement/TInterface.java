/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 19/09/2024 15:04 by Modelio Studio.
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
    @objid ("c4096d33-6162-44d3-b420-d203b6feb561")
    public static final String STEREOTYPE_NAME = "TInterface";

    @objid ("d3e3b218-369a-40a2-b8d4-9304d1f1eecb")
    public static final String PROPERTYTYPEDEFINITION2_PROPERTY = "PropertyTypeDefinition2";

    @objid ("442682ad-05b9-4857-a473-791894566015")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6b183d97-9f46-450b-8465-1de367d533ec")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TInterface >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e686dea1-2151-4705-9408-6b0121650d13")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TInterface.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TInterface.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TInterface >> then instantiate a {@link TInterface} proxy.
     * 
     * @return a {@link TInterface} proxy on the created {@link ModelElement}.
     */
    @objid ("7ee10fce-5f31-4f67-9438-9769dc0ec48f")
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
    @objid ("290c5476-54ea-4921-82a3-bdc99bf4ef72")
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
    @objid ("d9f2b0aa-dec6-4697-b668-ca0e0fe34c04")
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
    @objid ("e0daccb7-50c0-4709-8b9d-ad748875d54e")
    public void addOperation(final TOperation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TInterface.MdaTypes.MDAASSOCDEP);
            d.setName("operation");
            d.putTagValue(TInterface.MdaTypes.MDAASSOCDEP_ROLE, "operation");
        }
    }

    @objid ("5c436f36-51e4-41aa-bd62-85c0bdb8d6d6")
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
    @objid ("fcb6a09e-7e14-4554-bc7e-db57cf8598f5")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TInterface.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("815bbc94-49ad-480f-839b-e18495e3e12b")
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
    @objid ("adecf1c2-eea5-479d-a0c8-6b431825ba8c")
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
    @objid ("13b95d4f-4e5a-477e-9339-eb91cb87ebc1")
    public String getPropertyTypeDefinition2() {
        String value = this.elt.getProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                                            TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getName());
        if (value == null) {
          value = TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("8b0d4cff-b587-4fa1-8fa7-646f0e47ab9a")
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
    @objid ("760b1d33-926c-437f-b624-49e833e7f0e4")
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
    @objid ("508fb77e-b09d-45c3-803a-98270afc1c41")
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
    @objid ("1ab70531-f35f-4ec3-92f0-e7c9e79d2275")
    public void setPropertyTypeDefinition2(final String value) {
        this.elt.setProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                             TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT, value));
    }

    @objid ("998a4a4f-d9d1-40bb-ac30-206a95b13ef4")
    protected  TInterface(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("cd2be280-cf56-491a-9c2f-c8d7562f9181")
    public static final class MdaTypes {
        @objid ("ac103d58-220d-4afd-92e6-9fc2ca2ec224")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("83f4a5f2-27f6-4262-abce-c39f9dd664dd")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("c026322f-b213-425d-896b-8dcb4df3c743")
        public static PropertyDefinition PROPERTYTYPEDEFINITION2_PROPERTY_ELT;

        @objid ("96e0083e-5c92-46ac-a88a-2c33707fb33c")
        private static Stereotype MDAASSOCDEP;

        @objid ("7c01c225-17a3-4c08-bb2c-34ee9bb8eb30")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("08522a59-8071-4443-9016-6872aa9b80b9")
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

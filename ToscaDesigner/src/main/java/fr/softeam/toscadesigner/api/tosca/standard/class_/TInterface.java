/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 14:48 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TPropertyDef;
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
@objid ("d25c1250-12da-451d-9068-8f7df07870b5")
public class TInterface extends TEntityType implements IMdaProxy {
    @objid ("9bd25831-bd07-43ec-824d-b521291cb146")
    public static final String STEREOTYPE_NAME = "TInterface";

    @objid ("9346f2a9-a29f-4bca-b937-cd0e9c26e440")
    public static final String NOTIFICATIONS_PROPERTY = "notifications";

    /**
     * Tells whether a {@link TInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TInterface >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bcbb6638-6a1c-4ecb-aa2b-5c672ec626c1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TInterface.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TInterface.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TInterface >> then instantiate a {@link TInterface} proxy.
     * 
     * @return a {@link TInterface} proxy on the created {@link Class}.
     */
    @objid ("21019fb3-a5d3-4e22-9993-9636123833e0")
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
    @objid ("b403b3fe-f2a4-4234-af6b-ce2606f99e8f")
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
    @objid ("59a86829-f51e-422b-8a23-b11ea8b388e1")
    public static TInterface safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TInterface.canInstantiate(obj))
        	return new TInterface(obj);
        else
        	throw new IllegalArgumentException("TInterface: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'inputs' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("00ed2a0b-d699-4d41-845a-c2a71016c560")
    public void addInputs(final TPropertyDef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TInterface.MdaTypes.MDAASSOCDEP);
            d.setName("inputs");
            d.putTagValue(TInterface.MdaTypes.MDAASSOCDEP_ROLE, "inputs");
        }
    }

    /**
     * Add a value to the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("49af2207-cb98-462b-8e0f-cbec606af09d")
    public void addOperation(final TOperation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TInterface.MdaTypes.MDAASSOCDEP);
            d.setName("operation");
            d.putTagValue(TInterface.MdaTypes.MDAASSOCDEP_ROLE, "operation");
        }
    }

    @objid ("5926df9d-0111-446b-8b1a-8fb508e65538")
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
    @objid ("cda227b2-04a5-4395-a375-9056cf298e21")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'inputs' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f734d4cd-4a63-40c7-a7f7-784141dea68c")
    public List<TPropertyDef> getInputs() {
        List<TPropertyDef> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TInterface.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TInterface.MdaTypes.MDAASSOCDEP_ROLE), "inputs")
              && TPropertyDef.canInstantiate(d.getDependsOn()))
                results.add((TPropertyDef)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPropertyDef.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for property 'TInterface.notifications'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4d84f99f-2cf7-41e0-b7f9-c53fed5f5b1e")
    public String getNotifications() {
        String value = this.elt.getProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                                            TInterface.MdaTypes.NOTIFICATIONS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TInterface.MdaTypes.NOTIFICATIONS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TInterface.MdaTypes.NOTIFICATIONS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the values of the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("293b54bd-7257-4493-b157-492dfb781d98")
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

    @objid ("bfb4c74f-23df-43d1-a738-1a45825f56e6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'inputs' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1e5cf5cd-6eeb-41e6-8b5f-0d41b833d66a")
    public boolean removeInputs(final TPropertyDef obj) {
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
     * Remove a value from the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a0c0528c-d1e2-41df-af6a-d5c186347581")
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
     * Setter for property 'TInterface.notifications'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("02b26f29-9ed1-469d-912b-1a74de54961c")
    public void setNotifications(final String value) {
        this.elt.setProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                             TInterface.MdaTypes.NOTIFICATIONS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TInterface.MdaTypes.NOTIFICATIONS_PROPERTY_ELT, value));
    }

    @objid ("c76b2619-1614-4e27-879b-8787f162e051")
    protected  TInterface(final Class elt) {
        super(elt);
    }

    @objid ("fec61bb7-ebc6-4c72-855c-e26017f81467")
    public static final class MdaTypes {
        @objid ("54257a66-12af-467f-981c-9bbaebf02782")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b131e9d5-2f87-486e-add6-2ceed410ee06")
        public static PropertyDefinition NOTIFICATIONS_PROPERTY_ELT;

        @objid ("d305ea7f-372b-46e0-8d40-59997f0320c0")
        private static Stereotype MDAASSOCDEP;

        @objid ("efce293d-c5c6-4050-bc38-e92cf0918ff4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("26b33ce9-443d-4771-aef3-4b28835a8ff2")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7a56a78f-21b0-463d-b927-b9a3a461b565", "TInterface");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "1c86cfbe-dda6-4b27-b5aa-59b0433d0603", "notifications");
            NOTIFICATIONS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NOTIFICATIONS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 11:15 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TPlans >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bc62ba12-4657-48f1-9ba9-6cdb8af5b9ca")
public class TPlans implements IMdaProxy {
    @objid ("5371ca14-6a13-4d85-826c-3eecc5dcc7ee")
    public static final String STEREOTYPE_NAME = "TPlans";

    @objid ("6288e973-ed2d-47ec-afd0-3e570bd536c0")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("b9c2b142-9499-4ef6-8d9e-2dd7a8cd8b2c")
    protected final Class elt;

    /**
     * Tells whether a {@link TPlans proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPlans >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4b36cf91-5140-45d8-917f-ae3cf5c90faa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPlans.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPlans.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPlans >> then instantiate a {@link TPlans} proxy.
     * 
     * @return a {@link TPlans} proxy on the created {@link Class}.
     */
    @objid ("09ac9320-e8f0-4686-ac5e-e64a6b74dcc4")
    public static TPlans create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TPlans.MdaTypes.STEREOTYPE_ELT);
        return TPlans.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TPlans} proxy from a {@link Class} stereotyped << TPlans >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TPlans} proxy or <i>null</i>.
     */
    @objid ("5ad74a4f-51c7-4342-af1b-f6b55c392518")
    public static TPlans instantiate(final Class obj) {
        return TPlans.canInstantiate(obj) ? new TPlans(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPlans} proxy from a {@link Class} stereotyped << TPlans >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TPlans} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a5fc6696-d37e-4125-8039-b15b70c6aa30")
    public static TPlans safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPlans.canInstantiate(obj))
        	return new TPlans(obj);
        else
        	throw new IllegalArgumentException("TPlans: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7c6a960a-020a-4d7e-8134-9066c5a5c88b")
    public void addPlans(final TPlan obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TPlans.MdaTypes.MDAASSOCDEP);
            d.setName("plans");
            d.putTagValue(TPlans.MdaTypes.MDAASSOCDEP_ROLE, "plans");
        }
    }

    @objid ("9be9ebb7-1bea-4642-9364-570269ceec1b")
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
        TPlans other = (TPlans) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("17bccc04-ae9f-4a0f-bc97-83ea9bfd62b8")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ff383441-b082-4231-9686-4267c0a5cfe4")
    public List<TPlan> getPlans() {
        List<TPlan> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TPlans.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TPlans.MdaTypes.MDAASSOCDEP_ROLE), "plans")
              && TPlan.canInstantiate(d.getDependsOn()))
                results.add((TPlan)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPlan.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for property 'TPlans.targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("75767b7d-f91d-4c83-870f-cf714587504e")
    public String getTargetNamespace() {
        String value = this.elt.getProperty(TPlans.MdaTypes.STEREOTYPE_ELT,
                                            TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("701770e9-9734-45fa-9232-4776952d4593")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("671cf5e4-08a4-40ea-a30d-389607fdb066")
    public boolean removePlans(final TPlan obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TPlans.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TPlans.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Setter for property 'TPlans.targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9337d29f-1dea-4806-8f3e-b9d8670e0e7c")
    public void setTargetNamespace(final String value) {
        this.elt.setProperty(TPlans.MdaTypes.STEREOTYPE_ELT,
                             TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("a3105d72-cd16-4a22-8065-b6029b943654")
    protected  TPlans(final Class elt) {
        this.elt = elt;
    }

    @objid ("7d3fe2c0-1747-463c-8422-122bb642f8f8")
    public static final class MdaTypes {
        @objid ("15598c8a-926f-4ee5-b29d-1a3e7f70ee13")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d189e363-7c0f-4561-9378-158ca76138cf")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("af46e14d-bef0-4135-9239-d482378bd9de")
        private static Stereotype MDAASSOCDEP;

        @objid ("22b2f885-44be-4550-bc7e-599cf006a282")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2c7ba913-3d16-4f90-8963-1f7c5f04137a")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "01bb24fb-fe3d-4005-9bff-68bb6b6e8520", "TPlans");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a54b904c-da10-4750-952f-46ef1d577da6", "targetNamespace");
            TARGETNAMESPACE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TARGETNAMESPACE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

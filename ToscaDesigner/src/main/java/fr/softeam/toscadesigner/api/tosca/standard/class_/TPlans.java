/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/06/2024 17:18 by Modelio Studio.
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
@objid ("e2e3a105-8f70-4777-a448-225c46251368")
public class TPlans implements IMdaProxy {
    @objid ("0b1fea63-eb19-4ee2-8cdb-2d2a2020b901")
    public static final String STEREOTYPE_NAME = "TPlans";

    @objid ("dd8f0e57-5c21-4697-bd3b-13a5d37a227e")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("8134e065-c62c-4d45-a922-27acd02e8547")
    protected final Class elt;

    /**
     * Tells whether a {@link TPlans proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPlans >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7449e7a7-895f-46c0-8629-4045482f42db")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPlans.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPlans.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPlans >> then instantiate a {@link TPlans} proxy.
     * 
     * @return a {@link TPlans} proxy on the created {@link Class}.
     */
    @objid ("e428efbf-cce9-405f-a79b-9270b8f36257")
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
    @objid ("62731f2a-550e-4611-be01-bd32c2147f39")
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
    @objid ("ba842f38-d848-467e-8a2c-415cfa0adedc")
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
    @objid ("6e904e1a-93bc-4e79-a0f9-014fe06c46d1")
    public void addPlans(final TPlan obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TPlans.MdaTypes.MDAASSOCDEP);
            d.setName("plans");
            d.putTagValue(TPlans.MdaTypes.MDAASSOCDEP_ROLE, "plans");
        }
    }

    @objid ("fa6825be-716c-4f14-b13b-aab502e1c6c6")
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
    @objid ("e00c57dd-32a7-4f4c-a164-43d6f7c97555")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b8cb61c3-81d2-491d-8793-8a855dfd83f8")
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
    @objid ("73cfe0aa-7e79-45a0-b12f-e38e5b4566d0")
    public String getTargetNamespace() {
        String value = this.elt.getProperty(TPlans.MdaTypes.STEREOTYPE_ELT,
                                            TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("2db0dc3d-ab75-4147-847b-c306601d288f")
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
    @objid ("38ea56d5-8e16-409b-9477-abc9ffca33f0")
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
    @objid ("f0393132-3eb6-4e18-a5bf-688ac180cb7c")
    public void setTargetNamespace(final String value) {
        this.elt.setProperty(TPlans.MdaTypes.STEREOTYPE_ELT,
                             TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("51a73124-60f2-4a4f-8113-94beccfb2319")
    protected  TPlans(final Class elt) {
        this.elt = elt;
    }

    @objid ("5cb587f1-04c8-4ad7-9397-7511e4a3450e")
    public static final class MdaTypes {
        @objid ("c99e0f10-2689-44f1-9bad-7425156e10bb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("36cbffc2-89a5-4b69-ba20-7a8ae01eec17")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("b0d91740-52e6-4339-bc22-296f25034e46")
        private static Stereotype MDAASSOCDEP;

        @objid ("92a44014-4b58-46b0-b5ce-31d2ea00dc6a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a6221e1e-c80b-43c5-800a-8a8ca04ec830")
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

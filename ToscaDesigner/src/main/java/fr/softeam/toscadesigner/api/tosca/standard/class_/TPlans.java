/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 15:42 by Modelio Studio.
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
@objid ("f77b9f78-3436-46ae-b7bf-c75488a7a22c")
public class TPlans implements IMdaProxy {
    @objid ("674d7ffe-062d-49ed-a64f-a9b2b4ae1e9c")
    public static final String STEREOTYPE_NAME = "TPlans";

    @objid ("ef3c12a4-6e48-457b-bb85-ca67703b3bba")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("39d646ad-6264-4c15-bd3c-fca59886605d")
    protected final Class elt;

    /**
     * Tells whether a {@link TPlans proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPlans >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("36a5fd3a-2ae4-412a-a5c2-e2e7363d717f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPlans.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPlans.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPlans >> then instantiate a {@link TPlans} proxy.
     * 
     * @return a {@link TPlans} proxy on the created {@link Class}.
     */
    @objid ("8145c1df-8b28-42b5-85bd-6d177ccdaaae")
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
    @objid ("1348686f-c7f1-4659-9625-b0c516989610")
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
    @objid ("7a8813d3-27f2-429f-a696-154ad5e7ecac")
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
    @objid ("a0bbb9b2-f67f-43e3-80c8-37ce31b31147")
    public void addPlans(final TPlan obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TPlans.MdaTypes.MDAASSOCDEP);
            d.setName("plans");
            d.putTagValue(TPlans.MdaTypes.MDAASSOCDEP_ROLE, "plans");
        }
    }

    @objid ("ac2a78f5-6fd8-4099-a545-7b237e3871a2")
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
    @objid ("70a9330f-9d33-43cd-94b9-7fe549f419a1")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b85e4f0c-e70e-4c85-9b12-08d65efc6914")
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
    @objid ("fd4f748e-2ed4-4ad6-a0cf-c260463235d5")
    public String getTargetNamespace() {
        String value = this.elt.getProperty(TPlans.MdaTypes.STEREOTYPE_ELT,
                                            TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("12e8eb4c-573c-460c-af51-2cb470c8dcb5")
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
    @objid ("ee3c7d02-b30a-4241-b1bd-a64f387d4503")
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
    @objid ("e5043e03-5906-4ee0-bc9c-c9bf5df3ee28")
    public void setTargetNamespace(final String value) {
        this.elt.setProperty(TPlans.MdaTypes.STEREOTYPE_ELT,
                             TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("7bf9728f-5590-43a7-ac03-e3085ddeeb2e")
    protected  TPlans(final Class elt) {
        this.elt = elt;
    }

    @objid ("a6428728-0d0c-43bc-9067-357d07955dca")
    public static final class MdaTypes {
        @objid ("77e5b9a8-e138-4354-89bc-8bd7906d3cf3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7436e3b2-f301-494e-9965-a4d3382f3411")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("e1c74951-8580-4208-857f-b1c595538dd8")
        private static Stereotype MDAASSOCDEP;

        @objid ("3d51347f-52f7-4e80-aed8-1d691d84a47b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e5b2c5f8-40e3-447a-be36-46641afa6018")
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

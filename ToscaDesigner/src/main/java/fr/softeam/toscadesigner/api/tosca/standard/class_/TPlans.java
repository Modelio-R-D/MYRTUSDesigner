/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 12:38 by Modelio Studio.
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
    @objid ("cc703e31-6cb4-4d7c-a1c5-ea4cef1d3944")
    public static final String STEREOTYPE_NAME = "TPlans";

    @objid ("2f964f9e-784a-4e5d-81ba-a6f12442a3b1")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("c9c811dc-83aa-421d-97fe-e651c5da1c5d")
    protected final Class elt;

    /**
     * Tells whether a {@link TPlans proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPlans >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("67f47cfd-3ccc-4c5b-8c2d-63a00626b906")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPlans.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPlans.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPlans >> then instantiate a {@link TPlans} proxy.
     * 
     * @return a {@link TPlans} proxy on the created {@link Class}.
     */
    @objid ("7275fa06-4b6c-4ab7-9fe3-eeaf35f46334")
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
    @objid ("2a2ebc4b-c521-434c-b708-9824b47ce32b")
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
    @objid ("f4d5d46f-8cef-4399-9eb8-9f28bd514d04")
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
    @objid ("7086cdf7-5b06-4926-95b3-4d367c280ae7")
    public void addPlans(final TPlan obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TPlans.MdaTypes.MDAASSOCDEP);
            d.setName("plans");
            d.putTagValue(TPlans.MdaTypes.MDAASSOCDEP_ROLE, "plans");
        }
    }

    @objid ("26cddc86-7c62-40ad-9e59-09c8608adc76")
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
    @objid ("45c18753-e0cc-40ac-8bf2-74ba06be9fc2")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1ca01b75-fec7-44bf-bdab-e72d847f516e")
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
    @objid ("c093f3c6-f949-4064-a60a-96be878816d1")
    public String getTargetNamespace() {
        String value = this.elt.getProperty(TPlans.MdaTypes.STEREOTYPE_ELT,
                                            TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("3873755b-7dc1-4426-8158-7a284899b295")
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
    @objid ("cf52ac04-62d2-4096-82e7-463b3162b7b0")
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
    @objid ("69b56f51-8ade-44e7-9b52-486a9b03d9fd")
    public void setTargetNamespace(final String value) {
        this.elt.setProperty(TPlans.MdaTypes.STEREOTYPE_ELT,
                             TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPlans.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("3945c87c-0bfe-4432-952e-bd8e392265ad")
    protected  TPlans(final Class elt) {
        this.elt = elt;
    }

    @objid ("a6428728-0d0c-43bc-9067-357d07955dca")
    public static final class MdaTypes {
        @objid ("46b72f0f-41d1-4af2-a970-d237c3718ef1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c91780e-3bb4-4e3a-ad98-bb7ebb2f3c96")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("a4cde235-5203-49cc-bf44-38f89163c3f0")
        private static Stereotype MDAASSOCDEP;

        @objid ("a22972a3-0b8c-4f4c-8a35-793473eb6ce4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("755a8ba7-fa23-41c6-a455-6fc7a905c56a")
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

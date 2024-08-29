/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 14:48 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.class_.TPolicy;
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
 * Proxy class to handle a {@link ModelElement} with << PoliciesType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("870545aa-7011-43c5-ac2f-08d740738990")
public class PoliciesType1 implements IMdaProxy {
    @objid ("9992f6ba-c00f-4cda-89b2-9a97050c5693")
    public static final String STEREOTYPE_NAME = "PoliciesType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("69552016-75ed-4832-bd4f-c491ac7abad3")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PoliciesType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PoliciesType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0ada7fdc-cb21-4153-87bd-fdcdb8899cc4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PoliciesType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PoliciesType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PoliciesType1 >> then instantiate a {@link PoliciesType1} proxy.
     * 
     * @return a {@link PoliciesType1} proxy on the created {@link ModelElement}.
     */
    @objid ("e8dbbb21-f684-4c79-bd96-d93f926bdf03")
    public static PoliciesType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(PoliciesType1.MdaTypes.STEREOTYPE_ELT);
        return PoliciesType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PoliciesType1} proxy from a {@link ModelElement} stereotyped << PoliciesType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PoliciesType1} proxy or <i>null</i>.
     */
    @objid ("edea008e-cd15-4ef4-91d8-8dce194b9592")
    public static PoliciesType1 instantiate(final ModelElement obj) {
        return PoliciesType1.canInstantiate(obj) ? new PoliciesType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PoliciesType1} proxy from a {@link ModelElement} stereotyped << PoliciesType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PoliciesType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("880b91a8-34a8-4502-b37c-64ed532aaf86")
    public static PoliciesType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PoliciesType1.canInstantiate(obj))
        	return new PoliciesType1(obj);
        else
        	throw new IllegalArgumentException("PoliciesType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'policy' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4a84c7c0-c3c6-4d64-bebb-50027ca0b22b")
    public void addPolicy(final TPolicy obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PoliciesType1.MdaTypes.MDAASSOCDEP);
            d.setName("policy");
            d.putTagValue(PoliciesType1.MdaTypes.MDAASSOCDEP_ROLE, "policy");
        }
    }

    @objid ("956505e9-70c0-456a-ac21-52244ff3b169")
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
        PoliciesType1 other = (PoliciesType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("5fb97f86-8af3-4e37-b548-cac9c3588763")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'policy' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bc1a1405-dde7-4c69-a1fd-9e0dab2a4d50")
    public List<TPolicy> getPolicy() {
        List<TPolicy> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(PoliciesType1.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(PoliciesType1.MdaTypes.MDAASSOCDEP_ROLE), "policy")
              && TPolicy.canInstantiate(d.getDependsOn()))
                results.add((TPolicy)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPolicy.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d73855b9-4025-4560-90fb-5cbfc0695e11")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'policy' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7d7f940e-89ac-426d-bbe7-b74f7a653d28")
    public boolean removePolicy(final TPolicy obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(PoliciesType1.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(PoliciesType1.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("cd4ad0c9-7a2b-4e5a-824f-ed3d308a6e45")
    protected  PoliciesType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("4a2fad26-b581-47a4-b958-cfd6872bfab9")
    public static final class MdaTypes {
        @objid ("18634e04-ca10-45b6-802a-75124c9f9cc1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7c86af5b-6749-4e7f-bed7-c334a0d23c72")
        private static Stereotype MDAASSOCDEP;

        @objid ("af9c3fd8-4ab9-43f8-aa7b-406c7426361e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e2dd78b3-8e35-4621-aa82-b71711ce493c")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "941ef924-e37d-4b4b-ba3d-ded20d4c3ccd", "PoliciesType1");
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

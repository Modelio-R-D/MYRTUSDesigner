/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 15:45 by Modelio Studio.
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
    @objid ("fbdcff33-7c52-4868-8d45-c919d6fa3acd")
    public static final String STEREOTYPE_NAME = "TPlans";

    @objid ("4161b9c3-7a3f-457d-bf52-d724d31c444f")
    public static final String TARGETNAMESPACE_TAGTYPE = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("470fd438-8661-4497-8536-052f4ad0328c")
    protected final Class elt;

    /**
     * Tells whether a {@link TPlans proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPlans >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("663ec03b-2807-4d3e-a904-9010a551ec13")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPlans.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPlans.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPlans >> then instantiate a {@link TPlans} proxy.
     * 
     * @return a {@link TPlans} proxy on the created {@link Class}.
     */
    @objid ("67a98dcb-e053-4dc4-a493-b05bcbe9efed")
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
    @objid ("fcb8ebec-55d7-4b70-af4c-36ebef6faa5a")
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
    @objid ("5edd5266-b47e-4bd9-865c-0f4abbe805d5")
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
    @objid ("32c56cf4-762f-4784-a49b-809f75d841c6")
    public void addPlans(final TPlan obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TPlans.MdaTypes.MDAASSOCDEP);
            d.setName("plans");
            d.putTagValue(TPlans.MdaTypes.MDAASSOCDEP_ROLE, "plans");
        }
    }

    @objid ("395930e6-837a-482a-bffb-c27a85a893b8")
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
    @objid ("460e3491-f6d8-478e-9d48-695e0956b431")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("837daf3e-738a-44ae-bf4a-e54b2be58c62")
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
     * Getter for string property 'targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3e47d430-cc87-496c-b2f0-2b6a287f81bd")
    public String getTargetNamespace() {
        return this.elt.getTagValue(TPlans.MdaTypes.TARGETNAMESPACE_TAGTYPE_ELT);
    }

    @objid ("0825a9e0-6411-4d3e-ad74-d9bc56b4517c")
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
    @objid ("bb1d77b0-cdd9-4fab-99f1-fec99a511d12")
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
     * Setter for string property 'targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("72993ad0-c2a6-45f7-af45-eb9f49e43808")
    public void setTargetNamespace(final String value) {
        this.elt.putTagValue(TPlans.MdaTypes.TARGETNAMESPACE_TAGTYPE_ELT, value);
    }

    @objid ("f71daf87-21d8-42cf-864a-776cec10e8ea")
    protected  TPlans(final Class elt) {
        this.elt = elt;
    }

    @objid ("5cb587f1-04c8-4ad7-9397-7511e4a3450e")
    public static final class MdaTypes {
        @objid ("716f8477-1dab-4505-a672-092a67b20577")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e85e9692-8475-42a1-bf95-3ae212f4c992")
        public static TagType TARGETNAMESPACE_TAGTYPE_ELT;

        @objid ("8d3718f8-b0cc-4e8b-9e30-f78790e181aa")
        private static Stereotype MDAASSOCDEP;

        @objid ("74afcd74-48af-4116-aed2-2d80a915dc76")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("14506a14-23d5-4712-9598-6bc5b248f90f")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "01bb24fb-fe3d-4005-9bff-68bb6b6e8520", "TPlans");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "e97ddff4-a30d-47c5-89a2-fa72c3cf5f97", "targetNamespace");
            TARGETNAMESPACE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (TARGETNAMESPACE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

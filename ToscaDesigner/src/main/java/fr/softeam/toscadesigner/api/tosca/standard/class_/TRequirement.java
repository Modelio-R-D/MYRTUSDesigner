/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 18/02/2025 10:30 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
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
 * Proxy class to handle a {@link Class} with << TRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f40dc47b-b0d9-4f4d-971c-08292696bed8")
public class TRequirement implements IMdaProxy {
    @objid ("5cf7f9a4-cfb9-4a79-910e-a4d95f644ff7")
    public static final String STEREOTYPE_NAME = "TRequirement";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("3df5ae1d-a5ab-48fd-88bb-18ba5a3479db")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b6a59e58-aa6b-401f-91b8-970a7195851a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirement.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirement >> then instantiate a {@link TRequirement} proxy.
     * 
     * @return a {@link TRequirement} proxy on the created {@link Class}.
     */
    @objid ("15900dbb-4e4f-4dda-807d-1a0e593f7361")
    public static TRequirement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRequirement.MdaTypes.STEREOTYPE_ELT);
        return TRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRequirement} proxy from a {@link Class} stereotyped << TRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRequirement} proxy or <i>null</i>.
     */
    @objid ("22d30cf1-efd3-463d-adbc-c84300259028")
    public static TRequirement instantiate(final Class obj) {
        return TRequirement.canInstantiate(obj) ? new TRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirement} proxy from a {@link Class} stereotyped << TRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("15da0916-4263-4643-8252-4e2eab7fc727")
    public static TRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirement.canInstantiate(obj))
        	return new TRequirement(obj);
        else
        	throw new IllegalArgumentException("TRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("10df9e9c-7f80-4489-bb2b-368a23d5e953")
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
        TRequirement other = (TRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'capability' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bcb42922-c010-46c2-938f-d940a357f72c")
    public CapabilityStereotype getCapability() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TRequirement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TRequirement.MdaTypes.MDAASSOCDEP_ROLE), "capability")
                  && CapabilityStereotype.canInstantiate(d.getDependsOn())) {
                     return (CapabilityStereotype)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), CapabilityStereotype.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("3cb9ed01-f4bd-4633-8cfc-4e03ba2efeba")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'node' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d2a3e4c5-6afa-4385-8d94-02882078bcc6")
    public TNodeTemplate getNode() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TRequirement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TRequirement.MdaTypes.MDAASSOCDEP_ROLE), "node")
                  && TNodeTemplate.canInstantiate(d.getDependsOn())) {
                     return (TNodeTemplate)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'relationship' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("91d22983-ed49-45dc-8368-bfc478edbca4")
    public TRelationshipTemplate getRelationship() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TRequirement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TRequirement.MdaTypes.MDAASSOCDEP_ROLE), "relationship")
                  && TRelationshipTemplate.canInstantiate(d.getDependsOn())) {
                     return (TRelationshipTemplate)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("5a32d442-cca0-4f3f-91a5-e0142702110d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Set the value of the 'capability' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("239bd574-00d4-4aef-a864-235698f49a9c")
    public void setCapability(final CapabilityStereotype obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TRequirement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TRequirement.MdaTypes.MDAASSOCDEP_ROLE), "capability")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TRequirement.MdaTypes.MDAASSOCDEP);
              dep.setName("capability");      dep.putTagValue(TRequirement.MdaTypes.MDAASSOCDEP_ROLE, "capability");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Set the value of the 'node' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("06dc2e11-6c80-43d7-bb3a-682c7a56dc95")
    public void setNode(final TNodeTemplate obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TRequirement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TRequirement.MdaTypes.MDAASSOCDEP_ROLE), "node")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TRequirement.MdaTypes.MDAASSOCDEP);
              dep.setName("node");      dep.putTagValue(TRequirement.MdaTypes.MDAASSOCDEP_ROLE, "node");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Set the value of the 'relationship' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3704fea6-8fe3-44e1-890b-4bd17c939486")
    public void setRelationship(final TRelationshipTemplate obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TRequirement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TRequirement.MdaTypes.MDAASSOCDEP_ROLE), "relationship")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TRequirement.MdaTypes.MDAASSOCDEP);
              dep.setName("relationship");      dep.putTagValue(TRequirement.MdaTypes.MDAASSOCDEP_ROLE, "relationship");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    @objid ("cd888fa6-7b5d-4b2c-be6f-d470c473d6fb")
    protected  TRequirement(final Class elt) {
        this.elt = elt;
    }

    @objid ("7e3143f2-f9b1-465e-9d11-eba0e71d7d96")
    public static final class MdaTypes {
        @objid ("3ffe8109-3f5f-4bde-bbee-ce24152e22ae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bf52fecb-cb20-4dac-ad27-25020dfb4e31")
        private static Stereotype MDAASSOCDEP;

        @objid ("a7ac47de-6d6f-48d2-a319-bac43e5fd71d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f6f6690c-a8de-45f1-8919-7e4182a11480")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "f0ddd3c2-c7ec-4156-84b0-d31b76098b17", "TRequirement");
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

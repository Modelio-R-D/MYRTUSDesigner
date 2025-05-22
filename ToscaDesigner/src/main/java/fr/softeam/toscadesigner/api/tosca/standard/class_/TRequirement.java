/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 22/05/2025 15:07 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ModelingSessionRegistry;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link Class} with << TRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f40dc47b-b0d9-4f4d-971c-08292696bed8")
public class TRequirement implements IMdaProxy {
    @objid ("0c7c4300-fb1f-4098-a4d7-182e2fb537ad")
    public static final String STEREOTYPE_NAME = "TRequirement";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("bfb68762-afad-4bbe-b48d-1e4e248613c3")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("211548c2-bdb0-46ff-8b83-876a3b233131")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirement.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirement >> then instantiate a {@link TRequirement} proxy.
     * 
     * @return a {@link TRequirement} proxy on the created {@link Class}.
     */
    @objid ("796aa661-0e5d-4d6f-85b5-fea1d72bf18e")
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
    @objid ("e40ee714-9ba3-4775-afd7-2213654260a1")
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
    @objid ("903fe62f-e012-4b47-bf06-8607ea0e6791")
    public static TRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirement.canInstantiate(obj))
        	return new TRequirement(obj);
        else
        	throw new IllegalArgumentException("TRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d22372f3-7338-4330-96cc-1dd16a5e6f26")
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
    @objid ("d4fbe5bd-6ccd-45f6-9ffd-83211fe4eaf0")
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
    @objid ("0377b603-dd85-4a49-9602-44ad8c48ea4b")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'node' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ae860fe8-cc60-4756-8b6e-746899a79cd7")
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
    @objid ("c357a6bd-1b0e-416b-9ac9-2c5ca8822a6a")
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

    @objid ("417d1c95-7578-40f0-9343-61f20d58f65a")
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
    @objid ("c4fbdc7c-d388-472c-b2ed-3b7592981b8d")
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
    @objid ("e9fa9cd4-e6c1-4221-8269-93c7101d1c86")
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
    @objid ("a792a813-60c8-4bcc-a37a-e473351887a8")
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

    @objid ("d3b9b093-028b-4247-ab5f-aaa4d8e03bfa")
    protected  TRequirement(final Class elt) {
        this.elt = elt;
    }

    @objid ("7e3143f2-f9b1-465e-9d11-eba0e71d7d96")
    public static final class MdaTypes {
        @objid ("c92bc026-be7c-43c0-9249-6082c69b5a81")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c5c84035-3fac-494f-98e7-bacd48806ac8")
        private static Stereotype MDAASSOCDEP;

        @objid ("159894ed-ecc8-42ca-ab3a-448e14752fd5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6bd10e3a-e6f3-48ef-8448-bc6b277d4d0a")
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

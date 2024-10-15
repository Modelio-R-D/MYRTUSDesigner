/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/10/2024 11:39 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TCapabilityDefinition;
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
@objid ("50c7b70a-9ba7-4844-aa01-68eb011bc076")
public class TRequirement implements IMdaProxy {
    @objid ("cd94c67a-1642-4e20-b182-4d04e902ff61")
    public static final String STEREOTYPE_NAME = "TRequirement";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("0eb9a46c-7c5f-419b-b2ae-d67e41c3838c")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c87eaa22-27fd-4a29-859b-e0ddcf60d1b1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirement.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirement >> then instantiate a {@link TRequirement} proxy.
     * 
     * @return a {@link TRequirement} proxy on the created {@link Class}.
     */
    @objid ("47c49a46-1f47-4a8b-b5e1-56a07a787179")
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
    @objid ("78b5521f-8b85-4af2-855c-c0f974fd67c3")
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
    @objid ("4bfa1cf6-1cac-418b-88fb-4d0e521904ed")
    public static TRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirement.canInstantiate(obj))
        	return new TRequirement(obj);
        else
        	throw new IllegalArgumentException("TRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("52510202-4ac9-497b-892f-fd5924929c94")
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
    @objid ("bf91f2a6-ffc0-4771-ad35-68480deaf45e")
    public TCapabilityDefinition getCapability() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TRequirement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TRequirement.MdaTypes.MDAASSOCDEP_ROLE), "capability")
                  && TCapabilityDefinition.canInstantiate(d.getDependsOn())) {
                     return (TCapabilityDefinition)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("bafe745d-5a33-446c-a928-3245eff63212")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'node' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("657e6186-6a06-4f4b-81fc-a10c3eadff31")
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
    @objid ("e84014d2-55d1-49bd-a3fb-64a53a2d232d")
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

    @objid ("04a6ffc1-e160-4176-9f39-9f9eb24e07d8")
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
    @objid ("b91d47ab-48b6-4fb4-9971-87effccf4a58")
    public void setCapability(final TCapabilityDefinition obj) {
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
    @objid ("5baa6188-cd8a-4554-8a4c-b9d74e328e7a")
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
    @objid ("8d5b2873-ac80-476c-9851-ec897dffac2d")
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

    @objid ("5591319d-2ca5-4c82-a615-9651c2ab898d")
    protected  TRequirement(final Class elt) {
        this.elt = elt;
    }

    @objid ("f38ee180-004a-4179-bca0-8b403c284233")
    public static final class MdaTypes {
        @objid ("7ef67505-5c27-446e-8a67-108c33261c73")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4ce95098-2bce-4a28-93fa-2616418d3183")
        private static Stereotype MDAASSOCDEP;

        @objid ("ebc1d2b1-a2dd-4668-a1ed-3645f83823dc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9b575123-1f2c-4f14-894b-c16595876b6a")
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

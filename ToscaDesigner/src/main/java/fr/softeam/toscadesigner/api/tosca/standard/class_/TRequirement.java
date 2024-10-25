/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/10/2024 11:40 by Modelio Studio.
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
    @objid ("164adb80-7cc2-471b-842a-7688ab03ad75")
    public static final String STEREOTYPE_NAME = "TRequirement";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("a5f605c2-f0fc-49a2-93b3-0d6bea642c27")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c9b98dbb-95d2-430b-8519-0f0afb296610")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirement.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirement >> then instantiate a {@link TRequirement} proxy.
     * 
     * @return a {@link TRequirement} proxy on the created {@link Class}.
     */
    @objid ("c70efce6-08ed-444b-8265-ff76a1d35436")
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
    @objid ("8c84be09-3a0c-44da-a631-fffeda9ae15e")
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
    @objid ("b2bbf38d-bde2-436d-a941-be0b8b5dbcdd")
    public static TRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirement.canInstantiate(obj))
        	return new TRequirement(obj);
        else
        	throw new IllegalArgumentException("TRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7b984324-c9e4-4287-8b3f-92af7ea4dfe4")
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
    @objid ("0e0805eb-5623-4b0b-b242-4456e2cc961b")
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
    @objid ("780c67dc-6c63-4898-929a-d45a2106cd6f")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'node' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("17f66038-ec2c-42ce-8410-580ff7602699")
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
    @objid ("3f176209-6f1d-4104-a432-15813cdd6b57")
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

    @objid ("183a499e-a4e3-4cee-a3d6-ce4a77f5216d")
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
    @objid ("8bab4a96-07ba-4d32-bd3f-f6e39e8bf2f8")
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
    @objid ("58878e27-f33a-43c4-9aa0-2094d3e38993")
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
    @objid ("20707e6c-149c-442e-866d-b20e0148042f")
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

    @objid ("bb045360-aeb5-402f-b47b-110880acb295")
    protected  TRequirement(final Class elt) {
        this.elt = elt;
    }

    @objid ("f38ee180-004a-4179-bca0-8b403c284233")
    public static final class MdaTypes {
        @objid ("729dcd7a-9a5f-47a9-a409-4dbbb69621f3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("41379f39-a1a0-47ad-a1f7-adf60d6b524e")
        private static Stereotype MDAASSOCDEP;

        @objid ("63205a79-0e5b-47f5-b7ba-a3740365d6c1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7efbbfa2-f6e7-40d9-a619-05488d1a448d")
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

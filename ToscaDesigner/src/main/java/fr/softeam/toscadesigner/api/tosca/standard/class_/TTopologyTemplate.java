/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 18:02 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.ImportElement;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TExtensibleElements;
import fr.softeam.toscadesigner.api.tosca.standard.association.TRelationshipTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.package_.TGroup;
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
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TTopologyTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("29a5d1b5-9dba-4e11-93e9-3ddc295714b4")
public class TTopologyTemplate extends TExtensibleElements implements IMdaProxy {
    @objid ("948d4e41-fa7f-47d5-9dac-4e8284d68ecd")
    public static final String STEREOTYPE_NAME = "TTopologyTemplate";

    /**
     * Tells whether a {@link TTopologyTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TTopologyTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("71cf9cb3-a42b-4b60-9048-ec29314ab123")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TTopologyTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TTopologyTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TTopologyTemplate >> then instantiate a {@link TTopologyTemplate} proxy.
     * 
     * @return a {@link TTopologyTemplate} proxy on the created {@link Class}.
     */
    @objid ("659be267-4be8-42a1-ac4d-3390d0364cf3")
    public static TTopologyTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TTopologyTemplate.MdaTypes.STEREOTYPE_ELT);
        return TTopologyTemplate.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TTopologyTemplate} proxy from a {@link Class} stereotyped << TTopologyTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TTopologyTemplate} proxy or <i>null</i>.
     */
    @objid ("f996d075-a72f-4db4-bb44-bf331ab67e1e")
    public static TTopologyTemplate instantiate(final Class obj) {
        return TTopologyTemplate.canInstantiate(obj) ? new TTopologyTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TTopologyTemplate} proxy from a {@link Class} stereotyped << TTopologyTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TTopologyTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a74ee1e9-1399-43b9-80cb-acd029c9da7d")
    public static TTopologyTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TTopologyTemplate.canInstantiate(obj))
        	return new TTopologyTemplate(obj);
        else
        	throw new IllegalArgumentException("TTopologyTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the '' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f952515d-4902-4e96-aa7d-9babf0a22467")
    public void add(final ImportElement obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    /**
     * Add a value to the 'groups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6db3248b-6db1-4c62-84c4-cada1a0a04a1")
    public void addGroups(final TGroup obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("groups");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "groups");
        }
    }

    /**
     * Add a value to the 'nodeTemplates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8db41be5-5388-4419-9de0-8ebb6d6d0b8f")
    public void addNodeTemplates(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("nodeTemplates");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "nodeTemplates");
        }
    }

    /**
     * Add a value to the 'relationshipTemplates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("dc032aa8-012a-41d4-a182-333f289d0dd7")
    public void addRelationshipTemplates(final TRelationshipTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TTopologyTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("relationshipTemplates");
            d.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "relationshipTemplates");
        }
    }

    @objid ("99bf35b4-cf04-4ce3-954f-8fe57ba89696")
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
        TTopologyTemplate other = (TTopologyTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the '' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4315b758-cecf-4e44-a161-c6833e7fe43b")
    public List<ImportElement> get() {
        List<ImportElement> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")
              && ImportElement.canInstantiate(d.getDependsOn()))
                results.add((ImportElement)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), ImportElement.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("134486c6-c031-4dd1-a1c7-a099da031bb1")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'group' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cc8c3b28-c8c0-42a9-8d48-4537ffc93fd2")
    public Feature getGroup() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "group")
                  && Feature.class.isInstance(d.getDependsOn())) {
                      return (Feature)d.getDependsOn();
              }
        }
        return null;
    }

    /**
     * Get the values of the 'groups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e4889dd2-e64a-45d8-837c-93489ec137dc")
    public List<TGroup> getGroups() {
        List<TGroup> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "groups")
              && TGroup.canInstantiate(d.getDependsOn()))
                results.add((TGroup)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TGroup.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'nodeTemplates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3e644f56-9942-40e0-8ec8-c04b5e1a71ae")
    public List<TNodeTemplate> getNodeTemplates() {
        List<TNodeTemplate> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "nodeTemplates")
              && TNodeTemplate.canInstantiate(d.getDependsOn()))
                results.add((TNodeTemplate)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'relationshipTemplates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a55df5cc-a800-4367-808c-831dc0170d72")
    public List<TRelationshipTemplate> getRelationshipTemplates() {
        List<TRelationshipTemplate> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "relationshipTemplates")
              && TRelationshipTemplate.canInstantiate(d.getDependsOn()))
                results.add((TRelationshipTemplate)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cf2adee5-994b-493f-ab6e-f6a89256ac89")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the '' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fef5d294-2e43-4d83-8c17-07996d74b5a6")
    public boolean remove(final ImportElement obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "imports")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Remove a value from the 'groups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("21e2d057-a596-48ed-aa34-6a14cb033f03")
    public boolean removeGroups(final TGroup obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Remove a value from the 'nodeTemplates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("06027305-3ba6-48ce-ab45-5ab3345fd7a9")
    public boolean removeNodeTemplates(final TNodeTemplate obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Remove a value from the 'relationshipTemplates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6ce87f47-a1bf-4264-86b6-8d820b6093be")
    public boolean removeRelationshipTemplates(final TRelationshipTemplate obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Set the value of the 'group' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6f9572df-f9c1-4f1b-8993-f056b1717b26")
    public void setGroup(final Feature obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TTopologyTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE), "group")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj, TTopologyTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("group");      dep.putTagValue(TTopologyTemplate.MdaTypes.MDAASSOCDEP_ROLE, "group");
          }
          dep.setDependsOn(obj);
        }
        
    }

    @objid ("aa94c38f-359a-4c51-b977-1470ca39b443")
    protected  TTopologyTemplate(final Class elt) {
        super(elt);
    }

    @objid ("c426ae1d-d4b8-415d-8b49-ce88d06ef8dd")
    public static final class MdaTypes {
        @objid ("a64d94be-dc0d-4579-9e56-90e7632c5d28")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f3534f1e-91a6-4e20-8839-5001066417fa")
        private static Stereotype MDAASSOCDEP;

        @objid ("03649e75-1137-4115-bfef-974c712fcf75")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3811af04-7fcd-4e10-86f1-fb19bb7d9107")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "a52f433c-cf19-4033-99c2-81b4af708744", "TTopologyTemplate");
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

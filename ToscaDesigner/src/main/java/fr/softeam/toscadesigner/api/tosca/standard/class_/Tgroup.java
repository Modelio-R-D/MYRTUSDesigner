/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 10:12 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << Tgroup >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("509b4a1e-2de8-4911-a141-8b2a66f89a79")
public class Tgroup implements IMdaProxy {
    @objid ("7c467462-bd28-43c7-853a-5e720252839e")
    public static final String STEREOTYPE_NAME = "Tgroup";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("db65e286-b614-4e06-a3bd-9bf82ff21c18")
    protected final Class elt;

    /**
     * Tells whether a {@link Tgroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Tgroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0ec4f0b7-88a6-408f-a4e5-0912fbbf7393")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (Tgroup.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(Tgroup.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << Tgroup >> then instantiate a {@link Tgroup} proxy.
     * 
     * @return a {@link Tgroup} proxy on the created {@link Class}.
     */
    @objid ("ed406361-e51e-418f-9025-db1f0aa0a140")
    public static Tgroup create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(Tgroup.MdaTypes.STEREOTYPE_ELT);
        return Tgroup.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Tgroup} proxy from a {@link Class} stereotyped << Tgroup >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Tgroup} proxy or <i>null</i>.
     */
    @objid ("e6e6417b-9f8a-4b93-baf5-deda0c673603")
    public static Tgroup instantiate(final Class obj) {
        return Tgroup.canInstantiate(obj) ? new Tgroup(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Tgroup} proxy from a {@link Class} stereotyped << Tgroup >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Tgroup} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e5911076-ce48-4bf1-b76e-7ccbd438731a")
    public static Tgroup safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Tgroup.canInstantiate(obj))
        	return new Tgroup(obj);
        else
        	throw new IllegalArgumentException("Tgroup: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("2103869e-5b87-477d-80c6-a474d6dafee9")
    public void addMembers(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Tgroup.MdaTypes.MDAASSOCDEP);
            d.setName("members");
            d.putTagValue(Tgroup.MdaTypes.MDAASSOCDEP_ROLE, "members");
        }
    }

    @objid ("e2ac94ea-5519-40f0-ae10-7cad43f59c39")
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
        Tgroup other = (Tgroup) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("02866f9e-48e0-4be2-8944-5e096064a7c4")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("98472a95-70ca-4cc2-8cd3-54fff8318f04")
    public List<TNodeTemplate> getMembers() {
        List<TNodeTemplate> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(Tgroup.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Tgroup.MdaTypes.MDAASSOCDEP_ROLE), "members")
              && TNodeTemplate.canInstantiate(d.getDependsOn()))
                results.add((TNodeTemplate)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TNodeTemplate.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("98b48ac2-fc16-4221-a399-08db7fa3e03e")
    public TGroupType getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Tgroup.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Tgroup.MdaTypes.MDAASSOCDEP_ROLE), "type")
                  && TGroupType.canInstantiate(d.getDependsOn())) {
                     return (TGroupType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TGroupType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("4d0a97c9-604d-4417-9461-1634629bfc5a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("189d487b-7727-4a52-90a8-aac420987aee")
    public boolean removeMembers(final TNodeTemplate obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Tgroup.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Tgroup.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("10ea8a00-cfc7-4697-8b75-ccc9263c8d36")
    public void setType(final TGroupType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Tgroup.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Tgroup.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Tgroup.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(Tgroup.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    @objid ("71daec86-6e28-45ae-989e-6552e6f28a58")
    protected  Tgroup(final Class elt) {
        this.elt = elt;
    }

    @objid ("aedf9af0-61a1-4916-8755-b6337a9c64e9")
    public static final class MdaTypes {
        @objid ("691ddd4b-364d-4eef-b3c4-9cbabde4647c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1bb0a0c4-2be6-474d-8015-740ed5bd7e0f")
        private static Stereotype MDAASSOCDEP;

        @objid ("2dd0dd26-7d1e-438c-8438-b22d7e62d5e1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f8e2e208-8d43-4c10-99f1-7821ebbf34d1")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "572d5cb4-54c7-45d0-a9c8-3dc3677f9ef3", "Tgroup");
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

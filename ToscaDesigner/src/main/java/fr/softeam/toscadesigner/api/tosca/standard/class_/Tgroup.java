/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 14:48 by Modelio Studio.
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
    @objid ("68b7f5fc-4637-4d2e-b353-83345e95cb01")
    public static final String STEREOTYPE_NAME = "Tgroup";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("d16c8117-254d-499a-bda9-8311007e0846")
    protected final Class elt;

    /**
     * Tells whether a {@link Tgroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Tgroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9113ec75-a9ce-41b2-9b2c-a9cd9581f621")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (Tgroup.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(Tgroup.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << Tgroup >> then instantiate a {@link Tgroup} proxy.
     * 
     * @return a {@link Tgroup} proxy on the created {@link Class}.
     */
    @objid ("b84fb60b-0d25-4238-8d3b-ff7b870e113b")
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
    @objid ("c1c1c4ed-d546-4208-9086-411a5b8ef44d")
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
    @objid ("448890e6-4b34-4f87-8a26-b31b4ee64cd6")
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
    @objid ("f380951c-0fa1-48ff-bbda-4614417d580b")
    public void addMembers(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Tgroup.MdaTypes.MDAASSOCDEP);
            d.setName("members");
            d.putTagValue(Tgroup.MdaTypes.MDAASSOCDEP_ROLE, "members");
        }
    }

    @objid ("1d3e90b5-9177-4828-8349-3924eb1c3bb8")
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
    @objid ("2c739fe1-cf73-464c-8547-68de0fdaed67")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("adea8121-c87d-4732-9776-fb5914131434")
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
    @objid ("752820ec-2f7e-4365-8890-dba68e859a0b")
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

    @objid ("c1b10622-fad2-4825-88cd-440075f51a18")
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
    @objid ("5c480849-c169-4794-8dee-bd86a3e3be9a")
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
    @objid ("d035cb6b-a32e-4daa-8b97-a46cc56f938c")
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

    @objid ("61db1f59-1e18-4cc3-a0a2-460571fcb411")
    protected  Tgroup(final Class elt) {
        this.elt = elt;
    }

    @objid ("aedf9af0-61a1-4916-8755-b6337a9c64e9")
    public static final class MdaTypes {
        @objid ("7a942496-bc33-496e-8c72-85b5faa2544f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f365ca20-b486-4e8c-901c-6449e43e84b8")
        private static Stereotype MDAASSOCDEP;

        @objid ("4a0b3ab3-2e1b-4c11-b502-9b719885a8e4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5ec26f54-a450-4805-a1c9-11d4748085c6")
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

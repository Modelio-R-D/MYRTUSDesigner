/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
    @objid ("7fe11550-f934-45d4-9d97-d000ce762ca2")
    public static final String STEREOTYPE_NAME = "Tgroup";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("38e4f041-ceff-446c-9a3d-c5954f3b8049")
    protected final Class elt;

    /**
     * Tells whether a {@link Tgroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Tgroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6a1277cd-8bd0-4ddc-9e94-d4e9c0e7007b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (Tgroup.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(Tgroup.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << Tgroup >> then instantiate a {@link Tgroup} proxy.
     * 
     * @return a {@link Tgroup} proxy on the created {@link Class}.
     */
    @objid ("cfc53db2-b18f-4c6e-8514-cf99f3abeeff")
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
    @objid ("05e9ac9f-ec1a-4395-b3f7-ed74f505d9f5")
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
    @objid ("f3e999b1-9b89-4ec2-891c-c42cfc467744")
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
    @objid ("7822530d-7df5-4f97-80c6-4d6201c3d6ed")
    public void addMembers(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Tgroup.MdaTypes.MDAASSOCDEP);
            d.setName("members");
            d.putTagValue(Tgroup.MdaTypes.MDAASSOCDEP_ROLE, "members");
        }
    }

    @objid ("56ef61f4-4a46-43b7-8e71-e2a8d2205f13")
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
    @objid ("fe5cdcf5-5644-4fec-9ff7-a557202078f9")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("93fdcdc7-1139-4bd6-81c3-f2b3302fcc61")
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
    @objid ("b6069e29-0307-49a1-8e81-086a8cb1dd1c")
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

    @objid ("a229110d-30ea-4ffa-9895-3e57cc550ae9")
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
    @objid ("4f9f006b-4b0c-46d2-acd0-70ad775f1b51")
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
    @objid ("cc7eff7e-b7f2-4d1f-aeb8-bef2ea7d3da6")
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

    @objid ("96793203-6370-49d8-8148-ede0eb6ec4d0")
    protected  Tgroup(final Class elt) {
        this.elt = elt;
    }

    @objid ("aedf9af0-61a1-4916-8755-b6337a9c64e9")
    public static final class MdaTypes {
        @objid ("d8d7b04b-e4f4-41ef-bed4-96559a921ed3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5cefaa4c-3028-46e2-a299-bed23e655137")
        private static Stereotype MDAASSOCDEP;

        @objid ("334f4d54-20dc-4dce-8618-b10ae9aba8e3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bf9150bd-59ee-49fe-88d1-2360c83721a0")
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

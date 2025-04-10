/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:52 by Modelio Studio.
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
    @objid ("249cf4be-883e-44c6-b947-e42e9b6859ab")
    public static final String STEREOTYPE_NAME = "Tgroup";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("c018501b-ac97-4898-a409-1d004b172f7f")
    protected final Class elt;

    /**
     * Tells whether a {@link Tgroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Tgroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("deeba483-8794-4194-ad29-1871fd697cd0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (Tgroup.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(Tgroup.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << Tgroup >> then instantiate a {@link Tgroup} proxy.
     * 
     * @return a {@link Tgroup} proxy on the created {@link Class}.
     */
    @objid ("0daf3a78-0a3d-4763-bc3b-5f276569157b")
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
    @objid ("49c58d4a-ce7d-478a-ab92-2285b6f18195")
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
    @objid ("f5e89ead-a35e-45a8-b25e-5817d483785f")
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
    @objid ("c6635619-f591-4875-b30b-b61319a3d5ab")
    public void addMembers(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Tgroup.MdaTypes.MDAASSOCDEP);
            d.setName("members");
            d.putTagValue(Tgroup.MdaTypes.MDAASSOCDEP_ROLE, "members");
        }
    }

    @objid ("f8ae3558-ba80-4086-8dc3-d63507e4b9be")
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
    @objid ("5fc6e67d-7bc0-4ad1-9e9a-fd1b78ec0620")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("ebbd39a8-437b-4440-b89a-1e15ff221f9e")
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
    @objid ("24135246-257d-4e0d-868d-52082098c19f")
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

    @objid ("e1c7fcc4-968b-434c-aca6-7119c0efdf18")
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
    @objid ("423d2d26-f896-4065-86ca-8621ad9e2f4e")
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
    @objid ("0f7b6c15-0821-44bf-bfbe-2d5a5cbf9cf9")
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

    @objid ("45d2bac9-2dd9-40f3-ba92-e8d42482b4bd")
    protected  Tgroup(final Class elt) {
        this.elt = elt;
    }

    @objid ("aedf9af0-61a1-4916-8755-b6337a9c64e9")
    public static final class MdaTypes {
        @objid ("83af6cf6-957e-4e62-b123-1214ef924de2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5693c5d3-fc81-4c19-9c43-7a4a99c0a34b")
        private static Stereotype MDAASSOCDEP;

        @objid ("5bf32759-f6cf-4304-bff5-dc5113be24d7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4cf02769-578a-4279-ae03-4729109d9ce5")
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

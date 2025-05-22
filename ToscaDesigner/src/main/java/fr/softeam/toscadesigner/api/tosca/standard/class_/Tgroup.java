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
    @objid ("dfcd0f8a-4bbd-407c-8997-182cc6d758e3")
    public static final String STEREOTYPE_NAME = "Tgroup";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("5914543d-051c-4740-b2e5-fde2971c9636")
    protected final Class elt;

    /**
     * Tells whether a {@link Tgroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Tgroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bb123b21-9d39-4eca-8761-984580a84d1b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (Tgroup.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(Tgroup.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << Tgroup >> then instantiate a {@link Tgroup} proxy.
     * @return a {@link Tgroup} proxy on the created {@link Class}.
     */
    @objid ("5e520cac-a4d5-4979-bed3-8f10b71e7037")
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
    @objid ("be3ed40a-baae-47f6-abed-0e1c690f44fe")
    public static Tgroup instantiate(final Class obj) {
        return Tgroup.canInstantiate(obj) ? new Tgroup(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Tgroup} proxy from a {@link Class} stereotyped << Tgroup >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Tgroup} proxy.
     */
    @objid ("ef47a5a5-de2d-4956-b23a-34d795eac66d")
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
     */
    @objid ("e3c786d7-862a-4e26-b3fb-8d785f62a024")
    public void addMembers(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Tgroup.MdaTypes.MDAASSOCDEP);
            d.setName("members");
            d.putTagValue(Tgroup.MdaTypes.MDAASSOCDEP_ROLE, "members");
        }
    }

    @objid ("63203f69-5cb0-4084-a91b-2ce970cfc032")
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
    @objid ("6ff781ff-3f0c-49cc-9e19-c76eb8835df7")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     */
    @objid ("de83c458-270f-43cd-9361-801777bf8b6f")
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
     */
    @objid ("6326977f-df18-4c91-ad6f-0f092fcb7ec5")
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

    @objid ("62b4cca0-ad04-4dee-8b00-ecdf5c215ecc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     */
    @objid ("452e8227-3b4a-4fea-bd51-75785d86bf74")
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
     */
    @objid ("2fec95bf-9042-414c-90db-595ac1468c81")
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

    @objid ("a5b7d08d-97df-49e7-bb31-ea2825792ab7")
    protected  Tgroup(final Class elt) {
        this.elt = elt;
    }

    @objid ("aedf9af0-61a1-4916-8755-b6337a9c64e9")
    public static final class MdaTypes {
        @objid ("062f0f4b-dbf3-4100-b6c3-6e77016bfb0a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c0564d2c-9cf5-4796-8885-06676cd4c475")
        private static Stereotype MDAASSOCDEP;

        @objid ("52c73600-8986-4dd5-b7e6-a7ba582e4273")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5d9ada29-6c87-40e4-875a-bc230bc46a42")
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

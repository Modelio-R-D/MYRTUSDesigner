/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.package_;

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
import fr.softeam.toscadesigner.api.tosca.standard.class_.TGroupType;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TNodeTemplate;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Package} with << TGroup >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4422c42f-a597-425f-8b09-7408101e8285")
public class TGroup implements IMdaProxy {
    @objid ("a11748ff-8a95-43ed-8d52-37ee46be5c19")
    public static final String STEREOTYPE_NAME = "TGroup";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("76bedb2f-4a21-4ec7-a48b-8d33ae7fd24a")
    protected final Package elt;

    /**
     * Tells whether a {@link TGroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TGroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("04a1c7be-3212-4ea9-9386-127fdb37c1e0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (TGroup.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(TGroup.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << TGroup >> then instantiate a {@link TGroup} proxy.
     * 
     * @return a {@link TGroup} proxy on the created {@link Package}.
     */
    @objid ("5974b793-619c-491f-80e6-40e61f66abe1")
    public static TGroup create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Package");
        e.getExtension().add(TGroup.MdaTypes.STEREOTYPE_ELT);
        return TGroup.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link TGroup} proxy from a {@link Package} stereotyped << TGroup >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link TGroup} proxy or <i>null</i>.
     */
    @objid ("b2763498-7208-4f8e-9927-46a561036323")
    public static TGroup instantiate(final Package obj) {
        return TGroup.canInstantiate(obj) ? new TGroup(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TGroup} proxy from a {@link Package} stereotyped << TGroup >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link TGroup} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ffbf968c-7e4c-4613-bf06-aa02259ee73a")
    public static TGroup safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (TGroup.canInstantiate(obj))
        	return new TGroup(obj);
        else
        	throw new IllegalArgumentException("TGroup: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("2b3e4df4-b907-4f14-8568-e2eeed17f778")
    public void addMembers(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TGroup.MdaTypes.MDAASSOCDEP);
            d.setName("members");
            d.putTagValue(TGroup.MdaTypes.MDAASSOCDEP_ROLE, "members");
        }
    }

    @objid ("5328b504-3a92-407f-b9ba-4008d94a0918")
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
        TGroup other = (TGroup) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("5faa4c04-389b-4fe2-b78d-1f01e3aedfbc")
    public Package getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("e3d568cc-1e8a-4049-b315-7ae84f7d2db4")
    public List<TNodeTemplate> getMembers() {
        List<TNodeTemplate> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TGroup.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TGroup.MdaTypes.MDAASSOCDEP_ROLE), "members")
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
    @objid ("538f7943-8f62-4cab-8987-e324e8f9b076")
    public TGroupType getType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TGroup.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TGroup.MdaTypes.MDAASSOCDEP_ROLE), "type")
                  && TGroupType.canInstantiate(d.getDependsOn())) {
                     return (TGroupType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TGroupType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("1a08acf8-cd66-4d69-8fd2-56759a43049f")
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
    @objid ("3506bb64-1828-45e1-a4c3-ca57a91cdd53")
    public boolean removeMembers(final TNodeTemplate obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TGroup.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TGroup.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
    @objid ("8e7fbfb6-5943-492d-a88c-662e0541c3ae")
    public void setType(final TGroupType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TGroup.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TGroup.MdaTypes.MDAASSOCDEP_ROLE), "type")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TGroup.MdaTypes.MDAASSOCDEP);
              dep.setName("type");      dep.putTagValue(TGroup.MdaTypes.MDAASSOCDEP_ROLE, "type");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    @objid ("93291f48-8f74-4b15-959b-4940b8ff72fc")
    protected  TGroup(final Package elt) {
        this.elt = elt;
    }

    @objid ("9664c26e-c18b-497b-a6d5-f1fbeeb24da4")
    public static final class MdaTypes {
        @objid ("f0b6c850-d923-486b-87ce-4c447d24dfec")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bbdee9f2-f9bb-4376-99cc-4c8c1ab3bb17")
        private static Stereotype MDAASSOCDEP;

        @objid ("30f20ebc-a261-4ea2-8954-d3fc689f8c23")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e42d2835-feb5-47a9-83b6-77eda7f1f609")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "572d5cb4-54c7-45d0-a9c8-3dc3677f9ef3", "TGroup");
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

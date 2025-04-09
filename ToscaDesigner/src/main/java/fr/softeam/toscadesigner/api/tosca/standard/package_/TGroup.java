/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
@objid ("509b4a1e-2de8-4911-a141-8b2a66f89a79")
public class TGroup implements IMdaProxy {
    @objid ("0ce0a76d-3cfb-47c7-b693-00963fbff81d")
    public static final String STEREOTYPE_NAME = "TGroup";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("28a6c962-e65a-4c36-8255-30a3623c47c3")
    protected final Package elt;

    /**
     * Tells whether a {@link TGroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TGroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9dce581d-fee8-42f6-9d1a-7c71e809e88b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (TGroup.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(TGroup.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << TGroup >> then instantiate a {@link TGroup} proxy.
     * 
     * @return a {@link TGroup} proxy on the created {@link Package}.
     */
    @objid ("f80f0cdc-b08a-4a74-95af-5a5c147db254")
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
    @objid ("9841a020-b7bb-41a0-8ae0-84381fda6352")
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
    @objid ("6a384e47-d4eb-4c05-953d-55f267d5228f")
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
    @objid ("25d9a429-e39f-4d33-a1d3-6dec912974d1")
    public void addMembers(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TGroup.MdaTypes.MDAASSOCDEP);
            d.setName("members");
            d.putTagValue(TGroup.MdaTypes.MDAASSOCDEP_ROLE, "members");
        }
    }

    @objid ("6a34e799-b224-4cd6-9b92-248973780cfd")
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
    @objid ("22592c28-fb31-4d5c-a84b-3095fbf5468b")
    public Package getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("4bdc79a7-47df-4c71-b144-98e14d267ee8")
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
    @objid ("4f5bccb3-347d-4f66-ba7e-33829ef77d0c")
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

    @objid ("fd8abbaa-85f0-4abe-9fad-a510155bf047")
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
    @objid ("36259ee2-b6f5-4f74-8332-b928d13a2249")
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
    @objid ("57cd2e6b-3725-42a1-b546-4eaa646039f9")
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

    @objid ("62441bf2-95b7-4143-ac61-3819b4931969")
    protected  TGroup(final Package elt) {
        this.elt = elt;
    }

    @objid ("aedf9af0-61a1-4916-8755-b6337a9c64e9")
    public static final class MdaTypes {
        @objid ("385197ac-0304-42bc-90e9-6e7033aa36f4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cf5535ba-2ee7-4178-9bd7-8fcb81ddc2c7")
        private static Stereotype MDAASSOCDEP;

        @objid ("5742bd16-302f-4511-9dc3-47c40bba9513")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b6891762-ffc8-481f-9387-6aa5c33c1021")
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

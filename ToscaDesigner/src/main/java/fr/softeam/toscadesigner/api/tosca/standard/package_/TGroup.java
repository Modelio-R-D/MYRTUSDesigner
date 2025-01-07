/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 11:20 by Modelio Studio.
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
    @objid ("545094bc-0fc4-4295-ba85-d38cbe145dd7")
    public static final String STEREOTYPE_NAME = "TGroup";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     */
    @objid ("6b7de0bf-0b12-47ff-81d1-9a0455e8f404")
    protected final Package elt;

    /**
     * Tells whether a {@link TGroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TGroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8fa59acd-b64e-4b2d-b93a-11d1155be7fe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (TGroup.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(TGroup.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << TGroup >> then instantiate a {@link TGroup} proxy.
     * 
     * @return a {@link TGroup} proxy on the created {@link Package}.
     */
    @objid ("8f77e593-5b85-48ca-8cbc-59c84b37f308")
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
    @objid ("7ce53c42-d044-43a3-847b-a370d6f45673")
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
    @objid ("40b5d653-e2a1-46ae-ae50-280acbee012f")
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
    @objid ("5b3e9eb7-8865-4645-8a74-cfeaf8e535f9")
    public void addMembers(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TGroup.MdaTypes.MDAASSOCDEP);
            d.setName("members");
            d.putTagValue(TGroup.MdaTypes.MDAASSOCDEP_ROLE, "members");
        }
    }

    @objid ("d799f3af-327d-48a6-968d-13c65c1161f8")
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
    @objid ("2c30509d-684d-42f1-a487-ca991665707c")
    public Package getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("5b4b9cc4-7780-4014-9fec-19802609ef20")
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
    @objid ("e8af5f89-e43c-46c6-8763-c413fe33ca38")
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

    @objid ("856b3aca-23bf-461e-af40-99a2c4d93040")
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
    @objid ("3a6d257f-8fe5-477e-b32d-c7da96f3c64b")
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
    @objid ("3750fce6-f3ab-4316-8842-73d22b807689")
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

    @objid ("91f9dcd9-098b-4c71-a804-2f2fc551e537")
    protected  TGroup(final Package elt) {
        this.elt = elt;
    }

    @objid ("9664c26e-c18b-497b-a6d5-f1fbeeb24da4")
    public static final class MdaTypes {
        @objid ("aac1e837-5ce7-4cf1-8108-abd90a598269")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("06a9d3e9-54b3-4e8e-b62c-bb14d5c93bcb")
        private static Stereotype MDAASSOCDEP;

        @objid ("41743bbe-2993-4f1d-9e51-febb538ceeaf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4761df3b-23f5-46fb-8069-10ac82a731d7")
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

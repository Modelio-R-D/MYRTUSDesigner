/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
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
    @objid ("2964a230-f07f-4a6f-883c-22ef80cc5dd0")
    public static final String STEREOTYPE_NAME = "TGroup";

    /**
     * The underlying {@link Package} represented by this proxy, never null.
     * 
     */
    @objid ("075f5fd4-411c-4382-a00d-33975db946ab")
    protected final Package elt;

    /**
     * Tells whether a {@link TGroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << TGroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("07f6fec9-7c8a-4190-ac74-429f06547fc1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && (TGroup.MdaTypes.STEREOTYPE_ELT!=null) && ((Package) elt).isStereotyped(TGroup.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Package} stereotyped << TGroup >> then instantiate a {@link TGroup} proxy.
     * @return a {@link TGroup} proxy on the created {@link Package}.
     */
    @objid ("18074459-8be2-4950-ac93-f63d139f956e")
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
    @objid ("b51977f8-c299-46a0-be6a-945a2da67342")
    public static TGroup instantiate(final Package obj) {
        return TGroup.canInstantiate(obj) ? new TGroup(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TGroup} proxy from a {@link Package} stereotyped << TGroup >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link TGroup} proxy.
     */
    @objid ("97146df3-8c36-4d74-a9c5-cdc089291b6f")
    public static TGroup safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (TGroup.canInstantiate(obj))
            return new TGroup(obj);
        else
            throw new IllegalArgumentException("TGroup: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'members' role.<p>
     * Role description:
     * null
     */
    @objid ("e2d857db-238a-4ffb-8eb5-afbb0bee6081")
    public void addMembers(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TGroup.MdaTypes.MDAASSOCDEP);
            d.setName("members");
            d.putTagValue(TGroup.MdaTypes.MDAASSOCDEP_ROLE, "members");
        }
    }

    @objid ("644566b9-a6c8-40ab-bf7b-06b5710b0e54")
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
    @objid ("f0ae7bbe-52f6-442a-b4d4-330df4ac4b09")
    public Package getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'members' role.<p>
     * Role description:
     * null
     */
    @objid ("c440283c-64b8-496c-b83f-a1a8fc8b4e0b")
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
     */
    @objid ("5a35aeb1-a7f9-4f84-817a-0291aafe7bb0")
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

    @objid ("e25cf8e4-fcbe-41d2-b74a-d87fa100ca6d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'members' role.<p>
     * Role description:
     * null
     */
    @objid ("0f4facfd-cef2-4588-b780-b92c63051436")
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
     */
    @objid ("10eb8bd8-7524-4c28-8e56-ca2e9fe10822")
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

    @objid ("c036a974-a1fc-42e0-af1e-5c9777fc9572")
    protected  TGroup(final Package elt) {
        this.elt = elt;
    }

    @objid ("9664c26e-c18b-497b-a6d5-f1fbeeb24da4")
    public static final class MdaTypes {
        @objid ("62d7a8a0-cf7d-4b42-b8da-acaa6c0e1e31")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("89d1e9f9-40d1-486f-be6f-8efdccd84d73")
        private static Stereotype MDAASSOCDEP;

        @objid ("48c9c9d1-b96b-4766-adf1-ef4f3fa2a368")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bbf28cdf-75a9-46bb-8455-3823dde59144")
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

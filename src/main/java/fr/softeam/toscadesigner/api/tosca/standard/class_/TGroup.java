/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 04/06/2025 20:07 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TGroup >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("92366869-1c8e-4d0d-83df-ca7236dd4cb5")
public class TGroup implements IMdaProxy {
    @objid ("ddde499b-35b1-47d0-9a1a-fed8a0bfabca")
    public static final String STEREOTYPE_NAME = "TGroup";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("913ab08a-400d-4c07-aec6-dc1bc8d8342f")
    protected final Class elt;

    /**
     * Tells whether a {@link TGroup proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TGroup >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5b294bbc-45f7-4071-a68d-f97fc12f77a3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TGroup.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TGroup.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TGroup >> then instantiate a {@link TGroup} proxy.
     * 
     * @return a {@link TGroup} proxy on the created {@link Class}.
     */
    @objid ("ca52c0bb-0620-4177-9dbc-4296ad9c6d1c")
    public static TGroup create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TGroup.MdaTypes.STEREOTYPE_ELT);
        return TGroup.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TGroup} proxy from a {@link Class} stereotyped << TGroup >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TGroup} proxy or <i>null</i>.
     */
    @objid ("6a5518e3-0007-45b2-b7da-d3a2c1fa4ac0")
    public static TGroup instantiate(final Class obj) {
        return TGroup.canInstantiate(obj) ? new TGroup(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TGroup} proxy from a {@link Class} stereotyped << TGroup >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TGroup} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ffb88af7-85b3-48b0-a59d-bdedc3e41bde")
    public static TGroup safeInstantiate(final Class obj) throws IllegalArgumentException {
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
    @objid ("f79ecd2e-11d6-4380-bdcb-b36d37046d47")
    public void addMembers(final TNodeTemplate obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TGroup.MdaTypes.MDAASSOCDEP);
            d.setName("members");
            d.putTagValue(TGroup.MdaTypes.MDAASSOCDEP_ROLE, "members");
        }
    }

    @objid ("5a5544a6-19c0-4c5c-97c3-1eba57cec616")
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
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("03b56e46-76c1-48f3-9c83-ca2984961bbb")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'members' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("1d4515fe-5f91-4a76-a09f-525760a1d7f6")
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
    @objid ("26e73e1b-e80b-4ba1-b4f1-adcef1641a74")
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

    @objid ("80b6b032-e936-401c-97df-b9f4b8bcca86")
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
    @objid ("99f87ab9-a1f7-499d-870e-34abf1651ca0")
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
    @objid ("085ebed3-b79c-4aa7-be0e-9bdf9140c3c5")
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

    @objid ("3d4a86d6-e754-447b-bb4e-05c9dbce5737")
    protected  TGroup(final Class elt) {
        this.elt = elt;
    }

    @objid ("f6a5c6ac-7312-42fa-8a23-12096061b39c")
    public static final class MdaTypes {
        @objid ("eb98c63c-454b-46bf-8fcb-8978dde3a4ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0c576811-2aa9-4d1b-be7f-17b2c073e839")
        private static Stereotype MDAASSOCDEP;

        @objid ("1997b6f6-3d7d-4615-982d-cf9acd31efd8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4ddf5c9e-f35a-4207-9cb9-a1e266dc5ae9")
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

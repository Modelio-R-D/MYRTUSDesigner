/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TCapabilityDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4a705232-04ac-44d1-9eac-6048652d5c1b")
public class TCapabilityDefinition implements IMdaProxy {
    @objid ("17ecf0ea-5a36-4dd3-a40a-4272a9b402c2")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinition";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("87b7b74d-850c-48a0-8280-7d6e852082e0")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapabilityDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4ff6a6ac-4e67-4d4b-9e36-fccf40bd109d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinition >> then instantiate a {@link TCapabilityDefinition} proxy.
     * @return a {@link TCapabilityDefinition} proxy on the created {@link Class}.
     */
    @objid ("5e11f5e3-ecad-4262-b6d6-18989e11ec5e")
    public static TCapabilityDefinition create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityDefinition.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinition} proxy from a {@link Class} stereotyped << TCapabilityDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TCapabilityDefinition} proxy or <i>null</i>.
     */
    @objid ("95cef30c-b079-4c8d-a99c-5c92bb45ffc5")
    public static TCapabilityDefinition instantiate(final Class obj) {
        return TCapabilityDefinition.canInstantiate(obj) ? new TCapabilityDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinition} proxy from a {@link Class} stereotyped << TCapabilityDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapabilityDefinition} proxy.
     */
    @objid ("a0b0eed1-a92c-4512-81d1-6b96d70f9b92")
    public static TCapabilityDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityDefinition.canInstantiate(obj))
            return new TCapabilityDefinition(obj);
        else
            throw new IllegalArgumentException("TCapabilityDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b0f60b9e-0bfb-4d6c-a8bb-25123bb13fe1")
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
        TCapabilityDefinition other = (TCapabilityDefinition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'constraints' role.<p>
     * Role description:
     * null
     */
    @objid ("57802da0-0760-4f69-a7d6-120bba73addf")
    public ConstraintsType getConstraints() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TCapabilityDefinition.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE), "constraints")
                  && ConstraintsType.canInstantiate(d.getDependsOn())) {
                     return (ConstraintsType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), ConstraintsType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e97e6c76-2ef3-4a11-b499-6f354b462ca4")
    public Class getElement() {
        return this.elt;
    }

    @objid ("0bc2729b-4d74-4db8-9dde-091116353896")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'constraints' role.<p>
     * Role description:
     * null
     */
    @objid ("b6f3a87d-9017-4a74-9f13-da361aa351f1")
    public void setConstraints(final ConstraintsType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TCapabilityDefinition.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE), "constraints")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TCapabilityDefinition.MdaTypes.MDAASSOCDEP);
              dep.setName("constraints");      dep.putTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE, "constraints");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("e93a886e-fe19-408a-a744-24a48b692d2f")
    protected  TCapabilityDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("0fb5204c-539a-40c9-89d7-166a2071f2b9")
    public static final class MdaTypes {
        @objid ("8f432d62-3201-4938-8c96-fe332dd57748")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("930cae6b-db0c-4f99-8a3f-e479b440470b")
        private static Stereotype MDAASSOCDEP;

        @objid ("27aea7c9-9890-4e9c-b827-8012f0f785d2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f6436170-468a-400a-b8ee-a969f107a2f7")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "92f8cb40-9498-4759-9c75-6b4df72de355", "TCapabilityDefinition");
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

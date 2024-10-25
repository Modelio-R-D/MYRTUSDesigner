/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.association;

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
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.RelationshipConstraintsType;
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TEntityTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.TRelationshipType;
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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Association} with << TRelationshipTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("16aa08f8-eeab-4e52-82c2-74f7e325c8b5")
public class TRelationshipTemplate extends TEntityTemplate implements IMdaProxy {
    @objid ("3b34f264-c55f-4684-a41b-8c570086e4b4")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplate";

    /**
     * Tells whether a {@link TRelationshipTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << TRelationshipTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9ecd0845-2f15-4bd3-a5fe-780ad1963138")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && (TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Association) elt).isStereotyped(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Association} stereotyped << TRelationshipTemplate >> then instantiate a {@link TRelationshipTemplate} proxy.
     * @return a {@link TRelationshipTemplate} proxy on the created {@link Association}.
     */
    @objid ("5e7767ed-47c6-46e1-b865-b935980a6d10")
    public static TRelationshipTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Association");
        e.getExtension().add(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT);
        return TRelationshipTemplate.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplate} proxy from a {@link Association} stereotyped << TRelationshipTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link TRelationshipTemplate} proxy or <i>null</i>.
     */
    @objid ("6b0913f9-8e17-48b1-af6d-517d69f9ca43")
    public static TRelationshipTemplate instantiate(final Association obj) {
        return TRelationshipTemplate.canInstantiate(obj) ? new TRelationshipTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplate} proxy from a {@link Association} stereotyped << TRelationshipTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link TRelationshipTemplate} proxy.
     */
    @objid ("59ab07b2-181b-4549-8b56-8c27070e3fa2")
    public static TRelationshipTemplate safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (TRelationshipTemplate.canInstantiate(obj))
            return new TRelationshipTemplate(obj);
        else
            throw new IllegalArgumentException("TRelationshipTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ccbf44cf-739d-4898-8405-bc215bbae142")
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
        TRelationshipTemplate other = (TRelationshipTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}.
     * @return the Association represented by this proxy, never null.
     */
    @objid ("786e020a-dd9c-45b2-a02c-b2016601b63b")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Get the value of the 'relationshipConstraints' role.<p>
     * Role description:
     * null
     */
    @objid ("1ad801c9-4b90-4860-a6fc-e441d510d2ac")
    public RelationshipConstraintsType getRelationshipConstraints() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TRelationshipTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TRelationshipTemplate.MdaTypes.MDAASSOCDEP_ROLE), "relationshipConstraints")
                  && RelationshipConstraintsType.canInstantiate(d.getDependsOn())) {
                     return (RelationshipConstraintsType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'relationshipType' role.<p>
     * Role description:
     * null
     */
    @objid ("5af0cf9e-d11c-4d85-af02-85dffe42936a")
    public TRelationshipType getRelationshipType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TRelationshipTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TRelationshipTemplate.MdaTypes.MDAASSOCDEP_ROLE), "relationshipType")
                  && TRelationshipType.canInstantiate(d.getDependsOn())) {
                     return (TRelationshipType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRelationshipType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("12cc9e20-bdcb-4de9-8c82-32055517ff16")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'relationshipConstraints' role.<p>
     * Role description:
     * null
     */
    @objid ("dc680b41-7241-401f-83b6-1382369e6699")
    public void setRelationshipConstraints(final RelationshipConstraintsType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TRelationshipTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TRelationshipTemplate.MdaTypes.MDAASSOCDEP_ROLE), "relationshipConstraints")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TRelationshipTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("relationshipConstraints");      dep.putTagValue(TRelationshipTemplate.MdaTypes.MDAASSOCDEP_ROLE, "relationshipConstraints");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'relationshipType' role.<p>
     * Role description:
     * null
     */
    @objid ("257251c5-f693-48fc-a390-d7993a8a2e85")
    public void setRelationshipType(final TRelationshipType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TRelationshipTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TRelationshipTemplate.MdaTypes.MDAASSOCDEP_ROLE), "relationshipType")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TRelationshipTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("relationshipType");      dep.putTagValue(TRelationshipTemplate.MdaTypes.MDAASSOCDEP_ROLE, "relationshipType");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("21185c4e-7d32-43c9-9709-b844dccb5094")
    protected  TRelationshipTemplate(final Association elt) {
        super(elt);
    }

    @objid ("7e20cf7a-61c7-451a-9f0f-8fc1590d8893")
    public static final class MdaTypes {
        @objid ("9b734f90-a9d0-4e6f-ada3-b7afc7d5d148")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e9754319-2c99-4128-afa0-65dc3b149843")
        private static Stereotype MDAASSOCDEP;

        @objid ("03f2887a-dfd3-4914-9d29-a692de3246e8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("14a4cabe-8832-4c2f-a61a-2c0bc82526a1")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7f01001b-511e-4017-b6b4-729f68c85911", "TRelationshipTemplate");
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

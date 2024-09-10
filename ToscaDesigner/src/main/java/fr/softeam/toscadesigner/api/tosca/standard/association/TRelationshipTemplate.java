/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/09/2024 10:28 by Modelio Studio.
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
@objid ("60f36c06-2601-40ba-93cf-780941d4f04a")
public class TRelationshipTemplate extends TEntityTemplate implements IMdaProxy {
    @objid ("c61ecd43-39a9-4d34-ba01-faf7d5f77f0b")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplate";

    /**
     * Tells whether a {@link TRelationshipTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << TRelationshipTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a99bec54-a4fd-4b8a-a3fb-0e7f117368e7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && (TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Association) elt).isStereotyped(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Association} stereotyped << TRelationshipTemplate >> then instantiate a {@link TRelationshipTemplate} proxy.
     * 
     * @return a {@link TRelationshipTemplate} proxy on the created {@link Association}.
     */
    @objid ("7f40210b-2dc7-487a-a813-e548cbe51c2f")
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
    @objid ("f8542d1f-6d6d-4588-b828-dafb826c0baf")
    public static TRelationshipTemplate instantiate(final Association obj) {
        return TRelationshipTemplate.canInstantiate(obj) ? new TRelationshipTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplate} proxy from a {@link Association} stereotyped << TRelationshipTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link TRelationshipTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a13e7352-f1b1-4241-9048-88b4f97c1e37")
    public static TRelationshipTemplate safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (TRelationshipTemplate.canInstantiate(obj))
        	return new TRelationshipTemplate(obj);
        else
        	throw new IllegalArgumentException("TRelationshipTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2ea441a5-483c-4b9a-9feb-97ab945a4517")
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
    @objid ("9c7054e6-5ade-4cc9-bb7b-82a1671dc40e")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Get the value of the 'relationshipConstraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("886fd3b9-a326-4bbc-9d56-e72c8929e9e6")
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
     * 
     */
    @objid ("0d01f847-abe5-4317-abea-e0b9ab837c6e")
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

    @objid ("73d8af54-04b2-479f-93a9-c3dbac2dca51")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Set the value of the 'relationshipConstraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8f20a35f-5a98-4738-af73-8e3d6688fd32")
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
     * 
     */
    @objid ("7394ceec-9731-42b9-b464-4d674bbc296b")
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

    @objid ("d101285b-c71e-447a-8690-26603afc21e5")
    protected  TRelationshipTemplate(final Association elt) {
        super(elt);
    }

    @objid ("930a95e4-590a-489e-b193-a61a497aee08")
    public static final class MdaTypes {
        @objid ("5fa6461e-c81b-43c4-a156-998dcd911246")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eaa007d2-d4f8-4618-9256-7f8099ead7bc")
        private static Stereotype MDAASSOCDEP;

        @objid ("ce697226-53ae-49a7-8fff-43fd2096eba6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4d8d713b-9a8d-46a8-b2b0-989571cc6d8d")
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

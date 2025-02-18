/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 18/02/2025 10:30 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << RelationshipConstraintsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b437f88c-b794-453a-9d23-54fb020b7074")
public class RelationshipConstraintsType implements IMdaProxy {
    @objid ("3f454446-fcc1-4da9-afc1-d4926664b012")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("466e1721-d6ba-4ea5-bcae-2c26d8e3f585")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bde708c6-98ef-478a-bcfe-e4f65c368f90")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipConstraintsType >> then instantiate a {@link RelationshipConstraintsType} proxy.
     * 
     * @return a {@link RelationshipConstraintsType} proxy on the created {@link ModelElement}.
     */
    @objid ("7e9b3423-41ed-4c76-ba22-8651cb008006")
    public static RelationshipConstraintsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT);
        return RelationshipConstraintsType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link RelationshipConstraintsType} proxy from a {@link ModelElement} stereotyped << RelationshipConstraintsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link RelationshipConstraintsType} proxy or <i>null</i>.
     */
    @objid ("5ded42d7-0868-449b-b437-4aa2aab74fd7")
    public static RelationshipConstraintsType instantiate(final ModelElement obj) {
        return RelationshipConstraintsType.canInstantiate(obj) ? new RelationshipConstraintsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RelationshipConstraintsType} proxy from a {@link ModelElement} stereotyped << RelationshipConstraintsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link RelationshipConstraintsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f47cda6d-7b4d-4a56-9e14-0a15d3dce2e9")
    public static RelationshipConstraintsType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RelationshipConstraintsType.canInstantiate(obj))
        	return new RelationshipConstraintsType(obj);
        else
        	throw new IllegalArgumentException("RelationshipConstraintsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'relationshipConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("eeede683-4f24-4f57-b706-f26d2bcbc2c8")
    public void addRelationshipConstraint(final RelationshipConstraintType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RelationshipConstraintsType.MdaTypes.MDAASSOCDEP);
            d.setName("relationshipConstraint");
            d.putTagValue(RelationshipConstraintsType.MdaTypes.MDAASSOCDEP_ROLE, "relationshipConstraint");
        }
    }

    @objid ("e6f6e09a-4b2c-4224-8d8e-00bcbc1a787f")
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
        RelationshipConstraintsType other = (RelationshipConstraintsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("ee6abba4-9ad2-48bc-b29a-3258de38b742")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'relationshipConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("76465d63-0960-4e6f-a8a5-f010ac60261b")
    public List<RelationshipConstraintType> getRelationshipConstraint() {
        List<RelationshipConstraintType> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(RelationshipConstraintsType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(RelationshipConstraintsType.MdaTypes.MDAASSOCDEP_ROLE), "relationshipConstraint")
              && RelationshipConstraintType.canInstantiate(d.getDependsOn()))
                results.add((RelationshipConstraintType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), RelationshipConstraintType.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c9d11409-67fc-4b39-9381-0fb7afd13352")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'relationshipConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c8555b56-b446-49dc-8416-cd3529d114cf")
    public boolean removeRelationshipConstraint(final RelationshipConstraintType obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(RelationshipConstraintsType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RelationshipConstraintsType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("71f8e448-177f-4364-8a78-7ae3d75153f1")
    protected  RelationshipConstraintsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("67e54203-65d0-4720-be05-d0584e7346b5")
    public static final class MdaTypes {
        @objid ("225707a7-cc6d-4cd8-a35a-05a53ae3a14f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("45b51365-b7e5-4898-ba56-7bf4207612f1")
        private static Stereotype MDAASSOCDEP;

        @objid ("90e5bcdd-69db-49d4-a0f2-c61b5a0815bf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e775cb73-1411-488a-9eeb-30f206feb2f8")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "c987c92a-50ca-46ee-8d2e-fad408ecc2ba", "RelationshipConstraintsType");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 04/06/2025 20:07 by Modelio Studio.
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
@objid ("6f269479-0490-4d25-8c8b-e03552f4002a")
public class RelationshipConstraintsType implements IMdaProxy {
    @objid ("3c02cacb-3709-4ad7-a40e-bd16bcf45ea6")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("396655e8-0294-46c8-b2f0-d2d3f6a762b8")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ba330fdb-50f6-44a9-837a-6042f8686682")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipConstraintsType >> then instantiate a {@link RelationshipConstraintsType} proxy.
     * 
     * @return a {@link RelationshipConstraintsType} proxy on the created {@link ModelElement}.
     */
    @objid ("814e0c34-2cb8-45f6-9974-211322e54949")
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
    @objid ("819ebd06-7b2e-4170-8940-434013ff8272")
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
    @objid ("39a1aa36-3860-4873-9355-0a0ec1b15441")
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
    @objid ("a00e3c22-b2b2-4f92-8489-31fb375634ca")
    public void addRelationshipConstraint(final RelationshipConstraintType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RelationshipConstraintsType.MdaTypes.MDAASSOCDEP);
            d.setName("relationshipConstraint");
            d.putTagValue(RelationshipConstraintsType.MdaTypes.MDAASSOCDEP_ROLE, "relationshipConstraint");
        }
    }

    @objid ("50de4a1e-f1ba-4825-b606-46a728b801ab")
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
    @objid ("3ec0228b-b8a4-41ba-82e1-0205b7a9befd")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'relationshipConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5e892b04-2165-4df6-9331-7dce30cc1a37")
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

    @objid ("ce1f92fb-f086-4ac1-8c20-11613e95c918")
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
    @objid ("977a654f-6b19-4a5c-8dfe-cf778c34f3f5")
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

    @objid ("41a833e9-3092-435c-86ea-d566af33dfe0")
    protected  RelationshipConstraintsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("c5c415c1-fdaf-4b9d-a28f-1d7d304c4022")
    public static final class MdaTypes {
        @objid ("1104654d-6f1d-4a45-be56-b84465832e2e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e2d33dc3-1ed1-4889-95e2-ad146fcee5cc")
        private static Stereotype MDAASSOCDEP;

        @objid ("d2e24a2e-b8ff-4786-885c-4213686bbe80")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e6f2bbea-4ab9-4144-a05c-fd2913cf5563")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
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
import fr.softeam.toscadesigner.impl.MdaProxyException;
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
@objid ("3cf88a17-5543-45f1-9318-88c7791b1585")
public class RelationshipConstraintsType implements IMdaProxy {
    @objid ("5f6e05a5-6ba3-4f05-96e2-37477bba81d3")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("a0eae5b0-1f21-4735-8593-6bdfb148c57c")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d6a63e4f-157a-4e78-b904-4922805a0cd0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipConstraintsType >> then instantiate a {@link RelationshipConstraintsType} proxy.
     * 
     * @return a {@link RelationshipConstraintsType} proxy on the created {@link ModelElement}.
     */
    @objid ("2829e3f1-f687-494c-a954-32655f2c881d")
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
    @objid ("e43dbcec-a33c-4dea-8522-a778929ba04b")
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
    @objid ("6c65754f-b232-45cf-bc98-0495982e8b09")
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
    @objid ("9d057fc5-414e-4796-a594-3bc77c957cb1")
    public void addRelationshipConstraint(final RelationshipConstraintType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RelationshipConstraintsType.MdaTypes.MDAASSOCDEP);
            d.setName("relationshipConstraint");
            d.putTagValue(RelationshipConstraintsType.MdaTypes.MDAASSOCDEP_ROLE, "relationshipConstraint");
        }
    }

    @objid ("2e204967-852c-4d98-acd1-19887cb1a4ce")
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
    @objid ("992fd2b9-ee32-49b6-9e12-d356c86e453c")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'relationshipConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d4ba6148-1b16-4d0f-acf0-a40df4b3dffe")
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

    @objid ("c2091fef-f300-4181-9cfc-8ec1cf9ffecb")
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
    @objid ("1f500325-d676-4cc2-ac80-6d4ada06d8bb")
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

    @objid ("13cb1f66-3ba8-4530-9fb8-d65da19a65d0")
    protected  RelationshipConstraintsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("8c4f1b4c-1891-497e-9f05-9324e8c8d04a")
    public static final class MdaTypes {
        @objid ("6846fceb-0d24-4ca4-8b35-686101ce9a66")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d50000b5-8b13-4196-a988-0c47ae42f8a8")
        private static Stereotype MDAASSOCDEP;

        @objid ("c8521243-b9a5-4731-8f46-2aff6dd0f131")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8711035f-766d-4a58-b79e-799e557bc8e4")
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

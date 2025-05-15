/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
    @objid ("dc0acb70-0bf8-4c6d-bc8d-836d5644e5ba")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("3f294913-e4cf-487f-8b2f-3a192995e80c")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2e7065b5-299e-4089-b844-cb21b2d2f220")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipConstraintsType >> then instantiate a {@link RelationshipConstraintsType} proxy.
     * 
     * @return a {@link RelationshipConstraintsType} proxy on the created {@link ModelElement}.
     */
    @objid ("00f25762-bc1d-4b22-929f-0bd9e88375f8")
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
    @objid ("1fa23f5b-653e-40e7-b4f7-4bf5dcc0d91a")
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
    @objid ("6d61450c-e55b-42ce-9ffa-14bc1053cb6a")
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
    @objid ("8dc77cb9-28ee-4f30-b969-4b109866e942")
    public void addRelationshipConstraint(final RelationshipConstraintType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RelationshipConstraintsType.MdaTypes.MDAASSOCDEP);
            d.setName("relationshipConstraint");
            d.putTagValue(RelationshipConstraintsType.MdaTypes.MDAASSOCDEP_ROLE, "relationshipConstraint");
        }
    }

    @objid ("c5e687bb-fdd4-47e4-b12d-8b3a43fb6153")
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
    @objid ("68e9a453-159c-4e8e-9e34-5e5eebd87cd5")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'relationshipConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ca9f2550-d197-4242-b0e1-3eb108ccc056")
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

    @objid ("cddee48c-cf78-4c62-93e0-b17cce03256b")
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
    @objid ("a69ab810-c974-440f-834e-e4f4ac551879")
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

    @objid ("c9c32b2e-37cd-46e7-8c86-94a286cabcda")
    protected  RelationshipConstraintsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("67e54203-65d0-4720-be05-d0584e7346b5")
    public static final class MdaTypes {
        @objid ("53018fe0-68e7-4fed-b556-1fae2697bb8f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ace0e04a-1b28-477e-a04c-67092bd601a8")
        private static Stereotype MDAASSOCDEP;

        @objid ("ba7b2e3b-5d55-4d1d-b153-8cb9d898002a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0cdfc65a-88b5-403e-82d1-e779f768f9b1")
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

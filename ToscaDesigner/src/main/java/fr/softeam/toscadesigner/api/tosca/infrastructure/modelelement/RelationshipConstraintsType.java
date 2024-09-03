/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 18:12 by Modelio Studio.
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
@objid ("374b1a28-fc2e-4d97-80fa-a30796664cb7")
public class RelationshipConstraintsType implements IMdaProxy {
    @objid ("3edc4646-8440-4b19-9c0a-2b07d3889450")
    public static final String STEREOTYPE_NAME = "RelationshipConstraintsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("73903d48-3d9b-4b81-bd30-da6a4ed6ef3f")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RelationshipConstraintsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RelationshipConstraintsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bc57e2b4-bd57-42fe-ab95-a6bab43dca53")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RelationshipConstraintsType >> then instantiate a {@link RelationshipConstraintsType} proxy.
     * 
     * @return a {@link RelationshipConstraintsType} proxy on the created {@link ModelElement}.
     */
    @objid ("6ffc516e-d751-4a2e-b1c7-cabf0880359f")
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
    @objid ("391da936-399e-40ea-bcb1-d32d9300d935")
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
    @objid ("0919b5e3-9840-4a60-9023-9c065606a583")
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
    @objid ("ac713bfb-0e0c-48cb-906e-69eb2a398044")
    public void addRelationshipConstraint(final RelationshipConstraintType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RelationshipConstraintsType.MdaTypes.MDAASSOCDEP);
            d.setName("relationshipConstraint");
            d.putTagValue(RelationshipConstraintsType.MdaTypes.MDAASSOCDEP_ROLE, "relationshipConstraint");
        }
    }

    @objid ("be55ddb2-5bee-48f7-b750-c85afff9cf43")
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
    @objid ("16334094-1693-408e-993b-cdfdb299ff47")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'relationshipConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("869f213c-dd49-49d6-bd71-2f37a7018b81")
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

    @objid ("3a36d1a1-ae71-4b10-87b7-bf95ccfd904a")
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
    @objid ("6c3d5131-9ac4-4e86-bb55-11f63e57b670")
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

    @objid ("d6ac0700-77d4-4c24-b561-eaee91c9b793")
    protected  RelationshipConstraintsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("133d862b-0efb-436d-9945-8c647b597b06")
    public static final class MdaTypes {
        @objid ("339e0980-aa23-4cf7-8520-02505b49e7c4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("333d096c-033f-4878-864f-3283aa26b3f5")
        private static Stereotype MDAASSOCDEP;

        @objid ("2ed572bc-1adb-4c66-a5aa-93a6ae355270")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("892061a3-52a0-4a5c-b1ee-d72243b5fe91")
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

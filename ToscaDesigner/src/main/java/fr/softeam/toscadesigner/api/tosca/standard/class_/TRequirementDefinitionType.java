/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/10/2024 11:39 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRequirementDefinitionType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("84892095-cc98-496d-8c83-ce115a5bb321")
public class TRequirementDefinitionType extends TEntityType implements IMdaProxy {
    @objid ("e51de692-daf4-4949-9726-b9b4fe4424f4")
    public static final String STEREOTYPE_NAME = "TRequirementDefinitionType";

    /**
     * Tells whether a {@link TRequirementDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirementDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fd06e385-4b99-42ed-be0b-ade26e236db8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirementDefinitionType >> then instantiate a {@link TRequirementDefinitionType} proxy.
     * 
     * @return a {@link TRequirementDefinitionType} proxy on the created {@link Class}.
     */
    @objid ("9abbef7e-9027-425b-b7ca-1d7bbc06d99f")
    public static TRequirementDefinitionType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT);
        return TRequirementDefinitionType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinitionType} proxy from a {@link Class} stereotyped << TRequirementDefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRequirementDefinitionType} proxy or <i>null</i>.
     */
    @objid ("ea63f925-ca33-445f-8672-a53d6d2eabe7")
    public static TRequirementDefinitionType instantiate(final Class obj) {
        return TRequirementDefinitionType.canInstantiate(obj) ? new TRequirementDefinitionType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinitionType} proxy from a {@link Class} stereotyped << TRequirementDefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRequirementDefinitionType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("406a4b28-b330-47a6-818d-f86fe9d3cdf9")
    public static TRequirementDefinitionType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirementDefinitionType.canInstantiate(obj))
        	return new TRequirementDefinitionType(obj);
        else
        	throw new IllegalArgumentException("TRequirementDefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'requirementDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0c5ee5f3-965e-481f-a144-81435ec1961a")
    public void addRequirementDefinition(final TRequirementDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TRequirementDefinitionType.MdaTypes.MDAASSOCDEP);
            d.setName("requirementDefinition");
            d.putTagValue(TRequirementDefinitionType.MdaTypes.MDAASSOCDEP_ROLE, "requirementDefinition");
        }
    }

    @objid ("f6e3dee9-9255-47c5-8913-a08d3215b763")
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
        TRequirementDefinitionType other = (TRequirementDefinitionType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("531aa7ee-b3c8-473c-bd75-7055a3f09cf2")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'requirementDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cdd53602-1223-41ff-a01c-5f474450d54f")
    public List<TRequirementDefinition> getRequirementDefinition() {
        List<TRequirementDefinition> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TRequirementDefinitionType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TRequirementDefinitionType.MdaTypes.MDAASSOCDEP_ROLE), "requirementDefinition")
              && TRequirementDefinition.canInstantiate(d.getDependsOn()))
                results.add((TRequirementDefinition)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRequirementDefinition.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9245ef3b-c598-4fe0-a72f-f150a56018f2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'requirementDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1cbb5b2e-77d0-4fd6-9a3d-9194966f515e")
    public boolean removeRequirementDefinition(final TRequirementDefinition obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TRequirementDefinitionType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TRequirementDefinitionType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("84255f9b-ba6c-4197-b418-a09730c8ea95")
    protected  TRequirementDefinitionType(final Class elt) {
        super(elt);
    }

    @objid ("9587f9a4-a5d8-4562-9832-06cef64054b7")
    public static final class MdaTypes {
        @objid ("e320d2ab-6c47-438b-8370-de937d246f89")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c5e85796-d925-4ac9-8208-c0fe8c43f47d")
        private static Stereotype MDAASSOCDEP;

        @objid ("72903b3b-8f31-448e-8b76-049972967fa4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("13ff3706-3e41-427a-9f31-2da5d01491f8")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "622c76d1-f337-471e-984a-2af659417163", "TRequirementDefinitionType");
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

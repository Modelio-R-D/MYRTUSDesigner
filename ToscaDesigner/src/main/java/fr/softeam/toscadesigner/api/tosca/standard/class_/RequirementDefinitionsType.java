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
 * Proxy class to handle a {@link Class} with << RequirementDefinitionsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e02b7157-b142-4eaa-ba5d-6f9cb139176d")
public class RequirementDefinitionsType implements IMdaProxy {
    @objid ("fd8114fb-4edc-4d17-9975-6f9fb245f6e4")
    public static final String STEREOTYPE_NAME = "RequirementDefinitionsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("a7bb0fe0-409d-458f-bcdc-ac1c0b5e75be")
    protected final Class elt;

    /**
     * Tells whether a {@link RequirementDefinitionsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementDefinitionsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f8791039-a360-4b91-b4c5-4eae9d0ee45c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RequirementDefinitionsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RequirementDefinitionsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementDefinitionsType >> then instantiate a {@link RequirementDefinitionsType} proxy.
     * @return a {@link RequirementDefinitionsType} proxy on the created {@link Class}.
     */
    @objid ("faa49bb1-e712-4b0e-9a15-096c4c5a95ac")
    public static RequirementDefinitionsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(RequirementDefinitionsType.MdaTypes.STEREOTYPE_ELT);
        return RequirementDefinitionsType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RequirementDefinitionsType} proxy from a {@link Class} stereotyped << RequirementDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RequirementDefinitionsType} proxy or <i>null</i>.
     */
    @objid ("3061308c-4229-4c88-8433-3846bfa1d0f2")
    public static RequirementDefinitionsType instantiate(final Class obj) {
        return RequirementDefinitionsType.canInstantiate(obj) ? new RequirementDefinitionsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementDefinitionsType} proxy from a {@link Class} stereotyped << RequirementDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RequirementDefinitionsType} proxy.
     */
    @objid ("0fb7aeb2-9c73-47b3-b609-23f435c49b60")
    public static RequirementDefinitionsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RequirementDefinitionsType.canInstantiate(obj))
            return new RequirementDefinitionsType(obj);
        else
            throw new IllegalArgumentException("RequirementDefinitionsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'requirementDefinition' role.<p>
     * Role description:
     * null
     */
    @objid ("562af0a8-5b7d-40a7-9600-7ccab7ec6182")
    public void addRequirementDefinition(final TRequirementDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RequirementDefinitionsType.MdaTypes.MDAASSOCDEP);
            d.setName("requirementDefinition");
            d.putTagValue(RequirementDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE, "requirementDefinition");
        }
    }

    @objid ("760544c4-e4c8-47a4-a21c-f8d8bf35e371")
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
        RequirementDefinitionsType other = (RequirementDefinitionsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("71d70cdf-eeda-4fa7-b549-e42208b23467")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'requirementDefinition' role.<p>
     * Role description:
     * null
     */
    @objid ("b2b913e8-4ba8-40d6-bbd6-305baa2e79a9")
    public List<TRequirementDefinition> getRequirementDefinition() {
        List<TRequirementDefinition> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(RequirementDefinitionsType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(RequirementDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE), "requirementDefinition")
              && TRequirementDefinition.canInstantiate(d.getDependsOn()))
                results.add((TRequirementDefinition)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRequirementDefinition.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cca15574-0b53-43b3-96bd-410e86d97906")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'requirementDefinition' role.<p>
     * Role description:
     * null
     */
    @objid ("2756c12e-a3c1-4851-97bd-8a4ee070c223")
    public boolean removeRequirementDefinition(final TRequirementDefinition obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(RequirementDefinitionsType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("f0e8aed6-3060-4618-8818-afc65a5dc391")
    protected  RequirementDefinitionsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("05569d1f-9ada-45be-bbc5-7f130eb7ff1d")
    public static final class MdaTypes {
        @objid ("edfa0adf-e43c-4058-bac3-50dd57efd210")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9348b0fb-836e-445d-b075-17fd1248bfc9")
        private static Stereotype MDAASSOCDEP;

        @objid ("4037c05f-c7b5-456e-ba36-55dd0d37deea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3ad3fc13-97c5-4dc2-aec5-13c18f9fa7ec")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "622c76d1-f337-471e-984a-2af659417163", "RequirementDefinitionsType");
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

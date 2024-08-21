/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 11:15 by Modelio Studio.
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
@objid ("114dcbad-e130-4501-8fed-bc8ec5791249")
public class RequirementDefinitionsType implements IMdaProxy {
    @objid ("59aed9f4-a5d0-44dc-bad6-d9b25928bb35")
    public static final String STEREOTYPE_NAME = "RequirementDefinitionsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("453702fa-8a21-4e0a-8306-045235fb2332")
    protected final Class elt;

    /**
     * Tells whether a {@link RequirementDefinitionsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementDefinitionsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("516aa38a-5f87-4bf1-ac5c-5f540f05c589")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RequirementDefinitionsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RequirementDefinitionsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementDefinitionsType >> then instantiate a {@link RequirementDefinitionsType} proxy.
     * 
     * @return a {@link RequirementDefinitionsType} proxy on the created {@link Class}.
     */
    @objid ("aa4e2292-c97c-40aa-b24d-2f7da0c485de")
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
    @objid ("1dd3e84d-71b0-47b2-8f20-4bd98057fb5f")
    public static RequirementDefinitionsType instantiate(final Class obj) {
        return RequirementDefinitionsType.canInstantiate(obj) ? new RequirementDefinitionsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementDefinitionsType} proxy from a {@link Class} stereotyped << RequirementDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RequirementDefinitionsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d3da01f3-f516-4b6d-85cd-d2758e419ae1")
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
     * 
     */
    @objid ("dbf49e1d-dfe7-4897-b3c3-7680b0ddbc4c")
    public void addRequirementDefinition(final TRequirementDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RequirementDefinitionsType.MdaTypes.MDAASSOCDEP);
            d.setName("requirementDefinition");
            d.putTagValue(RequirementDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE, "requirementDefinition");
        }
    }

    @objid ("4e394bf2-f97c-4452-93b5-74c4716a6cc9")
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
    @objid ("67a730f0-c1c1-4f61-a42d-7422b809c81f")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'requirementDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("606714ad-f559-4f94-8c95-8e0246b29585")
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

    @objid ("5f2bf148-b747-45f0-9b38-d13bb3fee3bf")
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
    @objid ("83f6c651-707e-4d6b-a186-04b5952c59bc")
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

    @objid ("6c737a53-f111-480e-9ed6-23cf5e4a04b4")
    protected  RequirementDefinitionsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("e2accfb5-24b5-4012-94c6-d558e1790fc8")
    public static final class MdaTypes {
        @objid ("95c838e2-6272-4faa-9822-7dd02daaf94f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ab9fa9e2-cf49-4212-9014-c3aea328d3b2")
        private static Stereotype MDAASSOCDEP;

        @objid ("a5600031-20cc-4fc4-b96c-b14d01cd385a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f9a42d91-5cac-4c3e-ba15-426c6946d16e")
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

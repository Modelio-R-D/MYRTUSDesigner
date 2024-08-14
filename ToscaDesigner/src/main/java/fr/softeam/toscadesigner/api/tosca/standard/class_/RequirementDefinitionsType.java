/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 13/08/2024 17:47 by Modelio Studio.
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
    @objid ("15d591e0-2ea5-4274-9703-d6ff9364d448")
    public static final String STEREOTYPE_NAME = "RequirementDefinitionsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("1a2b9a54-247e-4147-8926-9287b541a2aa")
    protected final Class elt;

    /**
     * Tells whether a {@link RequirementDefinitionsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementDefinitionsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("43c2f567-71d6-4b34-b415-2bfba505dfa3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RequirementDefinitionsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RequirementDefinitionsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementDefinitionsType >> then instantiate a {@link RequirementDefinitionsType} proxy.
     * 
     * @return a {@link RequirementDefinitionsType} proxy on the created {@link Class}.
     */
    @objid ("23e95efa-9989-41a2-b557-c7676472f007")
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
    @objid ("bffc931e-3151-4c20-9de2-513820dc9eb2")
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
    @objid ("4e1d516a-0524-437f-b328-3ea7e9028517")
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
    @objid ("edee0069-0e28-40cf-a836-a2de3d839fce")
    public void addRequirementDefinition(final TRequirementDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RequirementDefinitionsType.MdaTypes.MDAASSOCDEP);
            d.setName("requirementDefinition");
            d.putTagValue(RequirementDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE, "requirementDefinition");
        }
    }

    @objid ("0bba3348-7a07-45b0-b907-6482d4f72c62")
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
    @objid ("1db29d83-d160-4309-850b-18f2ded7adb2")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'requirementDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8ce87029-4671-4947-a943-f88e676d3b53")
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

    @objid ("9dd26052-3b29-4e83-b08c-14b2c0714a69")
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
    @objid ("ee4c329e-59a4-45a3-8187-20d9e085ae6c")
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

    @objid ("6906270b-cc7c-487e-9fce-f132113085cd")
    protected  RequirementDefinitionsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("e2accfb5-24b5-4012-94c6-d558e1790fc8")
    public static final class MdaTypes {
        @objid ("6e3333f6-77a4-4e9f-ab9d-22d24c9fe278")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("30ba50d6-898b-4a51-90f2-a56512028659")
        private static Stereotype MDAASSOCDEP;

        @objid ("656470c3-fdcd-41cf-ae1a-139e68869e61")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9dceb89f-713b-4ecf-843a-be51d3ce59c5")
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

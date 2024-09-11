/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 14:25 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << RequirementsType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("961deec9-eec3-4ffb-9e27-f0c2cc3708f4")
public class RequirementsType1 implements IMdaProxy {
    @objid ("bee945d4-e72f-4d3a-87ac-f81f894cf364")
    public static final String STEREOTYPE_NAME = "RequirementsType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("e0d204c4-14aa-44ee-b3ed-b825e67e430c")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link RequirementsType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << RequirementsType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7b004012-6137-4456-8da7-b4ceffb09033")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (RequirementsType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(RequirementsType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << RequirementsType1 >> then instantiate a {@link RequirementsType1} proxy.
     * 
     * @return a {@link RequirementsType1} proxy on the created {@link ModelElement}.
     */
    @objid ("cd6c949f-74c5-4a9f-8726-2c7ec7d69d45")
    public static RequirementsType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(RequirementsType1.MdaTypes.STEREOTYPE_ELT);
        return RequirementsType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link RequirementsType1} proxy from a {@link ModelElement} stereotyped << RequirementsType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link RequirementsType1} proxy or <i>null</i>.
     */
    @objid ("919e99aa-cc71-4f62-897f-031fed3430b6")
    public static RequirementsType1 instantiate(final ModelElement obj) {
        return RequirementsType1.canInstantiate(obj) ? new RequirementsType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementsType1} proxy from a {@link ModelElement} stereotyped << RequirementsType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link RequirementsType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("36e34562-e260-47e7-beb6-e116c9d9b2b8")
    public static RequirementsType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (RequirementsType1.canInstantiate(obj))
        	return new RequirementsType1(obj);
        else
        	throw new IllegalArgumentException("RequirementsType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8e4679f6-f16d-49be-b125-8db5f0c5165e")
    public void addRequirement(final TRequirementRef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RequirementsType1.MdaTypes.MDAASSOCDEP);
            d.setName("requirement");
            d.putTagValue(RequirementsType1.MdaTypes.MDAASSOCDEP_ROLE, "requirement");
        }
    }

    @objid ("b19e57ae-5a94-4a41-82c1-4e3ed6b7e7d8")
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
        RequirementsType1 other = (RequirementsType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("a7280456-31f7-468d-80f1-3492b8ec4625")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4b72b6a9-eeab-4b23-be0b-b5c7f50cf289")
    public List<TRequirementRef> getRequirement() {
        List<TRequirementRef> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(RequirementsType1.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(RequirementsType1.MdaTypes.MDAASSOCDEP_ROLE), "requirement")
              && TRequirementRef.canInstantiate(d.getDependsOn()))
                results.add((TRequirementRef)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRequirementRef.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2fdf1e91-8d3e-417b-bd01-7536fa9be9cd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5efc3860-bcbd-4793-9f04-5629ca3fcc63")
    public boolean removeRequirement(final TRequirementRef obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(RequirementsType1.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementsType1.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("68d56dec-af6e-453e-bf03-7ed85441c108")
    protected  RequirementsType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("f04ed0fc-bb14-4375-8491-fbfa12489297")
    public static final class MdaTypes {
        @objid ("7f4190a9-1bf2-4746-bd3a-e1de23808193")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("590aa4fe-4ad2-4ef2-8815-2b14bc0daf80")
        private static Stereotype MDAASSOCDEP;

        @objid ("f1303aa8-1a98-4472-ad50-876c25f85255")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6a79d011-dedd-4ee6-ba0e-4f3eecaf61ab")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1619c049-eb99-43e3-ba5c-759073903d43", "RequirementsType1");
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

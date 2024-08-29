/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 14:48 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << RequirementsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a0077769-58de-4adf-baef-96060231cc7f")
public class RequirementsType implements IMdaProxy {
    @objid ("96b2f1fa-7d47-447d-a79c-841c96ae8c98")
    public static final String STEREOTYPE_NAME = "RequirementsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("7876916b-fecd-46a3-b7f3-3e7716c5b603")
    protected final Class elt;

    /**
     * Tells whether a {@link RequirementsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2c04b9a3-0c8e-4ea1-9be4-4f1e47580c3f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RequirementsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RequirementsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementsType >> then instantiate a {@link RequirementsType} proxy.
     * 
     * @return a {@link RequirementsType} proxy on the created {@link Class}.
     */
    @objid ("df1bbf52-ac33-409f-a57c-ca3819676cad")
    public static RequirementsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(RequirementsType.MdaTypes.STEREOTYPE_ELT);
        return RequirementsType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RequirementsType} proxy from a {@link Class} stereotyped << RequirementsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RequirementsType} proxy or <i>null</i>.
     */
    @objid ("5f237343-121a-40f2-ba2f-44ef7a3890bf")
    public static RequirementsType instantiate(final Class obj) {
        return RequirementsType.canInstantiate(obj) ? new RequirementsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequirementsType} proxy from a {@link Class} stereotyped << RequirementsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RequirementsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4630d2b1-7931-43b2-9906-7d579665fee5")
    public static RequirementsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RequirementsType.canInstantiate(obj))
        	return new RequirementsType(obj);
        else
        	throw new IllegalArgumentException("RequirementsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e6a84962-d6f6-490f-a65e-d34c1dcda123")
    public void addRequirement(final TRequirement obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RequirementsType.MdaTypes.MDAASSOCDEP);
            d.setName("requirement");
            d.putTagValue(RequirementsType.MdaTypes.MDAASSOCDEP_ROLE, "requirement");
        }
    }

    @objid ("17dd3e0e-bd28-4934-8e24-48f52b5d1d97")
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
        RequirementsType other = (RequirementsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b3014e9a-895d-4b63-920d-5d5d416ce096")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("18f232cd-8e80-43ca-b659-72596ff26db5")
    public List<TRequirement> getRequirement() {
        List<TRequirement> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(RequirementsType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(RequirementsType.MdaTypes.MDAASSOCDEP_ROLE), "requirement")
              && TRequirement.canInstantiate(d.getDependsOn()))
                results.add((TRequirement)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRequirement.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("14b67ee3-580a-4d7d-9ad4-ad5acc465b82")
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
    @objid ("dc6cb9eb-ecf7-4452-baef-213a27f28995")
    public boolean removeRequirement(final TRequirement obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(RequirementsType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RequirementsType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("d5373193-015a-42f1-a605-60838d1735b0")
    protected  RequirementsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("34a115d4-a984-46df-9cfb-4a913882e400")
    public static final class MdaTypes {
        @objid ("b68867fb-8b4d-49a6-9a52-78395033ff82")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1da28b16-0c67-4f79-81ba-b2cedcb3da1a")
        private static Stereotype MDAASSOCDEP;

        @objid ("0586953b-c356-4842-b1bd-75ff58057211")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e0ae026e-55a3-4c19-b1f3-74a98e8a64bf")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1a39bd85-e28f-4e17-b2e9-a1803359cd83", "RequirementsType");
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

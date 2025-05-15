/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
@objid ("025f0d13-3d3e-43f8-ace1-2a6bb3b5b401")
public class RequirementsType extends TEntityType implements IMdaProxy {
    @objid ("d2ac656a-1d3a-44c6-b2c1-789a9f657cf5")
    public static final String STEREOTYPE_NAME = "RequirementsType";

    /**
     * Tells whether a {@link RequirementsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("413f641b-d6d5-42ef-9f62-b901a6b3004c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RequirementsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RequirementsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementsType >> then instantiate a {@link RequirementsType} proxy.
     * 
     * @return a {@link RequirementsType} proxy on the created {@link Class}.
     */
    @objid ("d3462fda-9a82-45d0-921e-66c21b5f66a3")
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
    @objid ("98c5a0bd-0c4e-434f-91de-8a4f3f90fd5a")
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
    @objid ("bb035957-0eac-4a07-bbd5-eae237c7b2d2")
    public static RequirementsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RequirementsType.canInstantiate(obj))
        	return new RequirementsType(obj);
        else
        	throw new IllegalArgumentException("RequirementsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'requirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cdbcfd20-43bb-4c72-a131-958cf146fdae")
    public void addRequirements(final TRequirement obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RequirementsType.MdaTypes.MDAASSOCDEP);
            d.setName("requirements");
            d.putTagValue(RequirementsType.MdaTypes.MDAASSOCDEP_ROLE, "requirements");
        }
    }

    @objid ("f7c9cd45-8047-4a6f-99f2-1924f5e8d6d0")
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
    @objid ("48f87124-a3b1-4047-9fa7-989602b230b5")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'requirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ba19f236-6d9b-406b-8279-9fa23c06879c")
    public List<TRequirement> getRequirements() {
        List<TRequirement> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(RequirementsType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(RequirementsType.MdaTypes.MDAASSOCDEP_ROLE), "requirements")
              && TRequirement.canInstantiate(d.getDependsOn()))
                results.add((TRequirement)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TRequirement.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7bf679a9-fdfe-4f41-b2a7-41726c49db6b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'requirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("843ba537-8bbc-4b8a-9684-738376e4fff4")
    public boolean removeRequirements(final TRequirement obj) {
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

    @objid ("d578a042-d55b-46bc-8181-7256246669c8")
    protected  RequirementsType(final Class elt) {
        super(elt);
    }

    @objid ("a7445fc8-b8c7-45c7-8166-11a782524bdc")
    public static final class MdaTypes {
        @objid ("df02adbe-6052-4521-87a2-d848ed983fd3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("00645341-10ef-4273-af08-8eb21810f7bd")
        private static Stereotype MDAASSOCDEP;

        @objid ("49d7eda9-560c-49ba-a37c-35d8ac054175")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("25cb5a6a-28fa-4706-8945-d5a9057a4f61")
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

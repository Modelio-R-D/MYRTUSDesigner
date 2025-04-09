/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
    @objid ("75170f1b-40f0-4896-b6ab-586d0baea8eb")
    public static final String STEREOTYPE_NAME = "RequirementsType";

    /**
     * Tells whether a {@link RequirementsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2824055c-4cc6-40ef-9ef5-c27d79a9b8f3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RequirementsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RequirementsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementsType >> then instantiate a {@link RequirementsType} proxy.
     * 
     * @return a {@link RequirementsType} proxy on the created {@link Class}.
     */
    @objid ("23d52cd6-23ac-45b1-8bba-c080d548f7f2")
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
    @objid ("eaed6398-4ef5-4b87-96c7-e06b310f798b")
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
    @objid ("c91a3cd5-2ba0-408a-94bb-73a75dd20a1b")
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
    @objid ("e499a957-6901-4480-a675-3ced2d73958f")
    public void addRequirements(final TRequirement obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RequirementsType.MdaTypes.MDAASSOCDEP);
            d.setName("requirements");
            d.putTagValue(RequirementsType.MdaTypes.MDAASSOCDEP_ROLE, "requirements");
        }
    }

    @objid ("ff827090-97b5-4538-9f8b-d017d7cde8f2")
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
    @objid ("c8864efc-41e6-40df-87f2-a74d4ebc517e")
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
    @objid ("f10caaf2-6ec7-4a7f-8ce6-cdba2c9ae584")
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

    @objid ("fe878b5a-4a19-4a11-880a-a80c0dbef9b3")
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
    @objid ("abd7cd3c-d3b6-4b03-85b0-e2830d5bed01")
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

    @objid ("8b8aac2a-9b88-4d35-b280-00cd337cf5b2")
    protected  RequirementsType(final Class elt) {
        super(elt);
    }

    @objid ("a7445fc8-b8c7-45c7-8166-11a782524bdc")
    public static final class MdaTypes {
        @objid ("f0d38d85-16ef-4d2c-a30a-1ae9a91f3331")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("db8b511b-1705-464e-81d3-7bb9daaa7a3c")
        private static Stereotype MDAASSOCDEP;

        @objid ("6f97e6ab-a939-40dd-afea-ccf94b772437")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c1c00ab0-e09e-43cb-b835-0761ed284321")
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

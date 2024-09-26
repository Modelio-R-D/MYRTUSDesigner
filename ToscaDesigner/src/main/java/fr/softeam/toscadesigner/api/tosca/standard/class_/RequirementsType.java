/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/09/2024 11:42 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TRequirement;
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
@objid ("883c0a0f-b4b4-4dbb-ac58-2419ab0f0545")
public class RequirementsType extends TEntityType implements IMdaProxy {
    @objid ("83391f56-786e-40b9-a950-0abb6e020259")
    public static final String STEREOTYPE_NAME = "RequirementsType";

    /**
     * Tells whether a {@link RequirementsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequirementsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cddc34d9-81bc-4fc5-8187-f91accce56a4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (RequirementsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(RequirementsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << RequirementsType >> then instantiate a {@link RequirementsType} proxy.
     * 
     * @return a {@link RequirementsType} proxy on the created {@link Class}.
     */
    @objid ("ac8c1066-ee74-411a-9419-76f1c999a3c8")
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
    @objid ("c05e437f-4149-4353-af92-6121328c8e7d")
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
    @objid ("a1301577-a43c-437f-8cb2-2dba6d04ef9f")
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
    @objid ("9df287a9-402d-4038-a95a-a39247f650b3")
    public void addRequirements(final TRequirement obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), RequirementsType.MdaTypes.MDAASSOCDEP);
            d.setName("requirements");
            d.putTagValue(RequirementsType.MdaTypes.MDAASSOCDEP_ROLE, "requirements");
        }
    }

    @objid ("51865d88-4213-4e29-96da-33bacb98c4c1")
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
    @objid ("91fd77f1-19cf-47fb-b9ad-78e16a0d8e86")
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
    @objid ("4485bdee-10e1-415f-91bf-b49fb66d9372")
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

    @objid ("ac25864b-d809-433d-82ca-18040a627ed6")
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
    @objid ("e29e3662-4a6b-4fa2-b096-a7dbe90d7ec6")
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

    @objid ("0b607dc5-8b17-45b6-a0b5-9b2a44c0d2ad")
    protected  RequirementsType(final Class elt) {
        super(elt);
    }

    @objid ("7754bc32-332e-4680-9d7c-d3b2701ebe5a")
    public static final class MdaTypes {
        @objid ("fca3f09d-6111-4137-92fa-852e339cc003")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6cef38d2-a9bf-4ab1-a988-896b19fe10c2")
        private static Stereotype MDAASSOCDEP;

        @objid ("24b37502-fe61-4387-a57f-06ef6ca9252a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c7566c05-b4db-429d-8592-489a338d8e5a")
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

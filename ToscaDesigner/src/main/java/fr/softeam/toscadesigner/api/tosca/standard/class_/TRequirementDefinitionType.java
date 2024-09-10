/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/09/2024 16:32 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TRequirementDefinition;
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
public class TRequirementDefinitionType implements IMdaProxy {
    @objid ("5b2f294b-e61a-4a65-bac1-d7943b9226ba")
    public static final String STEREOTYPE_NAME = "TRequirementDefinitionType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("1bd7b6b0-42af-4ba9-ab3e-a114aad18277")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirementDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirementDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("24d2f852-1c70-4de7-8da8-a76cb324da09")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirementDefinitionType >> then instantiate a {@link TRequirementDefinitionType} proxy.
     * 
     * @return a {@link TRequirementDefinitionType} proxy on the created {@link Class}.
     */
    @objid ("e0a03d64-3a34-4750-b5d0-9a85b232a8b1")
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
    @objid ("339c6678-a69c-4d1d-b29e-1d073d89fbfb")
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
    @objid ("9ba306c7-1b9b-428e-bd72-9b602aeca7e1")
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
    @objid ("e04d5a5f-b526-422a-be72-3dade4469ca9")
    public void addRequirementDefinition(final TRequirementDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TRequirementDefinitionType.MdaTypes.MDAASSOCDEP);
            d.setName("requirementDefinition");
            d.putTagValue(TRequirementDefinitionType.MdaTypes.MDAASSOCDEP_ROLE, "requirementDefinition");
        }
    }

    @objid ("7e5090a0-dd9e-4b93-8eb3-41221d32e0a2")
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
    @objid ("9b4eb523-d3ae-4177-882a-b93fd83642ff")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'requirementDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0e393ead-93b7-43cd-8aa7-0922b0c766da")
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

    @objid ("bd4e3167-051f-4587-931e-6d0b462d0582")
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
    @objid ("5a7c60b5-ab28-4e64-8ea6-6fbdca1aad43")
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

    @objid ("454f6164-3223-41bf-833f-bd07d0206da6")
    protected  TRequirementDefinitionType(final Class elt) {
        this.elt = elt;
    }

    @objid ("9587f9a4-a5d8-4562-9832-06cef64054b7")
    public static final class MdaTypes {
        @objid ("cee95e51-e3ff-4666-bb28-28f34c6f3fde")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c4add2e2-7dc5-4040-a2bb-a08a6fa84661")
        private static Stereotype MDAASSOCDEP;

        @objid ("d54c0d0d-3a5e-4eae-83df-7ce830fdb955")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eb7f3ce5-b951-4ec8-9d00-f5e31fbcf796")
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

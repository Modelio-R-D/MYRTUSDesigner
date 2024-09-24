/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 24/09/2024 16:22 by Modelio Studio.
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
    @objid ("f849b490-58fb-41ba-a32b-8a17d43e5a83")
    public static final String STEREOTYPE_NAME = "TRequirementDefinitionType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("7f8b3f35-c730-493d-b8ea-efbe140d4237")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirementDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirementDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7eae3c96-9218-41bd-83b0-29e2756741c5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirementDefinitionType >> then instantiate a {@link TRequirementDefinitionType} proxy.
     * 
     * @return a {@link TRequirementDefinitionType} proxy on the created {@link Class}.
     */
    @objid ("5fe48c34-38d3-4eaf-8527-dda016706a43")
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
    @objid ("02a239f8-c362-4791-bc28-2460b898aa53")
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
    @objid ("8aa269ac-3d23-43aa-91a0-12b1daa9c2ea")
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
    @objid ("a48551e4-62c6-487b-a3e4-34fe41d14061")
    public void addRequirementDefinition(final TRequirementDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TRequirementDefinitionType.MdaTypes.MDAASSOCDEP);
            d.setName("requirementDefinition");
            d.putTagValue(TRequirementDefinitionType.MdaTypes.MDAASSOCDEP_ROLE, "requirementDefinition");
        }
    }

    @objid ("a55a549f-e15a-4e16-b594-e2e42f65b9f6")
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
    @objid ("a606c8e6-6e86-41de-b5c8-6cbc681d0099")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'requirementDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e0df8dc3-f975-4c17-907e-9d5f0257199f")
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

    @objid ("9c97fdb9-11db-478c-9d71-b0d75ff4e75c")
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
    @objid ("e25c0bb2-e437-439b-a400-3ab534f9b1aa")
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

    @objid ("eaa9d7a6-f4f9-4f38-88a1-2e69e1a9f82c")
    protected  TRequirementDefinitionType(final Class elt) {
        this.elt = elt;
    }

    @objid ("9587f9a4-a5d8-4562-9832-06cef64054b7")
    public static final class MdaTypes {
        @objid ("a8a0aefc-b9aa-4ed5-8f8e-a7ed0153fc6c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f87f498e-70a6-41cd-a7d3-81ed19b44b68")
        private static Stereotype MDAASSOCDEP;

        @objid ("4d79b6c2-3c01-4748-a8e9-f6f72208bb27")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("962e6e21-ffe4-4a8d-9eda-6e3c83f4a34b")
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

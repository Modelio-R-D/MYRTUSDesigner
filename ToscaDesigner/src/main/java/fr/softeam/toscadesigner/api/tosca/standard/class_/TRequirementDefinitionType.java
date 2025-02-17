/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 15:39 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRequirementDefinitionType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ec2611b8-248f-43fc-b4ba-d00ffb400225")
public class TRequirementDefinitionType extends TEntityType implements IMdaProxy {
    @objid ("4f4c7937-034b-439f-b831-037075f19019")
    public static final String STEREOTYPE_NAME = "TRequirementDefinitionType";

    /**
     * Tells whether a {@link TRequirementDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirementDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2d6a265f-47a2-44c3-b811-712876aaab9b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirementDefinitionType >> then instantiate a {@link TRequirementDefinitionType} proxy.
     * 
     * @return a {@link TRequirementDefinitionType} proxy on the created {@link Class}.
     */
    @objid ("07334696-ee06-4285-b70f-160b23b009ea")
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
    @objid ("f4e0cb63-bb9a-4141-977a-d012e4211c23")
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
    @objid ("62c0a02f-6517-4ac7-9f8c-e6e423b3c93b")
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
    @objid ("ae7d5902-8b74-4446-b846-66d62cf0e35a")
    public void addRequirementDefinition(final TRequirementDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TRequirementDefinitionType.MdaTypes.MDAASSOCDEP);
            d.setName("requirementDefinition");
            d.putTagValue(TRequirementDefinitionType.MdaTypes.MDAASSOCDEP_ROLE, "requirementDefinition");
        }
    }

    @objid ("bbc96cc4-f29b-4752-b987-0c961342923f")
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
    @objid ("4552ffab-55d1-4db9-a925-5c2fde437a01")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'requirementDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1835b938-34d9-461e-8cc9-6d2910091769")
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

    @objid ("e87e4b3b-c3c6-4d3b-a9c6-e59933b16a79")
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
    @objid ("dbcbafe3-d31e-4d22-803d-81ef1f28f07d")
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

    @objid ("e9c51664-e56c-4cc8-80c0-7b8f1bc60af9")
    protected  TRequirementDefinitionType(final Class elt) {
        super(elt);
    }

    @objid ("03c4d5f8-0b24-408c-8f74-cfd92c95ce19")
    public static final class MdaTypes {
        @objid ("c5abba2a-77d1-4ae2-a0c1-5065a698dd7a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("109b96eb-e434-49ea-b02e-7ce9f333a61e")
        private static Stereotype MDAASSOCDEP;

        @objid ("cae5b366-9fee-4efe-a9c7-75ad82fbd353")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f70aaee-0778-4c81-9842-0aeb746c40b5")
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

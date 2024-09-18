/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 12:38 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TCapabilityDefinition;
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
 * Proxy class to handle a {@link Class} with << TCapabilityDefinitionsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("63396815-67ef-4b23-aa0a-6367d5b9567c")
public class TCapabilityDefinitionsType implements IMdaProxy {
    @objid ("a58bac1b-8943-4b7e-aca6-0a38cbc3dabf")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinitionsType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("88457450-a256-4088-853c-e8aa2b8d7026")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapabilityDefinitionsType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinitionsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8eeeaddc-9ae5-4a93-acc5-e9cd1175c3e0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinitionsType >> then instantiate a {@link TCapabilityDefinitionsType} proxy.
     * 
     * @return a {@link TCapabilityDefinitionsType} proxy on the created {@link Class}.
     */
    @objid ("ec25e4f8-a144-45d5-86dd-0e19ccce4fef")
    public static TCapabilityDefinitionsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TCapabilityDefinitionsType.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityDefinitionsType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinitionsType} proxy from a {@link Class} stereotyped << TCapabilityDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TCapabilityDefinitionsType} proxy or <i>null</i>.
     */
    @objid ("4f1e343d-00fa-4e84-9425-0d7a09c314ee")
    public static TCapabilityDefinitionsType instantiate(final Class obj) {
        return TCapabilityDefinitionsType.canInstantiate(obj) ? new TCapabilityDefinitionsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinitionsType} proxy from a {@link Class} stereotyped << TCapabilityDefinitionsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapabilityDefinitionsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d7789f19-0307-4978-b49e-0ac8b4ff724d")
    public static TCapabilityDefinitionsType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityDefinitionsType.canInstantiate(obj))
        	return new TCapabilityDefinitionsType(obj);
        else
        	throw new IllegalArgumentException("TCapabilityDefinitionsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'capabilityDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("655bd762-20ff-4149-a952-9e33ebd46b41")
    public void addCapabilityDefinition(final TCapabilityDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP);
            d.setName("capabilityDefinition");
            d.putTagValue(TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE, "capabilityDefinition");
        }
    }

    @objid ("77f4df43-f241-4d73-89f6-c06eed552400")
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
        TCapabilityDefinitionsType other = (TCapabilityDefinitionsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'capabilityDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b037293a-479d-44cc-932f-ba67b64ceefb")
    public List<TCapabilityDefinition> getCapabilityDefinition() {
        List<TCapabilityDefinition> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE), "capabilityDefinition")
              && TCapabilityDefinition.canInstantiate(d.getDependsOn()))
                results.add((TCapabilityDefinition)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ee97c1ed-0657-4d6e-b240-4707bb697d32")
    public Class getElement() {
        return this.elt;
    }

    @objid ("dc58f6dc-759d-4d08-86d3-f6f2adf29715")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'capabilityDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7046dd5f-7ddd-4183-8c7c-15e8b36cf1cb")
    public boolean removeCapabilityDefinition(final TCapabilityDefinition obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TCapabilityDefinitionsType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("eee166da-5f4d-4a56-beb2-beb93c25e953")
    protected  TCapabilityDefinitionsType(final Class elt) {
        this.elt = elt;
    }

    @objid ("039dd1d6-0c13-43af-a95b-aba4b7fffbf4")
    public static final class MdaTypes {
        @objid ("f62dc4f2-c000-41be-9b75-452643d44256")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("79dd8759-e336-4ecb-88b2-f55f9f1a923f")
        private static Stereotype MDAASSOCDEP;

        @objid ("f986bb7e-faa7-4037-9f5a-8551d1cd46c1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eb30f826-c328-44c7-b7f4-68458fed478f")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "ac0418b1-a726-46e6-ac59-310f0055050f", "TCapabilityDefinitionsType");
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

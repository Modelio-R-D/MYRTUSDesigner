/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 19/09/2024 15:04 by Modelio Studio.
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
    @objid ("2f9446d2-9901-48bd-bc79-8baadfbed7ad")
    public static final String STEREOTYPE_NAME = "TRequirementDefinitionType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("190f4c8e-f026-445e-8218-8cfddff264a3")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirementDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirementDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("eec7506f-54ba-46b2-8d21-783a3ff7f7f6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirementDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirementDefinitionType >> then instantiate a {@link TRequirementDefinitionType} proxy.
     * 
     * @return a {@link TRequirementDefinitionType} proxy on the created {@link Class}.
     */
    @objid ("053c0bbe-cd3e-4c87-a27d-2624d3a4e219")
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
    @objid ("a754511e-528c-4fc4-902e-c3ff74ad9d99")
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
    @objid ("734f26b4-9524-466c-a5d7-3b0019e1877f")
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
    @objid ("2c897226-4c00-4ab0-98c7-49c068c302a4")
    public void addRequirementDefinition(final TRequirementDefinition obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TRequirementDefinitionType.MdaTypes.MDAASSOCDEP);
            d.setName("requirementDefinition");
            d.putTagValue(TRequirementDefinitionType.MdaTypes.MDAASSOCDEP_ROLE, "requirementDefinition");
        }
    }

    @objid ("3c1a567d-1270-454b-abc4-71b304c77858")
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
    @objid ("a1c10b4f-6a58-44c5-a3c1-1fa1e9cacbde")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'requirementDefinition' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("04c2199f-bb6a-47a9-b25e-de05ffd3d039")
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

    @objid ("a42aa925-37a4-4af0-a1a0-44d78bdab87f")
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
    @objid ("3f94ce77-45f2-437a-89bf-4eb587d770db")
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

    @objid ("5d2ab14e-1b7a-4a91-b6ff-b96d464bf7d5")
    protected  TRequirementDefinitionType(final Class elt) {
        this.elt = elt;
    }

    @objid ("9587f9a4-a5d8-4562-9832-06cef64054b7")
    public static final class MdaTypes {
        @objid ("91e1ca28-6184-4f72-b1ce-56eaba221fc7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("849827c6-b914-486c-9ec2-8d3deb18b808")
        private static Stereotype MDAASSOCDEP;

        @objid ("376d5aa7-7a09-4dba-bf5d-c76afc327243")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0714ddf7-f9d0-44f8-90d2-747c89861eb9")
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

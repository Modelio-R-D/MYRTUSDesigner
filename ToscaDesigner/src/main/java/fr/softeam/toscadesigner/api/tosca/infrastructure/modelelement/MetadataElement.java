/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/08/2024 17:44 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << MetadataElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2b3dc2db-7c80-4f5e-852d-d3fd38a4d361")
public class MetadataElement implements IMdaProxy {
    @objid ("f25d02ce-85f4-476b-bb41-44c900ba63fd")
    public static final String STEREOTYPE_NAME = "MetadataElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("8bafd851-15d7-494b-9770-699ce51bfabf")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link MetadataElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << MetadataElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6f9548ea-cf43-4aaa-93d8-7a2339955e65")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (MetadataElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(MetadataElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << MetadataElement >> then instantiate a {@link MetadataElement} proxy.
     * @return a {@link MetadataElement} proxy on the created {@link ModelElement}.
     */
    @objid ("002ffdc6-75dd-4d43-b893-93ab3a4ea6ec")
    public static MetadataElement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(MetadataElement.MdaTypes.STEREOTYPE_ELT);
        return MetadataElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link MetadataElement} proxy from a {@link ModelElement} stereotyped << MetadataElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link MetadataElement} proxy or <i>null</i>.
     */
    @objid ("9864b0e2-2beb-4532-ac87-710758580a9f")
    public static MetadataElement instantiate(final ModelElement obj) {
        return MetadataElement.canInstantiate(obj) ? new MetadataElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetadataElement} proxy from a {@link ModelElement} stereotyped << MetadataElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link MetadataElement} proxy.
     */
    @objid ("26e8f4a0-f1ee-40ff-9165-130eca962dd7")
    public static MetadataElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (MetadataElement.canInstantiate(obj))
            return new MetadataElement(obj);
        else
            throw new IllegalArgumentException("MetadataElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'elements' role.<p>
     * Role description:
     * null
     */
    @objid ("07b4bcf7-5f87-4d50-9790-8a805bbb01da")
    public void addElements(final TPropertyDef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetadataElement.MdaTypes.MDAASSOCDEP);
            d.setName("elements");
            d.putTagValue(MetadataElement.MdaTypes.MDAASSOCDEP_ROLE, "elements");
        }
    }

    @objid ("13282cee-f359-41f4-af82-b72eca8a7179")
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
        MetadataElement other = (MetadataElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("f3cbf4bc-abd3-43f7-847d-85161f3f1fb4")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'elements' role.<p>
     * Role description:
     * null
     */
    @objid ("353845f8-dd33-4e12-af6b-107e31fa06df")
    public List<TPropertyDef> getElements() {
        List<TPropertyDef> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetadataElement.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetadataElement.MdaTypes.MDAASSOCDEP_ROLE), "elements")
              && TPropertyDef.canInstantiate(d.getDependsOn()))
                results.add((TPropertyDef)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPropertyDef.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1c1f3d1e-070a-4df3-84b8-2b3ef97889e5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'elements' role.<p>
     * Role description:
     * null
     */
    @objid ("fbeaa888-21fa-4ff8-8414-e565aec3cfb3")
    public boolean removeElements(final TPropertyDef obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetadataElement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetadataElement.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("4b924d71-5c77-42b1-b10e-be2b4687d190")
    protected  MetadataElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("04352d78-8d23-4279-b055-c0f61c24c635")
    public static final class MdaTypes {
        @objid ("095a27c8-317b-4783-b829-bd25946435b1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cb9a2eb9-bbba-4fdc-8a3b-8ab04611a807")
        private static Stereotype MDAASSOCDEP;

        @objid ("a36f2704-e6bc-4a91-9e64-8df0f9138dab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("883453f2-2e79-4612-81b1-c17b6a2b4d82")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2c20f655-d501-4dde-b82b-ddc16c6d0c0f", "MetadataElement");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 06/02/2025 17:32 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << ArtifactReferencesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("53e27f1e-e444-4ed5-aae5-359402233ee6")
public class ArtifactReferencesType implements IMdaProxy {
    @objid ("d26047bc-f9cb-49ad-8f7e-6f9be9f7e685")
    public static final String STEREOTYPE_NAME = "ArtifactReferencesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("723421c3-0b1c-4fa4-9dc4-ef6ebc89413c")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ArtifactReferencesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ArtifactReferencesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("31447bb1-9c2e-42e9-af52-b151bcbd518c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ArtifactReferencesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ArtifactReferencesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ArtifactReferencesType >> then instantiate a {@link ArtifactReferencesType} proxy.
     * 
     * @return a {@link ArtifactReferencesType} proxy on the created {@link ModelElement}.
     */
    @objid ("3f2f1aa1-edf9-4ddd-a394-6edc851aee2b")
    public static ArtifactReferencesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(ArtifactReferencesType.MdaTypes.STEREOTYPE_ELT);
        return ArtifactReferencesType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ArtifactReferencesType} proxy from a {@link ModelElement} stereotyped << ArtifactReferencesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ArtifactReferencesType} proxy or <i>null</i>.
     */
    @objid ("62be5626-2e79-4163-971d-083281c4e5e7")
    public static ArtifactReferencesType instantiate(final ModelElement obj) {
        return ArtifactReferencesType.canInstantiate(obj) ? new ArtifactReferencesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ArtifactReferencesType} proxy from a {@link ModelElement} stereotyped << ArtifactReferencesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ArtifactReferencesType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("77e887de-b9aa-40cd-9fa4-153dddd8f073")
    public static ArtifactReferencesType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ArtifactReferencesType.canInstantiate(obj))
        	return new ArtifactReferencesType(obj);
        else
        	throw new IllegalArgumentException("ArtifactReferencesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'artifactReference' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3a822f97-52b4-4080-853a-9f8c151f6df8")
    public void addArtifactReference(final TArtifactReference obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, ArtifactReferencesType.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(ArtifactReferencesType.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("3920711a-f34a-4074-a965-9f6a34ce79f3")
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
        ArtifactReferencesType other = (ArtifactReferencesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'artifactReference' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("afb88169-96d3-45d5-bdec-1827676948b7")
    public List<TArtifactReference> getArtifactReference() {
        List<TArtifactReference> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(ArtifactReferencesType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ArtifactReferencesType.MdaTypes.MDAASSOCDEP_ROLE), "")
              && TArtifactReference.canInstantiate(d.getImpacted())) {
                 results.add((TArtifactReference)ToscaDesignerProxyFactory.instantiate(d.getImpacted(), TArtifactReference.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("8fcdaefd-7ff1-4f40-99f0-794f726e6a5f")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("5eae647f-7c12-4c69-9682-f5a21355390f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from 'artifactReference' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a46184be-57cb-406f-8c81-0a9ae98f6a86")
    public boolean removeArtifactReference(final TArtifactReference obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(ArtifactReferencesType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ArtifactReferencesType.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("9fb6dfd5-0384-49f8-b080-cd4d92e05a53")
    protected  ArtifactReferencesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("9db11b9e-3143-466c-9c40-39a3d3a73230")
    public static final class MdaTypes {
        @objid ("42f5e907-964d-4e96-a86b-5eefc8a1f1e5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bfc6d1eb-f05a-483e-8a3c-04ab18d3b847")
        private static Stereotype MDAASSOCDEP;

        @objid ("89649fca-c109-4eda-82cb-bd50ccf641ca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5a7e986d-1964-482e-be27-b8b965f89d3f")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "9ddd44be-52b6-478b-ba14-5b268ec69415", "ArtifactReferencesType");
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

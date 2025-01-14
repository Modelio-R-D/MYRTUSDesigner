/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 17:57 by Modelio Studio.
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
    @objid ("aa5f1de9-bac3-46aa-b565-4bb0ba63149c")
    public static final String STEREOTYPE_NAME = "ArtifactReferencesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("99483bdc-3a56-4be3-8f1a-7261503b3d62")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ArtifactReferencesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ArtifactReferencesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5ce48f01-83c8-42b4-963d-a36b2ea72daa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ArtifactReferencesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ArtifactReferencesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ArtifactReferencesType >> then instantiate a {@link ArtifactReferencesType} proxy.
     * 
     * @return a {@link ArtifactReferencesType} proxy on the created {@link ModelElement}.
     */
    @objid ("3f227f22-b3bd-4a90-98ff-f6a22dca80a5")
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
    @objid ("1fb814ba-51bf-461b-942d-4c3404737a71")
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
    @objid ("dba24fdf-7263-469d-8ae1-73ccfd04563f")
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
    @objid ("01550d1a-a2d7-45ac-b8b1-d29a247ac3cc")
    public void addArtifactReference(final TArtifactReference obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, ArtifactReferencesType.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(ArtifactReferencesType.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("8aaf5924-d990-4aee-b4e9-47d75502f5ac")
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
    @objid ("7f5da942-9787-4500-b2b2-80fc69447eaf")
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
    @objid ("85ec94fa-d7b8-4767-92eb-e17c05ada3f2")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("360053da-3df8-4c6b-8484-c5ede37e432b")
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
    @objid ("3487d24d-1990-4b70-8ce3-416bc4e355c4")
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

    @objid ("2ca2df06-5f64-4a63-a694-a6cea07f9152")
    protected  ArtifactReferencesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("9db11b9e-3143-466c-9c40-39a3d3a73230")
    public static final class MdaTypes {
        @objid ("c2506730-66f2-4d83-903b-0595e95db596")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4998e735-dc5f-4309-993e-24b263135943")
        private static Stereotype MDAASSOCDEP;

        @objid ("d8a6f46c-ca2b-43ec-accc-7e0ce586a760")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e36db5ed-d16a-4c95-83ac-39d59863f9ee")
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

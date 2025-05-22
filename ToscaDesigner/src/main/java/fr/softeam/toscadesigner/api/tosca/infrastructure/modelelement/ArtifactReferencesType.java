/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 22/05/2025 15:07 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ModelingSessionRegistry;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link ModelElement} with << ArtifactReferencesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("79f07560-e28b-46b6-a7e7-24d942dda24e")
public class ArtifactReferencesType implements IMdaProxy {
    @objid ("a96b2d11-ab02-4f93-b31d-373e9f554cfc")
    public static final String STEREOTYPE_NAME = "ArtifactReferencesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("663a2f14-0ec3-4e21-b907-1a84ce7772f1")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ArtifactReferencesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ArtifactReferencesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b96b115c-8369-4a73-9e1a-4aeada2dd323")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ArtifactReferencesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ArtifactReferencesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ArtifactReferencesType >> then instantiate a {@link ArtifactReferencesType} proxy.
     * 
     * @return a {@link ArtifactReferencesType} proxy on the created {@link ModelElement}.
     */
    @objid ("a974901d-20d3-47a1-8e16-8a8d4171854c")
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
    @objid ("8ffe9eb6-b8e8-49c6-b556-220693ad0a5a")
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
    @objid ("ab2eb08a-f2b9-474b-862c-398532ff1e19")
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
    @objid ("fb5d607e-ca57-41cd-a50c-386ac788d2e6")
    public void addArtifactReference(final TArtifactReference obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, ArtifactReferencesType.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(ArtifactReferencesType.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("4cffabf6-8fa7-4393-b5e7-5bbd6d7cc7e0")
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
    @objid ("3dea7bbb-604f-4df7-89c4-5e197040b272")
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
    @objid ("a01b6782-c224-4bfe-8969-c66ac118a58f")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("bc63546b-7e9c-4313-aec4-87ef31c95bfe")
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
    @objid ("83381eb5-a2f9-4255-aa18-18f4e684ca01")
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

    @objid ("f0a61fbd-e17c-4472-928e-c916dc3c047f")
    protected  ArtifactReferencesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("41fb7332-74e2-4dfb-8224-05f1fdeab9af")
    public static final class MdaTypes {
        @objid ("57c5c88b-65f7-4630-83f9-8f6b3ed85462")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4db7619e-58a4-41f3-8f3c-a239fd6b2b03")
        private static Stereotype MDAASSOCDEP;

        @objid ("68f557d1-1286-4a29-8dfc-d69f9bd20bd8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2b753d54-c80d-4bc6-af84-035657ebf9a4")
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

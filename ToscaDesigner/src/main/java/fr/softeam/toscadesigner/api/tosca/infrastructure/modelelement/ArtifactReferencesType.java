/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/09/2024 11:42 by Modelio Studio.
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
    @objid ("583a2583-28c5-465d-8d8e-47b9e76ca5be")
    public static final String STEREOTYPE_NAME = "ArtifactReferencesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("a9ec5330-1560-48db-b222-d4319b351502")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ArtifactReferencesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ArtifactReferencesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6b25d551-3c3f-4ee9-98d9-9189347e2641")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ArtifactReferencesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ArtifactReferencesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ArtifactReferencesType >> then instantiate a {@link ArtifactReferencesType} proxy.
     * 
     * @return a {@link ArtifactReferencesType} proxy on the created {@link ModelElement}.
     */
    @objid ("adcfff1e-8b0a-4869-b99d-4c8260d6addb")
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
    @objid ("361e20a5-b401-44e9-9e4d-913db4a369d5")
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
    @objid ("f1314877-0bfc-47b7-921e-95f889cbcdb5")
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
    @objid ("305b6395-929a-4139-9f5f-61a782c91a24")
    public void addArtifactReference(final TArtifactReference obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, ArtifactReferencesType.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(ArtifactReferencesType.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("2a2ca5a1-2073-4bf9-963c-a50291be005a")
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
    @objid ("c8bc7b21-a2ae-47d0-accc-5b86c9bcb59b")
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
    @objid ("a133a488-137c-4e90-b126-77cb74b6c430")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("37e75efe-1f0b-4a49-9f99-a4547d3f37ff")
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
    @objid ("cf1c1624-14a8-4b6d-b8f7-e72315894f25")
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

    @objid ("9a69a05e-02f3-4e96-bc65-c866516c8cef")
    protected  ArtifactReferencesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("9db11b9e-3143-466c-9c40-39a3d3a73230")
    public static final class MdaTypes {
        @objid ("b992f71e-dd49-4106-bb97-d08e583f9c56")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6c7b76b8-d3fc-4945-b0a5-bfbbaa501860")
        private static Stereotype MDAASSOCDEP;

        @objid ("706d010b-bc1d-451a-8a39-ec2296b7d2b9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f0174f41-0e9e-416c-8604-10018003c22c")
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

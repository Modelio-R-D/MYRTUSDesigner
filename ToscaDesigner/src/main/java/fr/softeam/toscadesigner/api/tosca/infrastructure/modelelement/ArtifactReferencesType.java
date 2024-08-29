/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 14:48 by Modelio Studio.
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
@objid ("4712f5f7-b715-4f92-bb01-6059e53c6352")
public class ArtifactReferencesType implements IMdaProxy {
    @objid ("1bf12a09-d844-4156-bac0-fc8462196404")
    public static final String STEREOTYPE_NAME = "ArtifactReferencesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("b5d159db-5573-4aec-a72f-09ea40ddf7dd")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ArtifactReferencesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ArtifactReferencesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3841391f-0d5e-4112-860f-5ff631597fff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ArtifactReferencesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ArtifactReferencesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ArtifactReferencesType >> then instantiate a {@link ArtifactReferencesType} proxy.
     * 
     * @return a {@link ArtifactReferencesType} proxy on the created {@link ModelElement}.
     */
    @objid ("eb93d481-6507-4b58-9dd0-afc3b38cd499")
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
    @objid ("d0a8529d-21dc-487d-8196-8905eb3bd50b")
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
    @objid ("2fd1faa7-dc43-4a07-a20b-42b05ad58bc7")
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
    @objid ("48582d4b-8a93-4f4f-be0e-e09592a37590")
    public void addArtifactReference(final TArtifactReference obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, ArtifactReferencesType.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(ArtifactReferencesType.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("9bb32be0-6707-4932-92ee-728b9ed0e630")
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
    @objid ("644804c8-284c-4f9d-80aa-949b7c693c32")
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
    @objid ("90ac1fd8-75cb-4fac-8295-fd7be34a7399")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("eff031b9-7ff7-45b5-a29a-8240c0363b23")
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
    @objid ("2d81ff8f-b67a-49d4-8a5b-2a5955616870")
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

    @objid ("26d3c3d8-14fa-4bff-a21a-211c3410626d")
    protected  ArtifactReferencesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("90ec2561-6adb-480b-af56-343064a51850")
    public static final class MdaTypes {
        @objid ("56f9e112-532a-4d51-90d5-d8701c466d8e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7bf492df-069d-4e60-a848-f03b47307b1a")
        private static Stereotype MDAASSOCDEP;

        @objid ("808c65bd-63dd-4a39-8df0-0bd2d5da83c4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("76a403cb-8ad3-4cc8-b2c2-03865d11e386")
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

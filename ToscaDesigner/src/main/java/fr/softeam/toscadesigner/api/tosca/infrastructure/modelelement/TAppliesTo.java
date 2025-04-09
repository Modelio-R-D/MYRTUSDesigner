/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 09/04/2025 17:17 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TAppliesTo >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bfdef5c6-299d-4f4b-8e3d-7e8bc0a52abd")
public class TAppliesTo implements IMdaProxy {
    @objid ("6df63ee7-0b1c-4ec3-9e01-17f6f3a7f38e")
    public static final String STEREOTYPE_NAME = "TAppliesTo";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("d25f0711-ccd1-47a1-b46b-f03339f6b7a8")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TAppliesTo proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TAppliesTo >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7020a584-84c7-428c-ad90-0e73e9024a62")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TAppliesTo.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TAppliesTo.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TAppliesTo >> then instantiate a {@link TAppliesTo} proxy.
     * 
     * @return a {@link TAppliesTo} proxy on the created {@link ModelElement}.
     */
    @objid ("9112b359-69fa-489b-a805-e408a1544dba")
    public static TAppliesTo create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TAppliesTo.MdaTypes.STEREOTYPE_ELT);
        return TAppliesTo.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TAppliesTo} proxy from a {@link ModelElement} stereotyped << TAppliesTo >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TAppliesTo} proxy or <i>null</i>.
     */
    @objid ("76b272c1-0c8e-47b7-bf47-007510e753aa")
    public static TAppliesTo instantiate(final ModelElement obj) {
        return TAppliesTo.canInstantiate(obj) ? new TAppliesTo(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TAppliesTo} proxy from a {@link ModelElement} stereotyped << TAppliesTo >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TAppliesTo} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b67fd71d-ab4d-4d0c-bef5-fbe531581d2a")
    public static TAppliesTo safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TAppliesTo.canInstantiate(obj))
        	return new TAppliesTo(obj);
        else
        	throw new IllegalArgumentException("TAppliesTo: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'nodeTypeReference' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("854a299f-3a22-43ed-b082-c573c8d4acde")
    public void addNodeTypeReference(final NodeTypeReferenceType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TAppliesTo.MdaTypes.MDAASSOCDEP);
            d.setName("nodeTypeReference");
            d.putTagValue(TAppliesTo.MdaTypes.MDAASSOCDEP_ROLE, "nodeTypeReference");
        }
    }

    @objid ("3537485a-4969-4b56-a48e-390d6ac2b40a")
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
        TAppliesTo other = (TAppliesTo) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("3c78f9e2-10bf-42d3-896c-6c93be58a708")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'nodeTypeReference' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3869e30d-545b-4c81-91db-10e2934f056c")
    public List<NodeTypeReferenceType> getNodeTypeReference() {
        List<NodeTypeReferenceType> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TAppliesTo.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TAppliesTo.MdaTypes.MDAASSOCDEP_ROLE), "nodeTypeReference")
              && NodeTypeReferenceType.canInstantiate(d.getDependsOn()))
                results.add((NodeTypeReferenceType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), NodeTypeReferenceType.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("278a3fec-51ea-420a-8a58-86e70cc7d50f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'nodeTypeReference' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e78c04c7-47c9-466b-9816-9bb813c92707")
    public boolean removeNodeTypeReference(final NodeTypeReferenceType obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TAppliesTo.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TAppliesTo.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("ba21e9f0-d8a4-42ba-b0eb-842af49bfe84")
    protected  TAppliesTo(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("7d46d04e-43b2-4010-a53b-4dc7379678e4")
    public static final class MdaTypes {
        @objid ("975fa846-9615-4ac6-96ae-c3d8a45ca6c0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9ef59d81-84df-4d59-829f-aeaa95a9dc33")
        private static Stereotype MDAASSOCDEP;

        @objid ("57e659b5-5332-44c6-8651-d85dc6745c92")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b910cb57-d384-450c-b5ff-10e517f6b2ab")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "69975683-1560-4a66-beff-ad607bc9d89f", "TAppliesTo");
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

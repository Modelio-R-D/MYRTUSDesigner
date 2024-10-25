/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/10/2024 11:40 by Modelio Studio.
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
@objid ("0337e495-9c91-418d-bd09-03a047e59664")
public class TAppliesTo implements IMdaProxy {
    @objid ("95eee73e-5992-46f1-9e34-18b215f3a0c6")
    public static final String STEREOTYPE_NAME = "TAppliesTo";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("30768bd7-dc8b-4c82-99e5-a01d5947381a")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TAppliesTo proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TAppliesTo >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b9db4c88-f8ea-4e51-ba35-7867ab3acb5a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TAppliesTo.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TAppliesTo.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TAppliesTo >> then instantiate a {@link TAppliesTo} proxy.
     * 
     * @return a {@link TAppliesTo} proxy on the created {@link ModelElement}.
     */
    @objid ("b5ba30cb-d15f-433f-8dd1-cb17ff948e0d")
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
    @objid ("a9124711-dad9-4429-8c80-57023c950751")
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
    @objid ("9767241e-814b-44ac-ba48-31f3928c22c7")
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
    @objid ("24771c4d-02ca-44a4-bdf2-80b07f63a0f0")
    public void addNodeTypeReference(final NodeTypeReferenceType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TAppliesTo.MdaTypes.MDAASSOCDEP);
            d.setName("nodeTypeReference");
            d.putTagValue(TAppliesTo.MdaTypes.MDAASSOCDEP_ROLE, "nodeTypeReference");
        }
    }

    @objid ("dbbc1b5f-bcc7-4e64-8413-f529a8647073")
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
    @objid ("cd732d15-b74b-4707-bb06-4191ff88dfa7")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'nodeTypeReference' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c82f9d9e-3fed-4f6e-9dd7-46cbf7b9ab27")
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

    @objid ("676b79ca-eed0-4c49-aa0a-58be467b0dd3")
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
    @objid ("586ce183-0ed5-4703-a07f-7e7cd4570746")
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

    @objid ("d21445ea-ba76-4988-bc1a-d0e846e89f70")
    protected  TAppliesTo(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("f2e4a85f-2d7c-4391-be6d-140e6468d523")
    public static final class MdaTypes {
        @objid ("f91add0b-a2d3-429c-a295-feeb555a4e95")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b1a2bb62-5f24-446a-b163-1b59d54b937e")
        private static Stereotype MDAASSOCDEP;

        @objid ("da2503a7-29fb-43c1-8d3b-d66cb9f31907")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("be3dcb09-975b-487c-b0d1-279da74c0bb6")
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

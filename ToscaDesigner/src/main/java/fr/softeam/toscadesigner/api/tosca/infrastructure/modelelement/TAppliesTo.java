/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 12:14 by Modelio Studio.
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
    @objid ("0819f97b-dd22-438c-b575-e4969766d822")
    public static final String STEREOTYPE_NAME = "TAppliesTo";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("0743d958-425a-467f-8748-b3db50229624")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TAppliesTo proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TAppliesTo >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d2b6d21d-9036-4274-ba9d-ba9e024952aa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TAppliesTo.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TAppliesTo.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TAppliesTo >> then instantiate a {@link TAppliesTo} proxy.
     * 
     * @return a {@link TAppliesTo} proxy on the created {@link ModelElement}.
     */
    @objid ("025458d1-d450-49a8-ba0b-3347f5b1aa48")
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
    @objid ("28231cc6-7491-4eb0-912b-62a2bd3a582e")
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
    @objid ("45ec8db2-b9ef-4915-8eba-05f9694d737b")
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
    @objid ("134306f4-2f6a-4fba-bfa7-1cf522109d55")
    public void addNodeTypeReference(final NodeTypeReferenceType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TAppliesTo.MdaTypes.MDAASSOCDEP);
            d.setName("nodeTypeReference");
            d.putTagValue(TAppliesTo.MdaTypes.MDAASSOCDEP_ROLE, "nodeTypeReference");
        }
    }

    @objid ("7758c9b2-2824-4dd5-9c35-f992663cc502")
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
    @objid ("7a16b4f8-29c3-4d6d-9627-7cb38f7fe3fa")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'nodeTypeReference' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7b749fad-06b8-4fc7-8573-83ea9093f1fe")
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

    @objid ("8d3ed50e-cc5f-418b-8164-5fb6a709c932")
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
    @objid ("d99877a3-9893-4c79-8c40-9fe8b14fbf48")
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

    @objid ("09c2a0d9-82e1-4801-a5e2-1aa92e209328")
    protected  TAppliesTo(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("f2e4a85f-2d7c-4391-be6d-140e6468d523")
    public static final class MdaTypes {
        @objid ("a334dec4-3089-431f-bfc4-6bc4699ce4dc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("af4bb526-9f83-4e6d-8885-c8a61306a1aa")
        private static Stereotype MDAASSOCDEP;

        @objid ("456120c8-c0c8-4604-8e36-d384b908668b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bac42a59-0722-46b7-85b3-f8bbd5ab1329")
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

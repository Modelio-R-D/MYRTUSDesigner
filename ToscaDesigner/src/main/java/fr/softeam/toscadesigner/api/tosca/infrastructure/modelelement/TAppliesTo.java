/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
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
@objid ("58def4a1-3c30-4c13-8f07-e9d39974ddd0")
public class TAppliesTo implements IMdaProxy {
    @objid ("ed1a5606-1a45-4680-88ea-6b7228895117")
    public static final String STEREOTYPE_NAME = "TAppliesTo";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("8e430ed6-5b6f-40a4-96cb-1b9e6c346278")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TAppliesTo proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TAppliesTo >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("050fc803-f0e4-4a3f-96f2-0e96140cdb8c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TAppliesTo.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TAppliesTo.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TAppliesTo >> then instantiate a {@link TAppliesTo} proxy.
     * 
     * @return a {@link TAppliesTo} proxy on the created {@link ModelElement}.
     */
    @objid ("ae2403de-a1c5-4896-849c-a7ad2e3ec9ec")
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
    @objid ("a11ea83b-42d9-415e-9603-971fc14fd444")
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
    @objid ("6cdd7de0-5b8c-4ad0-921a-02e23da7599e")
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
    @objid ("e2cc1d8c-4dd5-46db-9fc7-f4891dc27b97")
    public void addNodeTypeReference(final NodeTypeReferenceType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TAppliesTo.MdaTypes.MDAASSOCDEP);
            d.setName("nodeTypeReference");
            d.putTagValue(TAppliesTo.MdaTypes.MDAASSOCDEP_ROLE, "nodeTypeReference");
        }
    }

    @objid ("fdc056a2-b414-4471-8f10-074e37f7714f")
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
    @objid ("c28a4e84-898e-42fd-9f00-7376896bf320")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'nodeTypeReference' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("76da50c1-d2a1-4b11-bfc1-2eb924ea6fc5")
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

    @objid ("c0c4fae1-ecfe-4f4c-8def-04fcb0bd5f9c")
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
    @objid ("56031e27-c98b-4130-b232-cb712adc5ae5")
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

    @objid ("fe5d8cc6-ce4e-49df-87eb-5c5b8b5cdb6c")
    protected  TAppliesTo(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("ac13f9ca-02f3-4721-ac9d-45ca0354482f")
    public static final class MdaTypes {
        @objid ("c825117d-0f23-426b-a45b-ad13f686028b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f9c1d182-3fda-4744-9c57-555c61b1ca2c")
        private static Stereotype MDAASSOCDEP;

        @objid ("27f2f28a-331a-4e21-b618-5769a9940c8f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("34876b78-23d2-4c54-9e25-314144b2ea24")
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

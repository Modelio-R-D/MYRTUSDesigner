/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/10/2024 11:39 by Modelio Studio.
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
    @objid ("8a577405-7c6c-4cc6-85cb-99239b6b37b3")
    public static final String STEREOTYPE_NAME = "TAppliesTo";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("568ff60a-18ba-455b-8299-46869569576e")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TAppliesTo proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TAppliesTo >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b1213e7a-940f-43f6-89e7-db760d926ce0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TAppliesTo.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TAppliesTo.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TAppliesTo >> then instantiate a {@link TAppliesTo} proxy.
     * 
     * @return a {@link TAppliesTo} proxy on the created {@link ModelElement}.
     */
    @objid ("cd175016-25ca-4ead-8b1b-caa6b6b20eed")
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
    @objid ("9598325c-e4ea-478e-9838-551f1b414ab4")
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
    @objid ("e27d68c8-3418-4632-987f-3c3534b12dba")
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
    @objid ("efb72af9-b842-4794-8837-833b0bac2bbe")
    public void addNodeTypeReference(final NodeTypeReferenceType obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TAppliesTo.MdaTypes.MDAASSOCDEP);
            d.setName("nodeTypeReference");
            d.putTagValue(TAppliesTo.MdaTypes.MDAASSOCDEP_ROLE, "nodeTypeReference");
        }
    }

    @objid ("aeb16335-6e5a-4b0b-8f7f-fec9d67c588c")
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
    @objid ("772c16e6-b92a-4b4f-aa56-9e34a2c18b19")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'nodeTypeReference' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("376a8758-b46c-4d4c-9fe6-61aa53eb3a59")
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

    @objid ("0f0b28b0-d15f-46f2-aee5-8717b488792b")
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
    @objid ("3bcd21a7-c4df-48d7-a332-dfbfec356ce8")
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

    @objid ("b1af7f07-697f-4423-9ae4-7ac4520e9a3d")
    protected  TAppliesTo(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("f2e4a85f-2d7c-4391-be6d-140e6468d523")
    public static final class MdaTypes {
        @objid ("a11f61f1-3dad-4e2a-9c2a-87dd85af3f04")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4de3d53b-c348-4e15-ab35-40515d5aeb5f")
        private static Stereotype MDAASSOCDEP;

        @objid ("d3445dc4-1cee-4858-9d53-d701864430ab")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("33655db0-9834-48d4-a619-50e258d092c7")
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

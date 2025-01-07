/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 15:23 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << OutputParametersType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e606956b-fff8-46f5-bdb2-00123399b001")
public class OutputParametersType implements IMdaProxy {
    @objid ("e858f464-206b-40a1-8d68-455eb059ad85")
    public static final String STEREOTYPE_NAME = "OutputParametersType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("c2f069c7-dfee-4197-a5dc-c43a31935f6a")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link OutputParametersType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << OutputParametersType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4e07f16b-f5a7-4e0c-b04f-c6d0a1faed74")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (OutputParametersType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(OutputParametersType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << OutputParametersType >> then instantiate a {@link OutputParametersType} proxy.
     * 
     * @return a {@link OutputParametersType} proxy on the created {@link ModelElement}.
     */
    @objid ("6243104d-358a-4654-b385-c25cb29486bb")
    public static OutputParametersType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(OutputParametersType.MdaTypes.STEREOTYPE_ELT);
        return OutputParametersType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link OutputParametersType} proxy from a {@link ModelElement} stereotyped << OutputParametersType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link OutputParametersType} proxy or <i>null</i>.
     */
    @objid ("b58552fc-31dc-44b2-889c-22e24ef0ddad")
    public static OutputParametersType instantiate(final ModelElement obj) {
        return OutputParametersType.canInstantiate(obj) ? new OutputParametersType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OutputParametersType} proxy from a {@link ModelElement} stereotyped << OutputParametersType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link OutputParametersType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dcfd4178-b6d9-410c-b89d-1b31aff7eb65")
    public static OutputParametersType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (OutputParametersType.canInstantiate(obj))
        	return new OutputParametersType(obj);
        else
        	throw new IllegalArgumentException("OutputParametersType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'outputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d7737f68-76a7-41da-ac68-9848247a542d")
    public void addOutputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), OutputParametersType.MdaTypes.MDAASSOCDEP);
            d.setName("outputParameter");
            d.putTagValue(OutputParametersType.MdaTypes.MDAASSOCDEP_ROLE, "outputParameter");
        }
    }

    @objid ("fbe1a60a-d008-4e8f-8332-1ac2967ac030")
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
        OutputParametersType other = (OutputParametersType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("a68b623f-4d30-4c33-94c2-26e87a09202f")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'outputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c0931289-07b8-448b-96df-8b2b4ef9abd1")
    public List<TParameter> getOutputParameter() {
        List<TParameter> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(OutputParametersType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(OutputParametersType.MdaTypes.MDAASSOCDEP_ROLE), "outputParameter")
              && TParameter.canInstantiate(d.getDependsOn()))
                results.add((TParameter)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TParameter.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8746573c-a92b-4224-8fcb-d980e167e572")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'outputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5c6e36ee-3e0f-49dc-8d74-62f229ee5c6f")
    public boolean removeOutputParameter(final TParameter obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(OutputParametersType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(OutputParametersType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("976697e0-4464-4f72-acc5-5ca45fbfee40")
    protected  OutputParametersType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d80068aa-aa90-4b75-bbee-eba49bdb9d59")
    public static final class MdaTypes {
        @objid ("e29bc105-1dcf-4ee4-a3bf-0192dbf3dd9b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2b024921-1a4f-4124-b81b-c4d4135d6452")
        private static Stereotype MDAASSOCDEP;

        @objid ("3c083890-2174-4bf0-96e7-fd390ae94dea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fb138156-6146-4e81-9c41-615a2df713ca")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "6739ba01-54af-4e32-8266-910cd5590b3d", "OutputParametersType");
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

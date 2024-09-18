/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 12:01 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << OutputParametersType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("17a2e646-8e35-40e4-888a-ff776cbc4bfc")
public class OutputParametersType1 implements IMdaProxy {
    @objid ("58d17541-b55e-4ec0-97ed-c11ceb2aec92")
    public static final String STEREOTYPE_NAME = "OutputParametersType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("87504312-1fe8-4230-88df-0f807c5b70de")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link OutputParametersType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << OutputParametersType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("87cf7023-c426-4fd5-8f0e-c11ce78a6c05")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (OutputParametersType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(OutputParametersType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << OutputParametersType1 >> then instantiate a {@link OutputParametersType1} proxy.
     * 
     * @return a {@link OutputParametersType1} proxy on the created {@link ModelElement}.
     */
    @objid ("007c8dbf-ce60-4018-b6d3-81b4cd711c8c")
    public static OutputParametersType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(OutputParametersType1.MdaTypes.STEREOTYPE_ELT);
        return OutputParametersType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link OutputParametersType1} proxy from a {@link ModelElement} stereotyped << OutputParametersType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link OutputParametersType1} proxy or <i>null</i>.
     */
    @objid ("1b9b4cc1-f40d-49c5-862b-204c778ae05d")
    public static OutputParametersType1 instantiate(final ModelElement obj) {
        return OutputParametersType1.canInstantiate(obj) ? new OutputParametersType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OutputParametersType1} proxy from a {@link ModelElement} stereotyped << OutputParametersType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link OutputParametersType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ddc95d39-8e2d-4fec-b818-97b02cda3342")
    public static OutputParametersType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (OutputParametersType1.canInstantiate(obj))
        	return new OutputParametersType1(obj);
        else
        	throw new IllegalArgumentException("OutputParametersType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'outputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("91d5ca87-4fa6-43e6-8316-59f314496ce6")
    public void addOutputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), OutputParametersType1.MdaTypes.MDAASSOCDEP);
            d.setName("outputParameter");
            d.putTagValue(OutputParametersType1.MdaTypes.MDAASSOCDEP_ROLE, "outputParameter");
        }
    }

    @objid ("5a062469-8b13-42e9-aaee-2e9986c1c49e")
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
        OutputParametersType1 other = (OutputParametersType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("9ff888eb-b582-4482-95a5-5edfbf12f75b")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'outputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("92c0e708-2a10-4208-b63d-7446de544ae7")
    public List<TParameter> getOutputParameter() {
        List<TParameter> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(OutputParametersType1.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(OutputParametersType1.MdaTypes.MDAASSOCDEP_ROLE), "outputParameter")
              && TParameter.canInstantiate(d.getDependsOn()))
                results.add((TParameter)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TParameter.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("89d9b91a-4e12-443d-aea5-2d3a1380847e")
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
    @objid ("9cfca850-53c9-4ad0-b502-9a66eb187a33")
    public boolean removeOutputParameter(final TParameter obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(OutputParametersType1.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(OutputParametersType1.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("48d3f0bd-08a5-454d-ba7d-ba4593c2201d")
    protected  OutputParametersType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("01d304ca-bace-4aa3-bc43-34bd13d30121")
    public static final class MdaTypes {
        @objid ("b5a145ee-7ca1-4234-90a1-4f8adedb8fac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("210e9551-259b-43a5-b7f7-16cf4394f5e0")
        private static Stereotype MDAASSOCDEP;

        @objid ("d9f27ee9-aa3d-4e33-a116-d8629e525a50")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("afdefc4d-b2ad-45a2-8f4f-0b76d49c32ec")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "bf782b29-d6a4-47f4-9948-40b9407bdf86", "OutputParametersType1");
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

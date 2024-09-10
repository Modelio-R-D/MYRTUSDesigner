/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/09/2024 10:28 by Modelio Studio.
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
@objid ("a2945883-1fa5-4bed-8e2b-d518510bc151")
public class OutputParametersType1 implements IMdaProxy {
    @objid ("9429229d-d43c-4bfe-adb7-00a53805f91a")
    public static final String STEREOTYPE_NAME = "OutputParametersType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("27cc34fa-fe0f-461b-a1a5-0eb7c3dcd416")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link OutputParametersType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << OutputParametersType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cba57264-4f0b-488a-9d98-8ec4e03dc619")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (OutputParametersType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(OutputParametersType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << OutputParametersType1 >> then instantiate a {@link OutputParametersType1} proxy.
     * 
     * @return a {@link OutputParametersType1} proxy on the created {@link ModelElement}.
     */
    @objid ("5a45f991-27e1-4fdf-8539-499af2f9d7f6")
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
    @objid ("2c543d19-c01a-45e4-a0d8-bcc5ba3d4c97")
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
    @objid ("1fb9ff1c-1073-40c2-b3d7-cac5efe5755f")
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
    @objid ("07bc1b48-e937-4cbe-9f55-e11b5eda2b23")
    public void addOutputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), OutputParametersType1.MdaTypes.MDAASSOCDEP);
            d.setName("outputParameter");
            d.putTagValue(OutputParametersType1.MdaTypes.MDAASSOCDEP_ROLE, "outputParameter");
        }
    }

    @objid ("1a54b7e3-90d7-4b3b-9112-084141b25d2a")
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
    @objid ("f2bc805d-928c-40d3-83f3-149361dfd82a")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'outputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1b77f15a-0cfc-4114-8e02-9ac3c6b6280c")
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

    @objid ("5a289f04-aa6a-4aba-bc6a-d30c26e73ff2")
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
    @objid ("b0e18495-2009-494a-8732-f5b55da9dd8d")
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

    @objid ("1f54c880-4ed4-4a9d-84a7-376c5a537e7c")
    protected  OutputParametersType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("40c8543b-b69d-4f31-a755-d866d075da12")
    public static final class MdaTypes {
        @objid ("542467b0-3484-4a53-b794-2adc392d7971")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e2fe5b06-8409-421e-944b-3af12a995dc8")
        private static Stereotype MDAASSOCDEP;

        @objid ("1855058b-eff5-456d-9f04-d5a9bb2add58")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("03a184a4-c80a-4644-8e61-dad3e9645ae5")
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

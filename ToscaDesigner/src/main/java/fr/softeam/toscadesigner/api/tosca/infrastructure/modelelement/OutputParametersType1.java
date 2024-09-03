/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 17:56 by Modelio Studio.
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
    @objid ("e209969a-7f5e-4cd7-8854-e2da24250d2b")
    public static final String STEREOTYPE_NAME = "OutputParametersType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("ae67769f-e092-4d83-a193-8cb1e6a57ac3")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link OutputParametersType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << OutputParametersType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a372aa55-a465-47f3-918b-d414caeae329")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (OutputParametersType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(OutputParametersType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << OutputParametersType1 >> then instantiate a {@link OutputParametersType1} proxy.
     * 
     * @return a {@link OutputParametersType1} proxy on the created {@link ModelElement}.
     */
    @objid ("c8765c20-3ff3-49d8-bcc4-bfd6cca1eb4d")
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
    @objid ("e5f7360b-126c-4801-bfe6-0b2dc783de60")
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
    @objid ("dc825777-c857-4038-9056-dd03008d01e0")
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
    @objid ("a9f869e3-7324-428e-8621-07d1fdd20e71")
    public void addOutputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), OutputParametersType1.MdaTypes.MDAASSOCDEP);
            d.setName("outputParameter");
            d.putTagValue(OutputParametersType1.MdaTypes.MDAASSOCDEP_ROLE, "outputParameter");
        }
    }

    @objid ("dbc51df3-35e2-45de-adaa-86aeb1c423d3")
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
    @objid ("53d1dd80-1cdb-428d-8b6d-c55e2bbca83a")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'outputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("86645468-3d1f-494b-aa2f-bd4cd2c5d1bc")
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

    @objid ("514958a2-f01e-499e-b60d-fa610ad5be4a")
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
    @objid ("579bb87f-7363-4931-adc3-49aa81334ce5")
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

    @objid ("cbbda51d-5f29-4576-bd89-1f8c8839703a")
    protected  OutputParametersType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("40c8543b-b69d-4f31-a755-d866d075da12")
    public static final class MdaTypes {
        @objid ("dc7b935d-8a32-47d2-aaed-8ab1ad561b5d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("63883e43-1f26-42f4-b4a1-5744c66f76f1")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ea9f0ec-ddd5-432b-a7a0-8a4c37192735")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("48ef969c-e82a-4553-a972-e3c5e422ac50")
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

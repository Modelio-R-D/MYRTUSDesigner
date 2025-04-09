/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
@objid ("9f54f548-6f05-48df-a341-0dd2ead40b48")
public class OutputParametersType1 implements IMdaProxy {
    @objid ("b8dc48d2-1a7c-41f5-9eeb-0f29651e7b02")
    public static final String STEREOTYPE_NAME = "OutputParametersType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("7a80a302-c627-422d-9ef4-e3e31ee36688")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link OutputParametersType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << OutputParametersType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0da14418-eed2-4565-8548-95ed8975e0dd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (OutputParametersType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(OutputParametersType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << OutputParametersType1 >> then instantiate a {@link OutputParametersType1} proxy.
     * 
     * @return a {@link OutputParametersType1} proxy on the created {@link ModelElement}.
     */
    @objid ("0da51b4e-e7b2-4f36-bd98-e1f1c9975e6f")
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
    @objid ("15a21ef9-b18a-4308-9fd5-1f0509ffa7da")
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
    @objid ("ca32e666-d304-491a-a3ca-2b139ab554af")
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
    @objid ("da89f4bb-3bfb-40d0-aec3-a03b0cce903f")
    public void addOutputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), OutputParametersType1.MdaTypes.MDAASSOCDEP);
            d.setName("outputParameter");
            d.putTagValue(OutputParametersType1.MdaTypes.MDAASSOCDEP_ROLE, "outputParameter");
        }
    }

    @objid ("2b7af9a2-896d-45ff-938e-16c23af24d72")
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
    @objid ("e4cca989-2a75-4ba0-aab4-25d09f182843")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'outputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fc82819c-d2d8-47aa-a9d5-79727c23f38b")
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

    @objid ("ad2623e9-b3d3-4e8d-a70b-c6fefe57fc39")
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
    @objid ("342f9f11-4015-424c-9ad4-7d65c84c4c66")
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

    @objid ("02b0ba9e-f153-4148-a060-13281b474014")
    protected  OutputParametersType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("9a1128d2-afed-4b8a-8c96-7d22fed02a33")
    public static final class MdaTypes {
        @objid ("9d00d4e3-df6c-4721-a098-ad53cea9b454")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("136c63fe-79ea-42a7-96e8-c8619b41d616")
        private static Stereotype MDAASSOCDEP;

        @objid ("46a54196-c3cf-4ff5-9249-4a30999e12a8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("96fde3d3-0c09-45cd-a3ff-1af0bf076332")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 10:12 by Modelio Studio.
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
@objid ("e55befbe-b291-41ef-ab59-eb27755c59ba")
public class OutputParametersType implements IMdaProxy {
    @objid ("b751e6e8-fab5-46f6-90a5-98602c920d29")
    public static final String STEREOTYPE_NAME = "OutputParametersType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("b87cbb52-08d9-47a2-a722-64c8cd40a55f")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link OutputParametersType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << OutputParametersType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("37a044d7-7b39-4c36-87e6-98ae0fa70274")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (OutputParametersType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(OutputParametersType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << OutputParametersType >> then instantiate a {@link OutputParametersType} proxy.
     * 
     * @return a {@link OutputParametersType} proxy on the created {@link ModelElement}.
     */
    @objid ("ea4b2e95-e055-4e35-8d6f-945180aa1b27")
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
    @objid ("6b3947ee-ff76-4d2f-85f3-1483dc224526")
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
    @objid ("e4a7d1f0-262d-42ca-8c85-7a57158e53b8")
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
    @objid ("ed918084-835d-4657-854e-da9d581a260d")
    public void addOutputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), OutputParametersType.MdaTypes.MDAASSOCDEP);
            d.setName("outputParameter");
            d.putTagValue(OutputParametersType.MdaTypes.MDAASSOCDEP_ROLE, "outputParameter");
        }
    }

    @objid ("180057d9-d945-4c35-9f35-5760c8b8ef10")
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
    @objid ("f4c7ee8f-13ab-4ac2-ab16-6adadd82fe2e")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'outputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c3ca0da9-ef56-42c7-bafa-77f125557236")
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

    @objid ("40e90ee9-45c0-4215-bc01-81a49f1132c0")
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
    @objid ("d32af734-bf60-4a25-9123-bea572ebbb22")
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

    @objid ("4767a04d-8ba6-4a46-b449-c8249d668e57")
    protected  OutputParametersType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("8912c5ce-d35b-4ad5-bbf0-86b81edd2d4f")
    public static final class MdaTypes {
        @objid ("85a37bae-afa6-4f08-9623-6e6a7e193824")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ee578a90-679d-453e-9171-c42ac125ff0d")
        private static Stereotype MDAASSOCDEP;

        @objid ("e28972a8-f56f-47d3-bb69-7b4d4672b460")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9f83a12b-d6ee-44d2-9aee-280f24af8031")
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

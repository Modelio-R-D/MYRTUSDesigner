/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
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
    @objid ("282b8e4a-9988-479a-aa91-bc5921037928")
    public static final String STEREOTYPE_NAME = "OutputParametersType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("4a9f6de9-e621-4478-a1a1-1a852a251953")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link OutputParametersType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << OutputParametersType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("955bdf96-b84e-4ec5-a874-6a1472679075")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (OutputParametersType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(OutputParametersType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << OutputParametersType >> then instantiate a {@link OutputParametersType} proxy.
     * @return a {@link OutputParametersType} proxy on the created {@link ModelElement}.
     */
    @objid ("6675e020-61d2-4b7b-8a03-2335a3978954")
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
    @objid ("0df2967c-24c6-4f7e-9ce1-0d23b1340c17")
    public static OutputParametersType instantiate(final ModelElement obj) {
        return OutputParametersType.canInstantiate(obj) ? new OutputParametersType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OutputParametersType} proxy from a {@link ModelElement} stereotyped << OutputParametersType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link OutputParametersType} proxy.
     */
    @objid ("f4c7a9fa-d30e-435d-9e80-679b51719451")
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
     */
    @objid ("c6d0127d-d197-4038-893f-caed76eddeef")
    public void addOutputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), OutputParametersType.MdaTypes.MDAASSOCDEP);
            d.setName("outputParameter");
            d.putTagValue(OutputParametersType.MdaTypes.MDAASSOCDEP_ROLE, "outputParameter");
        }
    }

    @objid ("e58e4ed0-4aad-4df2-bb5e-63c649905fa5")
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
    @objid ("6517708e-8c74-45d5-8477-73ec3d60e033")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'outputParameter' role.<p>
     * Role description:
     * null
     */
    @objid ("d580d0a1-2eb5-4fc6-88f0-5c49910b75ba")
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

    @objid ("52c96277-e225-4b24-a8d3-95a3da3b6eca")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'outputParameter' role.<p>
     * Role description:
     * null
     */
    @objid ("51217e0d-1444-4a57-b3a1-537731302770")
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

    @objid ("a7dda32e-17be-4a73-8035-536676ec02e8")
    protected  OutputParametersType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d80068aa-aa90-4b75-bbee-eba49bdb9d59")
    public static final class MdaTypes {
        @objid ("0c7894af-2217-4f37-9944-05a18bbeb971")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e71416db-b3a9-4122-b6a9-469587a7fab6")
        private static Stereotype MDAASSOCDEP;

        @objid ("f10ac87f-262a-499d-b4ca-9b666b3c6bd7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ed328940-fa25-4d35-a3c5-cfc5c68eb808")
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

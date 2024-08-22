/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 16:27 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << InputParametersType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("36bbca75-14c1-4ec4-b515-6d50ce057853")
public class InputParametersType implements IMdaProxy {
    @objid ("196390e0-6361-4d6e-b163-aef79d03cd40")
    public static final String STEREOTYPE_NAME = "InputParametersType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("d6c4866a-ed0b-4ad7-9b4f-79c07e21d0f4")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InputParametersType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InputParametersType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b6d656ad-7a27-4bec-b86b-9a21e076f578")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InputParametersType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InputParametersType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InputParametersType >> then instantiate a {@link InputParametersType} proxy.
     * @return a {@link InputParametersType} proxy on the created {@link ModelElement}.
     */
    @objid ("8343c1de-36a3-4b76-b74d-fda3bbd8ce56")
    public static InputParametersType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(InputParametersType.MdaTypes.STEREOTYPE_ELT);
        return InputParametersType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link InputParametersType} proxy from a {@link ModelElement} stereotyped << InputParametersType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link InputParametersType} proxy or <i>null</i>.
     */
    @objid ("739a39b7-44f3-46f9-a1c8-ef21cc3bd417")
    public static InputParametersType instantiate(final ModelElement obj) {
        return InputParametersType.canInstantiate(obj) ? new InputParametersType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InputParametersType} proxy from a {@link ModelElement} stereotyped << InputParametersType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link InputParametersType} proxy.
     */
    @objid ("e75c3c03-a1d9-4fcf-896c-e77c7d292974")
    public static InputParametersType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (InputParametersType.canInstantiate(obj))
            return new InputParametersType(obj);
        else
            throw new IllegalArgumentException("InputParametersType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'inputParameter' role.<p>
     * Role description:
     * null
     */
    @objid ("b3f985c8-d345-46e6-9395-9457894d2886")
    public void addInputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InputParametersType.MdaTypes.MDAASSOCDEP);
            d.setName("inputParameter");
            d.putTagValue(InputParametersType.MdaTypes.MDAASSOCDEP_ROLE, "inputParameter");
        }
    }

    @objid ("c9b96e7e-6f90-419a-8042-74ab7c10d212")
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
        InputParametersType other = (InputParametersType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("f7f1d0a6-8219-4b93-a503-360f38cd25a3")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'inputParameter' role.<p>
     * Role description:
     * null
     */
    @objid ("c8294e14-9e4a-4104-a0f3-c6b490c44838")
    public List<TParameter> getInputParameter() {
        List<TParameter> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(InputParametersType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(InputParametersType.MdaTypes.MDAASSOCDEP_ROLE), "inputParameter")
              && TParameter.canInstantiate(d.getDependsOn()))
                results.add((TParameter)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TParameter.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c6f4ee43-ce2b-4290-b602-807fb896eb06")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'inputParameter' role.<p>
     * Role description:
     * null
     */
    @objid ("9048b40c-18ea-4f6a-ba22-60c3db34d6a8")
    public boolean removeInputParameter(final TParameter obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(InputParametersType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(InputParametersType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("3f444346-5ebd-47b8-ba6c-a599714e8ca1")
    protected  InputParametersType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("8bf600ba-ef41-477f-927b-6810cea27c90")
    public static final class MdaTypes {
        @objid ("9e8cd94e-973b-4ac6-8f1e-2e97272aae2e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("337c6f95-c091-4faa-9f20-4b45cc0e39bf")
        private static Stereotype MDAASSOCDEP;

        @objid ("964b2190-2f49-43a2-b989-2f8f2ad58244")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0b561521-f6fc-48b8-8801-8c1458aec427")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "66b7f6c7-ee96-4ac8-b237-080d783ac040", "InputParametersType");
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

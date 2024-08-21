/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 11:15 by Modelio Studio.
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
@objid ("24fcdbc0-90a3-4436-8852-029897e4d36c")
public class OutputParametersType implements IMdaProxy {
    @objid ("c8b94a04-15aa-4162-91f9-7196b8dcf90d")
    public static final String STEREOTYPE_NAME = "OutputParametersType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("0ff939ff-db0f-4f7a-aac3-9d6effb72229")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link OutputParametersType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << OutputParametersType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("96758a37-eef9-460e-8038-ea19edc3444e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (OutputParametersType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(OutputParametersType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << OutputParametersType >> then instantiate a {@link OutputParametersType} proxy.
     * 
     * @return a {@link OutputParametersType} proxy on the created {@link ModelElement}.
     */
    @objid ("0c0664bd-ea7c-46a7-805a-1c42ce943555")
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
    @objid ("95cdf11d-9489-4933-a7d5-b9a56fbdfdc8")
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
    @objid ("7c7c654c-b5a5-40f0-90da-fc23182f9d63")
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
    @objid ("af9be36c-35bf-497c-9afa-f7830a211522")
    public void addOutputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), OutputParametersType.MdaTypes.MDAASSOCDEP);
            d.setName("outputParameter");
            d.putTagValue(OutputParametersType.MdaTypes.MDAASSOCDEP_ROLE, "outputParameter");
        }
    }

    @objid ("7954f02d-4914-4e99-b053-1133d0c31bf9")
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
    @objid ("0095630c-1153-4e69-9215-0c74819fb3ba")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'outputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("315da625-9b77-4d4a-8855-0120a2e33dd7")
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

    @objid ("6f159d6c-cfdd-4c85-83bb-aa048ed917f3")
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
    @objid ("ab7d72e0-f63f-4372-a138-077f1d01bced")
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

    @objid ("caa40f87-268f-4ba2-9dc1-b1579d1a7cc4")
    protected  OutputParametersType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("ca00e84f-6348-4928-90db-7ea8e672f5ef")
    public static final class MdaTypes {
        @objid ("4b7470ba-2547-4eed-aab0-f8db946f837a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("264900bc-600a-4680-bc8a-2fb884ee8d8d")
        private static Stereotype MDAASSOCDEP;

        @objid ("d340f04b-236e-465f-9ee2-77a917201a52")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b272c8b3-101a-48f5-8f0c-6b16a6a21387")
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

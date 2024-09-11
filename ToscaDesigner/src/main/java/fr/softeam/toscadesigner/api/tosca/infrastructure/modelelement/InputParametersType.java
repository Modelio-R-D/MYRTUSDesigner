/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 14:25 by Modelio Studio.
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
@objid ("57025e67-7465-4ff9-8e38-c07dfc73dec6")
public class InputParametersType implements IMdaProxy {
    @objid ("f9ca1646-8cf9-4cd8-9dff-633b7a5d2c28")
    public static final String STEREOTYPE_NAME = "InputParametersType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("747b6182-2f2d-4c3e-99ec-d54728ad6cde")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InputParametersType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InputParametersType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6ffa5d19-1f31-429e-8e47-2776e295df74")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InputParametersType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InputParametersType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InputParametersType >> then instantiate a {@link InputParametersType} proxy.
     * 
     * @return a {@link InputParametersType} proxy on the created {@link ModelElement}.
     */
    @objid ("8da7e629-64e2-4837-a020-d7abe252f1f2")
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
    @objid ("4d8a2209-edc6-4c4d-9142-dd20cdbc5849")
    public static InputParametersType instantiate(final ModelElement obj) {
        return InputParametersType.canInstantiate(obj) ? new InputParametersType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InputParametersType} proxy from a {@link ModelElement} stereotyped << InputParametersType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link InputParametersType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d33cc5e8-c29c-4de6-9f98-9545a2bb9d85")
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
     * 
     */
    @objid ("11502ba8-6a92-40e6-ba9f-8d27db9a59f0")
    public void addInputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InputParametersType.MdaTypes.MDAASSOCDEP);
            d.setName("inputParameter");
            d.putTagValue(InputParametersType.MdaTypes.MDAASSOCDEP_ROLE, "inputParameter");
        }
    }

    @objid ("21215aa7-b2cb-4952-a796-2043c6d3cb33")
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
    @objid ("bfb38583-5746-481a-9be7-794667f4d6d5")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'inputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8acb8fff-a7ff-43d8-8e34-27f920c16dc3")
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

    @objid ("89bd75ba-1b57-4a3b-a185-24569d7cc2ab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'inputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("22ab1f2d-4650-4f81-8159-86c520221537")
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

    @objid ("13710add-46ae-4db4-a0f5-4b0af9eed4a0")
    protected  InputParametersType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("b6dcefb6-c4eb-495d-840a-9e71e3a4fa50")
    public static final class MdaTypes {
        @objid ("6121ac96-f773-452a-879c-63d74df69e98")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("63816c26-0423-4ace-91ee-b895b259b147")
        private static Stereotype MDAASSOCDEP;

        @objid ("9271113d-48bc-4b41-82f9-5cd0304d7c26")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e65c2b42-db97-4921-a55f-9a658ac89e11")
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

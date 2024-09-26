/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/09/2024 11:42 by Modelio Studio.
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
    @objid ("321b8b3f-659e-4ced-a172-303c9e9c7a0d")
    public static final String STEREOTYPE_NAME = "OutputParametersType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("74953a81-2976-4ee0-8246-b3bd1e1aad66")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link OutputParametersType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << OutputParametersType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("08013dea-ad18-4244-bba1-279fbb8a3128")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (OutputParametersType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(OutputParametersType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << OutputParametersType >> then instantiate a {@link OutputParametersType} proxy.
     * 
     * @return a {@link OutputParametersType} proxy on the created {@link ModelElement}.
     */
    @objid ("d5ce08f2-27e2-4973-9dc0-b68c1fb8cd8f")
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
    @objid ("6694869a-8a61-4795-a48f-2d6d7200ea23")
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
    @objid ("65735c70-c644-4e64-9c45-38c8dd580f8f")
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
    @objid ("d81d1b21-5faf-4cc4-9585-00b323c5c7d3")
    public void addOutputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), OutputParametersType.MdaTypes.MDAASSOCDEP);
            d.setName("outputParameter");
            d.putTagValue(OutputParametersType.MdaTypes.MDAASSOCDEP_ROLE, "outputParameter");
        }
    }

    @objid ("612b11ad-df1f-481b-95d9-93d9a4bc2ce9")
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
    @objid ("7c5c13f6-6924-4b3a-ab40-1697a6185c42")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'outputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9c00ec27-1db7-4da8-bddc-ac4da16db8fe")
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

    @objid ("315418c3-a620-405c-9680-4590626be818")
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
    @objid ("d13c8f77-7bdb-4379-9e47-72475fe0df5a")
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

    @objid ("9b4da0ae-2d28-4ba7-8073-0609ffabb986")
    protected  OutputParametersType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("d80068aa-aa90-4b75-bbee-eba49bdb9d59")
    public static final class MdaTypes {
        @objid ("82eadd19-e7b0-4cc5-bcf5-599f961fec2c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9d53c4c9-4cf4-4fe4-a984-bcdc797b6d77")
        private static Stereotype MDAASSOCDEP;

        @objid ("13f8b905-13f3-49b6-b77e-b83352738913")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ed751002-1087-4c18-b7ca-72773b38818b")
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

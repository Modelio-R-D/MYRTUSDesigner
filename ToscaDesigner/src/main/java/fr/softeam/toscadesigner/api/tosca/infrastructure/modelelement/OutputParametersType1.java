/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/10/2024 11:40 by Modelio Studio.
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
    @objid ("055be277-6092-470c-acb4-7443e2bf25fe")
    public static final String STEREOTYPE_NAME = "OutputParametersType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("97f692f4-c5a0-49e6-b027-44bbacf44fc8")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link OutputParametersType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << OutputParametersType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("019c5550-e816-4937-a0e6-b75b2ac22f2d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (OutputParametersType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(OutputParametersType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << OutputParametersType1 >> then instantiate a {@link OutputParametersType1} proxy.
     * 
     * @return a {@link OutputParametersType1} proxy on the created {@link ModelElement}.
     */
    @objid ("447bdba7-6d71-49c3-8967-cf99834912ce")
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
    @objid ("b0f6a97c-64c4-46f3-ac5e-6b6bfd87c4e0")
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
    @objid ("d8baa606-dc1e-4a5f-95a4-b79ce3a311f9")
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
    @objid ("5061b9e3-21aa-47db-baf7-7120303f4e46")
    public void addOutputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), OutputParametersType1.MdaTypes.MDAASSOCDEP);
            d.setName("outputParameter");
            d.putTagValue(OutputParametersType1.MdaTypes.MDAASSOCDEP_ROLE, "outputParameter");
        }
    }

    @objid ("564761d7-531f-4127-b8d7-95627de2b875")
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
    @objid ("a96a2301-31f6-4be8-90b2-cfc303a9328b")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'outputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0aba2aca-e4af-45be-a28f-69e7a3456e9f")
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

    @objid ("39dc7e38-e27b-4bd0-a926-1eca10b48853")
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
    @objid ("d043218c-ff38-4db1-a537-234f2da2b8e9")
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

    @objid ("71265c1a-c2ac-4e0d-a14b-dc773808d959")
    protected  OutputParametersType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("01d304ca-bace-4aa3-bc43-34bd13d30121")
    public static final class MdaTypes {
        @objid ("cb547e12-f7d8-4d5d-a9aa-12564d398f22")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("25cd0301-5a1a-4a6f-9245-78cbe9dd2bef")
        private static Stereotype MDAASSOCDEP;

        @objid ("66119fc0-e51d-4d48-a292-aee5667aaff8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("aad3e8cf-fdec-4028-bbf4-5e58a93a1df0")
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

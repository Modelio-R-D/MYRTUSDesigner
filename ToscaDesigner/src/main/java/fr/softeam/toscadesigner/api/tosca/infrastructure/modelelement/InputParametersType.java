/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 20/08/2024 17:06 by Modelio Studio.
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
    @objid ("26ccbdd7-61ce-4a2c-9f28-a8e4c54dd25f")
    public static final String STEREOTYPE_NAME = "InputParametersType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("d6fa9840-cc50-472d-a9b3-47b9e7b7f5a5")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InputParametersType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InputParametersType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c4342723-2d42-45d4-8e8c-eeb51bb0a0d9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InputParametersType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InputParametersType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InputParametersType >> then instantiate a {@link InputParametersType} proxy.
     * 
     * @return a {@link InputParametersType} proxy on the created {@link ModelElement}.
     */
    @objid ("50e702a7-5d2f-496f-9ceb-48c91c19fd4f")
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
    @objid ("68c7bc91-47c4-459c-bbee-eae2eef756b6")
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
    @objid ("3cba87f9-63ce-4b2f-9312-fc3e6b807001")
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
    @objid ("3ff1dc1e-a4f0-4bf8-8dcd-e178a69ca985")
    public void addInputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InputParametersType.MdaTypes.MDAASSOCDEP);
            d.setName("inputParameter");
            d.putTagValue(InputParametersType.MdaTypes.MDAASSOCDEP_ROLE, "inputParameter");
        }
    }

    @objid ("8e46528e-1481-40a6-b5ef-30cfafb3ec42")
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
    @objid ("2b5e5068-50ff-4a55-81da-7de08fdebd42")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'inputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("56c98ab6-c70f-46bd-92b1-64ec9036483c")
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

    @objid ("24912301-40b4-420f-bfcd-50320fd03991")
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
    @objid ("a06345f3-d649-4f72-b30e-740226be55fd")
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

    @objid ("c27547cd-1f70-4d39-8cae-b80c24928f4b")
    protected  InputParametersType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("8bf600ba-ef41-477f-927b-6810cea27c90")
    public static final class MdaTypes {
        @objid ("8595621c-9907-4e3d-b5c7-a25e77e3c039")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2605c4e4-4f9f-4dc9-ab42-b3c1c7abbd0d")
        private static Stereotype MDAASSOCDEP;

        @objid ("b4664e77-899e-4346-b8ee-fccc0f7fd8b9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("622c3b0b-df9d-4685-8062-246d1ab9395b")
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

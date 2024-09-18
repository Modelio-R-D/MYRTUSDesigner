/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 13:03 by Modelio Studio.
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
    @objid ("b859d64a-4053-4f5a-a0fd-1b3c7dcd28d6")
    public static final String STEREOTYPE_NAME = "InputParametersType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("17a810ab-27c6-4b54-b8c1-d77591cdb885")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InputParametersType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InputParametersType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b79ae22f-2a47-4abf-86f3-8d7b2547bfad")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InputParametersType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InputParametersType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InputParametersType >> then instantiate a {@link InputParametersType} proxy.
     * 
     * @return a {@link InputParametersType} proxy on the created {@link ModelElement}.
     */
    @objid ("96714a12-2f2d-4de3-940c-1240b98ea958")
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
    @objid ("2bdab2fc-2d99-46dd-8aaa-5d5d9306bc86")
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
    @objid ("7b2003ae-6862-4872-8cb4-ed2e293b46c2")
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
    @objid ("5463c8ed-b921-424b-8fbb-512e78daf8f0")
    public void addInputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InputParametersType.MdaTypes.MDAASSOCDEP);
            d.setName("inputParameter");
            d.putTagValue(InputParametersType.MdaTypes.MDAASSOCDEP_ROLE, "inputParameter");
        }
    }

    @objid ("58b718e6-f2aa-4cb3-b09e-5037fbb3ac6b")
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
    @objid ("7e522d4f-3254-4d72-bf67-fc4efce5ba7a")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'inputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fe8e41ed-397b-4954-9224-ca9f38f14a4b")
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

    @objid ("71154e71-4687-4303-9c60-8aa9103925d7")
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
    @objid ("f3cbc2b6-271f-4ca9-a117-055bda56635d")
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

    @objid ("4d687739-db6d-4d7a-8ae1-a59a8f0e1f6b")
    protected  InputParametersType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("b6dcefb6-c4eb-495d-840a-9e71e3a4fa50")
    public static final class MdaTypes {
        @objid ("2280ebe0-4b40-4088-bb31-5427208520e7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a7187afb-55b9-4b25-9728-287fc629bfba")
        private static Stereotype MDAASSOCDEP;

        @objid ("c4376358-a70f-4dff-ab00-89d7a69a715f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ce7bd757-b2a7-465a-a1c2-e538d8055ac2")
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

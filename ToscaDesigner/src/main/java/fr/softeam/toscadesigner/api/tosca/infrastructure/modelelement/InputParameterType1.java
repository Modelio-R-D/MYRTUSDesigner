/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 23/09/2024 12:50 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << InputParameterType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e7d4b16c-245f-4f36-959c-e26254369b59")
public class InputParameterType1 implements IMdaProxy {
    @objid ("0654b7b0-af7a-46b5-94c4-9be61727d1d2")
    public static final String STEREOTYPE_NAME = "InputParameterType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("02f10301-1315-4f92-a52e-4fcae78b0c22")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InputParameterType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InputParameterType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("572feda7-e7e2-48e1-b8a0-584ac5504b4d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InputParameterType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InputParameterType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InputParameterType1 >> then instantiate a {@link InputParameterType1} proxy.
     * 
     * @return a {@link InputParameterType1} proxy on the created {@link ModelElement}.
     */
    @objid ("100e70aa-c272-4df9-9ab2-815ebe09da46")
    public static InputParameterType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(InputParameterType1.MdaTypes.STEREOTYPE_ELT);
        return InputParameterType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link InputParameterType1} proxy from a {@link ModelElement} stereotyped << InputParameterType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link InputParameterType1} proxy or <i>null</i>.
     */
    @objid ("942fc7d3-45a3-4a30-9ab6-6c5f5a528a94")
    public static InputParameterType1 instantiate(final ModelElement obj) {
        return InputParameterType1.canInstantiate(obj) ? new InputParameterType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InputParameterType1} proxy from a {@link ModelElement} stereotyped << InputParameterType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link InputParameterType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f4569984-c74a-4dc1-935a-3dd26ddf8613")
    public static InputParameterType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (InputParameterType1.canInstantiate(obj))
        	return new InputParameterType1(obj);
        else
        	throw new IllegalArgumentException("InputParameterType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'inputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5bdad3fb-5412-4326-a333-2b04e2e2ff0b")
    public void addInputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InputParameterType1.MdaTypes.MDAASSOCDEP);
            d.setName("inputParameter");
            d.putTagValue(InputParameterType1.MdaTypes.MDAASSOCDEP_ROLE, "inputParameter");
        }
    }

    @objid ("8d8ba7b4-149d-4d5b-adf0-dbe308587bb0")
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
        InputParameterType1 other = (InputParameterType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("b84a2828-3f27-4507-bd34-5c59855c858d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'inputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("64a1e630-f11e-4532-b640-06d2b3ff6df9")
    public List<TParameter> getInputParameter() {
        List<TParameter> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(InputParameterType1.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(InputParameterType1.MdaTypes.MDAASSOCDEP_ROLE), "inputParameter")
              && TParameter.canInstantiate(d.getDependsOn()))
                results.add((TParameter)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TParameter.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0c01bdac-384c-4b5a-a43e-e42abf1f807e")
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
    @objid ("c2592452-61e2-4679-bedc-87e22855dd61")
    public boolean removeInputParameter(final TParameter obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(InputParameterType1.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(InputParameterType1.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("b559eabc-e501-4a92-a350-9b05968fe37f")
    protected  InputParameterType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("82d69c92-eb56-45a7-8713-9368376ad71c")
    public static final class MdaTypes {
        @objid ("594fac61-a9be-43ff-a94b-a938eb9c4e40")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d55f2128-2b5a-4bf0-9ce8-4f584478dbf1")
        private static Stereotype MDAASSOCDEP;

        @objid ("d287c508-bd1c-408a-83af-865b9bee8010")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f860eba3-cee1-4c11-947f-da3a054540c1")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "0040822d-cb93-4dd2-b017-32c0ee5b13dc", "InputParameterType1");
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

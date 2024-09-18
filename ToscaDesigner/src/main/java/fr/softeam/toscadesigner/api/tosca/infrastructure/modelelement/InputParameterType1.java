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
 * Proxy class to handle a {@link ModelElement} with << InputParameterType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e7d4b16c-245f-4f36-959c-e26254369b59")
public class InputParameterType1 implements IMdaProxy {
    @objid ("86c8d676-1468-48c0-8033-2f7b2c0dec00")
    public static final String STEREOTYPE_NAME = "InputParameterType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("4ba5617e-a59d-46e2-85b5-751abed35063")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InputParameterType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InputParameterType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("65b56edf-3d21-45a1-80cb-f7e4f21207bd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InputParameterType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InputParameterType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InputParameterType1 >> then instantiate a {@link InputParameterType1} proxy.
     * 
     * @return a {@link InputParameterType1} proxy on the created {@link ModelElement}.
     */
    @objid ("032456be-ee4a-4daa-b63a-827f091bd54e")
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
    @objid ("acddd426-abf2-46c3-a295-0ebddffad034")
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
    @objid ("fe3cefad-b611-48c6-a087-10473d8d4179")
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
    @objid ("62bd49eb-2bd6-4707-8854-4a2a522d2acc")
    public void addInputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InputParameterType1.MdaTypes.MDAASSOCDEP);
            d.setName("inputParameter");
            d.putTagValue(InputParameterType1.MdaTypes.MDAASSOCDEP_ROLE, "inputParameter");
        }
    }

    @objid ("39b0999f-3e99-416e-a11e-843c713e931d")
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
    @objid ("bbf40ce0-0f8d-4b7a-805a-f8d1ff6f84cf")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'inputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2e8f8808-49e6-448c-a59e-cd12da986898")
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

    @objid ("f9d6f1e9-7a4b-4c79-82b2-c04ac9752544")
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
    @objid ("caff3191-ed6c-4ee1-b52a-068f54635a0f")
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

    @objid ("d535e2af-a399-462b-9bcf-57d387c3cd96")
    protected  InputParameterType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("82d69c92-eb56-45a7-8713-9368376ad71c")
    public static final class MdaTypes {
        @objid ("4a068c86-9d7a-484d-8357-4cd6b4194cfc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("17c79579-f874-4f4e-96a2-914c78675236")
        private static Stereotype MDAASSOCDEP;

        @objid ("f7fb6f40-827b-482c-944e-c772d76ddcfc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e7496410-5b2d-498d-8cfd-4a8dbcb3a12f")
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

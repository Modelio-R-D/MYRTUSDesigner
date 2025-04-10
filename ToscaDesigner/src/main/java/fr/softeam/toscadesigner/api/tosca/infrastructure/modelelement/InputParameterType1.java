/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 10:12 by Modelio Studio.
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
@objid ("8e6e07fb-081f-4332-a427-68578fc99a10")
public class InputParameterType1 implements IMdaProxy {
    @objid ("48cc5e61-67b2-497e-a2f7-0b43b2c1980d")
    public static final String STEREOTYPE_NAME = "InputParameterType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6fd16a9b-5425-4223-8a3d-fa47ec245982")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InputParameterType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InputParameterType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a97c22b6-fbc8-4a56-b8eb-2b16969af44e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InputParameterType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InputParameterType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InputParameterType1 >> then instantiate a {@link InputParameterType1} proxy.
     * 
     * @return a {@link InputParameterType1} proxy on the created {@link ModelElement}.
     */
    @objid ("52b83cfd-e6ee-4be0-85f9-160f37b53e4d")
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
    @objid ("5d928ff9-e77e-4aaf-b50f-9be1df444bd6")
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
    @objid ("46c5a90d-2ceb-4eff-99da-d1c60c85a37b")
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
    @objid ("06f3e23f-59f9-4462-bd93-324091e54d22")
    public void addInputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InputParameterType1.MdaTypes.MDAASSOCDEP);
            d.setName("inputParameter");
            d.putTagValue(InputParameterType1.MdaTypes.MDAASSOCDEP_ROLE, "inputParameter");
        }
    }

    @objid ("b1e9dbaa-89d8-4998-9c4f-9c9e0230ef27")
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
    @objid ("d2ecc844-f9f7-44e7-9a69-f8d8ea07b251")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'inputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e95cd382-c682-4418-a915-dfe88058923a")
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

    @objid ("2fea3863-c2fc-48c8-b965-189f4b1b05a1")
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
    @objid ("a3c15729-c483-40db-9db1-31e8ad00d3c7")
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

    @objid ("d60d04ed-0cc6-429a-9624-ac1d3d3e6fb6")
    protected  InputParameterType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("5365c399-0ac3-4db2-af74-ccbf13d6d01e")
    public static final class MdaTypes {
        @objid ("f9bdbc2f-1cdf-42cc-8716-a6417d1bafc8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4683c0af-da32-44db-8a13-6ec44455bee9")
        private static Stereotype MDAASSOCDEP;

        @objid ("df9082bb-025f-445e-89fd-ff8f6bac39a7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f0716b21-6115-4ba3-855f-8b2e2eeec500")
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

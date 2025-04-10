/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:52 by Modelio Studio.
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
    @objid ("d231294b-7725-43d1-b5cc-5641ae5dc177")
    public static final String STEREOTYPE_NAME = "InputParameterType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("9f969a78-d0ba-4300-bfc8-9b1af0d0f2f8")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InputParameterType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InputParameterType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("31bd7c84-4257-4266-9232-e6df85b43c4d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InputParameterType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InputParameterType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InputParameterType1 >> then instantiate a {@link InputParameterType1} proxy.
     * 
     * @return a {@link InputParameterType1} proxy on the created {@link ModelElement}.
     */
    @objid ("c0c25b1d-5619-4182-8ef8-ade2720831be")
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
    @objid ("7f90f74b-877d-46c3-b31c-5732645b0018")
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
    @objid ("9fa45ba5-b168-4c71-975f-661cbb378d9a")
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
    @objid ("24c2a0d2-af8a-4f6b-aee0-a4b07b3ec515")
    public void addInputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InputParameterType1.MdaTypes.MDAASSOCDEP);
            d.setName("inputParameter");
            d.putTagValue(InputParameterType1.MdaTypes.MDAASSOCDEP_ROLE, "inputParameter");
        }
    }

    @objid ("eafb688c-6b40-47c5-bd44-bbb57409f558")
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
    @objid ("9e0e9d38-e82c-43cb-8d6b-a6ecc17a0a3e")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'inputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1adaf1c3-3ecd-4230-a1b3-62989deaf686")
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

    @objid ("f6d87c76-f472-45b2-8c9e-825f42e3fd4c")
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
    @objid ("c65098da-f749-4f3d-ae0b-b968b679bb75")
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

    @objid ("f6e1f555-5947-42c3-a5f8-429aec933360")
    protected  InputParameterType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("5365c399-0ac3-4db2-af74-ccbf13d6d01e")
    public static final class MdaTypes {
        @objid ("7859019a-2b60-4a5d-9f1a-77d8d6bc0785")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("24624199-d9fc-48ea-a136-e86b073834d9")
        private static Stereotype MDAASSOCDEP;

        @objid ("21cdcf56-643e-4eac-aad0-3ca9050f695c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0085a76f-e261-4981-ab5f-fc53e1b20ea4")
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

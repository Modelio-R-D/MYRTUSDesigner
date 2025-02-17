/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 15:39 by Modelio Studio.
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
    @objid ("d46e2621-f9d0-4695-a859-ecbbf27ae4a2")
    public static final String STEREOTYPE_NAME = "InputParameterType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("d35f2dec-dbcd-425f-9fbe-6fa33d3d0430")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InputParameterType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InputParameterType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("96417a36-171e-4fdb-9932-d9fedca32335")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InputParameterType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InputParameterType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InputParameterType1 >> then instantiate a {@link InputParameterType1} proxy.
     * 
     * @return a {@link InputParameterType1} proxy on the created {@link ModelElement}.
     */
    @objid ("3d25e289-cbad-4388-b056-50f11af39046")
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
    @objid ("01fe0474-8dbc-4b52-bea5-232472e1156b")
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
    @objid ("2c0e8fdf-6862-45df-8843-0b1659f8dca7")
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
    @objid ("641041a2-fa1c-4e72-aa3c-961edf38ae6d")
    public void addInputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InputParameterType1.MdaTypes.MDAASSOCDEP);
            d.setName("inputParameter");
            d.putTagValue(InputParameterType1.MdaTypes.MDAASSOCDEP_ROLE, "inputParameter");
        }
    }

    @objid ("af4289b8-1611-447c-962a-6b8c933c02fb")
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
    @objid ("f900df3d-c480-4fd5-9bc2-ed98f9b8aae5")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'inputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0b3caaf7-fb4d-4516-bf3d-c5868c748225")
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

    @objid ("f460b94c-d601-41fd-a8af-188798d24f25")
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
    @objid ("65caed60-7357-480d-8938-30e2b93801ee")
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

    @objid ("4017beb7-328d-4970-8eb4-1ccfdab6764c")
    protected  InputParameterType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("5365c399-0ac3-4db2-af74-ccbf13d6d01e")
    public static final class MdaTypes {
        @objid ("8aaa79c6-4c75-432d-9fef-660dc675d926")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d3b77932-532d-48cb-b67d-5e54392c30b8")
        private static Stereotype MDAASSOCDEP;

        @objid ("2442d980-7e05-4586-80d4-42bf8dceec18")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("02192a8f-4a63-42ab-9a9f-7160159f5414")
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

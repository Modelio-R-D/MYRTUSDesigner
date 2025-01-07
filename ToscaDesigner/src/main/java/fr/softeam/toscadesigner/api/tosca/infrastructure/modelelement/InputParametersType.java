/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 15:23 by Modelio Studio.
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
    @objid ("ccd549ff-e668-463c-b6d2-7d171ee5961d")
    public static final String STEREOTYPE_NAME = "InputParametersType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6a011260-10a2-48b9-8b3a-8588ab43c477")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InputParametersType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InputParametersType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1d18be9d-f9cd-459f-9510-d41fa2491318")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InputParametersType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InputParametersType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InputParametersType >> then instantiate a {@link InputParametersType} proxy.
     * 
     * @return a {@link InputParametersType} proxy on the created {@link ModelElement}.
     */
    @objid ("f2475bbe-c593-44ff-940d-5f53098671f0")
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
    @objid ("7f3c4429-3d97-4c33-8b9e-05f11ee0f5ef")
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
    @objid ("77f72ab7-411b-46c7-a1f4-0250f0cbc4f8")
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
    @objid ("aa997cdb-c7e8-469c-930c-59ad23e682ab")
    public void addInputParameter(final TParameter obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InputParametersType.MdaTypes.MDAASSOCDEP);
            d.setName("inputParameter");
            d.putTagValue(InputParametersType.MdaTypes.MDAASSOCDEP_ROLE, "inputParameter");
        }
    }

    @objid ("a2ca9cbc-a9a7-4cf5-897a-74bba95a5d22")
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
    @objid ("b4f55b16-fab2-4eb7-8c9c-c762fcda4d0d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'inputParameter' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4b27e7f9-25f9-44bc-a579-fe214244e54f")
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

    @objid ("3b32fcd4-f67d-417c-b6db-7850652b3191")
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
    @objid ("1b1ef496-bd6e-493d-ae0b-8371c0d9d3e9")
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

    @objid ("ff82e37f-d195-48ee-a2f5-0fb25b9fd7d9")
    protected  InputParametersType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("b6dcefb6-c4eb-495d-840a-9e71e3a4fa50")
    public static final class MdaTypes {
        @objid ("3a36489a-7fda-4af7-a52f-cc735624afe2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ec3f069b-9ab1-4957-a992-44b48c804936")
        private static Stereotype MDAASSOCDEP;

        @objid ("0d0a71ee-8315-482c-a352-e24ec4976b69")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("45fe7b13-acb9-44b0-95d8-9ffd780b0231")
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

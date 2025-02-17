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
 * Proxy class to handle a {@link ModelElement} with << ExtensionType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7b10164e-17a7-4612-8e00-f52954ff315f")
public class ExtensionType implements IMdaProxy {
    @objid ("f6d8bfca-8155-4350-a2ae-4b395f348521")
    public static final String STEREOTYPE_NAME = "ExtensionType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("ad842523-5d01-4193-8f4b-e7ba85b3f70b")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ExtensionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ExtensionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dd5e609b-85c9-40f9-b9cd-6f527cdd5c80")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ExtensionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ExtensionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ExtensionType >> then instantiate a {@link ExtensionType} proxy.
     * 
     * @return a {@link ExtensionType} proxy on the created {@link ModelElement}.
     */
    @objid ("bac31412-7748-4251-8c7a-e6fc57f2233e")
    public static ExtensionType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(ExtensionType.MdaTypes.STEREOTYPE_ELT);
        return ExtensionType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ExtensionType} proxy from a {@link ModelElement} stereotyped << ExtensionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ExtensionType} proxy or <i>null</i>.
     */
    @objid ("004e5beb-1ddb-4139-a057-e650c777d2c0")
    public static ExtensionType instantiate(final ModelElement obj) {
        return ExtensionType.canInstantiate(obj) ? new ExtensionType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExtensionType} proxy from a {@link ModelElement} stereotyped << ExtensionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ExtensionType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("039e151d-4231-428f-9502-5a49b2b52c03")
    public static ExtensionType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ExtensionType.canInstantiate(obj))
        	return new ExtensionType(obj);
        else
        	throw new IllegalArgumentException("ExtensionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'extension' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8904116b-c23e-4741-8366-f174d850a9d6")
    public void addExtension(final TExtension obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ExtensionType.MdaTypes.MDAASSOCDEP);
            d.setName("extension");
            d.putTagValue(ExtensionType.MdaTypes.MDAASSOCDEP_ROLE, "extension");
        }
    }

    @objid ("4cec0c2c-27a3-4276-8702-d79fb35dd6fe")
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
        ExtensionType other = (ExtensionType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("f365aa5a-3b5c-4bf7-9b3d-460da0727ea8")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'extension' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fe0953c3-9c52-4f20-bd38-ecc047cd5191")
    public List<TExtension> getExtension() {
        List<TExtension> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(ExtensionType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ExtensionType.MdaTypes.MDAASSOCDEP_ROLE), "extension")
              && TExtension.canInstantiate(d.getDependsOn()))
                results.add((TExtension)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TExtension.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("880e3bce-bff6-420d-bf89-9f9b12967c60")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'extension' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0438b740-8509-4df1-9deb-f300afe16f57")
    public boolean removeExtension(final TExtension obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ExtensionType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ExtensionType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("376c5b9a-b047-412c-88cf-fad568e111f6")
    protected  ExtensionType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("03f8a8b8-77d2-4ec8-a3fc-fb149f2998ab")
    public static final class MdaTypes {
        @objid ("93c05ab9-cb2c-491e-a2e4-296483e02798")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8798103b-b04d-4bf6-966f-9ae5c73d90e1")
        private static Stereotype MDAASSOCDEP;

        @objid ("4af78761-e3dc-4159-af91-cf179fafb9a4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e0c5cbee-96f1-4a45-a5b1-bb4adfb4f097")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "28c2cefc-d30d-4385-bbad-0b6047fb182e", "ExtensionType");
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

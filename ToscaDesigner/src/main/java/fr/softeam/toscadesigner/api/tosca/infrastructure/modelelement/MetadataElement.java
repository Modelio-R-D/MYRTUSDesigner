/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 16:27 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << MetadataElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2b3dc2db-7c80-4f5e-852d-d3fd38a4d361")
public class MetadataElement implements IMdaProxy {
    @objid ("de9d65e9-67b5-4fc7-b2d6-6746d63a4857")
    public static final String STEREOTYPE_NAME = "MetadataElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("01c8c069-d677-4f4f-bec5-0d2431e3e7f9")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link MetadataElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << MetadataElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("75485112-8580-41a1-adab-3e7e3f6dda34")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (MetadataElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(MetadataElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << MetadataElement >> then instantiate a {@link MetadataElement} proxy.
     * @return a {@link MetadataElement} proxy on the created {@link ModelElement}.
     */
    @objid ("a2e21fb1-d772-41de-952a-60950c06cc1f")
    public static MetadataElement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(MetadataElement.MdaTypes.STEREOTYPE_ELT);
        return MetadataElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link MetadataElement} proxy from a {@link ModelElement} stereotyped << MetadataElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link MetadataElement} proxy or <i>null</i>.
     */
    @objid ("6578967d-ea74-4ae8-ae50-351661c2e44e")
    public static MetadataElement instantiate(final ModelElement obj) {
        return MetadataElement.canInstantiate(obj) ? new MetadataElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetadataElement} proxy from a {@link ModelElement} stereotyped << MetadataElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link MetadataElement} proxy.
     */
    @objid ("dd9bba3f-da3f-4349-87e8-f6c8ec193814")
    public static MetadataElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (MetadataElement.canInstantiate(obj))
            return new MetadataElement(obj);
        else
            throw new IllegalArgumentException("MetadataElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1321c72d-05b6-4641-b019-10364f2bb843")
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
        MetadataElement other = (MetadataElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("1ad355a8-c707-412f-a767-47c5e7fdbfb0")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'elements' role.<p>
     * Role description:
     * null
     */
    @objid ("b2089493-b359-4cf8-85dc-8eebc000f5f6")
    public TPropertyDef getElements() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetadataElement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetadataElement.MdaTypes.MDAASSOCDEP_ROLE), "elements")
                  && TPropertyDef.canInstantiate(d.getDependsOn())) {
                     return (TPropertyDef)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPropertyDef.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("ee87afaf-741c-4121-9be5-c89c2be6554b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'elements' role.<p>
     * Role description:
     * null
     */
    @objid ("294dcc4d-db44-46bb-8043-e6d2820f91eb")
    public void setElements(final TPropertyDef obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetadataElement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetadataElement.MdaTypes.MDAASSOCDEP_ROLE), "elements")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetadataElement.MdaTypes.MDAASSOCDEP);
              dep.setName("elements");      dep.putTagValue(MetadataElement.MdaTypes.MDAASSOCDEP_ROLE, "elements");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("bafc98c2-1d38-4d58-9cb8-9a642c85e2e8")
    protected  MetadataElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("04352d78-8d23-4279-b055-c0f61c24c635")
    public static final class MdaTypes {
        @objid ("cd30ca73-f83e-4adc-b6b3-4b6fb8193284")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3bd8e20d-cfd1-4463-8cfe-255c79e55560")
        private static Stereotype MDAASSOCDEP;

        @objid ("54db42e6-d123-4df8-9e0d-4bb9b71b3a22")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dd662b4c-4e3c-4930-ac58-03404fc036ba")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2c20f655-d501-4dde-b82b-ddc16c6d0c0f", "MetadataElement");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.class_.TDocumentation;
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
 * Proxy class to handle a {@link ModelElement} with << TExtensibleElements >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("86e131e0-2391-495e-b3d0-a8343fdcb621")
public class TExtensibleElements implements IMdaProxy {
    @objid ("7d74d6e5-8e0e-4f97-8e2d-b3386a66ddd0")
    public static final String STEREOTYPE_NAME = "TExtensibleElements";

    @objid ("e5346cb9-c24c-4106-b9bd-3833d89eb2cb")
    public static final String ANY_TAGTYPE = "any";

    @objid ("c57aaa7a-0cca-471c-8049-a5ff68e92f70")
    public static final String ANYATTRIBUTE_TAGTYPE = "anyAttribute";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("e0815d0f-ae36-4490-93af-05ca56008b79")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExtensibleElements proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtensibleElements >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("02ee7064-19b8-4319-95ba-65d38a90b96c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtensibleElements.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtensibleElements.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtensibleElements >> then instantiate a {@link TExtensibleElements} proxy.
     * @return a {@link TExtensibleElements} proxy on the created {@link ModelElement}.
     */
    @objid ("cc6fb001-682b-4aa5-85fc-fac31eb40b09")
    public static TExtensibleElements create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TExtensibleElements.MdaTypes.STEREOTYPE_ELT);
        return TExtensibleElements.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TExtensibleElements} proxy from a {@link ModelElement} stereotyped << TExtensibleElements >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TExtensibleElements} proxy or <i>null</i>.
     */
    @objid ("f1cb37eb-266a-4482-860f-6a391ad49a2e")
    public static TExtensibleElements instantiate(final ModelElement obj) {
        return TExtensibleElements.canInstantiate(obj) ? new TExtensibleElements(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExtensibleElements} proxy from a {@link ModelElement} stereotyped << TExtensibleElements >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TExtensibleElements} proxy.
     */
    @objid ("032cb3d3-18d3-4dbb-bc01-a271564cbc95")
    public static TExtensibleElements safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExtensibleElements.canInstantiate(obj))
            return new TExtensibleElements(obj);
        else
            throw new IllegalArgumentException("TExtensibleElements: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'documentation' role.<p>
     * Role description:
     * null
     */
    @objid ("121feda2-ee44-4871-9538-8543839bf5e1")
    public void addDocumentation(final TDocumentation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TExtensibleElements.MdaTypes.MDAASSOCDEP);
            d.setName("documentation");
            d.putTagValue(TExtensibleElements.MdaTypes.MDAASSOCDEP_ROLE, "documentation");
        }
    }

    @objid ("d5e69766-81e9-4a56-8dc6-7dea39883dd8")
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
        TExtensibleElements other = (TExtensibleElements) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("da5b950f-23c2-4299-8357-8a869408286a")
    public String getAny() {
        return this.elt.getTagValue(TExtensibleElements.MdaTypes.ANY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'anyAttribute'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("22560795-4490-4d16-82a1-a3447e099114")
    public String getAnyAttribute() {
        return this.elt.getTagValue(TExtensibleElements.MdaTypes.ANYATTRIBUTE_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'documentation' role.<p>
     * Role description:
     * null
     */
    @objid ("f4232562-27f1-465a-9efa-e12299215ca8")
    public List<TDocumentation> getDocumentation() {
        List<TDocumentation> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TExtensibleElements.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TExtensibleElements.MdaTypes.MDAASSOCDEP_ROLE), "documentation")
              && TDocumentation.canInstantiate(d.getDependsOn()))
                results.add((TDocumentation)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TDocumentation.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("d032de89-e6b6-4e44-8b79-380b9e2b4d71")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("533c1001-27c7-4958-b355-38658bff80d6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'documentation' role.<p>
     * Role description:
     * null
     */
    @objid ("76db2a56-05e7-4f16-a012-e073ad617ce6")
    public boolean removeDocumentation(final TDocumentation obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TExtensibleElements.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TExtensibleElements.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aa1f355b-3251-45d9-9c44-5502daa0149a")
    public void setAny(final String value) {
        this.elt.putTagValue(TExtensibleElements.MdaTypes.ANY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'anyAttribute'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("44930567-c540-4867-97c6-f9a65163afe1")
    public void setAnyAttribute(final String value) {
        this.elt.putTagValue(TExtensibleElements.MdaTypes.ANYATTRIBUTE_TAGTYPE_ELT, value);
    }

    @objid ("7ab6c8e1-8d67-41c7-a23c-c82b00981a5b")
    protected  TExtensibleElements(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("2ef679ee-c0dd-4315-97c3-34214f3757a1")
    public static final class MdaTypes {
        @objid ("1da666c3-a198-42f5-ae5c-5eccb24c80bc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c9b35be0-9323-4083-8424-4a6b86af7c15")
        public static TagType ANY_TAGTYPE_ELT;

        @objid ("309736c4-7dd8-43b0-af4e-22ccca289c8a")
        public static TagType ANYATTRIBUTE_TAGTYPE_ELT;

        @objid ("99b00c35-0eea-465b-9d52-95153ce796ce")
        private static Stereotype MDAASSOCDEP;

        @objid ("ece627db-b3d2-4aee-ac1d-ca1eda1a9e09")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("70b5f719-ab39-4776-8867-d61d86d40a4d")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1aad84ed-4c30-40ec-a4d8-6712bb6bd018", "TExtensibleElements");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "09873d87-439c-491e-85cc-4d44ded59ba3", "any");
            ANY_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (ANY_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "070d869e-3813-43b0-b0cc-ee4ec09ba88f", "anyAttribute");
            ANYATTRIBUTE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (ANYATTRIBUTE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

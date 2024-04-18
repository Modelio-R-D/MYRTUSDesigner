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
    @objid ("52d54ae6-e2b4-4797-9b43-d9a345ecd241")
    public static final String STEREOTYPE_NAME = "TExtensibleElements";

    @objid ("1d809d17-54bb-414c-a787-d20d703c7b2b")
    public static final String ANY_TAGTYPE = "any";

    @objid ("f541be4d-a656-45cb-96a2-2ee36cb72965")
    public static final String ANYATTRIBUTE_TAGTYPE = "anyAttribute";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("14677d74-f787-4db4-a484-11475c673dc5")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExtensibleElements proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtensibleElements >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ddc11eed-a2ec-4515-8dfd-f74c0fa39ec6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtensibleElements.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtensibleElements.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtensibleElements >> then instantiate a {@link TExtensibleElements} proxy.
     * @return a {@link TExtensibleElements} proxy on the created {@link ModelElement}.
     */
    @objid ("9826ebae-31db-4a2a-ae39-a1f351c8e90e")
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
    @objid ("9cbdbdeb-9bd7-421e-9c64-e580462462c4")
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
    @objid ("f2a6ee25-55a7-4b3e-8491-ac96fa54a72c")
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
    @objid ("6c53846b-98b2-4f1e-82f6-1783df301969")
    public void addDocumentation(final TDocumentation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TExtensibleElements.MdaTypes.MDAASSOCDEP);
            d.setName("documentation");
            d.putTagValue(TExtensibleElements.MdaTypes.MDAASSOCDEP_ROLE, "documentation");
        }
    }

    @objid ("0fb5e6bd-c27b-48df-99e6-2ea54a027694")
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
    @objid ("70753873-e847-4aa6-a946-b84a21f2cb70")
    public String getAny() {
        return this.elt.getTagValue(TExtensibleElements.MdaTypes.ANY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'anyAttribute'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bb7fda68-a471-4264-8b55-aabdccf44daf")
    public String getAnyAttribute() {
        return this.elt.getTagValue(TExtensibleElements.MdaTypes.ANYATTRIBUTE_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'documentation' role.<p>
     * Role description:
     * null
     */
    @objid ("c84bec94-8a8e-4d89-9d47-850cd4d75252")
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
    @objid ("34815635-da0b-49d1-b13a-16af14f79e8d")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("806d8dc9-159c-4cb1-9c39-0d10801c431e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'documentation' role.<p>
     * Role description:
     * null
     */
    @objid ("001926f3-feb1-4316-ae1d-0de7de979362")
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
    @objid ("d48d630f-1fd9-453b-9c47-54c706ff3098")
    public void setAny(final String value) {
        this.elt.putTagValue(TExtensibleElements.MdaTypes.ANY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'anyAttribute'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("53bbbefd-b24b-40f7-857d-1c907bbae10a")
    public void setAnyAttribute(final String value) {
        this.elt.putTagValue(TExtensibleElements.MdaTypes.ANYATTRIBUTE_TAGTYPE_ELT, value);
    }

    @objid ("5b140e9d-3eda-45df-abb9-1ee8a262854d")
    protected  TExtensibleElements(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("2ef679ee-c0dd-4315-97c3-34214f3757a1")
    public static final class MdaTypes {
        @objid ("094d79bb-c350-4c68-a3d4-6b97200e1266")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b9fdc5c6-2135-4eb0-a582-fffbe2de6049")
        public static TagType ANY_TAGTYPE_ELT;

        @objid ("25eb648c-6270-4c6c-88c7-7c0b36ebe5d4")
        public static TagType ANYATTRIBUTE_TAGTYPE_ELT;

        @objid ("2e5c1b6f-bf52-4f77-8b32-4aab572e5f69")
        private static Stereotype MDAASSOCDEP;

        @objid ("6cb7684f-170a-4fb0-87e1-f8a9bb784044")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("51ab0715-602e-4788-ad6b-07bb3395aae4")
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

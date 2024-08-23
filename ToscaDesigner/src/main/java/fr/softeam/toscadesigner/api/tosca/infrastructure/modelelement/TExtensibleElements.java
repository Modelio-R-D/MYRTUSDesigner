/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
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
import fr.softeam.toscadesigner.impl.MdaProxyException;
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
@objid ("eb4887ad-684d-4883-9afb-610ab5bff5d1")
public class TExtensibleElements implements IMdaProxy {
    @objid ("5f74b3cd-3c89-4667-8795-1544d23a88cc")
    public static final String STEREOTYPE_NAME = "TExtensibleElements";

    @objid ("c0ddedca-2735-4dbb-a483-9a0974df6868")
    public static final String ANYATTRIBUTE_TAGTYPE = "anyAttribute";

    @objid ("24485070-1436-4561-ab61-06b763ab105b")
    public static final String METADATA_PROPERTY = "metadata";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("272b2d80-ca02-4c3e-a371-304419ab38bd")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExtensibleElements proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtensibleElements >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("98f35b61-dd8c-42e1-82c1-3b84c93d9c77")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtensibleElements.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtensibleElements.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtensibleElements >> then instantiate a {@link TExtensibleElements} proxy.
     * 
     * @return a {@link TExtensibleElements} proxy on the created {@link ModelElement}.
     */
    @objid ("f2cf0a01-413c-4612-a7f1-e9f90005c489")
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
    @objid ("7f3cde06-0859-4ea7-9345-e68c9a8da268")
    public static TExtensibleElements instantiate(final ModelElement obj) {
        return TExtensibleElements.canInstantiate(obj) ? new TExtensibleElements(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExtensibleElements} proxy from a {@link ModelElement} stereotyped << TExtensibleElements >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TExtensibleElements} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("987cbf4f-f2b2-487f-b920-359b965d6fc8")
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
     * 
     */
    @objid ("56bb3e82-7336-4f4b-9220-52153e128492")
    public void addDocumentation(final TDocumentation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TExtensibleElements.MdaTypes.MDAASSOCDEP);
            d.setName("documentation");
            d.putTagValue(TExtensibleElements.MdaTypes.MDAASSOCDEP_ROLE, "documentation");
        }
    }

    @objid ("a0dbf8ec-d3eb-4a7f-8b54-6a7658c7b256")
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
     * Getter for string property 'anyAttribute'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2f3165a9-0ae3-4355-9eaa-285594d59129")
    public String getAnyAttribute() {
        return this.elt.getTagValue(TExtensibleElements.MdaTypes.ANYATTRIBUTE_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'documentation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b81154ee-838a-4975-9283-cef56aa3aeb4")
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
    @objid ("fc9c6bc7-82b2-47ce-adec-f7871801197d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TExtensibleElements.metadata'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d2f91e6a-8d4e-4fc9-b15f-e077291dad49")
    public String getMetadata() {
        String value = this.elt.getProperty(TExtensibleElements.MdaTypes.STEREOTYPE_ELT,
                                            TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("bdcc7dc7-7762-425f-91e8-15d737d0e0ee")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'documentation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c4d8b0cb-046e-4735-9ad1-d07f0db209c8")
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
     * Setter for string property 'anyAttribute'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e9c3fa1f-9fd7-4509-b469-6338211ce7d0")
    public void setAnyAttribute(final String value) {
        this.elt.putTagValue(TExtensibleElements.MdaTypes.ANYATTRIBUTE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for property 'TExtensibleElements.metadata'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("93a06eb7-4ce9-489a-ae16-0934876f2507")
    public void setMetadata(final String value) {
        this.elt.setProperty(TExtensibleElements.MdaTypes.STEREOTYPE_ELT,
                             TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT, value));
    }

    @objid ("af2d9648-848a-4de9-856b-645ab6d99841")
    protected  TExtensibleElements(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("68a62128-b7e3-47b1-9df0-8246ca95e037")
    public static final class MdaTypes {
        @objid ("6e0d7ab0-3042-4baa-af24-7c4dcd01cbc4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ff0d3c45-f67a-49d1-8a15-8f3989f7b21c")
        public static TagType ANYATTRIBUTE_TAGTYPE_ELT;

        @objid ("9b786b2a-4fed-488e-a943-52d4b5dd6e59")
        public static PropertyDefinition METADATA_PROPERTY_ELT;

        @objid ("f66e9cc9-570e-43e8-bc37-ef4504a7dfb2")
        private static Stereotype MDAASSOCDEP;

        @objid ("c17e17e0-61ee-4acb-835a-7d5bd2f59b67")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("328b286a-6ef0-4360-a6dd-c56a3083aba3")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1aad84ed-4c30-40ec-a4d8-6712bb6bd018", "TExtensibleElements");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "070d869e-3813-43b0-b0cc-ee4ec09ba88f", "anyAttribute");
            ANYATTRIBUTE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (ANYATTRIBUTE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "e4645b6d-f3ea-44be-983b-99aaab068509", "metadata");
            METADATA_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (METADATA_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:09 by Modelio Studio.
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
@objid ("ab2af2d2-fcb2-4e55-a9f0-a9f50c1ce8f9")
public class TExtensibleElements implements IMdaProxy {
    @objid ("251b879b-04be-49fc-b1b2-26d9db839c6b")
    public static final String STEREOTYPE_NAME = "TExtensibleElements";

    @objid ("17b2f57a-779b-4520-b00a-824a32a5d2db")
    public static final String ANYATTRIBUTE_TAGTYPE = "anyAttribute";

    @objid ("514807df-955e-42ea-ab3c-6e130a57714b")
    public static final String METADATA_PROPERTY = "metadata";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("678c5a72-c82d-461b-98f4-12d664a8d205")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExtensibleElements proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtensibleElements >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a8cd12c0-b4d5-47c4-89f2-cceb7117f9f3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtensibleElements.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtensibleElements.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtensibleElements >> then instantiate a {@link TExtensibleElements} proxy.
     * 
     * @return a {@link TExtensibleElements} proxy on the created {@link ModelElement}.
     */
    @objid ("5f37e0e8-aa81-438f-8a83-892916516c35")
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
    @objid ("27e75db2-a4d2-4e70-9923-d8a725e5a718")
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
    @objid ("6f5e8795-5e48-4707-b07e-e4c2db4a8eb9")
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
    @objid ("90576aab-b92e-4e5a-8316-9bb9d5921901")
    public void addDocumentation(final TDocumentation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TExtensibleElements.MdaTypes.MDAASSOCDEP);
            d.setName("documentation");
            d.putTagValue(TExtensibleElements.MdaTypes.MDAASSOCDEP_ROLE, "documentation");
        }
    }

    @objid ("249edce4-5fe3-43d5-923f-a306691e8ef0")
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
    @objid ("ec75e52f-d665-464f-b1dc-c060341367e0")
    public String getAnyAttribute() {
        return this.elt.getTagValue(TExtensibleElements.MdaTypes.ANYATTRIBUTE_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'documentation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("302b4380-657e-4022-b056-123f0d5d462b")
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
    @objid ("cff2fb91-bd0f-4f13-ae99-23003bcd1d85")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TExtensibleElements.metadata'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0134c339-007f-4ec2-bf00-8f8c7036032f")
    public String getMetadata() {
        String value = this.elt.getProperty(TExtensibleElements.MdaTypes.STEREOTYPE_ELT,
                                            TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("b97f60f7-0e0d-47b4-abb0-eb189b43eb47")
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
    @objid ("fc77afdc-7c88-4dde-bb27-147b1c50e1ed")
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
    @objid ("bec91771-29fc-434f-a660-95a7a0e8f3ea")
    public void setAnyAttribute(final String value) {
        this.elt.putTagValue(TExtensibleElements.MdaTypes.ANYATTRIBUTE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for property 'TExtensibleElements.metadata'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cb1bc144-5da0-4bd1-ab86-b22855f4cd2c")
    public void setMetadata(final String value) {
        this.elt.setProperty(TExtensibleElements.MdaTypes.STEREOTYPE_ELT,
                             TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT, value));
    }

    @objid ("deac13f2-6404-47a7-a778-bd99ef4186e6")
    protected  TExtensibleElements(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("2ab9156f-c0e2-484f-a6b5-b7df365055b6")
    public static final class MdaTypes {
        @objid ("e4e315be-aa9c-4250-9f7b-b08ffe17d22f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0c3b3140-0221-44fa-83b6-cf551b7f55b0")
        public static TagType ANYATTRIBUTE_TAGTYPE_ELT;

        @objid ("13f28dc3-2aee-471b-9e64-5acbbfbf4405")
        public static PropertyDefinition METADATA_PROPERTY_ELT;

        @objid ("cfc57d86-c3a6-4563-9ec8-8950d503c05f")
        private static Stereotype MDAASSOCDEP;

        @objid ("509c405a-3ad8-422c-8b04-0ec512bce216")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4467019f-24b1-4a0b-ac8f-573f0bac1c6b")
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

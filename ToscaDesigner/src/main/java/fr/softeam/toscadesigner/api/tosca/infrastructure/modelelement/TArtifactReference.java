/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 18/02/2025 10:30 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.List;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link ModelElement} with << TArtifactReference >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2ed29c57-b1fb-4da3-b3f1-7de72d51bd81")
public class TArtifactReference implements IMdaProxy {
    @objid ("7202d5fb-6fac-4b25-a60c-9cb2419165a4")
    public static final String STEREOTYPE_NAME = "TArtifactReference";

    @objid ("8f6a7c0e-6b85-424c-ad9a-9321653a90fb")
    public static final String EXCLUDE_PROPERTY = "exclude";

    @objid ("2b450fed-0c7f-4d85-90e9-b975ceb6eba5")
    public static final String GROUP_PROPERTY = "group";

    @objid ("5dfe06f7-ea98-4de6-8cd0-1ac19b8fc8a7")
    public static final String INCLUDE_PROPERTY = "include";

    @objid ("d4aae161-e1ba-4bf1-88af-ee437079597d")
    public static final String REFERENCE_PROPERTY = "reference";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("cfbea095-66bc-4b63-afa5-9cc73cd39dd3")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TArtifactReference proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TArtifactReference >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4245d21e-8153-4576-8a9a-43e943784f8a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TArtifactReference.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TArtifactReference.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TArtifactReference >> then instantiate a {@link TArtifactReference} proxy.
     * 
     * @return a {@link TArtifactReference} proxy on the created {@link ModelElement}.
     */
    @objid ("31e5a84e-f8bf-4e33-b663-971e88ce51bb")
    public static TArtifactReference create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TArtifactReference.MdaTypes.STEREOTYPE_ELT);
        return TArtifactReference.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TArtifactReference} proxy from a {@link ModelElement} stereotyped << TArtifactReference >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TArtifactReference} proxy or <i>null</i>.
     */
    @objid ("0d1731c7-56f5-4f4a-b46e-dcfc23fa28dc")
    public static TArtifactReference instantiate(final ModelElement obj) {
        return TArtifactReference.canInstantiate(obj) ? new TArtifactReference(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TArtifactReference} proxy from a {@link ModelElement} stereotyped << TArtifactReference >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TArtifactReference} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("270e3f4e-7fb5-48de-ae98-41f6cc7e60b1")
    public static TArtifactReference safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TArtifactReference.canInstantiate(obj))
        	return new TArtifactReference(obj);
        else
        	throw new IllegalArgumentException("TArtifactReference: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("672c5079-f6e9-4483-ad33-b8c749030346")
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
        TArtifactReference other = (TArtifactReference) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("7878810a-6936-4bb7-86d8-13d72122fdaa")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TArtifactReference.exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b73f7f37-6854-48ea-8cfd-defcc656e653")
    public String getExclude() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TArtifactReference.group'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5583f2b3-7be0-4e23-a5b2-e339f57d9d61")
    public String getGroup() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TArtifactReference.include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c2e97501-2a76-4973-90ba-9b50f347ca9b")
    public String getInclude() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TArtifactReference.reference'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a119104d-4e12-4464-94bb-a4007d3a80ac")
    public String getReference() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("85ecb6b5-9aac-4f9e-9fd6-4bcd5cd93185")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TArtifactReference.exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e78e0bf3-ccc6-4b35-8b32-4b5470a6c91e")
    public void setExclude(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.EXCLUDE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TArtifactReference.group'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9ad76fb2-329a-457b-a5cb-a0227dc2f786")
    public void setGroup(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.GROUP_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TArtifactReference.include'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("510a39d0-5820-4dd3-8b43-1811e2fdb909")
    public void setInclude(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.INCLUDE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TArtifactReference.reference'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7a6633b2-8a6b-4f6a-85d3-fe768af92e36")
    public void setReference(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT, value));
    }

    @objid ("74e067f8-04ed-4a1c-a3e6-40de81d76bca")
    protected  TArtifactReference(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("7abca64f-9353-44e7-a479-9186cd800b69")
    public static final class MdaTypes {
        @objid ("521be8a8-c4f9-4b19-9308-d53543012465")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1df46a7b-65cb-4fb1-8735-722534c85940")
        public static PropertyDefinition REFERENCE_PROPERTY_ELT;

        @objid ("42fe50f1-f696-4506-b367-d1ef5c896400")
        public static PropertyDefinition GROUP_PROPERTY_ELT;

        @objid ("2abec666-452a-43fa-88ed-304b9f5ffe5c")
        public static PropertyDefinition INCLUDE_PROPERTY_ELT;

        @objid ("309cc611-527a-4cdc-8f97-2543c67df2e3")
        public static PropertyDefinition EXCLUDE_PROPERTY_ELT;

        @objid ("cc28159c-f340-4b32-ac3c-3536c0c025ac")
        private static Stereotype MDAASSOCDEP;

        @objid ("b59c8cad-cfd8-4b31-9469-1ed27587c976")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5832c034-1cb1-4945-8638-7a873e528bdb")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "53c24e9e-c0ae-4a12-85d4-2841ed84c97f", "TArtifactReference");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b26c714b-31ed-4e47-8998-393302759e77", "reference");
            REFERENCE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REFERENCE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "1aabb42c-63ec-4139-8d3b-3e1ac92bdb57", "group");
            GROUP_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (GROUP_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "50ace3e1-cad2-4eca-87b1-f8158e5f4b61", "include");
            INCLUDE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (INCLUDE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a558d040-6e3b-46c9-8fce-7cfd072c9c49", "exclude");
            EXCLUDE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (EXCLUDE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

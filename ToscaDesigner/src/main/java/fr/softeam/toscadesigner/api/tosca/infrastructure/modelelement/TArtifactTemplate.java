/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 22/05/2025 15:07 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TArtifactTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("51fb691c-983c-4331-b7b0-91d7833c0501")
public class TArtifactTemplate extends TEntityTemplate implements IMdaProxy {
    @objid ("716b10cb-7f30-4853-882a-7aea5dcbaab7")
    public static final String STEREOTYPE_NAME = "TArtifactTemplate";

    @objid ("279062af-7fdc-4741-b911-8073c9df6086")
    public static final String ARTIFACTREFERENCES_PROPERTY = "artifactReferences";

    @objid ("2880aa6d-0367-4afb-ad23-b6b396304086")
    public static final String NAME_PROPERTY = "name";

    /**
     * Tells whether a {@link TArtifactTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TArtifactTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a2a5e9cf-aa2e-45dc-83a0-165d7cf677b4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TArtifactTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TArtifactTemplate >> then instantiate a {@link TArtifactTemplate} proxy.
     * 
     * @return a {@link TArtifactTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("d2bd5d01-8413-4f0e-96de-cab0122f1f53")
    public static TArtifactTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT);
        return TArtifactTemplate.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TArtifactTemplate} proxy from a {@link ModelElement} stereotyped << TArtifactTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TArtifactTemplate} proxy or <i>null</i>.
     */
    @objid ("c7c45f4b-e4dc-4af1-994b-189286649c44")
    public static TArtifactTemplate instantiate(final ModelElement obj) {
        return TArtifactTemplate.canInstantiate(obj) ? new TArtifactTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TArtifactTemplate} proxy from a {@link ModelElement} stereotyped << TArtifactTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TArtifactTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7ed198ad-b062-4e04-a933-7c09b41f0c74")
    public static TArtifactTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TArtifactTemplate.canInstantiate(obj))
        	return new TArtifactTemplate(obj);
        else
        	throw new IllegalArgumentException("TArtifactTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("75efb7ea-a1a5-4630-a09e-4477802c516d")
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
        TArtifactTemplate other = (TArtifactTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TArtifactTemplate.artifactReferences'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6a8f7aed-bf06-44c7-94f8-810f6cb62176")
    public String getArtifactReferences() {
        String value = this.elt.getProperty(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactTemplate.MdaTypes.ARTIFACTREFERENCES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactTemplate.MdaTypes.ARTIFACTREFERENCES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactTemplate.MdaTypes.ARTIFACTREFERENCES_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("87f2e6f3-82dc-4002-8696-21b84258572e")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TArtifactTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a6820943-2e9d-4622-87dd-c887d91d2300")
    public String getName() {
        String value = this.elt.getProperty(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("4ac70530-9344-4943-9f9a-39904e0abd34")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TArtifactTemplate.artifactReferences'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d5db6c7b-2f0c-481f-8f4f-12e91ccbdaa8")
    public void setArtifactReferences(final String value) {
        this.elt.setProperty(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT,
                             TArtifactTemplate.MdaTypes.ARTIFACTREFERENCES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactTemplate.MdaTypes.ARTIFACTREFERENCES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TArtifactTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8239cf41-9931-4730-8179-a5a064e81e3a")
    public void setName(final String value) {
        this.elt.setProperty(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT,
                             TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    @objid ("5cbc5707-c714-404d-8769-31112fbaf723")
    protected  TArtifactTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("7af8036e-c5d0-4e6b-b182-1bdbb66a7882")
    public static final class MdaTypes {
        @objid ("3695f01b-c6ab-46ee-813a-adb5a9f0afed")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fb88a1cd-3da6-4253-8291-d1fdbb554fc2")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("831234ba-6430-48f5-8042-cc34498ba244")
        public static PropertyDefinition ARTIFACTREFERENCES_PROPERTY_ELT;

        @objid ("08abd394-34b0-4eb1-b791-d7937f555d35")
        private static Stereotype MDAASSOCDEP;

        @objid ("f9fa0dfe-f2f9-4390-8381-df50583e42ca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f101257b-3c52-41b7-a395-f902b329e6cc")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1d06ae6d-75d2-4000-b80d-44d93145c847", "TArtifactTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "860fced7-c742-4bd3-9210-90c4c2f1654d", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a02abde8-5b35-4be5-9d81-91cf765d9991", "artifactReferences");
            ARTIFACTREFERENCES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ARTIFACTREFERENCES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

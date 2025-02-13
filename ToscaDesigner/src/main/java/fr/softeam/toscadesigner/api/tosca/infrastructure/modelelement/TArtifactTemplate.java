/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 13/02/2025 17:54 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TArtifactTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("51fb691c-983c-4331-b7b0-91d7833c0501")
public class TArtifactTemplate extends TEntityTemplate implements IMdaProxy {
    @objid ("a39a557a-94a8-45c9-a1bf-f9f1bbe94aae")
    public static final String STEREOTYPE_NAME = "TArtifactTemplate";

    @objid ("bf2f1a78-5bef-464e-99af-d397cb82aaa3")
    public static final String ARTIFACTREFERENCES_PROPERTY = "artifactReferences";

    @objid ("47ce81d3-a64e-49ea-a3b7-65f4d7dbed8a")
    public static final String NAME_PROPERTY = "name";

    /**
     * Tells whether a {@link TArtifactTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TArtifactTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d0f77c46-eec2-48aa-8cd3-61b2a942968c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TArtifactTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TArtifactTemplate >> then instantiate a {@link TArtifactTemplate} proxy.
     * 
     * @return a {@link TArtifactTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("49ce8fb6-8f01-4003-bf7a-6787e009f62f")
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
    @objid ("a3d7b3bf-ceb7-4797-af66-f672816d0a30")
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
    @objid ("04ce4610-78cf-4745-b355-e4a405d3ff10")
    public static TArtifactTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TArtifactTemplate.canInstantiate(obj))
        	return new TArtifactTemplate(obj);
        else
        	throw new IllegalArgumentException("TArtifactTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2af57c32-eaaa-427b-a187-62ef052ab5ad")
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
    @objid ("89cd7eb9-77d3-45de-a667-fafa7cfa851e")
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
    @objid ("aab38b28-1cbe-47e2-bd3e-3a6550a96380")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TArtifactTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3b25c654-84ac-4029-9785-68c7c585dc58")
    public String getName() {
        String value = this.elt.getProperty(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("b4a3cc52-6fe3-4604-986b-4f51ba01b078")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TArtifactTemplate.artifactReferences'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("01af28c0-4700-4e80-b60a-563412ce210e")
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
    @objid ("8027a253-ad4e-4405-8942-a36f6ade72a1")
    public void setName(final String value) {
        this.elt.setProperty(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT,
                             TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    @objid ("c80217a9-81fd-4d2d-8f50-a94b2d0a893b")
    protected  TArtifactTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("7af8036e-c5d0-4e6b-b182-1bdbb66a7882")
    public static final class MdaTypes {
        @objid ("c7009552-6cba-434c-bbb5-5125f548fdb2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0fafa032-0e0e-4901-84e7-7768eb8e31f1")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("f65250dc-7163-44ac-95a7-99ca0bfbd694")
        public static PropertyDefinition ARTIFACTREFERENCES_PROPERTY_ELT;

        @objid ("26a2abab-a7a0-4c2b-8e70-20dd72196063")
        private static Stereotype MDAASSOCDEP;

        @objid ("bd43b59a-3d27-4897-8c92-5df8cfa1d189")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2e7e15f8-8ff4-4c31-900f-444353e05fc0")
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

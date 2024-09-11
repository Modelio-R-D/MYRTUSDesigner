/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 11:45 by Modelio Studio.
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
@objid ("72bb3d99-9f40-49ef-90a6-7fa9a2477ced")
public class TArtifactTemplate extends TEntityTemplate implements IMdaProxy {
    @objid ("0b1ffc99-3f21-4323-bb3b-7eaea1eb9b26")
    public static final String STEREOTYPE_NAME = "TArtifactTemplate";

    @objid ("2f64adbd-7eae-4701-9760-5827d5f7bf23")
    public static final String ARTIFACTREFERENCES_PROPERTY = "artifactReferences";

    @objid ("750b8d07-44c4-4909-8a09-404f5ab898d3")
    public static final String NAME_PROPERTY = "name";

    /**
     * Tells whether a {@link TArtifactTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TArtifactTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a8e9fb0e-81be-4e9e-8798-0eb46443004f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TArtifactTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TArtifactTemplate >> then instantiate a {@link TArtifactTemplate} proxy.
     * 
     * @return a {@link TArtifactTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("bd44eb8d-d704-41d4-917d-3fdaecce0fae")
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
    @objid ("d10ac2b4-766c-49f1-8205-b4cb8d972ee8")
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
    @objid ("3f5fd9ea-f502-4db7-818b-77579866c007")
    public static TArtifactTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TArtifactTemplate.canInstantiate(obj))
        	return new TArtifactTemplate(obj);
        else
        	throw new IllegalArgumentException("TArtifactTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5e0e178d-d72d-4704-82d1-078dc97568b0")
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
    @objid ("7af74f02-2b47-46b6-b5fb-1a4132c3f3ad")
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
    @objid ("922925d9-33be-4875-a269-1eca62202394")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TArtifactTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0f7d4ac3-7259-4b87-8e0b-d93cd0609ca0")
    public String getName() {
        String value = this.elt.getProperty(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("bbbc373d-4341-418c-a496-c8fdc9b2e564")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TArtifactTemplate.artifactReferences'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("925a7bbd-5663-4760-b36b-e7026262db49")
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
    @objid ("11eaf197-b84d-4f3b-9a5c-16913150cc42")
    public void setName(final String value) {
        this.elt.setProperty(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT,
                             TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    @objid ("5dfb212e-40d2-4992-94f4-f21a605da0bf")
    protected  TArtifactTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("93185e2e-67e8-41a5-a24b-f1063c69dda8")
    public static final class MdaTypes {
        @objid ("366454fb-52db-4080-920d-9c546a1c25e9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b70d7fc4-e8aa-4099-add9-2e81153497c6")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("720c5fc5-2356-4131-ba6b-0d0446271c6f")
        public static PropertyDefinition ARTIFACTREFERENCES_PROPERTY_ELT;

        @objid ("21f517fc-4b65-4f7a-ac43-8a43dc5a2ddf")
        private static Stereotype MDAASSOCDEP;

        @objid ("fd7b5631-126a-4819-b403-8bbb2dfe4ca5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e9dc5c02-f78b-48ce-86e5-0233960da88c")
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

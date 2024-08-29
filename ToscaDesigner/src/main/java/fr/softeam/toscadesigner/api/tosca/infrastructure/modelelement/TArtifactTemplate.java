/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 14:48 by Modelio Studio.
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
@objid ("9c7b0cf9-04bf-443f-aa95-0d1d80d1cc73")
public class TArtifactTemplate extends TEntityTemplate implements IMdaProxy {
    @objid ("20686958-3e21-4edc-9256-66dbf5a7eb15")
    public static final String STEREOTYPE_NAME = "TArtifactTemplate";

    @objid ("581f8cf0-bbc6-45c3-bb5e-d43ab0284057")
    public static final String ARTIFACTREFERENCES_PROPERTY = "artifactReferences";

    @objid ("81dae367-257e-4f6a-beaf-9f17f502b3a1")
    public static final String NAME_PROPERTY = "name";

    /**
     * Tells whether a {@link TArtifactTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TArtifactTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b5ea7fc1-5c45-4579-9399-099a8025d2cb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TArtifactTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TArtifactTemplate >> then instantiate a {@link TArtifactTemplate} proxy.
     * 
     * @return a {@link TArtifactTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("61c69aec-00bf-4047-b3b0-fabcbbe24f67")
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
    @objid ("5c595a50-6514-4ad0-b14b-df0da13ecbb6")
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
    @objid ("bb658d34-6d50-4aac-921c-92415126ede8")
    public static TArtifactTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TArtifactTemplate.canInstantiate(obj))
        	return new TArtifactTemplate(obj);
        else
        	throw new IllegalArgumentException("TArtifactTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8586bdf0-d6aa-4ad5-84ca-154c5d8d296a")
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
    @objid ("f9be1092-b038-41a7-abe1-92daffc27781")
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
    @objid ("d1297edb-e2e7-4cdc-8923-84ddc0eff41e")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TArtifactTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dd87d6c4-6884-4de7-8a2c-6886a45fd7b2")
    public String getName() {
        String value = this.elt.getProperty(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("1985f779-5f7d-47b7-a98d-3828a6b3954e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TArtifactTemplate.artifactReferences'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("84bb7068-6627-4957-9e96-56fea3b6420f")
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
    @objid ("12fce2f1-00e8-4611-ab85-b0819c8d1b3e")
    public void setName(final String value) {
        this.elt.setProperty(TArtifactTemplate.MdaTypes.STEREOTYPE_ELT,
                             TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactTemplate.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    @objid ("3cb6b2d8-4d9e-4b59-8b1d-42b200f5cae3")
    protected  TArtifactTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("57faa8ce-355b-4d50-b168-84b7284d367a")
    public static final class MdaTypes {
        @objid ("f12d4f41-3f4f-48a5-8069-4577a4421f35")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("87ff5f73-605e-4794-92de-e2398a428078")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("d516167d-f06e-484a-8534-a269db426ba9")
        public static PropertyDefinition ARTIFACTREFERENCES_PROPERTY_ELT;

        @objid ("a26e0e20-4d03-4d9e-a54e-f0f60ddb7bc7")
        private static Stereotype MDAASSOCDEP;

        @objid ("6e62590f-6e8e-4856-bd49-4a2eba139dcd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0915c2a9-c101-4d89-8162-181810330369")
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

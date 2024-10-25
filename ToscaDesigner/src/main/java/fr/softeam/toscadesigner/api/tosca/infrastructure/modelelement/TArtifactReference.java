/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/10/2024 11:40 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TArtifactReference >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ade7041c-8bd5-4b95-9fed-82b770d7e5b1")
public class TArtifactReference implements IMdaProxy {
    @objid ("d2c41a76-3d8c-4ecd-b40d-079bfcf1e194")
    public static final String STEREOTYPE_NAME = "TArtifactReference";

    @objid ("ab3d82fd-da90-40d6-9046-04a7494e50c5")
    public static final String EXCLUDE_PROPERTY = "exclude";

    @objid ("418ece6b-c566-4674-afc0-c15747654480")
    public static final String GROUP_PROPERTY = "group";

    @objid ("75a6428d-d513-4d38-8c8c-1a84cd9d090b")
    public static final String INCLUDE_PROPERTY = "include";

    @objid ("0898e377-fcb5-4a40-adf0-ec2cff2fbf0d")
    public static final String REFERENCE_PROPERTY = "reference";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("5a39b13c-fecf-4be1-be59-97dba69dbb2e")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TArtifactReference proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TArtifactReference >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("82806cc1-35cd-4937-b335-7509b5b6b188")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TArtifactReference.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TArtifactReference.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TArtifactReference >> then instantiate a {@link TArtifactReference} proxy.
     * 
     * @return a {@link TArtifactReference} proxy on the created {@link ModelElement}.
     */
    @objid ("6a28cd23-e23e-4d00-b466-427fdb36491d")
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
    @objid ("44346fd7-b055-4318-8050-006b8b03d219")
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
    @objid ("d07ba101-41fa-4ea9-9f97-bceffae61756")
    public static TArtifactReference safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TArtifactReference.canInstantiate(obj))
        	return new TArtifactReference(obj);
        else
        	throw new IllegalArgumentException("TArtifactReference: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e8f9aa79-3501-4cb2-998f-3b84589116f2")
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
    @objid ("5425998b-d38c-4ad3-a6a9-ffbd0cc72e94")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TArtifactReference.exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b3000db9-82ee-476d-9dac-55e9a997af3c")
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
    @objid ("e9d15845-6a19-4e1c-82cd-647ddecad6a8")
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
    @objid ("f7247b1a-966a-47de-81b1-bb98c6643c2a")
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
    @objid ("5d938efa-1996-4c71-b6c8-309df328ea06")
    public String getReference() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("09b050fa-34f2-444e-9b62-ea5ab3f80bab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TArtifactReference.exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f2caf4df-349e-445d-b88b-cf6c3613b9f7")
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
    @objid ("36f569ae-400e-488b-afe7-8cb7dfea41cc")
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
    @objid ("9cd049db-cfc1-466d-9245-722396ac53a8")
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
    @objid ("bcc69f1b-0ed5-47bc-8a3a-4ba0cb60c753")
    public void setReference(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT, value));
    }

    @objid ("bc7c3a31-02d3-4286-8557-9fdc834f1b8a")
    protected  TArtifactReference(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("0a7cfc21-11fd-4a0d-9c2d-1136690e339c")
    public static final class MdaTypes {
        @objid ("de96f06a-0e59-40f0-b6a3-7cb0b13c5a41")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f8c34777-01eb-471e-afd6-5e56cbce6a85")
        public static PropertyDefinition REFERENCE_PROPERTY_ELT;

        @objid ("7603dbbf-a5c2-4331-b07f-29b8912fdaa7")
        public static PropertyDefinition GROUP_PROPERTY_ELT;

        @objid ("cf0b3aff-b728-417c-b247-a22737e7ce6f")
        public static PropertyDefinition INCLUDE_PROPERTY_ELT;

        @objid ("1128b91a-3dc8-4342-85f1-662ab6d7c9f3")
        public static PropertyDefinition EXCLUDE_PROPERTY_ELT;

        @objid ("861f5ced-6e45-4c80-b065-d753b82a226d")
        private static Stereotype MDAASSOCDEP;

        @objid ("866e5366-aac8-4244-89ef-d308a0a3008d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8c8e44f3-83b3-4a35-a815-d0e27c4bf4a0")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 21/08/2024 11:15 by Modelio Studio.
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
@objid ("c76dcad2-6d24-4ac0-9549-8115308a9e8a")
public class TArtifactReference implements IMdaProxy {
    @objid ("704c55fe-d34c-478f-95fd-79f73a1d48aa")
    public static final String STEREOTYPE_NAME = "TArtifactReference";

    @objid ("0b952df1-5e54-4099-a670-d63f03a3f8a8")
    public static final String EXCLUDE_PROPERTY = "exclude";

    @objid ("75b3b59f-8a25-433c-b898-e97217c5edad")
    public static final String GROUP_PROPERTY = "group";

    @objid ("d0c064b7-e991-4bb4-b39a-321ab6ff6ac4")
    public static final String INCLUDE_PROPERTY = "include";

    @objid ("d821bb56-f5c4-4e2b-b003-7674474b1434")
    public static final String REFERENCE_PROPERTY = "reference";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6433ad12-45de-4a6d-b121-4f246bb1fac3")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TArtifactReference proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TArtifactReference >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("03bc3182-4aba-4493-8c50-75573edd2edd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TArtifactReference.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TArtifactReference.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TArtifactReference >> then instantiate a {@link TArtifactReference} proxy.
     * 
     * @return a {@link TArtifactReference} proxy on the created {@link ModelElement}.
     */
    @objid ("2b0b3d61-7b29-4a22-bcb7-985f737b3b35")
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
    @objid ("ee8a6448-5d4f-4656-a1f5-b81f83a6ab5c")
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
    @objid ("d9c55700-cf43-4945-946d-f3834c2a3771")
    public static TArtifactReference safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TArtifactReference.canInstantiate(obj))
        	return new TArtifactReference(obj);
        else
        	throw new IllegalArgumentException("TArtifactReference: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fa443f0a-9ca3-4169-969b-0d47854a6e39")
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
    @objid ("f59dea60-95f2-4a4a-866b-961692aabc7f")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TArtifactReference.exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ddf1ad1c-5e73-43c5-aad2-c9adcfafe5d2")
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
    @objid ("c943dccf-e920-473e-bb4f-12264879a46c")
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
    @objid ("e87ab537-e28c-40ee-b109-a88024211eea")
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
    @objid ("6e3f25af-9f42-4934-9b69-752f9066039d")
    public String getReference() {
        String value = this.elt.getProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                                            TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("fe4b33bb-1b48-4274-882d-bfd52d13244d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TArtifactReference.exclude'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2ca10a62-4f61-4f7a-b920-15df9b97c1d3")
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
    @objid ("a960c12f-5a3f-4caf-8c6d-334106d7edc7")
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
    @objid ("137b6621-0d4e-4232-8d94-15e69d80df93")
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
    @objid ("b4585c81-2809-486c-bc8f-dc7bdb513d6c")
    public void setReference(final String value) {
        this.elt.setProperty(TArtifactReference.MdaTypes.STEREOTYPE_ELT,
                             TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TArtifactReference.MdaTypes.REFERENCE_PROPERTY_ELT, value));
    }

    @objid ("a28b4e16-b686-4f94-99ae-6e54d6f0bce5")
    protected  TArtifactReference(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("bec626cd-793c-4505-951d-20891f170359")
    public static final class MdaTypes {
        @objid ("04a38840-b899-4bd4-afc3-7b95bd9c59b4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c94206c4-3be8-438f-b4a8-6196ec81a0bc")
        public static PropertyDefinition REFERENCE_PROPERTY_ELT;

        @objid ("a005e8ca-ffae-4368-b883-3908c76d59d6")
        public static PropertyDefinition GROUP_PROPERTY_ELT;

        @objid ("c4244b1a-2352-42b9-84e8-c4061ecb5cdc")
        public static PropertyDefinition INCLUDE_PROPERTY_ELT;

        @objid ("c16d6d89-8b56-48d5-bacd-8f2a07581b96")
        public static PropertyDefinition EXCLUDE_PROPERTY_ELT;

        @objid ("c4e1ee68-f88d-4831-9c82-52c0e0f2f7b7")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ee06f41-c3ed-4a40-9967-dfde3842a9f0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("54047c9d-a3db-4444-9e62-c442216abd44")
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

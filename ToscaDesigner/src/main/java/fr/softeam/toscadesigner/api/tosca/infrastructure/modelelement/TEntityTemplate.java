/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TEntityTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0b49d91c-2cd5-4bf0-b5b2-148cef59883d")
public class TEntityTemplate extends TExtensibleElements implements IMdaProxy {
    @objid ("3d29379c-48f2-404f-b0f9-a0fb829f6203")
    public static final String STEREOTYPE_NAME = "TEntityTemplate";

    @objid ("e9549e0e-0439-46b2-a0cd-ff32bc899daf")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("57f00e50-995a-4eaf-98c6-d345ad9df3b8")
    public static final String ID_PROPERTY = "id";

    @objid ("8974f602-7519-438c-ab29-1adac408c94a")
    public static final String PROPERTIES_PROPERTY = "properties";

    @objid ("3633d475-577a-45b8-9438-d21751963870")
    public static final String PROPERTYCONSTRAINTS_PROPERTY = "propertyConstraints";

    @objid ("210a970b-808d-4a60-991b-dbf12fc73d8a")
    public static final String TYPE_PROPERTY = "type";

    /**
     * Tells whether a {@link TEntityTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TEntityTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8dd938b2-a4be-4118-8fdc-5c0ca9d87026")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TEntityTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TEntityTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TEntityTemplate >> then instantiate a {@link TEntityTemplate} proxy.
     * @return a {@link TEntityTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("cb4a225d-e903-41c3-8e74-6fcb8dd9f4e7")
    public static TEntityTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TEntityTemplate.MdaTypes.STEREOTYPE_ELT);
        return TEntityTemplate.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TEntityTemplate} proxy from a {@link ModelElement} stereotyped << TEntityTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TEntityTemplate} proxy or <i>null</i>.
     */
    @objid ("fd9f3f40-bbf1-4b6b-a70c-4e2b3ab92586")
    public static TEntityTemplate instantiate(final ModelElement obj) {
        return TEntityTemplate.canInstantiate(obj) ? new TEntityTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TEntityTemplate} proxy from a {@link ModelElement} stereotyped << TEntityTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TEntityTemplate} proxy.
     */
    @objid ("139df748-891d-463f-b20a-0a80ecadfb15")
    public static TEntityTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TEntityTemplate.canInstantiate(obj))
            return new TEntityTemplate(obj);
        else
            throw new IllegalArgumentException("TEntityTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("43297c6e-cc39-4089-b72b-24f053805f41")
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
        TEntityTemplate other = (TEntityTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TEntityTemplate.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7caf4c01-dd37-4354-ac81-032e66b34487")
    public String getDescription() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("e99919b6-b0ce-42ae-b6fe-a09131dc9718")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TEntityTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5e4ac654-497e-4539-992c-da2433316433")
    public String getId() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.ID_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.ID_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.ID_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TEntityTemplate.properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bb19de73-34e9-47b4-bc44-de8a3e4f35cd")
    public String getProperties() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.PROPERTIES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.PROPERTIES_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.PROPERTIES_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TEntityTemplate.propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3b7a99dd-2258-4e41-8d8d-95b423e92760")
    public String getPropertyConstraints() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TEntityTemplate.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f0580015-dcf1-48a8-a134-eb348b12fc9c")
    public String getType() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("7025132f-1ded-4ad7-b802-cad40ba55bcf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TEntityTemplate.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5c881bae-bf72-48f8-bf97-17535b77da3c")
    public void setDescription(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a2726dde-652b-41c1-b884-b20f944cd87b")
    public void setId(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.ID_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.ID_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityTemplate.properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("74f3efd9-5249-4d19-9244-9b81b5dfc169")
    public void setProperties(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.PROPERTIES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.PROPERTIES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityTemplate.propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b6aaffa1-f617-4c3e-9802-b454f5bf2ae0")
    public void setPropertyConstraints(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityTemplate.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("02033b31-8d75-477b-bdb2-dc34938fd204")
    public void setType(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("a61a8da1-14b2-431c-959c-536075b3a3b8")
    protected  TEntityTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("588d5c3b-fe99-4461-8677-0c884d4f904f")
    public static final class MdaTypes {
        @objid ("14677338-9d1e-45f4-a47d-fbd475fe77a2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9e93e062-f549-4810-ad84-f3d02781f96f")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("f7fa224e-ecae-4e43-bcee-69f2b0069a70")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("1a067338-d1f3-4cbe-8b77-51b330be5ee8")
        public static PropertyDefinition PROPERTIES_PROPERTY_ELT;

        @objid ("95aa2471-a0be-455f-8383-2729c459b13f")
        public static PropertyDefinition PROPERTYCONSTRAINTS_PROPERTY_ELT;

        @objid ("ec53ab52-6329-4e67-9fa5-b75e41d83852")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("9ab946af-f178-4113-9cb5-728f4def8982")
        private static Stereotype MDAASSOCDEP;

        @objid ("74327aaa-118a-478d-93a6-2b88604b07e9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("85ec60fa-6f35-4ef0-8b5a-9c0f6cedb859")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "a32cca04-f738-421e-b834-b0f13524e19e", "TEntityTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "08cf32f2-2ecf-4716-9cdc-57e005f102f4", "id");
            ID_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ID_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "81ce7b34-f210-44ca-aa8e-ea79ded8c354", "type");
            TYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "c002b78d-ef37-4be9-a9a3-01222916e38c", "properties");
            PROPERTIES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTIES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "3f291b75-a5ed-4de1-841e-0cdf4bdc3ba7", "propertyConstraints");
            PROPERTYCONSTRAINTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTYCONSTRAINTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "2c03e40a-2b38-45bc-b8a5-84369f877275", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TParameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("788fffe4-0ee3-414e-8a2e-87343a731006")
public class TParameter implements IMdaProxy {
    @objid ("d7d20232-12af-4bf0-bd52-e992b7e20ab3")
    public static final String STEREOTYPE_NAME = "TParameter";

    @objid ("74c7ccaf-3ad5-46aa-90b1-32092c5976bf")
    public static final String CONSTRAINTS_PROPERTY = "constraints";

    @objid ("98daa667-6356-49c2-a5c8-9b981e3b838d")
    public static final String DEFAULT_PROPERTY = "default";

    @objid ("eec59672-9126-4baa-9742-e5080aecfb50")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("5e806f45-d69b-443c-b8ad-1d8402b23acb")
    public static final String NAME_PROPERTY = "name";

    @objid ("c0634845-5859-40f8-9646-ff40ac800b26")
    public static final String REQUIRED_PROPERTY = "required";

    @objid ("195ef273-2aac-4669-b9b3-8522ab0bcb81")
    public static final String STATUS_PROPERTY = "status";

    @objid ("89f7d0ac-8ee2-498d-bfa3-1e53c185b359")
    public static final String TYPE_PROPERTY = "type";

    @objid ("ff5161f1-f9d0-447d-8240-6b6aed64ff0b")
    public static final String VALUE_PROPERTY = "value";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("e5127b7f-474e-48a1-9f15-c1c15175ad64")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TParameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1e856f0c-bbd3-4edf-984e-6dc4d90cc0b1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TParameter.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TParameter.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TParameter >> then instantiate a {@link TParameter} proxy.
     * @return a {@link TParameter} proxy on the created {@link ModelElement}.
     */
    @objid ("1202cb6c-3ee7-4485-be32-52e30ff05caf")
    public static TParameter create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TParameter.MdaTypes.STEREOTYPE_ELT);
        return TParameter.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TParameter} proxy from a {@link ModelElement} stereotyped << TParameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TParameter} proxy or <i>null</i>.
     */
    @objid ("b0a66681-007a-48cc-b4aa-a958a81f70b4")
    public static TParameter instantiate(final ModelElement obj) {
        return TParameter.canInstantiate(obj) ? new TParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TParameter} proxy from a {@link ModelElement} stereotyped << TParameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TParameter} proxy.
     */
    @objid ("f2ae221c-f2a6-4d0c-8ec3-fa2278d6f5c9")
    public static TParameter safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TParameter.canInstantiate(obj))
            return new TParameter(obj);
        else
            throw new IllegalArgumentException("TParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("89b00209-d3b8-45dd-a55f-441749aee2d2")
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
        TParameter other = (TParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TParameter.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4871106a-668c-4f65-bc39-d9e2802a431d")
    public String getConstraints() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.CONSTRAINTS_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TParameter.default'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("70464a47-d4af-4156-8747-9bf10c2b889a")
    public String getDefault() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.DEFAULT_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.DEFAULT_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.DEFAULT_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TParameter.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f1727e7a-c04c-435a-8bee-ec6a3c6d4eb0")
    public String getDescription() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("4f6ef539-44c2-4eeb-8657-a18d08fe4aa2")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TParameter.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("af268642-bfa1-42c3-8646-bc87e115b349")
    public String getName() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TParameter.required'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5ddc2be4-f8d3-457b-a7f3-95c25c64cc56")
    public Boolean getRequired() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.REQUIRED_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.REQUIRED_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(TParameter.MdaTypes.REQUIRED_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TParameter.status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("64562a01-87da-493e-861e-32e96e0f66c4")
    public String getStatus() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.STATUS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.STATUS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.STATUS_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TParameter.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5e638825-781c-4971-a03e-5d58708cf840")
    public String getType() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TParameter.value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bfcf84ef-b38e-49b7-ac36-c35623a57496")
    public String getValue() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.VALUE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.VALUE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.VALUE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("4727c64d-d000-4ed4-8a06-1409a488da6c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TParameter.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("806c949f-62c2-4d52-af8a-f1ec08866d6f")
    public void setConstraints(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.CONSTRAINTS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.default'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("854f6219-982b-438d-bfa7-cd2ea45265a4")
    public void setDefault(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.DEFAULT_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.DEFAULT_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("801ff866-dfc9-4a3a-a4a1-7039a91655f1")
    public void setDescription(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eae1de49-4c16-4f1c-a518-d3b3c21fa4bb")
    public void setName(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.required'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5c1bd227-39bf-4416-b761-2ab2d9c52138")
    public void setRequired(final Boolean value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.REQUIRED_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.REQUIRED_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.status'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d822e6db-892e-43f1-940d-8029fdc30baf")
    public void setStatus(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.STATUS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.STATUS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dd6e499b-8645-4c8a-adfd-22219287896b")
    public void setType(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c42398f4-e56d-41ed-ba88-c7dc9652cb90")
    public void setValue(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.VALUE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.VALUE_PROPERTY_ELT, value));
    }

    @objid ("f13efe47-4d78-44eb-9666-f90641aaed08")
    protected  TParameter(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("7cb430c3-c37e-4c75-84df-48bf8f850b03")
    public static final class MdaTypes {
        @objid ("4f4f7dc4-5e92-425b-ab34-32bb7d3c6394")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("62d5a5b0-e94c-4c34-8bd7-849677f9b06a")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("95d61053-b2c3-4ef6-8a5d-0f0938ff092c")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("f82aa027-a66a-4bd2-bdb3-785c58f419be")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("0c1fd236-4c20-42b6-871a-b3e756189824")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("d1027f69-db9e-4cf1-a41b-085597000bed")
        public static PropertyDefinition VALUE_PROPERTY_ELT;

        @objid ("d8f24314-9633-4c9e-b4d5-07c545edf662")
        public static PropertyDefinition DEFAULT_PROPERTY_ELT;

        @objid ("49152496-6293-4903-ae48-b0ce49da04f1")
        public static PropertyDefinition STATUS_PROPERTY_ELT;

        @objid ("aa1b1044-b555-45da-91a5-2b1eea5a73b8")
        public static PropertyDefinition CONSTRAINTS_PROPERTY_ELT;

        @objid ("a644b464-6f4f-4791-9d1f-2178e7d5c80d")
        private static Stereotype MDAASSOCDEP;

        @objid ("555aa811-7ea5-4eec-bb5d-62969add5f3b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c180a648-5e29-4eb4-bd7f-10e5e86c833b")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "88f765a0-a1fe-42d8-9b52-f45ff541469f", "TParameter");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "ae68e1f0-3464-42e1-a2d5-d8d14a7aa4fe", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "3091bbf3-2697-463a-92be-b410cc5a1f82", "required");
            REQUIRED_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIRED_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a6d4ef82-d89c-4b98-ad06-c9abb7992402", "type");
            TYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "73c42be6-f152-4cd9-96e7-811cbdc19855", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "b90789da-89e2-4e67-95f5-afaeae60527f", "value");
            VALUE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALUE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "77d5b3fc-e752-44d0-a52c-3d3b6fa2755a", "default");
            DEFAULT_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DEFAULT_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "af62ecb0-8deb-4e68-bb5f-c38a90d1ddc6", "status");
            STATUS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (STATUS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "5e5812ea-e124-41ef-8d85-dc46d49636a9", "constraints");
            CONSTRAINTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CONSTRAINTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 11:20 by Modelio Studio.
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
@objid ("75d1a690-9811-4ad8-ba31-59c338697e22")
public class TParameter implements IMdaProxy {
    @objid ("34d0a64d-3555-4308-bb96-ac70273f90fd")
    public static final String STEREOTYPE_NAME = "TParameter";

    @objid ("15058f73-19d2-4c1c-a820-2b4475acdc70")
    public static final String NAME_PROPERTY = "name";

    @objid ("bc838fef-d2fa-414c-a409-51e9190099bf")
    public static final String REQUIRED_PROPERTY = "required";

    @objid ("8e860d9c-5311-40fc-83b3-2e6f125b5441")
    public static final String TYPE_PROPERTY = "type";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("e0f0a903-4079-4710-91ec-a04d16bb7a1e")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TParameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("60ed7e0c-b677-4428-ac5f-3823787e6aa2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TParameter.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TParameter.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TParameter >> then instantiate a {@link TParameter} proxy.
     * 
     * @return a {@link TParameter} proxy on the created {@link ModelElement}.
     */
    @objid ("4224d2fe-b710-4850-bacc-cdf955207f3e")
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
    @objid ("c584cfe5-eb34-4068-baf5-fd7143407f0d")
    public static TParameter instantiate(final ModelElement obj) {
        return TParameter.canInstantiate(obj) ? new TParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TParameter} proxy from a {@link ModelElement} stereotyped << TParameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("671fbfb1-830b-4df4-bd13-1eced7caf4a3")
    public static TParameter safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TParameter.canInstantiate(obj))
        	return new TParameter(obj);
        else
        	throw new IllegalArgumentException("TParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b9092710-32ef-474f-9250-b3c4e36c5161")
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
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("e095420b-0f89-4854-817b-ef710e3858d9")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TParameter.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cf58fb25-0865-4ac5-8c33-36273e0066fe")
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
    @objid ("eb3afea9-4269-47ef-a534-cb5cd8f54332")
    public Boolean getRequired() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.REQUIRED_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.REQUIRED_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(TParameter.MdaTypes.REQUIRED_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TParameter.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f5257edb-9912-43ea-8439-35612286a06d")
    public String getType() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("ee320d8a-aa2e-4b82-b8f0-8eb6a7cf9220")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TParameter.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7188fb10-e34f-46e7-9787-0f5d0793486d")
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
    @objid ("8e9fce2e-91dc-45a3-9a35-9bbcbe3f6d1a")
    public void setRequired(final Boolean value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.REQUIRED_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.REQUIRED_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("745fbafc-a4b7-4e4e-b900-3eab8cca9697")
    public void setType(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("05be88ff-fc41-4eee-916c-236cda33f45a")
    protected  TParameter(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("b820876c-b087-488b-8631-ca1fb492e936")
    public static final class MdaTypes {
        @objid ("d76c5c06-9f5e-4d04-84a8-06ad66df4a8f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d3bd0822-0ecb-4f6c-9cf4-5467b0530366")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("77ca9e66-409e-43ab-ad38-796f4c7cf100")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("6fd4e1ce-2745-43b2-971b-b502ab0e1815")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("78ab0cef-cf75-4ae2-b9ea-216de5357cb7")
        private static Stereotype MDAASSOCDEP;

        @objid ("97c851dd-1b1f-4fd0-801a-28486d49f88a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6e2bec3c-16d2-425a-ad8d-dbad31bc6f5c")
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

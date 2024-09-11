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
 * Proxy class to handle a {@link ModelElement} with << TParameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("75d1a690-9811-4ad8-ba31-59c338697e22")
public class TParameter implements IMdaProxy {
    @objid ("cc5d7750-0e6e-4c92-ac68-b6cd06ccdf01")
    public static final String STEREOTYPE_NAME = "TParameter";

    @objid ("9c6a2d71-b54b-446a-9c9c-77d8df0680d5")
    public static final String NAME_PROPERTY = "name";

    @objid ("347b51af-0d52-4bb0-8aff-041771e9e058")
    public static final String REQUIRED_PROPERTY = "required";

    @objid ("08a4cc24-849c-4e90-9079-634706432112")
    public static final String TYPE_PROPERTY = "type";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("1e9c8edb-992a-4355-8078-a35b6c6ba392")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TParameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("761b945e-ab2f-4460-bb4b-44dcc29b7aae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TParameter.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TParameter.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TParameter >> then instantiate a {@link TParameter} proxy.
     * 
     * @return a {@link TParameter} proxy on the created {@link ModelElement}.
     */
    @objid ("e406af88-a3a2-45a7-82fe-892176d97cc6")
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
    @objid ("d69c2cb7-19df-4f97-b9c0-12895008e79e")
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
    @objid ("5f6b397e-358d-4b7c-b42d-11681fc2abf6")
    public static TParameter safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TParameter.canInstantiate(obj))
        	return new TParameter(obj);
        else
        	throw new IllegalArgumentException("TParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("54a26644-2c00-4050-ba04-3e3404ab7f25")
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
    @objid ("5ee78786-21eb-4c29-b070-1dfd7ba39ae1")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TParameter.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6f3c2df8-c67b-470f-b3a9-d99618809f14")
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
    @objid ("a9e1f81d-a9b6-43ad-9b39-54b1d8b34977")
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
    @objid ("a3deae62-b968-4878-9963-3daf1870163e")
    public String getType() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("fb13f421-d234-4eb4-9153-440380e2e2b6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TParameter.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6fa97652-b141-4c4d-84e6-7dfd7ecfb4d8")
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
    @objid ("dd63a8ff-b3c8-4e4a-9910-142b26fcf102")
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
    @objid ("b9479666-744e-42df-bdd4-99e36567db45")
    public void setType(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("e1356de2-d0a8-4163-bb06-bed0bd362f3c")
    protected  TParameter(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("b820876c-b087-488b-8631-ca1fb492e936")
    public static final class MdaTypes {
        @objid ("f3b08525-0194-4970-94c5-0c7ce0e3baa1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("55ed152a-a68b-45ff-8c7e-661f702c87a8")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("017f040a-4534-4fb1-b2f0-cd38933fb8fd")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("72b0c3c9-bfad-42f4-9c5c-585405ed89f1")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("0a025420-b229-4bc5-bab6-9e385010b8fd")
        private static Stereotype MDAASSOCDEP;

        @objid ("e690e802-44df-4e7b-8df6-bbe1bc4e12fd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f872e765-a19c-456f-97ac-b3c35a71347d")
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

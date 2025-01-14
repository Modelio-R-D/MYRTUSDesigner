/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 15:42 by Modelio Studio.
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
    @objid ("0a816ede-231f-4b8e-9993-3e0937d2ddfe")
    public static final String STEREOTYPE_NAME = "TEntityTemplate";

    @objid ("d7d68165-022b-47e5-ad0e-6c3daa9c66fe")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("93e345c5-8a3e-4515-bafb-2e827583e5c0")
    public static final String ID_PROPERTY = "id";

    @objid ("07996ede-21b5-459c-9c9f-761501a57a6c")
    public static final String PROPERTIES_PROPERTY = "properties";

    @objid ("390317c9-f799-4d04-8266-530471638fa6")
    public static final String PROPERTYCONSTRAINTS_PROPERTY = "propertyConstraints";

    @objid ("9d1878c5-4bbb-4b1d-be16-6d2d99bf2274")
    public static final String TYPE_PROPERTY = "type";

    /**
     * Tells whether a {@link TEntityTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TEntityTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8f490ba9-812e-4d8f-98d2-8f125dcb8957")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TEntityTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TEntityTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TEntityTemplate >> then instantiate a {@link TEntityTemplate} proxy.
     * 
     * @return a {@link TEntityTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("7e4fbd6e-d325-42b3-9018-cb8d4d9e8259")
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
    @objid ("80cc16e9-0933-4c49-aa10-c22dbdcbb02b")
    public static TEntityTemplate instantiate(final ModelElement obj) {
        return TEntityTemplate.canInstantiate(obj) ? new TEntityTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TEntityTemplate} proxy from a {@link ModelElement} stereotyped << TEntityTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TEntityTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("23cbc65b-3057-4c6a-a059-c37872827644")
    public static TEntityTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TEntityTemplate.canInstantiate(obj))
        	return new TEntityTemplate(obj);
        else
        	throw new IllegalArgumentException("TEntityTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e0ae1166-146a-462e-8f0e-a738954bf654")
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
    @objid ("b1e63763-47ba-4c56-a18e-b6c242634152")
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
    @objid ("afcbcaa2-890f-4a6f-a274-3d78e0dc7156")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for property 'TEntityTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b53a64c1-8de2-4d3b-9091-a3b22e59ad71")
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
    @objid ("99a3055e-dc8b-4384-9d6c-307cc0f46cd6")
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
    @objid ("1bb6e52b-b827-4db9-9b25-ce2fb2548c5f")
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
    @objid ("5b3ccea8-439d-495a-9761-5ade781b593e")
    public String getType() {
        String value = this.elt.getProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("ac11804f-05e0-45a0-a441-beefe5b0382b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TEntityTemplate.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3a18e1b8-2a11-4fd8-9bf8-25d7acd21dda")
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
    @objid ("0cc0666f-d8ea-42ab-8250-9df0a9ff9a15")
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
    @objid ("5c50c084-7009-4b51-b7a7-fa55736e8afc")
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
    @objid ("83a4ca96-b6a2-456f-bf40-454577e85305")
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
    @objid ("2a5c4071-9c4b-4167-a69b-70dd3a55cf29")
    public void setType(final String value) {
        this.elt.setProperty(TEntityTemplate.MdaTypes.STEREOTYPE_ELT,
                             TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityTemplate.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("b0d14072-dc23-4d5c-a47b-979408c7ca34")
    protected  TEntityTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("588d5c3b-fe99-4461-8677-0c884d4f904f")
    public static final class MdaTypes {
        @objid ("dd2b2ff8-b341-45e4-b399-f3de779096ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4f23c22f-8a95-480c-b492-7345cc2064db")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("1f7ded34-2e0a-4e04-b0ee-856e1a2eb998")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("bf25f276-8c23-4b88-93c2-1a2e50e95ac3")
        public static PropertyDefinition PROPERTIES_PROPERTY_ELT;

        @objid ("3fddf488-f607-4e8a-b628-c621a6ae2df2")
        public static PropertyDefinition PROPERTYCONSTRAINTS_PROPERTY_ELT;

        @objid ("ec1b2943-6f41-4845-aa1e-f120d38a9420")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("e5dfe282-4929-4ff8-beab-c3724afe07b8")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb3b1a79-dd15-44c8-8780-13770630c385")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("be3627a9-9265-48b7-9f4c-d73d1766aabb")
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

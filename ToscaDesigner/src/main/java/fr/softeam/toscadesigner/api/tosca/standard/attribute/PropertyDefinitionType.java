/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 17:52 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Attribute} with << PropertyDefinitionType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("877c3ec4-fea5-418d-824a-17072f906ba2")
public class PropertyDefinitionType implements IMdaProxy {
    @objid ("7ea8d921-d5c4-4e6a-a1e8-a7748f770253")
    public static final String STEREOTYPE_NAME = "PropertyDefinitionType";

    @objid ("3a7f7f1b-f791-4e58-a134-279fc1678160")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("d033abfa-9834-44a9-aa2a-93be9b777987")
    public static final String REQUIRED_PROPERTY = "required";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("ffffc7a0-5294-4f36-9baa-31363363129a")
    protected final Attribute elt;

    /**
     * Tells whether a {@link PropertyDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << PropertyDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cbed01f5-545a-4738-806e-3edbb464a5b4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << PropertyDefinitionType >> then instantiate a {@link PropertyDefinitionType} proxy.
     * 
     * @return a {@link PropertyDefinitionType} proxy on the created {@link Attribute}.
     */
    @objid ("29770646-999a-4116-af54-6a2e67a7a341")
    public static PropertyDefinitionType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT);
        return PropertyDefinitionType.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link PropertyDefinitionType} proxy from a {@link Attribute} stereotyped << PropertyDefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link PropertyDefinitionType} proxy or <i>null</i>.
     */
    @objid ("0922f098-c1a0-4c25-b2d7-006e3336610f")
    public static PropertyDefinitionType instantiate(final Attribute obj) {
        return PropertyDefinitionType.canInstantiate(obj) ? new PropertyDefinitionType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertyDefinitionType} proxy from a {@link Attribute} stereotyped << PropertyDefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link PropertyDefinitionType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("acdf6ffa-3e87-49ab-b3d8-08cf4f56fae5")
    public static PropertyDefinitionType safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (PropertyDefinitionType.canInstantiate(obj))
        	return new PropertyDefinitionType(obj);
        else
        	throw new IllegalArgumentException("PropertyDefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1d51f9e1-e03b-4c1a-aafb-6de9672f7bf3")
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
        PropertyDefinitionType other = (PropertyDefinitionType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'PropertyDefinitionType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("970b0562-3140-457b-8f33-1bbf0b8ab05c")
    public String getDescription() {
        String value = this.elt.getProperty(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT,
                                            PropertyDefinitionType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertyDefinitionType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(PropertyDefinitionType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("049bf3ed-6fcb-4232-b3c1-1f77eab1e7c2")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertyDefinitionType.required'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1fdce130-0e13-4312-8f9c-0ce7bfd3101c")
    public Boolean getRequired() {
        String value = this.elt.getProperty(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT,
                                            PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("39e8a48e-eb98-4401-897f-5b2842d6c0ff")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'PropertyDefinitionType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2c339fa0-3953-4241-a30d-ecf353be0601")
    public void setDescription(final String value) {
        this.elt.setProperty(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT,
                             PropertyDefinitionType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertyDefinitionType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'PropertyDefinitionType.required'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8641535f-9027-4504-be3a-db9ca4f87df5")
    public void setRequired(final Boolean value) {
        this.elt.setProperty(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT,
                             PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT, value));
    }

    @objid ("33c7ce64-59ed-4f48-aca4-daaad6206053")
    protected  PropertyDefinitionType(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("491fe30b-6755-4b43-94bf-7f2f15b3ce59")
    public static final class MdaTypes {
        @objid ("64403d58-cdd7-4724-bbf4-f79e6da85280")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("75e03d72-5fb5-4c2a-91e7-b5aee854b322")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("c77dcece-483d-40eb-87b5-6ac2a385b9aa")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("17c46c6f-3cf0-4e6b-92da-894629769928")
        private static Stereotype MDAASSOCDEP;

        @objid ("bcd3d9b6-399f-4591-9708-c4c53bfe188b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fb2ea88d-76bb-4f8a-8eb3-b582f590d802")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "34943474-c962-4064-b5f1-c6008ebb3c9d", "PropertyDefinitionType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d7bd8dcf-45a6-4906-95f9-a874b3a36709", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "f35e9a83-e034-47a1-95bf-a2e1a1203952", "required");
            REQUIRED_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIRED_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

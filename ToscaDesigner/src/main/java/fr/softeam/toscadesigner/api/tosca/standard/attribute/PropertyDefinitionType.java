/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
    @objid ("884ffc24-e0ca-4fcb-a5ea-563e23b31134")
    public static final String STEREOTYPE_NAME = "PropertyDefinitionType";

    @objid ("5f1c66c2-becd-420d-b090-4f54bb293b7d")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("a669e88b-b1d0-488b-9123-3da196b498f9")
    public static final String REQUIRED_PROPERTY = "required";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     * 
     */
    @objid ("d1be7ac5-73f1-4a19-86e2-22bf55cdf158")
    protected final Attribute elt;

    /**
     * Tells whether a {@link PropertyDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << PropertyDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cc3ed352-fed0-4c75-93ed-ec67f77cc5f2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << PropertyDefinitionType >> then instantiate a {@link PropertyDefinitionType} proxy.
     * @return a {@link PropertyDefinitionType} proxy on the created {@link Attribute}.
     */
    @objid ("5563eb1e-b6b9-4414-8640-b5e57194612a")
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
    @objid ("9a96b5bb-8eba-4cbb-9283-99d513cc3b92")
    public static PropertyDefinitionType instantiate(final Attribute obj) {
        return PropertyDefinitionType.canInstantiate(obj) ? new PropertyDefinitionType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertyDefinitionType} proxy from a {@link Attribute} stereotyped << PropertyDefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link PropertyDefinitionType} proxy.
     */
    @objid ("7ee73713-026c-4ab4-aff3-da33de70b9db")
    public static PropertyDefinitionType safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (PropertyDefinitionType.canInstantiate(obj))
            return new PropertyDefinitionType(obj);
        else
            throw new IllegalArgumentException("PropertyDefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6d6e981d-b199-459a-99e4-bd4714f9708a")
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
    @objid ("ba9dc1d6-ad7c-4c40-83a2-099a00c26097")
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
    @objid ("58964783-b9cc-4c39-a743-cc3597715752")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertyDefinitionType.required'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("32fa0766-c786-4e56-b757-8a6281d38c04")
    public Boolean getRequired() {
        String value = this.elt.getProperty(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT,
                                            PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT, value, this.elt);
    }

    @objid ("2e05bf58-ab90-414b-8a79-8a7bc7722003")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'PropertyDefinitionType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f335403f-ad12-4866-abec-046fab65d373")
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
    @objid ("3a102aeb-ee2d-45f9-847c-22e5605e3701")
    public void setRequired(final Boolean value) {
        this.elt.setProperty(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT,
                             PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT, value));
    }

    @objid ("8166845a-278f-40b2-aed1-52bacd864159")
    protected  PropertyDefinitionType(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("491fe30b-6755-4b43-94bf-7f2f15b3ce59")
    public static final class MdaTypes {
        @objid ("2b7b6f01-579c-418c-acc4-a345527ab0a0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a0de1164-e798-41bb-9a18-f50b06ceb167")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("1f83391e-9138-4a04-a85f-3351591d9e4e")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("72465d78-afe0-4ab1-8c72-9df635497c1b")
        private static Stereotype MDAASSOCDEP;

        @objid ("55e65f3b-55d8-444b-829e-ed5a4022d6a5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b6f2a26f-e0fe-4ebd-b8ed-9afa21edb5dd")
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

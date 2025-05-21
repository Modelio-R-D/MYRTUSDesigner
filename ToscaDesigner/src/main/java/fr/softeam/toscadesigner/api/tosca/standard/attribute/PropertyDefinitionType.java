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
    @objid ("f5be5676-d61a-4d5e-a3b6-b192d3623d1e")
    public static final String STEREOTYPE_NAME = "PropertyDefinitionType";

    @objid ("fd5b82af-5641-4b9c-9749-189fb2796263")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("152967e7-d9ce-4e26-a42c-00ffaca6116d")
    public static final String REQUIRED_PROPERTY = "required";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("8f6aa372-6079-4618-8962-2668c3611de4")
    protected final Attribute elt;

    /**
     * Tells whether a {@link PropertyDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << PropertyDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("55e1ead2-6883-4404-b88b-963ff3ee1920")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << PropertyDefinitionType >> then instantiate a {@link PropertyDefinitionType} proxy.
     * 
     * @return a {@link PropertyDefinitionType} proxy on the created {@link Attribute}.
     */
    @objid ("a351b6b8-c291-4374-872a-2c6892c9d7ba")
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
    @objid ("d5d25c60-9eae-49e5-8ecf-d69d1b318a0d")
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
    @objid ("4c919c8f-d6ec-4507-814f-32523e0dd175")
    public static PropertyDefinitionType safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (PropertyDefinitionType.canInstantiate(obj))
        	return new PropertyDefinitionType(obj);
        else
        	throw new IllegalArgumentException("PropertyDefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8a37f487-812a-435b-8cf9-dffbf5ef7e35")
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
    @objid ("f8223646-4955-4a3f-ae08-110ddf13dd21")
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
    @objid ("76b98175-0b01-4331-a67a-5ccfd6909d15")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'PropertyDefinitionType.required'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("72c8a02b-8551-48e8-8709-7a5b97fd6bb7")
    public Boolean getRequired() {
        String value = this.elt.getProperty(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT,
                                            PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT.getName());
        if (value == null) {
          value = PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("32a09048-6001-4742-b113-c45b58aed85e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'PropertyDefinitionType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("05a10568-21e4-466e-8ca9-e9847de39284")
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
    @objid ("d9187dae-fe6d-4c51-9577-6dcb0d514112")
    public void setRequired(final Boolean value) {
        this.elt.setProperty(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT,
                             PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(PropertyDefinitionType.MdaTypes.REQUIRED_PROPERTY_ELT, value));
    }

    @objid ("b524f81d-c967-49e8-a7de-d7f456ca9147")
    protected  PropertyDefinitionType(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("491fe30b-6755-4b43-94bf-7f2f15b3ce59")
    public static final class MdaTypes {
        @objid ("81add728-a605-4f72-965b-313be4d7134f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad6895b9-4e86-4428-9505-f961914d26ec")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("edca8c5b-0bb4-4a40-9fac-fb83f8c0efac")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("df856f85-504a-49ec-a6d7-73093befe89b")
        private static Stereotype MDAASSOCDEP;

        @objid ("186d99b8-7122-45e9-8148-eed355f81421")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("91d1ef7f-7494-476e-9148-dbf6f18ba1f8")
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

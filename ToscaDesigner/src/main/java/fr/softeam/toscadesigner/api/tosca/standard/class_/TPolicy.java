/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 14:25 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TPolicy >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c6151804-ffa2-41b1-a19f-75a3542d7e94")
public class TPolicy implements IMdaProxy {
    @objid ("dfb242a4-b260-4fdb-810b-fc7d01a9c189")
    public static final String STEREOTYPE_NAME = "TPolicy";

    @objid ("a7f022ac-c029-4f37-a2e5-bd52b6890942")
    public static final String NAME_PROPERTY = "name";

    @objid ("49fb9672-ad4f-436f-b91e-fe723d5145bc")
    public static final String POLICYREF_PROPERTY = "policyRef";

    @objid ("99f9b08b-8924-4f92-96b0-2b4ce37b18da")
    public static final String POLICYTYPE_PROPERTY = "policyType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("d1f1bc5a-5a64-47c4-8ed2-3425c916069a")
    protected final Class elt;

    /**
     * Tells whether a {@link TPolicy proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPolicy >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b7819024-b06f-4374-8ddd-fae499924b0c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPolicy.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPolicy.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPolicy >> then instantiate a {@link TPolicy} proxy.
     * 
     * @return a {@link TPolicy} proxy on the created {@link Class}.
     */
    @objid ("0ac1066e-7d0b-477b-9be6-7f932230d2d7")
    public static TPolicy create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TPolicy.MdaTypes.STEREOTYPE_ELT);
        return TPolicy.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TPolicy} proxy from a {@link Class} stereotyped << TPolicy >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TPolicy} proxy or <i>null</i>.
     */
    @objid ("15cfc2e7-6ddd-49ba-8a5d-4ddb2e75c53e")
    public static TPolicy instantiate(final Class obj) {
        return TPolicy.canInstantiate(obj) ? new TPolicy(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPolicy} proxy from a {@link Class} stereotyped << TPolicy >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TPolicy} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b87410c5-c2fe-49d6-8980-a591565e4470")
    public static TPolicy safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPolicy.canInstantiate(obj))
        	return new TPolicy(obj);
        else
        	throw new IllegalArgumentException("TPolicy: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("58b5e5f0-99bf-42a4-bce9-c7f20faf3e89")
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
        TPolicy other = (TPolicy) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("49d81734-a0f6-44c2-be3c-bf2e5647051a")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPolicy.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("353327ee-1d33-42fe-a60e-1576fae9dd84")
    public String getName() {
        String value = this.elt.getProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                                            TPolicy.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicy.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicy.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ff6aa65b-3282-43eb-8ce1-0fe04c076ceb")
    public String getPolicyRef() {
        String value = this.elt.getProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                                            TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TPolicy.policyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("91c4e7a6-0789-495f-badb-68c4b9d0589b")
    public String getPolicyType() {
        String value = this.elt.getProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                                            TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("426f7b6c-f8a4-47a7-aca5-21494a1ce432")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TPolicy.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e6e11d08-e719-4a12-b73b-4cba10d854d4")
    public void setName(final String value) {
        this.elt.setProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                             TPolicy.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicy.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cf41bc2f-f82f-4716-ae3d-78fbe0f7256b")
    public void setPolicyRef(final String value) {
        this.elt.setProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                             TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TPolicy.policyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c6bf174f-2e8a-443d-9e9e-f78a7b29dc26")
    public void setPolicyType(final String value) {
        this.elt.setProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                             TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT, value));
    }

    @objid ("bbe79333-613a-48e1-8fb8-8d7448f48a13")
    protected  TPolicy(final Class elt) {
        this.elt = elt;
    }

    @objid ("9cdabba3-5ee3-4167-9304-34532fa22246")
    public static final class MdaTypes {
        @objid ("20443813-357f-41f9-8158-a18d9d493dcd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8c5de964-734b-4175-b23c-06359a62b5a2")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("570794be-fa81-4f06-8a13-97072ba86ae4")
        public static PropertyDefinition POLICYREF_PROPERTY_ELT;

        @objid ("6ab5e74c-3760-46a4-9da9-682f621d7fd3")
        public static PropertyDefinition POLICYTYPE_PROPERTY_ELT;

        @objid ("295e07f0-a295-4b0c-9afc-e6f738c4d56e")
        private static Stereotype MDAASSOCDEP;

        @objid ("e8411590-3325-4526-9ff0-82bca7243f4d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bdc712e1-e0d9-4c26-844b-ae257ee7aebb")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "afe2c9ed-9fab-4a53-a2d2-b52d849d0799", "TPolicy");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "3e41c1cd-e584-47d0-bae4-e8fc07eeefaa", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "874eaba3-7da2-496d-b724-a3f411e15532", "policyRef");
            POLICYREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICYREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "78876039-26c1-4105-aaab-0c4759def911", "policyType");
            POLICYTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICYTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

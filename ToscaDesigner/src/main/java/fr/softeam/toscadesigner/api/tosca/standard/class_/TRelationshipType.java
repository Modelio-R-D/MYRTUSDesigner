/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 17:44 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRelationshipType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("958fadb2-534c-4612-b8bd-126e26ed98ae")
public class TRelationshipType extends TEntityType implements IMdaProxy {
    @objid ("ad78a187-d354-46d5-96cb-5e9aeb3968f1")
    public static final String STEREOTYPE_NAME = "TRelationshipType";

    @objid ("b1be2586-be12-4006-bf74-1c8437c5601a")
    public static final String VALIDSOURCE_PROPERTY = "validSource";

    @objid ("db3aab58-4f31-455b-b9d5-cc42cefc9f43")
    public static final String VALIDTARGET_PROPERTY = "validTarget";

    /**
     * Tells whether a {@link TRelationshipType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRelationshipType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("54ac962e-fe58-48a0-ad89-2d27327a030d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRelationshipType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRelationshipType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRelationshipType >> then instantiate a {@link TRelationshipType} proxy.
     * 
     * @return a {@link TRelationshipType} proxy on the created {@link Class}.
     */
    @objid ("3c51ad6d-aa9b-42f0-89f7-d78d0846fa78")
    public static TRelationshipType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRelationshipType.MdaTypes.STEREOTYPE_ELT);
        return TRelationshipType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRelationshipType} proxy from a {@link Class} stereotyped << TRelationshipType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRelationshipType} proxy or <i>null</i>.
     */
    @objid ("98299228-72df-4155-88ac-aa555208c6fd")
    public static TRelationshipType instantiate(final Class obj) {
        return TRelationshipType.canInstantiate(obj) ? new TRelationshipType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipType} proxy from a {@link Class} stereotyped << TRelationshipType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRelationshipType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3ed5218b-61b3-4975-96b1-657765d08457")
    public static TRelationshipType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRelationshipType.canInstantiate(obj))
        	return new TRelationshipType(obj);
        else
        	throw new IllegalArgumentException("TRelationshipType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6705b91b-0750-4fd7-9fe5-7f976627572a")
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
        TRelationshipType other = (TRelationshipType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e2a8fef5-fb3e-41a7-9f61-7eab199b4d26")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TRelationshipType.validSource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5c90cf37-8290-4679-b2dd-ddfc85f121ae")
    public String getValidSource() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRelationshipType.validTarget'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ea9c2da9-fe26-45f1-a630-0e4f404d3ac5")
    public String getValidTarget() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("a6e9f754-0acb-4b0c-9752-046cc8bd7aeb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRelationshipType.validSource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bc3da81a-ca3c-4850-9baa-6ee4292f88f1")
    public void setValidSource(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.VALIDSOURCE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRelationshipType.validTarget'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7a0f9ef2-add6-4a0a-af28-98a8416a48db")
    public void setValidTarget(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value));
    }

    @objid ("0dc0771b-5b3f-47e1-a076-5c79764acbb9")
    protected  TRelationshipType(final Class elt) {
        super(elt);
    }

    @objid ("3bd93b11-3ef2-4171-8d51-f2f7c602caa3")
    public static final class MdaTypes {
        @objid ("1f7e412e-0160-4e7f-9427-e68756d0ebd8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("21871218-d761-4083-9c63-76d440fb04ed")
        public static PropertyDefinition VALIDSOURCE_PROPERTY_ELT;

        @objid ("af10d528-727a-4fde-a71f-ad40d05fd693")
        public static PropertyDefinition VALIDTARGET_PROPERTY_ELT;

        @objid ("5e50694a-1bf7-479c-ade5-07fe3f211ac0")
        private static Stereotype MDAASSOCDEP;

        @objid ("4bfe918c-1f7e-4eb2-ace2-ae1ab98e5298")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("796b2bec-27da-4daf-84ac-6cec011c1a9e")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1b11c098-c9e5-4e5d-beca-3351909bc6ce", "TRelationshipType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "45379b77-5fd9-43cb-b609-d61f124d9ff5", "validSource");
            VALIDSOURCE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALIDSOURCE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "2d6ef097-9a0f-47f3-87aa-5c168780ff23", "validTarget");
            VALIDTARGET_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALIDTARGET_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

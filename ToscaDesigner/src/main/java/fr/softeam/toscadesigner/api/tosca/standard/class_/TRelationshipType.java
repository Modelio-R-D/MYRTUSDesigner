/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 14:48 by Modelio Studio.
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
@objid ("486d9cdd-5e18-4145-a28d-45844e683527")
public class TRelationshipType extends TEntityType implements IMdaProxy {
    @objid ("a3e469c6-4e13-4729-bee4-818427b53741")
    public static final String STEREOTYPE_NAME = "TRelationshipType";

    @objid ("dd62aac0-1ff2-45ba-b707-d4a0cea8fb45")
    public static final String VALIDSOURCE_PROPERTY = "validSource";

    @objid ("4447026d-0539-4493-81bd-9009b69920ed")
    public static final String VALIDTARGET_PROPERTY = "validTarget";

    /**
     * Tells whether a {@link TRelationshipType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRelationshipType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f6371b1c-22d9-44aa-a3b8-ead0591e69e1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRelationshipType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRelationshipType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRelationshipType >> then instantiate a {@link TRelationshipType} proxy.
     * 
     * @return a {@link TRelationshipType} proxy on the created {@link Class}.
     */
    @objid ("4b0febd2-3664-47d2-b74a-4bd6054be5be")
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
    @objid ("e7cb403e-32c9-40b6-a841-37112e438355")
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
    @objid ("b579c172-f5aa-4b96-a377-17e5ae65a7fd")
    public static TRelationshipType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRelationshipType.canInstantiate(obj))
        	return new TRelationshipType(obj);
        else
        	throw new IllegalArgumentException("TRelationshipType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c053081a-ae91-4af7-a5e1-49caede16023")
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
    @objid ("6b887b4e-ed7f-4399-abf8-986895627ada")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TRelationshipType.validSource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("438168eb-c028-44b3-a79e-b209968eac75")
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
    @objid ("dcc3bfd2-ed0d-42eb-83e3-799c919ee7c0")
    public String getValidTarget() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("0c9aff07-14d8-4593-bd97-7d97f9a8f967")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRelationshipType.validSource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a7c2fe00-ab6c-4423-af73-7b0d667bad37")
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
    @objid ("320afe65-2cd8-4704-827b-90693db5e228")
    public void setValidTarget(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value));
    }

    @objid ("5a4e5d72-b277-4234-aa1b-256c469a06fa")
    protected  TRelationshipType(final Class elt) {
        super(elt);
    }

    @objid ("d8912adf-b64a-4e72-9d0d-aa6ebc2b2726")
    public static final class MdaTypes {
        @objid ("feb7cccb-e932-4573-843b-539f8a35ecbe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("62859e11-be2a-4f7d-962a-6b3537e2ffc5")
        public static PropertyDefinition VALIDSOURCE_PROPERTY_ELT;

        @objid ("c5f3cb63-38b1-4ee8-acd1-fa50ba630c37")
        public static PropertyDefinition VALIDTARGET_PROPERTY_ELT;

        @objid ("3a43d5f8-3306-4327-a2d3-47f7ccde3db2")
        private static Stereotype MDAASSOCDEP;

        @objid ("da7e3971-8c70-47f6-b5a4-c124500d7ba1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ec260372-c0fe-4bf8-9174-5d14d05a4ca5")
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

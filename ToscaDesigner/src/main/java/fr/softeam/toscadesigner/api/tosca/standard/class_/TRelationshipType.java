/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
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
@objid ("e0f3bc58-bf56-45c6-bfbf-a7927d06aac3")
public class TRelationshipType extends TEntityType implements IMdaProxy {
    @objid ("396498c3-4827-4042-821b-30a184701d6c")
    public static final String STEREOTYPE_NAME = "TRelationshipType";

    @objid ("e9e9e700-083b-444c-9197-cd5af6a64d3e")
    public static final String VALIDSOURCE_PROPERTY = "validSource";

    @objid ("42ed9d3a-f344-4f64-be63-ea4cccc248ac")
    public static final String VALIDTARGET_PROPERTY = "validTarget";

    /**
     * Tells whether a {@link TRelationshipType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRelationshipType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d9ece465-1838-4f5a-8423-47ddc3bbfdc3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRelationshipType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRelationshipType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRelationshipType >> then instantiate a {@link TRelationshipType} proxy.
     * @return a {@link TRelationshipType} proxy on the created {@link Class}.
     */
    @objid ("5f5de24c-de86-426e-92f0-68fabbeb8e1a")
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
    @objid ("b55f592d-133d-4c69-90b5-977656cd04a0")
    public static TRelationshipType instantiate(final Class obj) {
        return TRelationshipType.canInstantiate(obj) ? new TRelationshipType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipType} proxy from a {@link Class} stereotyped << TRelationshipType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRelationshipType} proxy.
     */
    @objid ("3220c3c7-feb7-4793-910d-a5d2fa11c5d6")
    public static TRelationshipType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRelationshipType.canInstantiate(obj))
            return new TRelationshipType(obj);
        else
            throw new IllegalArgumentException("TRelationshipType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b829c2ec-71b6-46e0-b2f4-733b3633039f")
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
    @objid ("92e96d5f-2bff-4a36-9692-24308eb97484")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TRelationshipType.validSource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c3fffe64-aaab-456f-934c-24736d95f435")
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
    @objid ("577ca9b6-37c1-42ea-b6e2-7decef39bfa7")
    public String getValidTarget() {
        String value = this.elt.getProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value, this.elt);
    }

    @objid ("ebaa3f26-176f-47f1-b1ff-005f9602e9d7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TRelationshipType.validSource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c630178a-3ffe-4aa2-a0ca-10d767599503")
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
    @objid ("a5e6d492-cb76-445e-8e19-512f55bfca15")
    public void setValidTarget(final String value) {
        this.elt.setProperty(TRelationshipType.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipType.MdaTypes.VALIDTARGET_PROPERTY_ELT, value));
    }

    @objid ("7afccb4a-fa05-45f1-93b4-58be84a56fed")
    protected  TRelationshipType(final Class elt) {
        super(elt);
    }

    @objid ("efc2caa7-56ae-4dd3-b10d-f655db155c94")
    public static final class MdaTypes {
        @objid ("4c495beb-19d3-4aae-ad9a-6532feb6892a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("54b5c9e9-edb1-4911-9c37-6f5611766e2e")
        public static PropertyDefinition VALIDSOURCE_PROPERTY_ELT;

        @objid ("9e086231-a31a-41e5-9229-62a7a742bae1")
        public static PropertyDefinition VALIDTARGET_PROPERTY_ELT;

        @objid ("5dcc7d13-809b-4aac-9c82-5b483ec6787f")
        private static Stereotype MDAASSOCDEP;

        @objid ("330d7e1b-c225-4000-bdb2-e77daa2e76a5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a37fbd63-da95-439d-9d61-a8e218eb82e7")
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

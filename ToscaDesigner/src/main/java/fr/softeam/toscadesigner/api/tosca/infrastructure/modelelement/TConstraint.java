/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 23/09/2024 12:50 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("828b2130-7574-4ae9-9838-db05af212523")
public class TConstraint implements IMdaProxy {
    @objid ("c202f6fd-0182-4822-ae50-d202ea0f7d3c")
    public static final String STEREOTYPE_NAME = "TConstraint";

    @objid ("6715de17-884c-4041-ad9f-7ddf330e11ac")
    public static final String ANY_PROPERTY = "any";

    @objid ("02d1d019-7ade-4c03-bad6-ac8eba65ebcf")
    public static final String CONSTRAINTTYPE_PROPERTY = "constraintType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("a801ff0d-c58e-4889-8f90-a058f62f5bf5")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("295536b7-07d6-43cf-80c5-efcaf215dc86")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TConstraint.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TConstraint.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TConstraint >> then instantiate a {@link TConstraint} proxy.
     * 
     * @return a {@link TConstraint} proxy on the created {@link ModelElement}.
     */
    @objid ("03e0534d-03cc-45eb-aeb8-80a11aeb099f")
    public static TConstraint create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TConstraint.MdaTypes.STEREOTYPE_ELT);
        return TConstraint.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TConstraint} proxy from a {@link ModelElement} stereotyped << TConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TConstraint} proxy or <i>null</i>.
     */
    @objid ("248d1cbc-f877-4be9-88d9-8d7916da90aa")
    public static TConstraint instantiate(final ModelElement obj) {
        return TConstraint.canInstantiate(obj) ? new TConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TConstraint} proxy from a {@link ModelElement} stereotyped << TConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6b0d4143-7082-4ae0-b81f-b970f306e0c5")
    public static TConstraint safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TConstraint.canInstantiate(obj))
        	return new TConstraint(obj);
        else
        	throw new IllegalArgumentException("TConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("95cb2628-7f4c-40d4-b344-96f3bb757d5a")
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
        TConstraint other = (TConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TConstraint.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c9b2f96f-aff0-4efd-b5d0-f5ca1ad4c855")
    public String getAny() {
        String value = this.elt.getProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                                            TConstraint.MdaTypes.ANY_PROPERTY_ELT.getName());
        if (value == null) {
          value = TConstraint.MdaTypes.ANY_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TConstraint.MdaTypes.ANY_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TConstraint.constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d8de9c3f-4067-4a47-885b-98260df91a26")
    public String getConstraintType() {
        String value = this.elt.getProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                                            TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("ecd429f2-491a-4b0e-aa29-0f1ce1073897")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("3c3095d0-feed-47a8-b1b6-44dfcf84c724")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TConstraint.any'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("83190ed6-f87f-4853-81bb-936c2cfec549")
    public void setAny(final String value) {
        this.elt.setProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                             TConstraint.MdaTypes.ANY_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TConstraint.MdaTypes.ANY_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TConstraint.constraintType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e7e1db50-5fa2-4a3b-b622-284148e56b28")
    public void setConstraintType(final String value) {
        this.elt.setProperty(TConstraint.MdaTypes.STEREOTYPE_ELT,
                             TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TConstraint.MdaTypes.CONSTRAINTTYPE_PROPERTY_ELT, value));
    }

    @objid ("d66faccd-68fd-4d11-9daf-f91ad1d85dbd")
    protected  TConstraint(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("632c46d2-f11b-4edd-96cf-89f8acfb07ff")
    public static final class MdaTypes {
        @objid ("5ff6ee36-4ef4-499f-bbfa-9cfa7a0a4b07")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c26197ab-f493-4b88-90f1-a4c9a05ddabe")
        public static PropertyDefinition ANY_PROPERTY_ELT;

        @objid ("7070835e-db49-415c-ba9c-c63e989277eb")
        public static PropertyDefinition CONSTRAINTTYPE_PROPERTY_ELT;

        @objid ("19f8a475-138f-4eeb-911c-eddb6d99c266")
        private static Stereotype MDAASSOCDEP;

        @objid ("9d8bab01-f76e-4eb6-8c0e-24377e652483")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("91b87f2b-bdd5-470f-9f84-22bbaea66aa6")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "78fc63ae-0ad0-45f4-840f-4dbadc0922cb", "TConstraint");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "919faa40-beb7-4c4d-81e3-95ffcaf681a3", "any");
            ANY_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ANY_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "e6d29f3f-38de-4a5f-b204-5e04f31c4ada", "constraintType");
            CONSTRAINTTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CONSTRAINTTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRequirementDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("9e1ab52e-2d17-4990-b78e-b4b1ab6cedaa")
public class TRequirementDefinition implements IMdaProxy {
    @objid ("5f39ac1a-543a-4f5a-b1ac-a7c365d6c7a9")
    public static final String STEREOTYPE_NAME = "TRequirementDefinition";

    @objid ("07750225-be20-413c-94ba-fd2c808bf4ef")
    public static final String LOWERBOUND_TAGTYPE = "lowerBound";

    @objid ("682d41f5-aa0e-46be-ba73-56aca10632d1")
    public static final String NAME_TAGTYPE = "name";

    @objid ("d7c4c38f-a2a4-4da8-8a8e-4abfdb40de77")
    public static final String REQUIREMENTTYPE_TAGTYPE = "requirementType";

    @objid ("bbb0781d-9488-4bfc-a3a6-c65f798bf1bb")
    public static final String UPPERBOUND_TAGTYPE = "upperBound";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("a82bec20-e6b8-48bf-89d6-79c3ebebde26")
    protected final Class elt;

    /**
     * Tells whether a {@link TRequirementDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRequirementDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bdb7b58c-8996-4317-ba3d-bfa9ce06e176")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRequirementDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRequirementDefinition >> then instantiate a {@link TRequirementDefinition} proxy.
     * 
     * @return a {@link TRequirementDefinition} proxy on the created {@link Class}.
     */
    @objid ("7faa6f0c-dc00-4eff-b1de-e69e8326de8c")
    public static TRequirementDefinition create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRequirementDefinition.MdaTypes.STEREOTYPE_ELT);
        return TRequirementDefinition.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinition} proxy from a {@link Class} stereotyped << TRequirementDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRequirementDefinition} proxy or <i>null</i>.
     */
    @objid ("4347af66-7f6f-459a-9fba-607aa0db754d")
    public static TRequirementDefinition instantiate(final Class obj) {
        return TRequirementDefinition.canInstantiate(obj) ? new TRequirementDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirementDefinition} proxy from a {@link Class} stereotyped << TRequirementDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRequirementDefinition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("179ff492-46b6-41a3-99e7-ea1bd9fd2ee8")
    public static TRequirementDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRequirementDefinition.canInstantiate(obj))
        	return new TRequirementDefinition(obj);
        else
        	throw new IllegalArgumentException("TRequirementDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("62c624e5-bcc6-49a4-a6ec-67434c6c6658")
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
        TRequirementDefinition other = (TRequirementDefinition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e9ac3b14-ac49-4f72-9cc3-4abef659b885")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("63e44e4d-2734-468c-82e9-d55035ec0de0")
    public String getLowerBound() {
        return this.elt.getTagValue(TRequirementDefinition.MdaTypes.LOWERBOUND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("195ba03d-da97-4070-86f2-5564b413ed2d")
    public String getName() {
        return this.elt.getTagValue(TRequirementDefinition.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'requirementType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2d3f7ff5-c58a-499a-bb12-bc6a724e05af")
    public String getRequirementType() {
        return this.elt.getTagValue(TRequirementDefinition.MdaTypes.REQUIREMENTTYPE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a118a847-8946-4544-a16a-10e6ecde1bf9")
    public String getUpperBound() {
        return this.elt.getTagValue(TRequirementDefinition.MdaTypes.UPPERBOUND_TAGTYPE_ELT);
    }

    @objid ("27d89ba4-7b41-49f6-a67d-f7bb91e51e0b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0c434c9e-10b0-4940-a016-b8509a7988f2")
    public void setLowerBound(final String value) {
        this.elt.putTagValue(TRequirementDefinition.MdaTypes.LOWERBOUND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b0167aab-7c55-4f8e-bbbb-ad04db915b4d")
    public void setName(final String value) {
        this.elt.putTagValue(TRequirementDefinition.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'requirementType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("be9ad719-007c-43ef-8888-a5b47f8c0653")
    public void setRequirementType(final String value) {
        this.elt.putTagValue(TRequirementDefinition.MdaTypes.REQUIREMENTTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("937efb1a-2418-452a-bd32-282e45e10547")
    public void setUpperBound(final String value) {
        this.elt.putTagValue(TRequirementDefinition.MdaTypes.UPPERBOUND_TAGTYPE_ELT, value);
    }

    @objid ("1937297f-7a19-4b6f-bf87-d28b515366d3")
    protected  TRequirementDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("d720aa6f-d002-462e-9991-6e10fa36e5a4")
    public static final class MdaTypes {
        @objid ("83347e5f-af4d-46f5-a62a-79530401ef2d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("41e970b3-2ceb-48c0-b3a3-ef56b2a1d00d")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("4eb877c5-9ef4-48dc-ae20-3e2c564c8d3f")
        public static TagType LOWERBOUND_TAGTYPE_ELT;

        @objid ("b329e40b-ff0c-4c88-a889-acbeca208318")
        public static TagType UPPERBOUND_TAGTYPE_ELT;

        @objid ("e1c828e4-c4d2-4fd6-b2ec-d64047056f66")
        public static TagType REQUIREMENTTYPE_TAGTYPE_ELT;

        @objid ("c25baf25-83b2-4a2d-8d42-275b7e67c227")
        private static Stereotype MDAASSOCDEP;

        @objid ("9d034574-76bc-4305-b8ef-a923f42952e8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f8340107-123d-4f60-88db-b00c2110cf31")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2637c4bd-ca93-4012-82ea-8ef2ba5ca444", "TRequirementDefinition");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "1ebf9eaf-408b-4998-b9ec-fb33da299f99", "name");
            NAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (NAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "aa21a993-773c-4ca5-8ec7-ec23f8ef5bf7", "lowerBound");
            LOWERBOUND_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (LOWERBOUND_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "ca00f259-49c6-497f-b835-c0dd99741ace", "upperBound");
            UPPERBOUND_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (UPPERBOUND_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "049ab71b-8ecb-4688-81a6-25d36a905aac", "requirementType");
            REQUIREMENTTYPE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (REQUIREMENTTYPE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 15:34 by Modelio Studio.
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
@objid ("11a1107c-0baf-4124-af63-7051028ba55b")
public class TPolicy implements IMdaProxy {
    @objid ("81dd614e-b885-43cb-bc98-f21f0d435d19")
    public static final String STEREOTYPE_NAME = "TPolicy";

    @objid ("c01b9359-48b7-4f61-b94d-9cde4cb44260")
    public static final String NAME_PROPERTY = "name";

    @objid ("2ad67b05-84f6-492c-8267-0d65184b2bec")
    public static final String POLICYREF_PROPERTY = "policyRef";

    @objid ("b034e270-5378-42bb-bf58-2348de636cfd")
    public static final String POLICYTYPE_PROPERTY = "policyType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("88dcd27a-ffbd-42a2-b772-2aea4c7a9b94")
    protected final Class elt;

    /**
     * Tells whether a {@link TPolicy proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPolicy >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("11f15ef3-1163-4f07-b237-21d95d556aff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPolicy.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPolicy.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPolicy >> then instantiate a {@link TPolicy} proxy.
     * 
     * @return a {@link TPolicy} proxy on the created {@link Class}.
     */
    @objid ("1cd1cb1e-97ea-446d-9f19-0cf19dedd87a")
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
    @objid ("e32cfe4e-59b8-4dfc-8c56-212c2b29ab03")
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
    @objid ("dbecdde3-7619-4b0c-8912-991a3efa46d0")
    public static TPolicy safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPolicy.canInstantiate(obj))
        	return new TPolicy(obj);
        else
        	throw new IllegalArgumentException("TPolicy: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("24790581-aa99-4f92-bf03-1a25f08a3930")
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
    @objid ("6d925a03-faf8-44e8-a2ec-1d3c89d6b37a")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPolicy.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2a9b5ec0-6f08-458f-8969-c8b5a09604cf")
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
    @objid ("b076789b-3561-4eec-91d5-ef36d7327009")
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
    @objid ("d6fceae1-3153-4d0d-a090-4fdf06a01c55")
    public String getPolicyType() {
        String value = this.elt.getProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                                            TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("77f8febc-277a-4843-867e-ebf1eb9ac74e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TPolicy.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c1936cf7-a5b6-4a91-ba50-80aad6f0777e")
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
    @objid ("4e8f5a7d-0aa3-4ff1-86f0-363116de0c40")
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
    @objid ("9702a7fe-66f4-4c70-99ec-0eaff100d00a")
    public void setPolicyType(final String value) {
        this.elt.setProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                             TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT, value));
    }

    @objid ("3a852230-2cbf-42bd-a89c-6c525cf4f5bd")
    protected  TPolicy(final Class elt) {
        this.elt = elt;
    }

    @objid ("90f91afd-172e-45bb-8a64-0054e3ddf067")
    public static final class MdaTypes {
        @objid ("e45c9168-3d6c-409f-9155-061aaf58d8d1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c7ed6ed7-ce5f-4a06-9a1e-47ccb319e80a")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("a8e58916-86db-4f37-9863-7a4b2ef00d65")
        public static PropertyDefinition POLICYREF_PROPERTY_ELT;

        @objid ("54a4f673-4463-427d-bd94-a99e047c24cc")
        public static PropertyDefinition POLICYTYPE_PROPERTY_ELT;

        @objid ("22a49c57-cc98-4eeb-862b-ebc6c61a9aa3")
        private static Stereotype MDAASSOCDEP;

        @objid ("5e2e6783-d62f-4b89-896e-f20a15a57ac8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("59c0ca0f-96d5-429f-ac16-d8b432fb45ad")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TCapabilityRef >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("78a5addc-4381-42a5-b755-736fb01f5c45")
public class TCapabilityRef implements IMdaProxy {
    @objid ("fd70074c-7d13-497b-9f87-424a3d950c9c")
    public static final String STEREOTYPE_NAME = "TCapabilityRef";

    @objid ("ae7cb93a-cf8d-4f8b-83c0-92793994a099")
    public static final String NAME_PROPERTY = "name";

    @objid ("91e794c6-0f5e-4f98-b07e-422b35ea0793")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("104eef60-97d7-4223-8415-03266863ece9")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TCapabilityRef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TCapabilityRef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("db35da5b-f83f-4bbc-9202-fb458050dbaf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TCapabilityRef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TCapabilityRef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TCapabilityRef >> then instantiate a {@link TCapabilityRef} proxy.
     * 
     * @return a {@link TCapabilityRef} proxy on the created {@link ModelElement}.
     */
    @objid ("2481dd79-6f96-4b0e-bd59-1e87358a2dd1")
    public static TCapabilityRef create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TCapabilityRef.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityRef.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityRef} proxy from a {@link ModelElement} stereotyped << TCapabilityRef >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TCapabilityRef} proxy or <i>null</i>.
     */
    @objid ("26f912b4-dfe2-4d92-bb5e-bac01a44830e")
    public static TCapabilityRef instantiate(final ModelElement obj) {
        return TCapabilityRef.canInstantiate(obj) ? new TCapabilityRef(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityRef} proxy from a {@link ModelElement} stereotyped << TCapabilityRef >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TCapabilityRef} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5eb03d12-ab38-4bd4-a3f1-d8693eb43355")
    public static TCapabilityRef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TCapabilityRef.canInstantiate(obj))
        	return new TCapabilityRef(obj);
        else
        	throw new IllegalArgumentException("TCapabilityRef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d2d18d82-29d6-4550-b8ca-a198d00a25fe")
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
        TCapabilityRef other = (TCapabilityRef) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("e67d265e-7bc8-4ebc-a5b9-af67c6c8463c")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TCapabilityRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cb655368-2767-42aa-9e89-7147e6916d8a")
    public String getName() {
        String value = this.elt.getProperty(TCapabilityRef.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityRef.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityRef.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityRef.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TCapabilityRef.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aec98a65-9f54-4f0a-a2f9-05f7f7ad3499")
    public String getRef() {
        String value = this.elt.getProperty(TCapabilityRef.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityRef.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityRef.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityRef.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("4dfcb904-2ed8-4efa-9391-c4c87bff599f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TCapabilityRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("675361f7-176f-411e-a4b8-ea81cd1b4c96")
    public void setName(final String value) {
        this.elt.setProperty(TCapabilityRef.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityRef.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityRef.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityRef.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f02b381c-973d-42c8-8f14-0687622fca71")
    public void setRef(final String value) {
        this.elt.setProperty(TCapabilityRef.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityRef.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityRef.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("b4c25e99-4cfa-4f5e-bd59-bf648a42f217")
    protected  TCapabilityRef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("25723398-a97f-4aa8-98d3-4c0d7925e318")
    public static final class MdaTypes {
        @objid ("8133431c-87d2-4524-81a7-dae71754ae2f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6f36220f-ff69-4aeb-80c2-e10ef14d9d59")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("afdb4ac0-2587-46fb-bb0a-9e2f3641c8f8")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("72f973d3-cba2-4baa-9c51-6852f03721c6")
        private static Stereotype MDAASSOCDEP;

        @objid ("8f33551f-2c18-424c-ad03-1ad8f0746a7d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6f7b82a4-aaa7-467e-9c15-7180adbf9cfc")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "ca7c07e5-454b-4d20-8f3d-6949dc4be7fd", "TCapabilityRef");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "cd1cff1f-be76-441b-98a5-771bdff3c02b", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "fc4c56a2-5405-4410-8ce2-b12a6d2480ec", "ref");
            REF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

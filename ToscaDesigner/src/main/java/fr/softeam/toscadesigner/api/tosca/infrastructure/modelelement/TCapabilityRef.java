/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 18/02/2025 10:30 by Modelio Studio.
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
    @objid ("8cedc4be-e9c8-43f3-9f21-13b5d8a46bac")
    public static final String STEREOTYPE_NAME = "TCapabilityRef";

    @objid ("0ccdafbb-020a-402c-ba94-3b1d3b93cb03")
    public static final String NAME_PROPERTY = "name";

    @objid ("c93ca3bb-b837-4309-8474-17331cf0d66b")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("14ca7440-93fc-41c5-9581-3b78b3902a3f")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TCapabilityRef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TCapabilityRef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a6c33928-5bbc-4044-9190-ba323b247981")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TCapabilityRef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TCapabilityRef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TCapabilityRef >> then instantiate a {@link TCapabilityRef} proxy.
     * 
     * @return a {@link TCapabilityRef} proxy on the created {@link ModelElement}.
     */
    @objid ("adbc2c33-d042-48e3-90ec-ce264fa746ab")
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
    @objid ("8e10a482-4972-4b18-8e56-f86352e622f3")
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
    @objid ("3400b640-15c8-41da-9cb2-0ee00695a382")
    public static TCapabilityRef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TCapabilityRef.canInstantiate(obj))
        	return new TCapabilityRef(obj);
        else
        	throw new IllegalArgumentException("TCapabilityRef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a0ea67be-2663-4120-b463-225fe3039ceb")
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
    @objid ("d6814527-88ca-4db6-b0f9-62de42f4eff4")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TCapabilityRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d47e46d8-d2ec-437c-be7d-448811ef866d")
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
    @objid ("d6eabbb1-6862-481c-a968-5837c01d450a")
    public String getRef() {
        String value = this.elt.getProperty(TCapabilityRef.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityRef.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityRef.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityRef.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("b4c1b9dc-3de6-4074-9245-0b82adb78ae1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TCapabilityRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a18b75d0-0336-4faa-844b-1f9344c87bde")
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
    @objid ("56588234-939c-47f9-ac4d-81e31a9603a3")
    public void setRef(final String value) {
        this.elt.setProperty(TCapabilityRef.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityRef.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityRef.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("128caac4-2b09-4a00-9692-f71411a87a70")
    protected  TCapabilityRef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("25723398-a97f-4aa8-98d3-4c0d7925e318")
    public static final class MdaTypes {
        @objid ("a0c63b15-0051-4497-a78d-caf361875f3c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c0e71362-688f-464c-89ef-6def84f1cc22")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("209b8485-b7a1-4ccc-a281-4946f08631b1")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("3d35d689-fc1d-4a9f-bb02-77ff126d4312")
        private static Stereotype MDAASSOCDEP;

        @objid ("2639bc29-2007-4b6d-a95b-69adc398c776")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c322c036-a3ee-49e6-a3a4-308ac7419ac8")
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

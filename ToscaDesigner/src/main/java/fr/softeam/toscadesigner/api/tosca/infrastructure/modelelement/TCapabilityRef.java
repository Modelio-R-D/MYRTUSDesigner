/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 15:34 by Modelio Studio.
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
@objid ("708c80de-0689-4aca-8b4f-b7460fe3d062")
public class TCapabilityRef implements IMdaProxy {
    @objid ("36e312a5-c677-45c5-a25f-3d2ce37ceb32")
    public static final String STEREOTYPE_NAME = "TCapabilityRef";

    @objid ("36c418d4-9ce0-4485-9ac6-89d12a6eb17e")
    public static final String NAME_PROPERTY = "name";

    @objid ("b7f6fc06-1427-483f-a208-f4e8bb4d9c4c")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("82b9bf66-08d4-49c5-9fdf-f3a772d587e0")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TCapabilityRef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TCapabilityRef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5a634c9c-9b7d-47c3-87ad-41693b629a54")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TCapabilityRef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TCapabilityRef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TCapabilityRef >> then instantiate a {@link TCapabilityRef} proxy.
     * 
     * @return a {@link TCapabilityRef} proxy on the created {@link ModelElement}.
     */
    @objid ("225c0531-fb4c-458e-973b-3caedd0e21d7")
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
    @objid ("825f59ed-bef7-44b5-9896-40fcac27a838")
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
    @objid ("350b5db4-c751-4113-9143-cc3e72365861")
    public static TCapabilityRef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TCapabilityRef.canInstantiate(obj))
        	return new TCapabilityRef(obj);
        else
        	throw new IllegalArgumentException("TCapabilityRef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("81097284-3747-42ec-aae8-66a095f4ec77")
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
    @objid ("b3370367-23fc-4040-8eed-0d9ba1590cc7")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TCapabilityRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5e980c43-559f-4507-aa5b-b158938cfd3c")
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
    @objid ("8e54f982-6a35-490c-9fc7-6d723906423b")
    public String getRef() {
        String value = this.elt.getProperty(TCapabilityRef.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityRef.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityRef.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityRef.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("544f0f09-2214-4c11-9ba3-37dff81ee822")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TCapabilityRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5677bda3-3979-4d4b-9cda-e0869ddb30ee")
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
    @objid ("cfb8259c-776d-4183-a6f6-a19563b2e4aa")
    public void setRef(final String value) {
        this.elt.setProperty(TCapabilityRef.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityRef.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityRef.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("f74ea83c-cd85-44da-8fdb-bb037ce46e1f")
    protected  TCapabilityRef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("315a129a-3028-40d3-a806-68e40f0a573c")
    public static final class MdaTypes {
        @objid ("4efff79d-a7cd-4250-907b-f906f76aabb5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b346e3f2-9323-40a1-91b4-cbfbb0d81e68")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("4b051a27-59b7-4d1a-98f5-02615dc9067e")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("409391a8-7e11-4bbf-bb17-3c96c129b868")
        private static Stereotype MDAASSOCDEP;

        @objid ("b2fe9a39-997d-48bf-b29c-ef290a037289")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c723080b-22cd-49e1-80b1-e87c51691bc8")
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

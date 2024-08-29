/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 17:58 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TRequirementRef >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8d7d221d-d51c-4ce1-af13-588e9701aa0b")
public class TRequirementRef implements IMdaProxy {
    @objid ("005f1e89-2d91-48dd-9dfe-9631a76a6bc8")
    public static final String STEREOTYPE_NAME = "TRequirementRef";

    @objid ("d4103d5c-e5a9-415a-8cbb-dc9123d43599")
    public static final String NAME_PROPERTY = "name";

    @objid ("b2aca990-290d-4bea-a29a-f3cc5e1dba5d")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("7ff3845c-4e8d-4176-925c-ff8bbce56748")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TRequirementRef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TRequirementRef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6b3b7180-e904-42a4-9e02-cec6046c2c88")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TRequirementRef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TRequirementRef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TRequirementRef >> then instantiate a {@link TRequirementRef} proxy.
     * 
     * @return a {@link TRequirementRef} proxy on the created {@link ModelElement}.
     */
    @objid ("3eade75a-af03-4b38-bc91-ac42f8e3af0e")
    public static TRequirementRef create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TRequirementRef.MdaTypes.STEREOTYPE_ELT);
        return TRequirementRef.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TRequirementRef} proxy from a {@link ModelElement} stereotyped << TRequirementRef >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TRequirementRef} proxy or <i>null</i>.
     */
    @objid ("181571aa-85c3-4611-9865-cff546a3e3b0")
    public static TRequirementRef instantiate(final ModelElement obj) {
        return TRequirementRef.canInstantiate(obj) ? new TRequirementRef(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRequirementRef} proxy from a {@link ModelElement} stereotyped << TRequirementRef >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TRequirementRef} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f6ada57e-42aa-4a17-9f3c-15fab46e3118")
    public static TRequirementRef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TRequirementRef.canInstantiate(obj))
        	return new TRequirementRef(obj);
        else
        	throw new IllegalArgumentException("TRequirementRef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d0635fc0-f043-4681-8597-5bb59b930141")
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
        TRequirementRef other = (TRequirementRef) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("7f7be657-e585-4954-a63f-63de0ce1efae")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirementRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("16218194-30be-4b54-bcce-91d3e9e6034b")
    public String getName() {
        String value = this.elt.getProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementRef.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementRef.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementRef.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TRequirementRef.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("815f1613-4431-48d2-916e-ca0b2f3d5305")
    public String getRef() {
        String value = this.elt.getProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementRef.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementRef.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementRef.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("3044d13f-98ca-44e1-8f14-fd67ca91c155")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirementRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("17977321-2bc5-49ab-a1a1-4dd883f194ce")
    public void setName(final String value) {
        this.elt.setProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                             TRequirementRef.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementRef.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TRequirementRef.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b1a59034-9312-4c38-983c-c77ffad04d63")
    public void setRef(final String value) {
        this.elt.setProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                             TRequirementRef.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementRef.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("f879d8b4-6072-4a00-adaf-9beb9961cea5")
    protected  TRequirementRef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("b8bc06c3-cb0f-4434-9455-84385a3e6e9e")
    public static final class MdaTypes {
        @objid ("924559b7-a85c-491a-aee1-adaa6271a8cb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fe97075d-deaf-4722-95c2-f7bff10b55f6")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("68f78b17-7916-4796-b09d-b07726c436ec")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("01d5d138-6041-4241-a983-1c5571fdee57")
        private static Stereotype MDAASSOCDEP;

        @objid ("76458d72-6042-4b20-8804-33f076bdddf7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5260cada-0e6d-4468-9de0-4e9cf56e8745")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "179fadf7-b82d-47bc-ae58-40df62e045ed", "TRequirementRef");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "100afbca-9f3b-49e3-ac91-f1465edc6002", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d9c4cff9-b58a-410a-9b68-f76a8879a37f", "ref");
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

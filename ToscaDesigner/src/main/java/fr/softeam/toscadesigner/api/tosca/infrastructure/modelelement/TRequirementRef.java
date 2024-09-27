/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 25/09/2024 11:42 by Modelio Studio.
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
@objid ("f08cdaaa-b9ee-4017-b609-0f69ca484deb")
public class TRequirementRef implements IMdaProxy {
    @objid ("b84fedc3-b3c7-4209-b885-1109a214d68d")
    public static final String STEREOTYPE_NAME = "TRequirementRef";

    @objid ("63829994-fbea-4b5a-8ffb-f66fef8e2ab6")
    public static final String NAME_PROPERTY = "name";

    @objid ("52ffd258-99dd-4617-9fc9-27e2fac57bba")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("deb61a1f-d5f1-4f83-981c-b2256075b25f")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TRequirementRef proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TRequirementRef >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cda8fae4-b360-4f9f-a385-53d6aa95d761")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TRequirementRef.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TRequirementRef.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TRequirementRef >> then instantiate a {@link TRequirementRef} proxy.
     * 
     * @return a {@link TRequirementRef} proxy on the created {@link ModelElement}.
     */
    @objid ("0ea79572-af1d-4453-8c7c-05c69f914b21")
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
    @objid ("c620887b-3f2d-421f-9693-0d1a1d61e381")
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
    @objid ("ac3c5663-7422-4bd7-bfd3-0d76fa29ed4c")
    public static TRequirementRef safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TRequirementRef.canInstantiate(obj))
        	return new TRequirementRef(obj);
        else
        	throw new IllegalArgumentException("TRequirementRef: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("644e0403-bb06-4ca0-914c-734fbe8ab4df")
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
    @objid ("8374845a-2dba-4591-9e97-36771856bc81")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TRequirementRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6b7699e8-084e-4491-8b3f-4512feab81f4")
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
    @objid ("fc0e3910-5788-4f8f-a54a-8c9d34fa2550")
    public String getRef() {
        String value = this.elt.getProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                                            TRequirementRef.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRequirementRef.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRequirementRef.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("91737c3e-3197-452b-9630-6126314ceab0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRequirementRef.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2356a983-ff44-460a-ba9e-d418a3737ea9")
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
    @objid ("ec3ff84f-c041-4e5e-8ffb-d086836246d4")
    public void setRef(final String value) {
        this.elt.setProperty(TRequirementRef.MdaTypes.STEREOTYPE_ELT,
                             TRequirementRef.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRequirementRef.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("b4eaacd6-3989-487a-8705-28c1987f2bb8")
    protected  TRequirementRef(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("9f245e37-3cd8-402f-95d1-59ce405f5b45")
    public static final class MdaTypes {
        @objid ("cdf5965f-b3e8-4b20-b9d2-d6bad2953973")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("72d98292-836d-4da7-8208-05e3a12ed051")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("6ee0722a-2a06-4c47-ae59-8ad39ea91e0c")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("c0e0fd92-151e-4ea2-91fc-d641e120824c")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb83d68f-013f-4562-95f7-23ed2ae980a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("edeca2b8-c3ed-4d42-8863-141b5f0af086")
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

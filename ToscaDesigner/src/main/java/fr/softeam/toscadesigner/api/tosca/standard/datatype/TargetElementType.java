/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.datatype;

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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link DataType} with << TargetElementType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5a7df5ee-a349-4d1d-b616-d95f1830f7d2")
public class TargetElementType implements IMdaProxy {
    @objid ("42404273-96bb-4dc1-a0bb-905da314f036")
    public static final String STEREOTYPE_NAME = "TargetElementType";

    @objid ("ce8bd32e-828b-434f-a572-36b8536e6d18")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("75864698-d255-4e16-8980-edbdd8822c23")
    protected final DataType elt;

    /**
     * Tells whether a {@link TargetElementType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << TargetElementType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("23785326-e082-415b-a62e-a1217787203a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (TargetElementType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(TargetElementType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << TargetElementType >> then instantiate a {@link TargetElementType} proxy.
     * 
     * @return a {@link TargetElementType} proxy on the created {@link DataType}.
     */
    @objid ("3242dcb7-9d4a-4a96-af58-d610b8d540f1")
    public static TargetElementType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.DataType");
        e.getExtension().add(TargetElementType.MdaTypes.STEREOTYPE_ELT);
        return TargetElementType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link TargetElementType} proxy from a {@link DataType} stereotyped << TargetElementType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link TargetElementType} proxy or <i>null</i>.
     */
    @objid ("c60f1c05-d8f8-4897-bc55-5faeeca32c7a")
    public static TargetElementType instantiate(final DataType obj) {
        return TargetElementType.canInstantiate(obj) ? new TargetElementType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TargetElementType} proxy from a {@link DataType} stereotyped << TargetElementType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link TargetElementType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2ffc304b-929f-4ef5-896a-dd89f636f888")
    public static TargetElementType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (TargetElementType.canInstantiate(obj))
        	return new TargetElementType(obj);
        else
        	throw new IllegalArgumentException("TargetElementType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("aa3f9ac0-84c8-4153-a44e-28c16b2feea0")
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
        TargetElementType other = (TargetElementType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("60a263b5-0fa3-460e-80b6-8240123887b5")
    public DataType getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TargetElementType.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("51f1b6d4-5ba4-4083-9106-4ea5d01de89a")
    public String getRef() {
        String value = this.elt.getProperty(TargetElementType.MdaTypes.STEREOTYPE_ELT,
                                            TargetElementType.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TargetElementType.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TargetElementType.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("42d8e80b-b673-4af9-a95b-0f1386944f27")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TargetElementType.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4aba9cd2-83e7-4541-b4d9-24dfc916e754")
    public void setRef(final String value) {
        this.elt.setProperty(TargetElementType.MdaTypes.STEREOTYPE_ELT,
                             TargetElementType.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TargetElementType.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("23840e29-dd3c-410a-97cc-62f7843f91a2")
    protected  TargetElementType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("e1940a7e-84ea-4215-89e7-edc92684f236")
    public static final class MdaTypes {
        @objid ("d7d7cd4a-2dcd-4cd9-b6b6-0e38d17679e3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a3296706-b179-40ba-91b8-3aa204bf9bfd")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("1674a186-bdaf-4299-b2a3-4c0646b87adc")
        private static Stereotype MDAASSOCDEP;

        @objid ("17ac19ed-62e1-414d-aaeb-e4f45484adf7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("adb49527-5750-487e-bcaa-fe6b0166cf1e")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "e4524aff-a7ca-4e8c-b752-7f45c18399b6", "TargetElementType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "07aaa61d-8bc3-4fee-a845-aecb61d10bf5", "ref");
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

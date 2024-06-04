/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
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
 * Proxy class to handle a {@link DataType} with << MaxInstancesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e628c6d7-9490-4e0e-bf0b-cc9838aa0277")
public class MaxInstancesType implements IMdaProxy {
    @objid ("23850e64-e609-46f7-a48a-b9c27e15ed8c")
    public static final String STEREOTYPE_NAME = "MaxInstancesType";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("e87732af-5709-4dbe-869f-e0b22ca5fa54")
    protected final DataType elt;

    /**
     * Tells whether a {@link MaxInstancesType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << MaxInstancesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("05c4552d-a79f-4edd-8628-01869ecfcdec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (MaxInstancesType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(MaxInstancesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << MaxInstancesType >> then instantiate a {@link MaxInstancesType} proxy.
     * 
     * @return a {@link MaxInstancesType} proxy on the created {@link DataType}.
     */
    @objid ("37412b5e-8701-4a56-889c-e7c0270e87be")
    public static MaxInstancesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.DataType");
        e.getExtension().add(MaxInstancesType.MdaTypes.STEREOTYPE_ELT);
        return MaxInstancesType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link MaxInstancesType} proxy from a {@link DataType} stereotyped << MaxInstancesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link MaxInstancesType} proxy or <i>null</i>.
     */
    @objid ("ef885a28-46ff-4b85-9170-0238f6485ce7")
    public static MaxInstancesType instantiate(final DataType obj) {
        return MaxInstancesType.canInstantiate(obj) ? new MaxInstancesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MaxInstancesType} proxy from a {@link DataType} stereotyped << MaxInstancesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link MaxInstancesType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("eeb183bc-face-4bae-b2e8-122df45c6248")
    public static MaxInstancesType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (MaxInstancesType.canInstantiate(obj))
        	return new MaxInstancesType(obj);
        else
        	throw new IllegalArgumentException("MaxInstancesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c11685be-5a3d-451f-b7f1-8499ca69e544")
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
        MaxInstancesType other = (MaxInstancesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("ef81e306-8c6b-42cb-97bf-0e091371f125")
    public DataType getElement() {
        return this.elt;
    }

    @objid ("19259f4a-9602-42b1-ba47-2ddb5a401c5a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("53b79d4e-d6ad-485d-b3b4-081143c22654")
    protected  MaxInstancesType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("0fc31de4-720b-424c-a90a-28fb10fc1423")
    public static final class MdaTypes {
        @objid ("71ae97ef-0c16-40d7-871c-5f77e0757747")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8dac04a1-7ae2-4e63-9e31-ab6e948b9456")
        private static Stereotype MDAASSOCDEP;

        @objid ("950807a1-918a-419a-9319-e62cb9e47f5b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4ede3e87-c6fd-4a57-8127-e1250049460f")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "5ca26f44-8e56-452a-a303-8660f79a79fa", "MaxInstancesType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
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

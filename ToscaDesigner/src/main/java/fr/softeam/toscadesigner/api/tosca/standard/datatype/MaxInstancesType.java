/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 15:45 by Modelio Studio.
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
    @objid ("2dd22090-c693-4fbd-b587-65c90600f8c8")
    public static final String STEREOTYPE_NAME = "MaxInstancesType";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("232ae8b1-d859-490d-9715-6e1c1363d461")
    protected final DataType elt;

    /**
     * Tells whether a {@link MaxInstancesType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << MaxInstancesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fb74ad1e-f9f4-427b-9fc4-c4edc6d48677")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (MaxInstancesType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(MaxInstancesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << MaxInstancesType >> then instantiate a {@link MaxInstancesType} proxy.
     * 
     * @return a {@link MaxInstancesType} proxy on the created {@link DataType}.
     */
    @objid ("c93eb287-420b-462d-bb22-621a9d53f80f")
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
    @objid ("f74ab0f1-8fd1-4208-8eaf-f189dcc4f886")
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
    @objid ("5c6dfd6b-d6d0-41b8-ae6d-8b8a620068df")
    public static MaxInstancesType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (MaxInstancesType.canInstantiate(obj))
        	return new MaxInstancesType(obj);
        else
        	throw new IllegalArgumentException("MaxInstancesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bd6d0859-1fd3-43f3-bdd4-2cc3981afc3b")
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
    @objid ("f386a606-63f3-4db9-83ed-d59cfe561aef")
    public DataType getElement() {
        return this.elt;
    }

    @objid ("170e2b2b-fca4-454f-a657-055239c19cef")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("0e2aadb9-02ec-4e9b-979b-c4dcb9260cce")
    protected  MaxInstancesType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("0fc31de4-720b-424c-a90a-28fb10fc1423")
    public static final class MdaTypes {
        @objid ("396e11f2-1497-42ec-9a2e-ea15c664cc49")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d1a5b80-5e52-42be-8fb6-0ca1af090f7a")
        private static Stereotype MDAASSOCDEP;

        @objid ("9676caec-2fbb-4e31-8919-6cdeac4293d2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3883a3d5-fcbe-4dbc-8d88-1d1dc64d1f8a")
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

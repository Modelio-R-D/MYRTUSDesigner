/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 01/03/2024 11:13 by Modelio Studio.
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
@objid ("b70845c6-0284-4f00-9e45-cb8e470c1c36")
public class MaxInstancesType implements IMdaProxy {
    @objid ("3aa69ff5-2171-448c-a4d1-c77d805b0930")
    public static final String STEREOTYPE_NAME = "MaxInstancesType";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("5bd34ed5-6be0-4c5b-b10e-01cb540c0c93")
    protected final DataType elt;

    /**
     * Tells whether a {@link MaxInstancesType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << MaxInstancesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d6d33f8a-da4b-42c9-bf41-70998aa2514e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (MaxInstancesType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(MaxInstancesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << MaxInstancesType >> then instantiate a {@link MaxInstancesType} proxy.
     * 
     * @return a {@link MaxInstancesType} proxy on the created {@link DataType}.
     */
    @objid ("ee059d62-a6ec-4bf3-9e65-a5cf3769c957")
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
    @objid ("a2e6a87c-e588-41ec-b6b6-0fc93f911e3b")
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
    @objid ("317c6268-9421-4d27-b62f-f64b33688d2a")
    public static MaxInstancesType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (MaxInstancesType.canInstantiate(obj))
        	return new MaxInstancesType(obj);
        else
        	throw new IllegalArgumentException("MaxInstancesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7f636343-a670-4361-a7c9-043d430a33f6")
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
    @objid ("772ecb47-73cf-47a2-b99c-f63bdf55a937")
    public DataType getElement() {
        return this.elt;
    }

    @objid ("d52f87e5-697e-467b-b2e0-3804942cd992")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("63f3156a-328e-46dc-bbd0-02c28388fda8")
    protected  MaxInstancesType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("da92b2d2-8b0d-40ac-b415-a712c1859213")
    public static final class MdaTypes {
        @objid ("55eac8ca-0d55-4bf9-9361-18440d45b842")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8b3de225-a5c4-432b-a817-a2926bba303e")
        private static Stereotype MDAASSOCDEP;

        @objid ("816003e9-869b-4247-a441-99916f1cb781")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bc33a617-210b-4fd2-b125-2777e14b87d4")
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

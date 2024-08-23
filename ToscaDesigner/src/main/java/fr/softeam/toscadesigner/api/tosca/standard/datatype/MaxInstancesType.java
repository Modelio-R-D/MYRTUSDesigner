/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 12/06/2024 14:58 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.datatype;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link DataType} with << MaxInstancesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f3ff9d57-0b41-499f-a2f5-9ee87bff9b23")
public class MaxInstancesType implements IMdaProxy {
    @objid ("5aba0967-9e71-4575-8161-db4ff3b2abb4")
    public static final String STEREOTYPE_NAME = "MaxInstancesType";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     * 
     */
    @objid ("1e6cece0-4c7d-44ed-8b7e-3dcb89079e7a")
    protected final DataType elt;

    /**
     * Tells whether a {@link MaxInstancesType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << MaxInstancesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e7e226c3-7604-4f01-9c56-14afcb158bfe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (MaxInstancesType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(MaxInstancesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << MaxInstancesType >> then instantiate a {@link MaxInstancesType} proxy.
     * @return a {@link MaxInstancesType} proxy on the created {@link DataType}.
     */
    @objid ("01c37c8f-1c4b-4b53-86c8-5984a5979f5d")
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
    @objid ("577252ff-7d97-4f46-8ba7-b5449a9436bc")
    public static MaxInstancesType instantiate(final DataType obj) {
        return MaxInstancesType.canInstantiate(obj) ? new MaxInstancesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MaxInstancesType} proxy from a {@link DataType} stereotyped << MaxInstancesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link MaxInstancesType} proxy.
     */
    @objid ("ab9bc23a-d373-42f7-ba8f-f670b88d9a2b")
    public static MaxInstancesType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (MaxInstancesType.canInstantiate(obj))
            return new MaxInstancesType(obj);
        else
            throw new IllegalArgumentException("MaxInstancesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("07cac1ea-d4f5-4ae1-a309-00e2060f4f35")
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
    @objid ("5e9ded7d-a363-46a8-81e7-9cf9c10b391a")
    public DataType getElement() {
        return this.elt;
    }

    @objid ("79c7fb6e-f34a-4c45-9d83-bf57e5784f68")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c8605e1f-cbf8-431b-9f24-b589c2a8acbf")
    protected  MaxInstancesType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("b2afe135-c084-4684-a08e-4913ad089e92")
    public static final class MdaTypes {
        @objid ("bb51b088-0db2-49d2-840d-835d9a6b28f5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9059760d-4589-4d62-88f4-c2a1af1ff271")
        private static Stereotype MDAASSOCDEP;

        @objid ("8adcaccf-7613-4ffc-a788-1fe1c005ee80")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f67ffaf8-83c2-45f4-bff7-dcc693f9f3d8")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:38 by Modelio Studio.
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
    @objid ("123deebb-0676-49a8-804c-fe51df71ae58")
    public static final String STEREOTYPE_NAME = "MaxInstancesType";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("9e48d4a4-d5fc-450b-aa80-7171cbb465f3")
    protected final DataType elt;

    /**
     * Tells whether a {@link MaxInstancesType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << MaxInstancesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1f183c62-4802-4196-85d9-14b970e7a3b3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (MaxInstancesType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(MaxInstancesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << MaxInstancesType >> then instantiate a {@link MaxInstancesType} proxy.
     * 
     * @return a {@link MaxInstancesType} proxy on the created {@link DataType}.
     */
    @objid ("5846cd1c-16ff-4edc-8630-6b06dc44341f")
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
    @objid ("accaab32-d71a-453f-8ec9-85e9e53ec0df")
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
    @objid ("dc615020-3693-429b-90e3-196c3c848007")
    public static MaxInstancesType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (MaxInstancesType.canInstantiate(obj))
        	return new MaxInstancesType(obj);
        else
        	throw new IllegalArgumentException("MaxInstancesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("838e6a52-034f-4b48-b9b0-5e9905e937df")
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
    @objid ("49a09d33-80af-4bfd-89ee-8224102d26cf")
    public DataType getElement() {
        return this.elt;
    }

    @objid ("2dc1022e-4e99-4b6a-9351-700dcb7b215f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("4fd0f6c7-b982-4218-aa8f-2c8d33d8b8b1")
    protected  MaxInstancesType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("da92b2d2-8b0d-40ac-b415-a712c1859213")
    public static final class MdaTypes {
        @objid ("09743ce2-3cdc-434a-b590-4066e67d2d18")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bb7fcf55-ca51-4f32-bd7f-a930ab8a2701")
        private static Stereotype MDAASSOCDEP;

        @objid ("2197f322-1c99-46bb-a43c-460236739ca1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("76baecac-2e03-4fa9-91aa-26baf9bc9625")
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

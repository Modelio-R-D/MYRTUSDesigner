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
 * Proxy class to handle a {@link DataType} with << TargetElementType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7bc405fd-f364-46f4-bd6d-a2c461aef28f")
public class TargetElementType implements IMdaProxy {
    @objid ("0c729e75-21d4-49c8-a33b-20777194e5d9")
    public static final String STEREOTYPE_NAME = "TargetElementType";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("b6d7e862-56e5-472d-aac5-f2005499e4ae")
    protected final DataType elt;

    /**
     * Tells whether a {@link TargetElementType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << TargetElementType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("454d6160-a123-4d8e-8489-76bfb81441d1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (TargetElementType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(TargetElementType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << TargetElementType >> then instantiate a {@link TargetElementType} proxy.
     * 
     * @return a {@link TargetElementType} proxy on the created {@link DataType}.
     */
    @objid ("3c00b311-eb7a-48af-b3f5-24463d030b6f")
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
    @objid ("9c9193d7-bbc7-46a4-9c1e-e003c5dbd4ae")
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
    @objid ("eb7371a3-7b58-4e2c-8fc7-f4fdb335750c")
    public static TargetElementType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (TargetElementType.canInstantiate(obj))
        	return new TargetElementType(obj);
        else
        	throw new IllegalArgumentException("TargetElementType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9b87aff3-a521-48a0-ba1d-9c84546c876e")
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
    @objid ("79683728-59b8-44f4-abe2-7310af9f1c80")
    public DataType getElement() {
        return this.elt;
    }

    @objid ("1976dd9c-bc73-4672-b833-21c86ea10154")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("3f57d242-863e-4bf5-92b4-f4cc87b877c3")
    protected  TargetElementType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("a55a01dc-ad8b-4c82-b312-dc88c293dcde")
    public static final class MdaTypes {
        @objid ("082b3ab5-98f9-4861-8c09-63eae67da87f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1354d007-a451-4bbc-93cc-63efc64e9d59")
        private static Stereotype MDAASSOCDEP;

        @objid ("fb89b38f-6e81-4797-ab69-9739ae4b83a4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d268c73b-942f-42b0-915e-a68516158964")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "e4524aff-a7ca-4e8c-b752-7f45c18399b6", "TargetElementType");
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

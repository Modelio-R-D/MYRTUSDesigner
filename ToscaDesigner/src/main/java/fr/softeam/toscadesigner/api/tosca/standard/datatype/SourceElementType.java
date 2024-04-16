/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
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
 * Proxy class to handle a {@link DataType} with << SourceElementType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c9a6c6e0-fa8e-4178-80a3-fcd19ed16591")
public class SourceElementType implements IMdaProxy {
    @objid ("66c97449-2776-48f0-96d7-3bf9059bbaad")
    public static final String STEREOTYPE_NAME = "SourceElementType";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("d2b1ddf9-d481-423d-a782-18261387c8de")
    protected final DataType elt;

    /**
     * Tells whether a {@link SourceElementType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << SourceElementType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bc09afd8-f9a0-4393-a914-7da97fa21fef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (SourceElementType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(SourceElementType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << SourceElementType >> then instantiate a {@link SourceElementType} proxy.
     * 
     * @return a {@link SourceElementType} proxy on the created {@link DataType}.
     */
    @objid ("dbe329cb-d4ba-402c-afa4-e36884ff8fb5")
    public static SourceElementType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.DataType");
        e.getExtension().add(SourceElementType.MdaTypes.STEREOTYPE_ELT);
        return SourceElementType.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link SourceElementType} proxy from a {@link DataType} stereotyped << SourceElementType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link SourceElementType} proxy or <i>null</i>.
     */
    @objid ("5ac4bbe0-7d42-4ab2-bbaf-ec0843b9acc0")
    public static SourceElementType instantiate(final DataType obj) {
        return SourceElementType.canInstantiate(obj) ? new SourceElementType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SourceElementType} proxy from a {@link DataType} stereotyped << SourceElementType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link SourceElementType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8ba2b9e1-f6b4-470f-ac5d-7677b8b9a305")
    public static SourceElementType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (SourceElementType.canInstantiate(obj))
        	return new SourceElementType(obj);
        else
        	throw new IllegalArgumentException("SourceElementType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f7c8d4d1-4cd8-4b09-9926-ad0cd6ee6029")
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
        SourceElementType other = (SourceElementType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("7a7c2b0f-d58f-4afc-8f2c-38a99be1e415")
    public DataType getElement() {
        return this.elt;
    }

    @objid ("fc94a73a-0643-481d-85f7-e1c822ce06af")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("d8f33353-38f1-4864-968a-d748b79632b2")
    protected  SourceElementType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("ddf35d0f-ace7-46eb-8026-f7e425846e98")
    public static final class MdaTypes {
        @objid ("099a98b4-da95-40f4-854d-05ae72afef07")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("95d4dae0-6cd4-4550-b90e-53a270fcda8e")
        private static Stereotype MDAASSOCDEP;

        @objid ("fe26e9a4-a710-48df-a1ab-c8300880eae8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3ffa26cc-e018-49ba-9d8a-f6b702d1b954")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "4c7a9935-4795-4b01-bba1-4e88b3f061d6", "SourceElementType");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 16:04 by Modelio Studio.
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
@objid ("991a9be8-5c25-4e55-a773-3d69398c6ad3")
public class SourceElementType implements IMdaProxy {
    @objid ("892cb26e-e6bf-437d-adc1-5126033d8125")
    public static final String STEREOTYPE_NAME = "SourceElementType";

    @objid ("2c547d66-ed89-4c7b-b139-eca5033303bb")
    public static final String REF_TAGTYPE = "ref";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("9c6624d1-3344-4b27-8c92-6ad3539691ea")
    protected final DataType elt;

    /**
     * Tells whether a {@link SourceElementType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << SourceElementType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b730e48a-33fb-4bdd-93a6-c9eb64087b98")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (SourceElementType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(SourceElementType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << SourceElementType >> then instantiate a {@link SourceElementType} proxy.
     * 
     * @return a {@link SourceElementType} proxy on the created {@link DataType}.
     */
    @objid ("f9c36529-5f25-4aed-952c-2689ae1f7408")
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
    @objid ("1a22ec35-138b-43b8-b7f6-0e699c1cc8d7")
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
    @objid ("4f91525e-b320-45f0-ba18-965d26b93214")
    public static SourceElementType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (SourceElementType.canInstantiate(obj))
        	return new SourceElementType(obj);
        else
        	throw new IllegalArgumentException("SourceElementType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ce81b09e-cc02-41b8-901a-9ed76acf10fa")
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
    @objid ("74134ce7-729d-4ebc-b450-7503abf61e6c")
    public DataType getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0b1fadcf-8e62-4981-9ee8-dff04722a1d5")
    public String getRef() {
        return this.elt.getTagValue(SourceElementType.MdaTypes.REF_TAGTYPE_ELT);
    }

    @objid ("8f6bcb42-507d-4032-9790-569004356c98")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ea33db1e-3021-4912-b064-df069033bcdf")
    public void setRef(final String value) {
        this.elt.putTagValue(SourceElementType.MdaTypes.REF_TAGTYPE_ELT, value);
    }

    @objid ("e1742773-151c-496d-afdd-339492e52b3a")
    protected  SourceElementType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("ef123d4f-0e90-4f28-9acb-a4042f55c3fb")
    public static final class MdaTypes {
        @objid ("dab0983a-94d8-457b-be1d-cde2c60c3ddb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a98cf4ce-5958-4265-999c-47dce6ead456")
        public static TagType REF_TAGTYPE_ELT;

        @objid ("87404c95-916c-469d-85cc-03be64f93e57")
        private static Stereotype MDAASSOCDEP;

        @objid ("90142909-5f28-4e57-91c9-f9595a1f09c7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9e05193e-e114-4834-9c2f-73ad2819fb13")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "4c7a9935-4795-4b01-bba1-4e88b3f061d6", "SourceElementType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "3bade1e4-3a43-4c6f-906c-27dca8e8590b", "ref");
            REF_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (REF_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

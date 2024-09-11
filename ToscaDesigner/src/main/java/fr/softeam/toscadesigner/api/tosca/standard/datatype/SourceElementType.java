/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 14:25 by Modelio Studio.
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
    @objid ("24ca061b-2801-436b-bd73-f6c3300a0e3c")
    public static final String STEREOTYPE_NAME = "SourceElementType";

    @objid ("0362618f-55ae-4307-9769-51d0ea98f5d7")
    public static final String REF_TAGTYPE = "ref";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("45f13a0c-d118-42e4-a6cf-622bd9bc397e")
    protected final DataType elt;

    /**
     * Tells whether a {@link SourceElementType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << SourceElementType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4cf40fa6-f503-4d82-8dbe-41a36d983e2f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (SourceElementType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(SourceElementType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << SourceElementType >> then instantiate a {@link SourceElementType} proxy.
     * 
     * @return a {@link SourceElementType} proxy on the created {@link DataType}.
     */
    @objid ("68978de2-110a-4848-823b-13ab21aecc28")
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
    @objid ("eca1cd03-0636-499e-b693-a8e5c4b8bf9a")
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
    @objid ("580234fb-6962-4970-a436-7bbf644ab9bc")
    public static SourceElementType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (SourceElementType.canInstantiate(obj))
        	return new SourceElementType(obj);
        else
        	throw new IllegalArgumentException("SourceElementType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("73245b7a-e100-4d9f-9817-58a0fc3e02b8")
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
    @objid ("12df4fef-b927-4348-8882-0ec7bc76fab6")
    public DataType getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4aa91a85-33c3-4ae7-a6a6-7ec5010a9e19")
    public String getRef() {
        return this.elt.getTagValue(SourceElementType.MdaTypes.REF_TAGTYPE_ELT);
    }

    @objid ("7a3b1e4b-417f-4610-8abc-66edd3750468")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("17482d9c-04dc-47ea-bc00-8e3a234dc088")
    public void setRef(final String value) {
        this.elt.putTagValue(SourceElementType.MdaTypes.REF_TAGTYPE_ELT, value);
    }

    @objid ("994d4f8b-6c67-42a1-b751-81febc067590")
    protected  SourceElementType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("ef123d4f-0e90-4f28-9acb-a4042f55c3fb")
    public static final class MdaTypes {
        @objid ("073adf3e-309b-43f5-b405-d5b462bf886d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("324becf3-d36a-4c55-8f71-398be3395f98")
        public static TagType REF_TAGTYPE_ELT;

        @objid ("c129e887-d04d-4ad6-a645-effa6662b990")
        private static Stereotype MDAASSOCDEP;

        @objid ("9139d7a5-b3df-4bcd-9995-1ee57d8769f4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6dead40d-7f2a-41ae-89a4-663e75ecc488")
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

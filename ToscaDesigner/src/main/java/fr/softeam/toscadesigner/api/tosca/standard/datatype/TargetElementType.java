/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.datatype;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link DataType} with << TargetElementType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("3f3c6c20-daeb-4a4b-ad29-954da0dc30e4")
public class TargetElementType implements IMdaProxy {
    @objid ("a42c6c2a-33ed-4e8f-a5ca-8043eb42905a")
    public static final String STEREOTYPE_NAME = "TargetElementType";

    @objid ("ad560b2e-97df-4764-984e-8209d19617e8")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     * 
     */
    @objid ("e4a8a555-7308-46da-bd80-c74275c5dd1b")
    protected final DataType elt;

    /**
     * Tells whether a {@link TargetElementType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << TargetElementType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("77e150f6-b6d2-49b3-a5de-bb802f823131")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (TargetElementType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(TargetElementType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << TargetElementType >> then instantiate a {@link TargetElementType} proxy.
     * @return a {@link TargetElementType} proxy on the created {@link DataType}.
     */
    @objid ("bd74c27d-dec1-46f3-b817-c2c8783569a4")
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
    @objid ("84326550-e772-4363-8839-53c4a7a1f7a4")
    public static TargetElementType instantiate(final DataType obj) {
        return TargetElementType.canInstantiate(obj) ? new TargetElementType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TargetElementType} proxy from a {@link DataType} stereotyped << TargetElementType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link TargetElementType} proxy.
     */
    @objid ("06d8d4b0-0888-49de-967d-b41b8fffa89f")
    public static TargetElementType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (TargetElementType.canInstantiate(obj))
            return new TargetElementType(obj);
        else
            throw new IllegalArgumentException("TargetElementType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0dd328df-dafb-4998-923f-78828c14cba1")
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
    @objid ("8c5ecc3f-6b62-4864-823b-ab9f4320def2")
    public DataType getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TargetElementType.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1fc40357-ad25-4666-8872-8525fabc8eb9")
    public String getRef() {
        String value = this.elt.getProperty(TargetElementType.MdaTypes.STEREOTYPE_ELT,
                                            TargetElementType.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TargetElementType.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TargetElementType.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
    }

    @objid ("36ddfb7c-a03b-4906-8594-b7cddc98470a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TargetElementType.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2306f8c0-e935-4e09-81c9-a1b0786e2cd8")
    public void setRef(final String value) {
        this.elt.setProperty(TargetElementType.MdaTypes.STEREOTYPE_ELT,
                             TargetElementType.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TargetElementType.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("6acb2d16-2ca3-4b12-9def-f071fd1b982a")
    protected  TargetElementType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("b0543def-7999-4e0d-98b4-51295316267e")
    public static final class MdaTypes {
        @objid ("b1f037c1-a5b2-4f22-9b63-656cba69d24d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9b905b91-3298-473d-804c-d28fc020044d")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("b448b3a3-f39b-49f7-a3bd-d4aab376332e")
        private static Stereotype MDAASSOCDEP;

        @objid ("70ef40a0-0677-4a5c-8b51-113aa3755066")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("71d2f676-6f74-4b0e-b296-edd1594df7f3")
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

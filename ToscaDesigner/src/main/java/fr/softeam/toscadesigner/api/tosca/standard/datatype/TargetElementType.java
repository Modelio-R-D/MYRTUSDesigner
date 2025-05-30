/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 22/05/2025 15:07 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.datatype;

import java.util.ArrayList;
import java.util.List;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link DataType} with << TargetElementType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("56caeace-dc82-426e-ae89-3d8ea8b10e74")
public class TargetElementType implements IMdaProxy {
    @objid ("1d3def4c-c915-4f92-90ee-ff61f948b55b")
    public static final String STEREOTYPE_NAME = "TargetElementType";

    @objid ("a6ee6446-2f30-4081-9f90-d808aebdf67f")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("22ac61e6-4792-4a7b-85d9-befec25af42d")
    protected final DataType elt;

    /**
     * Tells whether a {@link TargetElementType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << TargetElementType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("433f0993-adc2-4ab2-bf0e-6547ce23292c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (TargetElementType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(TargetElementType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << TargetElementType >> then instantiate a {@link TargetElementType} proxy.
     * 
     * @return a {@link TargetElementType} proxy on the created {@link DataType}.
     */
    @objid ("6fd30383-2dd7-4bf4-af04-ed797f6aee75")
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
    @objid ("bc7ffa1b-fdb8-41f5-a31d-69a40580055d")
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
    @objid ("6e5f8d2b-ed20-4e41-8db1-5e5b03a2fbf0")
    public static TargetElementType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (TargetElementType.canInstantiate(obj))
        	return new TargetElementType(obj);
        else
        	throw new IllegalArgumentException("TargetElementType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2081007d-30d2-4426-95a0-e3eca2ebeefa")
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
    @objid ("d13da1c8-c73e-4c09-bb3d-0b97868dbac9")
    public DataType getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TargetElementType.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8d5b3bb6-7bc1-4705-820c-d2b01dbb88fa")
    public String getRef() {
        String value = this.elt.getProperty(TargetElementType.MdaTypes.STEREOTYPE_ELT,
                                            TargetElementType.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TargetElementType.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TargetElementType.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("7e2274b5-e027-4a98-9baa-9addcfcc0c6d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TargetElementType.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("68a5d4e3-2020-47a3-a955-f49486368975")
    public void setRef(final String value) {
        this.elt.setProperty(TargetElementType.MdaTypes.STEREOTYPE_ELT,
                             TargetElementType.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TargetElementType.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("c3f64868-cb53-4f09-979e-713b0403acc9")
    protected  TargetElementType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("8f360f40-2aa6-444f-84d1-949ddcd969a7")
    public static final class MdaTypes {
        @objid ("48f6f96a-6a8b-4f42-a7e2-a959e9f52aeb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("afa83476-0505-49e1-8361-c339a9bfb34e")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("272429ba-d47d-46a1-aae1-624ff60a1be6")
        private static Stereotype MDAASSOCDEP;

        @objid ("64a44d94-a4ca-4a53-b1c9-e16dafc5726f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8437384b-62fb-442b-98d7-8c340ce27eff")
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

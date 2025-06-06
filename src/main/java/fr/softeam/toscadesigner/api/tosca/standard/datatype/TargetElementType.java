/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 04/06/2025 20:07 by Modelio Studio.
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
@objid ("39884998-3aa0-4945-96b6-c0e29ded9803")
public class TargetElementType implements IMdaProxy {
    @objid ("bdfe2104-b51b-4ba8-b086-5e76ae784170")
    public static final String STEREOTYPE_NAME = "TargetElementType";

    @objid ("bfc5b85b-0615-4ee5-be97-bd653d50aad4")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("1452a3c2-306f-4e32-a3f0-326b39251059")
    protected final DataType elt;

    /**
     * Tells whether a {@link TargetElementType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << TargetElementType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("16a1c5ac-2679-412f-b093-370b84a81d3e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (TargetElementType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(TargetElementType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << TargetElementType >> then instantiate a {@link TargetElementType} proxy.
     * 
     * @return a {@link TargetElementType} proxy on the created {@link DataType}.
     */
    @objid ("b5753e7f-99bd-4a72-83c5-5d5c4dcc50bf")
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
    @objid ("35add1a9-1a70-4536-a07a-594ae5a16311")
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
    @objid ("6810ecb0-01b5-46cc-a1be-28f54bb7f372")
    public static TargetElementType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (TargetElementType.canInstantiate(obj))
        	return new TargetElementType(obj);
        else
        	throw new IllegalArgumentException("TargetElementType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("078f84f0-a559-4744-8ed3-686d6f319abb")
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
    @objid ("f373b764-8e30-4f15-ba51-f89254d68e92")
    public DataType getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TargetElementType.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2a906412-c291-44b6-84de-012c827b830d")
    public String getRef() {
        String value = this.elt.getProperty(TargetElementType.MdaTypes.STEREOTYPE_ELT,
                                            TargetElementType.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TargetElementType.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TargetElementType.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("a5f7d922-f752-4224-bb2d-0023dbbfc623")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TargetElementType.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bc28ab9f-a065-454f-817c-00e1d2e8721d")
    public void setRef(final String value) {
        this.elt.setProperty(TargetElementType.MdaTypes.STEREOTYPE_ELT,
                             TargetElementType.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TargetElementType.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("26bdb37f-d84a-4e9c-9b57-8eff301bbc0c")
    protected  TargetElementType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("1b29ebc1-bde2-4a43-8e67-e1787b96d0d6")
    public static final class MdaTypes {
        @objid ("77fe7bd7-3cc0-4b82-b0ef-ca3a59c9f09d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2ac4804c-8b96-4946-a718-3108fb277545")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("5175a4fd-e4fd-4c4b-afef-dad02e11e167")
        private static Stereotype MDAASSOCDEP;

        @objid ("78f8b6e4-ac46-4107-8423-ed5251909417")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2477dbf0-cf23-4774-9f85-f3a64e5e0143")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 09/04/2025 17:17 by Modelio Studio.
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
@objid ("56caeace-dc82-426e-ae89-3d8ea8b10e74")
public class TargetElementType implements IMdaProxy {
    @objid ("158aa593-1a71-4354-a3a1-c392a7d75ab0")
    public static final String STEREOTYPE_NAME = "TargetElementType";

    @objid ("08331506-af1b-45ab-855a-7ef0bec62d5f")
    public static final String REF_PROPERTY = "ref";

    /**
     * The underlying {@link DataType} represented by this proxy, never null.
     */
    @objid ("1e232bc1-f520-4f41-966a-d0775e3dd4be")
    protected final DataType elt;

    /**
     * Tells whether a {@link TargetElementType proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << TargetElementType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a94c957a-8e33-4ad6-93c1-d839bf78fdac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && (TargetElementType.MdaTypes.STEREOTYPE_ELT!=null) && ((DataType) elt).isStereotyped(TargetElementType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link DataType} stereotyped << TargetElementType >> then instantiate a {@link TargetElementType} proxy.
     * 
     * @return a {@link TargetElementType} proxy on the created {@link DataType}.
     */
    @objid ("11a57b8c-78f3-4f80-9b7e-6027414b6f31")
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
    @objid ("db96af6b-99e5-4f63-8e8b-020def90a1d1")
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
    @objid ("b17734ad-e31d-4829-9d35-80c940d60b3e")
    public static TargetElementType safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (TargetElementType.canInstantiate(obj))
        	return new TargetElementType(obj);
        else
        	throw new IllegalArgumentException("TargetElementType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e0c9cea3-f11a-4078-8fb5-9503f6dd1285")
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
    @objid ("90b40e80-670d-4837-b1d4-8c758b6badb2")
    public DataType getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TargetElementType.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6c5a0770-5deb-4747-b5fb-f9efd00492f5")
    public String getRef() {
        String value = this.elt.getProperty(TargetElementType.MdaTypes.STEREOTYPE_ELT,
                                            TargetElementType.MdaTypes.REF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TargetElementType.MdaTypes.REF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TargetElementType.MdaTypes.REF_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("df39b110-2879-4ccb-ae29-97bd790c3fb9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TargetElementType.ref'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("032b9bda-f309-4cd4-b011-ca489b388e6c")
    public void setRef(final String value) {
        this.elt.setProperty(TargetElementType.MdaTypes.STEREOTYPE_ELT,
                             TargetElementType.MdaTypes.REF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TargetElementType.MdaTypes.REF_PROPERTY_ELT, value));
    }

    @objid ("08f4dde4-83fb-4652-8aa4-e4ae0aff27e2")
    protected  TargetElementType(final DataType elt) {
        this.elt = elt;
    }

    @objid ("8f360f40-2aa6-444f-84d1-949ddcd969a7")
    public static final class MdaTypes {
        @objid ("65dd9e15-8a49-4933-aba8-2605d7d7a7b4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c3bee057-b1c7-4e5b-9afb-71c94ac81ee1")
        public static PropertyDefinition REF_PROPERTY_ELT;

        @objid ("86d06da6-5c54-406c-b73c-26b067e2d2a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("c697f9f9-25fc-4dd9-8520-366f8ae0e3af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("59c06cce-8eb0-430f-81a0-d7074baad8b7")
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

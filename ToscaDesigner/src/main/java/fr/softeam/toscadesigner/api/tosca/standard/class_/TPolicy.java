/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/08/2024 17:44 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << TPolicy >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1a679ae5-62fc-4931-bb5e-dcdca549d4d9")
public class TPolicy implements IMdaProxy {
    @objid ("befcaf3e-bb3d-4f7b-a4d1-8f7f69f58ccf")
    public static final String STEREOTYPE_NAME = "TPolicy";

    @objid ("e238d855-5f37-4482-b7a4-e01322b98e91")
    public static final String NAME_PROPERTY = "name";

    @objid ("7423542e-96c5-452b-8920-c9e9fa918599")
    public static final String POLICYREF_PROPERTY = "policyRef";

    @objid ("144f8463-699e-4bac-a92f-c0e19f16f25d")
    public static final String POLICYTYPE_PROPERTY = "policyType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("b20815c6-509c-4cc7-9f98-56f15bca5323")
    protected final Class elt;

    /**
     * Tells whether a {@link TPolicy proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPolicy >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("02c2d6b8-8ca9-4b1c-81c9-3d74b1516357")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPolicy.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPolicy.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPolicy >> then instantiate a {@link TPolicy} proxy.
     * @return a {@link TPolicy} proxy on the created {@link Class}.
     */
    @objid ("922133e1-bdb9-468c-8bfd-d42b14b22996")
    public static TPolicy create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TPolicy.MdaTypes.STEREOTYPE_ELT);
        return TPolicy.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TPolicy} proxy from a {@link Class} stereotyped << TPolicy >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TPolicy} proxy or <i>null</i>.
     */
    @objid ("64d3e24a-5221-494b-a3ed-b74000df3cc3")
    public static TPolicy instantiate(final Class obj) {
        return TPolicy.canInstantiate(obj) ? new TPolicy(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPolicy} proxy from a {@link Class} stereotyped << TPolicy >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TPolicy} proxy.
     */
    @objid ("3394980a-3b5f-46bd-8d8c-a78790e724ce")
    public static TPolicy safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPolicy.canInstantiate(obj))
            return new TPolicy(obj);
        else
            throw new IllegalArgumentException("TPolicy: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f26cafd4-de5d-4713-bd7e-f0c8430c4a93")
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
        TPolicy other = (TPolicy) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("faa09150-35ad-4eda-b0a8-eb8f56ed7357")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPolicy.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("718350ab-4517-417b-9f56-03c01ae2c7f2")
    public String getName() {
        String value = this.elt.getProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                                            TPolicy.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicy.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicy.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5f9c27ff-dc66-42d3-a123-a3ec84ffef9d")
    public String getPolicyRef() {
        String value = this.elt.getProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                                            TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TPolicy.policyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("beb7e7fb-0ee7-4d66-92f6-f0fee69cc500")
    public String getPolicyType() {
        String value = this.elt.getProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                                            TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT, value, this.elt);
    }

    @objid ("c83e2bd1-2079-43c3-8aac-fa877742fc83")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for property 'TPolicy.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("823a3e91-d9d1-4cf0-bddb-5af390f305ed")
    public void setName(final String value) {
        this.elt.setProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                             TPolicy.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicy.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("26edf512-2016-4f8d-9101-58663ec21896")
    public void setPolicyRef(final String value) {
        this.elt.setProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                             TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TPolicy.policyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bc06ee4d-6603-43a2-ae25-e1051ff9e7d3")
    public void setPolicyType(final String value) {
        this.elt.setProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                             TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicy.MdaTypes.POLICYTYPE_PROPERTY_ELT, value));
    }

    @objid ("fbfacc10-7ba5-4fa2-ae97-eeb2a5fe5d29")
    protected  TPolicy(final Class elt) {
        this.elt = elt;
    }

    @objid ("ebb5301c-44f8-4655-9396-657d37ab5785")
    public static final class MdaTypes {
        @objid ("358dbf81-687a-417d-904f-93f990aef412")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("07a4335a-3b53-4386-aef4-a9fad93fbdcc")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("74b3ebbf-518f-4f62-8ea8-286acd144986")
        public static PropertyDefinition POLICYREF_PROPERTY_ELT;

        @objid ("6aa8fc06-6409-485b-b416-b62d09fd238a")
        public static PropertyDefinition POLICYTYPE_PROPERTY_ELT;

        @objid ("568585a4-506e-4233-939a-e90cb3e145a6")
        private static Stereotype MDAASSOCDEP;

        @objid ("74f95a56-adcd-408b-b111-1c5c328edc87")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("334f7a74-557f-4d35-9bed-e4b672cb468e")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "afe2c9ed-9fab-4a53-a2d2-b52d849d0799", "TPolicy");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "3e41c1cd-e584-47d0-bae4-e8fc07eeefaa", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "874eaba3-7da2-496d-b724-a3f411e15532", "policyRef");
            POLICYREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICYREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "78876039-26c1-4105-aaab-0c4759def911", "policyType");
            POLICYTYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICYTYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
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
@objid ("3cc67ef8-fced-4ff8-ab22-e389d5cd8cbf")
public class TPolicy implements IMdaProxy {
    @objid ("1314e8ab-b273-4e9e-843b-3363b4cf3b3d")
    public static final String STEREOTYPE_NAME = "TPolicy";

    @objid ("ce34a87d-ef64-4da8-9aef-08e1541c7343")
    public static final String NAME_TAGTYPE = "name";

    @objid ("0154b7f6-563e-4a83-8a5d-fd7537d606fc")
    public static final String POLICYREF_TAGTYPE = "policyRef";

    @objid ("37e7d8d0-7e2e-43e2-b7a0-abd4f8860ee5")
    public static final String POLICYTYPE_TAGTYPE = "policyType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("fc92d64a-4030-4d8f-8c76-fe501c722832")
    protected final Class elt;

    /**
     * Tells whether a {@link TPolicy proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPolicy >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9c338aa1-9aa3-4c49-9255-23dc6c4acf49")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPolicy.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPolicy.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPolicy >> then instantiate a {@link TPolicy} proxy.
     * 
     * @return a {@link TPolicy} proxy on the created {@link Class}.
     */
    @objid ("a9051c85-87bd-4fec-9d00-6ea3964ad9f1")
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
    @objid ("e011089f-1477-4513-b58f-702800074aee")
    public static TPolicy instantiate(final Class obj) {
        return TPolicy.canInstantiate(obj) ? new TPolicy(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPolicy} proxy from a {@link Class} stereotyped << TPolicy >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TPolicy} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("09eb5f4a-5ee4-4dc3-bb95-891344b671b5")
    public static TPolicy safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPolicy.canInstantiate(obj))
        	return new TPolicy(obj);
        else
        	throw new IllegalArgumentException("TPolicy: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e23e5826-87e9-46c1-8e87-4778622e0b0d")
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
    @objid ("ad6e0140-442f-4c65-8b0e-5e2d813d588f")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fdbec0b0-0c1a-4fa5-b10f-4634ec116b41")
    public String getName() {
        return this.elt.getTagValue(TPolicy.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("11d80aee-6853-45ae-a380-f6d65fa1199a")
    public String getPolicyRef() {
        return this.elt.getTagValue(TPolicy.MdaTypes.POLICYREF_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'policyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2ea7d315-c212-46e0-85b5-344d5f97b255")
    public String getPolicyType() {
        return this.elt.getTagValue(TPolicy.MdaTypes.POLICYTYPE_TAGTYPE_ELT);
    }

    @objid ("c856caa5-90a2-40b0-81be-09ea941d4826")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dcfa594f-8792-4909-9db4-5faf2ec38451")
    public void setName(final String value) {
        this.elt.putTagValue(TPolicy.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("10221366-10f3-4b3d-9f4c-cd8aa97c310d")
    public void setPolicyRef(final String value) {
        this.elt.putTagValue(TPolicy.MdaTypes.POLICYREF_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'policyType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("18b6af7f-9ce0-467a-8f36-06fc27528859")
    public void setPolicyType(final String value) {
        this.elt.putTagValue(TPolicy.MdaTypes.POLICYTYPE_TAGTYPE_ELT, value);
    }

    @objid ("3e46c210-7297-4887-8e6a-ec9cc5ab8195")
    protected  TPolicy(final Class elt) {
        this.elt = elt;
    }

    @objid ("7eab79f6-fba4-433a-a3c9-3a5af374129a")
    public static final class MdaTypes {
        @objid ("659fa60c-902d-42cc-a745-ab6d5a59dfa6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("60bf3745-4555-42eb-8065-60630858cf52")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("87094138-311c-4751-b6cf-9aac79cd10da")
        public static TagType POLICYREF_TAGTYPE_ELT;

        @objid ("ab66fa08-50e0-4f4e-ac25-752dfa93f6a8")
        public static TagType POLICYTYPE_TAGTYPE_ELT;

        @objid ("8597c02d-9ea5-4074-a31a-c8751c09c698")
        private static Stereotype MDAASSOCDEP;

        @objid ("58650f5a-f788-43c4-8cc7-88ce895f0cfe")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("83fde5d5-af90-4149-bbda-50aa78692f11")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "afe2c9ed-9fab-4a53-a2d2-b52d849d0799", "TPolicy");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "1d546042-1e4c-44fe-b635-f26b13113f65", "name");
            NAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (NAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "212112e6-68cf-448e-b90b-f50bc9015821", "policyRef");
            POLICYREF_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (POLICYREF_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "1947c8eb-d89c-438c-b5c7-da2f5c82cdbc", "policyType");
            POLICYTYPE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (POLICYTYPE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

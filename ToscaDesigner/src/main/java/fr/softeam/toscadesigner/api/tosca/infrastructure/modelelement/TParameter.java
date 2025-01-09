/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 12:14 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << TParameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("75d1a690-9811-4ad8-ba31-59c338697e22")
public class TParameter implements IMdaProxy {
    @objid ("59796663-55a9-4c03-bf6e-2a0898bf6ae1")
    public static final String STEREOTYPE_NAME = "TParameter";

    @objid ("e25a58a7-8fd9-4ea1-a47f-42220ae93d2a")
    public static final String NAME_PROPERTY = "name";

    @objid ("ce74b741-bedf-4f51-bfe0-9489f1f1a19c")
    public static final String REQUIRED_PROPERTY = "required";

    @objid ("78ae8159-7b0d-4070-99d9-f8dabb2d366a")
    public static final String TYPE_PROPERTY = "type";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("af867b23-f5b4-460e-ab4c-779f2e394a31")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TParameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bbc7a585-517b-4012-96dd-5cc10a9e4382")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TParameter.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TParameter.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TParameter >> then instantiate a {@link TParameter} proxy.
     * 
     * @return a {@link TParameter} proxy on the created {@link ModelElement}.
     */
    @objid ("5bb58661-703e-46f8-9e10-f53b60005352")
    public static TParameter create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TParameter.MdaTypes.STEREOTYPE_ELT);
        return TParameter.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TParameter} proxy from a {@link ModelElement} stereotyped << TParameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TParameter} proxy or <i>null</i>.
     */
    @objid ("c2df9926-bcce-4cd0-b308-29f3ed761305")
    public static TParameter instantiate(final ModelElement obj) {
        return TParameter.canInstantiate(obj) ? new TParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TParameter} proxy from a {@link ModelElement} stereotyped << TParameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e0f1e085-f890-4570-9d0c-d30b5c5b42c1")
    public static TParameter safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TParameter.canInstantiate(obj))
        	return new TParameter(obj);
        else
        	throw new IllegalArgumentException("TParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4af850f4-d8f9-45ce-81a7-cc12be313d69")
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
        TParameter other = (TParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("474b9184-2cd0-4030-916a-f22a8e679cdb")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TParameter.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7436b556-adcd-4cdf-b7cf-d1c83d52a7b0")
    public String getName() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TParameter.required'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9f6c1f24-ea7d-43e8-a38f-827e3768812a")
    public Boolean getRequired() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.REQUIRED_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.REQUIRED_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(TParameter.MdaTypes.REQUIRED_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TParameter.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7b96d51a-cb48-478c-8475-dc691c89de37")
    public String getType() {
        String value = this.elt.getProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                                            TParameter.MdaTypes.TYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TParameter.MdaTypes.TYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TParameter.MdaTypes.TYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("7529e43b-d3fc-4ba5-825b-3da11aedf8a3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TParameter.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b89188e1-2617-48e4-affd-5c2a4a8e0964")
    public void setName(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.required'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c492a0e2-2a7d-4dd3-8709-3759e595a609")
    public void setRequired(final Boolean value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.REQUIRED_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.REQUIRED_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TParameter.type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("28ff0916-4707-4bfa-9fd2-77280816529d")
    public void setType(final String value) {
        this.elt.setProperty(TParameter.MdaTypes.STEREOTYPE_ELT,
                             TParameter.MdaTypes.TYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TParameter.MdaTypes.TYPE_PROPERTY_ELT, value));
    }

    @objid ("6cddf50d-50d6-4ca7-9009-d92ac96166ef")
    protected  TParameter(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("b820876c-b087-488b-8631-ca1fb492e936")
    public static final class MdaTypes {
        @objid ("bf42e09e-3477-4813-866f-bf8b6c682d30")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7ba523f0-b66a-44be-b543-921be710725e")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("2cfd4346-7e18-43b3-a5fe-4a2dfb115c51")
        public static PropertyDefinition REQUIRED_PROPERTY_ELT;

        @objid ("744c38d8-b579-4335-b09d-2cadb90c8aa7")
        public static PropertyDefinition TYPE_PROPERTY_ELT;

        @objid ("c1723814-dbce-4898-9951-41ab39e1a06f")
        private static Stereotype MDAASSOCDEP;

        @objid ("5b840782-d6e0-49e7-aead-d09ad196a5e3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d7823aaf-22ed-4ae6-8bd3-211fa84364ec")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "88f765a0-a1fe-42d8-9b52-f45ff541469f", "TParameter");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "ae68e1f0-3464-42e1-a2d5-d8d14a7aa4fe", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "3091bbf3-2697-463a-92be-b410cc5a1f82", "required");
            REQUIRED_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (REQUIRED_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a6d4ef82-d89c-4b98-ad06-c9abb7992402", "type");
            TYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

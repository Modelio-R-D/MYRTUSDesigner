/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:38 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TEntityTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ab2f9feb-3031-4cf3-a78b-63c1bbe9c53c")
public class TEntityTemplate extends TExtensibleElements implements IMdaProxy {
    @objid ("8829842d-ce28-433d-8c1b-9d4042043f15")
    public static final String STEREOTYPE_NAME = "TEntityTemplate";

    @objid ("2ca06394-26ad-43a5-9997-7ec42013bb1c")
    public static final String ID_TAGTYPE = "id";

    @objid ("45bc8241-bcd1-4f01-919f-16cb5d1ab385")
    public static final String PROPERTIES_TAGTYPE = "properties";

    @objid ("1ae60a1b-2e6c-412e-8b1a-4324ce7a7e10")
    public static final String PROPERTYCONSTRAINTS_TAGTYPE = "propertyConstraints";

    @objid ("c24e8745-fd34-4165-ab11-e7a37402fa28")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link TEntityTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TEntityTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7790afa3-8344-437b-a805-64fe27d54c36")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TEntityTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TEntityTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TEntityTemplate >> then instantiate a {@link TEntityTemplate} proxy.
     * 
     * @return a {@link TEntityTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("5203649c-5ef2-4ac1-af27-df57f8e3681d")
    public static TEntityTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TEntityTemplate.MdaTypes.STEREOTYPE_ELT);
        return TEntityTemplate.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TEntityTemplate} proxy from a {@link ModelElement} stereotyped << TEntityTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TEntityTemplate} proxy or <i>null</i>.
     */
    @objid ("5304c503-c101-4f8d-8b73-96c94dc91f17")
    public static TEntityTemplate instantiate(final ModelElement obj) {
        return TEntityTemplate.canInstantiate(obj) ? new TEntityTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TEntityTemplate} proxy from a {@link ModelElement} stereotyped << TEntityTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TEntityTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c9c21189-99e3-4741-aefe-0ff801561e95")
    public static TEntityTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TEntityTemplate.canInstantiate(obj))
        	return new TEntityTemplate(obj);
        else
        	throw new IllegalArgumentException("TEntityTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6dac6f99-fb9e-455c-b722-d84383c779eb")
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
        TEntityTemplate other = (TEntityTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("14e52c6c-3c5a-418e-a00b-f1501978cefe")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5f69f416-160a-4036-bb6a-5c06f482069e")
    public String getId() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4766b2ce-3067-4a6b-a78e-bed15e2c5272")
    public String getProperties() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.PROPERTIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9edcd637-2279-4d3e-a770-0583f0fa2df5")
    public String getPropertyConstraints() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("030bad42-2377-4b20-bac4-8fabc80c0044")
    public String getType() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @objid ("b3fb3ee3-cf62-4e12-ab6d-35dbcde377b5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0bec7e65-af72-4c73-8377-a50540093e1d")
    public void setId(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c4e6d2f4-8e31-41fc-9947-0bc0bd8a3fd7")
    public void setProperties(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.PROPERTIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("06ddb47c-f5bd-496d-98c1-80a1f99c2db4")
    public void setPropertyConstraints(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("08e25828-15da-45fc-9b37-d0ecc460e1c0")
    public void setType(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    @objid ("7390a595-9ac3-4ec9-a18b-2bf30ff987a0")
    protected  TEntityTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("194254ba-64c5-466b-b849-b70a5759b433")
    public static final class MdaTypes {
        @objid ("ab39c9cc-6bed-4f9d-afa0-4b9be214e0e5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("82cc2dbe-6fb9-4793-bf33-ad0c5fbed4cd")
        public static TagType PROPERTIES_TAGTYPE_ELT;

        @objid ("9319b703-53ae-44b2-b145-3fcce255e3aa")
        public static TagType PROPERTYCONSTRAINTS_TAGTYPE_ELT;

        @objid ("544b8781-1e0d-4b63-b101-2abbad7f6653")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("6705648d-d819-4361-98fa-5f2b34ddf24b")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("65678d58-7fb5-4dda-b67c-23d0881971e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("eae5f35c-93a4-44c7-9909-d8b4fa9c6e46")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a674e651-3ab8-4727-995b-defbbb74e429")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "a32cca04-f738-421e-b834-b0f13524e19e", "TEntityTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "b146297a-aa0d-4c18-a0f4-c78f69c831cf", "properties");
            PROPERTIES_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (PROPERTIES_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "0e4aba23-900f-400f-aaa3-69b0697bf3d3", "propertyConstraints");
            PROPERTYCONSTRAINTS_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (PROPERTYCONSTRAINTS_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "53c84677-952b-4292-8a45-78a646366049", "id");
            ID_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (ID_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "be9e4c48-d3a9-452a-96ec-f5efdf1d105b", "type");
            TYPE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (TYPE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

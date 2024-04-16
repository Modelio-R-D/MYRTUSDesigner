/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
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
    @objid ("04dc470b-a13c-470f-9e42-c0cb576112f6")
    public static final String STEREOTYPE_NAME = "TEntityTemplate";

    @objid ("8f41f0e3-bfa7-4092-8674-7721c16d79fb")
    public static final String ID_TAGTYPE = "id";

    @objid ("f0f0217f-29de-4636-80e4-79199bde43f4")
    public static final String PROPERTIES_TAGTYPE = "properties";

    @objid ("13f7ce17-ab70-43e6-9bf8-e175c31f7d8f")
    public static final String PROPERTYCONSTRAINTS_TAGTYPE = "propertyConstraints";

    @objid ("10735dcf-d0b0-49ac-8d5a-c87a6fcd9fcf")
    public static final String TYPE_TAGTYPE = "type";

    /**
     * Tells whether a {@link TEntityTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TEntityTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ab59fcd2-e820-4396-9ce0-205e469b6324")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TEntityTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TEntityTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TEntityTemplate >> then instantiate a {@link TEntityTemplate} proxy.
     * 
     * @return a {@link TEntityTemplate} proxy on the created {@link ModelElement}.
     */
    @objid ("ebf7d32d-7485-4f89-ad97-8987d8bfaaf2")
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
    @objid ("7ad95330-1762-4158-bfc3-7543fd0f3d9d")
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
    @objid ("20798953-4be5-4924-be4f-569dbe044bc4")
    public static TEntityTemplate safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TEntityTemplate.canInstantiate(obj))
        	return new TEntityTemplate(obj);
        else
        	throw new IllegalArgumentException("TEntityTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d1d9057e-d5e2-4103-8471-9c28d60667a0")
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
    @objid ("18284f2a-73cb-4cff-909b-f74f22bd6c12")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8f733e08-97d1-4332-9da2-311594b27477")
    public String getId() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f85c8c4f-df29-437a-9c55-3f7af7b70407")
    public String getProperties() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.PROPERTIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ae173b29-7849-438e-a5d4-f729faed3b8c")
    public String getPropertyConstraints() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("42ff40f7-d3e3-4d58-81c4-16c6c2ff4749")
    public String getType() {
        return this.elt.getTagValue(TEntityTemplate.MdaTypes.TYPE_TAGTYPE_ELT);
    }

    @objid ("7414b758-dcce-43a3-9ca9-379a7aebcd87")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fcd0a44d-d181-41d7-9c15-559246d791e0")
    public void setId(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'properties'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5a2464a5-cad5-44df-8661-10c7a885ab9c")
    public void setProperties(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.PROPERTIES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'propertyConstraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ced33b55-165d-4066-be7f-a04e90430aba")
    public void setPropertyConstraints(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.PROPERTYCONSTRAINTS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'type'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0e15ef69-657d-4a55-a664-4e5f95975371")
    public void setType(final String value) {
        this.elt.putTagValue(TEntityTemplate.MdaTypes.TYPE_TAGTYPE_ELT, value);
    }

    @objid ("029aa500-242a-4c6a-989a-1cd3496d760c")
    protected  TEntityTemplate(final ModelElement elt) {
        super(elt);
    }

    @objid ("194254ba-64c5-466b-b849-b70a5759b433")
    public static final class MdaTypes {
        @objid ("88e5e891-9c42-43d7-bb1d-c95cdeb245e2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f7b466e3-9d1a-441f-887e-e55cd70028da")
        public static TagType PROPERTIES_TAGTYPE_ELT;

        @objid ("668fa7fa-89e2-494c-8fd0-83663284b610")
        public static TagType PROPERTYCONSTRAINTS_TAGTYPE_ELT;

        @objid ("43ecddd5-e58a-470b-bd36-8016de277e1f")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("1d8ec36b-70aa-4508-b5c1-ed2cd7323e1a")
        public static TagType TYPE_TAGTYPE_ELT;

        @objid ("da6b4e2c-f5f2-487f-b5f2-073593b2edb4")
        private static Stereotype MDAASSOCDEP;

        @objid ("8166b237-a832-42ec-90f7-19536adf79b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("28c8590a-78fd-4bc3-a880-988b50ccc5b6")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.association;

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
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TEntityTemplate;
import fr.softeam.toscadesigner.api.tosca.standard.class_.RelationshipConstraintsType;
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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Association} with << TRelationshipTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a2355551-417e-4b9a-b842-5a3a0d94362e")
public class TRelationshipTemplate extends TEntityTemplate implements IMdaProxy {
    @objid ("fc174936-fa25-466b-9932-3db126523c6d")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplate";

    @objid ("00f1cf2c-5b53-4175-88ab-adadabd0ed97")
    public static final String NAME_TAGTYPE = "name";

    @objid ("93ba7ba5-515b-478f-983b-66ef2d71fe18")
    public static final String SOURCEELEMENT_TAGTYPE = "sourceElement";

    @objid ("1d3f5ff3-225c-4c5d-90c5-7c8bda7f7354")
    public static final String TARGETELEMENT_TAGTYPE = "targetElement";

    /**
     * Tells whether a {@link TRelationshipTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << TRelationshipTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3f0ea28b-c338-43e0-b32d-736c2945856a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && (TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Association) elt).isStereotyped(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Association} stereotyped << TRelationshipTemplate >> then instantiate a {@link TRelationshipTemplate} proxy.
     * 
     * @return a {@link TRelationshipTemplate} proxy on the created {@link Association}.
     */
    @objid ("d17557f3-30ae-493e-abbb-92593747bdec")
    public static TRelationshipTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Association");
        e.getExtension().add(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT);
        return TRelationshipTemplate.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplate} proxy from a {@link Association} stereotyped << TRelationshipTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link TRelationshipTemplate} proxy or <i>null</i>.
     */
    @objid ("6bfe0a5d-a826-4448-94d5-84e4510867ec")
    public static TRelationshipTemplate instantiate(final Association obj) {
        return TRelationshipTemplate.canInstantiate(obj) ? new TRelationshipTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplate} proxy from a {@link Association} stereotyped << TRelationshipTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link TRelationshipTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6c6d9ea2-f42d-416e-9c4d-077b47533a9e")
    public static TRelationshipTemplate safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (TRelationshipTemplate.canInstantiate(obj))
        	return new TRelationshipTemplate(obj);
        else
        	throw new IllegalArgumentException("TRelationshipTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7b0eba8f-4b01-4088-acc4-2c8640a623dd")
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
        TRelationshipTemplate other = (TRelationshipTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("56e62d6c-4e1f-4665-a11f-6bd661e1d3b4")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8f2aa284-7d9d-4b0e-9cb9-3bce25a774be")
    public String getName() {
        return this.elt.getTagValue(TRelationshipTemplate.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'relationshipConstraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d346e28b-c8a7-499f-9040-f8fafdfc1f54")
    public RelationshipConstraintsType getRelationshipConstraints() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TRelationshipTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TRelationshipTemplate.MdaTypes.MDAASSOCDEP_ROLE), "relationshipConstraints")
                  && RelationshipConstraintsType.canInstantiate(d.getDependsOn())) {
                     return (RelationshipConstraintsType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), RelationshipConstraintsType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'sourceElement'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5bc0e1f2-33bf-4f71-bc82-05cb81f19bc3")
    public String getSourceElement() {
        return this.elt.getTagValue(TRelationshipTemplate.MdaTypes.SOURCEELEMENT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'targetElement'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ac2caf3b-92d3-49bf-9b7a-910941b72a5f")
    public String getTargetElement() {
        return this.elt.getTagValue(TRelationshipTemplate.MdaTypes.TARGETELEMENT_TAGTYPE_ELT);
    }

    @objid ("c0596caf-7d69-42f4-a2c7-c171612702ab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7ead57c9-8fe1-459f-bc04-05b68a041025")
    public void setName(final String value) {
        this.elt.putTagValue(TRelationshipTemplate.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'relationshipConstraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("22bd7ab1-edd4-47ef-ab08-3469e3101043")
    public void setRelationshipConstraints(final RelationshipConstraintsType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TRelationshipTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TRelationshipTemplate.MdaTypes.MDAASSOCDEP_ROLE), "relationshipConstraints")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TRelationshipTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("relationshipConstraints");      dep.putTagValue(TRelationshipTemplate.MdaTypes.MDAASSOCDEP_ROLE, "relationshipConstraints");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Setter for string property 'sourceElement'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("18530702-dd41-4807-b346-380dfda9d4f1")
    public void setSourceElement(final String value) {
        this.elt.putTagValue(TRelationshipTemplate.MdaTypes.SOURCEELEMENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'targetElement'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f60eb4dc-e0d3-46b3-a4ff-9f45e85d17a6")
    public void setTargetElement(final String value) {
        this.elt.putTagValue(TRelationshipTemplate.MdaTypes.TARGETELEMENT_TAGTYPE_ELT, value);
    }

    @objid ("cf91884f-246b-42ea-bec7-9720c2e86e95")
    protected  TRelationshipTemplate(final Association elt) {
        super(elt);
    }

    @objid ("d6cdbf9d-3bee-45cf-b04e-4a31f668d827")
    public static final class MdaTypes {
        @objid ("895a5adf-e9b1-4922-9a0a-74d709388bc0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("719f3bc8-a7bf-4be0-bd4d-7b520cab5781")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("dfa24f82-45f8-4492-97a5-ab4efecbcc53")
        public static TagType SOURCEELEMENT_TAGTYPE_ELT;

        @objid ("55ac301e-6016-415d-93cb-d8b28598edff")
        public static TagType TARGETELEMENT_TAGTYPE_ELT;

        @objid ("ae87c26c-32e0-4e69-9cca-088298c6606d")
        private static Stereotype MDAASSOCDEP;

        @objid ("862d21f8-cbaf-41cd-adae-be4a64fec11d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("05dd08a8-f54b-4ba9-947d-bebd9bd5a193")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7f01001b-511e-4017-b6b4-729f68c85911", "TRelationshipTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "2f615bad-125a-47d7-bb05-1e78ac68cea3", "name");
            NAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (NAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "83393692-d49e-40c9-82cf-d39eca5ceadc", "sourceElement");
            SOURCEELEMENT_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (SOURCEELEMENT_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "58a6b489-bd06-45c0-9fe9-4a7409e62986", "targetElement");
            TARGETELEMENT_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (TARGETELEMENT_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

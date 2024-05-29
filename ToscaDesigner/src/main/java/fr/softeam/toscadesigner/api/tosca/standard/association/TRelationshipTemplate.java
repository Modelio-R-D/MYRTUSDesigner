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
    @objid ("e7ee2ba7-4151-47f7-80b4-eb80ea877309")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplate";

    @objid ("09587c1f-75d9-4c94-9944-626bb5ce4e5e")
    public static final String NAME_TAGTYPE = "name";

    @objid ("65291c47-28c9-4291-8b60-0e6ad7afe80a")
    public static final String SOURCEELEMENT_TAGTYPE = "sourceElement";

    @objid ("0b4999a2-9486-4d51-b0c7-1ebb6140d248")
    public static final String TARGETELEMENT_TAGTYPE = "targetElement";

    /**
     * Tells whether a {@link TRelationshipTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << TRelationshipTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6f5f5b12-7361-4669-8713-a797fa55d00b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && (TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Association) elt).isStereotyped(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Association} stereotyped << TRelationshipTemplate >> then instantiate a {@link TRelationshipTemplate} proxy.
     * @return a {@link TRelationshipTemplate} proxy on the created {@link Association}.
     */
    @objid ("9336910f-03e9-48cd-b1f4-12e90bb296cd")
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
    @objid ("ff0836d8-9d9a-4d2b-a44b-f114ff86091a")
    public static TRelationshipTemplate instantiate(final Association obj) {
        return TRelationshipTemplate.canInstantiate(obj) ? new TRelationshipTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplate} proxy from a {@link Association} stereotyped << TRelationshipTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link TRelationshipTemplate} proxy.
     */
    @objid ("4dd385a6-adef-4961-948c-3bbfa32a3205")
    public static TRelationshipTemplate safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (TRelationshipTemplate.canInstantiate(obj))
            return new TRelationshipTemplate(obj);
        else
            throw new IllegalArgumentException("TRelationshipTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9210979d-7a52-41c6-8ae3-13ed90ea491f")
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
    @objid ("b41971ab-bf9e-4b31-9ad3-175d31eaeb65")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("345d4d98-2da8-42d6-9bb4-d43bb77e8ae9")
    public String getName() {
        return this.elt.getTagValue(TRelationshipTemplate.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'relationshipConstraints' role.<p>
     * Role description:
     * null
     */
    @objid ("de8c236a-8b8b-4891-93f4-24c7a9947379")
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
    @objid ("03b739fc-9e94-4fc5-801f-e0de092dcbd3")
    public String getSourceElement() {
        return this.elt.getTagValue(TRelationshipTemplate.MdaTypes.SOURCEELEMENT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'targetElement'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1b8a4cc4-6955-4076-9818-861e0794e4c8")
    public String getTargetElement() {
        return this.elt.getTagValue(TRelationshipTemplate.MdaTypes.TARGETELEMENT_TAGTYPE_ELT);
    }

    @objid ("93981928-6dfe-40e7-99a3-5ffc1186848b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e5df35e0-4bbb-456d-9870-442fa5e6a3ac")
    public void setName(final String value) {
        this.elt.putTagValue(TRelationshipTemplate.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'relationshipConstraints' role.<p>
     * Role description:
     * null
     */
    @objid ("7ed1cb28-6627-4d0f-909d-1e9ad1112c1b")
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
    @objid ("4fcf3f98-a6d5-4114-9ae0-e79cf0f37037")
    public void setSourceElement(final String value) {
        this.elt.putTagValue(TRelationshipTemplate.MdaTypes.SOURCEELEMENT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'targetElement'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("af739e48-e07a-46fd-aeec-45e0f51d66d2")
    public void setTargetElement(final String value) {
        this.elt.putTagValue(TRelationshipTemplate.MdaTypes.TARGETELEMENT_TAGTYPE_ELT, value);
    }

    @objid ("13c2ecb8-1177-43ab-828c-f5c1eb779be1")
    protected  TRelationshipTemplate(final Association elt) {
        super(elt);
    }

    @objid ("d6cdbf9d-3bee-45cf-b04e-4a31f668d827")
    public static final class MdaTypes {
        @objid ("d50932d0-f189-46b6-a2fd-cf271a550a38")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dd587a1d-3c72-4b7e-a5bd-9cbf818367e8")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("26a9b2d5-292d-4a0e-b7bc-6702fa14eb46")
        public static TagType SOURCEELEMENT_TAGTYPE_ELT;

        @objid ("10a22cfa-e9ea-4e27-bbc6-718f2d674557")
        public static TagType TARGETELEMENT_TAGTYPE_ELT;

        @objid ("2ea8b720-ed3d-47bc-9df0-c170e07ddfc5")
        private static Stereotype MDAASSOCDEP;

        @objid ("b7eb9f94-160b-4d05-991d-0ca3d10e86dc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16da53aa-2aa4-4c5d-a1c9-2ef7219e300c")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 04/06/2025 20:07 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TEntityType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ae6bded1-cb5a-4444-95a4-533e042fc80a")
public class TEntityType implements IMdaProxy {
    @objid ("a50df13b-775e-430c-8825-3328ad147467")
    public static final String STEREOTYPE_NAME = "TEntityType";

    @objid ("0055004d-9b6b-4d89-8a21-7eedfabd49d4")
    public static final String ABSTRACT_PROPERTY = "abstract";

    @objid ("79a737a2-6b93-4e22-b8ba-dc2f3e772ef4")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("51da438d-19ad-40f6-898e-0886a49f2e09")
    public static final String FINAL_PROPERTY = "final";

    @objid ("794ba62a-c5aa-4406-9bd9-71e400545545")
    public static final String NAME_PROPERTY = "name";

    @objid ("577eb760-2821-444a-b10a-41facfb44e1e")
    public static final String PROPERTIESDEFINITION_PROPERTY = "propertiesDefinition";

    @objid ("606000c0-34fd-4206-ac74-ad3109cbb945")
    public static final String TAGS_PROPERTY = "tags";

    @objid ("29a315f5-de1d-4dc0-b94f-12788450af10")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("1e1849cd-6959-44ae-a48e-054e72e0f886")
    protected final Class elt;

    /**
     * Tells whether a {@link TEntityType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TEntityType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ba7a867f-7a8f-4da9-be47-322d1869cebe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TEntityType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TEntityType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TEntityType >> then instantiate a {@link TEntityType} proxy.
     * 
     * @return a {@link TEntityType} proxy on the created {@link Class}.
     */
    @objid ("65829a20-13b6-46ac-9414-6c641422ffca")
    public static TEntityType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TEntityType.MdaTypes.STEREOTYPE_ELT);
        return TEntityType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TEntityType} proxy from a {@link Class} stereotyped << TEntityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TEntityType} proxy or <i>null</i>.
     */
    @objid ("4968f78b-af37-47a0-a96b-b3ee8efca000")
    public static TEntityType instantiate(final Class obj) {
        return TEntityType.canInstantiate(obj) ? new TEntityType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TEntityType} proxy from a {@link Class} stereotyped << TEntityType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TEntityType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b8450207-bbed-425e-8453-127454e58fd6")
    public static TEntityType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TEntityType.canInstantiate(obj))
        	return new TEntityType(obj);
        else
        	throw new IllegalArgumentException("TEntityType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5664fcd9-6c2a-43f5-b0e2-ed2d7a2b585c")
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
        TEntityType other = (TEntityType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TEntityType.abstract'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6553380c-fc07-4afe-a9db-e5bfcaa0558e")
    public Boolean getAbstract() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.ABSTRACT_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.ABSTRACT_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(TEntityType.MdaTypes.ABSTRACT_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the value of the 'derivedFrom' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c61eb28a-291f-4c50-a4d5-93bffbb72af2")
    public TEntityType getDerivedFrom() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(TEntityType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TEntityType.MdaTypes.MDAASSOCDEP_ROLE), "")
              && TEntityType.canInstantiate(d.getImpacted())) {
                  return (TEntityType)ToscaDesignerProxyFactory.instantiate(d.getImpacted(), TEntityType.MdaTypes.STEREOTYPE_ELT.getName());
          }
        }
        return null;
    }

    /**
     * Getter for property 'TEntityType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5dc87962-2600-4848-92e4-cd6b7dfd27a4")
    public String getDescription() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("da54b0ae-19c1-4049-aeb7-3f6b7c017657")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TEntityType.final'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b013fca8-7b41-423a-ac0c-6aaeb0be2c29")
    public Boolean getFinal() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.FINAL_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.FINAL_PROPERTY_ELT.getDefaultValue();
        }
        return (Boolean) PropertyConverter.convertToObject(TEntityType.MdaTypes.FINAL_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityType.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b72a7c4d-e9fb-47f8-b67b-0e9da76fc5a5")
    public String getName() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityType.propertiesDefinition'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f967fb80-ddbf-4685-a530-e88003650589")
    public String getPropertiesDefinition() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.PROPERTIESDEFINITION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.PROPERTIESDEFINITION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.PROPERTIESDEFINITION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityType.tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7944766b-121a-414d-8fcc-dd7d3061ba48")
    public String getTags() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.TAGS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.TAGS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.TAGS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TEntityType.targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f40e20b2-0703-46d0-87ac-8be4238ce4db")
    public String getTargetNamespace() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("879ecf0e-ad11-48b2-88da-fa41f2547b37")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TEntityType.abstract'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c6acada9-db95-466c-9e81-e1610d5a402f")
    public void setAbstract(final Boolean value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.ABSTRACT_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.ABSTRACT_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'derivedFrom' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("725f32bf-72c4-4555-a316-877e4b851460")
    public void setDerivedFrom(final TEntityType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(TEntityType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TEntityType.MdaTypes.MDAASSOCDEP_ROLE), "")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(obj.getElement(), this.elt, TEntityType.MdaTypes.MDAASSOCDEP);
              dep.setName("");
              dep.putTagValue(TEntityType.MdaTypes.MDAASSOCDEP_ROLE, "");
          }
          dep.setImpacted(obj.getElement());
        }
        
    }

    /**
     * Setter for property 'TEntityType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9f05df9c-a49e-4f41-b917-e359b248d98a")
    public void setDescription(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityType.final'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("81e76dae-1e68-42d7-8364-5d3a91e40805")
    public void setFinal(final Boolean value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.FINAL_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.FINAL_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityType.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("320b1912-8fb3-4a7f-a190-fd65278a478c")
    public void setName(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityType.propertiesDefinition'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("abc87324-37d5-4b78-a6b8-85debe237d63")
    public void setPropertiesDefinition(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.PROPERTIESDEFINITION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.PROPERTIESDEFINITION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityType.tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("72887b4d-2dd8-4a46-947f-e26b583811d8")
    public void setTags(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.TAGS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.TAGS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TEntityType.targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("de696a89-4bf4-4a68-bb82-eb2fdebfd089")
    public void setTargetNamespace(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("b974c354-f4c1-4f9f-a161-994e88e7cacf")
    protected  TEntityType(final Class elt) {
        this.elt = elt;
    }

    @objid ("8c203857-fbb8-4341-ad18-eaf263d8797d")
    public static final class MdaTypes {
        @objid ("d49b29ea-0f9e-4c88-97fe-1b6b86650b7f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("27f4d06b-3325-4464-8166-5db3d739deff")
        public static PropertyDefinition TAGS_PROPERTY_ELT;

        @objid ("5331a2ad-d94a-4f13-8992-6387d0897d3a")
        public static PropertyDefinition PROPERTIESDEFINITION_PROPERTY_ELT;

        @objid ("aa13dc59-a612-4686-abc6-5e64ce58a7ab")
        public static PropertyDefinition ABSTRACT_PROPERTY_ELT;

        @objid ("16957454-cd0b-465a-b84e-66a80286303b")
        public static PropertyDefinition FINAL_PROPERTY_ELT;

        @objid ("9d48479a-9ef2-4d3b-97bd-bb67c0a1335b")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("5be5c2eb-6413-4790-bc0f-fadd898d41e6")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("26639a2e-3f3e-4135-ab2c-3b102437cb61")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("43e05948-76c1-4536-a61b-8606af37ded4")
        private static Stereotype MDAASSOCDEP;

        @objid ("c916bedd-a4fd-4160-a60c-1b50c414c085")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e9897a0a-1f8d-4e27-bd6c-b80c1ecfecda")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "fecd81a5-da41-4a07-a507-6bfaf5bbadd2", "TEntityType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "9d69d99b-499b-4753-be0a-7267d4a368ec", "tags");
            TAGS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TAGS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "8e60acb6-8df2-4d2b-bb91-d0b944eb9d28", "propertiesDefinition");
            PROPERTIESDEFINITION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTIESDEFINITION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "fae87299-dec9-4059-8d8d-6312ed7c3f02", "abstract");
            ABSTRACT_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ABSTRACT_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "ed02ddaf-13c8-47e0-ba8b-cb537374933a", "final");
            FINAL_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (FINAL_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "207f27b1-c6d9-4541-8a5c-a3fc9d0e3132", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "5bfcc6b2-f0ee-4854-9ac0-4ceaa8c9e21b", "targetNamespace");
            TARGETNAMESPACE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TARGETNAMESPACE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "3a4ea736-740c-4c66-8ef7-f2f6838a6fa0", "description");
            DESCRIPTION_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (DESCRIPTION_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

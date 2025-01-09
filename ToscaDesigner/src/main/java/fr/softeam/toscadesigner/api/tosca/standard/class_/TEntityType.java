/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 12:14 by Modelio Studio.
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
@objid ("3355a483-1d27-4558-b3c7-0b041c31c590")
public class TEntityType implements IMdaProxy {
    @objid ("cef9dea1-9404-40f4-936d-3817901dfb63")
    public static final String STEREOTYPE_NAME = "TEntityType";

    @objid ("c0a143ae-c6b0-47a0-868e-451c44de8ef1")
    public static final String ABSTRACT_PROPERTY = "abstract";

    @objid ("e287de74-0c42-4ba0-8a1c-572add01baff")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("5bc22a15-ec9a-42bd-9ada-1be6081fbf83")
    public static final String FINAL_PROPERTY = "final";

    @objid ("5f839d1a-a919-4853-be27-a35d4fa5bef3")
    public static final String NAME_PROPERTY = "name";

    @objid ("54a6d055-5e4e-4566-a4bc-096acdcf93bf")
    public static final String PROPERTIESDEFINITION_PROPERTY = "propertiesDefinition";

    @objid ("27d667c9-11f2-46e4-9e13-14f3a20ef0eb")
    public static final String TAGS_PROPERTY = "tags";

    @objid ("5c142549-5686-4185-8f57-10fd4ca37daf")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("7525a5a1-9441-48ce-bac0-0e717b7aa9fc")
    protected final Class elt;

    /**
     * Tells whether a {@link TEntityType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TEntityType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("152d6416-cd1b-4caa-99e6-72bdaea2e3c1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TEntityType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TEntityType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TEntityType >> then instantiate a {@link TEntityType} proxy.
     * 
     * @return a {@link TEntityType} proxy on the created {@link Class}.
     */
    @objid ("93a2a606-e0ab-45b1-9e71-78140cb9a007")
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
    @objid ("ae58ee3d-8620-4ff0-860a-86cfc26d96c1")
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
    @objid ("bf0280dc-dd23-4e53-ad4c-a33a82f21457")
    public static TEntityType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TEntityType.canInstantiate(obj))
        	return new TEntityType(obj);
        else
        	throw new IllegalArgumentException("TEntityType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("72613c7f-ee0a-41e6-93d6-8de6f0ef0af8")
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
    @objid ("c59dffe8-249d-42d0-970a-8e6e2fb3a65c")
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
    @objid ("a7c12c90-c3ab-41eb-93f0-dc769269f624")
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
    @objid ("e6ea32cc-65b0-496c-8304-017a26286ec3")
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
    @objid ("f7fd1892-8cf0-4be4-ad97-f8ab5b2fdf42")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TEntityType.final'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d172e8b0-3436-4d90-97b4-f2f83cd67f9a")
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
    @objid ("12f0a8ab-e66c-4cb3-a6b9-094ca2bd0a45")
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
    @objid ("240f13f9-a871-4acc-8a23-599583fb75ba")
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
    @objid ("5b155d6f-475b-4598-859b-bded254ae0ce")
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
    @objid ("c0fe8a6a-08dd-4679-9eec-fbeb681b7706")
    public String getTargetNamespace() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("99cb7d13-10f2-4637-98bf-fd47fbc87bd9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TEntityType.abstract'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("825c34ea-6df9-4103-adb0-8412c9289bad")
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
    @objid ("0b30a634-4fe3-4e5f-98a6-e14193b3fa9b")
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
    @objid ("a3a0ee82-3c48-418d-ad34-5b42eb422c12")
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
    @objid ("0af445c2-6023-40e9-b09f-eb9dd3a64346")
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
    @objid ("0cf65f29-5fc8-4bd0-a769-395bb8834386")
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
    @objid ("3a8d25c6-58e0-4768-8413-20fdb1f02df1")
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
    @objid ("1238cd76-2176-46e9-8533-aa4ef950952a")
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
    @objid ("9ecb5269-d98d-4f7b-8171-030fa6ca43b3")
    public void setTargetNamespace(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("feba7d3f-2b43-4d02-8abd-d499b85e7d00")
    protected  TEntityType(final Class elt) {
        this.elt = elt;
    }

    @objid ("ac8b7d57-b5ad-4dd0-9f46-798cf9e2f559")
    public static final class MdaTypes {
        @objid ("b3f1143f-8d4a-45b7-a8bc-843962499ec6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a5483919-a5ac-4cc6-9e1e-2ca0d7815f88")
        public static PropertyDefinition TAGS_PROPERTY_ELT;

        @objid ("55810875-700f-4e1c-bc33-0e5ec232d70c")
        public static PropertyDefinition PROPERTIESDEFINITION_PROPERTY_ELT;

        @objid ("b108ed86-28b9-4e39-b506-cd86d503bcb3")
        public static PropertyDefinition ABSTRACT_PROPERTY_ELT;

        @objid ("cefffdeb-5cf6-4ee5-a79a-74df7eaf2400")
        public static PropertyDefinition FINAL_PROPERTY_ELT;

        @objid ("52f9d205-0fdb-4235-8dce-a712b7bf0e03")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("25206e95-edf6-4216-88f4-ce4a5d3d0c36")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("21e5ee93-7bcf-46ff-9481-8fa2b5d3c94d")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("6f300751-5e5d-4262-94f0-05d3fc8dceab")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed167b45-3a95-42f4-9368-255e5675c878")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a9b55e67-77a0-47dd-9c42-88add00180b2")
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

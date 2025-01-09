/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 11:56 by Modelio Studio.
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
    @objid ("c0a5621e-317b-45eb-91ae-6c038f182358")
    public static final String STEREOTYPE_NAME = "TEntityType";

    @objid ("1421072d-d9d4-41a7-a48f-7d49c472fb81")
    public static final String ABSTRACT_PROPERTY = "abstract";

    @objid ("c6f644b0-ddfc-48b8-849c-32f1fa856ace")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("366fc19c-336b-4a82-acb4-93cbd9a30ce3")
    public static final String FINAL_PROPERTY = "final";

    @objid ("71943840-9ac2-4ab4-a563-aa0d95c4a215")
    public static final String NAME_PROPERTY = "name";

    @objid ("625346b0-2243-4cd4-a9af-bb77e43623bf")
    public static final String PROPERTIESDEFINITION_PROPERTY = "propertiesDefinition";

    @objid ("0281ce79-e700-40eb-8de8-15e22e94aa06")
    public static final String TAGS_PROPERTY = "tags";

    @objid ("60b5494a-3e3c-4826-b6ec-356ff93cab62")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("61247a1f-bf23-44ca-ae01-6fc717b79fbb")
    protected final Class elt;

    /**
     * Tells whether a {@link TEntityType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TEntityType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("43083b22-9162-42d4-a1a4-e069a4bab9da")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TEntityType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TEntityType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TEntityType >> then instantiate a {@link TEntityType} proxy.
     * 
     * @return a {@link TEntityType} proxy on the created {@link Class}.
     */
    @objid ("acb7c51e-2a9d-4744-b8a1-3b3b466316b9")
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
    @objid ("4a6f79ac-ea4d-45f1-b13e-1321d95bb5ee")
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
    @objid ("b1d9efe7-df10-41fa-8ee1-4cd6501d4247")
    public static TEntityType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TEntityType.canInstantiate(obj))
        	return new TEntityType(obj);
        else
        	throw new IllegalArgumentException("TEntityType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("86e8675f-6f60-47c8-a858-213bc0093b95")
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
    @objid ("66968fed-39be-4fac-a2fe-c2efe9b589df")
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
    @objid ("b9ddae5e-50c3-45bd-9c10-2ae75bd6ffb8")
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
    @objid ("3c79b8e9-747a-4236-9c0d-9c0f116fb4fd")
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
    @objid ("a45fd569-9131-45a6-adfd-9fc2f96d93b2")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TEntityType.final'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f5943925-2aa3-4523-9f6a-1cd0e29300ad")
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
    @objid ("f7ea926c-edfe-4ed4-a300-addec185116d")
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
    @objid ("13a5f522-cfff-4eb2-a9e9-bde99bd1ee6e")
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
    @objid ("16a51207-3fa6-493a-a25d-e5b5de75d9aa")
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
    @objid ("5bb5e6fa-d68c-4463-963f-09ec8196703a")
    public String getTargetNamespace() {
        String value = this.elt.getProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                                            TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("4c1df863-5cc4-403b-bcb6-f476d64f8b09")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TEntityType.abstract'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4be1523a-ac76-4b33-803f-f7fa4f69b003")
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
    @objid ("085c8454-f453-4573-b44d-12541d8257f3")
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
    @objid ("5883638d-204f-48a4-9e38-4f4e31263380")
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
    @objid ("8ada77d1-e6f0-4609-a6f1-27380b63bc5b")
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
    @objid ("5fab62a2-49ba-453d-9783-3423e4f90cf4")
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
    @objid ("9b28420c-884c-49ff-be77-e79d562e8831")
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
    @objid ("f1db9e18-7b31-4a3d-8049-34c6412f9a59")
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
    @objid ("946f0e24-c093-44fc-bfd7-a878361885ea")
    public void setTargetNamespace(final String value) {
        this.elt.setProperty(TEntityType.MdaTypes.STEREOTYPE_ELT,
                             TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TEntityType.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value));
    }

    @objid ("2ecc8295-9ac6-4a1e-9e80-4fe3369c6aff")
    protected  TEntityType(final Class elt) {
        this.elt = elt;
    }

    @objid ("ac8b7d57-b5ad-4dd0-9f46-798cf9e2f559")
    public static final class MdaTypes {
        @objid ("598dcd4f-9290-45fc-933d-7508ff7336b7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("59fceb2f-1cf5-43a8-8684-bc817e0722e8")
        public static PropertyDefinition TAGS_PROPERTY_ELT;

        @objid ("a8b1a81f-e4a8-47a9-9406-3c9d41c6a105")
        public static PropertyDefinition PROPERTIESDEFINITION_PROPERTY_ELT;

        @objid ("dc843b24-dc07-4ca3-95e1-4d4c33923c16")
        public static PropertyDefinition ABSTRACT_PROPERTY_ELT;

        @objid ("15c0e31e-6f12-48f4-9951-c61b14f9efb9")
        public static PropertyDefinition FINAL_PROPERTY_ELT;

        @objid ("4156137d-6e09-4821-9c6a-3c882b6d3586")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("95000492-2d65-41d1-b0c6-1f6e1340f68f")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("8cce5c2e-6b85-4b77-977f-bce007130c57")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("da28bc94-09dd-4340-be04-fa697dfd256e")
        private static Stereotype MDAASSOCDEP;

        @objid ("0814b058-c141-40d4-a933-3bc4c0a72747")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("de53d177-8db8-4b23-93a6-249af71f4991")
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

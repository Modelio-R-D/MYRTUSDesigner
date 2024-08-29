/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 14:48 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TServiceTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("896bb571-0fde-4530-8d3f-37f38d883b8d")
public class TServiceTemplate implements IMdaProxy {
    @objid ("2ed04d51-8c5b-48e1-a997-2d0e95c2050f")
    public static final String STEREOTYPE_NAME = "TServiceTemplate";

    @objid ("a3934d05-c894-4ebf-93f1-fab62f66a9f1")
    public static final String BOUNDARYDEFINITIONS_PROPERTY = "boundaryDefinitions";

    @objid ("42951ca9-e565-490d-a232-5ff453fded17")
    public static final String ID_PROPERTY = "id";

    @objid ("fdb8f3fb-87d8-4497-ae5b-62cabbdae1ee")
    public static final String NAME_PROPERTY = "name";

    @objid ("cdc2260d-ab50-4c39-ab96-4dccda87e1e3")
    public static final String SUBSTITUTABLENODETYPE_PROPERTY = "substitutableNodeType";

    @objid ("a9df3b61-aa6d-443c-8937-87b18dcda6bc")
    public static final String TAGS_PROPERTY = "tags";

    @objid ("701f7188-d5b7-437f-bcaa-fc72a4fbd889")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("45c48701-a772-4ddb-af47-d5f942012dc5")
    protected final Class elt;

    /**
     * Tells whether a {@link TServiceTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TServiceTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3493d962-0ef3-4ca5-965b-8759d6cd364f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TServiceTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TServiceTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TServiceTemplate >> then instantiate a {@link TServiceTemplate} proxy.
     * 
     * @return a {@link TServiceTemplate} proxy on the created {@link Class}.
     */
    @objid ("c2e0bf92-1b11-4931-aabf-297f7b2638c0")
    public static TServiceTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TServiceTemplate.MdaTypes.STEREOTYPE_ELT);
        return TServiceTemplate.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TServiceTemplate} proxy from a {@link Class} stereotyped << TServiceTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TServiceTemplate} proxy or <i>null</i>.
     */
    @objid ("772c008e-1146-4a91-a97c-d60a931a0bf5")
    public static TServiceTemplate instantiate(final Class obj) {
        return TServiceTemplate.canInstantiate(obj) ? new TServiceTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TServiceTemplate} proxy from a {@link Class} stereotyped << TServiceTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TServiceTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("61b0f89b-36d5-401f-9593-b993c8678c7a")
    public static TServiceTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TServiceTemplate.canInstantiate(obj))
        	return new TServiceTemplate(obj);
        else
        	throw new IllegalArgumentException("TServiceTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("91afc3ae-a032-46c8-b06b-53caf6ce6f3c")
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
        TServiceTemplate other = (TServiceTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for property 'TServiceTemplate.boundaryDefinitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("17f4cbb8-e057-4224-8981-e0b7f5bc94c0")
    public String getBoundaryDefinitions() {
        String value = this.elt.getProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("20b3b5e9-97a1-4b27-b46d-6677b92dfb6e")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TServiceTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8bf786df-619c-42a2-a371-26d7f6054d07")
    public String getId() {
        String value = this.elt.getProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TServiceTemplate.MdaTypes.ID_PROPERTY_ELT.getName());
        if (value == null) {
          value = TServiceTemplate.MdaTypes.ID_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TServiceTemplate.MdaTypes.ID_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TServiceTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0f14f5d3-b038-456c-8f93-f75c2c815a1b")
    public String getName() {
        String value = this.elt.getProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TServiceTemplate.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TServiceTemplate.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TServiceTemplate.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the value of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("27c41996-137e-454c-8075-5e6a9a573103")
    public TPlans getPlans() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "plans")
                  && TPlans.canInstantiate(d.getDependsOn())) {
                     return (TPlans)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPlans.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for property 'TServiceTemplate.substitutableNodeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f58613fb-033f-4927-b5df-e612aba66cc1")
    public String getSubstitutableNodeType() {
        String value = this.elt.getProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TServiceTemplate.tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("843ab7c8-998b-42dc-8b5d-2c8450359458")
    public String getTags() {
        String value = this.elt.getProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TServiceTemplate.MdaTypes.TAGS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TServiceTemplate.MdaTypes.TAGS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TServiceTemplate.MdaTypes.TAGS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TServiceTemplate.targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("083620c6-08ce-4c92-823d-09a0d8639ae1")
    public String getTargetNamespace() {
        String value = this.elt.getProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TServiceTemplate.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TServiceTemplate.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TServiceTemplate.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("708ac8bc-f253-4a4a-859c-751441d76f2b")
    public TTopologyTemplate getTopologyTemplate() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "topologyTemplate")
                  && TTopologyTemplate.canInstantiate(d.getDependsOn())) {
                     return (TTopologyTemplate)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TTopologyTemplate.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("8c627780-fa32-4e1f-8d44-0017ebb12552")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TServiceTemplate.boundaryDefinitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eb2cfc17-6dce-4194-bb2d-c3f8201bd1b9")
    public void setBoundaryDefinitions(final String value) {
        this.elt.setProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                             TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TServiceTemplate.MdaTypes.BOUNDARYDEFINITIONS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TServiceTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("05f0c2c6-16c5-41db-9f4b-d6ea76341777")
    public void setId(final String value) {
        this.elt.setProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                             TServiceTemplate.MdaTypes.ID_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TServiceTemplate.MdaTypes.ID_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TServiceTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9fad424e-bd39-4876-aaa1-156530e31e46")
    public void setName(final String value) {
        this.elt.setProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                             TServiceTemplate.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TServiceTemplate.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'plans' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fca9b808-dcd0-4c52-ac29-287b24ef28db")
    public void setPlans(final TPlans obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "plans")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TServiceTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("plans");      dep.putTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE, "plans");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Setter for property 'TServiceTemplate.substitutableNodeType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e8154499-c847-43b1-a47a-3e009d6f27a9")
    public void setSubstitutableNodeType(final String value) {
        this.elt.setProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                             TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TServiceTemplate.MdaTypes.SUBSTITUTABLENODETYPE_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TServiceTemplate.tags'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("970dbfe8-cf2f-4166-ae9f-1a415a63dc37")
    public void setTags(final String value) {
        this.elt.setProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                             TServiceTemplate.MdaTypes.TAGS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TServiceTemplate.MdaTypes.TAGS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TServiceTemplate.targetNamespace'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3991458d-a47b-413b-9623-5c22a7e0f334")
    public void setTargetNamespace(final String value) {
        this.elt.setProperty(TServiceTemplate.MdaTypes.STEREOTYPE_ELT,
                             TServiceTemplate.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TServiceTemplate.MdaTypes.TARGETNAMESPACE_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'topologyTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("82d738ad-aede-4807-b002-9208596eb791")
    public void setTopologyTemplate(final TTopologyTemplate obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TServiceTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE), "topologyTemplate")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TServiceTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("topologyTemplate");      dep.putTagValue(TServiceTemplate.MdaTypes.MDAASSOCDEP_ROLE, "topologyTemplate");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    @objid ("b16d4d54-c63a-4dd4-9958-74be71b6995e")
    protected  TServiceTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("33d60e8c-a2f7-4374-ac15-344051ffe780")
    public static final class MdaTypes {
        @objid ("c517af61-a6e6-4faf-8c14-bc3815eda7ad")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cdaa9ea8-a7f0-44ca-9073-d99a609df7f9")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("ae90bb18-be67-402c-abc3-0ae8013498a6")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("e72fdc48-6e15-401d-b921-3a10e9441d81")
        public static PropertyDefinition SUBSTITUTABLENODETYPE_PROPERTY_ELT;

        @objid ("6ec772d1-e21f-405a-9d09-1b0831d47510")
        public static PropertyDefinition TAGS_PROPERTY_ELT;

        @objid ("74d709d2-810d-4306-924e-559eab877a94")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("6ee1aff9-58ed-42d7-8275-eb16f9096329")
        public static PropertyDefinition BOUNDARYDEFINITIONS_PROPERTY_ELT;

        @objid ("3a57b20d-c688-4f90-b75d-d4e6bf6ffd4b")
        private static Stereotype MDAASSOCDEP;

        @objid ("0d382709-c49f-488f-bb64-b716665268f7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("08ac4a16-1e4b-4c0e-a351-c6e37048dcf2")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "09682faf-27b8-4c4b-a5e6-22fe18303161", "TServiceTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "38d584e8-a8fd-4a07-9ccb-48a03bd4fd1c", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "389a946d-a1b9-4a7d-9029-f6d2a6e1300c", "id");
            ID_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (ID_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "a98375ac-db7d-41f4-8316-7f8cef3dfecf", "substitutableNodeType");
            SUBSTITUTABLENODETYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (SUBSTITUTABLENODETYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d0cd7ce7-c73a-4738-8eac-88f2b007927a", "tags");
            TAGS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TAGS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "c099e5c2-f307-48e8-9542-f9225cb5fd83", "targetNamespace");
            TARGETNAMESPACE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TARGETNAMESPACE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "5a3a745d-2aed-4def-b0db-f11b198ded44", "boundaryDefinitions");
            BOUNDARYDEFINITIONS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (BOUNDARYDEFINITIONS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

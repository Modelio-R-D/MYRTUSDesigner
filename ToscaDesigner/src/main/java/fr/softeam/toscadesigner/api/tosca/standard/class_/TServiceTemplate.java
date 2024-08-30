/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 17:54 by Modelio Studio.
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
    @objid ("ebd07b0b-b9a6-46d4-a2e7-218fbb8da0db")
    public static final String STEREOTYPE_NAME = "TServiceTemplate";

    @objid ("1aa35a37-bf71-4542-aa0e-843fadfc2c36")
    public static final String BOUNDARYDEFINITIONS_PROPERTY = "boundaryDefinitions";

    @objid ("e68f103b-14a9-47e1-ad6b-1530010bd820")
    public static final String ID_PROPERTY = "id";

    @objid ("21dbd86f-3bf3-4714-b717-d72a2409809b")
    public static final String NAME_PROPERTY = "name";

    @objid ("f24f390a-e0d0-428d-b8a4-41a6c916de7b")
    public static final String SUBSTITUTABLENODETYPE_PROPERTY = "substitutableNodeType";

    @objid ("26369465-6d46-40f5-b7ec-f6e32c3453a0")
    public static final String TAGS_PROPERTY = "tags";

    @objid ("4fda3c5a-0227-4518-b760-f51685a74750")
    public static final String TARGETNAMESPACE_PROPERTY = "targetNamespace";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("fa4eeb9d-f14f-44a1-bdb1-5046476e6bb2")
    protected final Class elt;

    /**
     * Tells whether a {@link TServiceTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TServiceTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6d4f53ec-12ec-45c1-8b02-0eccc894600f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TServiceTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TServiceTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TServiceTemplate >> then instantiate a {@link TServiceTemplate} proxy.
     * 
     * @return a {@link TServiceTemplate} proxy on the created {@link Class}.
     */
    @objid ("0e4d1483-c449-49bd-8b23-e98815005601")
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
    @objid ("a2cc1af8-ee63-4d44-9e76-c5e1af246e76")
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
    @objid ("00d7621a-d993-4c78-ae8d-46aa3364aafc")
    public static TServiceTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TServiceTemplate.canInstantiate(obj))
        	return new TServiceTemplate(obj);
        else
        	throw new IllegalArgumentException("TServiceTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f5ae7b02-e9bb-464a-818f-15948cffbf7a")
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
    @objid ("a8e23511-e675-467e-8d54-100f27e39715")
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
    @objid ("f4394d02-ab95-4efe-b167-a5d2945a7fb5")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TServiceTemplate.id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("278001be-852c-43ba-9675-4936a37d49b2")
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
    @objid ("20aca14a-b2ea-4f88-9651-7390c5926057")
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
    @objid ("486e6d5c-3a81-4082-bcf1-34b55b285468")
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
    @objid ("8c76310f-72bc-4a6e-a0cc-afe823ff3bd1")
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
    @objid ("0073cdc4-72fc-4d9c-9bf8-98499d0e027a")
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
    @objid ("5057b61a-2e37-4f1f-9cb8-db7b3e302d4a")
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
    @objid ("3f7d0e53-a425-4758-8394-a005a35c9a3f")
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

    @objid ("e18e186e-1536-46d1-953c-57362893ebd8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TServiceTemplate.boundaryDefinitions'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f18a3da0-5d42-4d73-accd-cfb1b749d3ab")
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
    @objid ("7b47c8d6-efc2-4510-b949-ab4cf2486408")
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
    @objid ("0369f496-104e-4a2e-bff3-cecb42fa34de")
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
    @objid ("c7607c48-6006-4bd9-92d1-5b6b98e986e4")
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
    @objid ("637142f5-2a5c-4954-8f06-b1d74ef7e5ed")
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
    @objid ("2d46ca11-8da1-414b-b4c8-e22ea601f406")
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
    @objid ("674dc22f-01aa-4c3f-9fdd-afff3d067732")
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
    @objid ("7df8491f-7297-4e7c-8446-18bd44432f74")
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

    @objid ("4bf62e55-346f-4f43-b0f8-fed2f26124ba")
    protected  TServiceTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("33d60e8c-a2f7-4374-ac15-344051ffe780")
    public static final class MdaTypes {
        @objid ("e260f20c-e925-42ba-92bd-eec04df8e1c5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("19fe1ae7-4ae6-4f4b-b8be-24bb512547b9")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("04e4828b-fe37-41fc-bed0-3a37cac65366")
        public static PropertyDefinition ID_PROPERTY_ELT;

        @objid ("36a17504-47b7-45d7-a922-e386f4042356")
        public static PropertyDefinition SUBSTITUTABLENODETYPE_PROPERTY_ELT;

        @objid ("39bb71f7-a8ef-46a2-9707-f3b779480096")
        public static PropertyDefinition TAGS_PROPERTY_ELT;

        @objid ("89291a21-5b99-488e-af40-e46ea1a84f19")
        public static PropertyDefinition TARGETNAMESPACE_PROPERTY_ELT;

        @objid ("fe18eb9c-b64f-48e4-bbfe-cda64decaf3e")
        public static PropertyDefinition BOUNDARYDEFINITIONS_PROPERTY_ELT;

        @objid ("32d06d00-e00b-49b4-b5f3-385907104371")
        private static Stereotype MDAASSOCDEP;

        @objid ("a946ba7f-f426-46b9-995d-b95d6198d46c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("480c929d-312b-493f-ae85-be27be21a7bc")
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

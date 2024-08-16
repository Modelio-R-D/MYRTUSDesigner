/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/08/2024 17:44 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPropertyDef;
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
 * Proxy class to handle a {@link Class} with << TNodeTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bec9b0e6-f107-4b03-93f9-cc205e285fe7")
public class TNodeTemplate implements IMdaProxy {
    @objid ("480cd0f8-9159-483d-a0aa-2a7a535f64f9")
    public static final String STEREOTYPE_NAME = "TNodeTemplate";

    @objid ("c0fd1dca-0d67-406f-8246-4d4d5390ebad")
    public static final String MAXINSTANCES_PROPERTY = "maxInstances";

    @objid ("da9d74a5-d92d-4a91-b19d-e066d056a5b0")
    public static final String MININSTANCES_PROPERTY = "minInstances";

    @objid ("8667bc90-a7b5-4e01-8489-45ae442c9a10")
    public static final String NAME_PROPERTY = "name";

    @objid ("97c9de8f-bedb-4248-bfe5-7aef901881a5")
    public static final String TESTMULTIELEMENT_PROPERTY = "testMultiElement";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("2e63e282-eb93-413c-88aa-cee6922401ed")
    protected final Class elt;

    /**
     * Tells whether a {@link TNodeTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TNodeTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e504c7ce-dcba-44cc-883c-05359911726b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TNodeTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TNodeTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TNodeTemplate >> then instantiate a {@link TNodeTemplate} proxy.
     * @return a {@link TNodeTemplate} proxy on the created {@link Class}.
     */
    @objid ("48ffdf15-b900-41cd-8d34-71f546580cba")
    public static TNodeTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TNodeTemplate.MdaTypes.STEREOTYPE_ELT);
        return TNodeTemplate.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TNodeTemplate} proxy from a {@link Class} stereotyped << TNodeTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TNodeTemplate} proxy or <i>null</i>.
     */
    @objid ("fde8369b-6e14-4e5b-9b09-e1f4225dc3bd")
    public static TNodeTemplate instantiate(final Class obj) {
        return TNodeTemplate.canInstantiate(obj) ? new TNodeTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TNodeTemplate} proxy from a {@link Class} stereotyped << TNodeTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TNodeTemplate} proxy.
     */
    @objid ("5a622fc9-4dcc-479c-9e39-cc5e8bb404f4")
    public static TNodeTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TNodeTemplate.canInstantiate(obj))
            return new TNodeTemplate(obj);
        else
            throw new IllegalArgumentException("TNodeTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'properties' role.<p>
     * Role description:
     * null
     */
    @objid ("9f35b008-5f72-490a-8bad-541c4c013059")
    public void addProperties(final TPropertyDef obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TNodeTemplate.MdaTypes.MDAASSOCDEP);
            d.setName("properties");
            d.putTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE, "properties");
        }
    }

    @objid ("b4d968b6-b7b8-4832-bb62-6394e26fabb6")
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
        TNodeTemplate other = (TNodeTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'deploymentArtifacts' role.<p>
     * Role description:
     * null
     */
    @objid ("fffffe7c-50b2-4af1-9237-d32272191a1f")
    public TDeploymentArtifacts getDeploymentArtifacts() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "deploymentArtifacts")
                  && TDeploymentArtifacts.canInstantiate(d.getDependsOn())) {
                     return (TDeploymentArtifacts)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("9a435af5-7a99-40d7-8ef6-935ee1dd743f")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TNodeTemplate.maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7e2c0e73-7193-4d31-8676-ee39e33bf4cc")
    public Integer getMaxInstances() {
        String value = this.elt.getProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TNodeTemplate.MdaTypes.MAXINSTANCES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TNodeTemplate.MdaTypes.MAXINSTANCES_PROPERTY_ELT.getDefaultValue();
        }
        return (Integer) PropertyConverter.convertToObject(TNodeTemplate.MdaTypes.MAXINSTANCES_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TNodeTemplate.minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cb75ec29-e91f-45b3-a767-c5cc6d636af6")
    public Integer getMinInstances() {
        String value = this.elt.getProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TNodeTemplate.MdaTypes.MININSTANCES_PROPERTY_ELT.getName());
        if (value == null) {
          value = TNodeTemplate.MdaTypes.MININSTANCES_PROPERTY_ELT.getDefaultValue();
        }
        return (Integer) PropertyConverter.convertToObject(TNodeTemplate.MdaTypes.MININSTANCES_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Getter for property 'TNodeTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4ad17749-457d-4b05-9b37-a682a4c050c8")
    public String getName() {
        String value = this.elt.getProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TNodeTemplate.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TNodeTemplate.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TNodeTemplate.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
    }

    /**
     * Get the values of the 'properties' role.<p>
     * Role description:
     * null
     */
    @objid ("3fe6cf9a-711a-4c86-87a2-b431f64ddb02")
    public List<TPropertyDef> getProperties() {
        List<TPropertyDef> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "properties")
              && TPropertyDef.canInstantiate(d.getDependsOn()))
                results.add((TPropertyDef)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPropertyDef.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'requirements' role.<p>
     * Role description:
     * null
     */
    @objid ("30e54dcb-8aa3-471a-b732-603f3a89ea47")
    public RequirementsType getRequirements() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "requirements")
                  && RequirementsType.canInstantiate(d.getDependsOn())) {
                     return (RequirementsType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), RequirementsType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for property 'TNodeTemplate.testMultiElement'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("12f0d055-2d0f-4e48-a504-ecb3604a5c79")
    public String getTestMultiElement() {
        String value = this.elt.getProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TNodeTemplate.MdaTypes.TESTMULTIELEMENT_PROPERTY_ELT.getName());
        if (value == null) {
          value = TNodeTemplate.MdaTypes.TESTMULTIELEMENT_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TNodeTemplate.MdaTypes.TESTMULTIELEMENT_PROPERTY_ELT, value, this.elt);
    }

    @objid ("82117827-07cb-4ed6-8ec9-da43ceb05317")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'properties' role.<p>
     * Role description:
     * null
     */
    @objid ("84e2d001-8050-4ba9-ad69-7d99b73be3ef")
    public boolean removeProperties(final TPropertyDef obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'deploymentArtifacts' role.<p>
     * Role description:
     * null
     */
    @objid ("05779025-5cea-424e-aac3-77c381eebd2e")
    public void setDeploymentArtifacts(final TDeploymentArtifacts obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "deploymentArtifacts")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TNodeTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("deploymentArtifacts");      dep.putTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE, "deploymentArtifacts");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for property 'TNodeTemplate.maxInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a0af4a9e-a7d5-49fd-aa04-8ec5625d2211")
    public void setMaxInstances(final Integer value) {
        this.elt.setProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                             TNodeTemplate.MdaTypes.MAXINSTANCES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TNodeTemplate.MdaTypes.MAXINSTANCES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TNodeTemplate.minInstances'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c46cb65e-378a-4c0e-88a2-2d6888b64826")
    public void setMinInstances(final Integer value) {
        this.elt.setProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                             TNodeTemplate.MdaTypes.MININSTANCES_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TNodeTemplate.MdaTypes.MININSTANCES_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TNodeTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2b79acf3-b10d-4b35-b3b0-1a85ef17a172")
    public void setName(final String value) {
        this.elt.setProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                             TNodeTemplate.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TNodeTemplate.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'requirements' role.<p>
     * Role description:
     * null
     */
    @objid ("e0ae66af-e11a-4946-b954-f24a5fe6b590")
    public void setRequirements(final RequirementsType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TNodeTemplate.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE), "requirements")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TNodeTemplate.MdaTypes.MDAASSOCDEP);
              dep.setName("requirements");      dep.putTagValue(TNodeTemplate.MdaTypes.MDAASSOCDEP_ROLE, "requirements");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for property 'TNodeTemplate.testMultiElement'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("05bd2487-03eb-4b5f-80ed-bb687d579c38")
    public void setTestMultiElement(final String value) {
        this.elt.setProperty(TNodeTemplate.MdaTypes.STEREOTYPE_ELT,
                             TNodeTemplate.MdaTypes.TESTMULTIELEMENT_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TNodeTemplate.MdaTypes.TESTMULTIELEMENT_PROPERTY_ELT, value));
    }

    @objid ("35da4393-3744-478f-b7e3-fe4d13a40400")
    protected  TNodeTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("830c1518-f325-44e9-b808-2549817da902")
    public static final class MdaTypes {
        @objid ("1f24d04b-5c4c-4038-87ce-2072812a452a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d49f6ea9-7a55-4f22-ab86-d509309a81be")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("f628d72b-1633-493f-988e-87bb0aa0e51f")
        public static PropertyDefinition MININSTANCES_PROPERTY_ELT;

        @objid ("75e3d6fc-bac6-49ed-92a5-314fca58c081")
        public static PropertyDefinition MAXINSTANCES_PROPERTY_ELT;

        @objid ("1a7df0c1-ccf0-4401-a842-3cab5fa6af27")
        public static PropertyDefinition TESTMULTIELEMENT_PROPERTY_ELT;

        @objid ("8ff72897-0493-4fb1-9aff-3b8525ad448e")
        private static Stereotype MDAASSOCDEP;

        @objid ("543dde60-6923-4872-b5a1-2632c8d0fbea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0a96b0a5-131a-492b-a513-7a79a1c493c7")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1a20bf91-0a92-434a-9d1f-35c86788784e", "TNodeTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "bd9aa62a-17eb-4186-b69d-2bbf5a69a8be", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "4d6754bc-a92d-460c-ba8d-429b77f38a8c", "minInstances");
            MININSTANCES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (MININSTANCES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "8e4ef0cc-21bc-44ff-95db-b48e663f689d", "maxInstances");
            MAXINSTANCES_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (MAXINSTANCES_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "c70da6c5-e98d-4d4f-b2c2-b55dddeb2409", "testMultiElement");
            TESTMULTIELEMENT_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (TESTMULTIELEMENT_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

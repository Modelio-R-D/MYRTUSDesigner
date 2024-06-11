/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/06/2024 17:18 by Modelio Studio.
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
@objid ("c2b520b1-8b4a-4bc1-a5a3-6512efaa8348")
public class TRelationshipTemplate extends TEntityTemplate implements IMdaProxy {
    @objid ("3583e684-e7f8-4e62-87bc-bcbcc7762e4c")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplate";

    @objid ("3fb8115d-fcfc-4c73-91d3-ab5aea7b01ac")
    public static final String NAME_PROPERTY = "name";

    /**
     * Tells whether a {@link TRelationshipTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << TRelationshipTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1889a087-827e-4797-9e95-837126e5f307")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && (TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Association) elt).isStereotyped(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Association} stereotyped << TRelationshipTemplate >> then instantiate a {@link TRelationshipTemplate} proxy.
     * 
     * @return a {@link TRelationshipTemplate} proxy on the created {@link Association}.
     */
    @objid ("b3395419-a434-469a-a7f3-b32d41e0c988")
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
    @objid ("8d85ea44-030b-468e-b4cb-8f73dc8840bb")
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
    @objid ("05946225-5d10-43dd-a3bc-3d75aa1e0e73")
    public static TRelationshipTemplate safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (TRelationshipTemplate.canInstantiate(obj))
        	return new TRelationshipTemplate(obj);
        else
        	throw new IllegalArgumentException("TRelationshipTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("16ddd88f-89c7-4935-8e2f-fece9b877c47")
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
    @objid ("e8af318b-46bd-4b64-9c83-b9daa888d82e")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for property 'TRelationshipTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9b185fb3-96c5-4b1e-a129-15b33cb01f30")
    public String getName() {
        String value = this.elt.getProperty(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT,
                                            TRelationshipTemplate.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TRelationshipTemplate.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TRelationshipTemplate.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the value of the 'relationshipConstraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cea08633-6680-4416-84b0-247adbacfb76")
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

    @objid ("c14f65c6-ee7b-4651-a94e-0389112bca33")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TRelationshipTemplate.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b93b7c18-6020-4deb-b99d-15cc05753c55")
    public void setName(final String value) {
        this.elt.setProperty(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT,
                             TRelationshipTemplate.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TRelationshipTemplate.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'relationshipConstraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4d9e52d6-4a18-44c9-a92d-3a3d3787d976")
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

    @objid ("b00113c8-c6d9-47ef-ad6e-37a01427421b")
    protected  TRelationshipTemplate(final Association elt) {
        super(elt);
    }

    @objid ("21c3b2d6-8a4f-45ae-a849-e39df3db7987")
    public static final class MdaTypes {
        @objid ("da35ac39-ad5c-4dc6-9984-46ee773e6736")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3df4c9e2-8041-497c-98d9-0631790d4f3b")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("2cf413d0-073c-4439-9732-ac2bbe456eb5")
        private static Stereotype MDAASSOCDEP;

        @objid ("0118602d-ea92-4ae2-bc4f-85cd69ab4b1f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d98544f4-58d7-4fa3-8df3-b5964d0af1d5")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7f01001b-511e-4017-b6b4-729f68c85911", "TRelationshipTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "4e1f88bb-9f2a-4519-b54b-e03d31184991", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

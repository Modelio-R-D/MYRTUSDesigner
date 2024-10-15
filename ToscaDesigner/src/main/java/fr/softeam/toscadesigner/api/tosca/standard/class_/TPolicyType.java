/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/10/2024 11:39 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TPolicyType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d8f6bcbc-5d73-47fd-bdcb-e62323e3b646")
public class TPolicyType extends TEntityType implements IMdaProxy {
    @objid ("0fdab09e-493f-43b2-9bde-5c58d97ac67c")
    public static final String STEREOTYPE_NAME = "TPolicyType";

    @objid ("5e1bd239-7a9f-417d-9faf-9b369b8dd2ea")
    public static final String DESCRIPTION_PROPERTY = "description";

    @objid ("6331cd8c-e040-450e-8f07-b20054c90de2")
    public static final String POLICYLANGUAGE_PROPERTY = "policyLanguage";

    /**
     * Tells whether a {@link TPolicyType proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TPolicyType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("daadf348-eca1-4b76-b6c6-f673e144e306")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TPolicyType.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TPolicyType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TPolicyType >> then instantiate a {@link TPolicyType} proxy.
     * 
     * @return a {@link TPolicyType} proxy on the created {@link Class}.
     */
    @objid ("c3944324-f4f3-478d-a39e-a43a2a888da8")
    public static TPolicyType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TPolicyType.MdaTypes.STEREOTYPE_ELT);
        return TPolicyType.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TPolicyType} proxy from a {@link Class} stereotyped << TPolicyType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TPolicyType} proxy or <i>null</i>.
     */
    @objid ("e265e6dd-1896-4883-a230-3d2540ca7fb0")
    public static TPolicyType instantiate(final Class obj) {
        return TPolicyType.canInstantiate(obj) ? new TPolicyType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPolicyType} proxy from a {@link Class} stereotyped << TPolicyType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TPolicyType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a71eb872-cbee-4e2e-8ed6-e4f89b22af97")
    public static TPolicyType safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TPolicyType.canInstantiate(obj))
        	return new TPolicyType(obj);
        else
        	throw new IllegalArgumentException("TPolicyType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7cd1c12c-99cb-47e7-b1c1-9d38c8fac183")
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
        TPolicyType other = (TPolicyType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'derivedFrom' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("70169ba6-cc1c-48dd-b91f-e4589f6c59f9")
    public TPolicyType getDerivedFrom() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(TPolicyType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TPolicyType.MdaTypes.MDAASSOCDEP_ROLE), "")
              && TPolicyType.canInstantiate(d.getImpacted())) {
                  return (TPolicyType)ToscaDesignerProxyFactory.instantiate(d.getImpacted(), TPolicyType.MdaTypes.STEREOTYPE_ELT.getName());
          }
        }
        return null;
    }

    /**
     * Getter for property 'TPolicyType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("70838752-03e0-43ac-954b-4e804054bc10")
    public String getDescription() {
        String value = this.elt.getProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                                            TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1514534c-9e4b-4f18-9740-03aec2baae59")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TPolicyType.policyLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("45f2ee91-492d-4c2a-a627-881761aa6225")
    public String getPolicyLanguage() {
        String value = this.elt.getProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                                            TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("31801ac7-b1c2-48ac-b026-683fd0137bb2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Set the value of the 'derivedFrom' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("dab4bf06-45c7-4a92-a6a6-cdd27646abb0")
    public void setDerivedFrom(final TPolicyType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(TPolicyType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TPolicyType.MdaTypes.MDAASSOCDEP_ROLE), "")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(obj.getElement(), this.elt, TPolicyType.MdaTypes.MDAASSOCDEP);
              dep.setName("");
              dep.putTagValue(TPolicyType.MdaTypes.MDAASSOCDEP_ROLE, "");
          }
          dep.setImpacted(obj.getElement());
        }
        
    }

    /**
     * Setter for property 'TPolicyType.description'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7c12801e-2134-4fdb-a27c-6089eec1ba38")
    public void setDescription(final String value) {
        this.elt.setProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                             TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicyType.MdaTypes.DESCRIPTION_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TPolicyType.policyLanguage'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8c1d21cb-604a-4ef5-90dd-b303f41b0d81")
    public void setPolicyLanguage(final String value) {
        this.elt.setProperty(TPolicyType.MdaTypes.STEREOTYPE_ELT,
                             TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicyType.MdaTypes.POLICYLANGUAGE_PROPERTY_ELT, value));
    }

    @objid ("4a8462dd-6591-4573-8a95-fd4ca7dd542d")
    protected  TPolicyType(final Class elt) {
        super(elt);
    }

    @objid ("1f01f3f5-4dca-4580-8f96-331b8fbcf9b7")
    public static final class MdaTypes {
        @objid ("432e718f-8c42-426f-ac64-c33f3da0b124")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("310abea2-b072-4981-b9e0-057f7335ed40")
        public static PropertyDefinition POLICYLANGUAGE_PROPERTY_ELT;

        @objid ("72e35568-fe1b-4edb-a167-483132d1340b")
        public static PropertyDefinition DESCRIPTION_PROPERTY_ELT;

        @objid ("a8981aa4-df11-4aaf-8265-bff441d63cb3")
        private static Stereotype MDAASSOCDEP;

        @objid ("93865fc1-adc6-4836-bec7-4dc79f585497")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dd62cdbe-d07d-4192-b2d0-01a8dfa79639")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "b76dbc7d-8b6f-46f8-89d4-f0ea8eea40d2", "TPolicyType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "97ff5a65-420b-4f0b-bc9e-dcb36130f88e", "policyLanguage");
            POLICYLANGUAGE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICYLANGUAGE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "cb984791-bc72-4469-91fa-ff5a2259f1a2", "description");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 13:03 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.attribute;

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
import fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement.TPolicyType;
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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Attribute} with << TPolicy >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c6151804-ffa2-41b1-a19f-75a3542d7e94")
public class TPolicy implements IMdaProxy {
    @objid ("595060a4-2ab4-401b-80dc-5e8860fd4f66")
    public static final String STEREOTYPE_NAME = "TPolicy";

    @objid ("40fc0766-98e9-44b9-8282-89e594409756")
    public static final String POLICYREF_PROPERTY = "policyRef";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("75b0465b-4c27-41c4-af18-3660139e59f6")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TPolicy proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TPolicy >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9de13aee-86d9-4fd1-9c3b-4b250b651e59")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TPolicy.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TPolicy.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TPolicy >> then instantiate a {@link TPolicy} proxy.
     * 
     * @return a {@link TPolicy} proxy on the created {@link Attribute}.
     */
    @objid ("9175805a-88cc-480e-b1b2-4956fc25fb6f")
    public static TPolicy create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(TPolicy.MdaTypes.STEREOTYPE_ELT);
        return TPolicy.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link TPolicy} proxy from a {@link Attribute} stereotyped << TPolicy >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link TPolicy} proxy or <i>null</i>.
     */
    @objid ("84cf1636-6068-46ec-8f77-2cf93efedb30")
    public static TPolicy instantiate(final Attribute obj) {
        return TPolicy.canInstantiate(obj) ? new TPolicy(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPolicy} proxy from a {@link Attribute} stereotyped << TPolicy >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link TPolicy} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8d4a97c3-b2a6-4e2a-9b75-8608cc806ef4")
    public static TPolicy safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TPolicy.canInstantiate(obj))
        	return new TPolicy(obj);
        else
        	throw new IllegalArgumentException("TPolicy: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("504a45d0-7ebc-4c79-b0ab-67eacc90efc0")
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
        TPolicy other = (TPolicy) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("e1fbc90b-2c76-461e-886b-4ec7e3e8b956")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("24be5264-c0c2-4553-8ea4-22a4eab51ff5")
    public String getPolicyRef() {
        String value = this.elt.getProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                                            TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getName());
        if (value == null) {
          value = TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the value of the 'policyType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4eb02aec-a638-4c5b-9628-c17fd6f6229e")
    public TPolicyType getPolicyType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TPolicy.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE), "policyType")
                  && TPolicyType.canInstantiate(d.getDependsOn())) {
                     return (TPolicyType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPolicyType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("3a0169c5-3e79-4fba-8957-79adda67e11c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d6d4e0bf-a201-4e69-be05-28cde647f558")
    public void setPolicyRef(final String value) {
        this.elt.setProperty(TPolicy.MdaTypes.STEREOTYPE_ELT,
                             TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TPolicy.MdaTypes.POLICYREF_PROPERTY_ELT, value));
    }

    /**
     * Set the value of the 'policyType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ddfec6d4-d6e9-4e55-8cf1-eadfd49dbbb0")
    public void setPolicyType(final TPolicyType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TPolicy.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE), "policyType")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TPolicy.MdaTypes.MDAASSOCDEP);
              dep.setName("policyType");      dep.putTagValue(TPolicy.MdaTypes.MDAASSOCDEP_ROLE, "policyType");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    @objid ("5f47febe-ea4a-4f81-9346-62ebf4379775")
    protected  TPolicy(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("9cdabba3-5ee3-4167-9304-34532fa22246")
    public static final class MdaTypes {
        @objid ("5bb925ce-38be-4bad-a626-9a7192890512")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("43235e57-2b4d-40d8-a09f-2e85f8cedc25")
        public static PropertyDefinition POLICYREF_PROPERTY_ELT;

        @objid ("18507d88-82c5-45d3-ba9b-bb7176f541d4")
        private static Stereotype MDAASSOCDEP;

        @objid ("ac43c979-14a4-4793-9d74-8b868cd5b0bf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("988f73b8-3c28-48a5-a340-ac46ba8d673d")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "afe2c9ed-9fab-4a53-a2d2-b52d849d0799", "TPolicy");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "874eaba3-7da2-496d-b724-a3f411e15532", "policyRef");
            POLICYREF_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (POLICYREF_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

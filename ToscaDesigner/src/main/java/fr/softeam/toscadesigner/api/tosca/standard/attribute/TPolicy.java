/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 23/09/2024 12:50 by Modelio Studio.
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
    @objid ("88c9e0f9-5c37-47b2-9a21-5840c9e43ba8")
    public static final String STEREOTYPE_NAME = "TPolicy";

    @objid ("56351ebf-6b24-40dd-ab28-21ca28cf35fe")
    public static final String POLICYREF_PROPERTY = "policyRef";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("0ea1d397-27ec-4c16-b80a-eab519787339")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TPolicy proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TPolicy >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("400c4d1a-2a2b-4b50-9aac-d012a315a063")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TPolicy.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TPolicy.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TPolicy >> then instantiate a {@link TPolicy} proxy.
     * 
     * @return a {@link TPolicy} proxy on the created {@link Attribute}.
     */
    @objid ("8b31eef7-beeb-4cbf-a75f-f439d803e2c8")
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
    @objid ("3cb411c6-a8fc-455a-beac-e2fc3d468ddd")
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
    @objid ("42c4f12e-6165-41c0-a367-afbb3c0d16c9")
    public static TPolicy safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TPolicy.canInstantiate(obj))
        	return new TPolicy(obj);
        else
        	throw new IllegalArgumentException("TPolicy: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("33d81dd5-2a40-4caa-9800-4a9080303044")
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
    @objid ("945ef4e9-52ae-4427-be54-0bcde3d91c5c")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7e90beb2-0e21-4f06-8c42-48bb7d3f3eea")
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
    @objid ("168259b0-9dd9-4aea-8f5a-7c5f2affea1f")
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

    @objid ("5be5ec57-2828-4a0d-8225-fcb986fd2a1e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("210293e5-732b-4a38-b1dc-434588accb7f")
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
    @objid ("043cfeeb-1e96-4d42-8497-db3be189bcb6")
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

    @objid ("aedc8f16-d656-4c51-9842-45571f845312")
    protected  TPolicy(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("9cdabba3-5ee3-4167-9304-34532fa22246")
    public static final class MdaTypes {
        @objid ("415053d2-2ee7-433d-9d8e-599204e8d0a8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("079b56f3-a2a5-47a4-a76c-499f28fea613")
        public static PropertyDefinition POLICYREF_PROPERTY_ELT;

        @objid ("65612133-15b5-42ee-b3df-8aaa089eb028")
        private static Stereotype MDAASSOCDEP;

        @objid ("e4be6b3e-d74d-40be-8a3d-9740132938ae")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("98ba0c69-9f94-46f8-b35b-b93fa3ffea8d")
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

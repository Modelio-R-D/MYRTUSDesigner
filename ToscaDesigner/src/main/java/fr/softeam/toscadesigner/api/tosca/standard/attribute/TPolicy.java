/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 12:38 by Modelio Studio.
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
    @objid ("54d43400-8f63-47c6-8f0d-71c8a407a944")
    public static final String STEREOTYPE_NAME = "TPolicy";

    @objid ("5d138378-c816-49e4-abbf-25f8b0d3c531")
    public static final String POLICYREF_PROPERTY = "policyRef";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("1ef6c982-42f9-477f-94a5-82449b7b25fe")
    protected final Attribute elt;

    /**
     * Tells whether a {@link TPolicy proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << TPolicy >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d6f6023d-a500-4985-b95c-100cdb13a649")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (TPolicy.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(TPolicy.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << TPolicy >> then instantiate a {@link TPolicy} proxy.
     * 
     * @return a {@link TPolicy} proxy on the created {@link Attribute}.
     */
    @objid ("ea6ff48d-3609-4166-b928-f33a5f39fcb8")
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
    @objid ("b12b2ba4-ace4-424b-bc5a-1bed4875d3b2")
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
    @objid ("858847c2-bc2f-435f-9af6-f552ba310938")
    public static TPolicy safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (TPolicy.canInstantiate(obj))
        	return new TPolicy(obj);
        else
        	throw new IllegalArgumentException("TPolicy: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3ff40393-f99b-4e63-ba63-22c7b797074d")
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
    @objid ("dc3d9d68-db48-4420-8d6e-c601ccd0b716")
    public Attribute getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9eed0485-bb4e-451a-9555-32222e122153")
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
    @objid ("345baa30-49a0-40d2-ac97-04677bb3dfdc")
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

    @objid ("46807946-6453-4d8c-8cbf-c3b309113a8b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for property 'TPolicy.policyRef'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8f39968a-1bc2-4716-af98-e3f4de5ab0a9")
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
    @objid ("1dd29f41-2049-43bd-b66e-f717771b7943")
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

    @objid ("44f4f990-471f-4458-bf4e-efbedf7744b3")
    protected  TPolicy(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("9cdabba3-5ee3-4167-9304-34532fa22246")
    public static final class MdaTypes {
        @objid ("04adbf68-4771-4be1-a54a-d20e00ac4d20")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3f7563e8-fc56-413c-a879-6bc3aca9bf02")
        public static PropertyDefinition POLICYREF_PROPERTY_ELT;

        @objid ("d2597f6c-fd69-4951-a039-173fa72b761e")
        private static Stereotype MDAASSOCDEP;

        @objid ("34c352ab-1604-46a8-953a-ee4c1db0b35a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("99c3b97e-9903-4573-9b5e-57d6745708fa")
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

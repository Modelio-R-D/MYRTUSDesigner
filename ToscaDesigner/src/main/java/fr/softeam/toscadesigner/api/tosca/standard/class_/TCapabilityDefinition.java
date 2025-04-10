/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 10/04/2025 10:12 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TCapabilityDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f3db7b7c-e2c6-4d95-9609-eab0084d3865")
public class TCapabilityDefinition extends CapabilityStereotype implements IMdaProxy {
    @objid ("31cdbb39-77b8-4ca2-87be-546944bfef9c")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinition";

    @objid ("b188ebe7-2176-4c74-a6f5-2953b095281d")
    public static final String CONSTRAINTS_PROPERTY = "constraints";

    @objid ("57592091-f3cb-4908-b6f3-268e7297107f")
    public static final String LOWERBOUND_PROPERTY = "lowerBound";

    @objid ("2640d3ce-87a5-4fcd-be8b-5ff55f07ebe0")
    public static final String UPPERBOUND_PROPERTY = "upperBound";

    @objid ("f3dd1990-9ef6-489e-a453-3e7d73cc967b")
    public static final String VALIDSOURCETYPE_PROPERTY = "validSourceType";

    /**
     * Tells whether a {@link TCapabilityDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a9404611-da29-4d07-a23f-5876c509c2ba")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinition >> then instantiate a {@link TCapabilityDefinition} proxy.
     * 
     * @return a {@link TCapabilityDefinition} proxy on the created {@link Class}.
     */
    @objid ("f91798e1-0a86-4d96-8a3d-f0aac883d382")
    public static TCapabilityDefinition create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT);
        return TCapabilityDefinition.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinition} proxy from a {@link Class} stereotyped << TCapabilityDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TCapabilityDefinition} proxy or <i>null</i>.
     */
    @objid ("00865875-2148-4d58-aea6-76dfef934093")
    public static TCapabilityDefinition instantiate(final Class obj) {
        return TCapabilityDefinition.canInstantiate(obj) ? new TCapabilityDefinition(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TCapabilityDefinition} proxy from a {@link Class} stereotyped << TCapabilityDefinition >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TCapabilityDefinition} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dcffa6eb-6ee9-40e0-a78a-597717625288")
    public static TCapabilityDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityDefinition.canInstantiate(obj))
        	return new TCapabilityDefinition(obj);
        else
        	throw new IllegalArgumentException("TCapabilityDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("267fe3b9-a92c-4a15-8ac9-d9ebdee5b29c")
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
        TCapabilityDefinition other = (TCapabilityDefinition) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'capabilityType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("59e21934-a2f8-4711-8989-cc5db22d2aa0")
    public TCapabilityType getCapabilityType() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TCapabilityDefinition.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE), "capabilityType")
                  && TCapabilityType.canInstantiate(d.getDependsOn())) {
                     return (TCapabilityType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TCapabilityType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for property 'TCapabilityDefinition.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ce26554c-be35-4a0d-8a59-0fd0a0a4e40c")
    public String getConstraints() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("97b6bcd4-6ab1-424e-9427-8c1a92bdee18")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for property 'TCapabilityDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("523edad9-ac9e-4015-8a1a-f0e69fac4de8")
    public Integer getLowerBound() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (Integer) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TCapabilityDefinition.upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e339cba5-db2d-486d-9982-3655e078ead2")
    public Integer getUpperBound() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getDefaultValue();
        }
        return (Integer) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Getter for property 'TCapabilityDefinition.validSourceType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c4a46457-8b51-47b8-9ec1-55510c2ac3bc")
    public String getValidSourceType() {
        String value = this.elt.getProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                                            TCapabilityDefinition.MdaTypes.VALIDSOURCETYPE_PROPERTY_ELT.getName());
        if (value == null) {
          value = TCapabilityDefinition.MdaTypes.VALIDSOURCETYPE_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TCapabilityDefinition.MdaTypes.VALIDSOURCETYPE_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("54bf1122-322a-4933-bd4b-6c5315bfd239")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Set the value of the 'capabilityType' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("06e162ee-ded7-490c-a5f0-b8016eb18b4f")
    public void setCapabilityType(final TCapabilityType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TCapabilityDefinition.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE), "capabilityType")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TCapabilityDefinition.MdaTypes.MDAASSOCDEP);
              dep.setName("capabilityType");      dep.putTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE, "capabilityType");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Setter for property 'TCapabilityDefinition.constraints'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8ad8fe9f-1cd5-4666-ae57-9af07d1fd265")
    public void setConstraints(final String value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.CONSTRAINTS_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5177806a-1932-4873-b39a-e7647f6c9bda")
    public void setLowerBound(final Integer value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.LOWERBOUND_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2d97f650-6675-41a4-8f0e-2f7274b3aa97")
    public void setUpperBound(final Integer value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.UPPERBOUND_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TCapabilityDefinition.validSourceType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("eb5ceb21-4210-4212-936d-8329ca93caf4")
    public void setValidSourceType(final String value) {
        this.elt.setProperty(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT,
                             TCapabilityDefinition.MdaTypes.VALIDSOURCETYPE_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TCapabilityDefinition.MdaTypes.VALIDSOURCETYPE_PROPERTY_ELT, value));
    }

    @objid ("b0b57fed-1b70-49e3-8d36-32dddea9b314")
    protected  TCapabilityDefinition(final Class elt) {
        super(elt);
    }

    @objid ("f3dcfbae-0782-484a-8a0d-abc3f817933b")
    public static final class MdaTypes {
        @objid ("388c9363-1a16-4d5b-8336-fd3d5b345f72")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("99b8a6e1-6f5a-4050-818c-9995b9df8213")
        public static PropertyDefinition CONSTRAINTS_PROPERTY_ELT;

        @objid ("fd141802-d431-456d-a1cf-312107c0472c")
        public static PropertyDefinition LOWERBOUND_PROPERTY_ELT;

        @objid ("c72d5dd2-86a9-4cab-95d3-ec62bd4b1f16")
        public static PropertyDefinition UPPERBOUND_PROPERTY_ELT;

        @objid ("93e80311-5d6c-49cf-9c18-1bd4bb850780")
        public static PropertyDefinition VALIDSOURCETYPE_PROPERTY_ELT;

        @objid ("84bf7fbd-0e28-4a87-b63c-3b5d458f2c5d")
        private static Stereotype MDAASSOCDEP;

        @objid ("5866209a-8a14-4b14-ad8e-d02c0c567150")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5e16ed29-7a90-45f0-99b7-a30a183d5634")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "92f8cb40-9498-4759-9c75-6b4df72de355", "TCapabilityDefinition");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "21aae7e2-a2bd-418d-8df8-70c4fa8d4d13", "constraints");
            CONSTRAINTS_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (CONSTRAINTS_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "2a352928-d0d5-4e77-bbb4-9f69dc69b952", "lowerBound");
            LOWERBOUND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (LOWERBOUND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d94c64cf-02f1-4a6b-a229-35c8b8b6303b", "upperBound");
            UPPERBOUND_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (UPPERBOUND_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "58a9cdcd-b57e-4a9e-bbd1-d353e9f42b56", "validSourceType");
            VALIDSOURCETYPE_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (VALIDSOURCETYPE_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

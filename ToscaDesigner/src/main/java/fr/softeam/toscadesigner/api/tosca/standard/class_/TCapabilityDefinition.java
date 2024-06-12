/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 12/06/2024 14:58 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.ModelingSessionRegistry;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.toscadesigner.api.ToscaDesignerProxyFactory;
import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;

/**
 * Proxy class to handle a {@link Class} with << TCapabilityDefinition >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ea59ad78-cc42-4999-937a-87bb80c1a8cc")
public class TCapabilityDefinition implements IMdaProxy {
    @objid ("7882959a-567f-48ce-9d6e-6942ccd08ffd")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinition";

    @objid ("dde9d63f-52fb-42e3-98f1-b6fcc8dbf0eb")
    public static final String CAPABILITYTYPE_TAGTYPE = "capabilityType";

    @objid ("571c8e3a-f79f-4404-b700-ddd83a628830")
    public static final String LOWERBOUND_TAGTYPE = "lowerBound";

    @objid ("7c60f24e-00fd-45b5-840c-39b26b61ee61")
    public static final String NAME_TAGTYPE = "name";

    @objid ("3a6e5044-7370-4dfc-917d-39b3f1b65ae4")
    public static final String UPPERBOUND_TAGTYPE = "upperBound";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("dda1563e-7423-43b6-82b1-93621c9b3c99")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapabilityDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bf6c57be-ecfd-4550-8f52-0594fba6e330")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinition >> then instantiate a {@link TCapabilityDefinition} proxy.
     * 
     * @return a {@link TCapabilityDefinition} proxy on the created {@link Class}.
     */
    @objid ("6107f450-1d9d-4703-80a0-22cf460aead4")
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
    @objid ("6f3b6548-8283-46fa-8f8b-ef9d75a6d1d0")
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
    @objid ("b8bb35de-49f5-4789-92d0-a0e11a7980b6")
    public static TCapabilityDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityDefinition.canInstantiate(obj))
        	return new TCapabilityDefinition(obj);
        else
        	throw new IllegalArgumentException("TCapabilityDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a8d6449e-f8b4-482d-ae5e-90eda43f2ed3")
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
     * Getter for string property 'capabilityType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("90729025-39e9-414b-86c8-2b20a0974931")
    public String getCapabilityType() {
        return this.elt.getTagValue(TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("59fe7f93-aa6a-49e3-9555-276acb64050f")
    public ConstraintsType getConstraints() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(TCapabilityDefinition.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE), "constraints")
                  && ConstraintsType.canInstantiate(d.getDependsOn())) {
                     return (ConstraintsType)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), ConstraintsType.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("c8f52f43-eaf6-436a-96a8-3d1e6d9a306a")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("267630cb-94cf-4a54-9f96-bcd7e2defb4c")
    public String getLowerBound() {
        return this.elt.getTagValue(TCapabilityDefinition.MdaTypes.LOWERBOUND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c2860f9b-dd80-44ee-88ac-a985b4a82702")
    public String getName() {
        return this.elt.getTagValue(TCapabilityDefinition.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("82296a67-8d01-4eb5-92e5-0f5c0750f8c5")
    public String getUpperBound() {
        return this.elt.getTagValue(TCapabilityDefinition.MdaTypes.UPPERBOUND_TAGTYPE_ELT);
    }

    @objid ("70468353-01d4-4c8b-bca8-c8f1e62f30c8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'capabilityType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("17025031-ab3b-4a80-92fb-ed725e30f883")
    public void setCapabilityType(final String value) {
        this.elt.putTagValue(TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d095f860-50bf-4684-a59b-4f56280ab924")
    public void setConstraints(final ConstraintsType obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(TCapabilityDefinition.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE), "constraints")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), TCapabilityDefinition.MdaTypes.MDAASSOCDEP);
              dep.setName("constraints");      dep.putTagValue(TCapabilityDefinition.MdaTypes.MDAASSOCDEP_ROLE, "constraints");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    /**
     * Setter for string property 'lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6a74953e-2906-4598-8848-acc3ba5718f7")
    public void setLowerBound(final String value) {
        this.elt.putTagValue(TCapabilityDefinition.MdaTypes.LOWERBOUND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f5ce5bd2-b374-4f32-8903-79fa0257d0ae")
    public void setName(final String value) {
        this.elt.putTagValue(TCapabilityDefinition.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dab921f3-6b33-4b7a-bc07-c824e1b4012a")
    public void setUpperBound(final String value) {
        this.elt.putTagValue(TCapabilityDefinition.MdaTypes.UPPERBOUND_TAGTYPE_ELT, value);
    }

    @objid ("0d4267aa-ea2c-43eb-b3a6-c217ef91de37")
    protected  TCapabilityDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("45b40e77-0ea4-4cf4-b6f6-09ba8c746751")
    public static final class MdaTypes {
        @objid ("af51b219-8b59-4d75-83f0-bd625f7a19de")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("89f6d755-125e-4d4c-9c16-78d1cb6e1e42")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("8c5031a0-a61b-4023-9183-98e8a897c35b")
        public static TagType LOWERBOUND_TAGTYPE_ELT;

        @objid ("f98274fa-600b-4cef-b019-e3bbecd71f8c")
        public static TagType UPPERBOUND_TAGTYPE_ELT;

        @objid ("25f13aca-cb60-4f4d-9bd7-87a0503cb06d")
        public static TagType CAPABILITYTYPE_TAGTYPE_ELT;

        @objid ("22242edd-043d-4ec9-b3ef-6b5dacd0022e")
        private static Stereotype MDAASSOCDEP;

        @objid ("e2242230-0fab-4979-97dd-4aad23cf916d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("012c07fb-1edd-4460-8e19-e9e91fb7c949")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "92f8cb40-9498-4759-9c75-6b4df72de355", "TCapabilityDefinition");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "1776853c-6947-4bf7-8a0d-0a88e1b98d50", "name");
            NAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (NAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "6bf3d39e-f355-4ae0-8e47-3d04e90a5ba4", "lowerBound");
            LOWERBOUND_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (LOWERBOUND_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "06d9b79e-d3e3-4f07-ace2-73c6ded7a329", "upperBound");
            UPPERBOUND_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (UPPERBOUND_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "32bee67d-91fe-4a14-bdb8-5511402daf18", "capabilityType");
            CAPABILITYTYPE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (CAPABILITYTYPE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

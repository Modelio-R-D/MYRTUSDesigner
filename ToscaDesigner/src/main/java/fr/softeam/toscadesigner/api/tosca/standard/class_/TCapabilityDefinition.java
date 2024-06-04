/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 04/06/2024 17:23 by Modelio Studio.
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
@objid ("cd303f1c-fdef-4b0f-a88b-fd5abc70a7cc")
public class TCapabilityDefinition implements IMdaProxy {
    @objid ("9119b634-9f31-452f-b0af-c652db768ab3")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinition";

    @objid ("328b382a-bc70-4854-b244-71bc906acceb")
    public static final String CAPABILITYTYPE_TAGTYPE = "capabilityType";

    @objid ("06f83ec4-57ae-42d9-b475-8a7201559f10")
    public static final String LOWERBOUND_TAGTYPE = "lowerBound";

    @objid ("b60225be-92e2-42eb-97f4-ee4c72bfb544")
    public static final String NAME_TAGTYPE = "name";

    @objid ("3ef0e4ff-3443-4b88-a262-badf069c8d50")
    public static final String UPPERBOUND_TAGTYPE = "upperBound";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("f3cc043c-e8c6-4552-a108-b08d4cdde491")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapabilityDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3c16e6db-3570-4cab-a374-4517fd01b6cd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinition >> then instantiate a {@link TCapabilityDefinition} proxy.
     * 
     * @return a {@link TCapabilityDefinition} proxy on the created {@link Class}.
     */
    @objid ("9c45e21a-815d-4dad-926b-cf4e22b46b57")
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
    @objid ("a4d57580-3860-4a89-9512-3e92debf1e2e")
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
    @objid ("06e01ce9-943e-40aa-9ca9-898d4452a213")
    public static TCapabilityDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityDefinition.canInstantiate(obj))
        	return new TCapabilityDefinition(obj);
        else
        	throw new IllegalArgumentException("TCapabilityDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d5dbd958-4b92-454b-aea7-a39c295e6359")
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
    @objid ("82717035-dd0a-40d3-ad9b-60d76f528db3")
    public String getCapabilityType() {
        return this.elt.getTagValue(TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1caca894-e8d2-4ff4-bdcd-567f701cbb42")
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
    @objid ("a8197f24-7d48-4e4c-91e4-f8edc961397f")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ee092fb2-1d70-47bf-989c-961652b15827")
    public String getLowerBound() {
        return this.elt.getTagValue(TCapabilityDefinition.MdaTypes.LOWERBOUND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("759ec41a-4a4b-4059-9402-a6f0defa1c48")
    public String getName() {
        return this.elt.getTagValue(TCapabilityDefinition.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6db67d67-1899-46c7-b851-bcf1b565c99f")
    public String getUpperBound() {
        return this.elt.getTagValue(TCapabilityDefinition.MdaTypes.UPPERBOUND_TAGTYPE_ELT);
    }

    @objid ("e0d85de5-8d9a-451b-9d41-1480df1cc799")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'capabilityType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("51ae1ddf-c717-483c-8772-bbba9b5b9b08")
    public void setCapabilityType(final String value) {
        this.elt.putTagValue(TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d8e31ee3-0b5b-4f67-8840-1a711279ad41")
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
    @objid ("084dbe99-6c84-4953-b7cc-a0aef923b93b")
    public void setLowerBound(final String value) {
        this.elt.putTagValue(TCapabilityDefinition.MdaTypes.LOWERBOUND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("90b35327-5684-46ff-bf7b-34cc90d6138e")
    public void setName(final String value) {
        this.elt.putTagValue(TCapabilityDefinition.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("573ae00e-a591-4c7d-afa9-1ff9daa7c10f")
    public void setUpperBound(final String value) {
        this.elt.putTagValue(TCapabilityDefinition.MdaTypes.UPPERBOUND_TAGTYPE_ELT, value);
    }

    @objid ("0a58f77e-3ab0-4488-af65-9394a34d6e30")
    protected  TCapabilityDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("e4b09dc8-7415-40d2-83ea-7f1da063fde9")
    public static final class MdaTypes {
        @objid ("71ae4902-02a1-4335-857e-91f360455347")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4db5d6d9-6b65-4486-b091-462b77078e39")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("b04c01e5-b82e-48b3-86e6-13c6b8ca2c66")
        public static TagType LOWERBOUND_TAGTYPE_ELT;

        @objid ("51fdcecd-a0ce-438a-95fa-e4359fd016af")
        public static TagType UPPERBOUND_TAGTYPE_ELT;

        @objid ("602a0e17-f486-4e2f-ba82-62c83d5b182e")
        public static TagType CAPABILITYTYPE_TAGTYPE_ELT;

        @objid ("52cbb48a-d181-4442-b01e-580a381a2cf2")
        private static Stereotype MDAASSOCDEP;

        @objid ("dc448c6d-310b-4210-867d-5db6511756ce")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cd0efbca-19fc-4db1-8a1c-057d4870a47a")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/06/2024 17:18 by Modelio Studio.
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
    @objid ("6a9da657-317f-46b8-a668-4ec44a9aa428")
    public static final String STEREOTYPE_NAME = "TCapabilityDefinition";

    @objid ("435bd3d8-8e01-4dac-8291-5007cf4cc7ed")
    public static final String CAPABILITYTYPE_TAGTYPE = "capabilityType";

    @objid ("d6e8f226-dae0-4147-bb64-e70100d8b8b5")
    public static final String LOWERBOUND_TAGTYPE = "lowerBound";

    @objid ("372433b7-9549-4180-850f-21cd429a5f45")
    public static final String NAME_TAGTYPE = "name";

    @objid ("81d4461b-d541-4a5b-8c75-669f781b1bec")
    public static final String UPPERBOUND_TAGTYPE = "upperBound";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("955ab8d1-2481-4e2a-8266-f5a290a48744")
    protected final Class elt;

    /**
     * Tells whether a {@link TCapabilityDefinition proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TCapabilityDefinition >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("523c8eb8-f6f7-49fb-86c0-ec6338def5e6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TCapabilityDefinition.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TCapabilityDefinition >> then instantiate a {@link TCapabilityDefinition} proxy.
     * 
     * @return a {@link TCapabilityDefinition} proxy on the created {@link Class}.
     */
    @objid ("4da9585b-27f2-4ea0-a60a-f851a942d99b")
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
    @objid ("ef07b3af-764b-45ed-9398-fa9466467802")
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
    @objid ("83aba919-59bb-4132-8e32-09330905ae39")
    public static TCapabilityDefinition safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TCapabilityDefinition.canInstantiate(obj))
        	return new TCapabilityDefinition(obj);
        else
        	throw new IllegalArgumentException("TCapabilityDefinition: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("10935d02-0322-4d01-aa24-a37f5a93c192")
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
    @objid ("072d0345-16ea-4ba9-856b-277c68ed9d9a")
    public String getCapabilityType() {
        return this.elt.getTagValue(TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bff560ea-0e06-4511-a692-52aa97590d7a")
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
    @objid ("7968658f-6ec5-4097-94ba-b1a5d91097d1")
    public Class getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'lowerBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c4470b2c-349b-4285-a9f6-b26becbe449c")
    public String getLowerBound() {
        return this.elt.getTagValue(TCapabilityDefinition.MdaTypes.LOWERBOUND_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("869951da-4a5c-4e7b-855b-529b6b4d6c3b")
    public String getName() {
        return this.elt.getTagValue(TCapabilityDefinition.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1634cb97-da06-4f9f-ae4e-2f08c6d8e1ea")
    public String getUpperBound() {
        return this.elt.getTagValue(TCapabilityDefinition.MdaTypes.UPPERBOUND_TAGTYPE_ELT);
    }

    @objid ("8b3b82d3-2c09-4cd7-af6f-549ae581d257")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'capabilityType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3f0aa56a-72b7-419b-a7a7-42b1e4bc1163")
    public void setCapabilityType(final String value) {
        this.elt.putTagValue(TCapabilityDefinition.MdaTypes.CAPABILITYTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("401e5925-6568-4315-ae69-a758d0526085")
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
    @objid ("2c722216-63cc-4b1e-8ef2-2fdad1a1e5d6")
    public void setLowerBound(final String value) {
        this.elt.putTagValue(TCapabilityDefinition.MdaTypes.LOWERBOUND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aabaaf15-f16f-47a8-a8b9-918e7d04c56c")
    public void setName(final String value) {
        this.elt.putTagValue(TCapabilityDefinition.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'upperBound'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5371aec2-ba88-4f50-934b-8fcc1b5d9a03")
    public void setUpperBound(final String value) {
        this.elt.putTagValue(TCapabilityDefinition.MdaTypes.UPPERBOUND_TAGTYPE_ELT, value);
    }

    @objid ("b4119a02-b43a-41e8-8384-0f4cd9a9ad08")
    protected  TCapabilityDefinition(final Class elt) {
        this.elt = elt;
    }

    @objid ("e4b09dc8-7415-40d2-83ea-7f1da063fde9")
    public static final class MdaTypes {
        @objid ("cc04581c-5681-4ba4-a6ab-0dfecd98823e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c0f64a8c-76bb-4284-afe1-3bb3df68af2a")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("83969ef0-793d-4d89-8ce7-b1458a905329")
        public static TagType LOWERBOUND_TAGTYPE_ELT;

        @objid ("c8de5f56-8bb7-4283-85d4-8960c219df48")
        public static TagType UPPERBOUND_TAGTYPE_ELT;

        @objid ("ceee4265-d9ed-4c33-abd7-6f20ed3246db")
        public static TagType CAPABILITYTYPE_TAGTYPE_ELT;

        @objid ("ef90f1e0-d207-49e4-9bfe-2d35383230ec")
        private static Stereotype MDAASSOCDEP;

        @objid ("3e8becb3-0862-4930-8a6f-0ec3e4865d85")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fd090b2d-5239-42db-9403-ae23f1a1fa48")
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

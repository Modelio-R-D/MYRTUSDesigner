/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/04/2024 16:51 by Modelio Studio.
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
@objid ("a2355551-417e-4b9a-b842-5a3a0d94362e")
public class TRelationshipTemplate extends TEntityTemplate implements IMdaProxy {
    @objid ("63bf5a1e-f467-459d-9a07-4da354be93d8")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplate";

    @objid ("948c7b5c-6d08-461c-a068-65bfe4cbc551")
    public static final String NAME_TAGTYPE = "name";

    /**
     * Tells whether a {@link TRelationshipTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << TRelationshipTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b0034650-367f-46a3-a472-fd2f66cc96f6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && (TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Association) elt).isStereotyped(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Association} stereotyped << TRelationshipTemplate >> then instantiate a {@link TRelationshipTemplate} proxy.
     * 
     * @return a {@link TRelationshipTemplate} proxy on the created {@link Association}.
     */
    @objid ("f91753b6-9a65-4781-bb49-b87823a5bfa8")
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
    @objid ("822434c4-b4b0-4cb2-abd4-9f7d93987a73")
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
    @objid ("723f6c1d-3c5c-4d00-9cf1-34660661847d")
    public static TRelationshipTemplate safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (TRelationshipTemplate.canInstantiate(obj))
        	return new TRelationshipTemplate(obj);
        else
        	throw new IllegalArgumentException("TRelationshipTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4d9d9cd3-209b-485c-90a6-8ab4b2e7a3fa")
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
    @objid ("89dd328d-3fbb-4e91-ad0e-42b2ab269fe4")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f51c4ee2-5d4e-4099-acdb-daacae165c44")
    public String getName() {
        return this.elt.getTagValue(TRelationshipTemplate.MdaTypes.NAME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'relationshipConstraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("24162e03-e4e0-417d-b4a4-ed07d905864c")
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

    @objid ("51d6786d-791b-4ef6-8a08-64ab54fe7fdb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Setter for string property 'name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("afe85ae2-9d44-450e-bc6a-d57807b97718")
    public void setName(final String value) {
        this.elt.putTagValue(TRelationshipTemplate.MdaTypes.NAME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'relationshipConstraints' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("61a96c84-efb7-4094-b90a-687e3b4a274f")
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

    @objid ("cca43f77-59fe-4434-a03c-5455021c4707")
    protected  TRelationshipTemplate(final Association elt) {
        super(elt);
    }

    @objid ("d6cdbf9d-3bee-45cf-b04e-4a31f668d827")
    public static final class MdaTypes {
        @objid ("c32d6020-7e20-4ea9-9229-f174f957cf8e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b9a39103-2f07-49a7-a534-598a6691d478")
        public static TagType NAME_TAGTYPE_ELT;

        @objid ("fb314705-fa63-4a07-b850-9019fd812f9c")
        private static Stereotype MDAASSOCDEP;

        @objid ("59ec2486-75e9-41bc-a870-cf12d18d0fda")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b3d74103-baf7-442d-95cc-2f319a05e694")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7f01001b-511e-4017-b6b4-729f68c85911", "TRelationshipTemplate");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "2f615bad-125a-47d7-bb05-1e78ac68cea3", "name");
            NAME_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (NAME_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
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

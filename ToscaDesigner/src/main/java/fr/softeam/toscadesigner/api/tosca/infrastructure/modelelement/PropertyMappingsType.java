/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 19/09/2024 15:04 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << PropertyMappingsType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8477852b-e430-4ae8-ace4-0bdb34de6b52")
public class PropertyMappingsType implements IMdaProxy {
    @objid ("26b3485a-1703-4dfe-8a94-d965bc0b0858")
    public static final String STEREOTYPE_NAME = "PropertyMappingsType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("71692c48-1cca-446c-bdd7-10716fe2a5ca")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link PropertyMappingsType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << PropertyMappingsType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("aafd8e76-f1a8-49f9-9a07-474ba7dbf0e7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (PropertyMappingsType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(PropertyMappingsType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << PropertyMappingsType >> then instantiate a {@link PropertyMappingsType} proxy.
     * 
     * @return a {@link PropertyMappingsType} proxy on the created {@link ModelElement}.
     */
    @objid ("18395cf2-27e6-4ca4-94b4-f7cc22afc3ea")
    public static PropertyMappingsType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(PropertyMappingsType.MdaTypes.STEREOTYPE_ELT);
        return PropertyMappingsType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link PropertyMappingsType} proxy from a {@link ModelElement} stereotyped << PropertyMappingsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link PropertyMappingsType} proxy or <i>null</i>.
     */
    @objid ("7bcfb81c-436b-439c-9a91-9dd785c04cf0")
    public static PropertyMappingsType instantiate(final ModelElement obj) {
        return PropertyMappingsType.canInstantiate(obj) ? new PropertyMappingsType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertyMappingsType} proxy from a {@link ModelElement} stereotyped << PropertyMappingsType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link PropertyMappingsType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("12de3130-36cf-400a-98b0-9fcb36752fea")
    public static PropertyMappingsType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (PropertyMappingsType.canInstantiate(obj))
        	return new PropertyMappingsType(obj);
        else
        	throw new IllegalArgumentException("PropertyMappingsType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'propertyMapping' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2b92b9ec-b8f3-4723-a5a7-69f7ea720da9")
    public void addPropertyMapping(final TPropertyMapping obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), PropertyMappingsType.MdaTypes.MDAASSOCDEP);
            d.setName("propertyMapping");
            d.putTagValue(PropertyMappingsType.MdaTypes.MDAASSOCDEP_ROLE, "propertyMapping");
        }
    }

    @objid ("803cc89a-b446-4ba3-b125-9364228549fd")
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
        PropertyMappingsType other = (PropertyMappingsType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("348f51e7-325b-44c0-baf8-aa727fceb401")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'propertyMapping' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8ab170c2-c6ff-4cf0-848f-8b45c1e9e5a4")
    public List<TPropertyMapping> getPropertyMapping() {
        List<TPropertyMapping> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(PropertyMappingsType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(PropertyMappingsType.MdaTypes.MDAASSOCDEP_ROLE), "propertyMapping")
              && TPropertyMapping.canInstantiate(d.getDependsOn()))
                results.add((TPropertyMapping)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPropertyMapping.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4b5edd27-6b1f-44b4-9f78-a5c2bfdf84fa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'propertyMapping' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8b477bf1-3d1f-4767-9866-cbcec50a7ab2")
    public boolean removePropertyMapping(final TPropertyMapping obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(PropertyMappingsType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(PropertyMappingsType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("77fe0355-85c2-45c3-a548-54ddc96f761a")
    protected  PropertyMappingsType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("a1e454df-2f23-42b0-9c69-20eb90258431")
    public static final class MdaTypes {
        @objid ("e58bfeba-cd23-4c76-899c-65b7e337310f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a19aa010-f7d9-4a30-8409-d7d66432587a")
        private static Stereotype MDAASSOCDEP;

        @objid ("e5249142-cf35-4cd3-a9d6-1d0e1a75f281")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a67ab1d1-d5c3-408e-ad07-b55dbe3a72d8")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "3d7421b3-1723-4400-8e4f-48176ac40c34", "PropertyMappingsType");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
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

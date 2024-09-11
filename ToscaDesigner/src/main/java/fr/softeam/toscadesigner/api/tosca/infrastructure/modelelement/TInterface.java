/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/09/2024 11:45 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TInterface >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e775c97f-3522-4560-8548-f46367ef065f")
public class TInterface implements IMdaProxy {
    @objid ("24015bdb-03d6-494e-b53e-b4aafd28bd69")
    public static final String STEREOTYPE_NAME = "TInterface";

    @objid ("b71ca957-5c9c-452d-a46b-053c128321b7")
    public static final String PROPERTYTYPEDEFINITION2_PROPERTY = "PropertyTypeDefinition2";

    @objid ("ebcd4b84-6c81-47e8-bef0-9d8bc41d349f")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("b5f69409-f3ad-4127-9da5-822e0c93f7fe")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TInterface >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0f78bf1f-98cf-4bbb-8559-82a82182d570")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TInterface.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TInterface.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TInterface >> then instantiate a {@link TInterface} proxy.
     * 
     * @return a {@link TInterface} proxy on the created {@link ModelElement}.
     */
    @objid ("3a39f319-d909-45ab-898c-cfc83e98e341")
    public static TInterface create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TInterface.MdaTypes.STEREOTYPE_ELT);
        return TInterface.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TInterface} proxy from a {@link ModelElement} stereotyped << TInterface >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TInterface} proxy or <i>null</i>.
     */
    @objid ("0a0eac2f-ff6b-4e9a-a281-7547001f391d")
    public static TInterface instantiate(final ModelElement obj) {
        return TInterface.canInstantiate(obj) ? new TInterface(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TInterface} proxy from a {@link ModelElement} stereotyped << TInterface >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TInterface} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c05f36e1-cc7f-4c02-9770-386767bb9bf5")
    public static TInterface safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TInterface.canInstantiate(obj))
        	return new TInterface(obj);
        else
        	throw new IllegalArgumentException("TInterface: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7a9fbc0e-bae4-4503-ab23-8ccbe1e46f7f")
    public void addOperation(final TOperation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TInterface.MdaTypes.MDAASSOCDEP);
            d.setName("operation");
            d.putTagValue(TInterface.MdaTypes.MDAASSOCDEP_ROLE, "operation");
        }
    }

    @objid ("bd38e903-b84d-4e99-a001-f1ca7810406f")
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
        TInterface other = (TInterface) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("7f2f5e04-f3c4-48b9-b9d8-0f65577724c0")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TInterface.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("abd9353d-3d27-411b-87c0-6d9582541f4a")
    public String getName() {
        String value = this.elt.getProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                                            TInterface.MdaTypes.NAME_PROPERTY_ELT.getName());
        if (value == null) {
          value = TInterface.MdaTypes.NAME_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TInterface.MdaTypes.NAME_PROPERTY_ELT, value, this.elt);
        
    }

    /**
     * Get the values of the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e57e1de8-c9ed-45f6-a2ed-629af612c995")
    public List<TOperation> getOperation() {
        List<TOperation> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TInterface.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TInterface.MdaTypes.MDAASSOCDEP_ROLE), "operation")
              && TOperation.canInstantiate(d.getDependsOn()))
                results.add((TOperation)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TOperation.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for property 'TInterface.PropertyTypeDefinition2'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fa026cfb-ddfa-4576-abe6-913d2e1fa0d2")
    public String getPropertyTypeDefinition2() {
        String value = this.elt.getProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                                            TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getName());
        if (value == null) {
          value = TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("78e50e1b-9475-40b3-8e4a-fc12419efd33")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'operation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a8dfbc05-7109-4c2b-823f-7da202d861ee")
    public boolean removeOperation(final TOperation obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TInterface.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TInterface.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Setter for property 'TInterface.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1176566c-fb11-449e-9e24-e2f92dc521c1")
    public void setName(final String value) {
        this.elt.setProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                             TInterface.MdaTypes.NAME_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TInterface.MdaTypes.NAME_PROPERTY_ELT, value));
    }

    /**
     * Setter for property 'TInterface.PropertyTypeDefinition2'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b87c6df2-b075-4fc7-84da-8e7312874113")
    public void setPropertyTypeDefinition2(final String value) {
        this.elt.setProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                             TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT, value));
    }

    @objid ("f401b05c-d1d4-4490-86f4-6e24dc62c6f4")
    protected  TInterface(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("cd2be280-cf56-491a-9c2f-c8d7562f9181")
    public static final class MdaTypes {
        @objid ("64763d5a-b206-4063-81a3-3cae877046ca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b6629e63-f36d-471a-a064-9a538b169fd2")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("332dbe92-29be-4af6-9b65-2cfcf57a4cf3")
        public static PropertyDefinition PROPERTYTYPEDEFINITION2_PROPERTY_ELT;

        @objid ("ca324082-8cb7-4b1c-859a-17e937cc1eb2")
        private static Stereotype MDAASSOCDEP;

        @objid ("298d48d6-7e3b-4e57-93c4-7a16910f24bd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("696fdc57-9b98-419d-bcdd-649a28a5352c")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7a56a78f-21b0-463d-b927-b9a3a461b565", "TInterface");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "abc12b37-e245-4073-9a9f-ebeeb2f4426d", "name");
            NAME_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (NAME_PROPERTY_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "d060b91b-e90c-48fb-8017-56a04caf352b", "PropertyTypeDefinition2");
            PROPERTYTYPEDEFINITION2_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (PROPERTYTYPEDEFINITION2_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

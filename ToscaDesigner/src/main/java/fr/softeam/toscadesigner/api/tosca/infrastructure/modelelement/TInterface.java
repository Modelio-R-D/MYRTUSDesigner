/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 24/09/2024 16:22 by Modelio Studio.
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
    @objid ("cf016008-b755-42ff-90b7-bf82718d8e53")
    public static final String STEREOTYPE_NAME = "TInterface";

    @objid ("83d709ef-9301-48ce-9b6b-323ceda8cc36")
    public static final String PROPERTYTYPEDEFINITION2_PROPERTY = "PropertyTypeDefinition2";

    @objid ("022404c9-c358-49b5-8dcc-879b70f7b403")
    public static final String NAME_PROPERTY = "name";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("61eaca90-e043-4ca9-9b23-2a98ca269299")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TInterface >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6ee01266-444e-413b-8f69-602ffb936c68")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TInterface.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TInterface.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TInterface >> then instantiate a {@link TInterface} proxy.
     * 
     * @return a {@link TInterface} proxy on the created {@link ModelElement}.
     */
    @objid ("dafcc679-d8ca-4709-88d5-cf5267a1be8b")
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
    @objid ("16c93440-e7d4-4d33-9032-8279ce46cde5")
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
    @objid ("e66115dd-911b-4f2e-a3d4-5aac4d36c6d7")
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
    @objid ("0caf44b9-7394-44e3-8617-e2388de9f70b")
    public void addOperation(final TOperation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TInterface.MdaTypes.MDAASSOCDEP);
            d.setName("operation");
            d.putTagValue(TInterface.MdaTypes.MDAASSOCDEP_ROLE, "operation");
        }
    }

    @objid ("adfb2023-5b99-4713-81ac-64b7770e3c95")
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
    @objid ("3afcc2af-c9d7-4dc6-8d8c-d1a12488b475")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TInterface.name'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("27a32b51-106f-4153-95d9-84616b50db75")
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
    @objid ("ba29a0ec-8366-4ec1-93bd-204292e25e64")
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
    @objid ("ea411fed-586f-4d29-b02d-06f14d0f8dfa")
    public String getPropertyTypeDefinition2() {
        String value = this.elt.getProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                                            TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getName());
        if (value == null) {
          value = TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("31a5f7c9-c687-405c-be5b-0cb6e0655722")
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
    @objid ("3fb00b98-2116-4f76-ae26-05d6daee415d")
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
    @objid ("6bfcc7ad-e63d-40d8-879d-0591de34e8a6")
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
    @objid ("6f9c8646-9703-4ef4-9d33-f7401536b058")
    public void setPropertyTypeDefinition2(final String value) {
        this.elt.setProperty(TInterface.MdaTypes.STEREOTYPE_ELT,
                             TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TInterface.MdaTypes.PROPERTYTYPEDEFINITION2_PROPERTY_ELT, value));
    }

    @objid ("8af53fdb-1a2e-4bf2-8f8c-622f7f663701")
    protected  TInterface(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("cd2be280-cf56-491a-9c2f-c8d7562f9181")
    public static final class MdaTypes {
        @objid ("a8fdc66a-511a-45a9-890d-8192d046c0e9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3ce7ab78-a066-4b37-a3db-f2af323f833f")
        public static PropertyDefinition NAME_PROPERTY_ELT;

        @objid ("fa50d24c-8bc7-4033-a88d-7b9b3ab2aef7")
        public static PropertyDefinition PROPERTYTYPEDEFINITION2_PROPERTY_ELT;

        @objid ("9cd1b89d-d443-4ea8-b73c-c945bce9bbf5")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a7fe568-9d56-4638-a7dc-04804c2f8407")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0d86f198-5957-4086-828d-e7c7effd5dcd")
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

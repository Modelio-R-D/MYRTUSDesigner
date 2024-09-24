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
import fr.softeam.toscadesigner.api.tosca.standard.class_.TDocumentation;
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
 * Proxy class to handle a {@link ModelElement} with << TExtensibleElements >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("69e30147-2ce4-4d4f-9aaa-62e3aa9ddc05")
public class TExtensibleElements implements IMdaProxy {
    @objid ("c6a180ae-0c76-4169-bf7c-a268449167f7")
    public static final String STEREOTYPE_NAME = "TExtensibleElements";

    @objid ("292e8577-732b-4251-a2b3-3a7a67d89f06")
    public static final String ANYATTRIBUTE_TAGTYPE = "anyAttribute";

    @objid ("9f46770b-e26f-4314-abb3-912ee61e5a05")
    public static final String METADATA_PROPERTY = "metadata";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("16661bea-3804-4196-b3ed-695e6930a336")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TExtensibleElements proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtensibleElements >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("81bca820-8f0c-4e31-86cc-8d19385ff18e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtensibleElements.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtensibleElements.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtensibleElements >> then instantiate a {@link TExtensibleElements} proxy.
     * 
     * @return a {@link TExtensibleElements} proxy on the created {@link ModelElement}.
     */
    @objid ("3b260937-ffac-47a7-aeca-557b0b3a3333")
    public static TExtensibleElements create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TExtensibleElements.MdaTypes.STEREOTYPE_ELT);
        return TExtensibleElements.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TExtensibleElements} proxy from a {@link ModelElement} stereotyped << TExtensibleElements >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TExtensibleElements} proxy or <i>null</i>.
     */
    @objid ("9c4cbcc1-2481-4222-98e4-106787c4acba")
    public static TExtensibleElements instantiate(final ModelElement obj) {
        return TExtensibleElements.canInstantiate(obj) ? new TExtensibleElements(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExtensibleElements} proxy from a {@link ModelElement} stereotyped << TExtensibleElements >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TExtensibleElements} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("63302687-bfb4-40b3-86ef-97b2b593f2ad")
    public static TExtensibleElements safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExtensibleElements.canInstantiate(obj))
        	return new TExtensibleElements(obj);
        else
        	throw new IllegalArgumentException("TExtensibleElements: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'documentation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3aceb3fc-40b3-4260-a5d2-e204518eecbd")
    public void addDocumentation(final TDocumentation obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TExtensibleElements.MdaTypes.MDAASSOCDEP);
            d.setName("documentation");
            d.putTagValue(TExtensibleElements.MdaTypes.MDAASSOCDEP_ROLE, "documentation");
        }
    }

    @objid ("de9d125f-2906-4654-b829-daa98934ad71")
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
        TExtensibleElements other = (TExtensibleElements) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'anyAttribute'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("952dd3c1-0cb1-4d21-9c6c-5aa8b9ff140a")
    public String getAnyAttribute() {
        return this.elt.getTagValue(TExtensibleElements.MdaTypes.ANYATTRIBUTE_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'documentation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9f20a20d-3af0-45f8-9e70-a39ba8dd216e")
    public List<TDocumentation> getDocumentation() {
        List<TDocumentation> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TExtensibleElements.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TExtensibleElements.MdaTypes.MDAASSOCDEP_ROLE), "documentation")
              && TDocumentation.canInstantiate(d.getDependsOn()))
                results.add((TDocumentation)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TDocumentation.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("bfd63bc3-ceb5-483e-a978-5a4ea83cfda7")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for property 'TExtensibleElements.metadata'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bb1c1fce-afa9-4f61-b589-5ebab8a97ecb")
    public String getMetadata() {
        String value = this.elt.getProperty(TExtensibleElements.MdaTypes.STEREOTYPE_ELT,
                                            TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT.getName());
        if (value == null) {
          value = TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT.getDefaultValue();
        }
        return (String) PropertyConverter.convertToObject(TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT, value, this.elt);
        
    }

    @objid ("515fc4ef-72c9-4e72-9408-0e943e129cd5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'documentation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("458c8dd2-5a72-4ed5-bed2-0b4f8c54e5b3")
    public boolean removeDocumentation(final TDocumentation obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TExtensibleElements.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TExtensibleElements.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    /**
     * Setter for string property 'anyAttribute'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4fc407d8-5455-409a-ad62-15453a5cd079")
    public void setAnyAttribute(final String value) {
        this.elt.putTagValue(TExtensibleElements.MdaTypes.ANYATTRIBUTE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for property 'TExtensibleElements.metadata'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ab11a2b9-06db-44de-ae36-187c49f81585")
    public void setMetadata(final String value) {
        this.elt.setProperty(TExtensibleElements.MdaTypes.STEREOTYPE_ELT,
                             TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT.getName(),
                             PropertyConverter.convertToString(TExtensibleElements.MdaTypes.METADATA_PROPERTY_ELT, value));
    }

    @objid ("2d7ab208-a4c5-48ea-82d0-e77b81cb4fd2")
    protected  TExtensibleElements(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("234aa96f-e58b-4ed5-858d-1c3f66d65ed4")
    public static final class MdaTypes {
        @objid ("a53c081f-6cde-46ca-9266-cd600e6afcac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("88bfed62-aab8-446d-b807-5de12907c242")
        public static TagType ANYATTRIBUTE_TAGTYPE_ELT;

        @objid ("68d77bc9-d505-4b8f-82f1-e513d1472ada")
        public static PropertyDefinition METADATA_PROPERTY_ELT;

        @objid ("2ec01e6b-befc-4781-930d-c0b5640a6474")
        private static Stereotype MDAASSOCDEP;

        @objid ("cd095faf-a6e5-42a1-8b41-423e2f1815b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9f6c6b8a-704a-40c7-bcb0-66fdf322f56e")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "1aad84ed-4c30-40ec-a4d8-6712bb6bd018", "TExtensibleElements");
            STEREOTYPE_ELT = (Stereotype) session.findByRef(mRef);
            if (STEREOTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(TagType.MQNAME, "070d869e-3813-43b0-b0cc-ee4ec09ba88f", "anyAttribute");
            ANYATTRIBUTE_TAGTYPE_ELT = (TagType) session.findByRef(mRef);
            if (ANYATTRIBUTE_TAGTYPE_ELT==null) missingRefs.add(mRef);
            
            mRef = new MRef(PropertyDefinition.MQNAME, "e4645b6d-f3ea-44be-983b-99aaab068509", "metadata");
            METADATA_PROPERTY_ELT = (PropertyDefinition) session.findByRef(mRef);
            if (METADATA_PROPERTY_ELT==null) missingRefs.add(mRef);
            
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

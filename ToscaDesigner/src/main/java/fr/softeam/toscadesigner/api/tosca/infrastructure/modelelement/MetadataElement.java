/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 17:58 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << MetadataElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6d365d23-4bf8-42e9-869a-311f5af24286")
public class MetadataElement implements IMdaProxy {
    @objid ("80011539-ce89-4632-9a8b-80d359059661")
    public static final String STEREOTYPE_NAME = "MetadataElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6410fe88-58de-4d4a-a983-51066e9ef03f")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link MetadataElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << MetadataElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7973be3c-de87-4b5b-a51c-bfe28036d3ae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (MetadataElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(MetadataElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << MetadataElement >> then instantiate a {@link MetadataElement} proxy.
     * 
     * @return a {@link MetadataElement} proxy on the created {@link ModelElement}.
     */
    @objid ("8cb7e2a7-48df-4c9c-a00a-934f9a5b0545")
    public static MetadataElement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(MetadataElement.MdaTypes.STEREOTYPE_ELT);
        return MetadataElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link MetadataElement} proxy from a {@link ModelElement} stereotyped << MetadataElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link MetadataElement} proxy or <i>null</i>.
     */
    @objid ("53f0bbf6-fafb-4634-93c1-4f052334c405")
    public static MetadataElement instantiate(final ModelElement obj) {
        return MetadataElement.canInstantiate(obj) ? new MetadataElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetadataElement} proxy from a {@link ModelElement} stereotyped << MetadataElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link MetadataElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d7f547da-5661-40cc-b685-2e9278d9776e")
    public static MetadataElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (MetadataElement.canInstantiate(obj))
        	return new MetadataElement(obj);
        else
        	throw new IllegalArgumentException("MetadataElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d49b735d-8ad2-44d2-877c-167f03b8d3ff")
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
        MetadataElement other = (MetadataElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("8e873079-aa6e-4b48-8a52-234246c12079")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'elements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bab55141-1592-4925-9e22-10e74201bfcf")
    public TPropertyDef getElements() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetadataElement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetadataElement.MdaTypes.MDAASSOCDEP_ROLE), "elements")
                  && TPropertyDef.canInstantiate(d.getDependsOn())) {
                     return (TPropertyDef)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TPropertyDef.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("13fb5488-d2eb-45f9-9b90-7728c41b2561")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Set the value of the 'elements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a6e5db09-b768-450a-b0a4-0d34a7c7d600")
    public void setElements(final TPropertyDef obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetadataElement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetadataElement.MdaTypes.MDAASSOCDEP_ROLE), "elements")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetadataElement.MdaTypes.MDAASSOCDEP);
              dep.setName("elements");      dep.putTagValue(MetadataElement.MdaTypes.MDAASSOCDEP_ROLE, "elements");
          }
          dep.setDependsOn(obj.getElement());
        }
        
    }

    @objid ("c4cb5312-0bc3-4bf9-b473-88cf73e55eb7")
    protected  MetadataElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("c113b757-e176-4bc0-b012-4accfe40922c")
    public static final class MdaTypes {
        @objid ("bc289608-154b-4a2b-ac3b-d02f55618034")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("40259983-18fc-4808-b88b-d3d8a0b42b84")
        private static Stereotype MDAASSOCDEP;

        @objid ("8f1f68c7-7a17-493a-ad19-9bdf42baa62a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c5642234-cbe2-4a93-9d8d-2c72c05cdc7f")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "2c20f655-d501-4dde-b82b-ddc16c6d0c0f", "MetadataElement");
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

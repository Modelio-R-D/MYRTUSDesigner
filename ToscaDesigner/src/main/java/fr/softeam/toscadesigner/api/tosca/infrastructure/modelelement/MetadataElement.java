/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 16/08/2024 12:30 by Modelio Studio.
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
@objid ("2b3dc2db-7c80-4f5e-852d-d3fd38a4d361")
public class MetadataElement implements IMdaProxy {
    @objid ("a7b0caf3-28cb-40ed-ab93-ac7df7b5fcb2")
    public static final String STEREOTYPE_NAME = "MetadataElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("f2b36bee-3776-4681-b4a7-0074dcb41a37")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link MetadataElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << MetadataElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f5eb7340-693f-41fc-96d2-ca94cb6493ec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (MetadataElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(MetadataElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << MetadataElement >> then instantiate a {@link MetadataElement} proxy.
     * 
     * @return a {@link MetadataElement} proxy on the created {@link ModelElement}.
     */
    @objid ("02e106a4-11cd-446c-bf52-5bba5f87f14b")
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
    @objid ("4071c5ca-af25-46f1-971a-7b3301036710")
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
    @objid ("78ed8875-302a-4c4b-88b7-a69ebd742cb6")
    public static MetadataElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (MetadataElement.canInstantiate(obj))
        	return new MetadataElement(obj);
        else
        	throw new IllegalArgumentException("MetadataElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2fd18792-1fd1-4109-858a-9dd1b130f097")
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
    @objid ("3e48ecd2-7487-4ab0-b3fc-46b0ed300bc6")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the value of the 'elements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("997eb3b1-c29e-4ae5-885b-7aae4d442869")
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

    @objid ("b46ac777-a6dc-4f1c-89a9-39edf9b0e17b")
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
    @objid ("4041ac7f-08d4-495c-847d-ecc711e6879e")
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

    @objid ("136ddf3a-af9d-458c-a3d2-ef42eef61082")
    protected  MetadataElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("04352d78-8d23-4279-b055-c0f61c24c635")
    public static final class MdaTypes {
        @objid ("d8cf62ef-8043-4655-b806-7dd73ff2aa88")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a9ce2a08-194d-4d5b-81c2-cb44ddda2727")
        private static Stereotype MDAASSOCDEP;

        @objid ("7d3bed7e-933c-4f24-ac71-fe3b9a59ddc0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("06197039-9290-4095-bc16-865b4ae72303")
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

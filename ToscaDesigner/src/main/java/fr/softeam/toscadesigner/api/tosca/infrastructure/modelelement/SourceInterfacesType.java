/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 14:48 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << SourceInterfacesType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0b961167-47fb-4a42-90c3-345ff16eb763")
public class SourceInterfacesType implements IMdaProxy {
    @objid ("ebce49a9-2d0d-4ce7-b121-758058e8e52c")
    public static final String STEREOTYPE_NAME = "SourceInterfacesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("74c708a6-a972-4235-bdd0-981f31261c0a")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link SourceInterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << SourceInterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("539b94ca-0e8d-4f18-a9e9-80ed4205b75b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (SourceInterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(SourceInterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << SourceInterfacesType >> then instantiate a {@link SourceInterfacesType} proxy.
     * 
     * @return a {@link SourceInterfacesType} proxy on the created {@link ModelElement}.
     */
    @objid ("22c3cd97-504e-42b8-9d4e-d2c3e5975694")
    public static SourceInterfacesType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(SourceInterfacesType.MdaTypes.STEREOTYPE_ELT);
        return SourceInterfacesType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link SourceInterfacesType} proxy from a {@link ModelElement} stereotyped << SourceInterfacesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link SourceInterfacesType} proxy or <i>null</i>.
     */
    @objid ("8d75ea15-ddb4-4b96-b2fa-06f1bd86ad68")
    public static SourceInterfacesType instantiate(final ModelElement obj) {
        return SourceInterfacesType.canInstantiate(obj) ? new SourceInterfacesType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SourceInterfacesType} proxy from a {@link ModelElement} stereotyped << SourceInterfacesType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link SourceInterfacesType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d7aba309-5737-40a8-97d5-4dc5b53b61d7")
    public static SourceInterfacesType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (SourceInterfacesType.canInstantiate(obj))
        	return new SourceInterfacesType(obj);
        else
        	throw new IllegalArgumentException("SourceInterfacesType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c1e54420-e556-4d4d-8505-5ec3b0713366")
    public void addInterface(final TInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SourceInterfacesType.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(SourceInterfacesType.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("a95db90f-db84-4b98-94bf-6c47771bbec6")
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
        SourceInterfacesType other = (SourceInterfacesType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("57127b99-e4ee-40cf-aeae-6a63eed06543")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7fe537cb-f238-4aa8-a679-54781f19cdce")
    public List<TInterface> getInterface() {
        List<TInterface> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(SourceInterfacesType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SourceInterfacesType.MdaTypes.MDAASSOCDEP_ROLE), "interface")
              && TInterface.canInstantiate(d.getDependsOn()))
                results.add((TInterface)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TInterface.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("04d3b960-fc10-4217-8f4e-9e68316bdcb7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6e75f08c-fd6b-46d0-9ef1-05b87cdc04ba")
    public boolean removeInterface(final TInterface obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SourceInterfacesType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SourceInterfacesType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("0a29e87b-deaf-436b-995f-c7f777727bf0")
    protected  SourceInterfacesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("db455491-2e3e-4312-b876-9b5c52e87e34")
    public static final class MdaTypes {
        @objid ("e3e1c1f7-f1c4-4844-9d1c-c8f6b123a044")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ab6c1729-dc62-4a8f-915a-58869308c3af")
        private static Stereotype MDAASSOCDEP;

        @objid ("463599ff-e332-4f25-a02c-79fd0b25f31c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("970d81e3-f5da-4e33-8d6a-02c7cef0da2c")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "9623eee0-9e81-460b-a356-a2758dca32dc", "SourceInterfacesType");
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

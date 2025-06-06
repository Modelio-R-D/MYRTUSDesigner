/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 04/06/2025 20:07 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.class_.TInterface;
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
@objid ("f7e60117-5382-4f4f-9fcc-af167d8c2e02")
public class SourceInterfacesType implements IMdaProxy {
    @objid ("ef7b542b-061f-46a6-b384-5be5f30220e9")
    public static final String STEREOTYPE_NAME = "SourceInterfacesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("8b128cde-6273-43d8-a07b-636fc87ee602")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link SourceInterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << SourceInterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("25e1b66f-265b-43c7-9fae-7802a83f4e29")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (SourceInterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(SourceInterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << SourceInterfacesType >> then instantiate a {@link SourceInterfacesType} proxy.
     * 
     * @return a {@link SourceInterfacesType} proxy on the created {@link ModelElement}.
     */
    @objid ("f01a49e1-4fb3-4a94-8db2-a05d1ec0a162")
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
    @objid ("464f884b-e2a7-4414-ad69-13b232f9e63c")
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
    @objid ("4e11271b-9ff3-4eab-b2f6-ec6f2cc906fc")
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
    @objid ("ddf85a95-373a-447d-8335-ee79dbc07c7b")
    public void addInterface(final TInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SourceInterfacesType.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(SourceInterfacesType.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("28af6f82-0508-451f-a7cf-89e42bb920eb")
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
    @objid ("4ce743c0-ff92-4149-bd1a-95eb70d95a27")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("692adf93-6fed-4f01-a9a6-9585f01f549e")
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

    @objid ("81f3b26a-b71c-493a-a2c0-6de7d368ca01")
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
    @objid ("6f86d3e1-e01b-43f1-add0-0492989bfd41")
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

    @objid ("c57cb6c2-79bd-4e6e-ae9e-fc556e04666f")
    protected  SourceInterfacesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("67e38a15-c330-45b6-b5e5-396b357ce6b3")
    public static final class MdaTypes {
        @objid ("398e145a-c00f-4828-929e-ed808ceb7960")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad4a2ce1-fa69-4bd6-a967-7b2537fbc1a1")
        private static Stereotype MDAASSOCDEP;

        @objid ("f356a430-fd9e-4d7f-8948-9414ef8366c1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("77274299-e1ab-498c-b829-9c0ac4086e98")
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

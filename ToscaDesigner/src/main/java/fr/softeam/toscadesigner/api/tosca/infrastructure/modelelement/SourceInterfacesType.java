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
import fr.softeam.toscadesigner.impl.MdaProxyException;
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
@objid ("17fff4c9-5ecf-4b85-aff5-f9e5f03dbab1")
public class SourceInterfacesType implements IMdaProxy {
    @objid ("c938b9c9-0812-4335-95c0-74b8980efae2")
    public static final String STEREOTYPE_NAME = "SourceInterfacesType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("419271d5-aa15-4d13-b85e-b6fad819982b")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link SourceInterfacesType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << SourceInterfacesType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a47f0aca-0270-49be-82ec-72b887577582")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (SourceInterfacesType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(SourceInterfacesType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << SourceInterfacesType >> then instantiate a {@link SourceInterfacesType} proxy.
     * 
     * @return a {@link SourceInterfacesType} proxy on the created {@link ModelElement}.
     */
    @objid ("1bba5b04-46a4-472c-be01-7fbebad6c1b4")
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
    @objid ("345bf8db-de05-4e49-8e46-896768deeeeb")
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
    @objid ("249da686-d9e2-4537-9168-ae406c24ecf0")
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
    @objid ("066a0812-4f11-4891-b971-827e288cc7f0")
    public void addInterface(final TInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SourceInterfacesType.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(SourceInterfacesType.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("ee6f529b-a3ee-4b5a-9ebb-dab909cac019")
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
    @objid ("493aebc0-eb01-4e2f-99ad-23636fb3686d")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("56d24b27-54d4-40e0-ac87-7173ed8c4d35")
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

    @objid ("76a47430-b099-46ec-87b2-3f6df4137468")
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
    @objid ("174b5dcf-3ae1-459a-b770-eaf38003f76e")
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

    @objid ("205a46eb-c2e6-47d0-b94f-afb16a4e2642")
    protected  SourceInterfacesType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("6f54dfa9-0f96-4863-b458-7a92111d4c9e")
    public static final class MdaTypes {
        @objid ("f0c92a53-cb15-4e0e-8b27-3d7fa8eb204f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("606e4fc3-7896-4988-8f4e-df69adf1f2fb")
        private static Stereotype MDAASSOCDEP;

        @objid ("193b5e36-1488-43ab-a908-f38fc6351f45")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("81f2541e-cc64-42e6-8863-f88992417feb")
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

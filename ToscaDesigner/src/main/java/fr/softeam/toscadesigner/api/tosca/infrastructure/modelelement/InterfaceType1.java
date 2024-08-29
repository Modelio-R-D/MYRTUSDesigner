/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 28/08/2024 17:14 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << InterfaceType1 >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("251676ae-d534-456d-84e9-3b73a5e949cb")
public class InterfaceType1 implements IMdaProxy {
    @objid ("86f672bc-bff0-4c41-9644-d9ce49090ff3")
    public static final String STEREOTYPE_NAME = "InterfaceType1";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("334d5783-b6fe-43c3-9811-5c09d91fbddd")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InterfaceType1 proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << InterfaceType1 >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("18234618-a3f9-427f-84b9-df6ec3e9640d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (InterfaceType1.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(InterfaceType1.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << InterfaceType1 >> then instantiate a {@link InterfaceType1} proxy.
     * 
     * @return a {@link InterfaceType1} proxy on the created {@link ModelElement}.
     */
    @objid ("7d636481-42a0-4503-b597-2010aaf45f14")
    public static InterfaceType1 create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(InterfaceType1.MdaTypes.STEREOTYPE_ELT);
        return InterfaceType1.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link InterfaceType1} proxy from a {@link ModelElement} stereotyped << InterfaceType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link InterfaceType1} proxy or <i>null</i>.
     */
    @objid ("bb03fc31-2a50-42e8-a96e-1a8de2b1c93e")
    public static InterfaceType1 instantiate(final ModelElement obj) {
        return InterfaceType1.canInstantiate(obj) ? new InterfaceType1(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterfaceType1} proxy from a {@link ModelElement} stereotyped << InterfaceType1 >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link InterfaceType1} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("58c1a149-aec2-4e86-a3f9-3f1a5ebe02c6")
    public static InterfaceType1 safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (InterfaceType1.canInstantiate(obj))
        	return new InterfaceType1(obj);
        else
        	throw new IllegalArgumentException("InterfaceType1: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7a5c45e0-8e4d-4441-8770-72313de86636")
    public void addInterface(final TExportedInterface obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), InterfaceType1.MdaTypes.MDAASSOCDEP);
            d.setName("interface");
            d.putTagValue(InterfaceType1.MdaTypes.MDAASSOCDEP_ROLE, "interface");
        }
    }

    @objid ("9375d338-b782-404c-9be7-78d6e17229d9")
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
        InterfaceType1 other = (InterfaceType1) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("0c2dc739-0ecf-4169-a5ea-e71256f2a057")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'interface' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b5ae4632-04d2-4b54-b9ea-529de912fe49")
    public List<TExportedInterface> getInterface() {
        List<TExportedInterface> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(InterfaceType1.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(InterfaceType1.MdaTypes.MDAASSOCDEP_ROLE), "interface")
              && TExportedInterface.canInstantiate(d.getDependsOn()))
                results.add((TExportedInterface)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TExportedInterface.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("18b33ddf-5d15-4c51-bcf9-242f28b1ad4b")
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
    @objid ("4b0401d0-ce6e-4059-8ab4-44f04427cd3c")
    public boolean removeInterface(final TExportedInterface obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(InterfaceType1.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(InterfaceType1.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
        
    }

    @objid ("cd296927-ba6e-44b2-8281-21895fb11cae")
    protected  InterfaceType1(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("a28f2473-2134-47f0-9639-242b7c4d6377")
    public static final class MdaTypes {
        @objid ("785e88be-6954-4c19-90fa-11d094a4426a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2dfaf87b-f4f4-40d2-bf97-759a1876b4d0")
        private static Stereotype MDAASSOCDEP;

        @objid ("6a938902-a7fe-4a93-86aa-cd28831cbbef")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("46839a87-43a9-4ce9-aba3-83b91b045f21")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "0ae06072-fb38-48b3-94eb-9bf7b7cade50", "InterfaceType1");
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

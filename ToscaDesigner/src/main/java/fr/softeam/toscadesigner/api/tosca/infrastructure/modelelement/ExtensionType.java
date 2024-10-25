/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << ExtensionType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a13a2275-3989-4670-90c6-eb79ea658873")
public class ExtensionType implements IMdaProxy {
    @objid ("4d7b9d2c-29f2-495f-92b5-1a0c63aa955b")
    public static final String STEREOTYPE_NAME = "ExtensionType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("cc9d56a4-8d0d-4e96-9ecf-6a5d912a9d45")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ExtensionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ExtensionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("35d30cf4-333b-4e4e-80f1-e9266c49534a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ExtensionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ExtensionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ExtensionType >> then instantiate a {@link ExtensionType} proxy.
     * @return a {@link ExtensionType} proxy on the created {@link ModelElement}.
     */
    @objid ("64d0684c-1d18-46b3-98d7-b2b42b878df6")
    public static ExtensionType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(ExtensionType.MdaTypes.STEREOTYPE_ELT);
        return ExtensionType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ExtensionType} proxy from a {@link ModelElement} stereotyped << ExtensionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ExtensionType} proxy or <i>null</i>.
     */
    @objid ("0a3136c2-282e-476a-ab54-747b6196b66e")
    public static ExtensionType instantiate(final ModelElement obj) {
        return ExtensionType.canInstantiate(obj) ? new ExtensionType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExtensionType} proxy from a {@link ModelElement} stereotyped << ExtensionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ExtensionType} proxy.
     */
    @objid ("5681bdbb-c077-4d53-800c-77af14592c6e")
    public static ExtensionType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ExtensionType.canInstantiate(obj))
            return new ExtensionType(obj);
        else
            throw new IllegalArgumentException("ExtensionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'extension' role.<p>
     * Role description:
     * null
     */
    @objid ("66bbff78-e9a6-4d45-b6e8-8929757f1e89")
    public void addExtension(final TExtension obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ExtensionType.MdaTypes.MDAASSOCDEP);
            d.setName("extension");
            d.putTagValue(ExtensionType.MdaTypes.MDAASSOCDEP_ROLE, "extension");
        }
    }

    @objid ("0ddce1c2-c366-424b-b204-e30a8ee31ff9")
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
        ExtensionType other = (ExtensionType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("78230c9a-1236-46e5-a829-51efcb2913da")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'extension' role.<p>
     * Role description:
     * null
     */
    @objid ("c9fa89b9-b616-4d9a-8a8f-fbe185f97c87")
    public List<TExtension> getExtension() {
        List<TExtension> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(ExtensionType.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ExtensionType.MdaTypes.MDAASSOCDEP_ROLE), "extension")
              && TExtension.canInstantiate(d.getDependsOn()))
                results.add((TExtension)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TExtension.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("154ef5b3-d8f7-4a14-87bf-22bb2bd65e8b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'extension' role.<p>
     * Role description:
     * null
     */
    @objid ("0162b2f2-f705-419d-aa2f-63ec4d845a1c")
    public boolean removeExtension(final TExtension obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ExtensionType.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ExtensionType.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("9b341b8e-a000-4e46-9ab8-5c57d21156de")
    protected  ExtensionType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("b7a23b75-9a6f-41e2-99ec-63cd29ce38ca")
    public static final class MdaTypes {
        @objid ("4923dcc8-937c-4659-a531-70ff33dd782e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fa2a33d7-b0f0-4024-989e-6a7e67d65507")
        private static Stereotype MDAASSOCDEP;

        @objid ("45389a3a-d919-4d6d-ab04-e972b629be74")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5850c1f8-f1a6-4b98-a903-38347b3c7e7c")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "28c2cefc-d30d-4385-bbad-0b6047fb182e", "ExtensionType");
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

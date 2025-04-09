/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
@objid ("7b10164e-17a7-4612-8e00-f52954ff315f")
public class ExtensionType implements IMdaProxy {
    @objid ("db2a549d-153e-4bec-8c77-16121cfc6b99")
    public static final String STEREOTYPE_NAME = "ExtensionType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("407f3695-6187-4cc5-a486-78d202532cbe")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ExtensionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ExtensionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ad6d7627-1645-4ca2-9aac-28a4bd34bc03")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ExtensionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ExtensionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ExtensionType >> then instantiate a {@link ExtensionType} proxy.
     * 
     * @return a {@link ExtensionType} proxy on the created {@link ModelElement}.
     */
    @objid ("e446f303-5cb7-4136-a69d-03943bf25dee")
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
    @objid ("6123e619-ddff-4918-aa65-1f6dfe8445b8")
    public static ExtensionType instantiate(final ModelElement obj) {
        return ExtensionType.canInstantiate(obj) ? new ExtensionType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ExtensionType} proxy from a {@link ModelElement} stereotyped << ExtensionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ExtensionType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f9246e4d-ea9f-4930-8a09-a45134cf53b5")
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
     * 
     */
    @objid ("262e6ac2-6277-4b92-990b-2abc0a43c235")
    public void addExtension(final TExtension obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ExtensionType.MdaTypes.MDAASSOCDEP);
            d.setName("extension");
            d.putTagValue(ExtensionType.MdaTypes.MDAASSOCDEP_ROLE, "extension");
        }
    }

    @objid ("c5895192-a5f6-4fc7-8185-2d9be9b79de4")
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
    @objid ("8eb1edda-4c38-42ac-b9a4-d930e9233899")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'extension' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1868b4a4-636f-455a-9fc2-c0f3b6f639d2")
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

    @objid ("b399502e-8c39-4f69-95dd-04bf648b3f05")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'extension' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b60a0245-71ca-463b-8a00-2ffc8265c547")
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

    @objid ("bccc2b2b-15ed-4ed7-b461-b207c6fd21b6")
    protected  ExtensionType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("03f8a8b8-77d2-4ec8-a3fc-fb149f2998ab")
    public static final class MdaTypes {
        @objid ("6fad2b05-e01b-489c-8d8c-31519300e4cb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5b94bd16-72a2-46d9-bbfb-3c575ec30586")
        private static Stereotype MDAASSOCDEP;

        @objid ("dffc5f99-7c3f-47f6-a8c5-db15238b0989")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5b577484-bd78-4a97-84b1-0e56570deedf")
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

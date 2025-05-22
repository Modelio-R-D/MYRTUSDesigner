/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 15/05/2025 11:44 by Modelio Studio.
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
    @objid ("0c683f6e-cc41-4afe-ad40-488cc6550234")
    public static final String STEREOTYPE_NAME = "ExtensionType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     * 
     */
    @objid ("02ab6b6c-0d35-47b8-a53f-822cd45a1634")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ExtensionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ExtensionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a0f7b72e-ceab-43df-8c8a-d0bc8fa90bfe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ExtensionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ExtensionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ExtensionType >> then instantiate a {@link ExtensionType} proxy.
     * @return a {@link ExtensionType} proxy on the created {@link ModelElement}.
     */
    @objid ("f953387b-c5b3-4ca2-baa5-b248cf17d883")
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
    @objid ("29b84e14-f67a-4e83-a847-185209066844")
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
    @objid ("523e3481-c0cd-4f9a-85d4-86b011268a79")
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
    @objid ("99f8cd54-355e-4fd4-a574-b7151fecc55a")
    public void addExtension(final TExtension obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ExtensionType.MdaTypes.MDAASSOCDEP);
            d.setName("extension");
            d.putTagValue(ExtensionType.MdaTypes.MDAASSOCDEP_ROLE, "extension");
        }
    }

    @objid ("efcc4432-86a9-484e-8114-b04f90383b03")
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
    @objid ("3896d354-f744-4bee-906b-b427d954c64e")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'extension' role.<p>
     * Role description:
     * null
     */
    @objid ("9599db0d-0af4-43b5-b086-f0cb727be636")
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

    @objid ("3d505d27-f4ce-4447-972b-36f2946bb828")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'extension' role.<p>
     * Role description:
     * null
     */
    @objid ("28623388-f93d-437f-b8e9-ca7b7f4505b7")
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

    @objid ("24839a2d-9a97-46d5-8234-6667c9aadf36")
    protected  ExtensionType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("03f8a8b8-77d2-4ec8-a3fc-fb149f2998ab")
    public static final class MdaTypes {
        @objid ("bc9c5125-816e-4326-a5f1-4fa3458c05fa")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dcf45e26-72b7-44e4-a46b-5542873747de")
        private static Stereotype MDAASSOCDEP;

        @objid ("4b7b5470-cce6-4be8-9fcd-a60216c11aad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9a3f1ec3-0ab5-42a3-84f8-54934dd80170")
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

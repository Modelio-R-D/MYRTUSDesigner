/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 02/08/2024 16:15 by Modelio Studio.
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
@objid ("17704431-33ec-49ad-8bac-cbd85b9bb6f8")
public class ExtensionType implements IMdaProxy {
    @objid ("a89682dc-4ac0-4739-af74-f9ae65e6abdc")
    public static final String STEREOTYPE_NAME = "ExtensionType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("8e85cd7f-ddfe-4ec0-b436-34e3f3a4129c")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ExtensionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ExtensionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("52f65729-aa37-48cc-95da-56c605659140")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ExtensionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ExtensionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ExtensionType >> then instantiate a {@link ExtensionType} proxy.
     * 
     * @return a {@link ExtensionType} proxy on the created {@link ModelElement}.
     */
    @objid ("3897bd38-5e8b-46d5-a852-8e6ddc7698d1")
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
    @objid ("9344cc23-a1ee-42be-b8f0-c3b77a29e7a2")
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
    @objid ("97486010-3369-428a-aada-9a776978974a")
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
    @objid ("a89f6bed-25b0-41f4-a0a2-55515e473308")
    public void addExtension(final TExtension obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ExtensionType.MdaTypes.MDAASSOCDEP);
            d.setName("extension");
            d.putTagValue(ExtensionType.MdaTypes.MDAASSOCDEP_ROLE, "extension");
        }
    }

    @objid ("d2f46f44-34bc-4bca-bef7-17311f1f5df6")
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
    @objid ("8fca1c10-2153-4ee5-a4cd-94bdcaaf9a72")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Get the values of the 'extension' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("869e9dbc-c80b-438e-992b-f934cf87de96")
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

    @objid ("97d5a41a-1105-4f3a-92a4-e207ebbc3487")
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
    @objid ("c91d69ad-2a18-474c-b01d-038940a8d9d5")
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

    @objid ("39e74851-3464-4f8d-99e1-ebc2b4ff7404")
    protected  ExtensionType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("eca9c333-625a-4b4b-8ace-c5af6129ca99")
    public static final class MdaTypes {
        @objid ("37980fd9-f107-4cc8-a5fe-037dc272c822")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6b54e999-43d5-4ef6-b200-889ce2f18944")
        private static Stereotype MDAASSOCDEP;

        @objid ("8e325e10-d53f-442f-a10c-4689b2f7b4e7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("be484722-0491-419e-bea5-008fac828426")
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

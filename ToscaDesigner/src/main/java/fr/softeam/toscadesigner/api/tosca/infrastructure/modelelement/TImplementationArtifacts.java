/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 14/01/2025 15:42 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TImplementationArtifacts >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("1aff9e2f-f5e7-46c0-9932-565fb0c34d51")
public class TImplementationArtifacts implements IMdaProxy {
    @objid ("da6f3589-d832-4d9c-a92c-b0e86b738674")
    public static final String STEREOTYPE_NAME = "TImplementationArtifacts";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("6ddce1f2-276b-4bb1-94a1-aec111d96804")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TImplementationArtifacts proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TImplementationArtifacts >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a50d7f2d-8903-4fb4-8bf5-33320bef4605")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TImplementationArtifacts.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TImplementationArtifacts.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TImplementationArtifacts >> then instantiate a {@link TImplementationArtifacts} proxy.
     * 
     * @return a {@link TImplementationArtifacts} proxy on the created {@link ModelElement}.
     */
    @objid ("31070339-854a-4c58-91b7-ad7193c7dd7f")
    public static TImplementationArtifacts create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TImplementationArtifacts.MdaTypes.STEREOTYPE_ELT);
        return TImplementationArtifacts.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TImplementationArtifacts} proxy from a {@link ModelElement} stereotyped << TImplementationArtifacts >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TImplementationArtifacts} proxy or <i>null</i>.
     */
    @objid ("f261f594-ea4f-4ac5-8ecc-a810aba45ecc")
    public static TImplementationArtifacts instantiate(final ModelElement obj) {
        return TImplementationArtifacts.canInstantiate(obj) ? new TImplementationArtifacts(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TImplementationArtifacts} proxy from a {@link ModelElement} stereotyped << TImplementationArtifacts >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TImplementationArtifacts} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c0a4d527-a8b5-4e90-8401-4bd5862f6f2a")
    public static TImplementationArtifacts safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TImplementationArtifacts.canInstantiate(obj))
        	return new TImplementationArtifacts(obj);
        else
        	throw new IllegalArgumentException("TImplementationArtifacts: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6a4ed4fe-8cb1-4d3a-a3b6-4c8cd521df2c")
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
        TImplementationArtifacts other = (TImplementationArtifacts) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("46bc7ed4-b446-4c04-ad05-cecd7d82e5e5")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("84edc832-2faf-44ab-af22-cc932761a33e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("4b3a3c8c-32ce-40fc-bd34-7b02dff6c37d")
    protected  TImplementationArtifacts(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("74170f4e-4335-4473-8b5f-8661445b5efc")
    public static final class MdaTypes {
        @objid ("ff16cc42-51f6-4d6c-a524-8b0fb6dcafe4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2097c2c8-30c2-46c8-ac14-9834fd3bd893")
        private static Stereotype MDAASSOCDEP;

        @objid ("4a04fa8f-9d55-4dc2-8e8e-da8fa0169eea")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d7f6e328-4e1f-4033-8488-9daf5fd2e994")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "3ad8973b-47c6-4931-ab79-c240d70c0ca6", "TImplementationArtifacts");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 15:34 by Modelio Studio.
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
@objid ("c2e7eca4-4095-49f2-861c-679c68df5b8e")
public class TImplementationArtifacts implements IMdaProxy {
    @objid ("020287d5-ceaa-467c-b1f2-b1866cd6a568")
    public static final String STEREOTYPE_NAME = "TImplementationArtifacts";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("2bece1c5-247f-48e7-ab58-7ca6d9cf9be3")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TImplementationArtifacts proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TImplementationArtifacts >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ee65bed2-fea1-406d-bc2d-c045cb9ae007")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TImplementationArtifacts.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TImplementationArtifacts.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TImplementationArtifacts >> then instantiate a {@link TImplementationArtifacts} proxy.
     * 
     * @return a {@link TImplementationArtifacts} proxy on the created {@link ModelElement}.
     */
    @objid ("1d37b8a2-7ddf-4f55-95e9-446a8548328f")
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
    @objid ("7f892d18-606b-44fa-8f40-3bfe031b63be")
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
    @objid ("c92dd90b-8e99-4d31-b76b-1170d3f263b1")
    public static TImplementationArtifacts safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TImplementationArtifacts.canInstantiate(obj))
        	return new TImplementationArtifacts(obj);
        else
        	throw new IllegalArgumentException("TImplementationArtifacts: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c8697cc2-c0f6-48cc-b8dc-6d2fda7670d1")
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
    @objid ("840b7864-7fa6-4960-b1f4-fce358f353ed")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("00d1bd81-e828-4679-b146-74d452b2f16d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("33d15fe6-fd16-44c5-b2b9-b80663bf370d")
    protected  TImplementationArtifacts(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("2dd3834b-3d06-44ce-a210-711608429518")
    public static final class MdaTypes {
        @objid ("93e05d1e-c7d2-4966-98a9-cbeadce36049")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a44558d1-e195-48ca-bcd7-320b479c34b4")
        private static Stereotype MDAASSOCDEP;

        @objid ("bb2c6a12-122d-4ba2-b798-413848ea48f4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d75b5616-d870-4b24-ab05-6e324aec79ef")
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

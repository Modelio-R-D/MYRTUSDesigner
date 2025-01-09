/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 11:56 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.class_;

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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Class} with << CapabilityStereotype >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c3cd8c5a-2317-4577-a43f-48adfafbf708")
public class CapabilityStereotype implements IMdaProxy {
    @objid ("8268e37a-92f7-4394-bbc7-07a1e151f6a5")
    public static final String STEREOTYPE_NAME = "CapabilityStereotype";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("ccf297d3-36ee-4869-9f88-5099351ce88b")
    protected final Class elt;

    /**
     * Tells whether a {@link CapabilityStereotype proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CapabilityStereotype >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f1850cec-49a4-4d4a-bae8-580a6bab49ef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (CapabilityStereotype.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(CapabilityStereotype.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << CapabilityStereotype >> then instantiate a {@link CapabilityStereotype} proxy.
     * 
     * @return a {@link CapabilityStereotype} proxy on the created {@link Class}.
     */
    @objid ("3a0a2d81-b82a-4fc4-bc6e-c85c1b746c2c")
    public static CapabilityStereotype create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(CapabilityStereotype.MdaTypes.STEREOTYPE_ELT);
        return CapabilityStereotype.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CapabilityStereotype} proxy from a {@link Class} stereotyped << CapabilityStereotype >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CapabilityStereotype} proxy or <i>null</i>.
     */
    @objid ("857bf03e-392a-4a21-b1f9-2f327bf2eef9")
    public static CapabilityStereotype instantiate(final Class obj) {
        return CapabilityStereotype.canInstantiate(obj) ? new CapabilityStereotype(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CapabilityStereotype} proxy from a {@link Class} stereotyped << CapabilityStereotype >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CapabilityStereotype} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("63dd0208-2556-45a8-97ac-deb93f3378a7")
    public static CapabilityStereotype safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CapabilityStereotype.canInstantiate(obj))
        	return new CapabilityStereotype(obj);
        else
        	throw new IllegalArgumentException("CapabilityStereotype: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("614a1464-49d8-4509-8847-35534fd26295")
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
        CapabilityStereotype other = (CapabilityStereotype) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("4f137a9f-ef2e-4ecd-91cb-73350dc65469")
    public Class getElement() {
        return this.elt;
    }

    @objid ("fc27624d-801c-4c5f-96bc-f9bd2c73cc5c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("4a334af0-f7fc-4b34-a1e5-a189e6317cdc")
    protected  CapabilityStereotype(final Class elt) {
        this.elt = elt;
    }

    @objid ("81126b1a-07e3-4950-95af-a06ccd7c5c2e")
    public static final class MdaTypes {
        @objid ("127bd98e-7fe0-41d4-91fc-b378d00d4dac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cae6f4ca-b311-46fd-a4fc-7b35cf12f054")
        private static Stereotype MDAASSOCDEP;

        @objid ("44f8dd6e-9d37-41e9-bdb3-ffbf4c815a6e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9208fbe4-9541-48e6-a80f-2b1566a491e0")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "54f6e81a-afca-4381-aad4-5cf823fcf192", "CapabilityStereotype");
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

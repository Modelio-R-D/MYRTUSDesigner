/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:42 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << ImplementationArtifactType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d61128a4-23cf-4898-8740-9174a6202e05")
public class ImplementationArtifactType extends TImplementationArtifact implements IMdaProxy {
    @objid ("b47a5362-b6d6-4020-a8b5-f590c37c5017")
    public static final String STEREOTYPE_NAME = "ImplementationArtifactType";

    /**
     * Tells whether a {@link ImplementationArtifactType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ImplementationArtifactType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("724230d6-3b4d-4fa7-94c9-36655b38d543")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ImplementationArtifactType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ImplementationArtifactType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ImplementationArtifactType >> then instantiate a {@link ImplementationArtifactType} proxy.
     * @return a {@link ImplementationArtifactType} proxy on the created {@link ModelElement}.
     */
    @objid ("c486a01a-0103-4b75-9518-97b62d968883")
    public static ImplementationArtifactType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(ImplementationArtifactType.MdaTypes.STEREOTYPE_ELT);
        return ImplementationArtifactType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ImplementationArtifactType} proxy from a {@link ModelElement} stereotyped << ImplementationArtifactType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ImplementationArtifactType} proxy or <i>null</i>.
     */
    @objid ("de095538-ecef-4174-89f9-3251f354f7d7")
    public static ImplementationArtifactType instantiate(final ModelElement obj) {
        return ImplementationArtifactType.canInstantiate(obj) ? new ImplementationArtifactType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ImplementationArtifactType} proxy from a {@link ModelElement} stereotyped << ImplementationArtifactType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ImplementationArtifactType} proxy.
     */
    @objid ("8364c56a-d4dd-46ae-8ecc-d5c6bf2448e7")
    public static ImplementationArtifactType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ImplementationArtifactType.canInstantiate(obj))
            return new ImplementationArtifactType(obj);
        else
            throw new IllegalArgumentException("ImplementationArtifactType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0c848215-120d-4993-9b2e-44e3ca31475f")
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
        ImplementationArtifactType other = (ImplementationArtifactType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("3b893f0c-e21d-457b-98c0-1b0eaa5bc56f")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("e7c242fe-b467-4501-a5f8-4ddd5e09aa61")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("0a5ede37-86f5-4521-bd7f-8ee9e2a249ee")
    protected  ImplementationArtifactType(final ModelElement elt) {
        super(elt);
    }

    @objid ("2b867eb6-d64b-4450-ba65-b63dd33dc093")
    public static final class MdaTypes {
        @objid ("9a131e51-ed42-44d1-92ee-70bab31354e1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eb59bdd5-63d1-4646-a3dc-7d86e19cb7e4")
        private static Stereotype MDAASSOCDEP;

        @objid ("5cb94fe7-1c6d-4f26-8b28-8830ae90e2f0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("94d1c54e-2413-479c-a009-6e2c019bba54")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "0599d5cf-f2a0-44c3-9214-4f2715bfc1b4", "ImplementationArtifactType");
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

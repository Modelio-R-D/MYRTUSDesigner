/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/04/2024 10:28 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TDeploymentArtifacts >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c9873468-968f-409a-9025-fd0ece221e26")
public class TDeploymentArtifacts implements IMdaProxy {
    @objid ("634b94e3-390d-45d1-a7cd-e9c746d9d06c")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifacts";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("9fa588e5-75c6-4928-bdd2-07c638f1fa76")
    protected final Class elt;

    /**
     * Tells whether a {@link TDeploymentArtifacts proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifacts >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("45c3a6d7-da8e-4828-821c-a595e7946173")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifacts >> then instantiate a {@link TDeploymentArtifacts} proxy.
     * @return a {@link TDeploymentArtifacts} proxy on the created {@link Class}.
     */
    @objid ("aa755702-361b-4454-bf2a-0ab0e445a8eb")
    public static TDeploymentArtifacts create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT);
        return TDeploymentArtifacts.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifacts} proxy from a {@link Class} stereotyped << TDeploymentArtifacts >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TDeploymentArtifacts} proxy or <i>null</i>.
     */
    @objid ("eee53c9c-8c90-4dce-9204-ef0f8247fed8")
    public static TDeploymentArtifacts instantiate(final Class obj) {
        return TDeploymentArtifacts.canInstantiate(obj) ? new TDeploymentArtifacts(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifacts} proxy from a {@link Class} stereotyped << TDeploymentArtifacts >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TDeploymentArtifacts} proxy.
     */
    @objid ("bebf25cb-6bbd-4045-b08c-a582d4190248")
    public static TDeploymentArtifacts safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TDeploymentArtifacts.canInstantiate(obj))
            return new TDeploymentArtifacts(obj);
        else
            throw new IllegalArgumentException("TDeploymentArtifacts: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'deploymentArtifact' role.<p>
     * Role description:
     * null
     */
    @objid ("0805fd7d-2f57-4963-a371-d4ec782cab96")
    public void addDeploymentArtifact(final TDeploymentArtifact obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TDeploymentArtifacts.MdaTypes.MDAASSOCDEP);
            d.setName("deploymentArtifact");
            d.putTagValue(TDeploymentArtifacts.MdaTypes.MDAASSOCDEP_ROLE, "deploymentArtifact");
        }
    }

    @objid ("620b0a44-dd4e-4a81-b986-644c7bb56616")
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
        TDeploymentArtifacts other = (TDeploymentArtifacts) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'deploymentArtifact' role.<p>
     * Role description:
     * null
     */
    @objid ("af1a89ff-0fb3-4ae3-940e-d656d14eefa3")
    public List<TDeploymentArtifact> getDeploymentArtifact() {
        List<TDeploymentArtifact> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(TDeploymentArtifacts.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(TDeploymentArtifacts.MdaTypes.MDAASSOCDEP_ROLE), "deploymentArtifact")
              && TDeploymentArtifact.canInstantiate(d.getDependsOn()))
                results.add((TDeploymentArtifact)ToscaDesignerProxyFactory.instantiate(d.getDependsOn(), TDeploymentArtifact.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("f438d28a-9d60-41fb-b70e-27299a605c7c")
    public Class getElement() {
        return this.elt;
    }

    @objid ("c539306b-bcbf-4c3f-82f8-541501c17d6f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'deploymentArtifact' role.<p>
     * Role description:
     * null
     */
    @objid ("d9856b79-a43d-431c-8b96-20e0017cf1ac")
    public boolean removeDeploymentArtifact(final TDeploymentArtifact obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(TDeploymentArtifacts.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(TDeploymentArtifacts.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("f8c93fd4-53d3-4948-843e-c2daa304d7ca")
    protected  TDeploymentArtifacts(final Class elt) {
        this.elt = elt;
    }

    @objid ("77f80eb6-7685-47e0-a498-ee550bc40c2b")
    public static final class MdaTypes {
        @objid ("d50bf2db-91d5-4c19-b761-7cd4d6b87b7c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("aef67ce7-8045-4482-b6f3-e713ad60a98f")
        private static Stereotype MDAASSOCDEP;

        @objid ("f7edbb58-4399-4ea4-b47b-fc736441a935")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("32790d48-e92d-457c-a52c-13d81a2e6f53")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "168ae3ca-0258-4eed-afa5-696caa1bab53", "TDeploymentArtifacts");
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

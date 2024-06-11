/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 11/06/2024 17:18 by Modelio Studio.
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
@objid ("cc9de51e-e7a0-4a96-9e0b-2009b9d53554")
public class TDeploymentArtifacts implements IMdaProxy {
    @objid ("722b7de1-7dd2-4b28-91ff-92d79a45bd3f")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifacts";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("885416eb-3b15-4cd9-b0c6-c1e5e2ae4bff")
    protected final Class elt;

    /**
     * Tells whether a {@link TDeploymentArtifacts proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifacts >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e1ed81ce-de33-457e-855d-a3820eb94690")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifacts >> then instantiate a {@link TDeploymentArtifacts} proxy.
     * 
     * @return a {@link TDeploymentArtifacts} proxy on the created {@link Class}.
     */
    @objid ("6ed84a83-17ea-4563-8971-091fe08851bb")
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
    @objid ("56482800-f3d8-4bcf-a9e7-b8c2587dfc07")
    public static TDeploymentArtifacts instantiate(final Class obj) {
        return TDeploymentArtifacts.canInstantiate(obj) ? new TDeploymentArtifacts(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TDeploymentArtifacts} proxy from a {@link Class} stereotyped << TDeploymentArtifacts >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TDeploymentArtifacts} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ce767674-dfab-45ff-9b84-141bd897880d")
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
     * 
     */
    @objid ("c4af77ed-0ed9-49d9-b2eb-7189f9013c2a")
    public void addDeploymentArtifact(final TDeploymentArtifact obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TDeploymentArtifacts.MdaTypes.MDAASSOCDEP);
            d.setName("deploymentArtifact");
            d.putTagValue(TDeploymentArtifacts.MdaTypes.MDAASSOCDEP_ROLE, "deploymentArtifact");
        }
    }

    @objid ("a8506050-7c4f-4621-8bc7-a54f1373637a")
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
     * 
     */
    @objid ("ee9aada0-14fe-414e-bac2-9978afa4221a")
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
    @objid ("277394ad-83a3-4b41-983d-b312b1d50d3b")
    public Class getElement() {
        return this.elt;
    }

    @objid ("f9c92006-1882-4c04-b475-a012c670526a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    /**
     * Remove a value from the 'deploymentArtifact' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("10d6d2e8-0bc6-4baf-b5eb-08c28c441132")
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

    @objid ("8efa9dc5-9139-4609-8f31-8c656f14c31b")
    protected  TDeploymentArtifacts(final Class elt) {
        this.elt = elt;
    }

    @objid ("c68383bb-c7fe-4ae5-b42b-512b732905fa")
    public static final class MdaTypes {
        @objid ("652931bb-fb97-4718-a2ba-16d7c6862663")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1c32f3a6-53a6-457c-b77b-5e33fd9cc7f4")
        private static Stereotype MDAASSOCDEP;

        @objid ("b3a0c40b-e535-4724-bfe4-43dd9dd28f79")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1314f898-f384-4ec8-ad95-dcb65d4dac96")
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

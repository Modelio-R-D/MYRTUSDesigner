/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 16:04 by Modelio Studio.
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
import fr.softeam.toscadesigner.api.tosca.standard.attribute.TDeploymentArtifact;
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
@objid ("e6914c7a-c002-400d-b7a8-8719a88a1764")
public class TDeploymentArtifacts implements IMdaProxy {
    @objid ("72afe402-33b7-4459-92f7-9c0b54310db9")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifacts";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("10623bb0-7310-4422-99b4-6c8547fe3107")
    protected final Class elt;

    /**
     * Tells whether a {@link TDeploymentArtifacts proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifacts >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1cbd70a1-8ac5-4c27-aac5-b6f6f7cef042")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifacts >> then instantiate a {@link TDeploymentArtifacts} proxy.
     * 
     * @return a {@link TDeploymentArtifacts} proxy on the created {@link Class}.
     */
    @objid ("0518a966-e7c8-45da-bfbf-ba045dfd0645")
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
    @objid ("dfc4c227-89f5-4c21-97d8-e8be6cadff9c")
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
    @objid ("21addc86-eeea-4e58-b687-a90d12f7a83a")
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
    @objid ("67fa351f-1464-4573-ad54-a092c14b41e5")
    public void addDeploymentArtifact(final TDeploymentArtifact obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TDeploymentArtifacts.MdaTypes.MDAASSOCDEP);
            d.setName("deploymentArtifact");
            d.putTagValue(TDeploymentArtifacts.MdaTypes.MDAASSOCDEP_ROLE, "deploymentArtifact");
        }
    }

    @objid ("6588e601-fe19-4203-bbbd-11760f536562")
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
    @objid ("8b2e9d08-63bf-4f2b-bae7-46a928a09086")
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
    @objid ("327788e7-d83d-4736-8088-52d8233378da")
    public Class getElement() {
        return this.elt;
    }

    @objid ("89ca84a9-1958-43c2-9fba-5e0353174f65")
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
    @objid ("fa1d6d19-6a0b-49e9-a0bc-8c457de35d67")
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

    @objid ("857e163d-9cc5-42d9-9802-4f6bb74b2ff2")
    protected  TDeploymentArtifacts(final Class elt) {
        this.elt = elt;
    }

    @objid ("7e75c0ac-1433-487a-9459-abe871156281")
    public static final class MdaTypes {
        @objid ("9795247a-a11b-4077-a829-591dc8fdbf3a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("273aafae-6b7d-4e55-92d8-da4d5aab9b3d")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a949e84-4d96-4cae-be34-6119d866fb84")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("15e1ee49-6059-43b9-b156-03e0a8296a17")
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

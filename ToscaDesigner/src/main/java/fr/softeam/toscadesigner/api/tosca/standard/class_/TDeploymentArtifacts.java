/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
@objid ("cf5ac5e6-9ef3-4b5e-91f6-08f168cbbb20")
public class TDeploymentArtifacts implements IMdaProxy {
    @objid ("910b5146-857d-41ee-902a-d1ad701183d9")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifacts";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("31eb6f83-3edc-490d-b610-ddf7a29c1d7b")
    protected final Class elt;

    /**
     * Tells whether a {@link TDeploymentArtifacts proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifacts >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("64d6a9f8-09f6-4057-b8c2-a77e7527afe9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifacts >> then instantiate a {@link TDeploymentArtifacts} proxy.
     * 
     * @return a {@link TDeploymentArtifacts} proxy on the created {@link Class}.
     */
    @objid ("b0327f31-7627-4203-9a4b-f54f19d67dbd")
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
    @objid ("1306cf63-fdab-411d-9ab7-ef9c9a9f2fd0")
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
    @objid ("56d6fdfd-1942-42db-a5a4-2194e1e32ce7")
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
    @objid ("4f4bdcd8-2925-48de-b4fe-451a47abfc52")
    public void addDeploymentArtifact(final TDeploymentArtifact obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TDeploymentArtifacts.MdaTypes.MDAASSOCDEP);
            d.setName("deploymentArtifact");
            d.putTagValue(TDeploymentArtifacts.MdaTypes.MDAASSOCDEP_ROLE, "deploymentArtifact");
        }
    }

    @objid ("1d865cb5-da85-4401-a738-37d961eee44b")
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
    @objid ("e2505900-b272-4cd7-ae3a-7b2f6ba85a62")
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
    @objid ("9a56ab11-03da-435a-8962-4f04ca4410e5")
    public Class getElement() {
        return this.elt;
    }

    @objid ("8038f077-ebf9-499b-9dce-4616fa400dc2")
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
    @objid ("8b7c0baa-7529-4d40-8d69-0c75c88ed9f8")
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

    @objid ("3122effd-2a6d-402b-abf5-88b6e3d0cf0d")
    protected  TDeploymentArtifacts(final Class elt) {
        this.elt = elt;
    }

    @objid ("d51b15b4-c4f4-4c89-bbe2-525cc604e17f")
    public static final class MdaTypes {
        @objid ("b3f8eef3-8681-4760-be17-64f73d420626")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c96260ce-ee11-48e1-9a91-c4530c5d596b")
        private static Stereotype MDAASSOCDEP;

        @objid ("09237988-2cef-4b07-b48b-023ea12121f0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ceba68cb-27bd-4862-8573-29df778d9458")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 12:14 by Modelio Studio.
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
    @objid ("d0864332-abfc-4a6b-ab0b-d19f957307e2")
    public static final String STEREOTYPE_NAME = "TDeploymentArtifacts";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("e1244580-cb8f-4883-a8a6-84d18687f585")
    protected final Class elt;

    /**
     * Tells whether a {@link TDeploymentArtifacts proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TDeploymentArtifacts >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e1415666-80a7-4763-9383-0a2fe4859ae9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TDeploymentArtifacts.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TDeploymentArtifacts >> then instantiate a {@link TDeploymentArtifacts} proxy.
     * 
     * @return a {@link TDeploymentArtifacts} proxy on the created {@link Class}.
     */
    @objid ("f66e3f1e-9617-441c-8a50-d0049067344e")
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
    @objid ("cc9ee636-4da4-4aa8-bc33-c028bfbe208e")
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
    @objid ("872b99b3-32c8-4f14-9bc8-6ddf1c8fe8e7")
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
    @objid ("5a14c6da-78fa-4cba-8314-71d3fdbd38e5")
    public void addDeploymentArtifact(final TDeploymentArtifact obj) {
        if (obj != null) {
            IModelingSession session = ModelingSessionRegistry.getSession(this.elt);
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), TDeploymentArtifacts.MdaTypes.MDAASSOCDEP);
            d.setName("deploymentArtifact");
            d.putTagValue(TDeploymentArtifacts.MdaTypes.MDAASSOCDEP_ROLE, "deploymentArtifact");
        }
    }

    @objid ("45226279-6ce3-4796-871f-46441f69d3f4")
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
    @objid ("e7cda823-2a8f-4989-827a-091d471aa8ed")
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
    @objid ("9fdf105d-b354-4511-976b-1abf0e1b6860")
    public Class getElement() {
        return this.elt;
    }

    @objid ("12f9f00f-eae9-4b7e-b413-1792edc5ec16")
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
    @objid ("6a48a616-5682-4317-9be2-dec53366aa63")
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

    @objid ("b4249460-0753-4f46-a305-4821622d8114")
    protected  TDeploymentArtifacts(final Class elt) {
        this.elt = elt;
    }

    @objid ("7e75c0ac-1433-487a-9459-abe871156281")
    public static final class MdaTypes {
        @objid ("149b7b5b-3357-4fb4-959b-7641be32a6e0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2ffc8896-677d-4249-8438-d5f0e8eb3ed8")
        private static Stereotype MDAASSOCDEP;

        @objid ("9789497b-7c4c-4064-8974-4c5d2017cee2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b3673a09-768d-4cbb-85ce-4683c5e8cff4")
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

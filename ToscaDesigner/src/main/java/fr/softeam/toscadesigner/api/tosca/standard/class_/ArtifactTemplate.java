/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 08/03/2024 09:55 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << ArtifactTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("8eb99964-d7e4-45db-a77e-7c78675d9688")
public class ArtifactTemplate implements IMdaProxy {
    @objid ("96b98e5c-a0dd-42d8-a2c1-6178fd6f419c")
    public static final String STEREOTYPE_NAME = "ArtifactTemplate";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    @objid ("c9cdbd83-a870-4d40-a0c0-1e6c7b39255c")
    protected final Class elt;

    /**
     * Tells whether a {@link ArtifactTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ArtifactTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5d157d9f-0603-4fe4-9022-e6fbd2ba046e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (ArtifactTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(ArtifactTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << ArtifactTemplate >> then instantiate a {@link ArtifactTemplate} proxy.
     * 
     * @return a {@link ArtifactTemplate} proxy on the created {@link Class}.
     */
    @objid ("2460a8ba-c675-48a2-8691-3cfde002cdec")
    public static ArtifactTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(ArtifactTemplate.MdaTypes.STEREOTYPE_ELT);
        return ArtifactTemplate.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ArtifactTemplate} proxy from a {@link Class} stereotyped << ArtifactTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ArtifactTemplate} proxy or <i>null</i>.
     */
    @objid ("5d8864fd-9ddd-420f-b461-fbebd5cf92df")
    public static ArtifactTemplate instantiate(final Class obj) {
        return ArtifactTemplate.canInstantiate(obj) ? new ArtifactTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ArtifactTemplate} proxy from a {@link Class} stereotyped << ArtifactTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ArtifactTemplate} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("97939a49-6ba1-42c9-918b-076822b73524")
    public static ArtifactTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ArtifactTemplate.canInstantiate(obj))
        	return new ArtifactTemplate(obj);
        else
        	throw new IllegalArgumentException("ArtifactTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("91e82f99-01d9-44e9-9a5e-39e51ea648ea")
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
        ArtifactTemplate other = (ArtifactTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("739ff89a-3dce-4fae-bbee-45864dfbbaf4")
    public Class getElement() {
        return this.elt;
    }

    @objid ("cc9e3776-1e13-444d-9754-0d897ac4ac52")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("0953f20a-6761-491a-ba36-6db2898ea602")
    protected  ArtifactTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("b5b46625-a405-4364-a3b5-61959fa30639")
    public static final class MdaTypes {
        @objid ("979dc3b5-0651-4dad-b6a0-51a40056f53e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("935de2d2-e45c-42a6-a2dd-379ac26cb917")
        private static Stereotype MDAASSOCDEP;

        @objid ("296ebc8e-fbd2-45cf-bd93-5fc605c4eb11")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("16acbc64-dd76-4ed9-99e7-1d44cdfc8503")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "9470b61d-47b8-455e-9d73-1119e307cdcc", "ArtifactTemplate");
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 20/03/2024 15:20 by Modelio Studio.
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
 * Proxy class to handle a {@link Class} with << TRelationshipTemplate >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a2355551-417e-4b9a-b842-5a3a0d94362e")
public class TRelationshipTemplate implements IMdaProxy {
    @objid ("d8d2b0f1-92d4-446d-acd9-e6d064492dac")
    public static final String STEREOTYPE_NAME = "TRelationshipTemplate";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     * 
     */
    @objid ("ec13af41-85a7-4843-adfb-c40c7c8a8192")
    protected final Class elt;

    /**
     * Tells whether a {@link TRelationshipTemplate proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << TRelationshipTemplate >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b63a446d-a7fc-4fa5-a6df-130d0445b228")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && (TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT!=null) && ((Class) elt).isStereotyped(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Class} stereotyped << TRelationshipTemplate >> then instantiate a {@link TRelationshipTemplate} proxy.
     * @return a {@link TRelationshipTemplate} proxy on the created {@link Class}.
     */
    @objid ("8f775c28-b494-4000-9f0f-6ff45e1486d1")
    public static TRelationshipTemplate create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Class");
        e.getExtension().add(TRelationshipTemplate.MdaTypes.STEREOTYPE_ELT);
        return TRelationshipTemplate.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplate} proxy from a {@link Class} stereotyped << TRelationshipTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link TRelationshipTemplate} proxy or <i>null</i>.
     */
    @objid ("67bd71b5-e6bf-485c-a63d-31d08dcde83b")
    public static TRelationshipTemplate instantiate(final Class obj) {
        return TRelationshipTemplate.canInstantiate(obj) ? new TRelationshipTemplate(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TRelationshipTemplate} proxy from a {@link Class} stereotyped << TRelationshipTemplate >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link TRelationshipTemplate} proxy.
     */
    @objid ("af6522cb-b6e9-4100-abca-cc0450230d82")
    public static TRelationshipTemplate safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (TRelationshipTemplate.canInstantiate(obj))
            return new TRelationshipTemplate(obj);
        else
            throw new IllegalArgumentException("TRelationshipTemplate: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1286ac3f-9816-47ea-b8b9-4d09fb459068")
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
        TRelationshipTemplate other = (TRelationshipTemplate) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("98be3c6b-30b3-449b-8624-2330a43f3a5f")
    public Class getElement() {
        return this.elt;
    }

    @objid ("2b7d54b1-ba25-4c80-880d-d142afd4ee0e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f092fff9-ee39-4aeb-a86d-dabc5a082ec5")
    protected  TRelationshipTemplate(final Class elt) {
        this.elt = elt;
    }

    @objid ("d6cdbf9d-3bee-45cf-b04e-4a31f668d827")
    public static final class MdaTypes {
        @objid ("52e2a6f9-b899-465e-b074-aa5c7dc6e171")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("150c42ec-1331-4db6-b5d8-4ae677152c25")
        private static Stereotype MDAASSOCDEP;

        @objid ("e6058c12-502c-4f31-830e-0dba4eb62e27")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("871f0407-0cf9-4d79-9bc3-ef7bdaa87a03")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "7f01001b-511e-4017-b6b4-729f68c85911", "TRelationshipTemplate");
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

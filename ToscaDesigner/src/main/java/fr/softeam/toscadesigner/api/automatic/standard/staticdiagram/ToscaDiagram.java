/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 17/10/2024 12:15 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.automatic.standard.staticdiagram;

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
import org.modelio.metamodel.diagrams.StaticDiagram;
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
 * Proxy class to handle a {@link StaticDiagram} with << ToscaDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("0fa85812-9761-4c3b-b08a-6477551af622")
public class ToscaDiagram implements IMdaProxy {
    @objid ("c81ce26d-fbcd-4632-ac71-37f51e8ba06e")
    public static final String STEREOTYPE_NAME = "ToscaDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     * 
     */
    @objid ("ec49be34-a58d-428f-a3c5-b7df801385b8")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ToscaDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ToscaDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c532f7a7-6b21-4baf-be09-824539ca57a7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ToscaDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ToscaDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ToscaDiagram >> then instantiate a {@link ToscaDiagram} proxy.
     * @return a {@link ToscaDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("09d86fd4-66a4-45b9-928b-b1bf4aced1f6")
    public static ToscaDiagram create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.StaticDiagram");
        e.getExtension().add(ToscaDiagram.MdaTypes.STEREOTYPE_ELT);
        return ToscaDiagram.instantiate((StaticDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ToscaDiagram} proxy from a {@link StaticDiagram} stereotyped << ToscaDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StaticDiagram
     * @return a {@link ToscaDiagram} proxy or <i>null</i>.
     */
    @objid ("d9bdac91-25f9-44fa-a901-c500fa04258a")
    public static ToscaDiagram instantiate(final StaticDiagram obj) {
        return ToscaDiagram.canInstantiate(obj) ? new ToscaDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ToscaDiagram} proxy from a {@link StaticDiagram} stereotyped << ToscaDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link ToscaDiagram} proxy.
     */
    @objid ("020484e8-796d-4b87-97aa-6c99117f7e3c")
    public static ToscaDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ToscaDiagram.canInstantiate(obj))
            return new ToscaDiagram(obj);
        else
            throw new IllegalArgumentException("ToscaDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8912e0ce-a150-43a4-be20-453be05bf1c1")
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
        ToscaDiagram other = (ToscaDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StaticDiagram}.
     * @return the StaticDiagram represented by this proxy, never null.
     */
    @objid ("6b2f544d-33c6-4fec-85d6-8e24e7dbafdc")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("cace13d1-adf6-48c9-bca5-6d2689424b18")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("dc4c94bd-e870-41b9-893b-1ce8be8ca6e7")
    protected  ToscaDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("cf3c32f5-d159-4ca0-91fa-0b4137560cc2")
    public static final class MdaTypes {
        @objid ("c0e630c9-57cb-4ddd-a3fe-22e124c85334")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d8fe1fea-f4d9-41e5-98ba-7d01684102bc")
        private static Stereotype MDAASSOCDEP;

        @objid ("ad196c33-d8c1-4f78-9efb-0b05e89b20c1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2fb48d4e-e066-4945-a189-86e9fe7c2680")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "dddbe647-1f21-42d1-93cd-f61109a8afd3", "ToscaDiagram");
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

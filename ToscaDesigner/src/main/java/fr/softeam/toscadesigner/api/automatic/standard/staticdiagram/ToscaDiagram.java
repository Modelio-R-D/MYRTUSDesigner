/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 27/08/2024 15:57 by Modelio Studio.
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
@objid ("fe00ea95-fbc1-4905-b852-de48460092cf")
public class ToscaDiagram implements IMdaProxy {
    @objid ("f9764472-bd24-46fb-a697-419f77ce408d")
    public static final String STEREOTYPE_NAME = "ToscaDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     * 
     */
    @objid ("8cf28edb-6ed3-4a5d-8b25-764f227c1efd")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ToscaDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ToscaDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1ccf71b7-c574-4eb1-b9c6-20094246d7a9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ToscaDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ToscaDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ToscaDiagram >> then instantiate a {@link ToscaDiagram} proxy.
     * @return a {@link ToscaDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("5d8e3974-6fa0-4c00-8dc4-c873b21b4c3c")
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
    @objid ("a2fe22d5-378e-4df4-a095-3d770e8c6e7a")
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
    @objid ("bd7d4e99-ecea-4d06-9788-b827815fea55")
    public static ToscaDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ToscaDiagram.canInstantiate(obj))
            return new ToscaDiagram(obj);
        else
            throw new IllegalArgumentException("ToscaDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2c817733-04a3-4365-adcf-121ed3b10bdf")
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
    @objid ("56e83220-ab71-4ce8-a036-08006c70580a")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("5b134a5e-16e3-48ba-bed6-d7b5ed9f2320")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c101a03f-4d8c-469f-a09f-2f3c81b2fee0")
    protected  ToscaDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("2a2cc31a-b1ae-406a-afa1-6e3931a43d7c")
    public static final class MdaTypes {
        @objid ("bcd9b83e-b2bd-4f41-a024-82c80d3c9329")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c39a5649-7273-4084-8002-fc7ca7bd0a95")
        private static Stereotype MDAASSOCDEP;

        @objid ("cd3fd633-d9e3-4e7f-a6f4-3f01f61f57b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4b46816f-b778-42a5-b8b2-6e3eb17531a2")
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

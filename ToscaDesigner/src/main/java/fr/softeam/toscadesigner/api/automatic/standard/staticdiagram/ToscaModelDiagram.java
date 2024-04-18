/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 01/03/2024 11:13 by Modelio Studio.
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
 * Proxy class to handle a {@link StaticDiagram} with << ToscaModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("67db9af4-1f0d-4c91-a252-a98ea367076f")
public class ToscaModelDiagram implements IMdaProxy {
    @objid ("ea66c2d7-0b12-4361-b0c5-331be2e0f418")
    public static final String STEREOTYPE_NAME = "ToscaModelDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     * 
     */
    @objid ("6d0ac266-77c2-4436-86ed-99ff9d8be7cb")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ToscaModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ToscaModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("80369b92-bc86-4757-9ef4-e59cbd9323d6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ToscaModelDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ToscaModelDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ToscaModelDiagram >> then instantiate a {@link ToscaModelDiagram} proxy.
     * @return a {@link ToscaModelDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("592a6e6b-fd30-422b-af07-7633359c440d")
    public static ToscaModelDiagram create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.StaticDiagram");
        e.getExtension().add(ToscaModelDiagram.MdaTypes.STEREOTYPE_ELT);
        return ToscaModelDiagram.instantiate((StaticDiagram)e);
    }

    /**
     * Tries to instantiate a {@link ToscaModelDiagram} proxy from a {@link StaticDiagram} stereotyped << ToscaModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a StaticDiagram
     * @return a {@link ToscaModelDiagram} proxy or <i>null</i>.
     */
    @objid ("ec1325ca-c278-4388-9b0c-81522f150539")
    public static ToscaModelDiagram instantiate(final StaticDiagram obj) {
        return ToscaModelDiagram.canInstantiate(obj) ? new ToscaModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ToscaModelDiagram} proxy from a {@link StaticDiagram} stereotyped << ToscaModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     * @param obj a {@link StaticDiagram}
     * @return a {@link ToscaModelDiagram} proxy.
     */
    @objid ("6b9a0d39-2860-4248-9f78-b62db32c48d5")
    public static ToscaModelDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ToscaModelDiagram.canInstantiate(obj))
            return new ToscaModelDiagram(obj);
        else
            throw new IllegalArgumentException("ToscaModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("511e35b1-552e-4ba5-9c1e-3f57558d1e4e")
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
        ToscaModelDiagram other = (ToscaModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link StaticDiagram}.
     * @return the StaticDiagram represented by this proxy, never null.
     */
    @objid ("7eed9817-b693-4557-8013-7661a6a086f0")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("52a6a861-7a5a-459b-b342-fdfb33fc1ccb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("947a6050-9d23-4ef1-a64c-16b90233df68")
    protected  ToscaModelDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("1bd6b089-f976-43ec-a15a-ff90ec3dfb7b")
    public void setDefaultName(String string) {
        // TODO Auto-generated method stub
    }

    @objid ("9828edf1-8a5a-4434-8117-fcd1a02dce67")
    public static final class MdaTypes {
        @objid ("3f9ad9b7-2db6-4330-a8d1-04a48e2230b3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("487628ea-3298-4250-8e84-6fc393f982ee")
        private static Stereotype MDAASSOCDEP;

        @objid ("85e26258-8989-4926-b70b-6cb6bf76d62e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dba4689b-4a52-4c99-bd26-db4ec719cf68")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "3f7293c0-4896-443d-82d2-dbf6cad3caf4", "ToscaModelDiagram");
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

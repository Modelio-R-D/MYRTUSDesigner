/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 01/03/2024 11:13 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.automatic.standard.staticdiagram;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.api.module.mda.IMdaProxy;
import com.modeliosoft.modelio.api.module.mda.MdaProxyException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link StaticDiagram} with << ToscaModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f10da786-2415-4ed9-bf35-c56891eb3580")
public class ToscaModelDiagram implements IMdaProxy {
    @objid ("78e7770f-90c8-490a-b62a-3f0097d81fb6")
    public static final String STEREOTYPE_NAME = "ToscaModelDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     * 
     */
    @objid ("d3f84538-42bc-492a-b9db-f01d4cc754ba")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ToscaModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ToscaModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fcda8d25-e063-4a28-9009-d5683e9308ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ToscaModelDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ToscaModelDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ToscaModelDiagram >> then instantiate a {@link ToscaModelDiagram} proxy.
     * @return a {@link ToscaModelDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("3883dc69-ec30-441c-b3c9-eaf990e0d5fb")
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
    @objid ("299c8bcb-6996-406c-859f-156be5954a8f")
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
    @objid ("ce246e58-3a45-4b77-be24-accc448002f8")
    public static ToscaModelDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ToscaModelDiagram.canInstantiate(obj))
            return new ToscaModelDiagram(obj);
        else
            throw new IllegalArgumentException("ToscaModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("de3db1d3-c7fb-4a5a-a3f3-74cf0e838284")
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
    @objid ("05d52442-ca76-48b3-8513-bb739111dbaa")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("5217f062-36c6-4d5e-8f2d-bba5d9a61fdf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("8100509b-6f57-44b9-b5e2-e7e8fb5665d9")
    protected  ToscaModelDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("833bd202-b476-451c-b5b8-0e7d61e21361")
    public void setDefaultName(String string) {
        // TODO Auto-generated method stub
    }

    @objid ("47be6ec0-6bad-4687-b8ea-22895217942e")
    public static final class MdaTypes {
        @objid ("2c798f30-2379-4af1-af2c-7b7bb6b5edac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2212d687-dc6c-4aa3-87af-5ab420ff217b")
        private static Stereotype MDAASSOCDEP;

        @objid ("6b3639ed-5c8c-4a6e-90f6-f0f7d5a26e3c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f4af8b94-94f8-4416-be99-d614460ac350")
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

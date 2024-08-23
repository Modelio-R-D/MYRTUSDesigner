/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 01/03/2024 11:13 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.automatic.standard.staticdiagram;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.toscadesigner.impl.IMdaProxy;
import fr.softeam.toscadesigner.impl.MdaProxyException;
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
@objid ("f987f428-cfda-4904-acc4-775f8b5d0ffd")
public class ToscaModelDiagram implements IMdaProxy {
    @objid ("a5df80b6-80d4-493f-a9b3-8ebdc11c579c")
    public static final String STEREOTYPE_NAME = "ToscaModelDiagram";

    /**
     * The underlying {@link StaticDiagram} represented by this proxy, never null.
     * 
     */
    @objid ("01b5a2e2-2c10-4efe-bc45-cf69cd7bdbd9")
    protected final StaticDiagram elt;

    /**
     * Tells whether a {@link ToscaModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link StaticDiagram} stereotyped << ToscaModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("63341ac3-0352-434d-aa89-49e5ab51490b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof StaticDiagram) && (ToscaModelDiagram.MdaTypes.STEREOTYPE_ELT!=null) && ((StaticDiagram) elt).isStereotyped(ToscaModelDiagram.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link StaticDiagram} stereotyped << ToscaModelDiagram >> then instantiate a {@link ToscaModelDiagram} proxy.
     * @return a {@link ToscaModelDiagram} proxy on the created {@link StaticDiagram}.
     */
    @objid ("b63cb08a-8de4-450f-b1b6-97bcfb17d469")
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
    @objid ("1ddf2069-49c1-4e8d-95dd-5e3b9bad2c11")
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
    @objid ("1fa7903c-e3a4-4a9d-b954-cf587189c490")
    public static ToscaModelDiagram safeInstantiate(final StaticDiagram obj) throws IllegalArgumentException {
        if (ToscaModelDiagram.canInstantiate(obj))
            return new ToscaModelDiagram(obj);
        else
            throw new IllegalArgumentException("ToscaModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4d87a0c5-c45c-461c-8eea-9f873a6e16ac")
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
    @objid ("d47f86de-e808-40d2-bdfd-5935a9f0c85c")
    public StaticDiagram getElement() {
        return this.elt;
    }

    @objid ("76f0573f-243d-43db-9507-c448294ed1f1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("efd9c892-ba77-44f0-8159-7659dce44e89")
    protected  ToscaModelDiagram(final StaticDiagram elt) {
        this.elt = elt;
    }

    @objid ("ee4a6f45-0982-4658-9286-49c4edfc8f11")
    public void setDefaultName(String string) {
        // TODO Auto-generated method stub
    }

    @objid ("ac94c78e-6488-4c21-94f9-d154e19418f6")
    public static final class MdaTypes {
        @objid ("f6916be2-9c96-4d57-b64b-00f9a42e7510")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("60b98c07-99d3-4620-93a2-d795cef3ea11")
        private static Stereotype MDAASSOCDEP;

        @objid ("2a7791e4-d1ed-4cc5-8092-f2680b55d6a5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("78d63cd7-405e-4ca4-b8cf-0339076259fc")
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

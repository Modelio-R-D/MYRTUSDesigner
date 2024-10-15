/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 10/10/2024 11:39 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.infrastructure.modelelement;

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
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link ModelElement} with << ToscaElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("061b218b-e191-4d3c-9fab-a195b98d7657")
public class ToscaElement implements IMdaProxy {
    @objid ("01841dec-2f78-4b5d-b745-4e01dfa6e325")
    public static final String STEREOTYPE_NAME = "ToscaElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("e8a64dea-ad25-42a5-b056-2da96d0083ba")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ToscaElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ToscaElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a2c62204-3e9a-404d-9503-c291f699c697")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ToscaElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ToscaElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ToscaElement >> then instantiate a {@link ToscaElement} proxy.
     * 
     * @return a {@link ToscaElement} proxy on the created {@link ModelElement}.
     */
    @objid ("08618ff3-b8b9-48ce-953a-55780d16e9aa")
    public static ToscaElement create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(ToscaElement.MdaTypes.STEREOTYPE_ELT);
        return ToscaElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link ToscaElement} proxy from a {@link ModelElement} stereotyped << ToscaElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link ToscaElement} proxy or <i>null</i>.
     */
    @objid ("2444ef3f-2850-4bd3-8cfd-bd3f52917635")
    public static ToscaElement instantiate(final ModelElement obj) {
        return ToscaElement.canInstantiate(obj) ? new ToscaElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ToscaElement} proxy from a {@link ModelElement} stereotyped << ToscaElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link ToscaElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("39596100-e901-4688-b5a3-a18264d2f9b4")
    public static ToscaElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ToscaElement.canInstantiate(obj))
        	return new ToscaElement(obj);
        else
        	throw new IllegalArgumentException("ToscaElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3630c3ff-e45f-43d0-a255-a83ed57f85e3")
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
        ToscaElement other = (ToscaElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("55ca825f-3920-4fea-b74b-c26128ab48e6")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("776435b5-9469-4ec5-993a-cef3077796a5")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("bae2f819-02ee-4a50-8ea2-4b446fe49169")
    protected  ToscaElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("e8773016-723a-41ca-a3b7-f662c5d0640d")
    public static final class MdaTypes {
        @objid ("1035424b-d083-4d61-82c6-9c6b805fbc3d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e6998db4-762c-4d29-a8de-b9f9d436b838")
        private static Stereotype MDAASSOCDEP;

        @objid ("6e32f713-b760-4bf5-977b-ff886c46aa7a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8c08e1e8-1b59-4917-bc8d-296879345115")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "11eac153-1560-420f-a4f6-f5387b6c8a98", "ToscaElement");
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

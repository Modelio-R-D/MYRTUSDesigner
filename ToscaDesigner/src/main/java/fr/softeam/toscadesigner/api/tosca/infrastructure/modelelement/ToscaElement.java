/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 07/01/2025 15:23 by Modelio Studio.
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
    @objid ("e26ba502-4397-414c-bb76-365b5851ed71")
    public static final String STEREOTYPE_NAME = "ToscaElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("fe58adb9-c2bd-42b7-8f9f-51eb04633511")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ToscaElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ToscaElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3bd8ce61-505c-4c4a-91b9-769b17a823fd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ToscaElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ToscaElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ToscaElement >> then instantiate a {@link ToscaElement} proxy.
     * 
     * @return a {@link ToscaElement} proxy on the created {@link ModelElement}.
     */
    @objid ("653d7b5c-d029-4c51-a11d-2f0d26e96fa1")
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
    @objid ("981d61de-1576-422e-b3b8-37449d81e479")
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
    @objid ("d0ded7ea-719d-47a0-8dfb-a59a4ef4a523")
    public static ToscaElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ToscaElement.canInstantiate(obj))
        	return new ToscaElement(obj);
        else
        	throw new IllegalArgumentException("ToscaElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2bcd6e83-6722-4a1b-8812-e7a9977a9a41")
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
    @objid ("be5aeeb2-9d89-45c8-ac1e-83030d283065")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("97d2dba2-8b50-461c-af5c-57a070adf339")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("143a4f97-523e-426a-8270-cbf6191b3efc")
    protected  ToscaElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("e8773016-723a-41ca-a3b7-f662c5d0640d")
    public static final class MdaTypes {
        @objid ("fd4074bf-19ed-4ed8-881f-e0841637815f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9bb83a11-f624-4acc-874b-978b842ab7bf")
        private static Stereotype MDAASSOCDEP;

        @objid ("882a94a2-e50c-474d-af24-0ed30398a6da")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("243c17c1-75cf-42b4-9869-d9b69616f586")
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

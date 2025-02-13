/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 13/02/2025 17:54 by Modelio Studio.
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
@objid ("391f35e9-ca81-4f88-96f1-eceb9c08b9be")
public class ToscaElement implements IMdaProxy {
    @objid ("832978ad-1734-4119-b2b0-f2e92b6fc4c9")
    public static final String STEREOTYPE_NAME = "ToscaElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("60016555-c81c-4030-98ab-63ff208ce40e")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ToscaElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ToscaElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9073c545-8811-42f6-9282-32da12918693")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ToscaElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ToscaElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ToscaElement >> then instantiate a {@link ToscaElement} proxy.
     * 
     * @return a {@link ToscaElement} proxy on the created {@link ModelElement}.
     */
    @objid ("ef8982ed-fde8-44f5-b28a-cc41fabe973d")
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
    @objid ("6c675101-5b32-4377-a519-3194aace7ce6")
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
    @objid ("40969cab-eb7e-4840-972c-8d7e510b1059")
    public static ToscaElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ToscaElement.canInstantiate(obj))
        	return new ToscaElement(obj);
        else
        	throw new IllegalArgumentException("ToscaElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ed044c3e-bc14-404c-b513-fff90ff7b812")
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
    @objid ("7e1523c3-e2d9-4b42-af80-fb3ba438151e")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("928f2224-5308-4463-95b1-21055b3ea79f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("379b78ba-9032-42ed-bb5c-6d9fe7ab4ca7")
    protected  ToscaElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("737184ef-854b-4455-ac6a-d815c4391895")
    public static final class MdaTypes {
        @objid ("c92ff865-320f-4538-9d86-bd639fe548bc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a59c255a-f07b-43cc-983f-51877285e912")
        private static Stereotype MDAASSOCDEP;

        @objid ("0eb18413-caa8-4ed7-9c47-4786ea6b9ae8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c8632de8-afc9-436b-9805-87baa9e4e0aa")
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

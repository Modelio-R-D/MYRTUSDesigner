/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 08/04/2025 14:37 by Modelio Studio.
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
    @objid ("741410ab-7f2b-4f74-b389-64a8ded85cec")
    public static final String STEREOTYPE_NAME = "ToscaElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("3c671a62-fb65-4c30-bc3a-6cd574dbe550")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link ToscaElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << ToscaElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9668c8c1-ca45-45ba-b418-b4f93b797453")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (ToscaElement.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(ToscaElement.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << ToscaElement >> then instantiate a {@link ToscaElement} proxy.
     * 
     * @return a {@link ToscaElement} proxy on the created {@link ModelElement}.
     */
    @objid ("e3f285e4-efbf-4ace-8fa0-2e6be57a4fbb")
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
    @objid ("3935ca83-db02-48dd-bae6-7c376e53b2ef")
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
    @objid ("04cc3915-443d-43c4-973b-af03cb2dd6bc")
    public static ToscaElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (ToscaElement.canInstantiate(obj))
        	return new ToscaElement(obj);
        else
        	throw new IllegalArgumentException("ToscaElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("12a02b8c-1864-4bd2-a2f2-b2bb5c38d05b")
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
    @objid ("cdf8aece-5052-4a89-92fb-15f6408319bf")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("d53ecb24-990b-48cc-8f1e-0a81bfe0d0fd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("e2f96f4e-60ea-4223-aed7-a6145781bb43")
    protected  ToscaElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("737184ef-854b-4455-ac6a-d815c4391895")
    public static final class MdaTypes {
        @objid ("25974088-273e-491d-bc6a-7f86695563f4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("502b864a-f6af-4324-b700-39ebb0c9913c")
        private static Stereotype MDAASSOCDEP;

        @objid ("8f5ed432-30b7-4d18-80c4-883d4eaecd63")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("605108f7-a6bb-4807-a4aa-9defc1812e4d")
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

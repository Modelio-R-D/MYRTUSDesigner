/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.1

 * This file was generated on 17/02/2025 15:39 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TExtensions >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4cc9f846-eb47-417a-b09c-9da64a4adcd8")
public class TExtensions extends TExtensibleElements implements IMdaProxy {
    @objid ("453c8cf0-da90-4148-9989-366f891ea8d6")
    public static final String STEREOTYPE_NAME = "TExtensions";

    /**
     * Tells whether a {@link TExtensions proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtensions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5036a97d-0d65-463d-9b94-23efe58c6be4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtensions.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtensions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtensions >> then instantiate a {@link TExtensions} proxy.
     * 
     * @return a {@link TExtensions} proxy on the created {@link ModelElement}.
     */
    @objid ("c3b833cf-2ce1-4ecc-b535-8b5bee05d089")
    public static TExtensions create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TExtensions.MdaTypes.STEREOTYPE_ELT);
        return TExtensions.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TExtensions} proxy from a {@link ModelElement} stereotyped << TExtensions >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TExtensions} proxy or <i>null</i>.
     */
    @objid ("3794a4a0-97f4-4083-bd0b-033b6b288bb9")
    public static TExtensions instantiate(final ModelElement obj) {
        return TExtensions.canInstantiate(obj) ? new TExtensions(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TExtensions} proxy from a {@link ModelElement} stereotyped << TExtensions >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TExtensions} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4cbb1f65-f85f-4e65-89e3-509a90230edd")
    public static TExtensions safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExtensions.canInstantiate(obj))
        	return new TExtensions(obj);
        else
        	throw new IllegalArgumentException("TExtensions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7ac45dbc-22d4-4972-be47-9b0ee7e14b99")
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
        TExtensions other = (TExtensions) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("0e964d03-17ad-47b3-89b2-befe79469bdf")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("ab25cc75-c06d-46dd-926d-171d6f15bfeb")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("67d7ddc7-bff9-4604-b25e-d244ddbd8e46")
    protected  TExtensions(final ModelElement elt) {
        super(elt);
    }

    @objid ("52a30eef-2612-4066-8055-2f3030985e82")
    public static final class MdaTypes {
        @objid ("9547bb19-a01d-44d4-b39e-a7358cc4fb23")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4882766e-7097-4fac-9816-1fb8eec43af1")
        private static Stereotype MDAASSOCDEP;

        @objid ("4340dfe3-b169-4fe0-af5c-13c7d7259a7e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("760204a6-32a0-4fa6-8caa-c1e6ab702e41")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "b4e0c420-7fe8-4cd6-ade7-67b1d8957c5a", "TExtensions");
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

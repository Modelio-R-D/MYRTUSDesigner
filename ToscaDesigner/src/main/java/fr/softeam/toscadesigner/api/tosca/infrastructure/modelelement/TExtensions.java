/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 09/01/2025 12:14 by Modelio Studio.
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
@objid ("ef04280f-fd40-44fc-bfd3-b4336434c298")
public class TExtensions extends TExtensibleElements implements IMdaProxy {
    @objid ("5c7d9013-819c-4631-a3b1-2dd7ce6c7b04")
    public static final String STEREOTYPE_NAME = "TExtensions";

    /**
     * Tells whether a {@link TExtensions proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtensions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("19d2bc54-7d15-417b-a207-275d44e9fa34")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtensions.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtensions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtensions >> then instantiate a {@link TExtensions} proxy.
     * 
     * @return a {@link TExtensions} proxy on the created {@link ModelElement}.
     */
    @objid ("486afd6a-d4d2-4faa-874a-9add5ca1e491")
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
    @objid ("28dec42f-7801-4fd7-ac4b-3e58650708c7")
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
    @objid ("f5abdbff-20bc-4a49-accf-af8a6997dcad")
    public static TExtensions safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExtensions.canInstantiate(obj))
        	return new TExtensions(obj);
        else
        	throw new IllegalArgumentException("TExtensions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a1d923c2-5651-4e1d-8d68-35dbb68b99a5")
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
    @objid ("cd09a48d-5b24-4507-aa9e-249120b34f35")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("120ef594-cf5c-432c-9b67-9bb8b65b35ce")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("56ea194d-de77-444d-82ed-f3fd63ba1c68")
    protected  TExtensions(final ModelElement elt) {
        super(elt);
    }

    @objid ("1fa0b1e4-f027-4d15-b558-81147ab0f197")
    public static final class MdaTypes {
        @objid ("86abe2c6-fdca-4124-91dc-0f7696749dfe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c573c5a3-c112-45b6-ad5a-884669879549")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed8a0816-e49e-4586-a961-c6c1ee570bf9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a07a72af-f7ae-487b-9973-f4fba6993ec9")
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

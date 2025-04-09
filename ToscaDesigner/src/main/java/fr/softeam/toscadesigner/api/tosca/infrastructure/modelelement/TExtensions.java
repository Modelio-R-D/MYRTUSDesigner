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
 * Proxy class to handle a {@link ModelElement} with << TExtensions >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4cc9f846-eb47-417a-b09c-9da64a4adcd8")
public class TExtensions extends TExtensibleElements implements IMdaProxy {
    @objid ("accf7149-45ec-46b8-8ff8-4f9c7386a878")
    public static final String STEREOTYPE_NAME = "TExtensions";

    /**
     * Tells whether a {@link TExtensions proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtensions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b8eacd35-23b4-4504-acd9-28b44709a868")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtensions.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtensions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtensions >> then instantiate a {@link TExtensions} proxy.
     * 
     * @return a {@link TExtensions} proxy on the created {@link ModelElement}.
     */
    @objid ("2b5f5b3f-5887-4d87-b378-d9b660232012")
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
    @objid ("0294cf27-667e-4f8b-a105-4f21cfeff181")
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
    @objid ("6cbd43ad-964b-47c3-a9a7-b63a9f41606f")
    public static TExtensions safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExtensions.canInstantiate(obj))
        	return new TExtensions(obj);
        else
        	throw new IllegalArgumentException("TExtensions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b89042be-b66a-40d3-ad67-6bed3bdff6b0")
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
    @objid ("9f02f784-6ca6-4f18-aef2-90f8bfddea57")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("41b55547-a77f-45cc-ae6a-4477d0819f58")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("0bcfb5b6-8aee-4c0a-bc8f-32b1452650ad")
    protected  TExtensions(final ModelElement elt) {
        super(elt);
    }

    @objid ("52a30eef-2612-4066-8055-2f3030985e82")
    public static final class MdaTypes {
        @objid ("202d72b2-9e40-4640-be24-1c856f0bdf90")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4fb41abe-ecd2-4de1-8b94-5bd7a79e0349")
        private static Stereotype MDAASSOCDEP;

        @objid ("0538a091-59d2-4f9a-8305-19fa616bddcd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ede8caea-6c27-43e8-b4d7-d4225c3e1efa")
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

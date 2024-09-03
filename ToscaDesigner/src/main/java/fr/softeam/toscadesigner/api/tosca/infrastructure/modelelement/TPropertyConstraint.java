/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 30/08/2024 18:12 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TPropertyConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4da4c4f7-4b3d-49d3-bcad-7c95b833ed1c")
public class TPropertyConstraint extends TConstraint implements IMdaProxy {
    @objid ("3a5447c2-29f5-409f-8f0a-4ac8d1f0bf54")
    public static final String STEREOTYPE_NAME = "TPropertyConstraint";

    /**
     * Tells whether a {@link TPropertyConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPropertyConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("730762d8-f58c-476b-a7f3-dadab9b71078")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPropertyConstraint.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPropertyConstraint.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPropertyConstraint >> then instantiate a {@link TPropertyConstraint} proxy.
     * 
     * @return a {@link TPropertyConstraint} proxy on the created {@link ModelElement}.
     */
    @objid ("541ba409-a508-4d22-88a8-e21db43fcfb7")
    public static TPropertyConstraint create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TPropertyConstraint.MdaTypes.STEREOTYPE_ELT);
        return TPropertyConstraint.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TPropertyConstraint} proxy from a {@link ModelElement} stereotyped << TPropertyConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TPropertyConstraint} proxy or <i>null</i>.
     */
    @objid ("e8db439c-e4d7-4655-9b13-ffbe94a4647b")
    public static TPropertyConstraint instantiate(final ModelElement obj) {
        return TPropertyConstraint.canInstantiate(obj) ? new TPropertyConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPropertyConstraint} proxy from a {@link ModelElement} stereotyped << TPropertyConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TPropertyConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4cd88d02-d600-42b1-b731-6ad880f5d907")
    public static TPropertyConstraint safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPropertyConstraint.canInstantiate(obj))
        	return new TPropertyConstraint(obj);
        else
        	throw new IllegalArgumentException("TPropertyConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7d5ab93d-04bc-40fa-9256-fb871963757f")
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
        TPropertyConstraint other = (TPropertyConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("8a475f96-71da-4f41-b0b8-2546ddc88c48")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("cffcf937-6732-4b6c-98e0-971516736f31")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("c56884b6-5660-4716-8b1c-cbf789a9c3e7")
    protected  TPropertyConstraint(final ModelElement elt) {
        super(elt);
    }

    @objid ("4cd38298-6a35-428c-a0b0-4d003e7832ce")
    public static final class MdaTypes {
        @objid ("ace35710-2539-4e29-bb2a-9f94b2a8cdb1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("23428523-643f-4ec6-8e76-6f4c12a78ad9")
        private static Stereotype MDAASSOCDEP;

        @objid ("746e35ce-07fa-45a5-af99-75aa53516bff")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8c1f6466-0c7c-407e-8c6f-09f981f97ce9")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "85f116c1-fe2c-435b-a801-c3389c84beef", "TPropertyConstraint");
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

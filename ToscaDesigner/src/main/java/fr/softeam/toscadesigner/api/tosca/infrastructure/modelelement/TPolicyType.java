/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 12:38 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << TPolicyType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d8f6bcbc-5d73-47fd-bdcb-e62323e3b646")
public class TPolicyType implements IMdaProxy {
    @objid ("fe990083-7f41-4c54-a56c-6ff23667ed9f")
    public static final String STEREOTYPE_NAME = "TPolicyType";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("990ae03a-7ea1-49c2-a977-77d2d6aab6ce")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link TPolicyType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TPolicyType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e8d2934d-a84b-4c29-ab02-1678e1968070")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TPolicyType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TPolicyType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TPolicyType >> then instantiate a {@link TPolicyType} proxy.
     * 
     * @return a {@link TPolicyType} proxy on the created {@link ModelElement}.
     */
    @objid ("89ae45f5-abb0-4d22-9184-3ae44ff188ed")
    public static TPolicyType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(TPolicyType.MdaTypes.STEREOTYPE_ELT);
        return TPolicyType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link TPolicyType} proxy from a {@link ModelElement} stereotyped << TPolicyType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link TPolicyType} proxy or <i>null</i>.
     */
    @objid ("e8ec164e-3d7a-4a00-ae4c-a0610bffb1c0")
    public static TPolicyType instantiate(final ModelElement obj) {
        return TPolicyType.canInstantiate(obj) ? new TPolicyType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TPolicyType} proxy from a {@link ModelElement} stereotyped << TPolicyType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link TPolicyType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2d35f4fb-0b7d-490d-a847-a2a7302066ea")
    public static TPolicyType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TPolicyType.canInstantiate(obj))
        	return new TPolicyType(obj);
        else
        	throw new IllegalArgumentException("TPolicyType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2ea8c5bd-392e-4b36-87e8-dc3ba8799d79")
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
        TPolicyType other = (TPolicyType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("9ab2f859-117f-450a-a657-286b5fe51b92")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("112da822-ad07-4fec-9ee5-dbcaf64ceacc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("fac94ef3-f6d8-409f-a97a-540d358177cf")
    protected  TPolicyType(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1f01f3f5-4dca-4580-8f96-331b8fbcf9b7")
    public static final class MdaTypes {
        @objid ("f8cb35c6-e49c-4826-9453-632201c3d4ac")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6e40dc79-6804-4839-be55-0ecb0f882545")
        private static Stereotype MDAASSOCDEP;

        @objid ("554fd188-1795-480d-adf3-0fc0c7c7899b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7d65f530-4196-4eb0-bbbe-9c6d8763c9e3")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "b76dbc7d-8b6f-46f8-89d4-f0ea8eea40d2", "TPolicyType");
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

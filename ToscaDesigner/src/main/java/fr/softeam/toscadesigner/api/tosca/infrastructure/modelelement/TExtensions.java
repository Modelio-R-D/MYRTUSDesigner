/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 19/09/2024 15:04 by Modelio Studio.
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
    @objid ("e1650a71-3ead-40f1-911b-3eac3bf72546")
    public static final String STEREOTYPE_NAME = "TExtensions";

    /**
     * Tells whether a {@link TExtensions proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << TExtensions >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5a2b585d-c5e3-4c1b-9ec1-10f200290bae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (TExtensions.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(TExtensions.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << TExtensions >> then instantiate a {@link TExtensions} proxy.
     * 
     * @return a {@link TExtensions} proxy on the created {@link ModelElement}.
     */
    @objid ("5650c34c-e8e5-4556-944a-9b98c582149b")
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
    @objid ("7d2e7c44-ed6d-43aa-b1d5-c9398cab492a")
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
    @objid ("1b34281e-a806-4e97-85ed-c8d7b6104c12")
    public static TExtensions safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (TExtensions.canInstantiate(obj))
        	return new TExtensions(obj);
        else
        	throw new IllegalArgumentException("TExtensions: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("15cccb55-4e6e-4b34-b201-f3b16cbe6e36")
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
    @objid ("af7bb623-d55c-4db2-ae4e-c917c61a52ec")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("b88b4cdc-0d22-4d1b-aae1-012bed4d6d61")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("6a647951-c91b-4a8c-876e-d18c0c38ad50")
    protected  TExtensions(final ModelElement elt) {
        super(elt);
    }

    @objid ("1fa0b1e4-f027-4d15-b558-81147ab0f197")
    public static final class MdaTypes {
        @objid ("8e87f725-1eb6-410e-985a-880e6de6a625")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cd3a483c-7345-4c31-9ef3-4ea23683303c")
        private static Stereotype MDAASSOCDEP;

        @objid ("20b335ff-0542-41d7-be5e-fee8b28ea105")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("43f63075-0c6c-4605-8420-37e5b24ffd5d")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 03/09/2024 17:56 by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << DefinitionType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4225214e-2043-41ba-9314-80b2ee6db464")
public class DefinitionType extends TDefinitions implements IMdaProxy {
    @objid ("38dc8dbc-2a50-4546-9a52-93c096f9e7a7")
    public static final String STEREOTYPE_NAME = "DefinitionType";

    /**
     * Tells whether a {@link DefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << DefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6c59f367-8b51-457b-b6b8-ae2c7d0842cf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (DefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(DefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << DefinitionType >> then instantiate a {@link DefinitionType} proxy.
     * 
     * @return a {@link DefinitionType} proxy on the created {@link ModelElement}.
     */
    @objid ("7bc556e1-eed0-4eee-9673-23264a2fb563")
    public static DefinitionType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Infrastructure.ModelElement");
        e.getExtension().add(DefinitionType.MdaTypes.STEREOTYPE_ELT);
        return DefinitionType.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link DefinitionType} proxy from a {@link ModelElement} stereotyped << DefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link DefinitionType} proxy or <i>null</i>.
     */
    @objid ("1060dca7-b483-4b23-8513-10162c79b31e")
    public static DefinitionType instantiate(final ModelElement obj) {
        return DefinitionType.canInstantiate(obj) ? new DefinitionType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DefinitionType} proxy from a {@link ModelElement} stereotyped << DefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link DefinitionType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8f868601-eab2-4a76-aa3b-725b2c290751")
    public static DefinitionType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (DefinitionType.canInstantiate(obj))
        	return new DefinitionType(obj);
        else
        	throw new IllegalArgumentException("DefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bfec2f0b-6470-4996-8c8f-1dd437b6ec21")
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
        DefinitionType other = (DefinitionType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("99984c40-2fe7-4186-a102-99bfed93fd30")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("cfd23576-de17-4426-8dfd-92db42da5e0b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("ef9d2c34-abe1-4bdd-aaa1-4f7e8de59f11")
    protected  DefinitionType(final ModelElement elt) {
        super(elt);
    }

    @objid ("75dc4562-331a-4614-a742-bbb20aef1059")
    public static final class MdaTypes {
        @objid ("13b279ba-55d4-471f-a4de-e6286964514d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a4712adf-7944-44b1-8d5c-4e96f65fd2b8")
        private static Stereotype MDAASSOCDEP;

        @objid ("32de42e9-416a-4e04-b6fb-c87fe5d8cb06")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fbd840e1-8b10-45a8-9c39-a84ea679df13")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "acfbb136-0cbf-4fc9-9da7-edeb0b51e9d7", "DefinitionType");
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

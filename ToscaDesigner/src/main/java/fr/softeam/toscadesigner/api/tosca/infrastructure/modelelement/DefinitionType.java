/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 13/08/2024 17:47 by Modelio Studio.
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
@objid ("5bc9ee7f-397d-48b5-a6c8-efe5af620c6a")
public class DefinitionType extends TDefinitions implements IMdaProxy {
    @objid ("8cccdc7e-ea08-4ba5-bbff-533d220516fc")
    public static final String STEREOTYPE_NAME = "DefinitionType";

    /**
     * Tells whether a {@link DefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << DefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e69bd15e-4fc5-434b-a3ac-6129a6cc5b1a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (DefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(DefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << DefinitionType >> then instantiate a {@link DefinitionType} proxy.
     * 
     * @return a {@link DefinitionType} proxy on the created {@link ModelElement}.
     */
    @objid ("2b0e7f29-49d8-4de7-bb59-e5a51c5d82f9")
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
    @objid ("5022c3c7-7aa9-41d7-a0c9-7197b192fa7d")
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
    @objid ("e2391371-17b1-43ac-be46-c93d798e0ffe")
    public static DefinitionType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (DefinitionType.canInstantiate(obj))
        	return new DefinitionType(obj);
        else
        	throw new IllegalArgumentException("DefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ef4bd13f-7d11-4672-a954-c65a38943d8f")
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
    @objid ("7f5a1c0c-9fdc-471d-b4ba-1dd005d1112e")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("f6a90f7d-1e3a-43fc-8059-a39e8aec8694")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("fcc7cfe9-80b4-4f06-8431-dd65015624d9")
    protected  DefinitionType(final ModelElement elt) {
        super(elt);
    }

    @objid ("b4cacc85-c3b5-4437-94fd-97a0d7e977e0")
    public static final class MdaTypes {
        @objid ("c73438f9-a046-4c52-bb4b-39843a6116cf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("daf7da21-bc64-42a4-a7a7-5d384e70caba")
        private static Stereotype MDAASSOCDEP;

        @objid ("bca66c8d-483a-4236-9d03-dc9963b8fb7c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9ca05299-9914-47ac-bc70-5e36a8c804e8")
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

/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 29/08/2024 17:58 by Modelio Studio.
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
    @objid ("509aa869-e3d9-416c-b4e2-b749071a055f")
    public static final String STEREOTYPE_NAME = "DefinitionType";

    /**
     * Tells whether a {@link DefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << DefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("677d2c3d-2eff-431a-9fe9-7e790be3af78")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (DefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(DefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << DefinitionType >> then instantiate a {@link DefinitionType} proxy.
     * 
     * @return a {@link DefinitionType} proxy on the created {@link ModelElement}.
     */
    @objid ("7682e9b7-6656-404d-966a-0fab60d17417")
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
    @objid ("bbfa0c2d-c901-463d-9c6a-25fe9e39aad9")
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
    @objid ("6f20def8-72b0-4681-b5ce-7e27f1c7fef5")
    public static DefinitionType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (DefinitionType.canInstantiate(obj))
        	return new DefinitionType(obj);
        else
        	throw new IllegalArgumentException("DefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("53881360-4285-43b8-8c03-c8157985416e")
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
    @objid ("eafe0821-fc5b-4cc4-a422-f595d10d6d4a")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("8c1294f5-6c0d-496d-8d0d-ed0401552013")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("c9e4e3a1-b768-4f50-8e4d-f25e9e00446f")
    protected  DefinitionType(final ModelElement elt) {
        super(elt);
    }

    @objid ("75dc4562-331a-4614-a742-bbb20aef1059")
    public static final class MdaTypes {
        @objid ("b9cec27c-a801-4f68-8727-a985bbb9f241")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9d462134-8848-4a5d-a66c-33bc6e1a19e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("15523fb5-464d-4985-a9fa-e0838c3b4f67")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("84111cca-a733-41c7-a361-4aac529dc595")
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

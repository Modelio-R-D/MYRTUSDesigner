/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.1.0

 * This file was generated on 09/04/2025 17:17 by Modelio Studio.
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
@objid ("3fc7061b-5825-4722-b2d7-a7b27bc82a1b")
public class DefinitionType extends TDefinitions implements IMdaProxy {
    @objid ("91e3e859-4c70-4bc5-88e7-8d72997da9d7")
    public static final String STEREOTYPE_NAME = "DefinitionType";

    /**
     * Tells whether a {@link DefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << DefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b246761c-db4a-4a64-9c9f-156732ce9d53")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && (DefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((ModelElement) elt).isStereotyped(DefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << DefinitionType >> then instantiate a {@link DefinitionType} proxy.
     * 
     * @return a {@link DefinitionType} proxy on the created {@link ModelElement}.
     */
    @objid ("923a575f-342c-4732-bf2d-3e0b986ef676")
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
    @objid ("7398f829-3c0c-4ab1-88d2-fd31cfbd025f")
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
    @objid ("62b9181e-a9cc-434f-a668-7c037795a185")
    public static DefinitionType safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (DefinitionType.canInstantiate(obj))
        	return new DefinitionType(obj);
        else
        	throw new IllegalArgumentException("DefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f82f4cbe-3b01-4b93-8ff2-76d5d3f3c449")
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
    @objid ("014b6425-f362-4a20-9afe-012287ee36b4")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("730f33bf-c135-4c86-bde8-066479db2c1d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("b9802729-45b0-4c23-a378-0429e2c84bdf")
    protected  DefinitionType(final ModelElement elt) {
        super(elt);
    }

    @objid ("aaf8c076-678d-4f56-843c-bd616baf6177")
    public static final class MdaTypes {
        @objid ("03f06a3a-aabf-485f-8e7f-44ad849fd8f8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e30fd03e-7624-482e-8688-97fe86cb1718")
        private static Stereotype MDAASSOCDEP;

        @objid ("e9d4fa6a-55d9-4846-b05f-c03248cc652d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6959d0df-99b7-4536-b779-1aec2b2b46fb")
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

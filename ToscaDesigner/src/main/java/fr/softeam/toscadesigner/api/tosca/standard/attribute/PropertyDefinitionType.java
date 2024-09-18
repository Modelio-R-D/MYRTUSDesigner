/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: ToscaDesigner v0.0.00

 * This file was generated on 18/09/2024 12:38 by Modelio Studio.
 */
package fr.softeam.toscadesigner.api.tosca.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.mapi.MRef;

/**
 * Proxy class to handle a {@link Attribute} with << PropertyDefinitionType >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4f6d4128-f6ab-4aa6-9e4e-8e3412b6a22b")
public class PropertyDefinitionType implements IMdaProxy {
    @objid ("8ed71931-ef7c-411c-b991-dc32f2a4ae26")
    public static final String STEREOTYPE_NAME = "PropertyDefinitionType";

    /**
     * The underlying {@link Attribute} represented by this proxy, never null.
     */
    @objid ("441584c4-33d7-4971-90af-4b13f86cd668")
    protected final Attribute elt;

    /**
     * Tells whether a {@link PropertyDefinitionType proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << PropertyDefinitionType >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("aff2f306-cc92-45f1-9095-c00f7eee494e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && (PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT!=null) && ((Attribute) elt).isStereotyped(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT));
    }

    /**
     * Create a new {@link Attribute} stereotyped << PropertyDefinitionType >> then instantiate a {@link PropertyDefinitionType} proxy.
     * 
     * @return a {@link PropertyDefinitionType} proxy on the created {@link Attribute}.
     */
    @objid ("84dd1c07-a8f4-4650-aaa6-d47825fd4f70")
    public static PropertyDefinitionType create(final IModelingSession session) {
        ModelElement e = (ModelElement)session.getModel().createElement("Standard.Attribute");
        e.getExtension().add(PropertyDefinitionType.MdaTypes.STEREOTYPE_ELT);
        return PropertyDefinitionType.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link PropertyDefinitionType} proxy from a {@link Attribute} stereotyped << PropertyDefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link PropertyDefinitionType} proxy or <i>null</i>.
     */
    @objid ("0d376692-0de1-4567-bb46-84da0efe51ec")
    public static PropertyDefinitionType instantiate(final Attribute obj) {
        return PropertyDefinitionType.canInstantiate(obj) ? new PropertyDefinitionType(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PropertyDefinitionType} proxy from a {@link Attribute} stereotyped << PropertyDefinitionType >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link PropertyDefinitionType} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b054d0fd-a5d7-406f-a735-29bd7ef5dee5")
    public static PropertyDefinitionType safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (PropertyDefinitionType.canInstantiate(obj))
        	return new PropertyDefinitionType(obj);
        else
        	throw new IllegalArgumentException("PropertyDefinitionType: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7eecee7d-de29-4ef6-92d4-9b0a4eb23752")
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
        PropertyDefinitionType other = (PropertyDefinitionType) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("d687bff4-9e36-46df-967f-c93e2ee7fc4b")
    public Attribute getElement() {
        return this.elt;
    }

    @objid ("26ae8976-5d4d-4312-81c9-2e327b9c141d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
        
    }

    @objid ("043c8303-e3e3-4b6c-8ea3-e5ff390ecbf3")
    protected  PropertyDefinitionType(final Attribute elt) {
        this.elt = elt;
    }

    @objid ("38c8a372-6aa0-4ce3-b40c-e298b66a4193")
    public static final class MdaTypes {
        @objid ("d5d8442d-db71-4fa6-b50b-98c819030e65")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5e4226b7-b656-4d71-bea9-90330bb8304d")
        private static Stereotype MDAASSOCDEP;

        @objid ("5e55f61d-aa53-4430-8a5b-0050f6f2e0a1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("311f2f20-a296-4272-944b-12dc0783ac67")
        public static void init(final IModelingSession session) throws MdaProxyException {
            List <MRef> missingRefs = new ArrayList<>();
            MRef mRef;
            mRef = new MRef(Stereotype.MQNAME, "34943474-c962-4064-b5f1-c6008ebb3c9d", "PropertyDefinitionType");
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
